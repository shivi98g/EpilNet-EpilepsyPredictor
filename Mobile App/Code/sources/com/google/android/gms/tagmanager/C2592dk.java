package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.dk */
class C2592dk extends C2474aj {

    /* renamed from: ID */
    private static final String f4458ID = C1259a.UPPERCASE_STRING.toString();
    private static final String arp = C1308b.ARG0.toString();

    public C2592dk() {
        super(f4458ID, arp);
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        return C2590di.m7551u(C2590di.m7533j(map.get(arp)).toUpperCase());
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
