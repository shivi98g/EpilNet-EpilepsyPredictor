package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.qs */
class C2162qs {
    private static final C2163qt ayZ = new C2163qt();
    private boolean aza;
    private int[] azb;
    private C2163qt[] azc;
    private int mSize;

    public C2162qs() {
        this(10);
    }

    public C2162qs(int i) {
        this.aza = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.azb = new int[idealIntArraySize];
        this.azc = new C2163qt[idealIntArraySize];
        this.mSize = 0;
    }

    /* renamed from: a */
    private boolean m6459a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m6460a(C2163qt[] qtVarArr, C2163qt[] qtVarArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!qtVarArr[i2].equals(qtVarArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: gc */
    private void m6461gc() {
        int i = this.mSize;
        int[] iArr = this.azb;
        C2163qt[] qtVarArr = this.azc;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C2163qt qtVar = qtVarArr[i3];
            if (qtVar != ayZ) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    qtVarArr[i2] = qtVar;
                    qtVarArr[i3] = null;
                }
                i2++;
            }
        }
        this.aza = false;
        this.mSize = i2;
    }

    /* renamed from: hj */
    private int m6462hj(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.azb[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    private int idealByteArraySize(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    private int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    /* renamed from: a */
    public void mo17084a(int i, C2163qt qtVar) {
        int hj = m6462hj(i);
        if (hj >= 0) {
            this.azc[hj] = qtVar;
            return;
        }
        int i2 = ~hj;
        if (i2 >= this.mSize || this.azc[i2] != ayZ) {
            if (this.aza && this.mSize >= this.azb.length) {
                m6461gc();
                i2 = ~m6462hj(i);
            }
            if (this.mSize >= this.azb.length) {
                int idealIntArraySize = idealIntArraySize(this.mSize + 1);
                int[] iArr = new int[idealIntArraySize];
                C2163qt[] qtVarArr = new C2163qt[idealIntArraySize];
                System.arraycopy(this.azb, 0, iArr, 0, this.azb.length);
                System.arraycopy(this.azc, 0, qtVarArr, 0, this.azc.length);
                this.azb = iArr;
                this.azc = qtVarArr;
            }
            if (this.mSize - i2 != 0) {
                int i3 = i2 + 1;
                System.arraycopy(this.azb, i2, this.azb, i3, this.mSize - i2);
                System.arraycopy(this.azc, i2, this.azc, i3, this.mSize - i2);
            }
            this.azb[i2] = i;
            this.azc[i2] = qtVar;
            this.mSize++;
            return;
        }
        this.azb[i2] = i;
        this.azc[i2] = qtVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2162qs)) {
            return false;
        }
        C2162qs qsVar = (C2162qs) obj;
        if (size() != qsVar.size()) {
            return false;
        }
        return m6459a(this.azb, qsVar.azb, this.mSize) && m6460a(this.azc, qsVar.azc, this.mSize);
    }

    public int hashCode() {
        if (this.aza) {
            m6461gc();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = this.azc[i2].hashCode() + (31 * ((i * 31) + this.azb[i2]));
        }
        return i;
    }

    /* renamed from: hh */
    public C2163qt mo17087hh(int i) {
        int hj = m6462hj(i);
        if (hj < 0 || this.azc[hj] == ayZ) {
            return null;
        }
        return this.azc[hj];
    }

    /* renamed from: hi */
    public C2163qt mo17088hi(int i) {
        if (this.aza) {
            m6461gc();
        }
        return this.azc[i];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        if (this.aza) {
            m6461gc();
        }
        return this.mSize;
    }
}
