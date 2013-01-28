/*
 *  Copyright (c) 2012 by Texas Instruments and others.
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
 *  Generic platform support for Stellaris devices.
 */

var Boot = null;

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

    if (prog.build.target.isa == "v7M4") {
        var cpuAttrs = this.M4.$copy();
    }
    else {
        var cpuAttrs = this.M3.$copy();
    }

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

    if (prog.build.target.isa == "v7M4") {
        var cpu = ExeContext.create(this.M4, this.$module.BOARD);
        var revision = this.M4.revision;
    }
    else {
        var cpu = ExeContext.create(this.M3, this.$module.BOARD);
        var revision = this.M3.revision;
    }

    /* This is where we have peripherals available, so we can get their base
     * addresses and other info.
     */

    cpu.memoryMap = Utils.assembleMemoryMap(cpu, this);
    cpu.deviceName = revision;
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
    var doNotKnow = "@$(ECHO) ti.platforms.stellaris platform package cannot "
        + "execute " + prog.name + " on " + os + "\n";
    return (doNotKnow);
}

/*
 *  ======== Platform.getLinkTemplate ========
 *  This Platform's implementation xdc.platform.IPlatform.getLinkTemplate
 */
function getLinkTemplate(prog)
{
    if (Program.build.target.$name.match(/gnu/)) {
        return ("ti/platforms/stellaris/linkcmd_gnu.xdt");
    }
    else {
        return ("ti/platforms/stellaris/linkcmd.xdt");
    }
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
        this.$module.$logWarning("The platform ti.platforms.stellaris accepts "
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
            + "'ti.platforms.stellaris:LM3SXYZW', where LM3SXYZW is the name "
            + "of the selected device.", this, this.deviceName);
    }

    if (nameParams[1] != "false" && Boolean(nameParams[1]).valueOf()) {
        this.includeLinkCmdFile = true;
    }

    if (this.externalMemoryMap.length != 0) {
        this.$module.$logWarning(this.$package.$name + " does not support "
            + "external memory map, and the parameter 'externalMemoryMap' is "
            + "ignored.", this, this.externalMemoryMap);
    }

    /* We use 'revision' to pass 'the real device name' to the generic Stellaris
     * device.
     */
    if (prog.build.target.isa == "v7M4") {
        this.M4.revision = this.deviceName;
    }
    else {
        this.M3.revision = this.deviceName;
    }

    /* figure out the clock configuration */
    Boot = xdc.useModule('ti.catalog.arm.cortexm3.lm3init.Boot');

    Boot.configureClock = true;
    Boot.oscSrc = Boot.OSCSRC_MAIN;     /* use main oscillator */
    Boot.pllBypass = false;             /* use PLL to drive sys clock */
    Boot.pllOutEnable = false;          /* no PLL output */
    Boot.ioscDisable = false;           /* IOSC is enabled */
    Boot.moscDisable = false;           /* MOSC is enabled */

    Boot.configureLdo = false;

    var clockRate;

    if (this.deviceName == "LM3S301" || this.deviceName.match(/^LM3S10\d$/)) {
        Boot.sysClockDiv = Boot.SYSDIV_10; /* 20 MHz */
        Boot.pwmClockDiv = Boot.PWMDIV_1;
        Boot.xtal = Boot.XTAL_8MHZ ;       /* XTAL = 8 MHz */
        clockRate = 20;
    }
    else if (this.deviceName.match(/^LM3S3\d\d$/)
        && this.deviceName != "LM3S301") {
        Boot.sysClockDiv = Boot.SYSDIV_8; /* 25 MHz */
        Boot.pwmClockDiv = Boot.PWMDIV_1;
        Boot.xtal = Boot.XTAL_8MHZ ;       /* XTAL = 8 MHz */
        clockRate = 25;
    }
    else if (this.deviceName.match(/^LM3S\d\d(1|2)(0|2)$/)
        || this.deviceName == "LM3S6100" || this.deviceName == "LM3S2139") {
        Boot.sysClockDiv = Boot.SYSDIV_8; /* 25 MHz */
        Boot.pwmClockDiv = Boot.PWMDIV_1;
        Boot.xtal = Boot.XTAL_8MHZ ;       /* XTAL = 8 MHz */
        clockRate = 25;
    }
    else if (this.deviceName.match(/^LM3S9\w\d\d/)
        || this.deviceName.match(/^LM3S5\D\d\d/)
        || this.deviceName.match(/^LM3S5\d\d1/)
        || this.deviceName.match(/^LM3S5\d\d6/)
        || this.deviceName.match(/^LM3S2\w93/)) {
        Boot.sysClockDiv = Boot.SYSDIV_2_5; /* 80 MHz */
        Boot.pwmClockDiv = Boot.PWMDIV_1;
        Boot.xtal = Boot.XTAL_16MHZ ;       /* XTAL = 16 MHz */
        clockRate = 80;
    }
    else if (this.deviceName.match(/^LM3S1\D\d\d/)
        && !this.deviceName.match(/^LM3S1\D\1(1|6)/)) {
        Boot.sysClockDiv = Boot.SYSDIV_2_5; /* 80 MHz */
        Boot.pwmClockDiv = Boot.PWMDIV_1;
        Boot.xtal = Boot.XTAL_16MHZ ;       /* XTAL = 16 MHz */
        clockRate = 80;
    }
    else if (this.deviceName == "LM3S1621" || this.deviceName == "LM3S1651") {
        Boot.sysClockDiv = Boot.SYSDIV_2_5; /* 80 MHz */
        Boot.pwmClockDiv = Boot.PWMDIV_1;
        Boot.xtal = Boot.XTAL_16MHZ ;       /* XTAL = 16 MHz */
        clockRate = 80;
    }
    else if (this.deviceName.match(/^LM4/)) {
        Boot.sysClockDiv = Boot.SYSDIV_5;   /* 40 MHz */
        Boot.pwmClockDiv = Boot.PWMDIV_1;
        Boot.xtal = Boot.XTAL_16MHZ ;       /* XTAL = 16 MHz */
        clockRate = 40;
    }
    else {
        Boot.sysClockDiv = Boot.SYSDIV_4;   /* 50 MHz */
        Boot.pwmClockDiv = Boot.PWMDIV_8;   /* div by 8 */
        Boot.xtal = Boot.XTAL_8MHZ ;        /* XTAL = 8 MHz */
        Boot.configureLdo = false;
        Boot.ldoOut = Boot.LDOPCTL_2_75V;   /* LDO = 2.75V */
        clockRate = 50;
    }

    if (prog.build.target.isa == "v7M4") {
        this.M4.clockRate = clockRate;
    }
    else {
        this.M3.clockRate = clockRate;
    }
}
/*
 *  @(#) ti.platforms.stellaris; 1, 0, 0,57; 8-17-2012 22:18:11; /db/ztree/library/trees/platform/platform-n27x/src/
 */

