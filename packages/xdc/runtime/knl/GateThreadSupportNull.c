/*
 *  ======== GateThreadSupportNull.c ========
 */

#include <xdc/std.h>

#include "package/internal/GateThreadSupportNull.xdc.h"

/*
 *  ======== GateThreadSupportNull_enter ========
 */
IArg GateThreadSupportNull_enter(GateThreadSupportNull_Handle gate)
{
    return (0);
}

/*
 *  ======== GateThreadSupportNull_leave ========
 */
Void GateThreadSupportNull_leave(GateThreadSupportNull_Handle gate, IArg key)
{
}

/*
 *  ======== GateThreadSupportNull_query ========
 */
Bool GateThreadSupportNull_query(Int qual)
{
    return (TRUE);
}
/*
 *  @(#) xdc.runtime.knl; 1, 0, 0,204; 11-3-2012 15:19:13; /db/ztree/library/trees/xdc/xdc-y44x/src/packages/
 */

