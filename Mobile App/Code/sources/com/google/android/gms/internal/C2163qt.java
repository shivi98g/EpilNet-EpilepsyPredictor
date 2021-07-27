package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.qt */
class C2163qt {
    private C2161qr<?, ?> azd;
    private Object aze;
    private List<C2168qy> azf = new ArrayList();

    C2163qt() {
    }

    private byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[mo17094c()];
        mo17091a(C2158qp.m6405q(bArr));
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17091a(C2158qp qpVar) throws IOException {
        if (this.aze != null) {
            this.azd.mo17079a(this.aze, qpVar);
            return;
        }
        for (C2168qy a : this.azf) {
            a.mo17100a(qpVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17092a(C2168qy qyVar) {
        this.azf.add(qyVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> T mo17093b(C2161qr<?, T> qrVar) {
        if (this.aze == null) {
            this.azd = qrVar;
            this.aze = qrVar.mo17082m(this.azf);
            this.azf = null;
        } else if (this.azd != qrVar) {
            throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
        }
        return this.aze;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17094c() {
        if (this.aze != null) {
            return this.azd.mo17075B(this.aze);
        }
        int i = 0;
        for (C2168qy c : this.azf) {
            i += c.mo17101c();
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2163qt)) {
            return false;
        }
        C2163qt qtVar = (C2163qt) obj;
        if (this.aze == null || qtVar.aze == null) {
            if (this.azf != null && qtVar.azf != null) {
                return this.azf.equals(qtVar.azf);
            }
            try {
                return Arrays.equals(toByteArray(), qtVar.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.azd != qtVar.azd) {
            return false;
        } else {
            return !this.azd.ayX.isArray() ? this.aze.equals(qtVar.aze) : this.aze instanceof byte[] ? Arrays.equals((byte[]) this.aze, (byte[]) qtVar.aze) : this.aze instanceof int[] ? Arrays.equals((int[]) this.aze, (int[]) qtVar.aze) : this.aze instanceof long[] ? Arrays.equals((long[]) this.aze, (long[]) qtVar.aze) : this.aze instanceof float[] ? Arrays.equals((float[]) this.aze, (float[]) qtVar.aze) : this.aze instanceof double[] ? Arrays.equals((double[]) this.aze, (double[]) qtVar.aze) : this.aze instanceof boolean[] ? Arrays.equals((boolean[]) this.aze, (boolean[]) qtVar.aze) : Arrays.deepEquals((Object[]) this.aze, (Object[]) qtVar.aze);
        }
    }

    public int hashCode() {
        try {
            return 527 + Arrays.hashCode(toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
