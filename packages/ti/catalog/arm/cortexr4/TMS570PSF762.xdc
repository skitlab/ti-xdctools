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
 *  ======== TMS570PSF762.xdc ========
 *
 */

/*!
 *  ======== TMS570PSF762 ========
 *  The C470 device data sheet module.
 *
 *  This module implements the xdc.platform.ICpuDataSheet interface and is 
 *  used by platforms to obtain "data sheet" information about this device.
 *
 *  Warning: The data for this module comes from the linker command file 
 *  shipped with the TI 470 tools and does NOT come from any published data
 *  sheet.
 */
metaonly module TMS570PSF762 inherits ti.catalog.ICpuDataSheet
{

instance:
    override config string cpuCore           = "R4";
    override config string isa               = "v7R";
    override config string cpuCoreRevision   = "1.0";
    override config int    minProgUnitSize   = 1;
    override config int    minDataUnitSize   = 1;
    override config int    dataWordSize      = 4;

    /*!
     *  ======== memMap ========
     *  The default memory map for this device
     */
    config xdc.platform.IPlatform.Memory memMap[string]  = [
        ["LO_FLASH", {
            name:       "FLASH",
            base:       0x00000000,
            len:        0x00080000,
            space:      "code",
            access:     "RX"
        }],
        ["HI_IRAM", {
            name:       "IRAM",
            base:       0x08000000,
            len:        0x0000A000,
            space:      "code/data",
            access:     "RWX"
        }],
        ["HI_FLASH", {
            name:       "FLASH",
            base:       0x20000000,
            len:        0x00080000,
            space:      "code",
            access:     "RX"
        }],
        ["LO_IRAM", {
            name:       "IRAM",
            base:       0x00000000,
            len:        0x0000A000,
            space:      "code/data",
            access:     "RWX"
        }],
    ];
};

/*
 *  @(#) ti.catalog.arm.cortexr4; 1, 0, 0,155; 8-17-2012 22:13:16; /db/ztree/library/trees/platform/platform-n27x/src/
 */

