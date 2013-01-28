/*
 *  Copyright 2012 by Texas Instruments Incorporated.
 *
 */

/*
 *  ======== run ========
 */
function run(cmdr, args)
{
    /* Check for required command line parameters */
    if (this.productModule == undefined) {
        cmdr.usage();
        return (null);
    }
    
   /* Create an options object to pass to mkpkg when generating the plugins */
    var opts = {};
    for (var p in this) {
        opts[p] = this[p];
    }
    opts.outDir = (opts.outputDir != null) ? 
        opts.outputDir + "/eclipse":
        this.productDir + "/eclipse";
    
    opts.productSchema = xdc.useModule(this.productModule);
    opts.moduleDir = opts.productSchema.$package.$spec.getBaseDir();
    _checkConfigs(opts.productSchema);
    
    /* 
     * Remove leading zeroes from product versions in order
     * to be consistent with eclipse plugin versioning conventions.
     * The user supplied version is shown in the displayed name
     * of the product.
     */
    opts.displayVersion = opts.productSchema.version;
    opts.productSchema.version = 
        opts.productSchema.version.replace(/0([0-9])\./g,"$1\.");
    
    /* Compute macro name used to locate the installation directory for 
     * the product; this named added to eclipse string variables.
     */
    opts.macro = (opts.productSchema.macro.name != undefined) ?
        opts.productSchema.macro :
        {
            name: opts.productSchema.id.replace(/\./g,"\_").toUpperCase()
                      + "_INSTALL_DIR",
            desc: "Installation directory for " + opts.productSchema.name
        };
    
    /* Add product repositories to the front of the package path */
    var curPathArr = xdc.curPath().split(';');
    var xdcPathArr = java.lang.reflect.Array.newInstance(
        java.lang.String, opts.productSchema.repositoryArr.length
            + curPathArr.length);
    var i = 0;
    for each (var r in opts.productSchema.repositoryArr) {
        var rep = new java.io.File(opts.productDir + "/" + r);
        xdcPathArr[i++] =  rep.getAbsolutePath();
    }
    
    for each (var p in curPathArr) {
        xdcPathArr[i++] = p;
    }

    /* Update package path with product repositories */
    xdc.$$private.Env.setPath(xdcPathArr);
    
    /* Search for RTSC platforms */
    opts.platformArr = new Array();        
    if (!opts.suppressSearch) {
        for (var i = 0; i < opts.productSchema.repositoryArr.length; i++) {
            var rep = new java.io.File(opts.productDir + "/"
                + opts.productSchema.repositoryArr[i]);
            if (rep.exists()) {
                var platArr = _searchRtscPlatforms(rep.getAbsolutePath());
                for each(var plat in platArr) {
                    opts.platformArr.push(plat);
                }
            }
            else {
                throw new Error("Repository named in " + this.productModule
                                + ".repositoryArr (" 
                                + rep.getCanonicalPath()
                                + ") does not exist");
            }
        }
    }

    /* Check if product view module exists in the product */
    if (opts.productSchema.productViewModule != undefined) {
        xdc.useModule(opts.productSchema.productViewModule);
    }
    
    /* Generate eclipse plugin (finally) */
    var Main = xdc.module("xdc.tools.mkpkg.Main");
    Main.update = true; /* don't modify files whose content doesn't change */

    /* select the "format" of the plugins */
    var format = opts.generationFormat != null ? opts.generationFormat : "P2";
    Main.mkpkg(
        this.$package.packageBase + "/template" + format,
        opts.outDir,
        opts
    );
        
    print("Generated eclipse extension in folder: " 
              + (new java.io.File(opts.outDir)).getCanonicalPath());
        
    return (null);
}

/*
 *  ======== _getRepositoryMap ========
 */
function _getRepositoryMap(dir) 
{
    var xdcProps = new java.util.Properties(java.lang.System.getProperties());
    xdcProps.setProperty("xdc.path", dir);
    var env = new Packages.xdc.services.global.Env(xdcProps);
    var ses = new Packages.xdc.services.spec.BrowserSession(env);

    return (ses.scanRepositories());
}

/*
 *  ======== _searchRtscPlatforms ========
 */
function _searchRtscPlatforms(dir)
{
    var platformArr = new Array();
    var xdcProps = new java.util.Properties(java.lang.System.getProperties());
    xdcProps.setProperty("xdc.path",environment['xdc.path']);
    
    var env = new Packages.xdc.services.global.Env(xdcProps);
    
    var browserSess = new Packages.xdc.services.spec.BrowserSession(env);

    var pkgArrIter = _getRepositoryMap(dir).keySet().iterator();

    var k = 0;

    while (pkgArrIter.hasNext()) {
        var pkgName = pkgArrIter.next();
        var pkg = browserSess.findPkg(pkgName);
        var unitIter = pkg.getChildren().iterator();
        while (unitIter.hasNext()) {
            var u = unitIter.next();
            if (!u.isInter()) {
                var inheritIter = u.getInherits().iterator();
                while (inheritIter.hasNext()) {
                    var elem = inheritIter.next();
                    if (elem.getQualName().equals("xdc.platform.IPlatform")) {
                        platformArr[k++] = pkgName;
                    }
                }
            }
        }
    }
    
    return (platformArr);
}

/*
 *  ======== _checkConfigs ========
 *  Check that product specification makes sense
 */
function _checkConfigs(productModule) 
{
    /* Product name is required */
    if (productModule.name == undefined) {
        throw new Error("Product Name should be specified in module: "
                         + productModule + ". Set config parameter 'name'"
                         + " of module to the product name; e.g., 'XDCtools'");
    }

    /* Product id is required */
    if (productModule.id == undefined) {
        throw new Error("Product id should be specified in module: "
                        + productModule + ". Set config parameter 'id'"
                        + " of module to a unique product id;"
                        + " e.g., 'org.eclipse.rtsc.xdctools.product'");
    }
    
    /* Product version is required */
    if (productModule.version == undefined) {
        throw new Error("Product id should be specified in module: "
                        + productModule + ". Set config parameter 'version'"
                        + " of module; e.g., '3.16.02.31'");
    }

    /* Check version number format */
    var res = productModule.version.match(/(\d+)\.(\d+)\.(\d+)\.(\S+)/);
    if (res == null) {
        throw new Error("Product version '" + productModule.version
                        + "' specified in module '" + productModule
                        + "' does not match the format"
                        + " 'major.minor.service.qualifier' where"
                        + " 'major', 'minor', 'service' are integers"
                        + " and 'qualifier' is a string");
    }

    /* Repository location is required */
    if (productModule.repositoryArr == undefined) {
        throw new Error("Product repositories should be specified in module: "
                        + productModule 
                        + ". Set config parameter 'repositoryArr'"
                        + " of module to repository location(s)"
                        + " relative to product installation directory");
    }
    
    /* Bundle name is required */
    if (productModule.bundleName == undefined) {
        throw new Error("Product bundle name should be specified in module: "
                        + productModule 
                        + ". Set config parameter 'bundleName'"
                        + " of module to bundle name embedded in the top level"
                        + " folder of the product; e.g., for product folder"
                        + " 'xdctools_3_16_02_31' bundle name is 'xdctools'");
    }
}




/*
 *  @(#) xdc.tools.product.plugingen; 1, 0, 0,73; 10-28-2012 21:41:17; /db/ztree/library/trees/xdctools/xdctools-f16x/src/
 */

