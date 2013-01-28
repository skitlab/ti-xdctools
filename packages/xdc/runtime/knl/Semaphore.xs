/* 
 *  Copyright (c) 2008 Texas Instruments. All rights reserved. 
 *  This program and the accompanying materials are made available under the 
 *  terms of the Eclipse Public License v1.0 and Eclipse Distribution License
 *  v. 1.0 which accompanies this distribution. The Eclipse Public License is
 *  available at http://www.eclipse.org/legal/epl-v10.html and the Eclipse
 *  Distribution License is available at 
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *
 *  Contributors:
 *      Texas Instruments - initial implementation
 * */
 
/*
 *  ======== Semaphore.xs ========
 */

/*
 *  ======== module$use ========
 */
function module$use()
{
    var Semaphore = this;

    if ((Semaphore.Proxy == undefined) || (Semaphore.Proxy == null)) {
        Semaphore.Proxy = xdc.module("xdc.runtime.knl.SemThread");
    }

    /* 
     * If cfg file has not set abstractInstances$ for Semaphore.Proxy
     * then set it to true by default.
     */
    if (Semaphore.Proxy.$written("abstractInstances$") == false) {
        Semaphore.Proxy.abstractInstances$ = true;
    }
}
/*
 *  @(#) xdc.runtime.knl; 1, 0, 0,204; 11-3-2012 15:19:14; /db/ztree/library/trees/xdc/xdc-y44x/src/packages/
 */

