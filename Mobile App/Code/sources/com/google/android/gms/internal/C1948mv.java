package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mv */
public interface C1948mv {

    /* renamed from: com.google.android.gms.internal.mv$a */
    public static final class C1949a extends C2160qq<C1949a> {
        public C1950a[] afu;

        /* renamed from: com.google.android.gms.internal.mv$a$a */
        public static final class C1950a extends C2160qq<C1950a> {
            private static volatile C1950a[] afv;
            public String afw;
            public String afx;
            public int viewId;

            public C1950a() {
                mo16201mY();
            }

            /* renamed from: mX */
            public static C1950a[] m5748mX() {
                if (afv == null) {
                    synchronized (C2164qu.azg) {
                        if (afv == null) {
                            afv = new C1950a[0];
                        }
                    }
                }
                return afv;
            }

            /* renamed from: a */
            public void mo11551a(C2158qp qpVar) throws IOException {
                if (!this.afw.equals("")) {
                    qpVar.mo17050b(1, this.afw);
                }
                if (!this.afx.equals("")) {
                    qpVar.mo17050b(2, this.afx);
                }
                if (this.viewId != 0) {
                    qpVar.mo17067t(3, this.viewId);
                }
                super.mo11551a(qpVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo11553c() {
                int c = super.mo11553c();
                if (!this.afw.equals("")) {
                    c += C2158qp.m6404j(1, this.afw);
                }
                if (!this.afx.equals("")) {
                    c += C2158qp.m6404j(2, this.afx);
                }
                return this.viewId != 0 ? c + C2158qp.m6407v(3, this.viewId) : c;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof C1950a)) {
                    return false;
                }
                C1950a aVar = (C1950a) obj;
                if (this.afw == null) {
                    if (aVar.afw != null) {
                        return false;
                    }
                } else if (!this.afw.equals(aVar.afw)) {
                    return false;
                }
                if (this.afx == null) {
                    if (aVar.afx != null) {
                        return false;
                    }
                } else if (!this.afx.equals(aVar.afx)) {
                    return false;
                }
                if (this.viewId != aVar.viewId) {
                    return false;
                }
                return mo17073a(aVar);
            }

            public int hashCode() {
                int i = 0;
                int hashCode = (527 + (this.afw == null ? 0 : this.afw.hashCode())) * 31;
                if (this.afx != null) {
                    i = this.afx.hashCode();
                }
                return (31 * (((hashCode + i) * 31) + this.viewId)) + mo17074rQ();
            }

            /* renamed from: mY */
            public C1950a mo16201mY() {
                this.afw = "";
                this.afx = "";
                this.viewId = 0;
                this.ayW = null;
                this.azh = -1;
                return this;
            }

            /* renamed from: o */
            public C1950a mo11552b(C2157qo qoVar) throws IOException {
                while (true) {
                    int rz = qoVar.mo17037rz();
                    if (rz == 0) {
                        return this;
                    }
                    if (rz == 10) {
                        this.afw = qoVar.readString();
                    } else if (rz == 18) {
                        this.afx = qoVar.readString();
                    } else if (rz == 24) {
                        this.viewId = qoVar.mo17022rC();
                    } else if (!mo17072a(qoVar, rz)) {
                        return this;
                    }
                }
            }
        }

