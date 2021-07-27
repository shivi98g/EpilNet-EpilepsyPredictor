package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

@C1507ey
/* renamed from: com.google.android.gms.internal.dd */
public final class C1415dd implements MediationBannerListener, MediationInterstitialListener {

    /* renamed from: qW */
    private final C1410da f2872qW;

    public C1415dd(C1410da daVar) {
        this.f2872qW = daVar;
    }

    public void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        C1785jx.m5357aU("onAdClicked must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdClicked.");
        try {
            this.f2872qW.onAdClicked();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdClicked.", e);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1785jx.m5357aU("onAdClicked must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdClicked.");
        try {
            this.f2872qW.onAdClicked();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdClicked.", e);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        C1785jx.m5357aU("onAdClosed must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdClosed.");
        try {
            this.f2872qW.onAdClosed();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdClosed.", e);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1785jx.m5357aU("onAdClosed must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdClosed.");
        try {
            this.f2872qW.onAdClosed();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdClosed.", e);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        C1785jx.m5357aU("onAdFailedToLoad must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.f2872qW.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C1785jx.m5357aU("onAdFailedToLoad must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f2872qW.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        C1785jx.m5357aU("onAdLeftApplication must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdLeftApplication.");
        try {
            this.f2872qW.onAdLeftApplication();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1785jx.m5357aU("onAdLeftApplication must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdLeftApplication.");
        try {
            this.f2872qW.onAdLeftApplication();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        C1785jx.m5357aU("onAdLoaded must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdLoaded.");
        try {
            this.f2872qW.onAdLoaded();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdLoaded.", e);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1785jx.m5357aU("onAdLoaded must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdLoaded.");
        try {
            this.f2872qW.onAdLoaded();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdLoaded.", e);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        C1785jx.m5357aU("onAdOpened must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdOpened.");
        try {
            this.f2872qW.onAdOpened();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdOpened.", e);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C1785jx.m5357aU("onAdOpened must be called on the main UI thread.");
        C1607gr.m4705S("Adapter called onAdOpened.");
        try {
            this.f2872qW.onAdOpened();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdOpened.", e);
        }
    }
}
