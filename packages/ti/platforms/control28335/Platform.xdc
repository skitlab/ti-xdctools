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
 *  This module implements xdc.IPlatform and defines configuration
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
 *
 */

package ti.platforms.control28335;

metaonly module Platform inherits xdc.platform.IPlatform
{
    readonly config xdc.platform.IPlatform.Board BOARD = {
        id:             "0",
        boardName:      "control28335",
        boardFamily:    "control28335",
        boardRevision:  null
    };

    readonly config xdc.platform.IExeContext.Cpu CPU = {
        id:             "0",
        clockRate:      150.0,
        catalogName:    "ti.catalog.c2800",
        deviceName:     "TMS320C28335",
        revision:       null
    };
    
instance:

    override config string codeMemory = "L47SARAM";
    
    override config string dataMemory = "L03SARAM";

    override config string stackMemory = "L03SARAM";
};
/*
 *  @(#) ti.platforms.control28335; 1, 0, 0,184; 8-17-2012 22:13:49; /db/ztree/library/trees/platform/platform-n27x/src/
 */

