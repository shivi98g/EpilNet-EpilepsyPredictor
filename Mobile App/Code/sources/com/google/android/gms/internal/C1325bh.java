package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.C0537b;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;

/* renamed from: com.google.android.gms.internal.bh */
public final class C1325bh {

    /* renamed from: oH */
    private final C1401cx f2642oH;

    /* renamed from: oI */
    private final C1305ax f2643oI;

    /* renamed from: oJ */
    private C1314bd f2644oJ;

    /* renamed from: oK */
    private String f2645oK;

    /* renamed from: oL */
    private ViewGroup f2646oL;

    /* renamed from: oM */
    private InAppPurchaseListener f2647oM;

    /* renamed from: oN */
    private PlayStorePurchaseListener f2648oN;

    /* renamed from: oO */
    private C0537b f2649oO;

    /* renamed from: ob */
    private AdListener f2650ob;

    /* renamed from: os */
    private AppEventListener f2651os;

    /* renamed from: ot */
    private AdSize[] f2652ot;

    /* renamed from: ou */
    private String f2653ou;

    public C1325bh(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, C1305ax.m3946bg());
    }

    public C1325bh(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, C1305ax.m3946bg());
    }

    C1325bh(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C1305ax axVar) {
        this(viewGroup, attributeSet, z, axVar, (C1314bd) null);
    }

    C1325bh(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C1305ax axVar, C1314bd bdVar) {
        this.f2642oH = new C1401cx();
        this.f2646oL = viewGroup;
        this.f2643oI = axVar;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C1310bb bbVar = new C1310bb(context, attributeSet);
                this.f2652ot = bbVar.mo14831h(z);
                this.f2653ou = bbVar.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    C1606gq.m4699a(viewGroup, new C1306ay(context, this.f2652ot[0]), "Ads by Google");
                    return;
                }
            } catch (IllegalArgumentException e) {
                C1606gq.m4701a(viewGroup, new C1306ay(context, AdSize.BANNER), e.getMessage(), e.getMessage());
                return;
            }
        }
        this.f2644oJ = bdVar;
    }

    /* renamed from: bm */
    private void m4010bm() {
        try {
            C0967d ab = this.f2644oJ.mo14842ab();
            if (ab != null) {
                this.f2646oL.addView((View) C0970e.m1612f(ab));
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to get an ad frame.", e);
        }
    }

    /* renamed from: bn */
    private void m4011bn() throws RemoteException {
        if ((this.f2652ot == null || this.f2653ou == null) && this.f2644oJ == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        Context context = this.f2646oL.getContext();
        this.f2644oJ = C1302au.m3939a(context, new C1306ay(context, this.f2652ot), this.f2653ou, this.f2642oH);
        if (this.f2650ob != null) {
            this.f2644oJ.mo14836a((C1311bc) new C1301at(this.f2650ob));
        }
        if (this.f2651os != null) {
            this.f2644oJ.mo14837a((C1320bf) new C1309ba(this.f2651os));
        }
        if (this.f2647oM != null) {
            this.f2644oJ.mo14839a((C1485en) new C1500es(this.f2647oM));
        }
        if (this.f2648oN != null) {
            this.f2644oJ.mo14840a(new C1505ew(this.f2648oN), this.f2645oK);
        }
        if (this.f2649oO != null) {
            this.f2644oJ.mo14838a((C1337br) new C1340bs(this.f2649oO));
        }
        m4010bm();
    }

    /* renamed from: a */
    public void mo14888a(C1323bg bgVar) {
        try {
            if (this.f2644oJ == null) {
                m4011bn();
            }
            if (this.f2644oJ.mo14841a(this.f2643oI.mo14820a(this.f2646oL.getContext(), bgVar))) {
                this.f2642oH.mo15047d(bgVar.mo14862bj());
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void mo14889a(AdSize... adSizeArr) {
        this.f2652ot = adSizeArr;
        try {
            if (this.f2644oJ != null) {
                this.f2644oJ.mo14835a(new C1306ay(this.f2646oL.getContext(), this.f2652ot));
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the ad size.", e);
        }
        this.f2646oL.requestLayout();
    }

    public void destroy() {
        try {
            if (this.f2644oJ != null) {
                this.f2644oJ.destroy();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to destroy AdView.", e);
        }
    }

    public AdListener getAdListener() {
        return this.f2650ob;
    }

    public AdSize getAdSize() {
        try {
            if (this.f2644oJ != null) {
                return this.f2644oJ.mo14843ac().mo14821bh();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to get the current AdSize.", e);
        }
        if (this.f2652ot != null) {
            return this.f2652ot[0];
        }
        return null;
    }

    public AdSize[] getAdSizes() {
        return this.f2652ot;
    }

    public String getAdUnitId() {
        return this.f2653ou;
    }

    public AppEventListener getAppEventListener() {
        return this.f2651os;
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.f2647oM;
    }

    public String getMediationAdapterClassName() {
        try {
            if (this.f2644oJ != null) {
                return this.f2644oJ.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public void pause() {
        try {
            if (this.f2644oJ != null) {
                this.f2644oJ.pause();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to call pause.", e);
        }
    }

    public void recordManualImpression() {
        try {
            if (this.f2644oJ != null) {
                this.f2644oJ.mo14844an();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to record impression.", e);
        }
    }

    public void resume() {
        try {
            if (this.f2644oJ != null) {
                this.f2644oJ.resume();
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to call resume.", e);
        }
    }

    public void setAdListener(AdListener adListener) {
        try {
            this.f2650ob = adListener;
            if (this.f2644oJ != null) {
                this.f2644oJ.mo14836a((C1311bc) adListener != null ? new C1301at(adListener) : null);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the AdListener.", e);
        }
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (this.f2652ot != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        mo14889a(adSizeArr);
    }

    public void setAdUnitId(String str) {
        if (this.f2653ou != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f2653ou = str;
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f2651os = appEventListener;
            if (this.f2644oJ != null) {
                this.f2644oJ.mo14837a((C1320bf) appEventListener != null ? new C1309ba(appEventListener) : null);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the AppEventListener.", e);
        }
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        if (this.f2648oN != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.f2647oM = inAppPurchaseListener;
            if (this.f2644oJ != null) {
                this.f2644oJ.mo14839a((C1485en) inAppPurchaseListener != null ? new C1500es(inAppPurchaseListener) : null);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        if (this.f2647oM != null) {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        try {
            this.f2648oN = playStorePurchaseListener;
            this.f2645oK = str;
            if (this.f2644oJ != null) {
                this.f2644oJ.mo14840a(playStorePurchaseListener != null ? new C1505ew(playStorePurchaseListener) : null, str);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Failed to set the play store purchase parameter.", e);
        }
    }
}
