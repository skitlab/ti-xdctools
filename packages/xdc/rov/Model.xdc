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
/*!
 *  ======== Model ========
 *  The ROV Model is the core of ROV. The Model must be started in order to
 *  retrieve ROV views for any modules.
 *
 *  The Model has a compatibility key. Any changes or additions to the public
 *  interfaces of the ROV core will result in a bump of the model version 
 *  number.
 */
metaonly module Model {

    /*!
     *  ======== vers ========
     *  Model.start will throw an exception if the version parameter does not
     *  equal the Model's current version. The version number is changed based
     *  on modifications to the public APIs (in xdc.rov.Program) that would
     *  potentially break compatibility with clients.
     *  This allows the Model to verify compatibility with it's client. 
     */
    metaonly config Int vers = 4;
    
    /*!
     *  ======== start ========
     *  Starts the ROV Model.
     *
     *  The ROV Model requires instances of an ISymbolTable, an IMemoryImage, 
     *  and an ICallBack. It also requires the ROV recap file, which can be
     *  located using the xdc.rov.Recap module.
     *
     *  @param(vers) 
     *  Model.start will throw an exception if the version parameter does not
     *  equal the Model's current version. 
     *
     *  @param(recap) Capsule of the ROV recap file. Retrieve this with
     *  xdc.loadCapsule(recapFilePath)
     */
    Void start(Int vers, String executable, Any recap, 
               ISymbolTable.Instance sym, Any mem, 
               ICallBack.Instance callBack);

    /*!
     *  ======== getISymbolTableInst ========
     */
    ISymbolTable.Instance getISymbolTableInst();

    /*!
     *  ======== getMemoryImageInst ========
     */
    function getMemoryImageInst();
    
    /*!
     *  ======== getICallBackInst ========
     */
    ICallBack.Instance getICallBackInst();
    
    /*!
     *  ======== getIOFReaderInst ========
     */
    function getIOFReaderInst();

    /*!
     *  ======== getModuleList ========
     *
     */
    Any getModuleList();
}
/*
 *  @(#) xdc.rov; 1, 0, 0,395; 11-3-2012 15:19:10; /db/ztree/library/trees/xdc/xdc-y44x/src/packages/
 */

