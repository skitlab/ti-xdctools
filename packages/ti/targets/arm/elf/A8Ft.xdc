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
 *  ======== A8Ft.xdc ========
 *  Cortex A8 thumb2 little endian with floating point support (NEON) (ELF)
 */
metaonly module A8Ft inherits ti.targets.arm.elf.IA8 {
    override readonly config string name        = "A8Ft";
    override readonly config string suffix      = "ea8ft";
    override readonly config string rts         = "ti.targets.arm.rtsarm";

    override readonly config xdc.bld.ITarget.Model model = {
        endian: "little",
        codeModel: "thumb2",
        shortEnums: true
    };

    override readonly config xdc.bld.ITarget2.Command cc = {
        cmd:  "cl470 -c",
        opts: "-mt --neon --endian=little -mv7A8 --abi=eabi"
    };

    override readonly config xdc.bld.ITarget2.Command asm = {
        cmd:  "cl470 -c",
        opts: "-mt --neon --endian=little -mv7A8 --abi=eabi"
    };

    /*!
     *  ======== linkLib ========
     *  Default TMS470 cgtools runtime library to link with executable
     *  (comes from $rootDir/lib)
     */
    config string linkLib = "rtsv7A8_T_le_n_eabi.lib";
}
/*
 *  @(#) ti.targets.arm.elf; 1, 0, 0,355; 11-4-2012 21:21:29; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

