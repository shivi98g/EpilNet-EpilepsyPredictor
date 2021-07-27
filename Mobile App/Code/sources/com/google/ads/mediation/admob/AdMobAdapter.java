package com.google.ads.mediation.admob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.C1606gq;
import java.util.Date;
import java.util.Set;

public final class AdMobAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {

    /* renamed from: i */
    private AdView f56i;

    /* renamed from: j */
    private InterstitialAd f57j;

    /* renamed from: com.google.ads.mediation.admob.AdMobAdapter$a */
    private static final class C0526a extends AdListener {

        /* renamed from: k */
        private final AdMobAdapter f58k;

        /* renamed from: l */
        private final MediationBannerListener f59l;

        public C0526a(AdMobAdapter adMobAdapter, MediationBannerListener mediationBannerListener) {
            this.f58k = adMobAdapter;
            this.f59l = mediationBannerListener;
        }

        public void onAdClosed() {
            this.f59l.onAdClosed(this.f58k);
        }

        public void onAdFailedToLoad(int i) {
            this.f59l.onAdFailedToLoad(this.f58k, i);
        }

        public void onAdLeftApplication() {
            this.f59l.onAdLeftApplication(this.f58k);
        }

        public void onAdLoaded() {
            this.f59l.onAdLoaded(this.f58k);
        }

        public void onAdOpened() {
            this.f59l.onAdClicked(this.f58k);
            this.f59l.onAdOpened(this.f58k);
        }
    }

    /* renamed from: com.google.ads.mediation.admob.AdMobAdapter$b */
    private static final class C0527b extends AdListener {

        /* renamed from: k */
        private final AdMobAdapter f60k;

        /* renamed from: m */
        private final MediationInterstitialListener f61m;

        public C0527b(AdMobAdapter adMobAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f60k = adMobAdapter;
            this.f61m = mediationInterstitialListener;
        }

        public void onAdClosed() {
            this.f61m.onAdClosed(this.f60k);
        }

        public void onAdFailedToLoad(int i) {
            this.f61m.onAdFailedToLoad(this.f60k, i);
        }

        public void onAdLeftApplication() {
            this.f61m.onAdLeftApplication(this.f60k);
        }

        public void onAdLoaded() {
            this.f61m.onAdLoaded(this.f60k);
        }

        public void onAdOpened() {
            this.f61m.onAdOpened(this.f60k);
        }
    }

    /* renamed from: a */
    static AdRequest m15a(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            builder.addTestDevice(C1606gq.m4704v(context));
        }
        if (bundle2.getInt("tagForChildDirectedTreatment") != -1) {
            builder.tagForChildDirectedTreatment(bundle2.getInt("tagForChildDirectedTreatment") == 1);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle2.getString("mad_hac"));
        if (!TextUtils.isEmpty(bundle2.getString("adJson"))) {
            bundle.putString("_ad", bundle2.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }

    public View getBannerView() {
        return this.f56i;
    }

    public void onDestroy() {
        if (this.f56i != null) {
            this.f56i.destroy();
            this.f56i = null;
        }
        if (this.f57j != null) {
            this.f57j = null;
        }
    }

    public void onPause() {
        if (this.f56i != null) {
            this.f56i.pause();
        }
    }

    public void onResume() {
        if (this.f56i != null) {
            this.f56i.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f56i = new AdView(context);
        this.f56i.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.f56i.setAdUnitId(bundle.getString("pubid"));
        this.f56i.setAdListener(new C0526a(this, mediationBannerListener));
        this.f56i.loadAd(m15a(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f57j = new InterstitialAd(context);
        this.f57j.setAdUnitId(bundle.getString("pubid"));
        this.f57j.setAdListener(new C0527b(this, mediationInterstitialListener));
        this.f57j.loadAd(m15a(context, mediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        this.f57j.show();
    }
}
