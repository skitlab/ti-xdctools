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
 *  ======== Ducati.xs ========
 *
 */

/*
 *  ======== Ducati.getMemoryMap ========
 *  Returns the memory map as seen by a program running on this device
 *  when the registers are set as specified by the regs hash.
 */
function getMemoryMap(regs)
{
    return (this.memMap);
}

/*
 *  ======== module$validate ========
 */
function module$validate() 
{
    this.$logWarning("This catalog module is deprecated.  A module " +
        "from the package ti.catalog.arm.cortexm3 should be used instead.", 
        this);
}
/*
 *  @(#) ti.catalog.arm.nda; 1, 0, 0, 0,154; 8-17-2012 22:13:18; /db/ztree/library/trees/platform/platform-n27x/src/
 */

