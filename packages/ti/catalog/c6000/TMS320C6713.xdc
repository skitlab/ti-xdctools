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
 *  ======== TMS320C6713.xdc ========
 *
 */
package ti.catalog.c6000;

/*!
 *  ======== TMS320C6713 ========
 *  The C6713 device data sheet module.
 *
 *  This module implements the xdc.platform.ICpuDataSheet interface and is 
 *  used by platforms to obtain "data sheet" information about this device.
 */
metaonly module TMS320C6713 inherits ITMS320C6x1x
{

instance:
    override config string   cpuCore        = "6700";
    override config string   isa = "67";

    override config xdc.platform.IPlatform.Memory memMap[string]  = [
        ["IRAM", {
            name:       "IRAM",
            comment:    "Internal L2 memory",
            base:       0x0,
            len:        0x40000,
            space:      "code/data",
            access:     "RWX"
        }],
    ];
};
/*
 *  @(#) ti.catalog.c6000; 1, 0, 0, 0,399; 8-17-2012 22:13:35; /db/ztree/library/trees/platform/platform-n27x/src/
 */

