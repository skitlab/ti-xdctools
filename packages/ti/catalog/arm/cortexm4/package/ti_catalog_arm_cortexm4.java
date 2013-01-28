/*
 *  Do not modify this file; it is automatically 
 *  generated and any modifications will be overwritten.
 *
 * @(#) xdc-y32
 */
import java.util.*;
import org.mozilla.javascript.*;
import xdc.services.intern.xsr.*;
import xdc.services.spec.Session;

public class ti_catalog_arm_cortexm4
{
    static final String VERS = "@(#) xdc-y32\n";

    static final Proto.Elm $$T_Bool = Proto.Elm.newBool();
    static final Proto.Elm $$T_Num = Proto.Elm.newNum();
    static final Proto.Elm $$T_Str = Proto.Elm.newStr();
    static final Proto.Elm $$T_Obj = Proto.Elm.newObj();

    static final Proto.Fxn $$T_Met = new Proto.Fxn(null, null, 0, -1, false);
    static final Proto.Map $$T_Map = new Proto.Map($$T_Obj);
    static final Proto.Arr $$T_Vec = new Proto.Arr($$T_Obj);

    static final XScriptO $$DEFAULT = Value.DEFAULT;
    static final Object $$UNDEF = Undefined.instance;

    static final Proto.Obj $$Package = (Proto.Obj)Global.get("$$Package");
    static final Proto.Obj $$Module = (Proto.Obj)Global.get("$$Module");
    static final Proto.Obj $$Instance = (Proto.Obj)Global.get("$$Instance");
    static final Proto.Obj $$Params = (Proto.Obj)Global.get("$$Params");

    static final Object $$objFldGet = Global.get("$$objFldGet");
    static final Object $$objFldSet = Global.get("$$objFldSet");
    static final Object $$proxyGet = Global.get("$$proxyGet");
    static final Object $$proxySet = Global.get("$$proxySet");
    static final Object $$delegGet = Global.get("$$delegGet");
    static final Object $$delegSet = Global.get("$$delegSet");

    Scriptable xdcO;
    Session ses;
    Value.Obj om;

    boolean isROV;
    boolean isCFG;

    Proto.Obj pkgP;
    Value.Obj pkgV;

    ArrayList<Object> imports = new ArrayList<Object>();
    ArrayList<Object> loggables = new ArrayList<Object>();
    ArrayList<Object> mcfgs = new ArrayList<Object>();
    ArrayList<Object> icfgs = new ArrayList<Object>();
    ArrayList<String> inherits = new ArrayList<String>();
    ArrayList<Object> proxies = new ArrayList<Object>();
    ArrayList<Object> sizes = new ArrayList<Object>();
    ArrayList<Object> tdefs = new ArrayList<Object>();

    void $$IMPORTS()
    {
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
        Global.callFxn("loadPackage", xdcO, "ti.catalog");
        Global.callFxn("loadPackage", xdcO, "xdc.platform");
        Global.callFxn("loadPackage", xdcO, "ti.catalog.peripherals.hdvicp2");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("ti.catalog.arm.cortexm4", new Value.Obj("ti.catalog.arm.cortexm4", pkgP));
    }

    void Stellaris$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.Stellaris.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexm4.Stellaris", new Value.Obj("ti.catalog.arm.cortexm4.Stellaris", po));
        pkgV.bind("Stellaris", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexm4.Stellaris.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.Stellaris$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexm4.Stellaris.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.Stellaris$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexm4.Stellaris.Params", new Proto.Str(po, true));
    }

    void OMAP5430$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.OMAP5430.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexm4.OMAP5430", new Value.Obj("ti.catalog.arm.cortexm4.OMAP5430", po));
        pkgV.bind("OMAP5430", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexm4.OMAP5430.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.OMAP5430$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexm4.OMAP5430.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.OMAP5430$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexm4.OMAP5430.Params", new Proto.Str(po, true));
    }

