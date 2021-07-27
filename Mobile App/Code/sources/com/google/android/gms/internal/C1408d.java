package com.google.android.gms.internal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.d */
public interface C1408d {

    /* renamed from: com.google.android.gms.internal.d$a */
    public static final class C1409a extends C2160qq<C1409a> {

        /* renamed from: gu */
        private static volatile C1409a[] f2852gu;

        /* renamed from: gA */
        public String f2853gA;

        /* renamed from: gB */
        public long f2854gB;

        /* renamed from: gC */
        public boolean f2855gC;

        /* renamed from: gD */
        public C1409a[] f2856gD;

        /* renamed from: gE */
        public int[] f2857gE;

        /* renamed from: gF */
        public boolean f2858gF;

        /* renamed from: gv */
        public String f2859gv;

        /* renamed from: gw */
        public C1409a[] f2860gw;

        /* renamed from: gx */
        public C1409a[] f2861gx;

        /* renamed from: gy */
        public C1409a[] f2862gy;

        /* renamed from: gz */
        public String f2863gz;
        public int type;

        public C1409a() {
            mo15068s();
        }

        /* renamed from: r */
        public static C1409a[] m4227r() {
            if (f2852gu == null) {
                synchronized (C2164qu.azg) {
                    if (f2852gu == null) {
                        f2852gu = new C1409a[0];
                    }
                }
            }
            return f2852gu;
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            qpVar.mo17067t(1, this.type);
            if (!this.f2859gv.equals("")) {
                qpVar.mo17050b(2, this.f2859gv);
            }
            if (this.f2860gw != null && this.f2860gw.length > 0) {
                for (C1409a aVar : this.f2860gw) {
                    if (aVar != null) {
                        qpVar.mo17045a(3, (C2166qw) aVar);
                    }
                }
            }
            if (this.f2861gx != null && this.f2861gx.length > 0) {
                for (C1409a aVar2 : this.f2861gx) {
                    if (aVar2 != null) {
                        qpVar.mo17045a(4, (C2166qw) aVar2);
                    }
                }
            }
            if (this.f2862gy != null && this.f2862gy.length > 0) {
                for (C1409a aVar3 : this.f2862gy) {
                    if (aVar3 != null) {
                        qpVar.mo17045a(5, (C2166qw) aVar3);
                    }
                }
            }
            if (!this.f2863gz.equals("")) {
                qpVar.mo17050b(6, this.f2863gz);
            }
            if (!this.f2853gA.equals("")) {
                qpVar.mo17050b(7, this.f2853gA);
            }
            if (this.f2854gB != 0) {
                qpVar.mo17049b(8, this.f2854gB);
            }
            if (this.f2858gF) {
                qpVar.mo17051b(9, this.f2858gF);
            }
            if (this.f2857gE != null && this.f2857gE.length > 0) {
                for (int t : this.f2857gE) {
                    qpVar.mo17067t(10, t);
                }
            }
            if (this.f2856gD != null && this.f2856gD.length > 0) {
                for (C1409a aVar4 : this.f2856gD) {
                    if (aVar4 != null) {
                        qpVar.mo17045a(11, (C2166qw) aVar4);
                    }
                }
            }
            if (this.f2855gC) {
                qpVar.mo17051b(12, this.f2855gC);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c() + C2158qp.m6407v(1, this.type);
            if (!this.f2859gv.equals("")) {
                c += C2158qp.m6404j(2, this.f2859gv);
            }
            if (this.f2860gw != null && this.f2860gw.length > 0) {
                int i = c;
                for (C1409a aVar : this.f2860gw) {
                    if (aVar != null) {
                        i += C2158qp.m6390c(3, (C2166qw) aVar);
                    }
                }
                c = i;
            }
            if (this.f2861gx != null && this.f2861gx.length > 0) {
                int i2 = c;
                for (C1409a aVar2 : this.f2861gx) {
                    if (aVar2 != null) {
                        i2 += C2158qp.m6390c(4, (C2166qw) aVar2);
                    }
                }
                c = i2;
            }
            if (this.f2862gy != null && this.f2862gy.length > 0) {
                int i3 = c;
                for (C1409a aVar3 : this.f2862gy) {
                    if (aVar3 != null) {
                        i3 += C2158qp.m6390c(5, (C2166qw) aVar3);
                    }
                }
                c = i3;
            }
            if (!this.f2863gz.equals("")) {
                c += C2158qp.m6404j(6, this.f2863gz);
            }
            if (!this.f2853gA.equals("")) {
                c += C2158qp.m6404j(7, this.f2853gA);
            }
            if (this.f2854gB != 0) {
                c += C2158qp.m6392d(8, this.f2854gB);
            }
            if (this.f2858gF) {
                c += C2158qp.m6391c(9, this.f2858gF);
            }
            if (this.f2857gE != null && this.f2857gE.length > 0) {
                int i4 = 0;
                for (int gZ : this.f2857gE) {
                    i4 += C2158qp.m6399gZ(gZ);
                }
                c = c + i4 + (1 * this.f2857gE.length);
            }
            if (this.f2856gD != null && this.f2856gD.length > 0) {
                for (C1409a aVar4 : this.f2856gD) {
                    if (aVar4 != null) {
                        c += C2158qp.m6390c(11, (C2166qw) aVar4);
                    }
                }
            }
            return this.f2855gC ? c + C2158qp.m6391c(12, this.f2855gC) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1409a)) {
                return false;
            }
            C1409a aVar = (C1409a) obj;
            if (this.type != aVar.type) {
                return false;
            }
            if (this.f2859gv == null) {
                if (aVar.f2859gv != null) {
                    return false;
                }
            } else if (!this.f2859gv.equals(aVar.f2859gv)) {
                return false;
            }
            if (!C2164qu.equals((Object[]) this.f2860gw, (Object[]) aVar.f2860gw) || !C2164qu.equals((Object[]) this.f2861gx, (Object[]) aVar.f2861gx) || !C2164qu.equals((Object[]) this.f2862gy, (Object[]) aVar.f2862gy)) {
                return false;
            }
            if (this.f2863gz == null) {
                if (aVar.f2863gz != null) {
                    return false;
                }
            } else if (!this.f2863gz.equals(aVar.f2863gz)) {
                return false;
            }
            if (this.f2853gA == null) {
                if (aVar.f2853gA != null) {
                    return false;
                }
            } else if (!this.f2853gA.equals(aVar.f2853gA)) {
                return false;
            }
            if (this.f2854gB == aVar.f2854gB && this.f2855gC == aVar.f2855gC && C2164qu.equals((Object[]) this.f2856gD, (Object[]) aVar.f2856gD) && C2164qu.equals(this.f2857gE, aVar.f2857gE) && this.f2858gF == aVar.f2858gF) {
                return mo17073a(aVar);
            }
            return false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((((((((((527 + this.type) * 31) + (this.f2859gv == null ? 0 : this.f2859gv.hashCode())) * 31) + C2164qu.hashCode((Object[]) this.f2860gw)) * 31) + C2164qu.hashCode((Object[]) this.f2861gx)) * 31) + C2164qu.hashCode((Object[]) this.f2862gy)) * 31) + (this.f2863gz == null ? 0 : this.f2863gz.hashCode())) * 31;
            if (this.f2853gA != null) {
                i = this.f2853gA.hashCode();
            }
            int i2 = (((hashCode + i) * 31) + ((int) (this.f2854gB ^ (this.f2854gB >>> 32)))) * 31;
            int i3 = 1237;
            int hashCode2 = (((((i2 + (this.f2855gC ? 1231 : 1237)) * 31) + C2164qu.hashCode((Object[]) this.f2856gD)) * 31) + C2164qu.hashCode(this.f2857gE)) * 31;
            if (this.f2858gF) {
                i3 = 1231;
            }
            return (31 * (hashCode2 + i3)) + mo17074rQ();
        }

        /* renamed from: l */
        public C1409a mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                switch (rz) {
                    case 0:
                        return this;
                    case 8:
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
                                this.type = rC;
                                break;
                        }
                    case 18:
                        this.f2859gv = qoVar.readString();
                        break;
                    case 26:
                        int b = C2169qz.m6494b(qoVar, 26);
                        int length = this.f2860gw == null ? 0 : this.f2860gw.length;
                        C1409a[] aVarArr = new C1409a[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f2860gw, 0, aVarArr, 0, length);
                        }
                        while (length < aVarArr.length - 1) {
                            aVarArr[length] = new C1409a();
                            qoVar.mo17010a(aVarArr[length]);
                            qoVar.mo17037rz();
                            length++;
                        }
                        aVarArr[length] = new C1409a();
                        qoVar.mo17010a(aVarArr[length]);
                        this.f2860gw = aVarArr;
                        break;
                    case 34:
                        int b2 = C2169qz.m6494b(qoVar, 34);
                        int length2 = this.f2861gx == null ? 0 : this.f2861gx.length;
                        C1409a[] aVarArr2 = new C1409a[(b2 + length2)];
                        if (length2 != 0) {
                            System.arraycopy(this.f2861gx, 0, aVarArr2, 0, length2);
                        }
                        while (length2 < aVarArr2.length - 1) {
                            aVarArr2[length2] = new C1409a();
                            qoVar.mo17010a(aVarArr2[length2]);
                            qoVar.mo17037rz();
                            length2++;
                        }
                        aVarArr2[length2] = new C1409a();
                        qoVar.mo17010a(aVarArr2[length2]);
                        this.f2861gx = aVarArr2;
                        break;
                    case 42:
                        int b3 = C2169qz.m6494b(qoVar, 42);
                        int length3 = this.f2862gy == null ? 0 : this.f2862gy.length;
                        C1409a[] aVarArr3 = new C1409a[(b3 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(this.f2862gy, 0, aVarArr3, 0, length3);
                        }
                        while (length3 < aVarArr3.length - 1) {
                            aVarArr3[length3] = new C1409a();
                            qoVar.mo17010a(aVarArr3[length3]);
                            qoVar.mo17037rz();
                            length3++;
                        }
                        aVarArr3[length3] = new C1409a();
                        qoVar.mo17010a(aVarArr3[length3]);
                        this.f2862gy = aVarArr3;
                        break;
                    case 50:
                        this.f2863gz = qoVar.readString();
                        break;
                    case 58:
                        this.f2853gA = qoVar.readString();
                        break;
                    case 64:
                        this.f2854gB = qoVar.mo17021rB();
                        break;
                    case 72:
                        this.f2858gF = qoVar.mo17023rD();
                        break;
                    case 80:
                        int b4 = C2169qz.m6494b(qoVar, 80);
                        int[] iArr = new int[b4];
                        int i = 0;
                        for (int i2 = 0; i2 < b4; i2++) {
                            if (i2 != 0) {
                                qoVar.mo17037rz();
                            }
                            int rC2 = qoVar.mo17022rC();
                            switch (rC2) {
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
                                    iArr[i] = rC2;
                                    i++;
                                    break;
                            }
                        }
                        if (i != 0) {
                            int length4 = this.f2857gE == null ? 0 : this.f2857gE.length;
                            if (length4 != 0 || i != iArr.length) {
                                int[] iArr2 = new int[(length4 + i)];
                                if (length4 != 0) {
                                    System.arraycopy(this.f2857gE, 0, iArr2, 0, length4);
                                }
                                System.arraycopy(iArr, 0, iArr2, length4, i);
                                this.f2857gE = iArr2;
                                break;
                            } else {
                                this.f2857gE = iArr;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 82:
                        int gS = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position = qoVar.getPosition();
                        int i3 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            switch (qoVar.mo17022rC()) {
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
                                    i3++;
                                    break;
                            }
                        }
                        if (i3 != 0) {
                            qoVar.mo17016gU(position);
                            int length5 = this.f2857gE == null ? 0 : this.f2857gE.length;
                            int[] iArr3 = new int[(i3 + length5)];
                            if (length5 != 0) {
                                System.arraycopy(this.f2857gE, 0, iArr3, 0, length5);
                            }
                            while (qoVar.mo17030rL() > 0) {
                                int rC3 = qoVar.mo17022rC();
                                switch (rC3) {
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
                                        iArr3[length5] = rC3;
                                        length5++;
                                        break;
                                }
                            }
                            this.f2857gE = iArr3;
                        }
                        qoVar.mo17015gT(gS);
                        break;
                    case 90:
                        int b5 = C2169qz.m6494b(qoVar, 90);
                        int length6 = this.f2856gD == null ? 0 : this.f2856gD.length;
                        C1409a[] aVarArr4 = new C1409a[(b5 + length6)];
                        if (length6 != 0) {
                            System.arraycopy(this.f2856gD, 0, aVarArr4, 0, length6);
                        }
                        while (length6 < aVarArr4.length - 1) {
                            aVarArr4[length6] = new C1409a();
                            qoVar.mo17010a(aVarArr4[length6]);
                            qoVar.mo17037rz();
                            length6++;
                        }
                        aVarArr4[length6] = new C1409a();
                        qoVar.mo17010a(aVarArr4[length6]);
                        this.f2856gD = aVarArr4;
                        break;
                    case 96:
                        this.f2855gC = qoVar.mo17023rD();
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

        /* renamed from: s */
        public C1409a mo15068s() {
            this.type = 1;
            this.f2859gv = "";
            this.f2860gw = m4227r();
            this.f2861gx = m4227r();
            this.f2862gy = m4227r();
            this.f2863gz = "";
            this.f2853gA = "";
            this.f2854gB = 0;
            this.f2855gC = false;
            this.f2856gD = m4227r();
            this.f2857gE = C2169qz.azj;
            this.f2858gF = false;
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }
}
