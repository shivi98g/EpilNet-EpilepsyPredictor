package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.dc */
class C2583dc extends C2584dd {

    /* renamed from: ID */
    private static final String f4453ID = C1259a.STARTS_WITH.toString();

    public C2583dc() {
        super(f4453ID);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18639a(String str, String str2, Map<String, C1408d.C1409a> map) {
        return str.startsWith(str2);
    }
}
