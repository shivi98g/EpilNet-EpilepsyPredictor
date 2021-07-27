package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.ah */
class C2472ah extends C2474aj {

    /* renamed from: ID */
    private static final String f4402ID = C1259a.EVENT.toString();
    private final C2561ct aqo;

    public C2472ah(C2561ct ctVar) {
        super(f4402ID, new String[0]);
        this.aqo = ctVar;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String qE = this.aqo.mo18798qE();
        return qE == null ? C2590di.m7548rb() : C2590di.m7551u(qE);
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return false;
    }
}
