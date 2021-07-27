package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.analytics.C0605y;

/* renamed from: com.google.android.gms.analytics.v */
class C0588v extends C0556aj {
    /* access modifiers changed from: private */

    /* renamed from: yT */
    public static final Object f285yT = new Object();

    /* renamed from: zf */
    private static C0588v f286zf;
    private Context mContext;
    /* access modifiers changed from: private */
    public Handler mHandler;

    /* renamed from: yU */
    private C0567d f287yU;

    /* renamed from: yV */
    private volatile C0569f f288yV;
    /* access modifiers changed from: private */

    /* renamed from: yW */
    public int f289yW = 1800;

    /* renamed from: yX */
    private boolean f290yX = true;

    /* renamed from: yY */
    private boolean f291yY;

    /* renamed from: yZ */
    private String f292yZ;

    /* renamed from: yt */
    private boolean f293yt = false;
    /* access modifiers changed from: private */

    /* renamed from: za */
    public boolean f294za = true;

    /* renamed from: zb */
    private boolean f295zb = true;

    /* renamed from: zc */
    private C0568e f296zc = new C0568e() {
        /* renamed from: B */
        public void mo10413B(boolean z) {
            C0588v.this.mo10479a(z, C0588v.this.f294za);
        }
    };

    /* renamed from: zd */
    private C0587u f297zd;
    /* access modifiers changed from: private */

    /* renamed from: ze */
    public boolean f298ze = false;

    private C0588v() {
    }

    /* renamed from: eu */
    public static C0588v m268eu() {
        if (f286zf == null) {
            f286zf = new C0588v();
        }
        return f286zf;
    }

    /* renamed from: ev */
    private void m269ev() {
        this.f297zd = new C0587u(this);
        this.f297zd.mo10477z(this.mContext);
    }

