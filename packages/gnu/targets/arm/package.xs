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
 *  ======== init ========
 *  Initialize this package.
 *
 *  This is called after all modules in this package are defined and
 *  initialized.  It is called before config.bld.
 */
function init()
{
    /* initialize module configuration params that are computed */
    var ma = this.$modules;
    var gnuTargets = xdc.loadPackage('gnu.targets');
    for (var i = 0; i < ma.length; i++) {
        if (ma[i] instanceof gnuTargets.ITarget.Module) {
            var targ = gnuTargets.ITarget.Module(ma[i]);
            var isas = targ.getISAChain(null);

            if (isas.length > 0) {
                /* add target-specific assembly-language extensions */
                for (var idx = 0; idx < isas.length; idx++) {
                    var ext = ".s" + isas[idx];
                    targ.extensions.$putHead(ext,
                        new xdc.om['xdc.bld.ITarget.Extension'](
                            {suf: ext, typ: "asm"}
                        )
                    );
                }
            }
            else {
                print("Warning: ISAChain is empty for target " + targ);
            }

            /* add .s<suffix> to list of recognized extensions */
            var ext = ".s" + targ.suffix;
            targ.extensions.$putHead(ext,new xdc.om['xdc.bld.ITarget.Extension']({
                suf: ext,   typ: "asm"
            }));

        }
    }
}

/*
 *  @(#) gnu.targets.arm; 1, 0, 0, 0,438; 11-4-2012 21:21:10; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

 */

