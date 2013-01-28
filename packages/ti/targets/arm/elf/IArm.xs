/* 
 *  Copyright (c) 2008 Texas Instruments and others.
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
 *  ======== IArm.asmName ========
 */
function asmName(CName)
{
    return (CName);
}

/*
 *  ======== IArm.link ========
 */
function _hide_link(goal)
{
    var target = this;
    
    var cap = xdc.loadCapsule("ti/targets/ITarget.xs");
    var _bldUtils = xdc.useModule('xdc.bld.Utils');

    cap._initTabs();

    var compString = this.getVersion().split('{')[1];
    var compVersion = compString.split(',');
          
    /* Partial link can be used only in compilers with the fix for SDOCM31285 */
    if (compVersion[2] < "4.6"
        || (compVersion[2] == "4.6" && compVersion[3] < "3")) {
         return (cap.link.call(this, goal));
    }

    var result = null;
    var tool2cmd = cap._targetCmds[target.suffix];

    if (tool2cmd != null) {
        result = new xdc.om['xdc.bld.ITarget'].CommandSet;
        result.msg = "lnk" + target.suffix + " $@ ...";
        cap._setEnv(target, result);

        var lib = "";
        if (("linkLib" in target) && target.linkLib != null) {
            lib = " -l $(rootDir)/lib/" + target.linkLib;
        }

        var cmd = tool2cmd["link"];
        var pre = target.lnkOpts == null ? "" :
            (goal.dllMode ? "" : target.lnkOpts.prefix);

        if (goal.profile.match(/whole_program/)) {
            /* If the linkOpts are set for the 'whole_program' profile or the
             * 'whole_progam_debug' profile, and these options set compile
             * options, then an additional set of the compile options should
             * not be added. This is intended for the internal use only.
             */
            if (this.profiles[goal.profile].linkOpts == undefined ||
                !this.profiles[goal.profile].linkOpts.match(/--opt/)) {
                var allOpts = target.cc.opts + " " + target.ccOpts.prefix
                    + " " + target.ccOpts.suffix
                    + " " + "--diag_suppress=23000"
                    + " " + this.profiles[goal.profile].compileOpts.copts
                    + " -op2 -O3";

                /* The profile "whole_program" compiles with '-O2' because we
                 * want the standard object code to be optimized at O2 level in
                 * case it is linked without invoking the optimizer from the
                 * linker. However, we already added '-O3' for the case when
                 * the linker invokes the optimizer, so we need to remove '-O2'
                 * to avoid confusion.
                 */
                allOpts = allOpts.replace(" -O2", " ");
                if (goal.profile == "whole_program_debug") {
                    allOpts += " --optimize_with_debug";
                }

                pre += " --opt='" + allOpts + " --inline_recursion_limit=20'";

            }
        }

        result.cmds = _bldUtils.expandString(cmd, {
            LOPTS_P: pre,
            LOPTS_S: target.lnkOpts == null ? "" :
                (goal.dllMode ? "-r -m $(XDCCFGDIR)/$@.map" :
                                target.lnkOpts.suffix + lib),
            lopts:   goal.opts,
            files:   goal.files
        });

        if (goal.dllMode) {
            result.cmds += "$(MV) $@ $(XDCCFGDIR)/$@.obj\n";
            result.cmds += "$(TOUCH) $@\n";
        }
    }

    return (result);
}

/*
 *  ======== IArm.getVersion ========
 */
function getVersion()
{
    /* We have to intercept the first call to compiler to prevent the file
     * name error. That call is caused by xdc.bld calling this function. At
     * that time, _targetCmds might have not been defined yet, and in this
     * case we change this.vers and other properties where the compiler is
     * explicitly named. But if some other target caused _targetCmds to get
     * initialized already, we then have to change the content of _targetCmds.
     */
    var File = xdc.module("xdc.services.io.File");
    if (File.exists(this.rootDir + "/bin/armcl")
        || File.exists(this.rootDir + "/bin/armcl.exe")) {
        this.vers.$unseal();
        this.lnk.$unseal();
        this.cc.$unseal();
        this.asm.$unseal();
        this.ar.$unseal();
        this.vers.cmd = "armcl";
        this.lnk.cmd = "armlnk";
        this.asm.cmd = "armcl -c";
        this.cc.cmd = "armcl -c";
        this.ar.cmd = "armar";
        this.vers.$seal();
        this.lnk.$seal();
        this.cc.$seal();
        this.asm.$seal();
        this.ar.$seal();
        
        /* It's possible that commands are already set in the capsule in
         * ti.targets, so we have to change that too.
         */
        var cap = xdc.loadCapsule("ti/targets/ITarget.xs");
        if (cap._targetCmds != null && cap._targetCmds[this.suffix] != undefined
            && cap._targetCmds[this.suffix]["vers"].match("cl470")) {
            var cMap = cap._targetCmds[this.suffix];
            cMap["vers"] = cMap["vers"].replace(/bin\/cl470 /, "bin/armcl ");
            cMap["asm"] = cMap["asm"].replace(/bin\/cl470 /, "bin/armcl ");
            cMap["c"] = cMap["c"].replace(/bin\/cl470 /, "bin/armcl ");
            cMap["cpp"] = cMap["cpp"].replace(/bin\/cl470 /, "bin/armcl ");
            cMap["ar"] = cMap["ar"].replace(/bin\/ar470 /, "bin/armar ");
            cMap["link"] = cMap["link"].replace(/bin\/lnk470 /, "bin/armlnk ");
        }
    }

    return (xdc.module("ti.targets.ITarget").getVersion.$fxn.call(this));
}
/*
 *  @(#) ti.targets.arm.elf; 1, 0, 0,355; 11-4-2012 21:21:29; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