    /* renamed from: ew */
    private void m270ew() {
        this.mHandler = new Handler(this.mContext.getMainLooper(), new Handler.Callback() {
            public boolean handleMessage(Message message) {
                if (1 == message.what && C0588v.f285yT.equals(message.obj)) {
                    C0605y.m324eK().mo10498D(true);
                    C0588v.this.dispatchLocalHits();
                    C0605y.m324eK().mo10498D(false);
                    if (C0588v.this.f289yW > 0 && !C0588v.this.f298ze) {
                        C0588v.this.mHandler.sendMessageDelayed(C0588v.this.mHandler.obtainMessage(1, C0588v.f285yT), (long) (C0588v.this.f289yW * 1000));
                    }
                }
                return true;
            }
        });
        if (this.f289yW > 0) {
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, f285yT), (long) (this.f289yW * 1000));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public synchronized void mo10374C(boolean z) {
        mo10479a(this.f298ze, z);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo10478a(android.content.Context r2, com.google.android.gms.analytics.C0569f r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.Context r0 = r1.mContext     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0028 }
            r1.mContext = r2     // Catch:{ all -> 0x0028 }
            com.google.android.gms.analytics.f r2 = r1.f288yV     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x0026
            r1.f288yV = r3     // Catch:{ all -> 0x0028 }
            boolean r2 = r1.f290yX     // Catch:{ all -> 0x0028 }
            r3 = 0
            if (r2 == 0) goto L_0x001d
            r1.dispatchLocalHits()     // Catch:{ all -> 0x0028 }
            r1.f290yX = r3     // Catch:{ all -> 0x0028 }
        L_0x001d:
            boolean r2 = r1.f291yY     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0026
            r1.mo10480dW()     // Catch:{ all -> 0x0028 }
            r1.f291yY = r3     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)
            return
        L_0x0028:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0588v.mo10478a(android.content.Context, com.google.android.gms.analytics.f):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo10479a(boolean z, boolean z2) {
        String str;
        if (this.f298ze != z || this.f294za != z2) {
            if (z || !z2) {
                if (this.f289yW > 0) {
                    this.mHandler.removeMessages(1, f285yT);
                }
            }
            if (!z && z2 && this.f289yW > 0) {
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, f285yT), (long) (this.f289yW * 1000));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("PowerSaveMode ");
            if (!z) {
                if (z2) {
                    str = "terminated.";
                    sb.append(str);
                    C0550ae.m105V(sb.toString());
                    this.f298ze = z;
                    this.f294za = z2;
                }
            }
            str = "initiated.";
            sb.append(str);
            C0550ae.m105V(sb.toString());
            this.f298ze = z;
            this.f294za = z2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dW */
    public void mo10480dW() {
        if (this.f288yV == null) {
            C0550ae.m105V("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            this.f291yY = true;
            return;
        }
        C0605y.m324eK().mo10499a(C0605y.C0606a.SET_FORCE_LOCAL_DISPATCH);
        this.f288yV.mo10446dW();
    }

    /* access modifiers changed from: package-private */
    public synchronized void dispatchLocalHits() {
        if (this.f288yV == null) {
            C0550ae.m105V("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f290yX = true;
            return;
        }
        C0605y.m324eK().mo10499a(C0605y.C0606a.DISPATCH);
        this.f288yV.dispatch();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ex */
    public synchronized C0567d mo10481ex() {
        if (this.f287yU == null) {
            if (this.mContext == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.f287yU = new C0552ag(this.f296zc, this.mContext, new C0574j());
            this.f287yU.setDryRun(this.f293yt);
            if (this.f292yZ != null) {
                this.f287yU.mo10362dV().mo10456ad(this.f292yZ);
                this.f292yZ = null;
            }
        }
        if (this.mHandler == null) {
            m270ew();
        }
        if (this.f297zd == null && this.f295zb) {
            m269ev();
        }
        return this.f287yU;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ey */
    public synchronized void mo10376ey() {
        if (!this.f298ze && this.f294za && this.f289yW > 0) {
            this.mHandler.removeMessages(1, f285yT);
            this.mHandler.sendMessage(this.mHandler.obtainMessage(1, f285yT));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setLocalDispatchPeriod(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.Handler r0 = r4.mHandler     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "Dispatch period set with null handler. Dispatch will run once initialization is complete."
            com.google.android.gms.analytics.C0550ae.m105V(r0)     // Catch:{ all -> 0x0049 }
            r4.f289yW = r5     // Catch:{ all -> 0x0049 }
            monitor-exit(r4)
            return
        L_0x000e:
            com.google.android.gms.analytics.y r0 = com.google.android.gms.analytics.C0605y.m324eK()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.analytics.y$a r1 = com.google.android.gms.analytics.C0605y.C0606a.SET_DISPATCH_PERIOD     // Catch:{ all -> 0x0049 }
            r0.mo10499a(r1)     // Catch:{ all -> 0x0049 }
            boolean r0 = r4.f298ze     // Catch:{ all -> 0x0049 }
            r1 = 1
            if (r0 != 0) goto L_0x002b
            boolean r0 = r4.f294za     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x002b
            int r0 = r4.f289yW     // Catch:{ all -> 0x0049 }
            if (r0 <= 0) goto L_0x002b
            android.os.Handler r0 = r4.mHandler     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = f285yT     // Catch:{ all -> 0x0049 }
            r0.removeMessages(r1, r2)     // Catch:{ all -> 0x0049 }
        L_0x002b:
            r4.f289yW = r5     // Catch:{ all -> 0x0049 }
            if (r5 <= 0) goto L_0x0047
            boolean r0 = r4.f298ze     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0047
            boolean r0 = r4.f294za     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0047
            android.os.Handler r0 = r4.mHandler     // Catch:{ all -> 0x0049 }
            android.os.Handler r2 = r4.mHandler     // Catch:{ all -> 0x0049 }
            java.lang.Object r3 = f285yT     // Catch:{ all -> 0x0049 }
            android.os.Message r1 = r2.obtainMessage(r1, r3)     // Catch:{ all -> 0x0049 }
            int r2 = r5 * 1000
            long r2 = (long) r2     // Catch:{ all -> 0x0049 }
            r0.sendMessageDelayed(r1, r2)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r4)
            return
        L_0x0049:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C0588v.setLocalDispatchPeriod(int):void");
    }
}
