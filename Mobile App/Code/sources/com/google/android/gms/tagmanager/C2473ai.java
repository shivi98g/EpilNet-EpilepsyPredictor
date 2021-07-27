package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1351c;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.ai */
class C2473ai {
    /* renamed from: a */
    private static void m7172a(DataLayer dataLayer, C1351c.C1355d dVar) {
        for (C1408d.C1409a j : dVar.f2740fB) {
            dataLayer.mo18595cx(C2590di.m7533j(j));
        }
    }

    /* renamed from: a */
    public static void m7173a(DataLayer dataLayer, C1351c.C1360i iVar) {
        if (iVar.f2781gq == null) {
            C2504bh.m7246W("supplemental missing experimentSupplemental");
            return;
        }
        m7172a(dataLayer, iVar.f2781gq);
        m7174b(dataLayer, iVar.f2781gq);
        m7176c(dataLayer, iVar.f2781gq);
    }

    /* renamed from: b */
    private static void m7174b(DataLayer dataLayer, C1351c.C1355d dVar) {
        for (C1408d.C1409a c : dVar.f2739fA) {
            Map<String, Object> c2 = m7175c(c);
            if (c2 != null) {
                dataLayer.push(c2);
            }
        }
    }

    /* renamed from: c */
    private static Map<String, Object> m7175c(C1408d.C1409a aVar) {
        Object o = C2590di.m7538o(aVar);
        if (o instanceof Map) {
            return (Map) o;
        }
        C2504bh.m7246W("value: " + o + " is not a map value, ignored.");
        return null;
    }

    /* renamed from: c */
    private static void m7176c(DataLayer dataLayer, C1351c.C1355d dVar) {
        String str;
        for (C1351c.C1354c cVar : dVar.f2741fC) {
            if (cVar.f2734fv == null) {
                str = "GaExperimentRandom: No key";
            } else {
                Object obj = dataLayer.get(cVar.f2734fv);
                Long valueOf = !(obj instanceof Number) ? null : Long.valueOf(((Number) obj).longValue());
                long j = cVar.f2735fw;
                long j2 = cVar.f2736fx;
                if (!cVar.f2737fy || valueOf == null || valueOf.longValue() < j || valueOf.longValue() > j2) {
                    if (j <= j2) {
                        obj = Long.valueOf(Math.round((Math.random() * ((double) (j2 - j))) + ((double) j)));
                    } else {
                        str = "GaExperimentRandom: random range invalid";
                    }
                }
                dataLayer.mo18595cx(cVar.f2734fv);
                Map<String, Object> c = dataLayer.mo18594c(cVar.f2734fv, obj);
                if (cVar.f2738fz > 0) {
                    if (!c.containsKey("gtm")) {
                        c.put("gtm", DataLayer.mapOf("lifetime", Long.valueOf(cVar.f2738fz)));
                    } else {
                        Object obj2 = c.get("gtm");
                        if (obj2 instanceof Map) {
                            ((Map) obj2).put("lifetime", Long.valueOf(cVar.f2738fz));
                        } else {
                            C2504bh.m7246W("GaExperimentRandom: gtm not a map");
                        }
                    }
                }
                dataLayer.push(c);
            }
            C2504bh.m7246W(str);
        }
    }
}
