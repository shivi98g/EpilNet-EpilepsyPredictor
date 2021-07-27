package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1408d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.di */
class C2590di {
    private static final Object auc = null;
    private static Long aud = new Long(0);
    private static Double aue = new Double(0.0d);
    private static C2589dh auf = C2589dh.m7521z(0);
    private static String aug = new String("");
    private static Boolean auh = new Boolean(false);
    private static List<Object> aui = new ArrayList(0);
    private static Map<Object, Object> auj = new HashMap();
    private static C1408d.C1409a auk = m7551u(aug);

    /* renamed from: cZ */
    public static C1408d.C1409a m7528cZ(String str) {
        C1408d.C1409a aVar = new C1408d.C1409a();
        aVar.type = 5;
        aVar.f2853gA = str;
        return aVar;
    }

    /* renamed from: da */
    private static C2589dh m7529da(String str) {
        try {
            return C2589dh.m7520cY(str);
        } catch (NumberFormatException e) {
            C2504bh.m7243T("Failed to convert '" + str + "' to a number.");
            return auf;
        }
    }

    /* renamed from: db */
    private static Long m7530db(String str) {
        C2589dh da = m7529da(str);
        return da == auf ? aud : Long.valueOf(da.longValue());
    }

    /* renamed from: dc */
    private static Double m7531dc(String str) {
        C2589dh da = m7529da(str);
        return da == auf ? aue : Double.valueOf(da.doubleValue());
    }

    /* renamed from: dd */
    private static Boolean m7532dd(String str) {
        return "true".equalsIgnoreCase(str) ? Boolean.TRUE : "false".equalsIgnoreCase(str) ? Boolean.FALSE : auh;
    }

    private static double getDouble(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        C2504bh.m7243T("getDouble received non-Number");
        return 0.0d;
    }

    /* renamed from: j */
    public static String m7533j(C1408d.C1409a aVar) {
        return m7539p(m7538o(aVar));
    }

    /* renamed from: k */
    public static C2589dh m7534k(C1408d.C1409a aVar) {
        return m7540q(m7538o(aVar));
    }

    /* renamed from: l */
    public static Long m7535l(C1408d.C1409a aVar) {
        return m7546r(m7538o(aVar));
    }

    /* renamed from: m */
    public static Double m7536m(C1408d.C1409a aVar) {
        return m7549s(m7538o(aVar));
    }

    /* renamed from: n */
    public static Boolean m7537n(C1408d.C1409a aVar) {
        return m7550t(m7538o(aVar));
    }

    /* renamed from: o */
    public static Object m7538o(C1408d.C1409a aVar) {
        if (aVar == null) {
            return auc;
        }
        int i = 0;
        switch (aVar.type) {
            case 1:
                return aVar.f2859gv;
            case 2:
                ArrayList arrayList = new ArrayList(aVar.f2860gw.length);
                C1408d.C1409a[] aVarArr = aVar.f2860gw;
                int length = aVarArr.length;
                while (i < length) {
                    Object o = m7538o(aVarArr[i]);
                    if (o == auc) {
                        return auc;
                    }
                    arrayList.add(o);
                    i++;
                }
                return arrayList;
            case 3:
                if (aVar.f2861gx.length != aVar.f2862gy.length) {
                    C2504bh.m7243T("Converting an invalid value to object: " + aVar.toString());
                    return auc;
                }
                HashMap hashMap = new HashMap(aVar.f2862gy.length);
                while (i < aVar.f2861gx.length) {
                    Object o2 = m7538o(aVar.f2861gx[i]);
                    Object o3 = m7538o(aVar.f2862gy[i]);
                    if (o2 == auc || o3 == auc) {
                        return auc;
                    }
                    hashMap.put(o2, o3);
                    i++;
                }
                return hashMap;
            case 4:
                C2504bh.m7243T("Trying to convert a macro reference to object");
                return auc;
            case 5:
                C2504bh.m7243T("Trying to convert a function id to object");
                return auc;
            case 6:
                return Long.valueOf(aVar.f2854gB);
            case 7:
                StringBuffer stringBuffer = new StringBuffer();
                C1408d.C1409a[] aVarArr2 = aVar.f2856gD;
                int length2 = aVarArr2.length;
                while (i < length2) {
                    String j = m7533j(aVarArr2[i]);
                    if (j == aug) {
                        return auc;
                    }
                    stringBuffer.append(j);
                    i++;
                }
                return stringBuffer.toString();
            case 8:
                return Boolean.valueOf(aVar.f2855gC);
            default:
                C2504bh.m7243T("Failed to convert a value of type: " + aVar.type);
                return auc;
        }
    }

    /* renamed from: p */
    public static String m7539p(Object obj) {
        return obj == null ? aug : obj.toString();
    }

