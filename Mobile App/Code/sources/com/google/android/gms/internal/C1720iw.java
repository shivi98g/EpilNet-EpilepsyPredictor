package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.iw */
public final class C1720iw {

    /* renamed from: Hh */
    private static final C1714is f3830Hh = new C1714is("RequestTracker");

    /* renamed from: Ip */
    public static final Object f3831Ip = new Object();

    /* renamed from: Il */
    private long f3832Il;

    /* renamed from: Im */
    private long f3833Im = -1;

    /* renamed from: In */
    private long f3834In = 0;

    /* renamed from: Io */
    private C1719iv f3835Io;

    public C1720iw(long j) {
        this.f3832Il = j;
    }

    /* renamed from: gq */
    private void m5115gq() {
        this.f3833Im = -1;
        this.f3835Io = null;
        this.f3834In = 0;
    }

    /* renamed from: a */
    public void mo15739a(long j, C1719iv ivVar) {
        C1719iv ivVar2;
        long j2;
        synchronized (f3831Ip) {
            ivVar2 = this.f3835Io;
            j2 = this.f3833Im;
            this.f3833Im = j;
            this.f3835Io = ivVar;
            this.f3834In = SystemClock.elapsedRealtime();
        }
        if (ivVar2 != null) {
            ivVar2.mo10828n(j2);
        }
    }

    /* renamed from: b */
    public boolean mo15740b(long j, int i, JSONObject jSONObject) {
        boolean z;
        C1719iv ivVar;
        synchronized (f3831Ip) {
            z = true;
            if (this.f3833Im == -1 || this.f3833Im != j) {
                ivVar = null;
                z = false;
            } else {
                f3830Hh.mo15717b("request %d completed", Long.valueOf(this.f3833Im));
                ivVar = this.f3835Io;
                m5115gq();
            }
        }
        if (ivVar != null) {
            ivVar.mo10827a(j, i, jSONObject);
        }
        return z;
    }

    public void clear() {
        synchronized (f3831Ip) {
            if (this.f3833Im != -1) {
                m5115gq();
            }
        }
    }

    /* renamed from: d */
    public boolean mo15742d(long j, int i) {
        return mo15740b(j, i, (JSONObject) null);
    }

    /* renamed from: e */
    public boolean mo15743e(long j, int i) {
        boolean z;
        long j2;
        C1719iv ivVar;
        synchronized (f3831Ip) {
            z = true;
            if (this.f3833Im == -1 || j - this.f3834In < this.f3832Il) {
                j2 = 0;
                ivVar = null;
                z = false;
            } else {
                f3830Hh.mo15717b("request %d timed out", Long.valueOf(this.f3833Im));
                j2 = this.f3833Im;
                ivVar = this.f3835Io;
                m5115gq();
            }
        }
        if (ivVar != null) {
            ivVar.mo10827a(j2, i, (JSONObject) null);
        }
        return z;
    }

    /* renamed from: gr */
    public boolean mo15744gr() {
        boolean z;
        synchronized (f3831Ip) {
            z = this.f3833Im != -1;
        }
        return z;
    }

    /* renamed from: p */
    public boolean mo15745p(long j) {
        boolean z;
        synchronized (f3831Ip) {
            z = this.f3833Im != -1 && this.f3833Im == j;
        }
        return z;
    }
}
