package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.C1320bf;

@C1507ey
/* renamed from: com.google.android.gms.internal.ba */
public final class C1309ba extends C1320bf.C1321a {

    /* renamed from: os */
    private final AppEventListener f2612os;

    public C1309ba(AppEventListener appEventListener) {
        this.f2612os = appEventListener;
    }

    public void onAppEvent(String str, String str2) {
        this.f2612os.onAppEvent(str, str2);
    }
}
