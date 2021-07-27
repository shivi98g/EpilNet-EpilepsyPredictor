package com.google.android.gms.tagmanager;

import android.os.Build;

/* renamed from: com.google.android.gms.tagmanager.bn */
class C2510bn {
    C2510bn() {
    }

    /* renamed from: pO */
    public C2509bm mo18685pO() {
        return mo18686pg() < 8 ? new C2487av() : new C2488aw();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pg */
    public int mo18686pg() {
        return Build.VERSION.SDK_INT;
    }
}
