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

package ti.platforms.dsk6713;

/*!
 *  ======== Platform ========
 *  Platform support for the dsk6713
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
    /*!
     *  ======== BOARD ========
     *  Board-level properties of this particular platform.
     */
    readonly config xdc.platform.IPlatform.Board BOARD = {
        id:             "0",
        boardName:      "dsk6713",
        boardFamily:    "dsk6713",
        boardRevision:  null
    };

    /*!
     *  ======== CPU ========
     *  The device on this platform
     */
    readonly config xdc.platform.IExeContext.Cpu CPU = {
        id:             "0",
        clockRate:      225.0,
        catalogName:    "ti.catalog.c6000",
        deviceName:     "TMS320C6713",
        revision:       "",
    };

instance:
    
    /*!
     *  ======== externalMemoryMap ========
     *  Default mapping of memory names to memory objects.
     */
    override readonly config xdc.platform.IPlatform.Memory
        externalMemoryMap[string] = [
            ["SDRAM", {
                comment:
                    "This object defines 8MB for the DSP's off-chip memory",
                name: "SDRAM",
                base: 0x80000000,
                len:  0x00800000,
                space: "code/data"
             }]
        ];

    /*!
     *  ======== ftpath ========
     *  Installation directory of the Foundational Tools Suite
     *
     *  The underlying simulation engine used to run executables produced
     *  using this platform is part of the Target Server / Foundational Tools
     *  product (http://www.hou.asp.ti.com/asp/sds/eft/projects/Foundation_Tools/Releases/index.html).
     */
    readonly config String ftpath;

    override config string codeMemory = "IRAM";
    
    override config string dataMemory = "SDRAM";

    override config string stackMemory = "SDRAM";

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
 *  @(#) ti.platforms.dsk6713; 1, 0, 0,374; 8-17-2012 22:14:12; /db/ztree/library/trees/platform/platform-n27x/src/
 */

