package com.google.android.gms.internal;

import com.google.android.gms.internal.C2160qq;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.qq */
public abstract class C2160qq<M extends C2160qq<M>> extends C2166qw {
    protected C2162qs ayW;

    /* renamed from: a */
    public final <T> T mo17071a(C2161qr<M, T> qrVar) {
        C2163qt hh;
        if (this.ayW == null || (hh = this.ayW.mo17087hh(C2169qz.m6496hl(qrVar.tag))) == null) {
            return null;
        }
        return hh.mo17093b(qrVar);
    }

    /* renamed from: a */
    public void mo11551a(C2158qp qpVar) throws IOException {
        if (this.ayW != null) {
            for (int i = 0; i < this.ayW.size(); i++) {
                this.ayW.mo17088hi(i).mo17091a(qpVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17072a(C2157qo qoVar, int i) throws IOException {
        int position = qoVar.getPosition();
        if (!qoVar.mo17013gQ(i)) {
            return false;
        }
        int hl = C2169qz.m6496hl(i);
        C2168qy qyVar = new C2168qy(i, qoVar.mo17038s(position, qoVar.getPosition() - position));
        C2163qt qtVar = null;
        if (this.ayW == null) {
            this.ayW = new C2162qs();
        } else {
            qtVar = this.ayW.mo17087hh(hl);
        }
        if (qtVar == null) {
            qtVar = new C2163qt();
            this.ayW.mo17084a(hl, qtVar);
        }
        qtVar.mo17092a(qyVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17073a(M m) {
        return (this.ayW == null || this.ayW.isEmpty()) ? m.ayW == null || m.ayW.isEmpty() : this.ayW.equals(m.ayW);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo11553c() {
        if (this.ayW == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.ayW.size(); i2++) {
            i += this.ayW.mo17088hi(i2).mo17094c();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: rQ */
    public final int mo17074rQ() {
        if (this.ayW == null || this.ayW.isEmpty()) {
            return 0;
        }
        return this.ayW.hashCode();
    }
}
