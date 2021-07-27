package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.C1326bi;

public final class InterstitialAd {

    /* renamed from: lm */
    private final C1326bi f78lm;

    public InterstitialAd(Context context) {
        this.f78lm = new C1326bi(context);
    }

    public AdListener getAdListener() {
        return this.f78lm.getAdListener();
    }

    public String getAdUnitId() {
        return this.f78lm.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.f78lm.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName() {
        return this.f78lm.getMediationAdapterClassName();
    }

    public boolean isLoaded() {
        return this.f78lm.isLoaded();
    }

    public void loadAd(AdRequest adRequest) {
        this.f78lm.mo14907a(adRequest.mo9987Y());
    }

    public void setAdListener(AdListener adListener) {
        this.f78lm.setAdListener(adListener);
    }

    public void setAdUnitId(String str) {
        this.f78lm.setAdUnitId(str);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        this.f78lm.setInAppPurchaseListener(inAppPurchaseListener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        this.f78lm.setPlayStorePurchaseParams(playStorePurchaseListener, str);
    }

    public void show() {
        this.f78lm.show();
    }
}
