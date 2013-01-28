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
 *  Platform support for evmTI814X
 *
 */

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
    if (cpuId == "0") {
        return (Utils.getCpuDataSheet(this.$module.GEM));
    }
    else if (cpuId == "1") {
        return (Utils.getCpuDataSheet(this.$module.EVE));
    }
    else if (cpuId == "2") {
        return (Utils.getCpuDataSheet(this.$module.DSS));
    }
    else if (cpuId == "3") {
        return (Utils.getCpuDataSheet(this.$module.GPP));
    }
    else {
        this.$module.$logError("The platform " + this.$module.$name +
            " does not contain cpu with cpuId: " + cpuId, this.$module, null);
    }
}

/*
 *  ======== Platform.getExeContext ========
 *  This Platform's implementation xdc.platform.IPlatform.getExeContext.
 *
 *  Return the xdc.platform.IPlatform.ExeContext object that will run the
 *  specified program prog.
 */
function getExeContext(prog)
{
    var Utils = xdc.module("xdc.platform.Utils");

    var args = this.$private.args;

    var ExeContext = xdc.useModule('xdc.platform.ExeContext');

    /* create a default ExeContext execution context */
    var cpu;
    var core;
    var gppChain = ["470", "v4T", "v5T", "v5TE", "v5t", "v6", "v7A"];
    var armChain = ["v7M"];
    var dspChain = ["62", "64", "64P", "674"];
    var eveChain = ["arp32"];
    for (var i = 0; i < dspChain.length; i++) {
        if (dspChain[i] == prog.build.target.isa) {
            xdc.loadPackage(this.$module.GEM.catalogName);
            cpu = ExeContext.create(this.$module.GEM, this.$module.BOARD);
            core = "DSP";
        }
    }
    if (cpu == undefined) {
        /* haven't found it yet, keep looking... */
        for (var i = 0; i < armChain.length; i++) {
            if (armChain[i] == prog.build.target.isa) {
                xdc.loadPackage(this.$module.DSS.catalogName);
                cpu = ExeContext.create(this.$module.DSS, this.$module.BOARD);
                core = "M3";
            }
        }
    }
    if (cpu == undefined) {
        /* haven't found it yet, keep looking... */
        for (var i = 0; i < gppChain.length; i++) {
            if (gppChain[i] == prog.build.target.isa) {
                xdc.loadPackage(this.$module.GPP.catalogName);
                cpu = ExeContext.create(this.$module.GPP, this.$module.BOARD);
                core = "HOST";
            }
        }
    }
    if (cpu == undefined) {
        /* haven't found it yet, keep looking... */
        for (var i = 0; i < eveChain.length; i++) {
            if (eveChain[i] == prog.build.target.isa) {
                xdc.loadPackage(this.$module.EVE.catalogName);
                cpu = ExeContext.create(this.$module.EVE, this.$module.BOARD);
                core = "EVE";

                for (memory in this.externalMemoryMap) {
                    if (memory == "DDR3_EVEVECS") {
                        this.externalMemoryMap[memory].page = 0;
                    }
                    else {
                        this.externalMemoryMap[memory].page = 1;
                    }
                }
            }
        }
    }
    if (cpu == undefined) {
        this.$module.$logError("The build target " + prog.build.target.$name +
            " is incompatible with this platform.", this.$module, null);
    }

    /* Set the initial memory map from the cpu datasheet. Check if the user
     * tried to set cpuArgs, and if it's the case print a deprecation
     * warning message.
     */
    if (prog.build.cpuArgs != null) {
        this.$module.$logWarning("The parameter 'cpuArgs' in xdc.bld.Executable " +
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
        switch(core) {
            case "DSP":
                this.codeMemory = "DDR3_DSP";
                break;
            case "M3":
                this.codeMemory = "DDR3_M3";
                break;
            case "HOST":
                this.codeMemory = "DDR3_HOST";
                break;
            case "EVE":
                this.codeMemory = "DDR3_EVE";
                break;
        }
    }
    
    if (this.dataMemory == undefined) {
        switch(core) {
            case "DSP":
                this.dataMemory = "DDR3_DSP";
                break;
            case "M3":
                this.dataMemory = "DDR3_M3";
                break;
            case "HOST":
                this.dataMemory = "DDR3_HOST";
                break;
            case "EVE":
                this.dataMemory = "DMEM";
                break;
        }
    }
    
    if (this.stackMemory == undefined) {
        switch(core) {
            case "DSP":
                this.stackMemory = "DDR3_DSP";
                break;
            case "M3":
                this.stackMemory = "DDR3_M3";
                break;
            case "HOST":
                this.stackMemory = "DDR3_HOST";
                break;
            case "EVE":
                this.stackMemory = "DMEM";
                break;
        }
    }

    // check for the overlap in the memory map
    var overlap = Utils.checkOverlap(cpu.memoryMap);

    if (overlap != null) {
        this.$module.$logError("Memory objects " + overlap + " overlap", this,
            overlap);
    }

    Utils.checkDefaults(this, cpu.memoryMap);
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
    "@$(ECHO) http://software-dl.ti.com/dsps/dsps_public_sw/sdo_sb/targetcontent/rtsc/index.html";

     return("@$(ECHO) " + this.$package.$name + " platform package cannot " +
         "execute " + prog.name + " on " + os + "\n" + updateComment +
         "\n\t:");
}

/*
 *  ======== Platform.getLinkTemplate ========
 *  This is Platform's implementation xdc.platform.IPlatform.getLinkTemplate
 */
function getLinkTemplate(prog)
{
    /* use the target's linker command template */
    /* we compute the target because this same platform is supported by
     * many different tool chains; e.g., ti.targets, gnu.targets, ...
     */
    var tname = prog.build.target.$name;
    var tpkg = tname.substring(0, tname.lastIndexOf('.'));
    var templateName = tpkg.replace(/\./g, "/") + "/linkcmd.xdt";

    if (xdc.findFile(templateName) != null) {
        return (templateName);
    }
    else if (tname.indexOf("ti.targets.") == 0) {
        return ("ti/targets/linkcmd.xdt");
    }
    else {
        throw new Packages.xdc.services.global.XDCException(
            this.$package.$name + ".LINK_TEMPLATE_ERROR",
            "Target package " + tpkg + " does not contain linker command "
            + "template 'linkcmd.xdt'.");
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
 *  this.$args.name is the name used to identify this instance (without
 *  the package name prefix).
 */
function instance$meta$init(name)
{
    /* cache the platform creation args and platform instance name for the
     * getExeContext method above.
     */
    this.$private.name = name;      /* instance name */

}
/*
 *  @(#) ti.platforms.evmC6A8149; 1, 0, 0,10; 8-17-2012 22:15:02; /db/ztree/library/trees/platform/platform-n27x/src/
 */

