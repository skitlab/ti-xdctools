/* --COPYRIGHT--,EPL
 *  Copyright (c) 2008 Texas Instruments and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Texas Instruments - initial implementation
 * 
 * --/COPYRIGHT--*/
/*!
 *  ======== IREF ========
 *  MSP430 REF Interface
 */
metaonly interface IREF inherits xdc.platform.IPeripheral {

    /*!
    *  ======== ForceSetDefaultRegister_t ========
    *  Force Set Default Register
    *
    *  Type to store if each register needs to be forced initialized
    *  even if the register is in default state.
    *
    *  @see #ForceSetDefaultRegister_t
    */
    struct ForceSetDefaultRegister_t {
        String     register;
        Bool       regForceSet;
    }
}
