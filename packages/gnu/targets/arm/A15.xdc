/* 
 *  Copyright (c) 2012 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Texas Instruments - initial implementation
 * 
 * */
import xdc.bld.ITarget2;

/*!
 *  ======== A15.xdc ========
 *  Embedded Cortex A15, little endian, bare metal target
 *
 *  This module defines an embedded bare metal target on Cortex A15. The target
 *  generates code compatible with the "v7A" architecture.
 *
 */
metaonly module A15 inherits gnu.targets.ITarget {
    override readonly config string name                = "A15";        
    override readonly config string suffix              = "a15g";
    override readonly config string isa                 = "v7A15";
    override readonly config xdc.bld.ITarget.Model model= {
        endian: "little",
        shortEnums: true
    };

    override readonly config Bool alignDirectiveSupported = true;

    override readonly config string rts = "gnu.targets.arm.rtsv7A";
    override config string platform     = "ti.platforms.sdp5430";

    override config string LONGNAME = "bin/arm-none-eabi-gcc";
    
    override readonly config String stdInclude = "gnu/targets/arm/std.h";

    override readonly config ITarget2.Command cc = {
        cmd: "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep",
        opts: "-mcpu=cortex-a15 -mfpu=neon -mfloat-abi=softfp"
    };

    readonly config ITarget2.Command ccBin = {
        cmd: "bin/arm-none-eabi-gcc -c -MD -MF $@.dep",
        opts: "-mabi=aapcs -mapcs"
    };

    override config ITarget2.Options ccOpts = {
        prefix: "-fPIC -Wunused -Wunknown-pragmas",
        suffix: "-Dfar= "
    };

    override readonly config ITarget2.Command asm = {
        cmd: "$(rootDir)/$(LONGNAME) -c -x assembler-with-cpp",
        opts: "-mcpu=cortex-a15 -mfpu=neon -mfloat-abi=softfp"
    };

    readonly config ITarget2.Command asmBin = {
        cmd: "bin/arm-none-eabi-gcc -c -x assembler-with-cpp",
        opts: "-mcpu=cortex-a15 -mfpu=neon -mfloat-abi=softfp"
    };

    override config ITarget2.Options lnkOpts = {
        prefix: "-nostartfiles -Wl,-static -Wl,--gc-sections",
        suffix: "-Wl,-Map=$(XDCCFGDIR)/$@.map -L$(rootDir)/$(GCCTARG)/lib"
    };

    readonly config ITarget2.Command arBin = {
        cmd: "bin/arm-none-eabi-ar ",
        opts: ""
    };

    /*
     *  ======== profiles ========
     */
    override config xdc.bld.ITarget.OptionSet profiles[string] = [
        ["debug", {
            compileOpts: {
                copts: "-g",
                defs:  "-D_DEBUG_=1",
            },
            linkOpts: "-g",
        }],

        ["release", {
            compileOpts: {
                copts: " -O2 ",
            },
            linkOpts: " ",
        }],
    ];
        
    /*
     *  ======== compatibleSuffixes ========
     */
    override config String compatibleSuffixes[] = [];

    override readonly config xdc.bld.ITarget.StdTypes stdTypes = {
        t_IArg          : { size: 4, align: 4 },
        t_Char          : { size: 1, align: 1 },
        t_Double        : { size: 8, align: 4 },
        t_Float         : { size: 4, align: 4 },
        t_Fxn           : { size: 4, align: 4 },
        t_Int           : { size: 4, align: 4 },
        t_Int8          : { size: 1, align: 1 },
        t_Int16         : { size: 2, align: 2 },
        t_Int32         : { size: 4, align: 4 },
        t_Int64         : { size: 8, align: 4 },
        t_Long          : { size: 4, align: 4 },
        t_LDouble       : { size: 8, align: 4 },
        t_LLong         : { size: 8, align: 4 },
        t_Ptr           : { size: 4, align: 4 },
        t_Short         : { size: 2, align: 2 },
        t_Size          : { size: 4, align: 4 },
    };
}
/*
 *  @(#) gnu.targets.arm; 1, 0, 0, 0,438; 11-4-2012 21:21:10; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