    void Vayu$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.Vayu.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.catalog.arm.cortexm4.Vayu", new Value.Obj("ti.catalog.arm.cortexm4.Vayu", po));
        pkgV.bind("Vayu", vo);
        // decls 
        // insts 
        Object insP = om.bind("ti.catalog.arm.cortexm4.Vayu.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.Vayu$$Object", new Proto.Obj());
        Object objP = om.bind("ti.catalog.arm.cortexm4.Vayu.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("ti.catalog.arm.cortexm4.Vayu$$Params", new Proto.Obj());
        om.bind("ti.catalog.arm.cortexm4.Vayu.Params", new Proto.Str(po, true));
    }

    void Stellaris$$CONSTS()
    {
        // module Stellaris
    }

    void OMAP5430$$CONSTS()
    {
        // module OMAP5430
    }

    void Vayu$$CONSTS()
    {
        // module Vayu
    }

    void Stellaris$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexm4.Stellaris$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Module", "ti.catalog.arm.cortexm4"), om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Instance", "ti.catalog.arm.cortexm4"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Params", "ti.catalog.arm.cortexm4"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexm4$Stellaris$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexm4.Stellaris'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexm4.Stellaris.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexm4']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {revision:revision});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.cpuCore = __mod.PARAMS.cpuCore;\n");
            sb.append("__inst.cpuCoreRevision = __mod.PARAMS.cpuCoreRevision;\n");
            sb.append("__inst.minProgUnitSize = __mod.PARAMS.minProgUnitSize;\n");
            sb.append("__inst.minDataUnitSize = __mod.PARAMS.minDataUnitSize;\n");
            sb.append("__inst.dataWordSize = __mod.PARAMS.dataWordSize;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("__inst.deviceHeader = __mod.PARAMS.deviceHeader;\n");
            sb.append("__inst.isa = __mod.PARAMS.isa;\n");
            sb.append("for (var __p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexm4.Stellaris$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Module", "ti.catalog.arm.cortexm4"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexm4.Stellaris$$Object", "ti.catalog.arm.cortexm4"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Params", "ti.catalog.arm.cortexm4"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexm4$Stellaris$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexm4.Stellaris'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {revision:revision});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.cpuCore = __mod.PARAMS.cpuCore;\n");
            sb.append("__inst.cpuCoreRevision = __mod.PARAMS.cpuCoreRevision;\n");
            sb.append("__inst.minProgUnitSize = __mod.PARAMS.minProgUnitSize;\n");
            sb.append("__inst.minDataUnitSize = __mod.PARAMS.minDataUnitSize;\n");
            sb.append("__inst.dataWordSize = __mod.PARAMS.dataWordSize;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("__inst.deviceHeader = __mod.PARAMS.deviceHeader;\n");
            sb.append("__inst.isa = __mod.PARAMS.isa;\n");
            sb.append("for (var __p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void OMAP5430$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexm4.OMAP5430$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Module", "ti.catalog.arm.cortexm4"), om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Instance", "ti.catalog.arm.cortexm4"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Params", "ti.catalog.arm.cortexm4"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexm4$OMAP5430$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexm4.OMAP5430'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexm4.OMAP5430.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexm4']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {revision:revision});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.cpuCore = __mod.PARAMS.cpuCore;\n");
            sb.append("__inst.cpuCoreRevision = __mod.PARAMS.cpuCoreRevision;\n");
            sb.append("__inst.minProgUnitSize = __mod.PARAMS.minProgUnitSize;\n");
            sb.append("__inst.minDataUnitSize = __mod.PARAMS.minDataUnitSize;\n");
            sb.append("__inst.dataWordSize = __mod.PARAMS.dataWordSize;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("__inst.deviceHeader = __mod.PARAMS.deviceHeader;\n");
            sb.append("__inst.isa = __mod.PARAMS.isa;\n");
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("for (var __p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexm4.OMAP5430$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Module", "ti.catalog.arm.cortexm4"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430$$Object", "ti.catalog.arm.cortexm4"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Params", "ti.catalog.arm.cortexm4"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexm4$OMAP5430$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexm4.OMAP5430'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {revision:revision});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.cpuCore = __mod.PARAMS.cpuCore;\n");
            sb.append("__inst.cpuCoreRevision = __mod.PARAMS.cpuCoreRevision;\n");
            sb.append("__inst.minProgUnitSize = __mod.PARAMS.minProgUnitSize;\n");
            sb.append("__inst.minDataUnitSize = __mod.PARAMS.minDataUnitSize;\n");
            sb.append("__inst.dataWordSize = __mod.PARAMS.dataWordSize;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("__inst.deviceHeader = __mod.PARAMS.deviceHeader;\n");
            sb.append("__inst.isa = __mod.PARAMS.isa;\n");
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("for (var __p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void Vayu$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexm4.Vayu$$create", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexm4.Vayu.Module", "ti.catalog.arm.cortexm4"), om.findStrict("ti.catalog.arm.cortexm4.Vayu.Instance", "ti.catalog.arm.cortexm4"), 2, 1, false));
                fxn.addArg(0, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexm4.Vayu.Params", "ti.catalog.arm.cortexm4"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexm4$Vayu$$create = function( revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexm4.Vayu'];\n");
            sb.append("var __inst = xdc.om['ti.catalog.arm.cortexm4.Vayu.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['ti.catalog.arm.cortexm4']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {revision:revision});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.cpuCore = __mod.PARAMS.cpuCore;\n");
            sb.append("__inst.cpuCoreRevision = __mod.PARAMS.cpuCoreRevision;\n");
            sb.append("__inst.minProgUnitSize = __mod.PARAMS.minProgUnitSize;\n");
            sb.append("__inst.minDataUnitSize = __mod.PARAMS.minDataUnitSize;\n");
            sb.append("__inst.dataWordSize = __mod.PARAMS.dataWordSize;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("__inst.deviceHeader = __mod.PARAMS.deviceHeader;\n");
            sb.append("__inst.isa = __mod.PARAMS.isa;\n");
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("for (var __p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [revision]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("ti.catalog.arm.cortexm4.Vayu$$construct", new Proto.Fxn(om.findStrict("ti.catalog.arm.cortexm4.Vayu.Module", "ti.catalog.arm.cortexm4"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("ti.catalog.arm.cortexm4.Vayu$$Object", "ti.catalog.arm.cortexm4"), null);
                fxn.addArg(1, "revision", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("ti.catalog.arm.cortexm4.Vayu.Params", "ti.catalog.arm.cortexm4"), Global.newObject());
        sb = new StringBuilder();
        sb.append("ti$catalog$arm$cortexm4$Vayu$$construct = function( __obj, revision, __params ) {\n");
            sb.append("var __mod = xdc.om['ti.catalog.arm.cortexm4.Vayu'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {revision:revision});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.cpuCore = __mod.PARAMS.cpuCore;\n");
            sb.append("__inst.cpuCoreRevision = __mod.PARAMS.cpuCoreRevision;\n");
            sb.append("__inst.minProgUnitSize = __mod.PARAMS.minProgUnitSize;\n");
            sb.append("__inst.minDataUnitSize = __mod.PARAMS.minDataUnitSize;\n");
            sb.append("__inst.dataWordSize = __mod.PARAMS.dataWordSize;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("__inst.deviceHeader = __mod.PARAMS.deviceHeader;\n");
            sb.append("__inst.isa = __mod.PARAMS.isa;\n");
            sb.append("__inst.hdvicp0 = __mod.PARAMS.hdvicp0;\n");
            sb.append("for (var __p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void Stellaris$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void OMAP5430$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void Vayu$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void Stellaris$$SIZES()
    {
    }

    void OMAP5430$$SIZES()
    {
    }

    void Vayu$$SIZES()
    {
    }

    void Stellaris$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/arm/cortexm4/Stellaris.xs");
        om.bind("ti.catalog.arm.cortexm4.Stellaris$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Module", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.Stellaris.Module", om.findStrict("ti.catalog.ICpuDataSheet.Module", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexm4.Stellaris$$create", "ti.catalog.arm.cortexm4"), Global.get("ti$catalog$arm$cortexm4$Stellaris$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexm4.Stellaris$$construct", "ti.catalog.arm.cortexm4"), Global.get("ti$catalog$arm$cortexm4$Stellaris$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.Stellaris$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.Stellaris$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.Stellaris$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.Stellaris$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Instance", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.Stellaris.Instance", om.findStrict("ti.catalog.ICpuDataSheet.Instance", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("cpuCore", $$T_Str, "CM4", "wh");
        po.addFld("isa", $$T_Str, "v7M4", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexm4"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexm4"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Stellaris$$Params", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.Stellaris.Params", om.findStrict("ti.catalog.ICpuDataSheet$$Params", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("cpuCore", $$T_Str, "CM4", "wh");
        po.addFld("isa", $$T_Str, "v7M4", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Stellaris$$Object", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.Stellaris.Object", om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Instance", "ti.catalog.arm.cortexm4"));
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexm4"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexm4"), fxn);
    }

    void OMAP5430$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/arm/cortexm4/OMAP5430.xs");
        om.bind("ti.catalog.arm.cortexm4.OMAP5430$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Module", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.OMAP5430.Module", om.findStrict("ti.catalog.ICpuDataSheet.Module", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430$$create", "ti.catalog.arm.cortexm4"), Global.get("ti$catalog$arm$cortexm4$OMAP5430$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430$$construct", "ti.catalog.arm.cortexm4"), Global.get("ti$catalog$arm$cortexm4$OMAP5430$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.OMAP5430$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.OMAP5430$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.OMAP5430$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.OMAP5430$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Instance", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.OMAP5430.Instance", om.findStrict("ti.catalog.ICpuDataSheet.Instance", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("hdvicp0", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexm4"), $$UNDEF, "wh");
        po.addFld("cpuCore", $$T_Str, "CM4", "wh");
        po.addFld("isa", $$T_Str, "v7M4", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexm4")), Global.newArray(new Object[]{Global.newArray(new Object[]{"L2_ROM", Global.newObject("name", "L2_ROM", "base", 0x00000000L, "len", 0x00004000L)}), Global.newArray(new Object[]{"L2_RAM", Global.newObject("name", "L2_RAM", "base", 0x20000000L, "len", 0x00010000L)})}), "wh");
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexm4"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexm4"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430$$Params", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.OMAP5430.Params", om.findStrict("ti.catalog.ICpuDataSheet$$Params", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("hdvicp0", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexm4"), $$UNDEF, "wh");
        po.addFld("cpuCore", $$T_Str, "CM4", "wh");
        po.addFld("isa", $$T_Str, "v7M4", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexm4")), Global.newArray(new Object[]{Global.newArray(new Object[]{"L2_ROM", Global.newObject("name", "L2_ROM", "base", 0x00000000L, "len", 0x00004000L)}), Global.newArray(new Object[]{"L2_RAM", Global.newObject("name", "L2_RAM", "base", 0x20000000L, "len", 0x00010000L)})}), "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430$$Object", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.OMAP5430.Object", om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Instance", "ti.catalog.arm.cortexm4"));
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexm4"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexm4"), fxn);
    }

    void Vayu$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/catalog/arm/cortexm4/Vayu.xs");
        om.bind("ti.catalog.arm.cortexm4.Vayu$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Vayu.Module", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.Vayu.Module", om.findStrict("ti.catalog.ICpuDataSheet.Module", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFxn("create", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexm4.Vayu$$create", "ti.catalog.arm.cortexm4"), Global.get("ti$catalog$arm$cortexm4$Vayu$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("ti.catalog.arm.cortexm4.Vayu$$construct", "ti.catalog.arm.cortexm4"), Global.get("ti$catalog$arm$cortexm4$Vayu$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.Vayu$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.Vayu$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.Vayu$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.catalog.arm.cortexm4.Vayu$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Vayu.Instance", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.Vayu.Instance", om.findStrict("ti.catalog.ICpuDataSheet.Instance", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("hdvicp0", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexm4"), $$UNDEF, "wh");
        po.addFld("cpuCore", $$T_Str, "CM4", "wh");
        po.addFld("isa", $$T_Str, "v7M4", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexm4")), Global.newArray(new Object[]{Global.newArray(new Object[]{"L2_ROM", Global.newObject("name", "L2_ROM", "base", 0x00000000L, "len", 0x00004000L)}), Global.newArray(new Object[]{"L2_RAM", Global.newObject("name", "L2_RAM", "base", 0x20000000L, "len", 0x00010000L)})}), "wh");
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexm4"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexm4"), fxn);
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Vayu$$Params", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.Vayu.Params", om.findStrict("ti.catalog.ICpuDataSheet$$Params", "ti.catalog.arm.cortexm4"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("hdvicp0", (Proto)om.findStrict("ti.catalog.peripherals.hdvicp2.HDVICP2.Instance", "ti.catalog.arm.cortexm4"), $$UNDEF, "wh");
        po.addFld("cpuCore", $$T_Str, "CM4", "wh");
        po.addFld("isa", $$T_Str, "v7M4", "wh");
        po.addFld("cpuCoreRevision", $$T_Str, "1.0", "wh");
        po.addFld("minProgUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("minDataUnitSize", Proto.Elm.newCNum("(xdc_Int)"), 1L, "wh");
        po.addFld("dataWordSize", Proto.Elm.newCNum("(xdc_Int)"), 4L, "wh");
        po.addFld("memMap", new Proto.Map((Proto)om.findStrict("xdc.platform.IPlatform.Memory", "ti.catalog.arm.cortexm4")), Global.newArray(new Object[]{Global.newArray(new Object[]{"L2_ROM", Global.newObject("name", "L2_ROM", "base", 0x00000000L, "len", 0x00004000L)}), Global.newArray(new Object[]{"L2_RAM", Global.newObject("name", "L2_RAM", "base", 0x20000000L, "len", 0x00010000L)})}), "wh");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Vayu$$Object", "ti.catalog.arm.cortexm4");
        po.init("ti.catalog.arm.cortexm4.Vayu.Object", om.findStrict("ti.catalog.arm.cortexm4.Vayu.Instance", "ti.catalog.arm.cortexm4"));
                fxn = Global.get(cap, "getMemoryMap");
                if (fxn != null) po.addFxn("getMemoryMap", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getMemoryMap", "ti.catalog.arm.cortexm4"), fxn);
                fxn = Global.get(cap, "getRegisterSet");
                if (fxn != null) po.addFxn("getRegisterSet", (Proto.Fxn)om.findStrict("xdc.platform.ICpuDataSheet$$getRegisterSet", "ti.catalog.arm.cortexm4"), fxn);
    }

    void Stellaris$$ROV()
    {
    }

    void OMAP5430$$ROV()
    {
    }

    void Vayu$$ROV()
    {
    }

    void $$SINGLETONS()
    {
        pkgP.init("ti.catalog.arm.cortexm4.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "ti.catalog.arm.cortexm4"));
        pkgP.bind("$capsule", $$UNDEF);
        pkgV.init2(pkgP, "ti.catalog.arm.cortexm4", Value.DEFAULT, false);
        pkgV.bind("$name", "ti.catalog.arm.cortexm4");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "ti.catalog.arm.cortexm4.");
        pkgV.bind("$vers", Global.newArray("1, 0, 0"));
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['ti.catalog.arm.cortexm4'];\n");
        sb.append("if (pkg.$vers.length >= 3) {\n");
            sb.append("pkg.$vers.push(Packages.xdc.services.global.Vers.getDate(xdc.csd() + '/..'));\n");
        sb.append("}\n");
        sb.append("pkg.build.libraries = [\n");
        sb.append("];\n");
        sb.append("pkg.build.libDesc = [\n");
        sb.append("];\n");
        Global.eval(sb.toString());
    }

    void Stellaris$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexm4.Stellaris", "ti.catalog.arm.cortexm4");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Module", "ti.catalog.arm.cortexm4");
        vo.init2(po, "ti.catalog.arm.cortexm4.Stellaris", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.arm.cortexm4.Stellaris$$capsule", "ti.catalog.arm.cortexm4"));
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Instance", "ti.catalog.arm.cortexm4"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Params", "ti.catalog.arm.cortexm4"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Params", "ti.catalog.arm.cortexm4")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexm4", "ti.catalog.arm.cortexm4"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("ti.catalog");
        inherits.add("xdc.platform");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexm4")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexm4.Stellaris$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexm4.Stellaris.Object", "ti.catalog.arm.cortexm4"));
        pkgV.bind("Stellaris", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("Stellaris");
    }

    void OMAP5430$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430", "ti.catalog.arm.cortexm4");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Module", "ti.catalog.arm.cortexm4");
        vo.init2(po, "ti.catalog.arm.cortexm4.OMAP5430", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.arm.cortexm4.OMAP5430$$capsule", "ti.catalog.arm.cortexm4"));
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Instance", "ti.catalog.arm.cortexm4"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Params", "ti.catalog.arm.cortexm4"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Params", "ti.catalog.arm.cortexm4")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexm4", "ti.catalog.arm.cortexm4"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("ti.catalog");
        inherits.add("xdc.platform");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexm4")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexm4.OMAP5430$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexm4.OMAP5430.Object", "ti.catalog.arm.cortexm4"));
        pkgV.bind("OMAP5430", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("OMAP5430");
    }

    void Vayu$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.catalog.arm.cortexm4.Vayu", "ti.catalog.arm.cortexm4");
        po = (Proto.Obj)om.findStrict("ti.catalog.arm.cortexm4.Vayu.Module", "ti.catalog.arm.cortexm4");
        vo.init2(po, "ti.catalog.arm.cortexm4.Vayu", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.catalog.arm.cortexm4.Vayu$$capsule", "ti.catalog.arm.cortexm4"));
        vo.bind("Instance", om.findStrict("ti.catalog.arm.cortexm4.Vayu.Instance", "ti.catalog.arm.cortexm4"));
        vo.bind("Params", om.findStrict("ti.catalog.arm.cortexm4.Vayu.Params", "ti.catalog.arm.cortexm4"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("ti.catalog.arm.cortexm4.Vayu.Params", "ti.catalog.arm.cortexm4")).newInstance());
        vo.bind("$package", om.findStrict("ti.catalog.arm.cortexm4", "ti.catalog.arm.cortexm4"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("ti.catalog");
        inherits.add("xdc.platform");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.catalog.arm.cortexm4")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("ti.catalog.arm.cortexm4.Vayu$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("ti.catalog.arm.cortexm4.Vayu.Object", "ti.catalog.arm.cortexm4"));
        pkgV.bind("Vayu", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("Vayu");
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexm4.Stellaris", "ti.catalog.arm.cortexm4"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexm4.OMAP5430", "ti.catalog.arm.cortexm4"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.catalog.arm.cortexm4.Vayu", "ti.catalog.arm.cortexm4"));
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("ti.catalog.arm.cortexm4.Stellaris")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexm4.OMAP5430")).bless();
        ((Value.Obj)om.getv("ti.catalog.arm.cortexm4.Vayu")).bless();
        ((Value.Arr)om.findStrict("$packages", "ti.catalog.arm.cortexm4")).add(pkgV);
    }

    public void exec( Scriptable xdcO, Session ses )
    {
        this.xdcO = xdcO;
        this.ses = ses;
        om = (Value.Obj)xdcO.get("om", null);

        Object o = om.geto("$name");
        String s = o instanceof String ? (String)o : null;
        isCFG = s != null && s.equals("cfg");
        isROV = s != null && s.equals("rov");

        $$IMPORTS();
        $$OBJECTS();
        Stellaris$$OBJECTS();
        OMAP5430$$OBJECTS();
        Vayu$$OBJECTS();
        Stellaris$$CONSTS();
        OMAP5430$$CONSTS();
        Vayu$$CONSTS();
        Stellaris$$CREATES();
        OMAP5430$$CREATES();
        Vayu$$CREATES();
        Stellaris$$FUNCTIONS();
        OMAP5430$$FUNCTIONS();
        Vayu$$FUNCTIONS();
        Stellaris$$SIZES();
        OMAP5430$$SIZES();
        Vayu$$SIZES();
        Stellaris$$TYPES();
        OMAP5430$$TYPES();
        Vayu$$TYPES();
        if (isROV) {
            Stellaris$$ROV();
            OMAP5430$$ROV();
            Vayu$$ROV();
        }//isROV
        $$SINGLETONS();
        Stellaris$$SINGLETONS();
        OMAP5430$$SINGLETONS();
        Vayu$$SINGLETONS();
        $$INITIALIZATION();
    }
}
