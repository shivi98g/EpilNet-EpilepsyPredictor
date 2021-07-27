package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.C1351c;
import com.google.android.gms.tagmanager.C2611o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.tagmanager.cp */
class C2543cp implements C2611o.C2618e {
    private String aqI;
    /* access modifiers changed from: private */
    public final String aqm;
    private C2502bg<C1351c.C1361j> asC;
    private C2622r asD;
    private final ScheduledExecutorService asF;
    private final C2546a asG;
    private ScheduledFuture<?> asH;
    private boolean mClosed;
    /* access modifiers changed from: private */
    public final Context mContext;

    /* renamed from: com.google.android.gms.tagmanager.cp$a */
    interface C2546a {
        /* renamed from: a */
        C2542co mo18739a(C2622r rVar);
    }

    /* renamed from: com.google.android.gms.tagmanager.cp$b */
    interface C2547b {
        /* renamed from: qh */
        ScheduledExecutorService mo18738qh();
    }

    public C2543cp(Context context, String str, C2622r rVar) {
        this(context, str, rVar, (C2547b) null, (C2546a) null);
    }

    C2543cp(Context context, String str, C2622r rVar, C2547b bVar, C2546a aVar) {
        this.asD = rVar;
        this.mContext = context;
        this.aqm = str;
        this.asF = (bVar == null ? new C2547b() {
            /* renamed from: qh */
            public ScheduledExecutorService mo18738qh() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        } : bVar).mo18738qh();
        if (aVar == null) {
            this.asG = new C2546a() {
                /* renamed from: a */
                public C2542co mo18739a(C2622r rVar) {
                    return new C2542co(C2543cp.this.mContext, C2543cp.this.aqm, rVar);
                }
            };
        } else {
            this.asG = aVar;
        }
    }

    /* renamed from: cM */
    private C2542co m7364cM(String str) {
        C2542co a = this.asG.mo18739a(this.asD);
        a.mo18730a(this.asC);
        a.mo18732cw(this.aqI);
        a.mo18731cL(str);
        return a;
    }

    /* renamed from: qg */
    private synchronized void m7365qg() {
        if (this.mClosed) {
            throw new IllegalStateException("called method after closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo18735a(C2502bg<C1351c.C1361j> bgVar) {
        m7365qg();
        this.asC = bgVar;
    }

    /* renamed from: cw */
    public synchronized void mo18736cw(String str) {
        m7365qg();
        this.aqI = str;
    }

    /* renamed from: e */
    public synchronized void mo18737e(long j, String str) {
        C2504bh.m7245V("loadAfterDelay: containerId=" + this.aqm + " delay=" + j);
        m7365qg();
        if (this.asC == null) {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        if (this.asH != null) {
            this.asH.cancel(false);
        }
        this.asH = this.asF.schedule(m7364cM(str), j, TimeUnit.MILLISECONDS);
    }

    public synchronized void release() {
        m7365qg();
        if (this.asH != null) {
            this.asH.cancel(false);
        }
        this.asF.shutdown();
        this.mClosed = true;
    }
}
