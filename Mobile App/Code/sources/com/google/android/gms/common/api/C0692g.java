package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p000v4.app.Fragment;
import android.support.p000v4.app.FragmentActivity;
import android.support.p000v4.app.FragmentManager;
import android.support.p000v4.app.LoaderManager;
import android.support.p000v4.content.Loader;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.common.api.g */
public class C0692g extends Fragment implements DialogInterface.OnCancelListener, LoaderManager.LoaderCallbacks<ConnectionResult> {

    /* renamed from: KC */
    private boolean f716KC;

    /* renamed from: KD */
    private int f717KD = -1;

    /* renamed from: KE */
    private ConnectionResult f718KE;

    /* renamed from: KF */
    private final Handler f719KF = new Handler(Looper.getMainLooper());

    /* renamed from: KG */
    private final SparseArray<C0695b> f720KG = new SparseArray<>();

    /* renamed from: com.google.android.gms.common.api.g$a */
    static class C0694a extends Loader<ConnectionResult> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: KH */
        public final GoogleApiClient f721KH;

        /* renamed from: KI */
        private boolean f722KI;

        /* renamed from: KJ */
        private ConnectionResult f723KJ;

        public C0694a(Context context, GoogleApiClient googleApiClient) {
            super(context);
            this.f721KH = googleApiClient;
        }

        /* renamed from: a */
        private void m614a(ConnectionResult connectionResult) {
            this.f723KJ = connectionResult;
            if (isStarted() && !isAbandoned()) {
                deliverResult(connectionResult);
            }
        }

        /* renamed from: gS */
        public void mo11024gS() {
            if (this.f722KI) {
                this.f722KI = false;
                if (isStarted() && !isAbandoned()) {
                    this.f721KH.connect();
                }
            }
        }

        public void onConnected(Bundle bundle) {
            this.f722KI = false;
            m614a(ConnectionResult.f609Iu);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.f722KI = true;
            m614a(connectionResult);
        }

        public void onConnectionSuspended(int i) {
        }

        /* access modifiers changed from: protected */
        public void onReset() {
            this.f723KJ = null;
            this.f722KI = false;
            this.f721KH.unregisterConnectionCallbacks(this);
            this.f721KH.unregisterConnectionFailedListener(this);
            this.f721KH.disconnect();
        }

        /* access modifiers changed from: protected */
        public void onStartLoading() {
            super.onStartLoading();
            this.f721KH.registerConnectionCallbacks(this);
            this.f721KH.registerConnectionFailedListener(this);
            if (this.f723KJ != null) {
                deliverResult(this.f723KJ);
            }
            if (!this.f721KH.isConnected() && !this.f721KH.isConnecting() && !this.f722KI) {
                this.f721KH.connect();
            }
        }

