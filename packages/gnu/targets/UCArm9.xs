/* 
 *  Copyright (c) 2008 Texas Instruments and others.
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
 *  ======== UCArm9.getISAChain ========
 *  UCArm9 implementation for ITarget.getISAChain()
 */
function getISAChain (isa)
{
    return (this.$package.MVArm9.getISAChain(isa));
}

/*
 *  ======== UCArm9.getVersion ========
 */
function getVersion()
{
    if (this.$private.vers != true) {
        print("Warning: gnu.targets.UCArm9 target is deprecated. Please use\n"
            + "gnu.targets.arm.UCArm9 target instead. See the documentation "
            + "for gnu.targets.arm\nand gnu.targets packages for more "
            + "information.");
    }
    return this.$super.getVersion();
}
/*
 *  @(#) gnu.targets; 1, 0, 1,609; 11-4-2012 21:21:10; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

