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
 *  ======== Package.close ========
 */
function close()
{
    if (xdc.om.$name != 'cfg') {
        return;
    }
    if ((Program.build.target.isa == "v7M") ||
            (Program.build.target.isa == "v7M4")) {
        if (Program.sectMap[".bootVecs"] === undefined) {
            Program.sectMap[".bootVecs"] = new Program.SectionSpec();
            Program.sectMap[".bootVecs"].loadAddress = 0x0;
        }
    }
}

/*
 *  ======== Package.getLibs ========
 */
function getLibs(prog)
{
    var libs = "lib/" + this.$name + ".a" + Program.build.target.suffix;

    if (Program.build.cfgScript == null || !Program.build.cfgScript.match(/\.tcf$/)) {
        libs += ";lib/boot.a" + Program.build.target.suffix;
        libs += ";lib/auto_init.a" + Program.build.target.suffix;
    }

    return (libs);
}
/*
 *  @(#) ti.targets.arm.rtsarm; 1, 0, 0, 0,176; 11-4-2012 21:52:10; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

