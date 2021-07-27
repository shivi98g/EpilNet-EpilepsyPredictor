package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C0534a;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1405cz;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.dc */
public final class C1414dc extends C1405cz.C1406a {

    /* renamed from: qV */
    private final MediationAdapter f2871qV;

    public C1414dc(MediationAdapter mediationAdapter) {
        this.f2871qV = mediationAdapter;
    }

    /* renamed from: a */
    private Bundle m4234a(String str, int i, String str2) throws RemoteException {
        Bundle bundle;
        C1607gr.m4709W("Server parameters: " + str);
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f2871qV instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            C1607gr.m4713d("Could not get Server Parameters Bundle.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo15053a(C0967d dVar, C1303av avVar, String str, C1410da daVar) throws RemoteException {
        mo15054a(dVar, avVar, str, (String) null, daVar);
    }

    /* renamed from: a */
    public void mo15054a(C0967d dVar, C1303av avVar, String str, String str2, C1410da daVar) throws RemoteException {
        if (!(this.f2871qV instanceof MediationInterstitialAdapter)) {
            C1607gr.m4709W("MediationAdapter is not a MediationInterstitialAdapter: " + this.f2871qV.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C1607gr.m4705S("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f2871qV;
            Bundle bundle = null;
            C1413db dbVar = new C1413db(new Date(avVar.f2385od), avVar.f2386oe, avVar.f2387of != null ? new HashSet(avVar.f2387of) : null, avVar.f2393ol, avVar.f2388og, avVar.f2389oh);
            if (avVar.f2395on != null) {
                bundle = avVar.f2395on.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) C0970e.m1612f(dVar), new C1415dd(daVar), m4234a(str, avVar.f2389oh, str2), dbVar, bundle);
        } catch (Throwable th) {
            C1607gr.m4713d("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public void mo15055a(C0967d dVar, C1306ay ayVar, C1303av avVar, String str, C1410da daVar) throws RemoteException {
        mo15056a(dVar, ayVar, avVar, str, (String) null, daVar);
    }

    /* renamed from: a */
    public void mo15056a(C0967d dVar, C1306ay ayVar, C1303av avVar, String str, String str2, C1410da daVar) throws RemoteException {
        C1306ay ayVar2 = ayVar;
        C1303av avVar2 = avVar;
        if (!(this.f2871qV instanceof MediationBannerAdapter)) {
            C1607gr.m4709W("MediationAdapter is not a MediationBannerAdapter: " + this.f2871qV.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C1607gr.m4705S("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f2871qV;
            Bundle bundle = null;
            C1413db dbVar = new C1413db(new Date(avVar2.f2385od), avVar2.f2386oe, avVar2.f2387of != null ? new HashSet(avVar2.f2387of) : null, avVar2.f2393ol, avVar2.f2388og, avVar2.f2389oh);
            if (avVar2.f2395on != null) {
                bundle = avVar2.f2395on.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) C0970e.m1612f(dVar), new C1415dd(daVar), m4234a(str, avVar2.f2389oh, str2), C0534a.m22a(ayVar2.width, ayVar2.height, ayVar2.f2397op), dbVar, bundle);
        } catch (Throwable th) {
            C1607gr.m4713d("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public void destroy() throws RemoteException {
        try {
            this.f2871qV.onDestroy();
        } catch (Throwable th) {
            C1607gr.m4713d("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    public C0967d getView() throws RemoteException {
        if (!(this.f2871qV instanceof MediationBannerAdapter)) {
            C1607gr.m4709W("MediationAdapter is not a MediationBannerAdapter: " + this.f2871qV.getClass().getCanonicalName());
            throw new RemoteException();
        }
        try {
            return C0970e.m1613k(((MediationBannerAdapter) this.f2871qV).getBannerView());
        } catch (Throwable th) {
            C1607gr.m4713d("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    public void pause() throws RemoteException {
        try {
            this.f2871qV.onPause();
        } catch (Throwable th) {
            C1607gr.m4713d("Could not pause adapter.", th);
            throw new RemoteException();
        }
    }

    public void resume() throws RemoteException {
        try {
            this.f2871qV.onResume();
        } catch (Throwable th) {
            C1607gr.m4713d("Could not resume adapter.", th);
            throw new RemoteException();
        }
    }

    public void showInterstitial() throws RemoteException {
        if (!(this.f2871qV instanceof MediationInterstitialAdapter)) {
            C1607gr.m4709W("MediationAdapter is not a MediationInterstitialAdapter: " + this.f2871qV.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C1607gr.m4705S("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f2871qV).showInterstitial();
        } catch (Throwable th) {
            C1607gr.m4713d("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }
}
