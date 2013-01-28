/* 
 *  Copyright (c) 2010 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      Texas Instruments - initial implementation
 *
 * */
/*
 *  ======== Platform.xs ========
 *  Generic platform support for concerto M3 devices.
 */

/*
 *  ======== module$use ========
 */
function module$meta$init()
{
    /* nullify xdc runtime's .bootVecs */
    Program.sectMap[".bootVecs"] = new Program.SectionSpec();
    Program.sectMap[".bootVecs"].type = "DSECT";
}

/*
 *  ======== Platform.getCpuDataSheet ========
 *  This Platform's implementation xdc.platform.IPlatform.getCpuDataSheet.
 *
 *  Return the xdc.platform.ICpuDataSheet.Instance object that corresponds
 *  to the device that runs executables loaded on the specified cpuId.
 */
function getCpuDataSheet(cpuId)
{
    var Utils = xdc.useModule('xdc.platform.Utils');
    var cpuAttrs = this.CPU.$copy();
    cpuAttrs.deviceName = this.deviceName;
    return (Utils.getCpuDataSheet(cpuAttrs));
}

/*
 *  ======== Platform.getExeContext ========
 *  This Platform's implementation xdc.platform.IPlatform.getExeContext.
 *
 *  Return the xdc.platform.IExeContext.Instance object that will run the
 *  specified program prog.
 */
function getExeContext(prog)
{
    var Utils = xdc.module("xdc.platform.Utils");

    /* create a default ExeContext execution context */
    var ExeContext = xdc.useModule('xdc.platform.ExeContext');
    var cpu = ExeContext.create(this.CPU, this.$module.BOARD);

    /* This is where we have peripherals available, so we can get their base
     * addresses and other info.
     */

    cpu.memoryMap = Utils.assembleMemoryMap(cpu, this);
    cpu.deviceName = this.CPU.revision;
    cpu.revision = "";

    /* check for the overlap in the memory map */
    var overlap = Utils.checkOverlap(cpu.memoryMap);

    if (overlap != null) {
        this.$module.$logError("Memory objects " + overlap + " overlap", this,
            overlap);
    }

    this.$seal();
    return (cpu);
}

/*
 *  ======== Platform.getExecCmd ========
 *  This Platform's implementation xdc.platform.IPlatform.getExecCmd.
 */
function getExecCmd(prog, packagePath)
{
    var os = environment["xdc.hostOS"];
    var doNotKnow = "@$(ECHO) ti.platforms.msp430 platform package cannot "
        + "execute " + prog.name + " on " + os + "\n";
    return (doNotKnow);
}

/*
 *  ======== Platform.getLinkTemplate ========
 *  This Platform's implementation xdc.platform.IPlatform.getLinkTemplate
 */
function getLinkTemplate(prog)
{
    return ("ti/platforms/concertoM3/linkcmd.xdt");
}

/*
 *  ======== Platform.Instance.init ========
 *  This function is called to initialize a newly created instance of a
 *  platform.  Platform instances are created just prior to running
 *  program configuration scripts.
 *
 *  Platform instances may also be created in the build domain.
 *
 *  name is the name used to identify this instance (without the package
 *  name prefix). For this platform, 'name' must identify a device.
 *  Besides the catalog module, this parameter may encode values for other
 *  configuration parameters, as defined by `nameFormat`. The values are
 *  separated by ':'.
 *
 *  args is a deprecated parameter that shouldn't be used.
 */
function instance$meta$init(name, args)
{
    var maxParamsLength = this.$module.nameFormat.split(":").length;
    var nameParams = name.split(":");

    if (nameParams.length > maxParamsLength) {
        this.$module.$logWarning("The platform ti.platforms.concertoM3 accepts "
            + "only " + maxParamsLength + " instance parameters in its name. "
            + "The supplied string '" + name + "' contains additional values, "
            + "which will be ignored.", this, this.$module.nameFormat);
    }

    if (nameParams[0] != "" && this.deviceName != null
        && this.deviceName != nameParams[0]) {
        this.$module.$logError(this.$package.$name 
            + " was passed two different device names: '" + nameParams[0]
            + "' and '" + this.deviceName + "'.", this, this.deviceName);
    }
    else if (nameParams[0] != "") {
        this.deviceName = nameParams[0];
    }

    if (this.deviceName == null) {
        this.$module.$logFatal("A device name must be specified for the "
            + "platform '" + this.$package.$name + "'. A device name can be "
            + "specified in the platform name, as "
            + "'ti.platforms.concertoM3:F28M35XXXXX', where F28M35XXXXX "
            + "is the name of the selected device.", this, this.deviceName);
    }

    if (nameParams[1] != "false" && Boolean(nameParams[1]).valueOf()) {
        this.includeLinkCmdFile = true;
    }

    if (this.externalMemoryMap.length != 0) {
        this.$module.$logWarning(this.$package.$name + " does not support "
            + "external memory map, and the parameter 'externalMemoryMap' is "
            + "ignored.", this, this.externalMemoryMap);
    }

    /* Use 'revision' to pass 'the catalog device name'. */
    this.CPU.revision = this.deviceName;

    if (this.includeLinkCmdFile) {
        this.$private.linkerFile = xdc.findFile("ti/platforms/concertoM3/"
            + "include/" + this.deviceName + ".cmd");
    }

    /* figure out the clock configuration */
    var Boot = xdc.useModule('ti.catalog.arm.cortexm3.concertoInit.Boot');

    Boot.configureClocks = true;
    Boot.OSCCLK = 20;

    if (this.deviceName.match(/F28M35E/)) {
        Boot.SPLLIMULT = 6;
        Boot.SPLLFMULT = Boot.Fract_0;
        Boot.SYSDIVSEL = Boot.Div_1;
        Boot.M3SSDIVSEL = Boot.M3Div_1;
    }
    else if (this.deviceName.match(/F28M35M/)) {
        Boot.SPLLIMULT = 15;
        Boot.SPLLFMULT = Boot.Fract_0;
        Boot.SYSDIVSEL = Boot.Div_2;
        Boot.M3SSDIVSEL = Boot.M3Div_1;
    }
    else if (this.deviceName.match(/F28M35H/)) {
        Boot.SPLLIMULT = 15;
        Boot.SPLLFMULT = Boot.Fract_0;
        Boot.SYSDIVSEL = Boot.Div_1;
        Boot.M3SSDIVSEL = Boot.M3Div_2;
    }
    else if (this.deviceName.match(/F28M36/)) {
        /* Default here sets M3 = 75Mhz */
        Boot.SPLLIMULT = 15;
        Boot.SPLLFMULT = Boot.Fract_0;
        Boot.SYSDIVSEL = Boot.Div_1;
        Boot.M3SSDIVSEL = Boot.M3Div_2;
    }
    else {
        this.$module.$logError(this.$package.$name 
            + " was passed unrecognized device name: '"
            + this.deviceName + "'.", this);
    }
}
/*
 *  @(#) ti.platforms.concertoM3; 1, 0, 0,35; 8-17-2012 22:13:39; /db/ztree/library/trees/platform/platform-n27x/src/
 */

