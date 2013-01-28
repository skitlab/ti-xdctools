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
 *  Platform support for evmDA830
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
        return (Utils.getCpuDataSheet(this.$module.ARP32));
    }
    else if (cpuId == "1") {
        return (Utils.getCpuDataSheet(this.$module.DSP));
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
    var arp32Chain = ["arp32"];
    var dspChain = ["62", "64", "64P", "674"];
    for (var i = 0; i < dspChain.length; i++) {
        if (dspChain[i] == prog.build.target.isa) {
            xdc.loadPackage(this.$module.DSP.catalogName);
            cpu = ExeContext.create(this.$module.DSP, this.$module.BOARD);
            core = "DSP";
        }
    }
    for (var i = 0; i < arp32Chain.length; i++) {
        if (arp32Chain[i] == prog.build.target.isa) {
            xdc.loadPackage(this.$module.ARP32.catalogName);
            cpu = ExeContext.create(this.$module.ARP32, this.$module.BOARD);
            core = "ARP32";
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
        if (this.$private.args.core == "ARP32") {
            this.codeMemory = "ARP32";
        }
        else {
            this.codeMemory = "DSP";
        }
    }
    
    if (this.dataMemory == undefined) {
        if (this.$private.args.core == "ARP32") {
            this.dataMemory = "DMEM";
        }
        else {
            this.dataMemory = "DSP";
        }
    }
    
    if (this.stackMemory == undefined) {
        if (this.$private.args.core == "ARP32") {
            this.stackMemory = "DMEM";
        }
        else {
            this.stackMemory = "DSP";
        }
    }
    
    // check for the overlap in the memory map
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
function instance$meta$init(name, args)
{
    var thisMod = this.$module;

    /* cache the platform creation args and platform instance name for the
     * getExeContext method above.
     */
    this.$private.name = name;      /* instance name */

    if (args == null) {
        args = {};
    }
    this.$private.args = args;      /* instance args */

    if (args.core == null) {
        /* We need to add v5t, v5T, v5TE because of several changes we made for
         * the name of that architecture.
         */
        var arp32 = ["arp32"];
        var dspChain = ["62", "64", "64P", "674", "66"];
        for (var i = 0; i < dspChain.length; i++) {
            if (dspChain[i] == prog.build.target.isa) {
                args.core = "DSP";
            }
        }

        for (var i = 0; i < arp32.length; i++) {
            if (arp32[i] == prog.build.target.isa) {
                args.core = "ARP32";
                
                /* add 'page' to the external memory map on ARP32 */
                for (memory in this.externalMemoryMap) {
                    if (memory == "ARP32VECS") {
                        this.externalMemoryMap[memory].page = 0;
                    }
                    else {
                        this.externalMemoryMap[memory].page = 1;
                    }
                }
            }
        }

        if (args.core == null) {
            this.$module.$logError("The build target " + prog.build.target.$name
                + " is incompatible with this platform.", this.$module, null);
        }
    }
    
    if ("sectMap" in args) {
        this.sectMap = args.sectMap;
    }

    if ("customMemoryMap" in args) {
        this.customMemoryMap = args.customMemoryMap;
    }
        
    if ("renameMap" in args) {
        this.renameMap = args.renameMap;
    }
        
    if ("externalMemoryMap" in args) {
        var Utils = xdc.useModule('xdc.platform.Utils');

        /* The external map has to be of the right type for this check to
         * work.
         */
        var external = new xdc.om['xdc.platform.IPlatform'].MemoryMap(
            args.externalMemoryMap);
        if (!Utils.checkFit(this.$module.PARAMS.externalMemoryMap, external)) {
            this.$module.$logError("External memory map cannot fit in " +
                "the available space.", this, null);
        }
        this.externalMemoryMap = external;
    }
        
    if ("codeMemory" in args) {
        this.codeMemory = args.codeMemory;
    }

    if ("dataMemory" in args) {
        this.dataMemory = args.dataMemory;      
    }

    if ("stackMemory" in args) {
        this.stackMemory = args.stackMemory;
    }
}
/*
 *  @(#) ti.platforms.simArctic; 1, 0, 0,60; 8-17-2012 22:17:41; /db/ztree/library/trees/platform/platform-n27x/src/
 */

