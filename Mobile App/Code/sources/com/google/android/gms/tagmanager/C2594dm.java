package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1408d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.google.android.gms.tagmanager.dm */
class C2594dm {
    /* renamed from: a */
    private static C2523bz<C1408d.C1409a> m7578a(C2523bz<C1408d.C1409a> bzVar) {
        try {
            return new C2523bz<>(C2590di.m7551u(m7581dg(C2590di.m7533j(bzVar.getObject()))), bzVar.mo18711pX());
        } catch (UnsupportedEncodingException e) {
            C2504bh.m7247b("Escape URI: unsupported encoding", e);
            return bzVar;
        }
    }

    /* renamed from: a */
    private static C2523bz<C1408d.C1409a> m7579a(C2523bz<C1408d.C1409a> bzVar, int i) {
        String str;
        if (!m7582q(bzVar.getObject())) {
            str = "Escaping can only be applied to strings.";
        } else if (i == 12) {
            return m7578a(bzVar);
        } else {
            str = "Unsupported Value Escaping: " + i;
        }
        C2504bh.m7243T(str);
        return bzVar;
    }

    /* renamed from: a */
    static C2523bz<C1408d.C1409a> m7580a(C2523bz<C1408d.C1409a> bzVar, int... iArr) {
        for (int a : iArr) {
            bzVar = m7579a(bzVar, a);
        }
        return bzVar;
    }

    /* renamed from: dg */
    static String m7581dg(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    /* renamed from: q */
    private static boolean m7582q(C1408d.C1409a aVar) {
        return C2590di.m7538o(aVar) instanceof String;
    }
}
