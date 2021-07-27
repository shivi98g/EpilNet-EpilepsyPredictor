package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.dd */
abstract class C2584dd extends C2530cd {
    public C2584dd(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18709a(C1408d.C1409a aVar, C1408d.C1409a aVar2, Map<String, C1408d.C1409a> map) {
        String j = C2590di.m7533j(aVar);
        String j2 = C2590di.m7533j(aVar2);
        if (j == C2590di.m7547ra() || j2 == C2590di.m7547ra()) {
            return false;
        }
        return mo18639a(j, j2, map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18639a(String str, String str2, Map<String, C1408d.C1409a> map);
}
