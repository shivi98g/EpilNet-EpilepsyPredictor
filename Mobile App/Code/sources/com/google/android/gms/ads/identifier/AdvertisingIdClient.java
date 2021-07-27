package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C0665a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C2178s;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient {

    /* renamed from: ln */
    C0665a f83ln;

    /* renamed from: lo */
    C2178s f84lo;

    /* renamed from: lp */
    boolean f85lp;

    /* renamed from: lq */
    Object f86lq;

    /* renamed from: lr */
    C0538a f87lr;

    /* renamed from: ls */
    final long f88ls;
    private final Context mContext;

    public static final class Info {

        /* renamed from: lx */
        private final String f89lx;

        /* renamed from: ly */
        private final boolean f90ly;

        public Info(String str, boolean z) {
            this.f89lx = str;
            this.f90ly = z;
        }

        public String getId() {
            return this.f89lx;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f90ly;
        }

        public String toString() {
            return "{" + this.f89lx + "}" + this.f90ly;
        }
    }

    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$a */
    static class C0538a extends Thread {

        /* renamed from: lt */
        private WeakReference<AdvertisingIdClient> f91lt;

        /* renamed from: lu */
        private long f92lu;

        /* renamed from: lv */
        CountDownLatch f93lv = new CountDownLatch(1);

        /* renamed from: lw */
        boolean f94lw = false;

        public C0538a(AdvertisingIdClient advertisingIdClient, long j) {
            this.f91lt = new WeakReference<>(advertisingIdClient);
            this.f92lu = j;
            start();
        }

        private void disconnect() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f91lt.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.f94lw = true;
            }
        }

        /* renamed from: aa */
        public boolean mo10106aa() {
            return this.f94lw;
        }

        public void cancel() {
            this.f93lv.countDown();
        }

        public void run() {
            try {
                if (!this.f93lv.await(this.f92lu, TimeUnit.MILLISECONDS)) {
                    disconnect();
                }
            } catch (InterruptedException e) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000);
    }

    public AdvertisingIdClient(Context context, long j) {
        this.f86lq = new Object();
        C1785jx.m5364i(context);
        this.mContext = context;
        this.f85lp = false;
        this.f88ls = j;
    }

    /* renamed from: Z */
    private void m26Z() {
        synchronized (this.f86lq) {
            if (this.f87lr != null) {
                this.f87lr.cancel();
                try {
                    this.f87lr.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.f88ls > 0) {
                this.f87lr = new C0538a(this, this.f88ls);
            }
        }
    }

    /* renamed from: a */
    static C2178s m27a(Context context, C0665a aVar) throws IOException {
        try {
            return C2178s.C2179a.m6529b(aVar.mo10900gs());
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        }
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1);
        try {
            advertisingIdClient.mo10098b(false);
            return advertisingIdClient.getInfo();
        } finally {
            advertisingIdClient.finish();
        }
    }

    /* renamed from: h */
    static C0665a m28h(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo(GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE, 0);
            try {
                GooglePlayServicesUtil.m474C(context);
                C0665a aVar = new C0665a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
                if (context.bindService(intent, aVar, 1)) {
                    return aVar;
                }
                throw new IOException("Connection failure");
            } catch (GooglePlayServicesNotAvailableException e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10098b(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C1785jx.m5358aV("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f85lp) {
                finish();
            }
            this.f83ln = m28h(this.mContext);
            this.f84lo = m27a(this.mContext, this.f83ln);
            this.f85lp = true;
            if (z) {
                m26Z();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.internal.C1785jx.m5358aV(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.mContext     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.common.a r0 = r3.f83ln     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x000f
            goto L_0x002d
        L_0x000f:
            boolean r0 = r3.f85lp     // Catch:{ IllegalArgumentException -> 0x001b }
            if (r0 == 0) goto L_0x0023
            android.content.Context r0 = r3.mContext     // Catch:{ IllegalArgumentException -> 0x001b }
            com.google.android.gms.common.a r1 = r3.f83ln     // Catch:{ IllegalArgumentException -> 0x001b }
            r0.unbindService(r1)     // Catch:{ IllegalArgumentException -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x002f }
        L_0x0023:
            r0 = 0
            r3.f85lp = r0     // Catch:{ all -> 0x002f }
            r0 = 0
            r3.f84lo = r0     // Catch:{ all -> 0x002f }
            r3.f83ln = r0     // Catch:{ all -> 0x002f }
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    public Info getInfo() throws IOException {
        Info info;
        C1785jx.m5358aV("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f85lp) {
                synchronized (this.f86lq) {
                    if (this.f87lr != null) {
                        if (!this.f87lr.mo10106aa()) {
                        }
                    }
                    throw new IOException("AdvertisingIdClient is not connected.");
                }
                try {
                    mo10098b(false);
                    if (!this.f85lp) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C1785jx.m5364i(this.f83ln);
            C1785jx.m5364i(this.f84lo);
            info = new Info(this.f84lo.getId(), this.f84lo.mo17127c(true));
        }
        m26Z();
        return info;
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        mo10098b(true);
    }
}
