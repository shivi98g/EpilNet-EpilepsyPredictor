package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.C1402cy;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.cx */
public final class C1401cx extends C1402cy.C1403a {

    /* renamed from: qT */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f2849qT;

    /* renamed from: z */
    private <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> C1405cz m4209z(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, C1401cx.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                MediationAdapter mediationAdapter = (MediationAdapter) cls.newInstance();
                return new C1416de(mediationAdapter, (com.google.ads.mediation.NetworkExtras) this.f2849qT.get(mediationAdapter.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                return new C1414dc((com.google.android.gms.ads.mediation.MediationAdapter) cls.newInstance());
            } else {
                C1607gr.m4709W("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            }
        } catch (Throwable th) {
            C1607gr.m4709W("Could not instantiate mediation adapter: " + str + ". " + th.getMessage());
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public void mo15047d(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f2849qT = map;
    }

    /* renamed from: x */
    public C1405cz mo15048x(String str) throws RemoteException {
        return m4209z(str);
    }

    /* renamed from: y */
    public boolean mo15049y(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, C1401cx.class.getClassLoader()));
        } catch (Throwable th) {
            C1607gr.m4709W("Could not load custom event implementation class: " + str + ", assuming old implementation.");
            return false;
        }
    }
}
