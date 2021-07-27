package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.by */
abstract class C2522by extends C2530cd {
    public C2522by(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18709a(C1408d.C1409a aVar, C1408d.C1409a aVar2, Map<String, C1408d.C1409a> map) {
        C2589dh k = C2590di.m7534k(aVar);
        C2589dh k2 = C2590di.m7534k(aVar2);
        if (k == C2590di.m7545qZ() || k2 == C2590di.m7545qZ()) {
            return false;
        }
        return mo18649a(k, k2, map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18649a(C2589dh dhVar, C2589dh dhVar2, Map<String, C1408d.C1409a> map);
}
