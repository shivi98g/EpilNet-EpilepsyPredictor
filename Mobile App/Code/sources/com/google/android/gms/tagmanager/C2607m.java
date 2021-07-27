package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.m */
class C2607m extends C2474aj {

    /* renamed from: ID */
    private static final String f4466ID = C1259a.CONSTANT.toString();
    private static final String VALUE = C1308b.VALUE.toString();

    public C2607m() {
        super(f4466ID, VALUE);
    }

    /* renamed from: ph */
    public static String m7602ph() {
        return f4466ID;
    }

    /* renamed from: pi */
    public static String m7603pi() {
        return VALUE;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        return map.get(VALUE);
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
