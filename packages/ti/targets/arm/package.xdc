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
 * 
 */
/*
 *  ======== package.xdc ========
 *
 */

requires xdc.bld;
requires ti.targets;

/*!
 *  ======== ti.targets.arm ========
 *  Package of Arm targets for TI code generation tools
 *
 */
package ti.targets.arm [2,0,1,0] {
    interface IArm;
    module Arm7, Arm7_big_endian, Arm9, Arm9t;
    module Arm11, Arm11_big_endian;
    interface IM3, IM3_big_endian;
    module M3, M3_big_endian;
    interface IR4, IR4_big_endian;
    module R4, R4_big_endian;
    module R4t, R4t_big_endian;
}
/*
 *  @(#) ti.targets.arm; 2, 0, 1, 0,423; 11-4-2012 21:21:27; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

