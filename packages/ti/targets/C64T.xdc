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
 *  ======== C64T.xdc ========
 *
 */

import xdc.bld.ITarget2;

/*!
 *  ======== C64T ========
 *  TI C64T default runtime model (little endian)
 */
metaonly module C64T inherits ti.targets.ITarget {
    override readonly config string name                 = "C64T";
    override readonly config string suffix               = "64T";
    override readonly config string isa                  = "64T";
    override readonly config xdc.bld.ITarget.Model model = {
        endian: "little"
    };
    override readonly config xdc.bld.ITarget.Module base = ti.targets.C62;

    override readonly config string rts = "ti.targets.rts6000";
    override config string platform     = "ti.platforms.sdp4430";
    override readonly config string stdInclude = "ti/targets/std.h";
    
    override readonly config ITarget2.Command ar = {
        cmd: "ar6x",
        opts: "rq"
    };

    override readonly config ITarget2.Command cc = {
        cmd: "cl6x -c",
        opts: "-mv=tesla --abi=coffabi"
    };

    override readonly config ITarget2.Command vers = {
        cmd: "cl6x",
        opts: "--compiler_revision"
    };

    override readonly config ITarget2.Command asm = {
        cmd: "cl6x -c",
        opts: "-mv=tesla --abi=coffabi"
    };

    override readonly config ITarget2.Command lnk = {
        cmd: "lnk6x",
        opts: "--abi=coffabi"
    };
    
    override config xdc.bld.ITarget.OptionSet profiles[string] = [
        ["debug", {
            compileOpts: {
                copts: "--symdebug:dwarf",
                defs:  "-D_DEBUG_=1",
            }
        }],
        ["release", {
            compileOpts: {
                copts: "-O2",
            },
        }],
        ["profile", {
            compileOpts: {
                copts: "--gen_profile_info",
            },
        }],
        ["coverage", {
            compileOpts: {
                copts: "--gen_profile_info",
            },
        }],
        ["whole_program", {
            compileOpts: {
                copts: "-oe -O2 -mo",
            },
        }],
        ["whole_program_debug", {
            compileOpts: {
                copts: "-oe --symdebug:dwarf -mo",
            },
        }],
    ];

    /*!
     *  ======== asmOpts ========
     *  User configurable assembler options.
     *
     *  Defaults:
     *  @p(dlist)
     *      -`-qq`
     *          super quiet mode
     */
    override config ITarget2.Options asmOpts = {
        prefix: "-qq",
        suffix: ""
    };

    /*!
     *  ======== ccOpts ========
     *  User configurable compiler options.
     *
     *  Defaults:
     *  @p(dlist)
     *      -`-qq`
     *          super quiet mode
     *      -`-pdsw225`
     *          generate a warning for implicitly declared functions; i.e.,
     *          functions without prototypes
     */
    override config ITarget2.Options ccOpts = {
        prefix: "-qq -pdsw225",
        suffix: ""
    };

    /*!
     *  ======== ccConfigOpts ========
     *  User configurable compiler options for the generated config C file.
     *
     *  -mo places all functions into subsections
     *  --no_compress helps with compile time with no real difference in
     *  code size since the generated config.c is mostly data and small
     *  function stubs.
     */
    override config ITarget2.Options ccConfigOpts = {
        prefix: "$(ccOpts.prefix) -mo --no_compress",
        suffix: "$(ccOpts.suffix)"
    };

    /*!
     *  ======== lnkOpts ========
     *  User configurable linker options.
     *
     *  Defaults:
     *  @p(dlist)
     *      -`-w`
     *          Display linker warnings
     *      -`-q`
     *          Quite run
     *      -`-u`
     *          Place unresolved external symbol into symbol table
     *      -`-c`
     *          ROM autoinitialization model
     *      -`-m`
     *          create a map file
     *      -`-l`
     *          archive library file as linker input
     */
    override config ITarget2.Options lnkOpts = {
        prefix: "-w -q -u _c_int00",
        suffix: "-c -m $(XDCCFGDIR)/$@.map -l $(rootDir)/lib/rtstesla_le_coff.lib"
    };
        
    override config string includeOpts = "-I$(rootDir)/include";

    final override readonly config string sectMap[string] =
        ti.targets.C62.sectMap;

    override readonly config xdc.bld.ITarget.StdTypes stdTypes = 
        ti.targets.C62.stdTypes;
    
    override readonly config Int bitsPerChar = 
        ti.targets.C62.bitsPerChar;
}
/*
 *  @(#) ti.targets; 1, 0, 3,606; 11-4-2012 21:21:24; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

