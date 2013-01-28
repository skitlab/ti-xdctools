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
 *  ======== C28.xdc ========
 *
 */

/*!
 *  ======== C28 ========
 *  TI C28 default runtime model (little endian)
 */
metaonly module C28 inherits ti.targets.ITarget {
    override readonly config string name                = "C28";        
    override readonly config string suffix              = "28";
    override readonly config string isa                 = "28"; 
    override readonly config xdc.bld.ITarget.Model model= {endian: "little"};
    override readonly config string rts                 = "ti.targets.rts2800";
    final override readonly config Bool alignDirectiveSupported = false;
    
    /*!
     *  ======== ar ========
     *  Define archiver executable
     *
     *  Options:
     *  @p(dlist)
     *      -`-r`
     *          replace file
     *      -`-q`
     *          quiet mode
     */
    override readonly config xdc.bld.ITarget2.Command ar = {
        cmd: "ar2000",
        opts: "rq"
    };

    /*!
     *  ======== cc ========
     *  Define compiler executable
     *
     *  Options:
     *  @p(dlist)
     *      -`-c`
     *          no linking
     *      -`-v28`
     *          compile for c28x.
     */
    override readonly config xdc.bld.ITarget2.Command cc = {
        cmd: "cl2000 -c",
        opts: "-v28"
    };

    /*!
     *  ======== vers ========
     *  Define the vers command
     */
    override readonly config xdc.bld.ITarget2.Command vers = {
        cmd: "cl2000",
        opts: "--compiler_revision"
    };

    /*!
     *  ======== asm ========
     *  Define assembler executable
     *
     *  Options:
     *  @p(dlist)
     *      -`-c`
     *          no linking
     *      -`-v28`
     *          compile for c28x.
     *
     */
    override readonly config xdc.bld.ITarget2.Command asm = {
        cmd: "cl2000 -c",
        opts: "-v28"
    };

    /*!
     *  Define linker executable
     */
    override readonly config xdc.bld.ITarget2.Command lnk = {
        cmd: "lnk2000",
        opts: ""
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
     *  Compiler options
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
     *  ======== lnkOpts ========
     *  Linker options
     *
     *  Options:
     *  @p(dlist)
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
        suffix: "-c -m $(XDCCFGDIR)/$@.map -l $(rootDir)/lib/rts2800.lib"
    };
        
    /*  Include search path  */
    override config string includeOpts = "-I$(rootDir)/include";

    final override readonly config string sectMap[string] = [
        [".text", "code"],
        [".switch", "code"],
        [".data", "data"],
        [".cinit", "code"],
        [".bss", "data"],
        [".ebss", "data"],
        [".econst", "code"],
        [".const", "code"],
        [".stack", "stack"],
        [".sysmem", "data"],
        [".esysmem", "data"],
        [".pinit", "code"],
        [".args", "data"],
        [".cio", "data"],
    ];

    override readonly config xdc.bld.ITarget.StdTypes stdTypes = {
        t_IArg          : { size: 2, align: 2 },
        t_Char          : { size: 1, align: 1 },
        t_Double        : { size: 2, align: 2 },
        t_Float         : { size: 2, align: 2 },
        t_Fxn           : { size: 2, align: 1 }, /* near */
        t_Int           : { size: 1, align: 1 },
        t_Int8          : { size: 1, align: 1 },
        t_Int16         : { size: 1, align: 1 },
        t_Int32         : { size: 2, align: 2 },
        t_Int64         : { size: 4, align: 2 },
        t_Long          : { size: 2, align: 2 },
        t_LDouble       : { size: 2, align: 2 },
        t_LLong         : { size: 4, align: 2 },
        t_Ptr           : { size: 1, align: 1 },
        t_Short         : { size: 1, align: 1 },
        t_Size          : { size: 2, align: 2 },
    };

    override readonly config Int bitsPerChar = 16;
}
/*
 *  @(#) ti.targets; 1, 0, 3,606; 11-4-2012 21:21:23; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

