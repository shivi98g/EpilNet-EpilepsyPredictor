package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.qm */
public final class C2152qm extends C2160qq<C2152qm> {
    public C2153a[] ayq;

    /* renamed from: com.google.android.gms.internal.qm$a */
    public static final class C2153a extends C2160qq<C2153a> {
        private static volatile C2153a[] ayr;
        public C2154a ays;
        public String name;

        /* renamed from: com.google.android.gms.internal.qm$a$a */
        public static final class C2154a extends C2160qq<C2154a> {
            private static volatile C2154a[] ayt;
            public C2155a ayu;
            public int type;

            /* renamed from: com.google.android.gms.internal.qm$a$a$a */
            public static final class C2155a extends C2160qq<C2155a> {
                public int ayA;
                public int ayB;
                public boolean ayC;
                public C2153a[] ayD;
                public C2154a[] ayE;
                public String[] ayF;
                public long[] ayG;
                public float[] ayH;
                public long ayI;
                public byte[] ayv;
                public String ayw;
                public double ayx;
                public float ayy;
                public long ayz;

                public C2155a() {
                    mo17007ry();
                }

                /* renamed from: a */
                public void mo11551a(C2158qp qpVar) throws IOException {
                    if (!Arrays.equals(this.ayv, C2169qz.azq)) {
                        qpVar.mo17046a(1, this.ayv);
                    }
                    if (!this.ayw.equals("")) {
                        qpVar.mo17050b(2, this.ayw);
                    }
                    if (Double.doubleToLongBits(this.ayx) != Double.doubleToLongBits(0.0d)) {
                        qpVar.mo17044a(3, this.ayx);
                    }
                    if (Float.floatToIntBits(this.ayy) != Float.floatToIntBits(0.0f)) {
                        qpVar.mo17048b(4, this.ayy);
                    }
                    if (this.ayz != 0) {
                        qpVar.mo17049b(5, this.ayz);
                    }
                    if (this.ayA != 0) {
                        qpVar.mo17067t(6, this.ayA);
                    }
                    if (this.ayB != 0) {
                        qpVar.mo17069u(7, this.ayB);
                    }
                    if (this.ayC) {
                        qpVar.mo17051b(8, this.ayC);
                    }
                    if (this.ayD != null && this.ayD.length > 0) {
                        for (C2153a aVar : this.ayD) {
                            if (aVar != null) {
                                qpVar.mo17045a(9, (C2166qw) aVar);
                            }
                        }
                    }
                    if (this.ayE != null && this.ayE.length > 0) {
                        for (C2154a aVar2 : this.ayE) {
                            if (aVar2 != null) {
                                qpVar.mo17045a(10, (C2166qw) aVar2);
                            }
                        }
                    }
                    if (this.ayF != null && this.ayF.length > 0) {
                        for (String str : this.ayF) {
                            if (str != null) {
                                qpVar.mo17050b(11, str);
                            }
                        }
                    }
                    if (this.ayG != null && this.ayG.length > 0) {
                        for (long b : this.ayG) {
                            qpVar.mo17049b(12, b);
                        }
                    }
                    if (this.ayI != 0) {
                        qpVar.mo17049b(13, this.ayI);
                    }
                    if (this.ayH != null && this.ayH.length > 0) {
                        for (float b2 : this.ayH) {
                            qpVar.mo17048b(14, b2);
                        }
                    }
                    super.mo11551a(qpVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo11553c() {
                    int c = super.mo11553c();
                    if (!Arrays.equals(this.ayv, C2169qz.azq)) {
                        c += C2158qp.m6387b(1, this.ayv);
                    }
                    if (!this.ayw.equals("")) {
                        c += C2158qp.m6404j(2, this.ayw);
                    }
                    if (Double.doubleToLongBits(this.ayx) != Double.doubleToLongBits(0.0d)) {
                        c += C2158qp.m6385b(3, this.ayx);
                    }
                    if (Float.floatToIntBits(this.ayy) != Float.floatToIntBits(0.0f)) {
                        c += C2158qp.m6389c(4, this.ayy);
                    }
                    if (this.ayz != 0) {
                        c += C2158qp.m6392d(5, this.ayz);
                    }
                    if (this.ayA != 0) {
                        c += C2158qp.m6407v(6, this.ayA);
                    }
                    if (this.ayB != 0) {
                        c += C2158qp.m6408w(7, this.ayB);
                    }
                    if (this.ayC) {
                        c += C2158qp.m6391c(8, this.ayC);
                    }
                    if (this.ayD != null && this.ayD.length > 0) {
                        int i = c;
                        for (C2153a aVar : this.ayD) {
                            if (aVar != null) {
                                i += C2158qp.m6390c(9, (C2166qw) aVar);
                            }
                        }
                        c = i;
                    }
                    if (this.ayE != null && this.ayE.length > 0) {
                        int i2 = c;
                        for (C2154a aVar2 : this.ayE) {
                            if (aVar2 != null) {
                                i2 += C2158qp.m6390c(10, (C2166qw) aVar2);
                            }
                        }
                        c = i2;
                    }
                    if (this.ayF != null && this.ayF.length > 0) {
                        int i3 = 0;
                        int i4 = 0;
                        for (String str : this.ayF) {
                            if (str != null) {
                                i4++;
                                i3 += C2158qp.m6394dk(str);
                            }
                        }
                        c = c + i3 + (i4 * 1);
                    }
                    if (this.ayG != null && this.ayG.length > 0) {
                        int i5 = 0;
                        for (long D : this.ayG) {
                            i5 += C2158qp.m6380D(D);
                        }
                        c = c + i5 + (this.ayG.length * 1);
                    }
                    if (this.ayI != 0) {
                        c += C2158qp.m6392d(13, this.ayI);
                    }
                    return (this.ayH == null || this.ayH.length <= 0) ? c : c + (4 * this.ayH.length) + (1 * this.ayH.length);
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof C2155a)) {
                        return false;
                    }
                    C2155a aVar = (C2155a) obj;
                    if (!Arrays.equals(this.ayv, aVar.ayv)) {
                        return false;
                    }
                    if (this.ayw == null) {
                        if (aVar.ayw != null) {
                            return false;
                        }
                    } else if (!this.ayw.equals(aVar.ayw)) {
                        return false;
                    }
                    if (Double.doubleToLongBits(this.ayx) == Double.doubleToLongBits(aVar.ayx) && Float.floatToIntBits(this.ayy) == Float.floatToIntBits(aVar.ayy) && this.ayz == aVar.ayz && this.ayA == aVar.ayA && this.ayB == aVar.ayB && this.ayC == aVar.ayC && C2164qu.equals((Object[]) this.ayD, (Object[]) aVar.ayD) && C2164qu.equals((Object[]) this.ayE, (Object[]) aVar.ayE) && C2164qu.equals((Object[]) this.ayF, (Object[]) aVar.ayF) && C2164qu.equals(this.ayG, aVar.ayG) && C2164qu.equals(this.ayH, aVar.ayH) && this.ayI == aVar.ayI) {
                        return mo17073a(aVar);
                    }
                    return false;
                }

