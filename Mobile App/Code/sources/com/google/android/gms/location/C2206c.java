package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.C1999nk;

@Deprecated
/* renamed from: com.google.android.gms.location.c */
public class C2206c implements GooglePlayServicesClient {
    private final C1999nk agq;

    /* renamed from: com.google.android.gms.location.c$a */
    public interface C2207a {
        /* renamed from: a */
        void mo16270a(int i, String[] strArr);
    }

    /* renamed from: com.google.android.gms.location.c$b */
    public interface C2208b {
        /* renamed from: a */
        void mo16272a(int i, PendingIntent pendingIntent);

        /* renamed from: b */
        void mo16273b(int i, String[] strArr);
    }

    public void connect() {
        this.agq.connect();
    }

    public void disconnect() {
        this.agq.disconnect();
    }

    public boolean isConnected() {
        return this.agq.isConnected();
    }

    public boolean isConnecting() {
        return this.agq.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.agq.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.agq.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.agq.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.agq.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.agq.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.agq.unregisterConnectionFailedListener(onConnectionFailedListener);
    }
}
