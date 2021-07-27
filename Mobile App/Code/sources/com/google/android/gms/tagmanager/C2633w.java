package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.w */
class C2633w extends C2588dg {

    /* renamed from: ID */
    private static final String f4479ID = C1259a.DATA_LAYER_WRITE.toString();
    private static final String VALUE = C1308b.VALUE.toString();
    private static final String ark = C1308b.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    private final DataLayer aqn;

    public C2633w(DataLayer dataLayer) {
        super(f4479ID, VALUE);
        this.aqn = dataLayer;
    }

    /* renamed from: a */
    private void m7698a(C1408d.C1409a aVar) {
        String j;
        if (aVar != null && aVar != C2590di.m7541qV() && (j = C2590di.m7533j(aVar)) != C2590di.m7547ra()) {
            this.aqn.mo18595cx(j);
        }
    }

    /* renamed from: b */
    private void m7699b(C1408d.C1409a aVar) {
        if (aVar != null && aVar != C2590di.m7541qV()) {
            Object o = C2590di.m7538o(aVar);
            if (o instanceof List) {
                for (Object next : (List) o) {
                    if (next instanceof Map) {
                        this.aqn.push((Map) next);
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public void mo18830D(Map<String, C1408d.C1409a> map) {
        m7699b(map.get(VALUE));
        m7698a(map.get(ark));
    }
}
