package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;

@C1507ey
/* renamed from: com.google.android.gms.internal.ck */
public final class C1381ck {

    /* renamed from: com.google.android.gms.internal.ck$a */
    public static final class C1382a implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: mH */
        private final Object f2800mH;

        /* renamed from: qe */
        private final C1383b f2801qe;

        /* renamed from: qf */
        private final C1384cl f2802qf;

        public C1382a(Context context, C1383b bVar) {
            this(context, bVar, false);
        }

        C1382a(Context context, C1383b bVar, boolean z) {
            this.f2800mH = new Object();
            this.f2801qe = bVar;
            this.f2802qf = new C1384cl(context, this, this, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (!z) {
                this.f2802qf.connect();
            }
        }

        public void onConnected(Bundle bundle) {
            C1384cl clVar;
            Bundle by = C1331bn.m4033by();
            synchronized (this.f2800mH) {
                try {
                    C1385cm bM = this.f2802qf.mo15019bM();
                    if (bM != null) {
                        by = bM.mo15021bN();
                    }
                    if (this.f2802qf.isConnected() || this.f2802qf.isConnecting()) {
                        clVar = this.f2802qf;
                        clVar.disconnect();
                    }
                } catch (IllegalStateException e) {
                    C1607gr.m4713d("Error when get Gservice values", e);
                    if (this.f2802qf.isConnected() || this.f2802qf.isConnecting()) {
                        clVar = this.f2802qf;
                    }
                } catch (RemoteException e2) {
                    try {
                        C1607gr.m4713d("Error when get Gservice values", e2);
                        if (this.f2802qf.isConnected() || this.f2802qf.isConnecting()) {
                            clVar = this.f2802qf;
                        }
                    } catch (Throwable th) {
                        if (this.f2802qf.isConnected() || this.f2802qf.isConnecting()) {
                            this.f2802qf.disconnect();
                        }
                        throw th;
                    }
                }
            }
            this.f2801qe.mo15018a(by);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.f2801qe.mo15018a(C1331bn.m4033by());
        }

        public void onConnectionSuspended(int i) {
            C1607gr.m4705S("Disconnected from remote ad request service.");
        }
    }

    /* renamed from: com.google.android.gms.internal.ck$b */
    public interface C1383b {
        /* renamed from: a */
        void mo15018a(Bundle bundle);
    }

    /* renamed from: a */
    public static void m4171a(Context context, C1383b bVar) {
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0) {
            bVar.mo15018a(C1331bn.m4033by());
        } else {
            new C1382a(context, bVar);
        }
    }
}