        /* access modifiers changed from: protected */
        public void onStopLoading() {
            this.f721KH.disconnect();
        }
    }

    /* renamed from: com.google.android.gms.common.api.g$b */
    private static class C0695b {

        /* renamed from: KH */
        public final GoogleApiClient f724KH;

        /* renamed from: KK */
        public final GoogleApiClient.OnConnectionFailedListener f725KK;

        private C0695b(GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.f724KH = googleApiClient;
            this.f725KK = onConnectionFailedListener;
        }
    }

    /* renamed from: com.google.android.gms.common.api.g$c */
    private class C0696c implements Runnable {

        /* renamed from: KL */
        private final int f726KL;

        /* renamed from: KM */
        private final ConnectionResult f727KM;

        public C0696c(int i, ConnectionResult connectionResult) {
            this.f726KL = i;
            this.f727KM = connectionResult;
        }

        public void run() {
            if (this.f727KM.hasResolution()) {
                try {
                    this.f727KM.startResolutionForResult(C0692g.this.getActivity(), 1 + ((C0692g.this.getActivity().getSupportFragmentManager().getFragments().indexOf(C0692g.this) + 1) << 16));
                } catch (IntentSender.SendIntentException e) {
                    C0692g.this.m608gR();
                }
            } else if (GooglePlayServicesUtil.isUserRecoverableError(this.f727KM.getErrorCode())) {
                GooglePlayServicesUtil.showErrorDialogFragment(this.f727KM.getErrorCode(), C0692g.this.getActivity(), C0692g.this, 2, C0692g.this);
            } else {
                C0692g.this.m607b(this.f726KL, this.f727KM);
            }
        }
    }

    /* renamed from: a */
    public static C0692g m602a(FragmentActivity fragmentActivity) {
        C1785jx.m5357aU("Must be called from main thread of process");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        try {
            C0692g gVar = (C0692g) supportFragmentManager.findFragmentByTag("GmsSupportLifecycleFragment");
            if (gVar != null && !gVar.isRemoving()) {
                return gVar;
            }
            C0692g gVar2 = new C0692g();
            supportFragmentManager.beginTransaction().add((Fragment) gVar2, "GmsSupportLifecycleFragment").commit();
            supportFragmentManager.executePendingTransactions();
            return gVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", e);
        }
    }

    /* renamed from: a */
    private void m603a(int i, ConnectionResult connectionResult) {
        if (!this.f716KC) {
            this.f716KC = true;
            this.f717KD = i;
            this.f718KE = connectionResult;
            this.f719KF.post(new C0696c(i, connectionResult));
        }
    }

    /* renamed from: aq */
    private void m606aq(int i) {
        if (i == this.f717KD) {
            m608gR();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m607b(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        C0695b bVar = this.f720KG.get(i);
        if (bVar != null) {
            mo11021ao(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = bVar.f725KK;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
        m608gR();
    }

    /* access modifiers changed from: private */
    /* renamed from: gR */
    public void m608gR() {
        this.f716KC = false;
        this.f717KD = -1;
        this.f718KE = null;
        LoaderManager loaderManager = getLoaderManager();
        for (int i = 0; i < this.f720KG.size(); i++) {
            int keyAt = this.f720KG.keyAt(i);
            C0694a ap = mo11022ap(keyAt);
            if (ap != null) {
                ap.mo11024gS();
            }
            loaderManager.initLoader(keyAt, (Bundle) null, this);
        }
    }

    /* renamed from: a */
    public void mo11018a(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C1785jx.m5359b(googleApiClient, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f720KG.indexOfKey(i) < 0;
        C1785jx.m5355a(z, "Already managing a GoogleApiClient with id " + i);
        this.f720KG.put(i, new C0695b(googleApiClient, onConnectionFailedListener));
        if (getActivity() != null) {
            getLoaderManager().initLoader(i, (Bundle) null, this);
        }
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<ConnectionResult> loader, ConnectionResult connectionResult) {
        if (connectionResult.isSuccess()) {
            m606aq(loader.getId());
        } else {
            m603a(loader.getId(), connectionResult);
        }
    }

    /* renamed from: an */
    public GoogleApiClient mo11020an(int i) {
        C0694a ap;
        if (getActivity() == null || (ap = mo11022ap(i)) == null) {
            return null;
        }
        return ap.f721KH;
    }

    /* renamed from: ao */
    public void mo11021ao(int i) {
        getLoaderManager().destroyLoader(i);
        this.f720KG.remove(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ap */
    public C0694a mo11022ap(int i) {
        try {
            return (C0694a) getLoaderManager().getLoader(i);
        } catch (ClassCastException e) {
            throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) == 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r4 == -1) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 1
            switch(r3) {
                case 1: goto L_0x0010;
                case 2: goto L_0x0005;
                default: goto L_0x0004;
            }
        L_0x0004:
            goto L_0x0014
        L_0x0005:
            android.support.v4.app.FragmentActivity r1 = r2.getActivity()
            int r1 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r1)
            if (r1 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0010:
            r1 = -1
            if (r4 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001b
            r2.m608gR()
            return
        L_0x001b:
            int r0 = r2.f717KD
            com.google.android.gms.common.ConnectionResult r1 = r2.f718KE
            r2.m607b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0692g.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        for (int i = 0; i < this.f720KG.size(); i++) {
            int keyAt = this.f720KG.keyAt(i);
            C0694a ap = mo11022ap(keyAt);
            if (ap == null || this.f720KG.valueAt(i).f724KH == ap.f721KH) {
                getLoaderManager().initLoader(keyAt, (Bundle) null, this);
            } else {
                getLoaderManager().restartLoader(keyAt, (Bundle) null, this);
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        m607b(this.f717KD, this.f718KE);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f716KC = bundle.getBoolean("resolving_error", false);
            this.f717KD = bundle.getInt("failed_client_id", -1);
            if (this.f717KD >= 0) {
                this.f718KE = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public Loader<ConnectionResult> onCreateLoader(int i, Bundle bundle) {
        return new C0694a(getActivity(), this.f720KG.get(i).f724KH);
    }

    public void onLoaderReset(Loader<ConnectionResult> loader) {
        if (loader.getId() == this.f717KD) {
            m608gR();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", this.f716KC);
        if (this.f717KD >= 0) {
            bundle.putInt("failed_client_id", this.f717KD);
            bundle.putInt("failed_status", this.f718KE.getErrorCode());
            bundle.putParcelable("failed_resolution", this.f718KE.getResolution());
        }
    }

    public void onStart() {
        super.onStart();
        if (!this.f716KC) {
            for (int i = 0; i < this.f720KG.size(); i++) {
                getLoaderManager().initLoader(this.f720KG.keyAt(i), (Bundle) null, this);
            }
        }
    }
}
