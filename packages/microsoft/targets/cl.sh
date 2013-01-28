#
#  Copyright 2012 by Texas Instruments Incorporated.
#  
#

#!/bin/sh
#
unset INCLUDE
unset LIB
unset CL

dir=${1%/*}
cmdbin=/cygdrive/${dir%%:*}${dir#?:}
export PATH=$cmdbin:$cmdbin/../../common/msdev98/bin

"$@"
#
#  @(#) microsoft.targets; 1, 0, 2, 0,609; 11-4-2012 21:21:19; /db/ztree/library/trees/xdctargets/xdctargets-f40x/src/ xlibrary

#

