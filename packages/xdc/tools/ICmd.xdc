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
 *  ======== ICmd ========
 *  Generic xdc-script (xs) command
 *
 *  Modules that implement this interface can serve as "commands" that
 *  can be executed from the command line (via `xs`) or from within
 *  XDCscript scripts (without having to fork a separate process to run
 *  `xs`).
 *
 *  @a(Command Line Example)
 *  The following example runs the `xdc.tools.path` tool from the command 
 *  line to get an array of names of all packages below the current
 *  working directory (".").
 *  @p(code)
 *      xs xdc.tools.path -n -a -PR .
 *  @p
 *  
 *  @a(XDCscript Example)
 *  The following example runs the `xdc.tools.path` tool from within
 *  a script to get an array of names of all packages below the current
 *  working directory (".").
 *  @p(code)
 *      var Main = xdc.module('xdc.tools.path.Main');
 *      var result = Main.exec(["-n", "-a", "-PR", "."]);
 *  @p
 */
metaonly interface ICmd {

    //! Usage for this command
    config String usage[] = [];

    //! `xs` shell entry point
    final function main(args);

    //! `xs` script entry point
    final function exec(args);

instance:

    //! Underlying implementation
    Any run(Cmdr.Instance cmdr, String args[]);
}
/*
 *  @(#) xdc.tools; 1, 0, 0, 0,406; 11-3-2012 15:19:30; /db/ztree/library/trees/xdc/xdc-y44x/src/packages/
 */

