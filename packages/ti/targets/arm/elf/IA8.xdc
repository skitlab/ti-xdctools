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
 *  ======== IA8.xdc ========
 *  Cortex A8 little endian target
 */
metaonly interface IA8 inherits ti.targets.arm.elf.IArm {
    override readonly config string isa         = "v7A";

    /*
     *  ======== compatibleSuffixes ========
     */
    override config String compatibleSuffixes[] = ["e9", "e7", "e9t"];

    override readonly config xdc.bld.ITarget.Module base = ti.targets.arm.Arm9;

    override config string platform   = "ti.platforms.evmDM8168";

    override readonly config xdc.bld.ITarget2.Command lnk = {
        cmd:  "lnk470",
        opts: "--silicon_version=7A8 --strict_compatibility=on"
    };
}
/*
 *  @(#) ti.targets.arm.elf; 1, 0, 0,355; 11-4-2012 21:21:29; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

