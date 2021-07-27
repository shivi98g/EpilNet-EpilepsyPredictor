package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.u */
class C2626u extends C2474aj {

    /* renamed from: ID */
    private static final String f4476ID = C1259a.CUSTOM_VAR.toString();
    private static final String NAME = C1308b.NAME.toString();
    private static final String aqZ = C1308b.DEFAULT_VALUE.toString();
    private final DataLayer aqn;

    public C2626u(DataLayer dataLayer) {
        super(f4476ID, NAME);
        this.aqn = dataLayer;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        Object obj = this.aqn.get(C2590di.m7533j(map.get(NAME)));
        if (obj != null) {
            return C2590di.m7551u(obj);
        }
        C1408d.C1409a aVar = map.get(aqZ);
        return aVar != null ? aVar : C2590di.m7548rb();
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return false;
    }
}
