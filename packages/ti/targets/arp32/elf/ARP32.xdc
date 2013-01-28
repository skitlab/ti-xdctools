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
 *  ======== ARP32.xdc ========
 *
 */

/*!
 *  ======== ARP32 ========
 *  TI ARP32 default runtime model (little endian)
 */
metaonly module ARP32 inherits ti.targets.ITarget {
    override readonly config string name            = "ARP32";  
    override readonly config string suffix          = "earp32";
    override readonly config string isa             = "arp32";  
    override readonly config xdc.bld.ITarget.Model model = {
        endian: "little",
        shortEnums: true
    };
    override readonly config string rts = "ti.targets.arp32.rts";
    override config string platform     = "ti.platforms.simARP32";
    
    override readonly config xdc.bld.ITarget2.Command ar = {
        cmd: "ar-arp32",
        opts: "rq"
    };

    override readonly config xdc.bld.ITarget2.Command cc = {
        cmd: "cl-arp32 -c --gen_func_subsections",
        opts: "--silicon_version=v210"
    };

    override readonly config xdc.bld.ITarget2.Command asm = {
        cmd: "cl-arp32 -c --gen_func_subsections",
        opts: "--silicon_version=v210"
    };

    override readonly config xdc.bld.ITarget2.Command lnk = {
        cmd: "lnk-arp32",
        opts: ""
    };
    
    override readonly config xdc.bld.ITarget2.Command vers = {
        cmd: "cl-arp32",
        opts: "--compiler_revision"
    };

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
     */
    override config xdc.bld.ITarget2.Options ccConfigOpts = {
        prefix: "$(ccOpts.prefix)",
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
        suffix: "-c -m $(XDCCFGDIR)/$@.map -l $(rootDir)/lib/rtsarp32_v200.lib"
    };
        
    override config string includeOpts = "-I$(rootDir)/include";

    final override readonly config string sectMap[string] = [
        [".text", "code"],
        [".stack", "stack"],
        [".bss", "data"],
        [".cinit", "data"],
        [".init_array", "data"],
        [".const", "data"],
        [".data", "data"],
        [".switch", "data"],
        [".sysmem", "data"],
        [".far", "data"],
        [".args", "data"],
        [".cio", "data"],
        [".fardata", "data"],
        [".rodata", "data"],
    ];

    override readonly config Int bitsPerChar = 8;
    
    /*!
     *  ======== profiles ========
     *  Standard options profiles for the TI tool-chain.
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
                copts: "--symdebug:dwarf",
            },
        }],
        ["coverage", {
            compileOpts: {
                copts: "--symdebug:dwarf",
            },
        }]
    ];

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
    
    override config String stdInclude = "ti/targets/arp32/elf/std.h";

    override config String binaryParser = "ti.targets.omf.elf.Elf32";
}

/*
 *  @(#) ti.targets.arp32.elf; 1, 0, 0,92; 11-4-2012 21:21:30; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

