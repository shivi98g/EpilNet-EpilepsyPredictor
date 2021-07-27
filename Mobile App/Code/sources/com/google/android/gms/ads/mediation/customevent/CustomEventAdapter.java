package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.C1607gr;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {

    /* renamed from: n */
    private View f95n;

    /* renamed from: xu */
    private CustomEventBanner f96xu;

    /* renamed from: xv */
    private CustomEventInterstitial f97xv;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    private static final class C0539a implements CustomEventBannerListener {

        /* renamed from: l */
        private final MediationBannerListener f98l;

        /* renamed from: xw */
        private final CustomEventAdapter f99xw;

        public C0539a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f99xw = customEventAdapter;
            this.f98l = mediationBannerListener;
        }

        public void onAdClicked() {
            C1607gr.m4705S("Custom event adapter called onAdClicked.");
            this.f98l.onAdClicked(this.f99xw);
        }

        public void onAdClosed() {
            C1607gr.m4705S("Custom event adapter called onAdClosed.");
            this.f98l.onAdClosed(this.f99xw);
        }

        public void onAdFailedToLoad(int i) {
            C1607gr.m4705S("Custom event adapter called onAdFailedToLoad.");
            this.f98l.onAdFailedToLoad(this.f99xw, i);
        }

        public void onAdLeftApplication() {
            C1607gr.m4705S("Custom event adapter called onAdLeftApplication.");
            this.f98l.onAdLeftApplication(this.f99xw);
        }

        public void onAdLoaded(View view) {
            C1607gr.m4705S("Custom event adapter called onAdLoaded.");
            this.f99xw.m32a(view);
            this.f98l.onAdLoaded(this.f99xw);
        }

        public void onAdOpened() {
            C1607gr.m4705S("Custom event adapter called onAdOpened.");
            this.f98l.onAdOpened(this.f99xw);
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    private class C0540b implements CustomEventInterstitialListener {

        /* renamed from: m */
        private final MediationInterstitialListener f100m;

        /* renamed from: xw */
        private final CustomEventAdapter f101xw;

        public C0540b(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f101xw = customEventAdapter;
            this.f100m = mediationInterstitialListener;
        }

        public void onAdClicked() {
            C1607gr.m4705S("Custom event adapter called onAdClicked.");
            this.f100m.onAdClicked(this.f101xw);
        }

        public void onAdClosed() {
            C1607gr.m4705S("Custom event adapter called onAdClosed.");
            this.f100m.onAdClosed(this.f101xw);
        }

        public void onAdFailedToLoad(int i) {
            C1607gr.m4705S("Custom event adapter called onFailedToReceiveAd.");
            this.f100m.onAdFailedToLoad(this.f101xw, i);
        }

        public void onAdLeftApplication() {
            C1607gr.m4705S("Custom event adapter called onAdLeftApplication.");
            this.f100m.onAdLeftApplication(this.f101xw);
        }

        public void onAdLoaded() {
            C1607gr.m4705S("Custom event adapter called onReceivedAd.");
            this.f100m.onAdLoaded(CustomEventAdapter.this);
        }

        public void onAdOpened() {
            C1607gr.m4705S("Custom event adapter called onAdOpened.");
            this.f100m.onAdOpened(this.f101xw);
        }
    }

    /* renamed from: a */
    private static <T> T m31a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            C1607gr.m4709W("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32a(View view) {
        this.f95n = view;
    }

    public View getBannerView() {
        return this.f95n;
    }

    public void onDestroy() {
        if (this.f96xu != null) {
            this.f96xu.onDestroy();
        }
        if (this.f97xv != null) {
            this.f97xv.onDestroy();
        }
    }

    public void onPause() {
        if (this.f96xu != null) {
            this.f96xu.onPause();
        }
        if (this.f97xv != null) {
            this.f97xv.onPause();
        }
    }

    public void onResume() {
        if (this.f96xu != null) {
            this.f96xu.onResume();
        }
        if (this.f97xv != null) {
            this.f97xv.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f96xu = (CustomEventBanner) m31a(bundle.getString("class_name"));
        if (this.f96xu == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
        } else {
            this.f96xu.requestBannerAd(context, new C0539a(this, mediationBannerListener), bundle.getString("parameter"), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f97xv = (CustomEventInterstitial) m31a(bundle.getString("class_name"));
        if (this.f97xv == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
        } else {
            this.f97xv.requestInterstitialAd(context, new C0540b(this, mediationInterstitialListener), bundle.getString("parameter"), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public void showInterstitial() {
        this.f97xv.showInterstitial();
    }
}
