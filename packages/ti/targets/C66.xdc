/* 
 *  Copyright (c) 2010 Texas Instruments and others.
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
 *  ======== C66.xdc ========
 *
 */

/*!
 *  ======== C66 ========
 *  TI C66 little endian (COFF)
 */
metaonly module C66 inherits ITarget {
    override readonly config string name                 = "C66";       
    override readonly config string suffix               = "66";
    override readonly config string isa                  = "66";
    override readonly config xdc.bld.ITarget.Model model = {
        endian: "little",
    };
    override readonly config xdc.bld.ITarget.Module base = ti.targets.C62;

    /*
     *  ======== compatibleSuffixes ========
     */
    override config String compatibleSuffixes[] = ["674", "64P"];

    override readonly config string rts = "ti.targets.rts6000";
    override config string platform     = "ti.platforms.simTCI6616";
    
    override readonly config xdc.bld.ITarget2.Command ar = {
        cmd: "ar6x",
        opts: "rq"
    };

    override readonly config xdc.bld.ITarget2.Command cc = {
        cmd: "cl6x -c",
        opts: "-mv6600 --abi=coffabi"
    };

    override readonly config xdc.bld.ITarget2.Command vers = {
        cmd: "cl6x",
        opts: "--compiler_revision"
    };

    override readonly config xdc.bld.ITarget2.Command asm = {
        cmd: "cl6x -c",
        opts: "-mv6600 --abi=coffabi"
    };

    override readonly config xdc.bld.ITarget2.Command lnk = {
        cmd: "lnk6x",
        opts: "--abi=coffabi"
    };
    
    /*!
     *  ======== profiles ========
     *  The options in "profile" and "coverage" profiles are supported only
     *  for the compiler version 6.1 and newer, for this target. If the target
     *  is used with the compiler version 6.0, these options are removed
     *  from the command line.
     */
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
    override config xdc.bld.ITarget2.Options asmOpts = {
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
    override config xdc.bld.ITarget2.Options ccOpts = {
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
    override config xdc.bld.ITarget2.Options ccConfigOpts = {
        prefix: "$(ccOpts.prefix) -mo",
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
    override config xdc.bld.ITarget2.Options lnkOpts = {
        prefix: "-w -q -u _c_int00",
        suffix: "-c -m $(XDCCFGDIR)/$@.map -l $(rootDir)/lib/rts6600_coff.lib"
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

