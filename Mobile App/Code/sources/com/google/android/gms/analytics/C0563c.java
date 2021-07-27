package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1627ha;
import com.google.android.gms.internal.C1629hb;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.c */
class C0563c implements C0562b {
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */

    /* renamed from: xV */
    public ServiceConnection f232xV;
    /* access modifiers changed from: private */

    /* renamed from: xW */
    public C0565b f233xW;
    /* access modifiers changed from: private */

    /* renamed from: xX */
    public C0566c f234xX;
    /* access modifiers changed from: private */

    /* renamed from: xY */
    public C1629hb f235xY;

    /* renamed from: com.google.android.gms.analytics.c$a */
    final class C0564a implements ServiceConnection {
        C0564a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0550ae.m105V("service connected, binder: " + iBinder);
            try {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(iBinder.getInterfaceDescriptor())) {
                    C0550ae.m105V("bound to service");
                    C1629hb unused = C0563c.this.f235xY = C1629hb.C1630a.m4785D(iBinder);
                    C0563c.this.m178dT();
                    return;
                }
            } catch (RemoteException e) {
            }
            try {
                C0563c.this.mContext.unbindService(this);
            } catch (IllegalArgumentException e2) {
            }
            ServiceConnection unused2 = C0563c.this.f232xV = null;
            C0563c.this.f234xX.mo10412a(2, (Intent) null);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0550ae.m105V("service disconnected: " + componentName);
            ServiceConnection unused = C0563c.this.f232xV = null;
            C0563c.this.f233xW.onDisconnected();
        }
    }

    /* renamed from: com.google.android.gms.analytics.c$b */
    public interface C0565b {
        void onConnected();

        void onDisconnected();
    }

    /* renamed from: com.google.android.gms.analytics.c$c */
    public interface C0566c {
        /* renamed from: a */
        void mo10412a(int i, Intent intent);
    }

    public C0563c(Context context, C0565b bVar, C0566c cVar) {
        this.mContext = context;
        if (bVar == null) {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        this.f233xW = bVar;
        if (cVar == null) {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        }
        this.f234xX = cVar;
    }

    /* renamed from: dR */
    private C1629hb m177dR() {
        mo10406dS();
        return this.f235xY;
    }

    /* access modifiers changed from: private */
    /* renamed from: dT */
    public void m178dT() {
        m179dU();
    }

    /* renamed from: dU */
    private void m179dU() {
        this.f233xW.onConnected();
    }

    /* renamed from: a */
    public void mo10402a(Map<String, String> map, long j, String str, List<C1627ha> list) {
        try {
            m177dR().mo15503a(map, j, str, list);
        } catch (RemoteException e) {
            C0550ae.m103T("sendHit failed: " + e);
        }
    }

    public void connect() {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", this.mContext.getPackageName());
        if (this.f232xV != null) {
            C0550ae.m103T("Calling connect() while still connected, missing disconnect().");
            return;
        }
        this.f232xV = new C0564a();
        boolean bindService = this.mContext.bindService(intent, this.f232xV, 129);
        C0550ae.m105V("connect: bindService returned " + bindService + " for " + intent);
        if (!bindService) {
            this.f232xV = null;
            this.f234xX.mo10412a(1, (Intent) null);
        }
    }

    /* renamed from: dQ */
    public void mo10404dQ() {
        try {
            m177dR().mo15504dQ();
        } catch (RemoteException e) {
            C0550ae.m103T("clear hits failed: " + e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: dS */
    public void mo10406dS() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void disconnect() {
        this.f235xY = null;
        if (this.f232xV != null) {
            try {
                this.mContext.unbindService(this.f232xV);
            } catch (IllegalArgumentException | IllegalStateException e) {
            }
            this.f232xV = null;
            this.f233xW.onDisconnected();
        }
    }

    public boolean isConnected() {
        return this.f235xY != null;
    }
}
