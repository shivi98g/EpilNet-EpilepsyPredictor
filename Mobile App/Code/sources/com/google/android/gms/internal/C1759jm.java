package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.jm */
public final class C1759jm {
    /* access modifiers changed from: private */

    /* renamed from: MX */
    public final C1761b f3921MX;
    /* access modifiers changed from: private */

    /* renamed from: MY */
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> f3922MY = new ArrayList<>();

    /* renamed from: MZ */
    final ArrayList<GoogleApiClient.ConnectionCallbacks> f3923MZ = new ArrayList<>();

    /* renamed from: Na */
    private boolean f3924Na = false;

    /* renamed from: Nb */
    private final ArrayList<GooglePlayServicesClient.OnConnectionFailedListener> f3925Nb = new ArrayList<>();
    private final Handler mHandler;

    /* renamed from: com.google.android.gms.internal.jm$a */
    final class C1760a extends Handler {
        public C1760a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                synchronized (C1759jm.this.f3922MY) {
                    if (C1759jm.this.f3921MX.mo11003gN() && C1759jm.this.f3921MX.isConnected() && C1759jm.this.f3922MY.contains(message.obj)) {
                        ((GoogleApiClient.ConnectionCallbacks) message.obj).onConnected(C1759jm.this.f3921MX.mo11002fX());
                    }
                }
                return;
            }
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
        }
    }

    /* renamed from: com.google.android.gms.internal.jm$b */
    public interface C1761b {
        /* renamed from: fX */
        Bundle mo11002fX();

        /* renamed from: gN */
        boolean mo11003gN();

        boolean isConnected();
    }

    public C1759jm(Context context, Looper looper, C1761b bVar) {
        this.f3921MX = bVar;
        this.mHandler = new C1760a(looper);
    }

    /* renamed from: aE */
    public void mo15843aE(int i) {
        this.mHandler.removeMessages(1);
        synchronized (this.f3922MY) {
            this.f3924Na = true;
            Iterator it = new ArrayList(this.f3922MY).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!this.f3921MX.mo11003gN()) {
                    break;
                } else if (this.f3922MY.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.f3924Na = false;
        }
    }

    /* renamed from: b */
    public void mo15844b(ConnectionResult connectionResult) {
        this.mHandler.removeMessages(1);
        synchronized (this.f3925Nb) {
            Iterator it = new ArrayList(this.f3925Nb).iterator();
            while (it.hasNext()) {
                GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener = (GooglePlayServicesClient.OnConnectionFailedListener) it.next();
                if (this.f3921MX.mo11003gN()) {
                    if (this.f3925Nb.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: dU */
    public void mo15845dU() {
        synchronized (this.f3922MY) {
            mo15846f(this.f3921MX.mo11002fX());
        }
    }

    /* renamed from: f */
    public void mo15846f(Bundle bundle) {
        synchronized (this.f3922MY) {
            boolean z = true;
            C1785jx.m5353K(!this.f3924Na);
            this.mHandler.removeMessages(1);
            this.f3924Na = true;
            if (this.f3923MZ.size() != 0) {
                z = false;
            }
            C1785jx.m5353K(z);
            Iterator it = new ArrayList(this.f3922MY).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!this.f3921MX.mo11003gN()) {
                    break;
                } else if (!this.f3921MX.isConnected()) {
                    break;
                } else if (!this.f3923MZ.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.f3923MZ.clear();
            this.f3924Na = false;
        }
    }

    public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        C1785jx.m5364i(connectionCallbacks);
        synchronized (this.f3922MY) {
            contains = this.f3922MY.contains(connectionCallbacks);
        }
        return contains;
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        C1785jx.m5364i(onConnectionFailedListener);
        synchronized (this.f3925Nb) {
            contains = this.f3925Nb.contains(onConnectionFailedListener);
        }
        return contains;
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        C1785jx.m5364i(connectionCallbacks);
        synchronized (this.f3922MY) {
            if (this.f3922MY.contains(connectionCallbacks)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + connectionCallbacks + " is already registered");
            } else {
                this.f3922MY.add(connectionCallbacks);
            }
        }
        if (this.f3921MX.isConnected()) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(1, connectionCallbacks));
        }
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        C1785jx.m5364i(onConnectionFailedListener);
        synchronized (this.f3925Nb) {
            if (this.f3925Nb.contains(onConnectionFailedListener)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + onConnectionFailedListener + " is already registered");
            } else {
                this.f3925Nb.add(onConnectionFailedListener);
            }
        }
    }

    public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        C1785jx.m5364i(connectionCallbacks);
        synchronized (this.f3922MY) {
            if (this.f3922MY != null) {
                if (!this.f3922MY.remove(connectionCallbacks)) {
                    Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + connectionCallbacks + " not found");
                } else if (this.f3924Na) {
                    this.f3923MZ.add(connectionCallbacks);
                }
            }
        }
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        C1785jx.m5364i(onConnectionFailedListener);
        synchronized (this.f3925Nb) {
            if (this.f3925Nb != null && !this.f3925Nb.remove(onConnectionFailedListener)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + onConnectionFailedListener + " not found");
            }
        }
    }
}
