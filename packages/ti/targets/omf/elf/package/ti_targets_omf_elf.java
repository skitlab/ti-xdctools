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

public class ti_targets_omf_elf
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
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("ti.targets.omf.elf.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("ti.targets.omf.elf", new Value.Obj("ti.targets.omf.elf", pkgP));
    }

    void $$SINGLETONS()
    {
        pkgP.init("ti.targets.omf.elf.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "ti.targets.omf.elf"));
        pkgP.bind("$capsule", $$UNDEF);
        pkgV.init2(pkgP, "ti.targets.omf.elf", Value.DEFAULT, false);
        pkgV.bind("$name", "ti.targets.omf.elf");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "ti.targets.omf.elf.");
        pkgV.bind("$vers", Global.newArray());
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['ti.targets.omf.elf'];\n");
        sb.append("if (pkg.$vers.length >= 3) {\n");
            sb.append("pkg.$vers.push(Packages.xdc.services.global.Vers.getDate(xdc.csd() + '/..'));\n");
        sb.append("}\n");
        sb.append("pkg.build.libraries = [\n");
            sb.append("'lib/elf.a64',\n");
            sb.append("'lib/elf.a64P',\n");
            sb.append("'lib/elf.a64Pe',\n");
            sb.append("'lib/elf.a67P',\n");
            sb.append("'lib/elf.a674',\n");
            sb.append("'lib/elf.a674e',\n");
            sb.append("'lib/elf.a66',\n");
            sb.append("'lib/elf.a66e',\n");
            sb.append("'lib/elf.a28',\n");
            sb.append("'lib/elf.a28L',\n");
            sb.append("'lib/elf.a28FP',\n");
            sb.append("'lib/elf.a64T',\n");
            sb.append("'lib/elf.a64Te',\n");
            sb.append("'lib/elf.ae7',\n");
            sb.append("'lib/elf.ae7e',\n");
            sb.append("'lib/elf.ae9',\n");
            sb.append("'lib/elf.ae9t',\n");
            sb.append("'lib/elf.aea8f',\n");
            sb.append("'lib/elf.aea8ft',\n");
            sb.append("'lib/elf.aea8fv',\n");
            sb.append("'lib/elf.aea8fnv',\n");
            sb.append("'lib/elf.aem3',\n");
            sb.append("'lib/elf.aem3e',\n");
            sb.append("'lib/elf.aem4',\n");
            sb.append("'lib/elf.aem4f',\n");
            sb.append("'lib/elf.aer4',\n");
            sb.append("'lib/elf.aer4e',\n");
            sb.append("'lib/elf.aer4t',\n");
            sb.append("'lib/elf.aer4te',\n");
            sb.append("'lib/elf.aer4ft',\n");
            sb.append("'lib/elf.aer4fe',\n");
            sb.append("'lib/elf.aer4fte',\n");
            sb.append("'lib/elf.ae64P',\n");
            sb.append("'lib/elf.ae64T',\n");
            sb.append("'lib/elf.ae674',\n");
            sb.append("'lib/elf.ae470',\n");
            sb.append("'lib/elf.ae64Pe',\n");
            sb.append("'lib/elf.ae64Te',\n");
            sb.append("'lib/elf.ae674e',\n");
            sb.append("'lib/elf.ae67P',\n");
            sb.append("'lib/elf.ae66',\n");
            sb.append("'lib/elf.ae66e',\n");
            sb.append("'lib/elf.aearp32',\n");
            sb.append("'lib/elf.aearp32F',\n");
            sb.append("'lib/elf.a86U',\n");
            sb.append("'lib/elf.a86GW',\n");
            sb.append("'lib/elf.a5',\n");
            sb.append("'lib/elf.av5T',\n");
            sb.append("'lib/elf.av6',\n");
            sb.append("'lib/elf.av7A',\n");
            sb.append("'lib/elf.am3g',\n");
            sb.append("'lib/elf.am4g',\n");
            sb.append("'lib/elf.am4fg',\n");
            sb.append("'lib/elf.a470uC',\n");
            sb.append("'lib/elf.a470MV',\n");
            sb.append("'lib/elf.aa9g',\n");
            sb.append("'lib/elf.aa15g',\n");
            sb.append("'lib/elf.a86N',\n");
            sb.append("'lib/elf.a86',\n");
            sb.append("'lib/elf.a86W',\n");
            sb.append("'lib/elf.abnc',\n");
            sb.append("'lib/elf.aqv7',\n");
            sb.append("'lib/elf.av4TCE',\n");
        sb.append("];\n");
        sb.append("pkg.build.libDesc = [\n");
            sb.append("['lib/elf.a64', {target: 'ti.targets.C64', suffix: '64'}],\n");
            sb.append("['lib/elf.a64P', {target: 'ti.targets.C64P', suffix: '64P'}],\n");
            sb.append("['lib/elf.a64Pe', {target: 'ti.targets.C64P_big_endian', suffix: '64Pe'}],\n");
            sb.append("['lib/elf.a67P', {target: 'ti.targets.C67P', suffix: '67P'}],\n");
            sb.append("['lib/elf.a674', {target: 'ti.targets.C674', suffix: '674'}],\n");
            sb.append("['lib/elf.a674e', {target: 'ti.targets.C674_big_endian', suffix: '674e'}],\n");
            sb.append("['lib/elf.a66', {target: 'ti.targets.C66', suffix: '66'}],\n");
            sb.append("['lib/elf.a66e', {target: 'ti.targets.C66_big_endian', suffix: '66e'}],\n");
            sb.append("['lib/elf.a28', {target: 'ti.targets.C28', suffix: '28'}],\n");
            sb.append("['lib/elf.a28L', {target: 'ti.targets.C28_large', suffix: '28L'}],\n");
            sb.append("['lib/elf.a28FP', {target: 'ti.targets.C28_float', suffix: '28FP'}],\n");
            sb.append("['lib/elf.a64T', {target: 'ti.targets.C64T', suffix: '64T'}],\n");
            sb.append("['lib/elf.a64Te', {target: 'ti.targets.C64T_big_endian', suffix: '64Te'}],\n");
            sb.append("['lib/elf.ae7', {target: 'ti.targets.arm.elf.Arm7', suffix: 'e7'}],\n");
            sb.append("['lib/elf.ae7e', {target: 'ti.targets.arm.elf.Arm7_big_endian', suffix: 'e7e'}],\n");
            sb.append("['lib/elf.ae9', {target: 'ti.targets.arm.elf.Arm9', suffix: 'e9'}],\n");
            sb.append("['lib/elf.ae9t', {target: 'ti.targets.arm.elf.Arm9t', suffix: 'e9t'}],\n");
            sb.append("['lib/elf.aea8f', {target: 'ti.targets.arm.elf.A8F', suffix: 'ea8f'}],\n");
            sb.append("['lib/elf.aea8ft', {target: 'ti.targets.arm.elf.A8Ft', suffix: 'ea8ft'}],\n");
            sb.append("['lib/elf.aea8fv', {target: 'ti.targets.arm.elf.A8Fv', suffix: 'ea8fv'}],\n");
            sb.append("['lib/elf.aea8fnv', {target: 'ti.targets.arm.elf.A8Fnv', suffix: 'ea8fnv'}],\n");
            sb.append("['lib/elf.aem3', {target: 'ti.targets.arm.elf.M3', suffix: 'em3'}],\n");
            sb.append("['lib/elf.aem3e', {target: 'ti.targets.arm.elf.M3_big_endian', suffix: 'em3e'}],\n");
            sb.append("['lib/elf.aem4', {target: 'ti.targets.arm.elf.M4', suffix: 'em4'}],\n");
            sb.append("['lib/elf.aem4f', {target: 'ti.targets.arm.elf.M4F', suffix: 'em4f'}],\n");
            sb.append("['lib/elf.aer4', {target: 'ti.targets.arm.elf.R4', suffix: 'er4'}],\n");
            sb.append("['lib/elf.aer4e', {target: 'ti.targets.arm.elf.R4_big_endian', suffix: 'er4e'}],\n");
            sb.append("['lib/elf.aer4t', {target: 'ti.targets.arm.elf.R4t', suffix: 'er4t'}],\n");
            sb.append("['lib/elf.aer4te', {target: 'ti.targets.arm.elf.R4t_big_endian', suffix: 'er4te'}],\n");
            sb.append("['lib/elf.aer4ft', {target: 'ti.targets.arm.elf.R4Ft', suffix: 'er4ft'}],\n");
            sb.append("['lib/elf.aer4fe', {target: 'ti.targets.arm.elf.R4F_big_endian', suffix: 'er4fe'}],\n");
            sb.append("['lib/elf.aer4fte', {target: 'ti.targets.arm.elf.R4Ft_big_endian', suffix: 'er4fte'}],\n");
            sb.append("['lib/elf.ae64P', {target: 'ti.targets.elf.C64P', suffix: 'e64P'}],\n");
            sb.append("['lib/elf.ae64T', {target: 'ti.targets.elf.C64T', suffix: 'e64T'}],\n");
            sb.append("['lib/elf.ae674', {target: 'ti.targets.elf.C674', suffix: 'e674'}],\n");
            sb.append("['lib/elf.ae470', {target: 'ti.targets.elf.TMS470', suffix: 'e470'}],\n");
            sb.append("['lib/elf.ae64Pe', {target: 'ti.targets.elf.C64P_big_endian', suffix: 'e64Pe'}],\n");
            sb.append("['lib/elf.ae64Te', {target: 'ti.targets.elf.C64T_big_endian', suffix: 'e64Te'}],\n");
            sb.append("['lib/elf.ae674e', {target: 'ti.targets.elf.C674_big_endian', suffix: 'e674e'}],\n");
            sb.append("['lib/elf.ae67P', {target: 'ti.targets.elf.C67P', suffix: 'e67P'}],\n");
            sb.append("['lib/elf.ae66', {target: 'ti.targets.elf.C66', suffix: 'e66'}],\n");
            sb.append("['lib/elf.ae66e', {target: 'ti.targets.elf.C66_big_endian', suffix: 'e66e'}],\n");
            sb.append("['lib/elf.aearp32', {target: 'ti.targets.arp32.elf.ARP32', suffix: 'earp32'}],\n");
            sb.append("['lib/elf.aearp32F', {target: 'ti.targets.arp32.elf.ARP32_far', suffix: 'earp32F'}],\n");
            sb.append("['lib/elf.a86U', {target: 'gnu.targets.Linux86', suffix: '86U'}],\n");
            sb.append("['lib/elf.a86GW', {target: 'gnu.targets.Mingw', suffix: '86GW'}],\n");
            sb.append("['lib/elf.a5', {target: 'gnu.targets.Sparc', suffix: '5'}],\n");
            sb.append("['lib/elf.av5T', {target: 'gnu.targets.arm.GCArmv5T', suffix: 'v5T'}],\n");
            sb.append("['lib/elf.av6', {target: 'gnu.targets.arm.GCArmv6', suffix: 'v6'}],\n");
            sb.append("['lib/elf.av7A', {target: 'gnu.targets.arm.GCArmv7A', suffix: 'v7A'}],\n");
            sb.append("['lib/elf.am3g', {target: 'gnu.targets.arm.M3', suffix: 'm3g'}],\n");
            sb.append("['lib/elf.am4g', {target: 'gnu.targets.arm.M4', suffix: 'm4g'}],\n");
            sb.append("['lib/elf.am4fg', {target: 'gnu.targets.arm.M4F', suffix: 'm4fg'}],\n");
            sb.append("['lib/elf.a470uC', {target: 'gnu.targets.arm.UCArm9', suffix: '470uC'}],\n");
            sb.append("['lib/elf.a470MV', {target: 'gnu.targets.arm.MVArm9', suffix: '470MV'}],\n");
            sb.append("['lib/elf.aa9g', {target: 'gnu.targets.arm.A9', suffix: 'a9g'}],\n");
            sb.append("['lib/elf.aa15g', {target: 'gnu.targets.arm.A15', suffix: 'a15g'}],\n");
            sb.append("['lib/elf.a86N', {target: 'microsoft.targets.Net32', suffix: '86N'}],\n");
            sb.append("['lib/elf.a86', {target: 'microsoft.targets.VC98', suffix: '86'}],\n");
            sb.append("['lib/elf.a86W', {target: 'microsoft.targets.Win32', suffix: '86W'}],\n");
            sb.append("['lib/elf.abnc', {target: 'google.targets.arm.Bionic', suffix: 'bnc'}],\n");
            sb.append("['lib/elf.aqv7', {target: 'qnx.targets.arm.Qnx', suffix: 'qv7'}],\n");
            sb.append("['lib/elf.av4TCE', {target: 'microsoft.targets.arm.WinCE', suffix: 'v4TCE'}],\n");
        sb.append("];\n");
        Global.eval(sb.toString());
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("init", pkgV);
        ((Value.Arr)om.findStrict("$packages", "ti.targets.omf.elf")).add(pkgV);
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
