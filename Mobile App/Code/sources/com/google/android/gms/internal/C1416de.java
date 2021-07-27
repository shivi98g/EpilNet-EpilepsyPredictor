package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1405cz;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.de */
public final class C1416de<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends C1405cz.C1406a {

    /* renamed from: qX */
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f2873qX;

    /* renamed from: qY */
    private final NETWORK_EXTRAS f2874qY;

    public C1416de(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f2873qX = mediationAdapter;
        this.f2874qY = network_extras;
    }

    /* renamed from: b */
    private SERVER_PARAMETERS m4239b(String str, int i, String str2) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                C1607gr.m4713d("Could not get MediationServerParameters.", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f2873qX.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (MediationServerParameters) serverParametersType.newInstance();
        server_parameters.load(hashMap);
        return server_parameters;
    }

    /* renamed from: a */
    public void mo15053a(C0967d dVar, C1303av avVar, String str, C1410da daVar) throws RemoteException {
        mo15054a(dVar, avVar, str, (String) null, daVar);
    }

    /* renamed from: a */
    public void mo15054a(C0967d dVar, C1303av avVar, String str, String str2, C1410da daVar) throws RemoteException {
        if (!(this.f2873qX instanceof MediationInterstitialAdapter)) {
            C1607gr.m4709W("MediationAdapter is not a MediationInterstitialAdapter: " + this.f2873qX.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C1607gr.m4705S("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f2873qX).requestInterstitialAd(new C1417df(daVar), (Activity) C0970e.m1612f(dVar), m4239b(str, avVar.f2389oh, str2), C1429dg.m4247d(avVar), this.f2874qY);
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
        if (!(this.f2873qX instanceof MediationBannerAdapter)) {
            C1607gr.m4709W("MediationAdapter is not a MediationBannerAdapter: " + this.f2873qX.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C1607gr.m4705S("Requesting banner ad from adapter.");
        try {
            ((MediationBannerAdapter) this.f2873qX).requestBannerAd(new C1417df(daVar), (Activity) C0970e.m1612f(dVar), m4239b(str, avVar.f2389oh, str2), C1429dg.m4246b(ayVar), C1429dg.m4247d(avVar), this.f2874qY);
        } catch (Throwable th) {
            C1607gr.m4713d("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public void destroy() throws RemoteException {
        try {
            this.f2873qX.destroy();
        } catch (Throwable th) {
            C1607gr.m4713d("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    public C0967d getView() throws RemoteException {
        if (!(this.f2873qX instanceof MediationBannerAdapter)) {
            C1607gr.m4709W("MediationAdapter is not a MediationBannerAdapter: " + this.f2873qX.getClass().getCanonicalName());
            throw new RemoteException();
        }
        try {
            return C0970e.m1613k(((MediationBannerAdapter) this.f2873qX).getBannerView());
        } catch (Throwable th) {
            C1607gr.m4713d("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    public void pause() throws RemoteException {
        throw new RemoteException();
    }

    public void resume() throws RemoteException {
        throw new RemoteException();
    }

    public void showInterstitial() throws RemoteException {
        if (!(this.f2873qX instanceof MediationInterstitialAdapter)) {
            C1607gr.m4709W("MediationAdapter is not a MediationInterstitialAdapter: " + this.f2873qX.getClass().getCanonicalName());
            throw new RemoteException();
        }
        C1607gr.m4705S("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f2873qX).showInterstitial();
        } catch (Throwable th) {
            C1607gr.m4713d("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }
}
