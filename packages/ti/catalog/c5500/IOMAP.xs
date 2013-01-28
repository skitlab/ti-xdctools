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
 *  ======== IOMAP.getMemoryMap ========
 *  Returns the memory map as seen by a program running on this device
 *  when the registers are set as specified by the regs hash.
 */
function getMemoryMap(regs)
{
    /* If st3_55 register is null return memory map with MPNMC = 1 */
    if (regs == null || !("st3_55" in regs) || regs.st3_55 == null
        || regs.st3_55 & 0x0040) {      /* We only care about the MPNMC bit */ 
        delete this.memMap["PDROM"];
    }

    return (this.memMap);
}
/*
 *  @(#) ti.catalog.c5500; 1, 0, 0, 0,397; 8-17-2012 22:13:29; /db/ztree/library/trees/platform/platform-n27x/src/
 */

