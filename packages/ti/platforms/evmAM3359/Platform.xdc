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
 *  Platform support for evmAM3359
 *
 */

package ti.platforms.evmAM3359;

/*!
 *  ======== Platform ========
 *  Platform support for the evmAM3359
 *
 *  This module implements xdc.platform.IPlatform and defines configuration
 *  parameters that correspond to this platform's Cpu's, Board's, etc.
 *
 *  The configuration parameters are initialized in this package's
 *  configuration script (package.cfg) and "bound" to the TCOM object
 *  model.  Once they are part of the model, these parameters are
 *  queried by a program's configuration script.
 *
 */
metaonly module Platform inherits xdc.platform.IPlatform
{
    readonly config xdc.platform.IPlatform.Board BOARD = {
        id:             "0",
        boardName:      "evmAM3359",
        boardFamily:    "evmAM3359",
        boardRevision:  null
    };

    /* GPP */
    readonly config xdc.platform.IExeContext.Cpu GPP = {
        id:             "2",
        clockRate:      550.0,  /* Typically set by the HLOS */
        catalogName:    "ti.catalog.arm.cortexa8",
        deviceName:     "AM3359",
        revision:       "1.0"
    };

instance:

    override readonly config xdc.platform.IPlatform.Memory
        externalMemoryMap[string] = [
            ["DDR3", {
                comment: "DDR3 Memory",
                name: "DDR3",
                base: 0x80000000,
                len:  0x04000000    /* 64 MB */
            }],
        ];
};
/*
 *  @(#) ti.platforms.evmAM3359; 1, 0, 0,31; 8-17-2012 22:14:56; /db/ztree/library/trees/platform/platform-n27x/src/
 */

