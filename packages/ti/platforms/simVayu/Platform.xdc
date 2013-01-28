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
 *  Platform support for simVayu
 *
 */

/*!
 *  ======== Platform ========
 *  Platform support for simVayu
 *
 *  This module implements xdc.platform.IPlatform and defines configuration
 *  parameters that correspond to this platform's Cpu's, Board's, etc.
 *
 *  The configuration parameters are initialized in this package's
 *  configuration script (package.cfg) and "bound" to the TCOM object
 *  model.  Once they are part of the model, these parameters are
 *  queried by a program's configuration script.
 *
 *  This particular platform has 4 EVE's, 2 M4's, and 2 C66x DSP's.
 */
metaonly module Platform inherits xdc.platform.IPlatform
{
    readonly config xdc.platform.IPlatform.Board BOARD = {      
        id:                 "0",
        boardName:      "simVayu",
        boardFamily:    "simVayu",
        boardRevision:  null,
    };

    readonly config xdc.platform.IExeContext.Cpu DSP = {        
        id:                 "0",
        clockRate:      1000,
        catalogName:    "ti.catalog.c6000",
        deviceName:     "Vayu",
        revision:       "1.0",
    };

    /* Benelli M4 Subsystem */
    readonly config xdc.platform.IExeContext.Cpu M4 = {
        id:             "1",
        clockRate:      266.0,
        catalogName:    "ti.catalog.arm.cortexm4",
        deviceName:     "Vayu",
        revision:       "1.0",
    };
    
    /* EVE */
    readonly config xdc.platform.IExeContext.Cpu EVE = {
        id:             "2",
        clockRate:      200.0, 
        catalogName:    "ti.catalog.arp32",
        deviceName:     "Vayu",
        revision:       "1.0"
    };

    /* GPP */
    readonly config xdc.platform.IExeContext.Cpu GPP = {
        id:             "3",
        clockRate:      800.0,  /* Typically set by the HLOS */
        catalogName:    "ti.catalog.arm.cortexa15",
        deviceName:     "Vayu",
        revision:       "1.0"
    };

instance:

    /*!
     *  ======== externalMemoryMap ========
     *  Memory regions as defined in the Vayu Simulator Specification
     */

    override readonly config xdc.platform.IPlatform.Memory
        externalMemoryMap[string] = [
            ["EXT_RAM_EVE_VECS", {
                comment: "External RAM Memory reserved for use by EVE .vecs",
                name: "EXT_RAM_EVE_VECS",
                base: 0x80000000,
                len:  0x00000100    /* Reserve first 0x100 for .vecs */
            }],
            ["EXT_RAM_EVE", {
                comment: "External RAM Memory reserved for use by the EVE",
                name: "EXT_RAM_EVE",
                base: 0x80000100,
                len:  0x07ffff00    /* ~128 MB */
            }],
            ["EXT_RAM_DSP", {
                comment: "External RAM Memory reserved for use by the C66x",
                name: "EXT_RAM_DSP",
                base: 0x88000000,
                len:  0x02000000    /* 32 MB */
            }],
            ["EXT_RAM_M4", {
                comment: "External RAM Memory reserved for use by the M4 core",
                name: "EXT_RAM_M4",
                base: 0x8A000000,
                len:  0x20000000    /* 512 MB */
            }],
            ["EXT_RAM_A15", {
                comment: "External RAM Memory reserved for use by the A15 core",
                name: "EXT_RAM_A15",
                base: 0xC0000000,
                len:  0x20000000    /* 512 MB */
            }]
        ];

    /*
     *  ======== l1PMode ========
     *  Define the amount of L1P RAM used for L1 Program Cache.
     *
     *  Check the device documentation for valid values.
     */
    config String l1PMode = "32k";
    
    /*
     *  ======== l1DMode ========
     *  Define the amount of L1D RAM used for L1 Data Cache.
     *
     *  Check the device documentation for valid values.
     */
    config String l1DMode = "32k";
    
    /*
     *  ======== l2Mode ========
     *  Define the amount of L2 RAM used for L2 Cache.
     *
     *  Check the device documentation for valid values.
     */
    config String l2Mode = "0k";
};
/*
 *  @(#) ti.platforms.simVayu; 1, 0, 0, 0,10; 8-17-2012 22:18:10; /db/ztree/library/trees/platform/platform-n27x/src/
 */

