package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.qy */
final class C2168qy {
    final byte[] azi;
    final int tag;

    C2168qy(int i, byte[] bArr) {
        this.tag = i;
        this.azi = bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17100a(C2158qp qpVar) throws IOException {
        qpVar.mo17062hd(this.tag);
        qpVar.mo17068t(this.azi);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17101c() {
        return 0 + C2158qp.m6402he(this.tag) + this.azi.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2168qy)) {
            return false;
        }
        C2168qy qyVar = (C2168qy) obj;
        return this.tag == qyVar.tag && Arrays.equals(this.azi, qyVar.azi);
    }

    public int hashCode() {
        return (31 * (527 + this.tag)) + Arrays.hashCode(this.azi);
    }
}
