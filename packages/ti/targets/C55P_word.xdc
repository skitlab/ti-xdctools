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
 *  ======== C55P_word.xdc ========
 *
 */

/*!
 *  ======== C55P_word ========
 *  TI C55P huge data big endian word mode
 */
metaonly module C55P_word inherits ti.targets.ITarget {
    override readonly config string name                = "C55P_word";  
    override readonly config string suffix              = "55Pw";
    override readonly config string isa                 = "55P";        
    override readonly config string rts                 = "ti.targets.rts5500";

    override readonly config xdc.bld.ITarget.Model model = {
        endian: "big",
        dataModel: "huge"
    };

    override readonly config xdc.bld.ITarget2.Command ar = {
        cmd: "ar55",
        opts: "rq"
    };

    /*!
     *  ======== cc ========
     *  Required compiler comamand and options
     *
     *  @p(dlist)
     *      -`--memory_model=huge`
     *          huge model; data pointers are greater than 16-bits
     *      -`-vcore+`
     *          huge model ryujin is only supported on rev 3.5 cores (and
     *          above)
     */
    override readonly config xdc.bld.ITarget2.Command cc = {
        cmd: "cl55 -c",
        opts: "--memory_model=huge -vcore+"
    };

    override readonly config xdc.bld.ITarget2.Command vers = {
        cmd: "cl55",
        opts: "--compiler_revision"
    };

    /*!
     *  ======== asm ========
     *  Required assembler comamand and options
     *
     *  @p(dlist)
     *      -`--memory_model=huge`
     *          huge model; data pointers are greater than 16-bits
     *      -`-vcore+`
     *          huge model ryujin is only supported on rev 3.5 cores (and
     *          above)
     */
    override readonly config xdc.bld.ITarget2.Command asm = {
        cmd: "cl55 -c",
        opts: "--memory_model=huge -vcore+"
    };

    override readonly config xdc.bld.ITarget2.Command lnk = {
        cmd: "lnk55",
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
     *  User configurable compiler options.
     *
     *  Defaults:
     *  @p(dlist)
     *      -`-qq`
     *          super quiet mode
     *      -`-pdsw225`
     *          generate a warning for implicitly declared functions; i.e.,
     *          functions without prototypes
     *      -`-Dfar= `
     *          ignore keyword far; this allows one to write code that can
     *          be compiled in large model and small model without #ifdef's
     */
    override config xdc.bld.ITarget2.Options ccOpts = {
        prefix: "-qq -pdsw225 -Dfar= ",
        suffix: ""
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
        suffix: "-c -m $(XDCCFGDIR)/$@.map -l $(rootDir)/lib/rts55ph.lib"
    };

    override config string includeOpts = "-I$(rootDir)/include";

    final override readonly config string sectMap[string] = [
        [".text",     "code"],
        [".stack",    "stack"],
        [".sysstack", "stack"],
        [".bss",      "data"],
        [".cinit",    "code"],
        [".pinit",    "code"],
        [".cio",      "code"],
        [".args",     "data"],
        [".const",    "data"],
        [".data",     "data"],
        [".switch",   "code"],
        [".sysmem",   "code"],
        [".far",      "data"],
        ["vectors",   "data" ],
    ];

    override readonly config xdc.bld.ITarget.StdTypes stdTypes =
        ti.targets.C55_huge.stdTypes;

    override readonly config Int bitsPerChar =
        ti.targets.C55_huge.bitsPerChar;
};
/*
 *  @(#) ti.targets; 1, 0, 3,606; 11-4-2012 21:21:24; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

