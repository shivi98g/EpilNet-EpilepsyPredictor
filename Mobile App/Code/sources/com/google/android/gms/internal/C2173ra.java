package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ra */
public interface C2173ra {

    /* renamed from: com.google.android.gms.internal.ra$a */
    public static final class C2174a extends C2160qq<C2174a> {
        public String[] azr;
        public String[] azs;
        public int[] azt;

        public C2174a() {
            mo17111sa();
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.azr != null && this.azr.length > 0) {
                for (String str : this.azr) {
                    if (str != null) {
                        qpVar.mo17050b(1, str);
                    }
                }
            }
            if (this.azs != null && this.azs.length > 0) {
                for (String str2 : this.azs) {
                    if (str2 != null) {
                        qpVar.mo17050b(2, str2);
                    }
                }
            }
            if (this.azt != null && this.azt.length > 0) {
                for (int t : this.azt) {
                    qpVar.mo17067t(3, t);
                }
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.azr != null && this.azr.length > 0) {
                int i = 0;
                int i2 = 0;
                for (String str : this.azr) {
                    if (str != null) {
                        i2++;
                        i += C2158qp.m6394dk(str);
                    }
                }
                c = c + i + (i2 * 1);
            }
            if (this.azs != null && this.azs.length > 0) {
                int i3 = 0;
                int i4 = 0;
                for (String str2 : this.azs) {
                    if (str2 != null) {
                        i4++;
                        i3 += C2158qp.m6394dk(str2);
                    }
                }
                c = c + i3 + (i4 * 1);
            }
            if (this.azt == null || this.azt.length <= 0) {
                return c;
            }
            int i5 = 0;
            for (int gZ : this.azt) {
                i5 += C2158qp.m6399gZ(gZ);
            }
            return c + i5 + (1 * this.azt.length);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2174a)) {
                return false;
            }
            C2174a aVar = (C2174a) obj;
            if (C2164qu.equals((Object[]) this.azr, (Object[]) aVar.azr) && C2164qu.equals((Object[]) this.azs, (Object[]) aVar.azs) && C2164qu.equals(this.azt, aVar.azt)) {
                return mo17073a(aVar);
            }
            return false;
        }

        public int hashCode() {
            return (31 * (((((527 + C2164qu.hashCode((Object[]) this.azr)) * 31) + C2164qu.hashCode((Object[]) this.azs)) * 31) + C2164qu.hashCode(this.azt))) + mo17074rQ();
        }

        /* renamed from: sa */
        public C2174a mo17111sa() {
            this.azr = C2169qz.azo;
            this.azs = C2169qz.azo;
            this.azt = C2169qz.azj;
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* renamed from: y */
        public C2174a mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    int b = C2169qz.m6494b(qoVar, 10);
                    int length = this.azr == null ? 0 : this.azr.length;
                    String[] strArr = new String[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.azr, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = qoVar.readString();
                        qoVar.mo17037rz();
                        length++;
                    }
                    strArr[length] = qoVar.readString();
                    this.azr = strArr;
                } else if (rz == 18) {
                    int b2 = C2169qz.m6494b(qoVar, 18);
                    int length2 = this.azs == null ? 0 : this.azs.length;
                    String[] strArr2 = new String[(b2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.azs, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = qoVar.readString();
                        qoVar.mo17037rz();
                        length2++;
                    }
                    strArr2[length2] = qoVar.readString();
                    this.azs = strArr2;
                } else if (rz == 24) {
                    int b3 = C2169qz.m6494b(qoVar, 24);
                    int length3 = this.azt == null ? 0 : this.azt.length;
                    int[] iArr = new int[(b3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.azt, 0, iArr, 0, length3);
                    }
                    while (length3 < iArr.length - 1) {
                        iArr[length3] = qoVar.mo17022rC();
                        qoVar.mo17037rz();
                        length3++;
                    }
                    iArr[length3] = qoVar.mo17022rC();
                    this.azt = iArr;
                } else if (rz == 26) {
                    int gS = qoVar.mo17014gS(qoVar.mo17026rG());
                    int position = qoVar.getPosition();
                    int i = 0;
                    while (qoVar.mo17030rL() > 0) {
                        qoVar.mo17022rC();
                        i++;
                    }
                    qoVar.mo17016gU(position);
                    int length4 = this.azt == null ? 0 : this.azt.length;
                    int[] iArr2 = new int[(i + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.azt, 0, iArr2, 0, length4);
                    }
                    while (length4 < iArr2.length) {
                        iArr2[length4] = qoVar.mo17022rC();
                        length4++;
                    }
                    this.azt = iArr2;
                    qoVar.mo17015gT(gS);
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ra$b */
    public static final class C2175b extends C2160qq<C2175b> {
        public int azu;
        public String azv;
        public String version;

        public C2175b() {
            mo17115sb();
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.azu != 0) {
                qpVar.mo17067t(1, this.azu);
            }
            if (!this.azv.equals("")) {
                qpVar.mo17050b(2, this.azv);
            }
            if (!this.version.equals("")) {
                qpVar.mo17050b(3, this.version);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.azu != 0) {
                c += C2158qp.m6407v(1, this.azu);
            }
            if (!this.azv.equals("")) {
                c += C2158qp.m6404j(2, this.azv);
            }
            return !this.version.equals("") ? c + C2158qp.m6404j(3, this.version) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2175b)) {
                return false;
            }
            C2175b bVar = (C2175b) obj;
            if (this.azu != bVar.azu) {
                return false;
            }
            if (this.azv == null) {
                if (bVar.azv != null) {
                    return false;
                }
            } else if (!this.azv.equals(bVar.azv)) {
                return false;
            }
            if (this.version == null) {
                if (bVar.version != null) {
                    return false;
                }
            } else if (!this.version.equals(bVar.version)) {
                return false;
            }
            return mo17073a(bVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((527 + this.azu) * 31) + (this.azv == null ? 0 : this.azv.hashCode())) * 31;
            if (this.version != null) {
                i = this.version.hashCode();
            }
            return (31 * (hashCode + i)) + mo17074rQ();
        }

        /* renamed from: sb */
        public C2175b mo17115sb() {
            this.azu = 0;
            this.azv = "";
            this.version = "";
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* renamed from: z */
        public C2175b mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz != 0) {
                    if (rz == 8) {
                        int rC = qoVar.mo17022rC();
                        switch (rC) {
                            case 0:
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
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                this.azu = rC;
                                break;
                        }
                    } else if (rz == 18) {
                        this.azv = qoVar.readString();
                    } else if (rz == 26) {
                        this.version = qoVar.readString();
                    } else if (!mo17072a(qoVar, rz)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ra$c */
    public static final class C2176c extends C2160qq<C2176c> {
        public C2177d[] azA;
        public C2175b azB;
        public byte[] azC;
        public byte[] azD;
        public byte[] azE;
        public C2174a azF;
        public String azG;
        public long azH;
        public long azw;
        public int azx;
        public int azy;
        public boolean azz;
        public String tag;

        public C2176c() {
            mo17120sc();
        }

        /* renamed from: A */
        public C2176c mo11552b(C2157qo qoVar) throws IOException {
            C2166qw qwVar;
            while (true) {
                int rz = qoVar.mo17037rz();
                switch (rz) {
                    case 0:
                        return this;
                    case 8:
                        this.azw = qoVar.mo17021rB();
                        continue;
                    case 18:
                        this.tag = qoVar.readString();
                        continue;
                    case 26:
                        int b = C2169qz.m6494b(qoVar, 26);
                        int length = this.azA == null ? 0 : this.azA.length;
                        C2177d[] dVarArr = new C2177d[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.azA, 0, dVarArr, 0, length);
                        }
                        while (length < dVarArr.length - 1) {
                            dVarArr[length] = new C2177d();
                            qoVar.mo17010a(dVarArr[length]);
                            qoVar.mo17037rz();
                            length++;
                        }
                        dVarArr[length] = new C2177d();
                        qoVar.mo17010a(dVarArr[length]);
                        this.azA = dVarArr;
                        continue;
                    case 50:
                        this.azC = qoVar.readBytes();
                        continue;
                    case 58:
                        if (this.azF == null) {
                            this.azF = new C2174a();
                        }
                        qwVar = this.azF;
                        break;
                    case 66:
                        this.azD = qoVar.readBytes();
                        continue;
                    case 74:
                        if (this.azB == null) {
                            this.azB = new C2175b();
                        }
                        qwVar = this.azB;
                        break;
                    case 80:
                        this.azz = qoVar.mo17023rD();
                        continue;
                    case 88:
                        this.azx = qoVar.mo17022rC();
                        continue;
                    case 96:
                        this.azy = qoVar.mo17022rC();
                        continue;
                    case 106:
                        this.azE = qoVar.readBytes();
                        continue;
                    case 114:
                        this.azG = qoVar.readString();
                        continue;
                    case 120:
                        this.azH = qoVar.mo17025rF();
                        continue;
                    default:
                        if (!mo17072a(qoVar, rz)) {
                            return this;
                        }
                        continue;
                }
                qoVar.mo17010a(qwVar);
            }
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.azw != 0) {
                qpVar.mo17049b(1, this.azw);
            }
            if (!this.tag.equals("")) {
                qpVar.mo17050b(2, this.tag);
            }
            if (this.azA != null && this.azA.length > 0) {
                for (C2177d dVar : this.azA) {
                    if (dVar != null) {
                        qpVar.mo17045a(3, (C2166qw) dVar);
                    }
                }
            }
            if (!Arrays.equals(this.azC, C2169qz.azq)) {
                qpVar.mo17046a(6, this.azC);
            }
            if (this.azF != null) {
                qpVar.mo17045a(7, (C2166qw) this.azF);
            }
            if (!Arrays.equals(this.azD, C2169qz.azq)) {
                qpVar.mo17046a(8, this.azD);
            }
            if (this.azB != null) {
                qpVar.mo17045a(9, (C2166qw) this.azB);
            }
            if (this.azz) {
                qpVar.mo17051b(10, this.azz);
            }
            if (this.azx != 0) {
                qpVar.mo17067t(11, this.azx);
            }
            if (this.azy != 0) {
                qpVar.mo17067t(12, this.azy);
            }
            if (!Arrays.equals(this.azE, C2169qz.azq)) {
                qpVar.mo17046a(13, this.azE);
            }
            if (!this.azG.equals("")) {
                qpVar.mo17050b(14, this.azG);
            }
            if (this.azH != 0) {
                qpVar.mo17053c(15, this.azH);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.azw != 0) {
                c += C2158qp.m6392d(1, this.azw);
            }
            if (!this.tag.equals("")) {
                c += C2158qp.m6404j(2, this.tag);
            }
            if (this.azA != null && this.azA.length > 0) {
                for (C2177d dVar : this.azA) {
                    if (dVar != null) {
                        c += C2158qp.m6390c(3, (C2166qw) dVar);
                    }
                }
            }
            if (!Arrays.equals(this.azC, C2169qz.azq)) {
                c += C2158qp.m6387b(6, this.azC);
            }
            if (this.azF != null) {
                c += C2158qp.m6390c(7, (C2166qw) this.azF);
            }
            if (!Arrays.equals(this.azD, C2169qz.azq)) {
                c += C2158qp.m6387b(8, this.azD);
            }
            if (this.azB != null) {
                c += C2158qp.m6390c(9, (C2166qw) this.azB);
            }
            if (this.azz) {
                c += C2158qp.m6391c(10, this.azz);
            }
            if (this.azx != 0) {
                c += C2158qp.m6407v(11, this.azx);
            }
            if (this.azy != 0) {
                c += C2158qp.m6407v(12, this.azy);
            }
            if (!Arrays.equals(this.azE, C2169qz.azq)) {
                c += C2158qp.m6387b(13, this.azE);
            }
            if (!this.azG.equals("")) {
                c += C2158qp.m6404j(14, this.azG);
            }
            return this.azH != 0 ? c + C2158qp.m6396e(15, this.azH) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2176c)) {
                return false;
            }
            C2176c cVar = (C2176c) obj;
            if (this.azw != cVar.azw) {
                return false;
            }
            if (this.tag == null) {
                if (cVar.tag != null) {
                    return false;
                }
            } else if (!this.tag.equals(cVar.tag)) {
                return false;
            }
            if (this.azx != cVar.azx || this.azy != cVar.azy || this.azz != cVar.azz || !C2164qu.equals((Object[]) this.azA, (Object[]) cVar.azA)) {
                return false;
            }
            if (this.azB == null) {
                if (cVar.azB != null) {
                    return false;
                }
            } else if (!this.azB.equals(cVar.azB)) {
                return false;
            }
            if (!Arrays.equals(this.azC, cVar.azC) || !Arrays.equals(this.azD, cVar.azD) || !Arrays.equals(this.azE, cVar.azE)) {
                return false;
            }
            if (this.azF == null) {
                if (cVar.azF != null) {
                    return false;
                }
            } else if (!this.azF.equals(cVar.azF)) {
                return false;
            }
            if (this.azG == null) {
                if (cVar.azG != null) {
                    return false;
                }
            } else if (!this.azG.equals(cVar.azG)) {
                return false;
            }
            if (this.azH != cVar.azH) {
                return false;
            }
            return mo17073a(cVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((((((((((((((((((((527 + ((int) (this.azw ^ (this.azw >>> 32)))) * 31) + (this.tag == null ? 0 : this.tag.hashCode())) * 31) + this.azx) * 31) + this.azy) * 31) + (this.azz ? 1231 : 1237)) * 31) + C2164qu.hashCode((Object[]) this.azA)) * 31) + (this.azB == null ? 0 : this.azB.hashCode())) * 31) + Arrays.hashCode(this.azC)) * 31) + Arrays.hashCode(this.azD)) * 31) + Arrays.hashCode(this.azE)) * 31) + (this.azF == null ? 0 : this.azF.hashCode())) * 31;
            if (this.azG != null) {
                i = this.azG.hashCode();
            }
            return (31 * (((hashCode + i) * 31) + ((int) (this.azH ^ (this.azH >>> 32))))) + mo17074rQ();
        }

        /* renamed from: sc */
        public C2176c mo17120sc() {
            this.azw = 0;
            this.tag = "";
            this.azx = 0;
            this.azy = 0;
            this.azz = false;
            this.azA = C2177d.m6520sd();
            this.azB = null;
            this.azC = C2169qz.azq;
            this.azD = C2169qz.azq;
            this.azE = C2169qz.azq;
            this.azF = null;
            this.azG = "";
            this.azH = 0;
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ra$d */
    public static final class C2177d extends C2160qq<C2177d> {
        private static volatile C2177d[] azI;

        /* renamed from: fv */
        public String f4222fv;
        public String value;

        public C2177d() {
            mo17124se();
        }

        /* renamed from: sd */
        public static C2177d[] m6520sd() {
            if (azI == null) {
                synchronized (C2164qu.azg) {
                    if (azI == null) {
                        azI = new C2177d[0];
                    }
                }
            }
            return azI;
        }

        /* renamed from: B */
        public C2177d mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    this.f4222fv = qoVar.readString();
                } else if (rz == 18) {
                    this.value = qoVar.readString();
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (!this.f4222fv.equals("")) {
                qpVar.mo17050b(1, this.f4222fv);
            }
            if (!this.value.equals("")) {
                qpVar.mo17050b(2, this.value);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (!this.f4222fv.equals("")) {
                c += C2158qp.m6404j(1, this.f4222fv);
            }
            return !this.value.equals("") ? c + C2158qp.m6404j(2, this.value) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2177d)) {
                return false;
            }
            C2177d dVar = (C2177d) obj;
            if (this.f4222fv == null) {
                if (dVar.f4222fv != null) {
                    return false;
                }
            } else if (!this.f4222fv.equals(dVar.f4222fv)) {
                return false;
            }
            if (this.value == null) {
                if (dVar.value != null) {
                    return false;
                }
            } else if (!this.value.equals(dVar.value)) {
                return false;
            }
            return mo17073a(dVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (527 + (this.f4222fv == null ? 0 : this.f4222fv.hashCode())) * 31;
            if (this.value != null) {
                i = this.value.hashCode();
            }
            return (31 * (hashCode + i)) + mo17074rQ();
        }

        /* renamed from: se */
        public C2177d mo17124se() {
            this.f4222fv = "";
            this.value = "";
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }
}
