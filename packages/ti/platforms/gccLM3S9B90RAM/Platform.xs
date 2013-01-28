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
 *
 */

/*
 *  ======== module$meta$init ========
 */
function module$meta$init()
{
    if (xdc.om.$name != 'cfg') {
        return;
    }
}

/*
 *  ======== module$use ========
 */
function module$use()
{
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
    return (Utils.getCpuDataSheet(this.$private.cpuAttrs));
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

    var cpu = ExeContext.create(this.$module.CPU, this.$module.BOARD);

    /* Set the initial memory map from the cpu datasheet. Check if the user
     * tried to set cpuArgs, and if it's the case print a deprecation
     * warning message.
     */
    if (prog.build.cpuArgs != null) {
        this.$module.$logWarning(
            "The parameter 'cpuArgs' in xdc.bld.Executable.Attrs " +
            "is deprecated and will not be supported in future releases. " +
            "Please, use corresponding platform instance parameters to set " +
            "the initial register settings.", this.$module, null);
        
        for (var prop in prog.build.cpuArgs) {
            if (prop in this) {
                this[prop] = prog.build.cpuArgs[prop];
            }
        }
    }
    cpu.memoryMap = Utils.assembleMemoryMap(cpu, this);

    if (this.codeMemory == undefined) {
       this.codeMemory = "FRAM";
    }

    if (this.dataMemory == undefined) {
        this.dataMemory = "IRAM";
    }

    if (this.stackMemory == undefined) {
        this.stackMemory = "IRAM";
    }

    // check for the overlap in the memory map
    var overlap = Utils.checkOverlap(cpu.memoryMap);
    
    if (overlap != null) {
        this.$module.$logError("Memory objects " + overlap + " overlap", this,
            overlap);
    }

    Utils.checkDefaults(this, cpu.memoryMap);

    // temporary hack: declare CPU rate here
    cpu.clockRate = 80;

    this.$seal();
    return (cpu);
}

/*
 *  ======== Platform.getExecCmd ========
 *  This Platform's implementation xdc.platform.IPlatform.getExecCmd.
 */
function getExecCmd(prog)
{
    var os = environment["xdc.hostOS"];
    var updateComment = "@$(ECHO) Check for updates to this package at:\n" +
    "@$(ECHO) https://www-a.ti.com/downloads/sds_support/targetcontent/rtsc/index.html";

     return("@$(ECHO) " + this.$package.$name + " platform package cannot " +
         "execute " + prog.name + " on " + os + "\n" + updateComment + "\n\t:");
}

/*
 *  ======== Platform.getLinkTemplate ========
 *  This is Platform's implementation xdc.platform.IPlatform.getLinkTemplate
 */
function getLinkTemplate(prog)
{
    return ("ti/platforms/gccLM3S9B90RAM/linkcmd.xdt");
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
 *  name prefix).
 */
function instance$meta$init(name)
{
    /* cache the platform instance name for the methods above. */
    this.$private.name = name;                      /* instance name */

    /* setup clocks */
    Boot = xdc.useModule('ti.catalog.arm.cortexm3.lm3init.Boot');

    Boot.configureClock = true;
    Boot.oscSrc = Boot.OSCSRC_MAIN;     /* use main oscillator */
    Boot.pllBypass = false;             /* use PLL to drive sys clock */
    Boot.pllOutEnable = false;          /* no PLL output */
    Boot.ioscDisable = false;           /* IOSC is enabled */
    Boot.moscDisable = false;           /* MOSC is enabled */

    Boot.configureLdo = false;
    Boot.sysClockDiv = Boot.SYSDIV_2_5; /* 80 MHz */
    Boot.pwmClockDiv = Boot.PWMDIV_1;
    Boot.xtal = Boot.XTAL_16MHZ ;       /* XTAL = 16 MHz */
}

/*
 *  @(#) ti.platforms.gccLM3S9B90RAM; 1, 0, 1, 1,25; 8-17-2012 22:16:35; /db/ztree/library/trees/platform/platform-n27x/src/
 */

