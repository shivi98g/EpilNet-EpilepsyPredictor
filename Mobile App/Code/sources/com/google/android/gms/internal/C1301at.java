package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.C1311bc;

@C1507ey
/* renamed from: com.google.android.gms.internal.at */
public final class C1301at extends C1311bc.C1312a {

    /* renamed from: ob */
    private final AdListener f2383ob;

    public C1301at(AdListener adListener) {
        this.f2383ob = adListener;
    }

    public void onAdClosed() {
        this.f2383ob.onAdClosed();
    }

    public void onAdFailedToLoad(int i) {
        this.f2383ob.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication() {
        this.f2383ob.onAdLeftApplication();
    }

    public void onAdLoaded() {
        this.f2383ob.onAdLoaded();
    }

    public void onAdOpened() {
        this.f2383ob.onAdOpened();
    }
}
