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

/*!
 *  ======== IM3_big_endian.xdc ========
 *  Cortex M3 big endian thumb2 target
 */
metaonly interface IM3_big_endian inherits ti.targets.arm.elf.IArm {
    override readonly config string isa         = "v7M";

    override readonly config xdc.bld.ITarget.Module base = ti.targets.arm.Arm9;

    override config string platform   = "ti.platforms.simDM8168";

    override readonly config xdc.bld.ITarget.Model model = {
        endian: "big",
        codeModel: "thumb2",
        shortEnums: true
    };

    override readonly config xdc.bld.ITarget2.Command lnk = {
        cmd:  "lnk470",
        opts: "--be32 --silicon_version=7M3 --strict_compatibility=on"
    };
}

/*
 *  @(#) ti.targets.arm.elf; 1, 0, 0,355; 11-4-2012 21:21:29; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

