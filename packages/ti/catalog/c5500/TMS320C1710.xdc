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
 *  ======== TMS320C1710.xdc ========
 *
 */
package ti.catalog.c5500;

/*!
 *  ======== TMS320C1710 ========
 *  The C1710 device data sheet module.
 *
 *  This module implements the xdc.platform.ICpuDataSheet interface and is 
 *  used by platforms to obtain "data sheet" information about this device.
 */
metaonly module TMS320C1710 inherits IOMAP
{
instance:
    override config string   cpuCoreRevision = "1.0";

    /*!
     *  ======== memMap ========
     *  The default memory map for this device
     */
    override config xdc.platform.IPlatform.Memory memMap[string]  = [
        ["DARAM", {
            comment: "8 blocks of 8K bytes",
            name: "DARAM",
            base: 0x000000,
            len:  0x010000,
            space: "code/data",
            access: "RWX"
        }],
    
        ["SARAM", {
            comment: "12 blocks of 8K bytes",
            name: "SARAM",
            base: 0x010000,
            len:  0x018000,
            space: "code/data",
            access: "RWX"
        }],

        ["PDROM", {
            comment: "64K bytes On-Chip ROM",
            name: "PDROM",
            base: 0xff0000,
            len:  0x010000,
            space: "code/data",
            access: "RX"
        }],
    ];
};
/*
 *  @(#) ti.catalog.c5500; 1, 0, 0, 0,397; 8-17-2012 22:13:29; /db/ztree/library/trees/platform/platform-n27x/src/
 */

