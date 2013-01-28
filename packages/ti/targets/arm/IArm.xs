/*
 *  Copyright 2012 by Texas Instruments Incorporated.
 *
 */

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
 *  @(#) ti.targets.arm; 2, 0, 1, 0,423; 11-4-2012 21:21:26; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

