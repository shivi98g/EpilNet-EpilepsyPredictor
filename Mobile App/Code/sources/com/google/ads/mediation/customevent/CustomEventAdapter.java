package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.C1607gr;

public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {

    /* renamed from: n */
    private View f62n;

    /* renamed from: o */
    private CustomEventBanner f63o;

    /* renamed from: p */
    private CustomEventInterstitial f64p;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    private static final class C0528a implements CustomEventBannerListener {

        /* renamed from: q */
        private final CustomEventAdapter f65q;

        /* renamed from: r */
        private final MediationBannerListener f66r;

        public C0528a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f65q = customEventAdapter;
            this.f66r = mediationBannerListener;
        }

        public void onClick() {
            C1607gr.m4705S("Custom event adapter called onFailedToReceiveAd.");
            this.f66r.onClick(this.f65q);
        }

        public void onDismissScreen() {
            C1607gr.m4705S("Custom event adapter called onFailedToReceiveAd.");
            this.f66r.onDismissScreen(this.f65q);
        }

        public void onFailedToReceiveAd() {
            C1607gr.m4705S("Custom event adapter called onFailedToReceiveAd.");
            this.f66r.onFailedToReceiveAd(this.f65q, AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication() {
            C1607gr.m4705S("Custom event adapter called onFailedToReceiveAd.");
            this.f66r.onLeaveApplication(this.f65q);
        }

        public void onPresentScreen() {
            C1607gr.m4705S("Custom event adapter called onFailedToReceiveAd.");
            this.f66r.onPresentScreen(this.f65q);
        }

        public void onReceivedAd(View view) {
            C1607gr.m4705S("Custom event adapter called onReceivedAd.");
            this.f65q.m17a(view);
            this.f66r.onReceivedAd(this.f65q);
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    private class C0529b implements CustomEventInterstitialListener {

        /* renamed from: q */
        private final CustomEventAdapter f67q;

        /* renamed from: s */
        private final MediationInterstitialListener f68s;

        public C0529b(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f67q = customEventAdapter;
            this.f68s = mediationInterstitialListener;
        }

        public void onDismissScreen() {
            C1607gr.m4705S("Custom event adapter called onDismissScreen.");
            this.f68s.onDismissScreen(this.f67q);
        }

        public void onFailedToReceiveAd() {
            C1607gr.m4705S("Custom event adapter called onFailedToReceiveAd.");
            this.f68s.onFailedToReceiveAd(this.f67q, AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication() {
            C1607gr.m4705S("Custom event adapter called onLeaveApplication.");
            this.f68s.onLeaveApplication(this.f67q);
        }

        public void onPresentScreen() {
            C1607gr.m4705S("Custom event adapter called onPresentScreen.");
            this.f68s.onPresentScreen(this.f67q);
        }

        public void onReceivedAd() {
            C1607gr.m4705S("Custom event adapter called onReceivedAd.");
            this.f68s.onReceivedAd(CustomEventAdapter.this);
        }
    }

    /* renamed from: a */
    private static <T> T m16a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            C1607gr.m4709W("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17a(View view) {
        this.f62n = view;
    }

    public void destroy() {
        if (this.f63o != null) {
            this.f63o.destroy();
        }
        if (this.f64p != null) {
            this.f64p.destroy();
        }
    }

    public Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public View getBannerView() {
        return this.f62n;
    }

    public Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    public void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f63o = (CustomEventBanner) m16a(customEventServerParameters.className);
        if (this.f63o == null) {
            mediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
        } else {
            this.f63o.requestBannerAd(new C0528a(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        this.f64p = (CustomEventInterstitial) m16a(customEventServerParameters.className);
        if (this.f64p == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
        } else {
            this.f64p.requestInterstitialAd(new C0529b(this, mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    public void showInterstitial() {
        this.f64p.showInterstitial();
    }
}
