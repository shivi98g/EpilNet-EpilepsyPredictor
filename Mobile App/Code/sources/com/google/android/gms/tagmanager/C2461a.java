package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.C1832ld;
import com.google.android.gms.internal.C1834lf;
import java.io.IOException;

/* renamed from: com.google.android.gms.tagmanager.a */
class C2461a {
    private static C2461a aqa;

    /* renamed from: xO */
    private static Object f4394xO = new Object();
    private volatile long apW;
    private volatile long apX;
    private volatile long apY;
    private C2464a apZ;
    private volatile boolean mClosed;
    /* access modifiers changed from: private */
    public final Context mContext;

    /* renamed from: wb */
    private final C1832ld f4395wb;

    /* renamed from: wu */
    private final Thread f4396wu;

    /* renamed from: xQ */
    private volatile AdvertisingIdClient.Info f4397xQ;

    /* renamed from: com.google.android.gms.tagmanager.a$a */
    public interface C2464a {
        /* renamed from: pd */
        AdvertisingIdClient.Info mo18633pd();
    }

    private C2461a(Context context) {
        this(context, (C2464a) null, C1834lf.m5525if());
    }

    C2461a(Context context, C2464a aVar, C1832ld ldVar) {
        this.apW = 900000;
        this.apX = 30000;
        this.mClosed = false;
        this.apZ = new C2464a() {
            /* renamed from: pd */
            public AdvertisingIdClient.Info mo18633pd() {
                String str;
                try {
                    return AdvertisingIdClient.getAdvertisingIdInfo(C2461a.this.mContext);
                } catch (IllegalStateException e) {
                    str = "IllegalStateException getting Advertising Id Info";
                    C2504bh.m7246W(str);
                    return null;
                } catch (GooglePlayServicesRepairableException e2) {
                    str = "GooglePlayServicesRepairableException getting Advertising Id Info";
                    C2504bh.m7246W(str);
                    return null;
                } catch (IOException e3) {
                    str = "IOException getting Ad Id Info";
                    C2504bh.m7246W(str);
                    return null;
                } catch (GooglePlayServicesNotAvailableException e4) {
                    str = "GooglePlayServicesNotAvailableException getting Advertising Id Info";
                    C2504bh.m7246W(str);
                    return null;
                } catch (Exception e5) {
                    str = "Unknown exception. Could not get the Advertising Id Info.";
                    C2504bh.m7246W(str);
                    return null;
                }
            }
        };
        this.f4395wb = ldVar;
        this.mContext = context != null ? context.getApplicationContext() : context;
        if (aVar != null) {
            this.apZ = aVar;
        }
        this.f4396wu = new Thread(new Runnable() {
            public void run() {
                C2461a.this.m7151pb();
            }
        });
    }

    /* renamed from: W */
    static C2461a m7148W(Context context) {
        if (aqa == null) {
            synchronized (f4394xO) {
                if (aqa == null) {
                    aqa = new C2461a(context);
                    aqa.start();
                }
            }
        }
        return aqa;
    }

    /* access modifiers changed from: private */
    /* renamed from: pb */
    public void m7151pb() {
        Process.setThreadPriority(10);
        while (!this.mClosed) {
            try {
                this.f4397xQ = this.apZ.mo18633pd();
                Thread.sleep(this.apW);
            } catch (InterruptedException e) {
                C2504bh.m7244U("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    /* renamed from: pc */
    private void m7152pc() {
        if (this.f4395wb.currentTimeMillis() - this.apY >= this.apX) {
            interrupt();
            this.apY = this.f4395wb.currentTimeMillis();
        }
    }

    /* access modifiers changed from: package-private */
    public void interrupt() {
        this.f4396wu.interrupt();
    }

    public boolean isLimitAdTrackingEnabled() {
        m7152pc();
        if (this.f4397xQ == null) {
            return true;
        }
        return this.f4397xQ.isLimitAdTrackingEnabled();
    }

    /* renamed from: pa */
    public String mo18631pa() {
        m7152pc();
        if (this.f4397xQ == null) {
            return null;
        }
        return this.f4397xQ.getId();
    }

    /* access modifiers changed from: package-private */
    public void start() {
        this.f4396wu.start();
    }
}
