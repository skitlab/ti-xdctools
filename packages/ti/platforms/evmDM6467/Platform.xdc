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
 *
 */

/*!
 *  ======== Platform ========
 *  Platform support for the evmDM6467
 *
 *  This module implements xdc.platform.IPlatform and defines configuration
 *  parameters that correspond to this platform's Cpu's, Board's, etc.
 *
 *  The configuration parameters are initialized in this package's
 *  configuration script (package.cfg) and "bound" to the TCOM object
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
    enum RuntimeEnv {
        STDIO,
        POSIX,
        BIOS
    };
    
    readonly config xdc.platform.IPlatform.Board BOARD = {      
        id:             "0",
        boardName:      "evmDM6467",
        boardFamily:    "evmDM6467",
        boardRevision:  null,
    };
        
    readonly config xdc.platform.IExeContext.Cpu DSP = {        
        id:             "0",
        clockRate:      594.0,
        catalogName:    "ti.catalog.c6000",
        deviceName:     "TMS320CDM6467",
        revision:       "1.0",
    };
    
    readonly config xdc.platform.IExeContext.Cpu GPP = {
        id:             "1",
        clockRate:      297.0,
        catalogName:    "ti.catalog.arm",
        deviceName:     "TMS320CDM6467",
        revision:       "1.0",
    };

instance:

    /*
     *  ======== memTab ========
     *  Define the evmDaVinci memory map
     */
    override readonly config xdc.platform.IPlatform.Memory
        externalMemoryMap[string] = [
            ["DDR2", {name: "DDR2", base: 0x80000000, len: 0x10000000}],
        ];

    /* default segment for data sections */
    override config string dataMemory = "DDR2";

    /* default segment for stack sections */
    override config string stackMemory = "DDR2";

    /*!
     *  ======== runTime ========
     *  The runtime environment available to executables
     */
    config RuntimeEnv runTime = STDIO;

    /*!
     *  ======== singleCore ========
     *  no longer used!
     * @_nodoc
     */
    config Bool singleCore = true;

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
}
/*
 *  @(#) ti.platforms.evmDM6467; 1, 0, 0, 0,333; 8-17-2012 22:15:27; /db/ztree/library/trees/platform/platform-n27x/src/
 */

