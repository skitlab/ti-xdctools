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

requires ti.catalog.arm;
requires xdc.platform [1,0,1];

/*!
 *  ======== ti.platforms.evmDM365 ========
 *  Platform package for the evmDM365 platform.
 *
 *  This package implements the interfaces (xdc.platform.IPlatform) necessary
 *  to build and run executables on the evmDM365 platform.
 *
 *  @a(Throws)
 *  `XDCException` exceptions are thrown for fatal errors. The following error
 *  codes are reported in the exception message:
 *  @p(dlist)                            
 *      -  `ti.platfoms.evmDM365.LINK_TEMPLATE_ERROR`
 *           This error is raised when this platform cannot found the default
 *           linker command template `linkcmd.xdt` in the build target's
 *           package. When a target does not contain this file, the config
 *           parameter `{@link xdc.cfg.Program#linkTemplate}` must be set.
 *  @p
 */
package ti.platforms.evmDM365 [1,0,0] {
    module Platform;
}
/*
 *  @(#) ti.platforms.evmDM365; 1, 0, 0,226; 8-17-2012 22:15:16; /db/ztree/library/trees/platform/platform-n27x/src/
 */

