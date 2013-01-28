/*
 *  Copyright (c) 2012 by Texas Instruments and others.
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
 *  ======== Platform.xdc ========
 */

package ti.platforms.evm5505ext;

/*!
 *  ======== Platform ========
 *  Platform support for the evm5505 with daugther memory card
 *
 *  This module implements xdc.platform.IPlatform and defines configuration
 *  parameters that correspond to this platform's Cpu's, Board's, etc.
 *
 *  The configuration parameters are initialized in this package's
 *  configuration script (package.xs) and "bound" to the TCOM object
 *  model.  Once they are part of the model, these parameters are
 *  queried by a program's configuration script.
 *
 *  This particular platform has a single Cpu, and therefore, only
 *  declares a single CPU configuration object.  Multi-CPU platforms
 *  would declare multiple Cpu configuration parameters (one per
 *  platform CPU).
 */
metaonly module Platform inherits xdc.platform.IPlatform
{
    readonly config xdc.platform.IPlatform.Board BOARD = { 
        id:             "0",
        boardName:      "evm5505ext",
        boardFamily:    "evm5510",
        boardRevision:  null
    };
    
    readonly config xdc.platform.IExeContext.Cpu CPU = { 
        id:             "0",
        clockRate:      100.0,
        catalogName:    "ti.catalog.c5500",
        deviceName:     "TMS320C5505",
        revision:       "",
    };

instance:

    override readonly config xdc.platform.IPlatform.MemoryMap
        externalMemoryMap = [
            ["NAND",   {name: "NAND", base: 0x800000,   len: 0x600000}],
            ["NOR",    {name: "NOR",  base: 0xe00000,   len: 0x100000}],
            ["SRAM",   {name: "SRAM", base: 0xf00000,   len: 0x100000}]
        ];

    override config string codeMemory = "SARAM";
    
    override config string dataMemory = "DARAM";

    override config string stackMemory = "DARAM";
};
/*
 *  @(#) ti.platforms.evm5505ext; 1, 0, 0,140; 8-17-2012 22:14:23; /db/ztree/library/trees/platform/platform-n27x/src/
 */

