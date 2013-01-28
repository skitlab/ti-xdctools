/*
 *  Do not modify this file; it is automatically 
 *  generated and any modifications will be overwritten.
 *
 * @(#) xdc-y44
 */
import java.util.*;
import org.mozilla.javascript.*;
import xdc.services.intern.xsr.*;
import xdc.services.spec.Session;

public class gnu_targets_arm_rtsv7M
{
    static final String VERS = "@(#) xdc-y44\n";

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
        Global.callFxn("loadPackage", xdcO, "xdc.runtime");
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("gnu.targets.arm.rtsv7M.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("gnu.targets.arm.rtsv7M", new Value.Obj("gnu.targets.arm.rtsv7M", pkgP));
    }

    void $$SINGLETONS()
    {
        pkgP.init("gnu.targets.arm.rtsv7M.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "gnu.targets.arm.rtsv7M"));
        Scriptable cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/rtsv7M/package.xs");
        om.bind("xdc.IPackage$$capsule", cap);
        Object fxn;
                fxn = Global.get(cap, "init");
                if (fxn != null) pkgP.addFxn("init", (Proto.Fxn)om.findStrict("xdc.IPackage$$init", "gnu.targets.arm.rtsv7M"), fxn);
                fxn = Global.get(cap, "close");
                if (fxn != null) pkgP.addFxn("close", (Proto.Fxn)om.findStrict("xdc.IPackage$$close", "gnu.targets.arm.rtsv7M"), fxn);
                fxn = Global.get(cap, "validate");
                if (fxn != null) pkgP.addFxn("validate", (Proto.Fxn)om.findStrict("xdc.IPackage$$validate", "gnu.targets.arm.rtsv7M"), fxn);
                fxn = Global.get(cap, "exit");
                if (fxn != null) pkgP.addFxn("exit", (Proto.Fxn)om.findStrict("xdc.IPackage$$exit", "gnu.targets.arm.rtsv7M"), fxn);
                fxn = Global.get(cap, "getLibs");
                if (fxn != null) pkgP.addFxn("getLibs", (Proto.Fxn)om.findStrict("xdc.IPackage$$getLibs", "gnu.targets.arm.rtsv7M"), fxn);
                fxn = Global.get(cap, "getSects");
                if (fxn != null) pkgP.addFxn("getSects", (Proto.Fxn)om.findStrict("xdc.IPackage$$getSects", "gnu.targets.arm.rtsv7M"), fxn);
        pkgP.bind("$capsule", cap);
        pkgV.init2(pkgP, "gnu.targets.arm.rtsv7M", Value.DEFAULT, false);
        pkgV.bind("$name", "gnu.targets.arm.rtsv7M");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "gnu.targets.arm.rtsv7M.");
        pkgV.bind("$vers", Global.newArray("1, 0, 0, 0"));
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        imports.add(Global.newArray("xdc.runtime", Global.newArray()));
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['gnu.targets.arm.rtsv7M'];\n");
        sb.append("if (pkg.$vers.length >= 3) {\n");
            sb.append("pkg.$vers.push(Packages.xdc.services.global.Vers.getDate(xdc.csd() + '/..'));\n");
        sb.append("}\n");
        sb.append("pkg.build.libraries = [\n");
            sb.append("'lib/gnu.targets.arm.rtsv7M.am3g',\n");
            sb.append("'lib/boot.am3g',\n");
            sb.append("'lib/syscalls.am3g',\n");
            sb.append("'lib/gnu.targets.arm.rtsv7M.am4g',\n");
            sb.append("'lib/boot.am4g',\n");
            sb.append("'lib/syscalls.am4g',\n");
            sb.append("'lib/gnu.targets.arm.rtsv7M.am4fg',\n");
            sb.append("'lib/boot.am4fg',\n");
            sb.append("'lib/syscalls.am4fg',\n");
        sb.append("];\n");
        sb.append("pkg.build.libDesc = [\n");
            sb.append("['lib/gnu.targets.arm.rtsv7M.am3g', {target: 'gnu.targets.arm.M3', suffix: 'm3g'}],\n");
            sb.append("['lib/boot.am3g', {target: 'gnu.targets.arm.M3', suffix: 'm3g'}],\n");
            sb.append("['lib/syscalls.am3g', {target: 'gnu.targets.arm.M3', suffix: 'm3g'}],\n");
            sb.append("['lib/gnu.targets.arm.rtsv7M.am4g', {target: 'gnu.targets.arm.M4', suffix: 'm4g'}],\n");
            sb.append("['lib/boot.am4g', {target: 'gnu.targets.arm.M4', suffix: 'm4g'}],\n");
            sb.append("['lib/syscalls.am4g', {target: 'gnu.targets.arm.M4', suffix: 'm4g'}],\n");
            sb.append("['lib/gnu.targets.arm.rtsv7M.am4fg', {target: 'gnu.targets.arm.M4F', suffix: 'm4fg'}],\n");
            sb.append("['lib/boot.am4fg', {target: 'gnu.targets.arm.M4F', suffix: 'm4fg'}],\n");
            sb.append("['lib/syscalls.am4fg', {target: 'gnu.targets.arm.M4F', suffix: 'm4fg'}],\n");
        sb.append("];\n");
        Global.eval(sb.toString());
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("init", pkgV);
        ((Value.Arr)om.findStrict("$packages", "gnu.targets.arm.rtsv7M")).add(pkgV);
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
        if (isROV) {
        }//isROV
        $$SINGLETONS();
        $$INITIALIZATION();
    }
}
