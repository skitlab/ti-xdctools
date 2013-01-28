/*
 *  ======== getAllFiles ========
 */
function getAllFiles(excludeDirs)
{
    if (xdc.om.$name != "rel") {
        throw new Error(
            "Manifest.getAllFiles can only be called from within a release script");
    }

    /* clear current files list */
    this.files = [];

    /* re-populate based on excludeDirs */
    /* rcl is alredy loaded by the release model initialization rcl.js */
    rcl.getFiles(this.files, excludeDirs);
}
/*
 *  @(#) xdc.bld; 1, 0, 2,400; 11-3-2012 15:19:00; /db/ztree/library/trees/xdc/xdc-y44x/src/packages/
 */

