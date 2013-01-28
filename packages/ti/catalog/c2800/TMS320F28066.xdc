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
 *  ======== TMS320F28066.xdc ========
 */
package ti.catalog.c2800;

/*!
 *  ======== ITMS320F28066 ========
 *  The F28066 device data sheet module.
 *
 *  This module implements the xdc.platform.ICpuDataSheet interface and is used
 *  by platforms to obtain "data sheet" information about this device.
 */
metaonly module TMS320F28066 inherits ITMS320C283xx
{
instance:
    override config string   cpuCoreRevision = "1.0";

    /*!
     *  ======== memMap ========
     *  The default memory map for this device
     */
    config xdc.platform.IPlatform.Memory memMap[string]  = [
        ["MSARAM", {
            comment: "On-Chip RAM Memory",
            name: "MSARAM",
            base: 0x0,
            len:  0x800,
            page: 0,
            space: "code/data"
        }],
    
        ["PIEVECT", {
            comment: "On-Chip PIEVECT RAM Memory",
            name:    "PIEVECT",
            base:    0xD00,
            len:     0x100,
            page: 1,
            space:   "data"
        }],
    
        ["L03DPSARAM", {
            comment: "L0-L3 DPSARAM (8K x 16)",
            name: "L03DPSARAM",
            base: 0x8000,
            len:  0x2000,
            page: 0,
            space: "code/data"
        }],

        ["L4SARAM", {
            comment: "L4 SARAM (8K x 16)",
            name: "L4SARAM",
            base: 0xA000,
            len:  0x2000,
            page: 0,
            space: "code/data"
        }],

        ["L56DPSARAM", {
            comment: "L5-L6 DPSARAM (16K x 16)",
            name: "L56DPSARAM",
            base: 0xC000,
            len:  0x4000,
            page: 0,
            space: "code/data"
        }],

        ["OTP", {
            comment: "1K X 16 OTP memory",
            name: "OTP",
            base: 0x3D7800,
            len:  0x0003FA,
            page: 0,
            space: "code"
        }],
    
        ["FLASH", {
            comment: "128K X 16 Flash memory",
            name: "FLASH",
            base: 0x3D8000,
            len:  0x01FF80,
            page: 0,
            space: "code"
        }],

        ["BEGIN", {
            comment: "FLASH boot entry point",
            name: "BEGIN",
            base: 0x3f7ff6,
            len:  0x000002,
            page: 0,
            space: "code"
        }],
    
        ["BOOTROM", {
            comment: "On-Chip Boot ROM",
            name: "BOOTROM",
            base: 0x3F8000,
            len:  0x007FC0, 
            page: 0,
            space: "code"
        }],
    ];
}
/*
 *  @(#) ti.catalog.c2800; 1, 0, 0, 0,401; 8-17-2012 22:13:26; /db/ztree/library/trees/platform/platform-n27x/src/
 */

