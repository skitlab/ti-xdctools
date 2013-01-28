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

public class gnu_targets_arm
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
        Global.callFxn("loadPackage", xdcO, "xdc.bld");
        Global.callFxn("loadPackage", xdcO, "gnu.targets");
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("gnu.targets.arm.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("gnu.targets.arm", new Value.Obj("gnu.targets.arm", pkgP));
    }

    void GCArmv5T$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.GCArmv5T.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.GCArmv5T", new Value.Obj("gnu.targets.arm.GCArmv5T", po));
        pkgV.bind("GCArmv5T", vo);
        // decls 
        om.bind("gnu.targets.arm.GCArmv5T.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv5T.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void GCArmv6$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.GCArmv6.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.GCArmv6", new Value.Obj("gnu.targets.arm.GCArmv6", po));
        pkgV.bind("GCArmv6", vo);
        // decls 
        om.bind("gnu.targets.arm.GCArmv6.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv6.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void GCArmv7A$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.GCArmv7A.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.GCArmv7A", new Value.Obj("gnu.targets.arm.GCArmv7A", po));
        pkgV.bind("GCArmv7A", vo);
        // decls 
        om.bind("gnu.targets.arm.GCArmv7A.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.GCArmv7A.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void M3$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.M3.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.M3", new Value.Obj("gnu.targets.arm.M3", po));
        pkgV.bind("M3", vo);
        // decls 
        om.bind("gnu.targets.arm.M3.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M3.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void M4$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.M4.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.M4", new Value.Obj("gnu.targets.arm.M4", po));
        pkgV.bind("M4", vo);
        // decls 
        om.bind("gnu.targets.arm.M4.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void M4F$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.M4F.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.M4F", new Value.Obj("gnu.targets.arm.M4F", po));
        pkgV.bind("M4F", vo);
        // decls 
        om.bind("gnu.targets.arm.M4F.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.M4F.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void A9$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.A9.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.A9", new Value.Obj("gnu.targets.arm.A9", po));
        pkgV.bind("A9", vo);
        // decls 
        om.bind("gnu.targets.arm.A9.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A9.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void A15$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.A15.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.A15", new Value.Obj("gnu.targets.arm.A15", po));
        pkgV.bind("A15", vo);
        // decls 
        om.bind("gnu.targets.arm.A15.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.A15.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void MVArm9$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.MVArm9.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.MVArm9", new Value.Obj("gnu.targets.arm.MVArm9", po));
        pkgV.bind("MVArm9", vo);
        // decls 
        om.bind("gnu.targets.arm.MVArm9.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.MVArm9.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void UCArm9$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("gnu.targets.arm.UCArm9.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("gnu.targets.arm.UCArm9", new Value.Obj("gnu.targets.arm.UCArm9", po));
        pkgV.bind("UCArm9", vo);
        // decls 
        om.bind("gnu.targets.arm.UCArm9.Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        om.bind("gnu.targets.arm.UCArm9.Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
    }

    void GCArmv5T$$CONSTS()
    {
        // module GCArmv5T
    }

    void GCArmv6$$CONSTS()
    {
        // module GCArmv6
    }

    void GCArmv7A$$CONSTS()
    {
        // module GCArmv7A
    }

    void M3$$CONSTS()
    {
        // module M3
    }

    void M4$$CONSTS()
    {
        // module M4
    }

    void M4F$$CONSTS()
    {
        // module M4F
    }

    void A9$$CONSTS()
    {
        // module A9
    }

    void A15$$CONSTS()
    {
        // module A15
    }

    void MVArm9$$CONSTS()
    {
        // module MVArm9
    }

    void UCArm9$$CONSTS()
    {
        // module UCArm9
    }

    void GCArmv5T$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void GCArmv6$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void GCArmv7A$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void M3$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void M4$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void M4F$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void A9$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void A15$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void MVArm9$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void UCArm9$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void GCArmv5T$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void GCArmv6$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void GCArmv7A$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void M3$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void M4$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void M4F$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void A9$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void A15$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void MVArm9$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void UCArm9$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void GCArmv5T$$SIZES()
    {
    }

    void GCArmv6$$SIZES()
    {
    }

    void GCArmv7A$$SIZES()
    {
    }

    void M3$$SIZES()
    {
    }

    void M4$$SIZES()
    {
    }

    void M4F$$SIZES()
    {
    }

    void A9$$SIZES()
    {
    }

    void A15$$SIZES()
    {
    }

    void MVArm9$$SIZES()
    {
    }

    void UCArm9$$SIZES()
    {
    }

    void GCArmv5T$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        po = (Proto.Obj)om.findStrict("gnu.targets.arm.GCArmv5T.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.GCArmv5T.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "GCArmv5T", "rh");
        po.addFld("os", $$T_Str, "Linux", "rh");
        po.addFld("suffix", $$T_Str, "v5T", "rh");
        po.addFld("isa", $$T_Str, "v5T", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little"), "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rtsv5T", "rh");
        po.addFld("platform", $$T_Str, "host.platforms.arm", "wh");
        po.addFld("LONGNAME", $$T_Str, $$UNDEF, "wh");
        po.addFld("stdInclude", $$T_Str, "gnu/targets/arm/std.h", "rh");
        po.addFld("cc", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep", "opts", "-march=armv5t"), "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-fPIC -Wunused", "suffix", "-Dfar= "), "wh");
        po.addFld("asm", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -x assembler", "opts", "-march=armv5t"), "rh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -lstdc++ -L$(rootDir)/$(GCCTARG)/lib"), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{"470MV", "v5t"}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
                po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), $$UNDEF);
                po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), $$UNDEF);
    }

    void GCArmv6$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/GCArmv6.xs");
        om.bind("gnu.targets.arm.GCArmv6$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.GCArmv6.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.GCArmv6.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "GCArmv6", "rh");
        po.addFld("os", $$T_Str, "Linux", "rh");
        po.addFld("suffix", $$T_Str, "v6", "rh");
        po.addFld("isa", $$T_Str, "v6", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little"), "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rtsv6", "rh");
        po.addFld("platform", $$T_Str, "host.platforms.arm", "wh");
        po.addFld("LONGNAME", $$T_Str, $$UNDEF, "wh");
        po.addFld("stdInclude", $$T_Str, "gnu/targets/arm/std.h", "rh");
        po.addFld("cc", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep", "opts", "-march=armv6"), "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-fPIC -Wunused", "suffix", "-Dfar= "), "wh");
        po.addFld("asm", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -x assembler", "opts", "-march=armv6"), "rh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -lstdc++ -L$(rootDir)/$(GCCTARG)/lib"), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{"v5T", "470MV", "v5t"}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.GCArmv6$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.GCArmv6$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.GCArmv6$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void GCArmv7A$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/GCArmv7A.xs");
        om.bind("gnu.targets.arm.GCArmv7A$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.GCArmv7A.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.GCArmv7A.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "GCArmv7A", "rh");
        po.addFld("os", $$T_Str, "Linux", "rh");
        po.addFld("suffix", $$T_Str, "v7A", "rh");
        po.addFld("isa", $$T_Str, "v7A", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little"), "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rtsv7A", "rh");
        po.addFld("platform", $$T_Str, "host.platforms.arm", "wh");
        po.addFld("LONGNAME", $$T_Str, $$UNDEF, "wh");
        po.addFld("stdInclude", $$T_Str, "gnu/targets/arm/std.h", "rh");
        po.addFld("cc", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep", "opts", "-march=armv7-a"), "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-fPIC -Wunused", "suffix", "-Dfar= "), "wh");
        po.addFld("asm", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -x assembler", "opts", "-march=armv7-a"), "rh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -lstdc++ -L$(rootDir)/$(GCCTARG)/lib"), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{"v6", "v5T", "470MV", "v5t"}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.GCArmv7A$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.GCArmv7A$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.GCArmv7A$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void M3$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/M3.xs");
        om.bind("gnu.targets.arm.M3$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.M3.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.M3.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "M3", "rh");
        po.addFld("suffix", $$T_Str, "m3g", "rh");
        po.addFld("isa", $$T_Str, "v7M", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little", "codeModel", "thumb2", "shortEnums", true), "rh");
        po.addFld("alignDirectiveSupported", $$T_Bool, true, "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rtsv7M", "rh");
        po.addFld("platform", $$T_Str, "ti.platforms.stellaris:LM3S9B90", "wh");
        po.addFld("LONGNAME", $$T_Str, "bin/arm-none-eabi-gcc", "wh");
        po.addFld("stdInclude", $$T_Str, "gnu/targets/arm/std.h", "rh");
        po.addFld("cc", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep", "opts", "-mcpu=cortex-m3 -mthumb -mabi=aapcs -mapcs "), "rh");
        po.addFld("ccBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -MD -MF $@.dep", "opts", "-mabi=aapcs -mapcs"), "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-Wunused -Wunknown-pragmas -ffunction-sections -fdata-sections", "suffix", "-Dfar= "), "wh");
        po.addFld("asm", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -x assembler-with-cpp", "opts", "-Wa,-mcpu=cortex-m3 -Wa,-mthumb"), "rh");
        po.addFld("asmBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -x assembler-with-cpp", "opts", "-Wa,-mcpu=cortex-m3 -Wa,-mthumb"), "rh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-nostartfiles -Wl,-static -Wl,--gc-sections", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -L$(rootDir)/$(GCCTARG)/lib/thumb2 -L$(rootDir)/lib/gcc/$(GCCTARG)/4.5.2/thumb2"), "wh");
        po.addFld("arBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-ar ", "opts", ""), "rh");
        po.addFld("profiles", new Proto.Map((Proto)om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm")), Global.newArray(new Object[]{Global.newArray(new Object[]{"debug", Global.newObject("compileOpts", Global.newObject("copts", "-g", "defs", "-D_DEBUG_=1"), "linkOpts", "-g")}), Global.newArray(new Object[]{"release", Global.newObject("compileOpts", Global.newObject("copts", " -O2 "), "linkOpts", " ")})}), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.M3$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.M3$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.M3$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void M4$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/M4.xs");
        om.bind("gnu.targets.arm.M4$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.M4.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.M4.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "M4", "rh");
        po.addFld("suffix", $$T_Str, "m4g", "rh");
        po.addFld("isa", $$T_Str, "v7M4", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little", "codeModel", "thumb2", "shortEnums", true), "rh");
        po.addFld("alignDirectiveSupported", $$T_Bool, true, "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rtsv7M", "rh");
        po.addFld("platform", $$T_Str, "ti.platforms.stellaris:LM4F232H5QD", "wh");
        po.addFld("LONGNAME", $$T_Str, "bin/arm-none-eabi-gcc", "wh");
        po.addFld("stdInclude", $$T_Str, "gnu/targets/arm/std.h", "rh");
        po.addFld("cc", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep", "opts", "-mcpu=cortex-m4 -mthumb -msoft-float -mabi=aapcs -mapcs"), "rh");
        po.addFld("ccBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -MD -MF $@.dep", "opts", "-mabi=aapcs -mapcs"), "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-Wunused -Wunknown-pragmas -ffunction-sections -fdata-sections", "suffix", "-Dfar= "), "wh");
        po.addFld("asm", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -x assembler-with-cpp", "opts", "-Wa,-mcpu=cortex-m4 -Wa,-mthumb"), "rh");
        po.addFld("asmBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -x assembler-with-cpp", "opts", "-Wa,-mcpu=cortex-m4 -Wa,-mthumb"), "rh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-nostartfiles -Wl,-static -Wl,--gc-sections ", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -L$(rootDir)/$(GCCTARG)/lib/thumb2 -L$(rootDir)/lib/gcc/$(GCCTARG)/4.5.2/thumb2"), "wh");
        po.addFld("arBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-ar ", "opts", ""), "rh");
        po.addFld("profiles", new Proto.Map((Proto)om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm")), Global.newArray(new Object[]{Global.newArray(new Object[]{"debug", Global.newObject("compileOpts", Global.newObject("copts", "-g", "defs", "-D_DEBUG_=1"), "linkOpts", "-g")}), Global.newArray(new Object[]{"release", Global.newObject("compileOpts", Global.newObject("copts", " -O2 "), "linkOpts", " ")})}), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.M4$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.M4$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.M4$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void M4F$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/M4F.xs");
        om.bind("gnu.targets.arm.M4F$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.M4F.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.M4F.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "M4F", "rh");
        po.addFld("suffix", $$T_Str, "m4fg", "rh");
        po.addFld("isa", $$T_Str, "v7M4", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little", "codeModel", "thumb2", "shortEnums", true), "rh");
        po.addFld("alignDirectiveSupported", $$T_Bool, true, "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rtsv7M", "rh");
        po.addFld("platform", $$T_Str, "ti.platforms.stellaris:LM4F232H5QD", "wh");
        po.addFld("LONGNAME", $$T_Str, "bin/arm-none-eabi-gcc", "wh");
        po.addFld("stdInclude", $$T_Str, "gnu/targets/arm/std.h", "rh");
        po.addFld("cc", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep", "opts", "-mcpu=cortex-m4 -mthumb -mhard-float -mabi=aapcs -mapcs"), "rh");
        po.addFld("ccBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -MD -MF $@.dep", "opts", "-mabi=aapcs -mapcs"), "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-Wunused -Wunknown-pragmas -ffunction-sections -fdata-sections ", "suffix", "-Dfar= "), "wh");
        po.addFld("asm", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -x assembler-with-cpp", "opts", "-Wa,-mcpu=cortex-m4 -Wa,-mthumb"), "rh");
        po.addFld("asmBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -x assembler-with-cpp", "opts", "-Wa,-mcpu=cortex-m4 -Wa,-mthumb"), "rh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-nostartfiles -Wl,-static -Wl,--gc-sections ", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -L$(rootDir)/$(GCCTARG)/lib/thumb2 -L$(rootDir)/lib/gcc/$(GCCTARG)/4.5.2/thumb2"), "wh");
        po.addFld("arBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-ar ", "opts", ""), "rh");
        po.addFld("profiles", new Proto.Map((Proto)om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm")), Global.newArray(new Object[]{Global.newArray(new Object[]{"debug", Global.newObject("compileOpts", Global.newObject("copts", "-g", "defs", "-D_DEBUG_=1"), "linkOpts", "-g")}), Global.newArray(new Object[]{"release", Global.newObject("compileOpts", Global.newObject("copts", " -O2 "), "linkOpts", " ")})}), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.M4F$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.M4F$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.M4F$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void A9$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/A9.xs");
        om.bind("gnu.targets.arm.A9$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.A9.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.A9.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "A9", "rh");
        po.addFld("suffix", $$T_Str, "a9g", "rh");
        po.addFld("isa", $$T_Str, "v7A9", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little", "shortEnums", true), "rh");
        po.addFld("alignDirectiveSupported", $$T_Bool, true, "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rtsv7A", "rh");
        po.addFld("platform", $$T_Str, "ti.platforms.sdp4430", "wh");
        po.addFld("LONGNAME", $$T_Str, "bin/arm-none-eabi-gcc", "wh");
        po.addFld("stdInclude", $$T_Str, "gnu/targets/arm/std.h", "rh");
        po.addFld("cc", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep", "opts", "-mcpu=cortex-a9 -mfpu=neon -mfloat-abi=softfp"), "rh");
        po.addFld("ccBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -MD -MF $@.dep", "opts", "-mabi=aapcs -mapcs"), "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-fPIC -Wunused -Wunknown-pragmas", "suffix", "-Dfar= "), "wh");
        po.addFld("asm", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -x assembler-with-cpp", "opts", "-mcpu=cortex-a9 -mfpu=neon -mfloat-abi=softfp"), "rh");
        po.addFld("asmBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -x assembler-with-cpp", "opts", "-mcpu=cortex-a9 -mfpu=neon -mfloat-abi=softfp"), "rh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-nostartfiles -Wl,-static -Wl,--gc-sections", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -L$(rootDir)/$(GCCTARG)/lib"), "wh");
        po.addFld("arBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-ar ", "opts", ""), "rh");
        po.addFld("profiles", new Proto.Map((Proto)om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm")), Global.newArray(new Object[]{Global.newArray(new Object[]{"debug", Global.newObject("compileOpts", Global.newObject("copts", "-g", "defs", "-D_DEBUG_=1"), "linkOpts", "-g")}), Global.newArray(new Object[]{"release", Global.newObject("compileOpts", Global.newObject("copts", " -O2 "), "linkOpts", " ")})}), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.A9$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.A9$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.A9$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void A15$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/A15.xs");
        om.bind("gnu.targets.arm.A15$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.A15.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.A15.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "A15", "rh");
        po.addFld("suffix", $$T_Str, "a15g", "rh");
        po.addFld("isa", $$T_Str, "v7A15", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little", "shortEnums", true), "rh");
        po.addFld("alignDirectiveSupported", $$T_Bool, true, "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rtsv7A", "rh");
        po.addFld("platform", $$T_Str, "ti.platforms.sdp5430", "wh");
        po.addFld("LONGNAME", $$T_Str, "bin/arm-none-eabi-gcc", "wh");
        po.addFld("stdInclude", $$T_Str, "gnu/targets/arm/std.h", "rh");
        po.addFld("cc", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -MD -MF $@.dep", "opts", "-mcpu=cortex-a15 -mfpu=neon -mfloat-abi=softfp"), "rh");
        po.addFld("ccBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -MD -MF $@.dep", "opts", "-mabi=aapcs -mapcs"), "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-fPIC -Wunused -Wunknown-pragmas", "suffix", "-Dfar= "), "wh");
        po.addFld("asm", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "$(rootDir)/$(LONGNAME) -c -x assembler-with-cpp", "opts", "-mcpu=cortex-a15 -mfpu=neon -mfloat-abi=softfp"), "rh");
        po.addFld("asmBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-gcc -c -x assembler-with-cpp", "opts", "-mcpu=cortex-a15 -mfpu=neon -mfloat-abi=softfp"), "rh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-nostartfiles -Wl,-static -Wl,--gc-sections", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -L$(rootDir)/$(GCCTARG)/lib"), "wh");
        po.addFld("arBin", (Proto)om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"), Global.newObject("cmd", "bin/arm-none-eabi-ar ", "opts", ""), "rh");
        po.addFld("profiles", new Proto.Map((Proto)om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm")), Global.newArray(new Object[]{Global.newArray(new Object[]{"debug", Global.newObject("compileOpts", Global.newObject("copts", "-g", "defs", "-D_DEBUG_=1"), "linkOpts", "-g")}), Global.newArray(new Object[]{"release", Global.newObject("compileOpts", Global.newObject("copts", " -O2 "), "linkOpts", " ")})}), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.A15$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.A15$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.A15$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void MVArm9$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/MVArm9.xs");
        om.bind("gnu.targets.arm.MVArm9$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.MVArm9.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.MVArm9.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "MVArm9", "rh");
        po.addFld("os", $$T_Str, "Linux", "rh");
        po.addFld("suffix", $$T_Str, "470MV", "rh");
        po.addFld("isa", $$T_Str, "v5T", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little"), "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rts470MV", "rh");
        po.addFld("platform", $$T_Str, "ti.platforms.evmDM6446", "wh");
        po.addFld("LONGNAME", $$T_Str, "bin/arm_v5t_le-gcc", "wh");
        po.addFld("CYGWIN", $$T_Bool, true, "rh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-fPIC -Wunused", "suffix", "-Dfar= "), "wh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -lstdc++ -L$(rootDir)/$(GCCTARG)/lib"), "wh");
        po.addFld("compatibleSuffixes", new Proto.Arr($$T_Str, false), Global.newArray(new Object[]{"v5T", "v5t"}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.MVArm9$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.MVArm9$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.MVArm9$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void UCArm9$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/UCArm9.xs");
        om.bind("gnu.targets.arm.UCArm9$$capsule", cap);
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.UCArm9.Module", "gnu.targets.arm");
        po.init("gnu.targets.arm.UCArm9.Module", om.findStrict("gnu.targets.ITarget.Module", "gnu.targets.arm"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("name", $$T_Str, "UCArm9", "rh");
        po.addFld("os", $$T_Str, "Linux", "rh");
        po.addFld("suffix", $$T_Str, "470uC", "rh");
        po.addFld("isa", $$T_Str, "v5T", "rh");
        po.addFld("model", (Proto)om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"), Global.newObject("endian", "little"), "rh");
        po.addFld("rts", $$T_Str, "gnu.targets.arm.rts470uC", "rh");
        po.addFld("platform", $$T_Str, "ti.platforms.evmDM6446", "wh");
        po.addFld("LONGNAME", $$T_Str, "/bin/arm-linux-gcc", "wh");
        po.addFld("ccOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-Wunused", "suffix", "-Dfar= "), "wh");
        po.addFld("lnkOpts", (Proto)om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"), Global.newObject("prefix", "-static", "suffix", "-Wl,-Map=$(XDCCFGDIR)/$@.map -L$(rootDir)/lib"), "wh");
        po.addFld("versionMap", new Proto.Map($$T_Str), Global.newArray(new Object[]{Global.newArray(new Object[]{"gcc3.2", "1,0,3.2,0"})}), "wh");
        po.addFld("profiles", new Proto.Map((Proto)om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm")), Global.newArray(new Object[]{Global.newArray(new Object[]{"debug", Global.newObject("compileOpts", Global.newObject("copts", "-g", "defs", "-D_DEBUG_=1"), "linkOpts", "-g")}), Global.newArray(new Object[]{"release", Global.newObject("compileOpts", Global.newObject("copts", "-O2 -ffunction-sections -fdata-sections"), "linkOpts", "-Wl,--gc-sections")})}), "wh");
        po.addFld("stdTypes", (Proto)om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"), Global.newObject("t_IArg", Global.newObject("size", 4L, "align", 4L), "t_Char", Global.newObject("size", 1L, "align", 1L), "t_Double", Global.newObject("size", 8L, "align", 4L), "t_Float", Global.newObject("size", 4L, "align", 4L), "t_Fxn", Global.newObject("size", 4L, "align", 4L), "t_Int", Global.newObject("size", 4L, "align", 4L), "t_Int8", Global.newObject("size", 1L, "align", 1L), "t_Int16", Global.newObject("size", 2L, "align", 2L), "t_Int32", Global.newObject("size", 4L, "align", 4L), "t_Int64", Global.newObject("size", 8L, "align", 4L), "t_Long", Global.newObject("size", 4L, "align", 4L), "t_LDouble", Global.newObject("size", 8L, "align", 4L), "t_LLong", Global.newObject("size", 8L, "align", 4L), "t_Ptr", Global.newObject("size", 4L, "align", 4L), "t_Short", Global.newObject("size", 2L, "align", 2L), "t_Size", Global.newObject("size", 4L, "align", 4L)), "rh");
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("gnu.targets.arm.UCArm9$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("gnu.targets.arm.UCArm9$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("gnu.targets.arm.UCArm9$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                fxn = Global.get(cap, "archive");
                if (fxn != null) po.addFxn("archive", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$archive", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "compile");
                if (fxn != null) po.addFxn("compile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$compile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "scompile");
                if (fxn != null) po.addFxn("scompile", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$scompile", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "link");
                if (fxn != null) po.addFxn("link", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$link", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getVersion");
                if (fxn != null) po.addFxn("getVersion", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getVersion", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getISAChain");
                if (fxn != null) po.addFxn("getISAChain", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$getISAChain", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "findSuffix");
                if (fxn != null) po.addFxn("findSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$findSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "selectSuffix");
                if (fxn != null) po.addFxn("selectSuffix", (Proto.Fxn)om.findStrict("xdc.bld.ITarget$$selectSuffix", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genConstCustom");
                if (fxn != null) po.addFxn("genConstCustom", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genConstCustom", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleData");
                if (fxn != null) po.addFxn("genVisibleData", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleData", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleFxns");
                if (fxn != null) po.addFxn("genVisibleFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleFxns", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "genVisibleLibFxns");
                if (fxn != null) po.addFxn("genVisibleLibFxns", (Proto.Fxn)om.findStrict("xdc.bld.ITarget2$$genVisibleLibFxns", "gnu.targets.arm"), fxn);
    }

    void GCArmv5T$$ROV()
    {
    }

    void GCArmv6$$ROV()
    {
    }

    void GCArmv7A$$ROV()
    {
    }

    void M3$$ROV()
    {
    }

    void M4$$ROV()
    {
    }

    void M4F$$ROV()
    {
    }

    void A9$$ROV()
    {
    }

    void A15$$ROV()
    {
    }

    void MVArm9$$ROV()
    {
    }

    void UCArm9$$ROV()
    {
    }

    void $$SINGLETONS()
    {
        pkgP.init("gnu.targets.arm.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "gnu.targets.arm"));
        Scriptable cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "gnu/targets/arm/package.xs");
        om.bind("xdc.IPackage$$capsule", cap);
        Object fxn;
                fxn = Global.get(cap, "init");
                if (fxn != null) pkgP.addFxn("init", (Proto.Fxn)om.findStrict("xdc.IPackage$$init", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "close");
                if (fxn != null) pkgP.addFxn("close", (Proto.Fxn)om.findStrict("xdc.IPackage$$close", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "validate");
                if (fxn != null) pkgP.addFxn("validate", (Proto.Fxn)om.findStrict("xdc.IPackage$$validate", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "exit");
                if (fxn != null) pkgP.addFxn("exit", (Proto.Fxn)om.findStrict("xdc.IPackage$$exit", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getLibs");
                if (fxn != null) pkgP.addFxn("getLibs", (Proto.Fxn)om.findStrict("xdc.IPackage$$getLibs", "gnu.targets.arm"), fxn);
                fxn = Global.get(cap, "getSects");
                if (fxn != null) pkgP.addFxn("getSects", (Proto.Fxn)om.findStrict("xdc.IPackage$$getSects", "gnu.targets.arm"), fxn);
        pkgP.bind("$capsule", cap);
        pkgV.init2(pkgP, "gnu.targets.arm", Value.DEFAULT, false);
        pkgV.bind("$name", "gnu.targets.arm");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "gnu.targets.arm.");
        pkgV.bind("$vers", Global.newArray("1, 0, 0, 0"));
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        imports.add(Global.newArray("xdc.bld", Global.newArray()));
        imports.add(Global.newArray("gnu.targets", Global.newArray()));
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['gnu.targets.arm'];\n");
        sb.append("if (pkg.$vers.length >= 3) {\n");
            sb.append("pkg.$vers.push(Packages.xdc.services.global.Vers.getDate(xdc.csd() + '/..'));\n");
        sb.append("}\n");
        sb.append("pkg.build.libraries = [\n");
        sb.append("];\n");
        sb.append("pkg.build.libDesc = [\n");
        sb.append("];\n");
        Global.eval(sb.toString());
    }

    void GCArmv5T$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.GCArmv5T", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.GCArmv5T.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.GCArmv5T", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", $$UNDEF);
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.GCArmv5T$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("GCArmv5T", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("GCArmv5T");
    }

    void GCArmv6$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.GCArmv6", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.GCArmv6.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.GCArmv6", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.GCArmv6$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.GCArmv6$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("GCArmv6", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("GCArmv6");
    }

    void GCArmv7A$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.GCArmv7A", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.GCArmv7A.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.GCArmv7A", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.GCArmv7A$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.GCArmv7A$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("GCArmv7A", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("GCArmv7A");
    }

    void M3$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.M3", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.M3.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.M3", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.M3$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.M3$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("M3", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("M3");
    }

    void M4$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.M4", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.M4.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.M4", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.M4$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.M4$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("M4", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("M4");
    }

    void M4F$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.M4F", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.M4F.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.M4F", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.M4F$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.M4F$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("M4F", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("M4F");
    }

    void A9$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.A9", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.A9.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.A9", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.A9$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.A9$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("A9", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("A9");
    }

    void A15$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.A15", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.A15.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.A15", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.A15$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.A15$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("A15", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("A15");
    }

    void MVArm9$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.MVArm9", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.MVArm9.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.MVArm9", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.MVArm9$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.MVArm9$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("MVArm9", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("MVArm9");
    }

    void UCArm9$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("gnu.targets.arm.UCArm9", "gnu.targets.arm");
        po = (Proto.Obj)om.findStrict("gnu.targets.arm.UCArm9.Module", "gnu.targets.arm");
        vo.init2(po, "gnu.targets.arm.UCArm9", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("gnu.targets.arm.UCArm9$$capsule", "gnu.targets.arm"));
        vo.bind("$package", om.findStrict("gnu.targets.arm", "gnu.targets.arm"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Model", om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Model", "gnu.targets.arm"));
        vo.bind("DebugGen", om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.DebugGen", "gnu.targets.arm"));
        vo.bind("Extension", om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.Extension", "gnu.targets.arm"));
        vo.bind("CompileOptions", om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileOptions", "gnu.targets.arm"));
        vo.bind("OptionSet", om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.OptionSet", "gnu.targets.arm"));
        vo.bind("CompileGoal", om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CompileGoal", "gnu.targets.arm"));
        vo.bind("LinkGoal", om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.LinkGoal", "gnu.targets.arm"));
        vo.bind("ArchiveGoal", om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.ArchiveGoal", "gnu.targets.arm"));
        vo.bind("CommandSet", om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.CommandSet", "gnu.targets.arm"));
        vo.bind("StringArray", om.findStrict("xdc.bld.ITarget.StringArray", "gnu.targets.arm"));
        vo.bind("TypeInfo", om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.TypeInfo", "gnu.targets.arm"));
        vo.bind("StdTypes", om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget.StdTypes", "gnu.targets.arm"));
        vo.bind("Command", om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Command", "gnu.targets.arm"));
        vo.bind("Options", om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        tdefs.add(om.findStrict("xdc.bld.ITarget2.Options", "gnu.targets.arm"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("gnu.targets");
        inherits.add("xdc.bld");
        inherits.add("xdc.bld");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "gnu.targets.arm")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("gnu.targets.arm.UCArm9$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", "xdc/bld/stddefs.xdt");
        atmap.seal("length");
        pkgV.bind("UCArm9", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("UCArm9");
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.GCArmv5T", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.GCArmv6", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.GCArmv7A", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.M3", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.M4", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.M4F", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.A9", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.A15", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.MVArm9", "gnu.targets.arm"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("gnu.targets.arm.UCArm9", "gnu.targets.arm"));
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("gnu.targets.arm.GCArmv5T")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.GCArmv6")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.GCArmv7A")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.M3")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.M4")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.M4F")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.A9")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.A15")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.MVArm9")).bless();
        ((Value.Obj)om.getv("gnu.targets.arm.UCArm9")).bless();
        ((Value.Arr)om.findStrict("$packages", "gnu.targets.arm")).add(pkgV);
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
        GCArmv5T$$OBJECTS();
        GCArmv6$$OBJECTS();
        GCArmv7A$$OBJECTS();
        M3$$OBJECTS();
        M4$$OBJECTS();
        M4F$$OBJECTS();
        A9$$OBJECTS();
        A15$$OBJECTS();
        MVArm9$$OBJECTS();
        UCArm9$$OBJECTS();
        GCArmv5T$$CONSTS();
        GCArmv6$$CONSTS();
        GCArmv7A$$CONSTS();
        M3$$CONSTS();
        M4$$CONSTS();
        M4F$$CONSTS();
        A9$$CONSTS();
        A15$$CONSTS();
        MVArm9$$CONSTS();
        UCArm9$$CONSTS();
        GCArmv5T$$CREATES();
        GCArmv6$$CREATES();
        GCArmv7A$$CREATES();
        M3$$CREATES();
        M4$$CREATES();
        M4F$$CREATES();
        A9$$CREATES();
        A15$$CREATES();
        MVArm9$$CREATES();
        UCArm9$$CREATES();
        GCArmv5T$$FUNCTIONS();
        GCArmv6$$FUNCTIONS();
        GCArmv7A$$FUNCTIONS();
        M3$$FUNCTIONS();
        M4$$FUNCTIONS();
        M4F$$FUNCTIONS();
        A9$$FUNCTIONS();
        A15$$FUNCTIONS();
        MVArm9$$FUNCTIONS();
        UCArm9$$FUNCTIONS();
        GCArmv5T$$SIZES();
        GCArmv6$$SIZES();
        GCArmv7A$$SIZES();
        M3$$SIZES();
        M4$$SIZES();
        M4F$$SIZES();
        A9$$SIZES();
        A15$$SIZES();
        MVArm9$$SIZES();
        UCArm9$$SIZES();
        GCArmv5T$$TYPES();
        GCArmv6$$TYPES();
        GCArmv7A$$TYPES();
        M3$$TYPES();
        M4$$TYPES();
        M4F$$TYPES();
        A9$$TYPES();
        A15$$TYPES();
        MVArm9$$TYPES();
        UCArm9$$TYPES();
        if (isROV) {
            GCArmv5T$$ROV();
            GCArmv6$$ROV();
            GCArmv7A$$ROV();
            M3$$ROV();
            M4$$ROV();
            M4F$$ROV();
            A9$$ROV();
            A15$$ROV();
            MVArm9$$ROV();
            UCArm9$$ROV();
        }//isROV
        $$SINGLETONS();
        GCArmv5T$$SINGLETONS();
        GCArmv6$$SINGLETONS();
        GCArmv7A$$SINGLETONS();
        M3$$SINGLETONS();
        M4$$SINGLETONS();
        M4F$$SINGLETONS();
        A9$$SINGLETONS();
        A15$$SINGLETONS();
        MVArm9$$SINGLETONS();
        UCArm9$$SINGLETONS();
        $$INITIALIZATION();
    }
}
