package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.ft */
public final class C1569ft {
    private int mOrientation = -1;

    /* renamed from: pD */
    private String f3392pD;

    /* renamed from: uJ */
    private String f3393uJ;

    /* renamed from: uK */
    private String f3394uK;

    /* renamed from: uL */
    private List<String> f3395uL;

    /* renamed from: uM */
    private String f3396uM;

    /* renamed from: uN */
    private String f3397uN;

    /* renamed from: uO */
    private List<String> f3398uO;

    /* renamed from: uP */
    private long f3399uP = -1;

    /* renamed from: uQ */
    private boolean f3400uQ = false;

    /* renamed from: uR */
    private final long f3401uR = -1;

    /* renamed from: uS */
    private long f3402uS = -1;

    /* renamed from: uT */
    private boolean f3403uT = false;

    /* renamed from: uU */
    private boolean f3404uU = false;

    /* renamed from: uV */
    private boolean f3405uV = false;

    /* renamed from: uW */
    private boolean f3406uW = true;

    /* renamed from: uo */
    private List<String> f3407uo;

    /* renamed from: a */
    static String m4542a(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: b */
    static long m4543b(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        if (list == null || list.isEmpty()) {
            return -1;
        }
        String str2 = (String) list.get(0);
        try {
            return (long) (Float.parseFloat(str2) * 1000.0f);
        } catch (NumberFormatException e) {
            C1607gr.m4709W("Could not parse float from " + str + " header: " + str2);
            return -1;
        }
    }

    /* renamed from: c */
    static List<String> m4544c(Map<String, List<String>> map, String str) {
        String str2;
        List list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = (String) list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    /* renamed from: d */
    private boolean m4545d(Map<String, List<String>> map, String str) {
        List list = map.get(str);
        return list != null && !list.isEmpty() && Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    /* renamed from: f */
    private void m4546f(Map<String, List<String>> map) {
        this.f3393uJ = m4542a(map, "X-Afma-Ad-Size");
    }

    /* renamed from: g */
    private void m4547g(Map<String, List<String>> map) {
        List<String> c = m4544c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f3395uL = c;
        }
    }

    /* renamed from: h */
    private void m4548h(Map<String, List<String>> map) {
        List list = map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f3396uM = (String) list.get(0);
        }
    }

    /* renamed from: i */
    private void m4549i(Map<String, List<String>> map) {
        List<String> c = m4544c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f3398uO = c;
        }
    }

    /* renamed from: j */
    private void m4550j(Map<String, List<String>> map) {
        long b = m4543b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f3399uP = b;
        }
    }

    /* renamed from: k */
    private void m4551k(Map<String, List<String>> map) {
        this.f3397uN = m4542a(map, "X-Afma-ActiveView");
    }

    /* renamed from: l */
    private void m4552l(Map<String, List<String>> map) {
        this.f3404uU = m4545d(map, "X-Afma-Native") | this.f3404uU;
    }

    /* renamed from: m */
    private void m4553m(Map<String, List<String>> map) {
        this.f3403uT = m4545d(map, "X-Afma-Custom-Rendering-Allowed") | this.f3403uT;
    }

    /* renamed from: n */
    private void m4554n(Map<String, List<String>> map) {
        this.f3400uQ = m4545d(map, "X-Afma-Mediation") | this.f3400uQ;
    }

    /* renamed from: o */
    private void m4555o(Map<String, List<String>> map) {
        List<String> c = m4544c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f3407uo = c;
        }
    }

    /* renamed from: p */
    private void m4556p(Map<String, List<String>> map) {
        long b = m4543b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f3402uS = b;
        }
    }

    /* renamed from: q */
    private void m4557q(Map<String, List<String>> map) {
        int du;
        List list = map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                du = C1591gi.m4664dv();
            } else if ("landscape".equalsIgnoreCase(str)) {
                du = C1591gi.m4663du();
            } else {
                return;
            }
            this.mOrientation = du;
        }
    }

    /* renamed from: r */
    private void m4558r(Map<String, List<String>> map) {
        List list = map.get("X-Afma-Use-HTTPS");
        if (list != null && !list.isEmpty()) {
            this.f3405uV = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    /* renamed from: s */
    private void m4559s(Map<String, List<String>> map) {
        List list = map.get("X-Afma-Content-Url-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.f3406uW = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    /* renamed from: a */
    public void mo15325a(String str, Map<String, List<String>> map, String str2) {
        this.f3394uK = str;
        this.f3392pD = str2;
        mo15326e(map);
    }

    /* renamed from: e */
    public void mo15326e(Map<String, List<String>> map) {
        m4546f(map);
        m4547g(map);
        m4548h(map);
        m4549i(map);
        m4550j(map);
        m4554n(map);
        m4555o(map);
        m4556p(map);
        m4557q(map);
        m4551k(map);
        m4558r(map);
        m4553m(map);
        m4552l(map);
        m4559s(map);
    }

    /* renamed from: i */
    public C1548fj mo15327i(long j) {
        String str = this.f3394uK;
        String str2 = this.f3392pD;
        List<String> list = this.f3395uL;
        List<String> list2 = this.f3398uO;
        long j2 = this.f3399uP;
        boolean z = this.f3400uQ;
        List<String> list3 = this.f3407uo;
        long j3 = this.f3402uS;
        int i = this.mOrientation;
        String str3 = this.f3393uJ;
        String str4 = this.f3396uM;
        String str5 = this.f3397uN;
        boolean z2 = this.f3403uT;
        String str6 = str5;
        boolean z3 = this.f3404uU;
        String str7 = str4;
        return new C1548fj(str, str2, list, list2, j2, z, -1, list3, j3, i, str3, j, str7, str6, z2, z3, this.f3405uV, this.f3406uW);
    }
}
