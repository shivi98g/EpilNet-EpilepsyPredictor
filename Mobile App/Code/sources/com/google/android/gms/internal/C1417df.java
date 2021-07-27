package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@C1507ey
/* renamed from: com.google.android.gms.internal.df */
public final class C1417df<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* access modifiers changed from: private */

    /* renamed from: qW */
    public final C1410da f2875qW;

    public C1417df(C1410da daVar) {
        this.f2875qW = daVar;
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C1607gr.m4705S("Adapter called onClick.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onClick must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdClicked();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdClicked.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdClicked();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdClicked.", e);
        }
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C1607gr.m4705S("Adapter called onDismissScreen.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onDismissScreen must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdClosed();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdClosed.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdClosed();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdClosed.", e);
        }
    }

    public void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C1607gr.m4705S("Adapter called onDismissScreen.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onDismissScreen must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdClosed();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdClosed.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdClosed();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdClosed.", e);
        }
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, final AdRequest.ErrorCode errorCode) {
        C1607gr.m4705S("Adapter called onFailedToReceiveAd with error. " + errorCode);
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onFailedToReceiveAd must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdFailedToLoad(C1429dg.m4245a(errorCode));
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdFailedToLoad.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdFailedToLoad(C1429dg.m4245a(errorCode));
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, final AdRequest.ErrorCode errorCode) {
        C1607gr.m4705S("Adapter called onFailedToReceiveAd with error " + errorCode + ".");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onFailedToReceiveAd must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdFailedToLoad(C1429dg.m4245a(errorCode));
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdFailedToLoad.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdFailedToLoad(C1429dg.m4245a(errorCode));
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C1607gr.m4705S("Adapter called onLeaveApplication.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onLeaveApplication must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdLeftApplication();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdLeftApplication.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdLeftApplication();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdLeftApplication.", e);
        }
    }

    public void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C1607gr.m4705S("Adapter called onLeaveApplication.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onLeaveApplication must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdLeftApplication();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdLeftApplication.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdLeftApplication();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdLeftApplication.", e);
        }
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C1607gr.m4705S("Adapter called onPresentScreen.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onPresentScreen must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdOpened();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdOpened.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdOpened();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdOpened.", e);
        }
    }

    public void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C1607gr.m4705S("Adapter called onPresentScreen.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onPresentScreen must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdOpened();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdOpened.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdOpened();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdOpened.", e);
        }
    }

    public void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        C1607gr.m4705S("Adapter called onReceivedAd.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onReceivedAd must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdLoaded();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdLoaded.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdLoaded();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdLoaded.", e);
        }
    }

    public void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        C1607gr.m4705S("Adapter called onReceivedAd.");
        if (!C1606gq.m4703dB()) {
            C1607gr.m4709W("onReceivedAd must be called on the main UI thread.");
            C1606gq.f3553wR.post(new Runnable() {
                public void run() {
                    try {
                        C1417df.this.f2875qW.onAdLoaded();
                    } catch (RemoteException e) {
                        C1607gr.m4713d("Could not call onAdLoaded.", e);
                    }
                }
            });
            return;
        }
        try {
            this.f2875qW.onAdLoaded();
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call onAdLoaded.", e);
        }
    }
}
