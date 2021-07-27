package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1539fe;

@C1507ey
/* renamed from: com.google.android.gms.internal.ff */
public abstract class C1541ff extends C1584gf {

    /* renamed from: qh */
    private final C1545fh f3297qh;

    /* renamed from: tI */
    private final C1539fe.C1540a f3298tI;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.ff$a */
    public static final class C1542a extends C1541ff {
        private final Context mContext;

        public C1542a(Context context, C1545fh fhVar, C1539fe.C1540a aVar) {
            super(fhVar, aVar);
            this.mContext = context;
        }

        /* renamed from: cJ */
        public void mo15285cJ() {
        }

        /* renamed from: cK */
        public C1550fl mo15286cK() {
            Bundle bN = C1579ga.m4591bN();
            return C1561fq.m4522a(this.mContext, new C1330bm(bN.getString("gads:sdk_core_location"), bN.getString("gads:sdk_core_experiment_id"), bN.getString("gads:block_autoclicks_experiment_id"), bN.getString("gads:spam_app_context:experiment_id")), (C1388cn) new C1389co(), (C1572fw) new C1573fx());
        }
    }

    @C1507ey
    /* renamed from: com.google.android.gms.internal.ff$b */
    public static final class C1543b extends C1541ff implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: mH */
        private final Object f3299mH = new Object();

        /* renamed from: tI */
        private final C1539fe.C1540a f3300tI;

        /* renamed from: tJ */
        private final C1544fg f3301tJ;

        public C1543b(Context context, C1545fh fhVar, C1539fe.C1540a aVar) {
            super(fhVar, aVar);
            this.f3300tI = aVar;
            this.f3301tJ = new C1544fg(context, this, this, fhVar.f3304lO.f3556wU);
            this.f3301tJ.connect();
        }

        /* renamed from: cJ */
        public void mo15285cJ() {
            synchronized (this.f3299mH) {
                if (this.f3301tJ.isConnected() || this.f3301tJ.isConnecting()) {
                    this.f3301tJ.disconnect();
                }
            }
        }

        /* renamed from: cK */
        public C1550fl mo15286cK() {
            C1550fl cL;
            synchronized (this.f3299mH) {
                try {
                    cL = this.f3301tJ.mo15288cL();
                } catch (DeadObjectException | IllegalStateException e) {
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return cL;
        }

        public void onConnected(Bundle bundle) {
            start();
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.f3300tI.mo15262a(new C1548fj(0));
        }

        public void onConnectionSuspended(int i) {
            C1607gr.m4705S("Disconnected from remote ad request service.");
        }
    }

    public C1541ff(C1545fh fhVar, C1539fe.C1540a aVar) {
        this.f3297qh = fhVar;
        this.f3298tI = aVar;
    }

    /* renamed from: a */
    private static C1548fj m4472a(C1550fl flVar, C1545fh fhVar) {
        String str;
        try {
            return flVar.mo15301b(fhVar);
        } catch (RemoteException e) {
            e = e;
            str = "Could not fetch ad response from ad request service.";
            C1607gr.m4713d(str, e);
            return null;
        } catch (NullPointerException | SecurityException e2) {
            e = e2;
            str = "Could not fetch ad response from ad request service due to an Exception.";
            C1607gr.m4713d(str, e);
            return null;
        } catch (Throwable th) {
            C1579ga.m4599e(th);
            return null;
        }
    }

    /* renamed from: cJ */
    public abstract void mo15285cJ();

    /* renamed from: cK */
    public abstract C1550fl mo15286cK();

    /* JADX INFO: finally extract failed */
    /* renamed from: cx */
    public final void mo15197cx() {
        C1548fj fjVar;
        try {
            C1550fl cK = mo15286cK();
            if (cK == null) {
                fjVar = new C1548fj(0);
            } else {
                fjVar = m4472a(cK, this.f3297qh);
                if (fjVar == null) {
                    fjVar = new C1548fj(0);
                }
            }
            mo15285cJ();
            this.f3298tI.mo15262a(fjVar);
        } catch (Throwable th) {
            mo15285cJ();
            throw th;
        }
    }

    public final void onStop() {
        mo15285cJ();
    }
}
