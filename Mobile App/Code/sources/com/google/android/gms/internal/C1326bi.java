package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.C0537b;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

/* renamed from: com.google.android.gms.internal.bi */
public class C1326bi {
    private final Context mContext;

    /* renamed from: oH */
    private final C1401cx f2654oH;

    /* renamed from: oI */
    private final C1305ax f2655oI;

    /* renamed from: oJ */
    private C1314bd f2656oJ;

    /* renamed from: oK */
    private String f2657oK;

    /* renamed from: oM */
    private InAppPurchaseListener f2658oM;

    /* renamed from: oN */
    private PlayStorePurchaseListener f2659oN;

    /* renamed from: oO */
    private C0537b f2660oO;

    /* renamed from: oP */
    private PublisherInterstitialAd f2661oP;

    /* renamed from: ob */
    private AdListener f2662ob;

    /* renamed from: os */
    private AppEventListener f2663os;

    /* renamed from: ou */
    private String f2664ou;

    public C1326bi(Context context) {
        this(context, C1305ax.m3946bg(), (PublisherInterstitialAd) null);
    }

    public C1326bi(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, C1305ax.m3946bg(), publisherInterstitialAd);
    }

    public C1326bi(Context context, C1305ax axVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.f2654oH = new C1401cx();
        this.mContext = context;
        this.f2655oI = axVar;
        this.f2661oP = publisherInterstitialAd;
    }

    /* renamed from: v */
    private void m4014v(String str) throws RemoteException {
        if (this.f2664ou == null) {
            m4015w(str);
        }
        this.f2656oJ = C1302au.m3939a(this.mContext, new C1306ay(), this.f2664ou, this.f2654oH);
        if (this.f2662ob != null) {
            this.f2656oJ.mo14836a((C1311bc) new C1301at(this.f2662ob));
        }
        if (this.f2663os != null) {
            this.f2656oJ.mo14837a((C1320bf) new C1309ba(this.f2663os));
        }
        if (this.f2658oM != null) {
            this.f2656oJ.mo14839a((C1485en) new C1500es(this.f2658oM));
        }
        if (this.f2659oN != null) {
            this.f2656oJ.mo14840a(new C1505ew(this.f2659oN), this.f2657oK);
        }
        if (this.f2660oO != null) {
            this.f2656oJ.mo14838a((C1337br) new C1340bs(this.f2660oO));
        }
    }

    /* renamed from: w */
    private void m4015w(String str) {
        if (this.f2656oJ == null) {
            throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + str + " is called.");
        }
    }

    /* renamed from: a */
    public void mo14907a(C1323bg bgVar) {
        try {
            if (this.f2656oJ == null) {
                m4014v("loadAd");
            }
            if (this.f2656oJ.mo14841a(this.f2655oI.mo14820a(this.mContext, bgVar))) {
                this.f2654oH.mo15047d(bgVar.mo14862bj());
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to load ad.", e);
        }
    }

    public AdListener getAdListener() {
        return this.f2662ob;
    }

    public String getAdUnitId() {
        return this.f2664ou;
    }

    public AppEventListener getAppEventListener() {
        return this.f2663os;
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.f2658oM;
    }

    public String getMediationAdapterClassName() {
        try {
            if (this.f2656oJ != null) {
                return this.f2656oJ.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoaded() {
        try {
            if (this.f2656oJ == null) {
                return false;
            }
            return this.f2656oJ.isReady();
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to check if ad is ready.", e);
            return false;
        }
    }

    public void setAdListener(AdListener adListener) {
        try {
            this.f2662ob = adListener;
            if (this.f2656oJ != null) {
                this.f2656oJ.mo14836a((C1311bc) adListener != null ? new C1301at(adListener) : null);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the AdListener.", e);
        }
    }

    public void setAdUnitId(String str) {
        if (this.f2664ou != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f2664ou = str;
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f2663os = appEventListener;
            if (this.f2656oJ != null) {
                this.f2656oJ.mo14837a((C1320bf) appEventListener != null ? new C1309ba(appEventListener) : null);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the AppEventListener.", e);
        }
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        if (this.f2659oN != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.f2658oM = inAppPurchaseListener;
            if (this.f2656oJ != null) {
                this.f2656oJ.mo14839a((C1485en) inAppPurchaseListener != null ? new C1500es(inAppPurchaseListener) : null);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        try {
            this.f2659oN = playStorePurchaseListener;
            if (this.f2656oJ != null) {
                this.f2656oJ.mo14840a(playStorePurchaseListener != null ? new C1505ew(playStorePurchaseListener) : null, str);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the play store purchase parameter.", e);
        }
    }

    public void show() {
        try {
            m4015w("show");
            this.f2656oJ.showInterstitial();
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to show interstitial.", e);
        }
    }
}
