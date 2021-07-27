package com.google.android.gms.internal;

import android.text.TextUtils;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.il */
public abstract class C1696il {

    /* renamed from: He */
    protected final C1714is f3754He;

    /* renamed from: Hf */
    private final String f3755Hf;

    /* renamed from: Hg */
    private C1718iu f3756Hg;

    protected C1696il(String str, String str2, String str3) {
        C1706in.m5032aF(str);
        this.f3755Hf = str;
        this.f3754He = new C1714is(str2);
        if (!TextUtils.isEmpty(str3)) {
            this.f3754He.mo15716aK(str3);
        }
    }

    /* renamed from: a */
    public final void mo15641a(C1718iu iuVar) {
        this.f3756Hg = iuVar;
        if (this.f3756Hg == null) {
            mo15646fV();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15642a(String str, long j, String str2) throws IOException {
        this.f3754He.mo15714a("Sending text message: %s to: %s", str, str2);
        this.f3756Hg.mo10821a(this.f3755Hf, str, j, str2);
    }

    /* renamed from: aD */
    public void mo15643aD(String str) {
    }

    /* renamed from: b */
    public void mo15644b(long j, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: fU */
    public final long mo15645fU() {
        return this.f3756Hg.mo10823fS();
    }

    /* renamed from: fV */
    public void mo15646fV() {
    }

    public final String getNamespace() {
        return this.f3755Hf;
    }
}
