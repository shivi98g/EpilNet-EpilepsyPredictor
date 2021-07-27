package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.bj */
class C2506bj extends C2474aj {

    /* renamed from: ID */
    private static final String f4426ID = C1259a.LOWERCASE_STRING.toString();
    private static final String arp = C1308b.ARG0.toString();

    public C2506bj() {
        super(f4426ID, arp);
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        return C2590di.m7551u(C2590di.m7533j(map.get(arp)).toLowerCase());
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
