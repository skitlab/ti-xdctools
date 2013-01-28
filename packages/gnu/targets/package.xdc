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
requires xdc.bld;

/*!
 *  ======== gnu.targets ========
 *  Package of targets that wrap GNU gcc code generation tools.
 *  The targets MVArm9 and UCArm9 are deprecated, and the targets from
 *  {@link gnu.targets.arm} should be used instead.
 */
package gnu.targets [1,0,1] {
    module Sparc, Linux86, Mingw;
    module MVArm9, UCArm9;
    interface ITarget;
}
/*
 *  @(#) gnu.targets; 1, 0, 1,609; 11-4-2012 21:21:10; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