        public C1949a() {
            mo16197mW();
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.afu != null && this.afu.length > 0) {
                for (C1950a aVar : this.afu) {
                    if (aVar != null) {
                        qpVar.mo17045a(1, (C2166qw) aVar);
                    }
                }
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.afu != null && this.afu.length > 0) {
                for (C1950a aVar : this.afu) {
                    if (aVar != null) {
                        c += C2158qp.m6390c(1, (C2166qw) aVar);
                    }
                }
            }
            return c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1949a)) {
                return false;
            }
            C1949a aVar = (C1949a) obj;
            if (!C2164qu.equals((Object[]) this.afu, (Object[]) aVar.afu)) {
                return false;
            }
            return mo17073a(aVar);
        }

        public int hashCode() {
            return (31 * (527 + C2164qu.hashCode((Object[]) this.afu))) + mo17074rQ();
        }

        /* renamed from: mW */
        public C1949a mo16197mW() {
            this.afu = C1950a.m5748mX();
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* renamed from: n */
        public C1949a mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    int b = C2169qz.m6494b(qoVar, 10);
                    int length = this.afu == null ? 0 : this.afu.length;
                    C1950a[] aVarArr = new C1950a[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.afu, 0, aVarArr, 0, length);
                    }
                    while (length < aVarArr.length - 1) {
                        aVarArr[length] = new C1950a();
                        qoVar.mo17010a(aVarArr[length]);
                        qoVar.mo17037rz();
                        length++;
                    }
                    aVarArr[length] = new C1950a();
                    qoVar.mo17010a(aVarArr[length]);
                    this.afu = aVarArr;
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.mv$b */
    public static final class C1951b extends C2160qq<C1951b> {
        private static volatile C1951b[] afy;
        public C1953d afz;
        public String name;

        public C1951b() {
            mo16205na();
        }

        /* renamed from: mZ */
        public static C1951b[] m5754mZ() {
            if (afy == null) {
                synchronized (C2164qu.azg) {
                    if (afy == null) {
                        afy = new C1951b[0];
                    }
                }
            }
            return afy;
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (!this.name.equals("")) {
                qpVar.mo17050b(1, this.name);
            }
            if (this.afz != null) {
                qpVar.mo17045a(2, (C2166qw) this.afz);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (!this.name.equals("")) {
                c += C2158qp.m6404j(1, this.name);
            }
            return this.afz != null ? c + C2158qp.m6390c(2, (C2166qw) this.afz) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1951b)) {
                return false;
            }
            C1951b bVar = (C1951b) obj;
            if (this.name == null) {
                if (bVar.name != null) {
                    return false;
                }
            } else if (!this.name.equals(bVar.name)) {
                return false;
            }
            if (this.afz == null) {
                if (bVar.afz != null) {
                    return false;
                }
            } else if (!this.afz.equals(bVar.afz)) {
                return false;
            }
            return mo17073a(bVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (527 + (this.name == null ? 0 : this.name.hashCode())) * 31;
            if (this.afz != null) {
                i = this.afz.hashCode();
            }
            return (31 * (hashCode + i)) + mo17074rQ();
        }

        /* renamed from: na */
        public C1951b mo16205na() {
            this.name = "";
            this.afz = null;
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* renamed from: p */
        public C1951b mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    this.name = qoVar.readString();
                } else if (rz == 18) {
                    if (this.afz == null) {
                        this.afz = new C1953d();
                    }
                    qoVar.mo17010a(this.afz);
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.mv$c */
    public static final class C1952c extends C2160qq<C1952c> {
        public C1951b[] afA;
        public String type;

        public C1952c() {
            mo16209nb();
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (!this.type.equals("")) {
                qpVar.mo17050b(1, this.type);
            }
            if (this.afA != null && this.afA.length > 0) {
                for (C1951b bVar : this.afA) {
                    if (bVar != null) {
                        qpVar.mo17045a(2, (C2166qw) bVar);
                    }
                }
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (!this.type.equals("")) {
                c += C2158qp.m6404j(1, this.type);
            }
            if (this.afA != null && this.afA.length > 0) {
                for (C1951b bVar : this.afA) {
                    if (bVar != null) {
                        c += C2158qp.m6390c(2, (C2166qw) bVar);
                    }
                }
            }
            return c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1952c)) {
                return false;
            }
            C1952c cVar = (C1952c) obj;
            if (this.type == null) {
                if (cVar.type != null) {
                    return false;
                }
            } else if (!this.type.equals(cVar.type)) {
                return false;
            }
            if (!C2164qu.equals((Object[]) this.afA, (Object[]) cVar.afA)) {
                return false;
            }
            return mo17073a(cVar);
        }

        public int hashCode() {
            return (31 * (((527 + (this.type == null ? 0 : this.type.hashCode())) * 31) + C2164qu.hashCode((Object[]) this.afA))) + mo17074rQ();
        }

        /* renamed from: nb */
        public C1952c mo16209nb() {
            this.type = "";
            this.afA = C1951b.m5754mZ();
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* renamed from: q */
        public C1952c mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    this.type = qoVar.readString();
                } else if (rz == 18) {
                    int b = C2169qz.m6494b(qoVar, 18);
                    int length = this.afA == null ? 0 : this.afA.length;
                    C1951b[] bVarArr = new C1951b[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.afA, 0, bVarArr, 0, length);
                    }
                    while (length < bVarArr.length - 1) {
                        bVarArr[length] = new C1951b();
                        qoVar.mo17010a(bVarArr[length]);
                        qoVar.mo17037rz();
                        length++;
                    }
                    bVarArr[length] = new C1951b();
                    qoVar.mo17010a(bVarArr[length]);
                    this.afA = bVarArr;
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.mv$d */
    public static final class C1953d extends C2160qq<C1953d> {

        /* renamed from: NJ */
        public String f4127NJ;
        public boolean afB;
        public long afC;
        public double afD;
        public C1952c afE;

        public C1953d() {
            mo16213nc();
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.afB) {
                qpVar.mo17051b(1, this.afB);
            }
            if (!this.f4127NJ.equals("")) {
                qpVar.mo17050b(2, this.f4127NJ);
            }
            if (this.afC != 0) {
                qpVar.mo17049b(3, this.afC);
            }
            if (Double.doubleToLongBits(this.afD) != Double.doubleToLongBits(0.0d)) {
                qpVar.mo17044a(4, this.afD);
            }
            if (this.afE != null) {
                qpVar.mo17045a(5, (C2166qw) this.afE);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.afB) {
                c += C2158qp.m6391c(1, this.afB);
            }
            if (!this.f4127NJ.equals("")) {
                c += C2158qp.m6404j(2, this.f4127NJ);
            }
            if (this.afC != 0) {
                c += C2158qp.m6392d(3, this.afC);
            }
            if (Double.doubleToLongBits(this.afD) != Double.doubleToLongBits(0.0d)) {
                c += C2158qp.m6385b(4, this.afD);
            }
            return this.afE != null ? c + C2158qp.m6390c(5, (C2166qw) this.afE) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1953d)) {
                return false;
            }
            C1953d dVar = (C1953d) obj;
            if (this.afB != dVar.afB) {
                return false;
            }
            if (this.f4127NJ == null) {
                if (dVar.f4127NJ != null) {
                    return false;
                }
            } else if (!this.f4127NJ.equals(dVar.f4127NJ)) {
                return false;
            }
            if (this.afC != dVar.afC || Double.doubleToLongBits(this.afD) != Double.doubleToLongBits(dVar.afD)) {
                return false;
            }
            if (this.afE == null) {
                if (dVar.afE != null) {
                    return false;
                }
            } else if (!this.afE.equals(dVar.afE)) {
                return false;
            }
            return mo17073a(dVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((527 + (this.afB ? 1231 : 1237)) * 31) + (this.f4127NJ == null ? 0 : this.f4127NJ.hashCode())) * 31) + ((int) (this.afC ^ (this.afC >>> 32)));
            long doubleToLongBits = Double.doubleToLongBits(this.afD);
            int i2 = ((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            if (this.afE != null) {
                i = this.afE.hashCode();
            }
            return (31 * (i2 + i)) + mo17074rQ();
        }

        /* renamed from: nc */
        public C1953d mo16213nc() {
            this.afB = false;
            this.f4127NJ = "";
            this.afC = 0;
            this.afD = 0.0d;
            this.afE = null;
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* renamed from: r */
        public C1953d mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 8) {
                    this.afB = qoVar.mo17023rD();
                } else if (rz == 18) {
                    this.f4127NJ = qoVar.readString();
                } else if (rz == 24) {
                    this.afC = qoVar.mo17021rB();
                } else if (rz == 33) {
                    this.afD = qoVar.readDouble();
                } else if (rz == 42) {
                    if (this.afE == null) {
                        this.afE = new C1952c();
                    }
                    qoVar.mo17010a(this.afE);
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }
    }
}