                public int hashCode() {
                    int hashCode = ((527 + Arrays.hashCode(this.ayv)) * 31) + (this.ayw == null ? 0 : this.ayw.hashCode());
                    long doubleToLongBits = Double.doubleToLongBits(this.ayx);
                    return (31 * ((((((((((((((((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Float.floatToIntBits(this.ayy)) * 31) + ((int) (this.ayz ^ (this.ayz >>> 32)))) * 31) + this.ayA) * 31) + this.ayB) * 31) + (this.ayC ? 1231 : 1237)) * 31) + C2164qu.hashCode((Object[]) this.ayD)) * 31) + C2164qu.hashCode((Object[]) this.ayE)) * 31) + C2164qu.hashCode((Object[]) this.ayF)) * 31) + C2164qu.hashCode(this.ayG)) * 31) + C2164qu.hashCode(this.ayH)) * 31) + ((int) (this.ayI ^ (this.ayI >>> 32))))) + mo17074rQ();
                }

                /* renamed from: ry */
                public C2155a mo17007ry() {
                    this.ayv = C2169qz.azq;
                    this.ayw = "";
                    this.ayx = 0.0d;
                    this.ayy = 0.0f;
                    this.ayz = 0;
                    this.ayA = 0;
                    this.ayB = 0;
                    this.ayC = false;
                    this.ayD = C2153a.m6333ru();
                    this.ayE = C2154a.m6339rw();
                    this.ayF = C2169qz.azo;
                    this.ayG = C2169qz.azk;
                    this.ayH = C2169qz.azl;
                    this.ayI = 0;
                    this.ayW = null;
                    this.azh = -1;
                    return this;
                }

                /* renamed from: w */
                public C2155a mo11552b(C2157qo qoVar) throws IOException {
                    while (true) {
                        int rz = qoVar.mo17037rz();
                        switch (rz) {
                            case 0:
                                return this;
                            case 10:
                                this.ayv = qoVar.readBytes();
                                break;
                            case 18:
                                this.ayw = qoVar.readString();
                                break;
                            case 25:
                                this.ayx = qoVar.readDouble();
                                break;
                            case 37:
                                this.ayy = qoVar.readFloat();
                                break;
                            case 40:
                                this.ayz = qoVar.mo17021rB();
                                break;
                            case 48:
                                this.ayA = qoVar.mo17022rC();
                                break;
                            case 56:
                                this.ayB = qoVar.mo17024rE();
                                break;
                            case 64:
                                this.ayC = qoVar.mo17023rD();
                                break;
                            case 74:
                                int b = C2169qz.m6494b(qoVar, 74);
                                int length = this.ayD == null ? 0 : this.ayD.length;
                                C2153a[] aVarArr = new C2153a[(b + length)];
                                if (length != 0) {
                                    System.arraycopy(this.ayD, 0, aVarArr, 0, length);
                                }
                                while (length < aVarArr.length - 1) {
                                    aVarArr[length] = new C2153a();
                                    qoVar.mo17010a(aVarArr[length]);
                                    qoVar.mo17037rz();
                                    length++;
                                }
                                aVarArr[length] = new C2153a();
                                qoVar.mo17010a(aVarArr[length]);
                                this.ayD = aVarArr;
                                break;
                            case 82:
                                int b2 = C2169qz.m6494b(qoVar, 82);
                                int length2 = this.ayE == null ? 0 : this.ayE.length;
                                C2154a[] aVarArr2 = new C2154a[(b2 + length2)];
                                if (length2 != 0) {
                                    System.arraycopy(this.ayE, 0, aVarArr2, 0, length2);
                                }
                                while (length2 < aVarArr2.length - 1) {
                                    aVarArr2[length2] = new C2154a();
                                    qoVar.mo17010a(aVarArr2[length2]);
                                    qoVar.mo17037rz();
                                    length2++;
                                }
                                aVarArr2[length2] = new C2154a();
                                qoVar.mo17010a(aVarArr2[length2]);
                                this.ayE = aVarArr2;
                                break;
                            case 90:
                                int b3 = C2169qz.m6494b(qoVar, 90);
                                int length3 = this.ayF == null ? 0 : this.ayF.length;
                                String[] strArr = new String[(b3 + length3)];
                                if (length3 != 0) {
                                    System.arraycopy(this.ayF, 0, strArr, 0, length3);
                                }
                                while (length3 < strArr.length - 1) {
                                    strArr[length3] = qoVar.readString();
                                    qoVar.mo17037rz();
                                    length3++;
                                }
                                strArr[length3] = qoVar.readString();
                                this.ayF = strArr;
                                break;
                            case 96:
                                int b4 = C2169qz.m6494b(qoVar, 96);
                                int length4 = this.ayG == null ? 0 : this.ayG.length;
                                long[] jArr = new long[(b4 + length4)];
                                if (length4 != 0) {
                                    System.arraycopy(this.ayG, 0, jArr, 0, length4);
                                }
                                while (length4 < jArr.length - 1) {
                                    jArr[length4] = qoVar.mo17021rB();
                                    qoVar.mo17037rz();
                                    length4++;
                                }
                                jArr[length4] = qoVar.mo17021rB();
                                this.ayG = jArr;
                                break;
                            case 98:
                                int gS = qoVar.mo17014gS(qoVar.mo17026rG());
                                int position = qoVar.getPosition();
                                int i = 0;
                                while (qoVar.mo17030rL() > 0) {
                                    qoVar.mo17021rB();
                                    i++;
                                }
                                qoVar.mo17016gU(position);
                                int length5 = this.ayG == null ? 0 : this.ayG.length;
                                long[] jArr2 = new long[(i + length5)];
                                if (length5 != 0) {
                                    System.arraycopy(this.ayG, 0, jArr2, 0, length5);
                                }
                                while (length5 < jArr2.length) {
                                    jArr2[length5] = qoVar.mo17021rB();
                                    length5++;
                                }
                                this.ayG = jArr2;
                                qoVar.mo17015gT(gS);
                                break;
                            case 104:
                                this.ayI = qoVar.mo17021rB();
                                break;
                            case 114:
                                int rG = qoVar.mo17026rG();
                                int gS2 = qoVar.mo17014gS(rG);
                                int i2 = rG / 4;
                                int length6 = this.ayH == null ? 0 : this.ayH.length;
                                float[] fArr = new float[(i2 + length6)];
                                if (length6 != 0) {
                                    System.arraycopy(this.ayH, 0, fArr, 0, length6);
                                }
                                while (length6 < fArr.length) {
                                    fArr[length6] = qoVar.readFloat();
                                    length6++;
                                }
                                this.ayH = fArr;
                                qoVar.mo17015gT(gS2);
                                break;
                            case 117:
                                int b5 = C2169qz.m6494b(qoVar, 117);
                                int length7 = this.ayH == null ? 0 : this.ayH.length;
                                float[] fArr2 = new float[(b5 + length7)];
                                if (length7 != 0) {
                                    System.arraycopy(this.ayH, 0, fArr2, 0, length7);
                                }
                                while (length7 < fArr2.length - 1) {
                                    fArr2[length7] = qoVar.readFloat();
                                    qoVar.mo17037rz();
                                    length7++;
                                }
                                fArr2[length7] = qoVar.readFloat();
                                this.ayH = fArr2;
                                break;
                            default:
                                if (mo17072a(qoVar, rz)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public C2154a() {
                mo17003rx();
            }

            /* renamed from: rw */
            public static C2154a[] m6339rw() {
                if (ayt == null) {
                    synchronized (C2164qu.azg) {
                        if (ayt == null) {
                            ayt = new C2154a[0];
                        }
                    }
                }
                return ayt;
            }

            /* renamed from: a */
            public void mo11551a(C2158qp qpVar) throws IOException {
                qpVar.mo17067t(1, this.type);
                if (this.ayu != null) {
                    qpVar.mo17045a(2, (C2166qw) this.ayu);
                }
                super.mo11551a(qpVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo11553c() {
                int c = super.mo11553c() + C2158qp.m6407v(1, this.type);
                return this.ayu != null ? c + C2158qp.m6390c(2, (C2166qw) this.ayu) : c;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof C2154a)) {
                    return false;
                }
                C2154a aVar = (C2154a) obj;
                if (this.type != aVar.type) {
                    return false;
                }
                if (this.ayu == null) {
                    if (aVar.ayu != null) {
                        return false;
                    }
                } else if (!this.ayu.equals(aVar.ayu)) {
                    return false;
                }
                return mo17073a(aVar);
            }

            public int hashCode() {
                return (31 * (((527 + this.type) * 31) + (this.ayu == null ? 0 : this.ayu.hashCode()))) + mo17074rQ();
            }

            /* renamed from: rx */
            public C2154a mo17003rx() {
                this.type = 1;
                this.ayu = null;
                this.ayW = null;
                this.azh = -1;
                return this;
            }

            /* renamed from: v */
            public C2154a mo11552b(C2157qo qoVar) throws IOException {
                while (true) {
                    int rz = qoVar.mo17037rz();
                    if (rz != 0) {
                        if (rz == 8) {
                            int rC = qoVar.mo17022rC();
                            switch (rC) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    this.type = rC;
                                    break;
                            }
                        } else if (rz == 18) {
                            if (this.ayu == null) {
                                this.ayu = new C2155a();
                            }
                            qoVar.mo17010a(this.ayu);
                        } else if (!mo17072a(qoVar, rz)) {
                            return this;
                        }
                    } else {
                        return this;
                    }
                }
            }
        }

        public C2153a() {
            mo16999rv();
        }

        /* renamed from: ru */
        public static C2153a[] m6333ru() {
            if (ayr == null) {
                synchronized (C2164qu.azg) {
                    if (ayr == null) {
                        ayr = new C2153a[0];
                    }
                }
            }
            return ayr;
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            qpVar.mo17050b(1, this.name);
            if (this.ays != null) {
                qpVar.mo17045a(2, (C2166qw) this.ays);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c() + C2158qp.m6404j(1, this.name);
            return this.ays != null ? c + C2158qp.m6390c(2, (C2166qw) this.ays) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2153a)) {
                return false;
            }
            C2153a aVar = (C2153a) obj;
            if (this.name == null) {
                if (aVar.name != null) {
                    return false;
                }
            } else if (!this.name.equals(aVar.name)) {
                return false;
            }
            if (this.ays == null) {
                if (aVar.ays != null) {
                    return false;
                }
            } else if (!this.ays.equals(aVar.ays)) {
                return false;
            }
            return mo17073a(aVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (527 + (this.name == null ? 0 : this.name.hashCode())) * 31;
            if (this.ays != null) {
                i = this.ays.hashCode();
            }
            return (31 * (hashCode + i)) + mo17074rQ();
        }

        /* renamed from: rv */
        public C2153a mo16999rv() {
            this.name = "";
            this.ays = null;
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* renamed from: u */
        public C2153a mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    this.name = qoVar.readString();
                } else if (rz == 18) {
                    if (this.ays == null) {
                        this.ays = new C2154a();
                    }
                    qoVar.mo17010a(this.ays);
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }
    }

    public C2152qm() {
        mo16995rt();
    }

    /* renamed from: n */
    public static C2152qm m6327n(byte[] bArr) throws C2165qv {
        return (C2152qm) C2166qw.m6477a(new C2152qm(), bArr);
    }

    /* renamed from: a */
    public void mo11551a(C2158qp qpVar) throws IOException {
        if (this.ayq != null && this.ayq.length > 0) {
            for (C2153a aVar : this.ayq) {
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
        if (this.ayq != null && this.ayq.length > 0) {
            for (C2153a aVar : this.ayq) {
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
        if (!(obj instanceof C2152qm)) {
            return false;
        }
        C2152qm qmVar = (C2152qm) obj;
        if (!C2164qu.equals((Object[]) this.ayq, (Object[]) qmVar.ayq)) {
            return false;
        }
        return mo17073a(qmVar);
    }

    public int hashCode() {
        return (31 * (527 + C2164qu.hashCode((Object[]) this.ayq))) + mo17074rQ();
    }

    /* renamed from: rt */
    public C2152qm mo16995rt() {
        this.ayq = C2153a.m6333ru();
        this.ayW = null;
        this.azh = -1;
        return this;
    }

    /* renamed from: t */
    public C2152qm mo11552b(C2157qo qoVar) throws IOException {
        while (true) {
            int rz = qoVar.mo17037rz();
            if (rz == 0) {
                return this;
            }
            if (rz == 10) {
                int b = C2169qz.m6494b(qoVar, 10);
                int length = this.ayq == null ? 0 : this.ayq.length;
                C2153a[] aVarArr = new C2153a[(b + length)];
                if (length != 0) {
                    System.arraycopy(this.ayq, 0, aVarArr, 0, length);
                }
                while (length < aVarArr.length - 1) {
                    aVarArr[length] = new C2153a();
                    qoVar.mo17010a(aVarArr[length]);
                    qoVar.mo17037rz();
                    length++;
                }
                aVarArr[length] = new C2153a();
                qoVar.mo17010a(aVarArr[length]);
                this.ayq = aVarArr;
            } else if (!mo17072a(qoVar, rz)) {
                return this;
            }
        }
    }
}
