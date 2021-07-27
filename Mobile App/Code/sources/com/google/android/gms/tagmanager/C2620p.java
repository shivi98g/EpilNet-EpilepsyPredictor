package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.p */
class C2620p extends C2474aj {

    /* renamed from: ID */
    private static final String f4472ID = C1259a.CONTAINER_VERSION.toString();

    /* renamed from: TU */
    private final String f4473TU;

    public C2620p(String str) {
        super(f4472ID, new String[0]);
        this.f4473TU = str;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        return this.f4473TU == null ? C2590di.m7548rb() : C2590di.m7551u(this.f4473TU);
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
