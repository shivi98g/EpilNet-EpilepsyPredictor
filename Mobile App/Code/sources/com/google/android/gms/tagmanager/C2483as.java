package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.tagmanager.as */
class C2483as extends Thread implements C2482ar {
    private static C2483as ary;
    private final LinkedBlockingQueue<Runnable> arx = new LinkedBlockingQueue<>();
    /* access modifiers changed from: private */
    public volatile C2485at arz;
    private volatile boolean mClosed = false;
    /* access modifiers changed from: private */
    public final Context mContext;

    /* renamed from: zK */
    private volatile boolean f4410zK = false;

    private C2483as(Context context) {
        super("GAThread");
        this.mContext = context != null ? context.getApplicationContext() : context;
        start();
    }

    /* renamed from: Z */
    static C2483as m7197Z(Context context) {
        if (ary == null) {
            ary = new C2483as(context);
        }
        return ary;
    }

    /* renamed from: g */
    private String m7201g(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: b */
    public void mo18655b(Runnable runnable) {
        this.arx.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18657b(String str, long j) {
        final long j2 = j;
        final String str2 = str;
        mo18655b((Runnable) new Runnable() {
            public void run() {
                if (C2483as.this.arz == null) {
                    C2573cy qN = C2573cy.m7487qN();
                    qN.mo18821a(C2483as.this.mContext, this);
                    C2485at unused = C2483as.this.arz = qN.mo18823qO();
                }
                C2483as.this.arz.mo18661f(j2, str2);
            }
        });
    }

    /* renamed from: cE */
    public void mo18656cE(String str) {
        mo18657b(str, System.currentTimeMillis());
    }

    public void run() {
        while (!this.mClosed) {
            try {
                Runnable take = this.arx.take();
                if (!this.f4410zK) {
                    take.run();
                }
            } catch (InterruptedException e) {
                C2504bh.m7244U(e.toString());
            } catch (Throwable th) {
                C2504bh.m7243T("Error on Google TagManager Thread: " + m7201g(th));
                C2504bh.m7243T("Google TagManager is shutting down.");
                this.f4410zK = true;
            }
        }
    }
}