    /* renamed from: q */
    public static C2589dh m7540q(Object obj) {
        return obj instanceof C2589dh ? (C2589dh) obj : m7553w(obj) ? C2589dh.m7521z(m7554x(obj)) : m7552v(obj) ? C2589dh.m7519a(Double.valueOf(getDouble(obj))) : m7529da(m7539p(obj));
    }

    /* renamed from: qV */
    public static Object m7541qV() {
        return auc;
    }

    /* renamed from: qW */
    public static Long m7542qW() {
        return aud;
    }

    /* renamed from: qX */
    public static Double m7543qX() {
        return aue;
    }

    /* renamed from: qY */
    public static Boolean m7544qY() {
        return auh;
    }

    /* renamed from: qZ */
    public static C2589dh m7545qZ() {
        return auf;
    }

    /* renamed from: r */
    public static Long m7546r(Object obj) {
        return m7553w(obj) ? Long.valueOf(m7554x(obj)) : m7530db(m7539p(obj));
    }

    /* renamed from: ra */
    public static String m7547ra() {
        return aug;
    }

    /* renamed from: rb */
    public static C1408d.C1409a m7548rb() {
        return auk;
    }

    /* renamed from: s */
    public static Double m7549s(Object obj) {
        return m7552v(obj) ? Double.valueOf(getDouble(obj)) : m7531dc(m7539p(obj));
    }

    /* renamed from: t */
    public static Boolean m7550t(Object obj) {
        return obj instanceof Boolean ? (Boolean) obj : m7532dd(m7539p(obj));
    }

    /* renamed from: u */
    public static C1408d.C1409a m7551u(Object obj) {
        String obj2;
        C1408d.C1409a aVar = new C1408d.C1409a();
        if (obj instanceof C1408d.C1409a) {
            return (C1408d.C1409a) obj;
        }
        boolean z = false;
        if (obj instanceof String) {
            aVar.type = 1;
            obj2 = (String) obj;
        } else {
            if (obj instanceof List) {
                aVar.type = 2;
                List<Object> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                boolean z2 = false;
                for (Object u : list) {
                    C1408d.C1409a u2 = m7551u(u);
                    if (u2 == auk) {
                        return auk;
                    }
                    z2 = z2 || u2.f2858gF;
                    arrayList.add(u2);
                }
                aVar.f2860gw = (C1408d.C1409a[]) arrayList.toArray(new C1408d.C1409a[0]);
                z = z2;
            } else if (obj instanceof Map) {
                aVar.type = 3;
                Set<Map.Entry> entrySet = ((Map) obj).entrySet();
                ArrayList arrayList2 = new ArrayList(entrySet.size());
                ArrayList arrayList3 = new ArrayList(entrySet.size());
                boolean z3 = false;
                for (Map.Entry entry : entrySet) {
                    C1408d.C1409a u3 = m7551u(entry.getKey());
                    C1408d.C1409a u4 = m7551u(entry.getValue());
                    if (u3 == auk || u4 == auk) {
                        return auk;
                    }
                    z3 = z3 || u3.f2858gF || u4.f2858gF;
                    arrayList2.add(u3);
                    arrayList3.add(u4);
                }
                aVar.f2861gx = (C1408d.C1409a[]) arrayList2.toArray(new C1408d.C1409a[0]);
                aVar.f2862gy = (C1408d.C1409a[]) arrayList3.toArray(new C1408d.C1409a[0]);
                z = z3;
            } else if (m7552v(obj)) {
                aVar.type = 1;
                obj2 = obj.toString();
            } else if (m7553w(obj)) {
                aVar.type = 6;
                aVar.f2854gB = m7554x(obj);
            } else if (obj instanceof Boolean) {
                aVar.type = 8;
                aVar.f2855gC = ((Boolean) obj).booleanValue();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Converting to Value from unknown object type: ");
                sb.append(obj == null ? "null" : obj.getClass().toString());
                C2504bh.m7243T(sb.toString());
                return auk;
            }
            aVar.f2858gF = z;
            return aVar;
        }
        aVar.f2859gv = obj2;
        aVar.f2858gF = z;
        return aVar;
    }

    /* renamed from: v */
    private static boolean m7552v(Object obj) {
        if ((obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        return (obj instanceof C2589dh) && ((C2589dh) obj).mo18840qQ();
    }

    /* renamed from: w */
    private static boolean m7553w(Object obj) {
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return true;
        }
        return (obj instanceof C2589dh) && ((C2589dh) obj).mo18841qR();
    }

    /* renamed from: x */
    private static long m7554x(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        C2504bh.m7243T("getInt64 received non-Number");
        return 0;
    }
}
