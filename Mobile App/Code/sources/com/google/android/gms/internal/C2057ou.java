package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.C2047op;

/* renamed from: com.google.android.gms.internal.ou */
public class C2057ou implements GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener {
    private C2060ox amU = null;
    private final C2047op.C2048a ane;
    private boolean anf = true;

    public C2057ou(C2047op.C2048a aVar) {
        this.ane = aVar;
    }

    /* renamed from: T */
    public void mo16521T(boolean z) {
        this.anf = z;
    }

    /* renamed from: a */
    public void mo16522a(C2060ox oxVar) {
        this.amU = oxVar;
    }

    public void onConnected(Bundle bundle) {
        this.amU.mo16532U(false);
        if (this.anf && this.ane != null) {
            this.ane.mo16496on();
        }
        this.anf = false;
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.amU.mo16532U(true);
        if (this.anf && this.ane != null) {
            if (connectionResult.hasResolution()) {
                this.ane.mo16495d(connectionResult.getResolution());
            } else {
                this.ane.mo16497oo();
            }
        }
        this.anf = false;
    }

    public void onDisconnected() {
        this.amU.mo16532U(true);
    }
}
