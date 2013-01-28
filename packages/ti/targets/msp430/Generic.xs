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

/*
 *  ======== ITarget.archive ========
 */
function archive(goal)
{
    var result = new xdc.om['xdc.bld.ITarget'].CommandSet;
    result.msg = "ar" + target.suffix + " $@ ...";
    result.cmds = ":";
    return (result);
}

/*
 *  ======== ITarget.asmName ========
 */
function asmName(cname)
{
    return (cname);
}

/*
 *  ======== ITarget.compile ========
 */
function compile(goal) 
{
    var result = new xdc.om['xdc.bld.ITarget'].CommandSet;
    result.msg = "cl" + target.suffix + " $@ ...";
    result.cmds = ":";
    return (result);
}

/*
 *  ======== ITarget.genConstCustom ========
 */
function genConstCustom(names, types)
{
    return ("");
}

/*
 *  ======== ITarget.genVisibleFxns ========
 */
function genVisibleFxns(types, names, args)
{
    return ("");
}

/*
 *  ======== ITarget.genVisibleLibFxns ========
 */
function genVisibleLibFxns(types, names, args)
{
    return ("");
}

/*
 *  ======== ITarget.getVersion ========
 */
function getVersion()
{
    return (this.$name + "{1,0,0");
}

/*
 *  ======== ITarget.link ========
 */
function link(goal)
{
    var result = new xdc.om['xdc.bld.ITarget'].CommandSet;
    result.msg = "lnk" + target.suffix + " $@ ...";
    result.cmds = ":";
    return (result);
}

/*
 *  ======== ITarget.scompile ========
 */
function scompile(goal) 
{
    return (null);
}

/*
 *  ======== ITarget.getISAChain ========
 */
function getISAChain(isa) {
    return ([]);
}

/*
 *  ======== _compile ========
 */
function _compile(target, goal, asm)
{
}
