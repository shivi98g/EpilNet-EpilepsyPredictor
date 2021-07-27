package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.C1326bi;

public final class PublisherInterstitialAd {

    /* renamed from: lm */
    private final C1326bi f82lm;

    public PublisherInterstitialAd(Context context) {
        this.f82lm = new C1326bi(context, this);
    }

    public AdListener getAdListener() {
        return this.f82lm.getAdListener();
    }

    public String getAdUnitId() {
        return this.f82lm.getAdUnitId();
    }

    public AppEventListener getAppEventListener() {
        return this.f82lm.getAppEventListener();
    }

    public String getMediationAdapterClassName() {
        return this.f82lm.getMediationAdapterClassName();
    }

    public boolean isLoaded() {
        return this.f82lm.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f82lm.mo14907a(publisherAdRequest.mo10045Y());
    }

    public void setAdListener(AdListener adListener) {
        this.f82lm.setAdListener(adListener);
    }

    public void setAdUnitId(String str) {
        this.f82lm.setAdUnitId(str);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f82lm.setAppEventListener(appEventListener);
    }

    public void show() {
        this.f82lm.show();
    }
}
