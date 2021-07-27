package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.ad */
class C2468ad extends C2584dd {

    /* renamed from: ID */
    private static final String f4400ID = C1259a.ENDS_WITH.toString();

    public C2468ad() {
        super(f4400ID);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18639a(String str, String str2, Map<String, C1408d.C1409a> map) {
        return str.endsWith(str2);
    }
}
