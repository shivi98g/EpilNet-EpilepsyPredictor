package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.ci */
public final class C1379ci implements C1374cd {

    /* renamed from: qc */
    private final C1375ce f2798qc;

    /* renamed from: qd */
    private final C2189v f2799qd;

    public C1379ci(C1375ce ceVar, C2189v vVar) {
        this.f2798qc = ceVar;
        this.f2799qd = vVar;
    }

    /* renamed from: b */
    private static boolean m4166b(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: c */
    private static int m4167c(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return C1591gi.m4664dv();
        }
        if ("l".equalsIgnoreCase(str)) {
            return C1591gi.m4663du();
        }
        return -1;
    }

    /* renamed from: a */
    public void mo14738a(C1610gu guVar, Map<String, String> map) {
        String str = map.get("a");
        if (str == null) {
            C1607gr.m4709W("Action missing from an open GMSG.");
        } else if (this.f2799qd == null || this.f2799qd.mo17150az()) {
            C1612gv dD = guVar.mo15426dD();
            if ("expand".equalsIgnoreCase(str)) {
                if (guVar.mo15430dH()) {
                    C1607gr.m4709W("Cannot expand WebView that is already expanded.");
                } else {
                    dD.mo15451a(m4166b(map), m4167c(map));
                }
            } else if ("webapp".equalsIgnoreCase(str)) {
                String str2 = map.get("u");
                if (str2 != null) {
                    dD.mo15452a(m4166b(map), m4167c(map), str2);
                } else {
                    dD.mo15453a(m4166b(map), m4167c(map), map.get("html"), map.get("baseurl"));
                }
            } else if ("in_app_purchase".equalsIgnoreCase(str)) {
                String str3 = map.get("product_id");
                String str4 = map.get("report_urls");
                if (this.f2798qc != null) {
                    if (str4 == null || str4.isEmpty()) {
                        this.f2798qc.mo15016a(str3, new ArrayList());
                        return;
                    }
                    this.f2798qc.mo15016a(str3, new ArrayList(Arrays.asList(str4.split(" "))));
                }
            } else {
                dD.mo15445a(new C1444do(map.get("i"), map.get("u"), map.get("m"), map.get("p"), map.get("c"), map.get("f"), map.get("e")));
            }
        } else {
            this.f2799qd.mo17151d(map.get("u"));
        }
    }
}
