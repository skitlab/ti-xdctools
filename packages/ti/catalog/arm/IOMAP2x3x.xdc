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
 *  ======== IOMAP2x3x.xdc ========
 *
 */

metaonly interface IOMAP2x3x inherits ti.catalog.ICpuDataSheet
{
instance:
    override config string cpuCore           = "v6";
    override config string isa               = "v5T";
    override config string cpuCoreRevision   = "2.1";
    override config int    minProgUnitSize   = 1;
    override config int    minDataUnitSize   = 1;
    override config int    dataWordSize      = 4;

    /*!
     *  ======== memMap ========
     *  The memory map returned be getMemoryMap().
     */
    config xdc.platform.IPlatform.Memory memMap[string]  = [
        ["SRAM", {
            comment:    "On-Chip SRAM",
            name:       "SRAM",
            base:       0x40200000,
            len:        0x0000F800,
            space:      "code/data",
            access:     "RWX"
        }],

    ];
}
/*
 *  @(#) ti.catalog.arm; 1, 0, 1,287; 8-17-2012 22:13:07; /db/ztree/library/trees/platform/platform-n27x/src/
 */

