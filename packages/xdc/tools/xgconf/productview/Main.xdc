package xdc.tools.xgconf.productview;

/*
 * @_nodoc
 */
metaonly module Main inherits xdc.tools.ICmd {

    override config String usage[] = [
        'xs xdc.tools.xgconf.productview [options] <productview module0> .. <productview moduleN>'
    ];

instance:

    @CommandOption("packagePath")
    config String packagePath = null;

    @CommandOption("platform,p")
    config String platform = null;

    @CommandOption("target,t")
    config String target = null;

}
