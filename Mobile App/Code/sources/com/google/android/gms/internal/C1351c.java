package com.google.android.gms.internal;

import com.google.android.gms.internal.C1408d;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.c */
public interface C1351c {

    /* renamed from: com.google.android.gms.internal.c$a */
    public static final class C1352a extends C2160qq<C1352a> {

        /* renamed from: fn */
        public int f2726fn;

        /* renamed from: fo */
        public int f2727fo;
        public int level;

        public C1352a() {
            mo14976b();
        }

        /* renamed from: a */
        public C1352a mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz != 0) {
                    if (rz == 8) {
                        int rC = qoVar.mo17022rC();
                        switch (rC) {
                            case 1:
                            case 2:
                            case 3:
                                this.level = rC;
                                break;
                        }
                    } else if (rz == 16) {
                        this.f2726fn = qoVar.mo17022rC();
                    } else if (rz == 24) {
                        this.f2727fo = qoVar.mo17022rC();
                    } else if (!mo17072a(qoVar, rz)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.level != 1) {
                qpVar.mo17067t(1, this.level);
            }
            if (this.f2726fn != 0) {
                qpVar.mo17067t(2, this.f2726fn);
            }
            if (this.f2727fo != 0) {
                qpVar.mo17067t(3, this.f2727fo);
            }
            super.mo11551a(qpVar);
        }

        /* renamed from: b */
        public C1352a mo14976b() {
            this.level = 1;
            this.f2726fn = 0;
            this.f2727fo = 0;
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.level != 1) {
                c += C2158qp.m6407v(1, this.level);
            }
            if (this.f2726fn != 0) {
                c += C2158qp.m6407v(2, this.f2726fn);
            }
            return this.f2727fo != 0 ? c + C2158qp.m6407v(3, this.f2727fo) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1352a)) {
                return false;
            }
            C1352a aVar = (C1352a) obj;
            if (this.level == aVar.level && this.f2726fn == aVar.f2726fn && this.f2727fo == aVar.f2727fo) {
                return mo17073a(aVar);
            }
            return false;
        }

        public int hashCode() {
            return (31 * (((((527 + this.level) * 31) + this.f2726fn) * 31) + this.f2727fo)) + mo17074rQ();
        }
    }

    /* renamed from: com.google.android.gms.internal.c$b */
    public static final class C1353b extends C2160qq<C1353b> {

        /* renamed from: fp */
        private static volatile C1353b[] f2728fp;

        /* renamed from: fq */
        public int[] f2729fq;

        /* renamed from: fr */
        public int f2730fr;

        /* renamed from: fs */
        public boolean f2731fs;

        /* renamed from: ft */
        public boolean f2732ft;
        public int name;

        public C1353b() {
            mo14980e();
        }

        /* renamed from: d */
        public static C1353b[] m4099d() {
            if (f2728fp == null) {
                synchronized (C2164qu.azg) {
                    if (f2728fp == null) {
                        f2728fp = new C1353b[0];
                    }
                }
            }
            return f2728fp;
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.f2732ft) {
                qpVar.mo17051b(1, this.f2732ft);
            }
            qpVar.mo17067t(2, this.f2730fr);
            if (this.f2729fq != null && this.f2729fq.length > 0) {
                for (int t : this.f2729fq) {
                    qpVar.mo17067t(3, t);
                }
            }
            if (this.name != 0) {
                qpVar.mo17067t(4, this.name);
            }
            if (this.f2731fs) {
                qpVar.mo17051b(6, this.f2731fs);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.f2732ft) {
                c += C2158qp.m6391c(1, this.f2732ft);
            }
            int v = c + C2158qp.m6407v(2, this.f2730fr);
            if (this.f2729fq != null && this.f2729fq.length > 0) {
                int i = 0;
                for (int gZ : this.f2729fq) {
                    i += C2158qp.m6399gZ(gZ);
                }
                v = v + i + (1 * this.f2729fq.length);
            }
            if (this.name != 0) {
                v += C2158qp.m6407v(4, this.name);
            }
            return this.f2731fs ? v + C2158qp.m6391c(6, this.f2731fs) : v;
        }

        /* renamed from: c */
        public C1353b mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 8) {
                    this.f2732ft = qoVar.mo17023rD();
                } else if (rz == 16) {
                    this.f2730fr = qoVar.mo17022rC();
                } else if (rz == 24) {
                    int b = C2169qz.m6494b(qoVar, 24);
                    int length = this.f2729fq == null ? 0 : this.f2729fq.length;
                    int[] iArr = new int[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f2729fq, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = qoVar.mo17022rC();
                        qoVar.mo17037rz();
                        length++;
                    }
                    iArr[length] = qoVar.mo17022rC();
                    this.f2729fq = iArr;
                } else if (rz == 26) {
                    int gS = qoVar.mo17014gS(qoVar.mo17026rG());
                    int position = qoVar.getPosition();
                    int i = 0;
                    while (qoVar.mo17030rL() > 0) {
                        qoVar.mo17022rC();
                        i++;
                    }
                    qoVar.mo17016gU(position);
                    int length2 = this.f2729fq == null ? 0 : this.f2729fq.length;
                    int[] iArr2 = new int[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f2729fq, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = qoVar.mo17022rC();
                        length2++;
                    }
                    this.f2729fq = iArr2;
                    qoVar.mo17015gT(gS);
                } else if (rz == 32) {
                    this.name = qoVar.mo17022rC();
                } else if (rz == 48) {
                    this.f2731fs = qoVar.mo17023rD();
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }

        /* renamed from: e */
        public C1353b mo14980e() {
            this.f2729fq = C2169qz.azj;
            this.f2730fr = 0;
            this.name = 0;
            this.f2731fs = false;
            this.f2732ft = false;
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1353b)) {
                return false;
            }
            C1353b bVar = (C1353b) obj;
            if (C2164qu.equals(this.f2729fq, bVar.f2729fq) && this.f2730fr == bVar.f2730fr && this.name == bVar.name && this.f2731fs == bVar.f2731fs && this.f2732ft == bVar.f2732ft) {
                return mo17073a(bVar);
            }
            return false;
        }

        public int hashCode() {
            int i = 1237;
            int hashCode = (((((((527 + C2164qu.hashCode(this.f2729fq)) * 31) + this.f2730fr) * 31) + this.name) * 31) + (this.f2731fs ? 1231 : 1237)) * 31;
            if (this.f2732ft) {
                i = 1231;
            }
            return (31 * (hashCode + i)) + mo17074rQ();
        }
    }

    /* renamed from: com.google.android.gms.internal.c$c */
    public static final class C1354c extends C2160qq<C1354c> {

        /* renamed from: fu */
        private static volatile C1354c[] f2733fu;

        /* renamed from: fv */
        public String f2734fv;

        /* renamed from: fw */
        public long f2735fw;

        /* renamed from: fx */
        public long f2736fx;

        /* renamed from: fy */
        public boolean f2737fy;

        /* renamed from: fz */
        public long f2738fz;

        public C1354c() {
            mo14985g();
        }

        /* renamed from: f */
        public static C1354c[] m4105f() {
            if (f2733fu == null) {
                synchronized (C2164qu.azg) {
                    if (f2733fu == null) {
                        f2733fu = new C1354c[0];
                    }
                }
            }
            return f2733fu;
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (!this.f2734fv.equals("")) {
                qpVar.mo17050b(1, this.f2734fv);
            }
            if (this.f2735fw != 0) {
                qpVar.mo17049b(2, this.f2735fw);
            }
            if (this.f2736fx != 2147483647L) {
                qpVar.mo17049b(3, this.f2736fx);
            }
            if (this.f2737fy) {
                qpVar.mo17051b(4, this.f2737fy);
            }
            if (this.f2738fz != 0) {
                qpVar.mo17049b(5, this.f2738fz);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (!this.f2734fv.equals("")) {
                c += C2158qp.m6404j(1, this.f2734fv);
            }
            if (this.f2735fw != 0) {
                c += C2158qp.m6392d(2, this.f2735fw);
            }
            if (this.f2736fx != 2147483647L) {
                c += C2158qp.m6392d(3, this.f2736fx);
            }
            if (this.f2737fy) {
                c += C2158qp.m6391c(4, this.f2737fy);
            }
            return this.f2738fz != 0 ? c + C2158qp.m6392d(5, this.f2738fz) : c;
        }

        /* renamed from: d */
        public C1354c mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    this.f2734fv = qoVar.readString();
                } else if (rz == 16) {
                    this.f2735fw = qoVar.mo17021rB();
                } else if (rz == 24) {
                    this.f2736fx = qoVar.mo17021rB();
                } else if (rz == 32) {
                    this.f2737fy = qoVar.mo17023rD();
                } else if (rz == 40) {
                    this.f2738fz = qoVar.mo17021rB();
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1354c)) {
                return false;
            }
            C1354c cVar = (C1354c) obj;
            if (this.f2734fv == null) {
                if (cVar.f2734fv != null) {
                    return false;
                }
            } else if (!this.f2734fv.equals(cVar.f2734fv)) {
                return false;
            }
            if (this.f2735fw == cVar.f2735fw && this.f2736fx == cVar.f2736fx && this.f2737fy == cVar.f2737fy && this.f2738fz == cVar.f2738fz) {
                return mo17073a(cVar);
            }
            return false;
        }

        /* renamed from: g */
        public C1354c mo14985g() {
            this.f2734fv = "";
            this.f2735fw = 0;
            this.f2736fx = 2147483647L;
            this.f2737fy = false;
            this.f2738fz = 0;
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        public int hashCode() {
            return (31 * (((((((((527 + (this.f2734fv == null ? 0 : this.f2734fv.hashCode())) * 31) + ((int) (this.f2735fw ^ (this.f2735fw >>> 32)))) * 31) + ((int) (this.f2736fx ^ (this.f2736fx >>> 32)))) * 31) + (this.f2737fy ? 1231 : 1237)) * 31) + ((int) (this.f2738fz ^ (this.f2738fz >>> 32))))) + mo17074rQ();
        }
    }

    /* renamed from: com.google.android.gms.internal.c$d */
    public static final class C1355d extends C2160qq<C1355d> {

        /* renamed from: fA */
        public C1408d.C1409a[] f2739fA;

        /* renamed from: fB */
        public C1408d.C1409a[] f2740fB;

        /* renamed from: fC */
        public C1354c[] f2741fC;

        public C1355d() {
            mo14989h();
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.f2739fA != null && this.f2739fA.length > 0) {
                for (C1408d.C1409a aVar : this.f2739fA) {
                    if (aVar != null) {
                        qpVar.mo17045a(1, (C2166qw) aVar);
                    }
                }
            }
            if (this.f2740fB != null && this.f2740fB.length > 0) {
                for (C1408d.C1409a aVar2 : this.f2740fB) {
                    if (aVar2 != null) {
                        qpVar.mo17045a(2, (C2166qw) aVar2);
                    }
                }
            }
            if (this.f2741fC != null && this.f2741fC.length > 0) {
                for (C1354c cVar : this.f2741fC) {
                    if (cVar != null) {
                        qpVar.mo17045a(3, (C2166qw) cVar);
                    }
                }
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.f2739fA != null && this.f2739fA.length > 0) {
                int i = c;
                for (C1408d.C1409a aVar : this.f2739fA) {
                    if (aVar != null) {
                        i += C2158qp.m6390c(1, (C2166qw) aVar);
                    }
                }
                c = i;
            }
            if (this.f2740fB != null && this.f2740fB.length > 0) {
                int i2 = c;
                for (C1408d.C1409a aVar2 : this.f2740fB) {
                    if (aVar2 != null) {
                        i2 += C2158qp.m6390c(2, (C2166qw) aVar2);
                    }
                }
                c = i2;
            }
            if (this.f2741fC != null && this.f2741fC.length > 0) {
                for (C1354c cVar : this.f2741fC) {
                    if (cVar != null) {
                        c += C2158qp.m6390c(3, (C2166qw) cVar);
                    }
                }
            }
            return c;
        }

        /* renamed from: e */
        public C1355d mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    int b = C2169qz.m6494b(qoVar, 10);
                    int length = this.f2739fA == null ? 0 : this.f2739fA.length;
                    C1408d.C1409a[] aVarArr = new C1408d.C1409a[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f2739fA, 0, aVarArr, 0, length);
                    }
                    while (length < aVarArr.length - 1) {
                        aVarArr[length] = new C1408d.C1409a();
                        qoVar.mo17010a(aVarArr[length]);
                        qoVar.mo17037rz();
                        length++;
                    }
                    aVarArr[length] = new C1408d.C1409a();
                    qoVar.mo17010a(aVarArr[length]);
                    this.f2739fA = aVarArr;
                } else if (rz == 18) {
                    int b2 = C2169qz.m6494b(qoVar, 18);
                    int length2 = this.f2740fB == null ? 0 : this.f2740fB.length;
                    C1408d.C1409a[] aVarArr2 = new C1408d.C1409a[(b2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f2740fB, 0, aVarArr2, 0, length2);
                    }
                    while (length2 < aVarArr2.length - 1) {
                        aVarArr2[length2] = new C1408d.C1409a();
                        qoVar.mo17010a(aVarArr2[length2]);
                        qoVar.mo17037rz();
                        length2++;
                    }
                    aVarArr2[length2] = new C1408d.C1409a();
                    qoVar.mo17010a(aVarArr2[length2]);
                    this.f2740fB = aVarArr2;
                } else if (rz == 26) {
                    int b3 = C2169qz.m6494b(qoVar, 26);
                    int length3 = this.f2741fC == null ? 0 : this.f2741fC.length;
                    C1354c[] cVarArr = new C1354c[(b3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f2741fC, 0, cVarArr, 0, length3);
                    }
                    while (length3 < cVarArr.length - 1) {
                        cVarArr[length3] = new C1354c();
                        qoVar.mo17010a(cVarArr[length3]);
                        qoVar.mo17037rz();
                        length3++;
                    }
                    cVarArr[length3] = new C1354c();
                    qoVar.mo17010a(cVarArr[length3]);
                    this.f2741fC = cVarArr;
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1355d)) {
                return false;
            }
            C1355d dVar = (C1355d) obj;
            if (C2164qu.equals((Object[]) this.f2739fA, (Object[]) dVar.f2739fA) && C2164qu.equals((Object[]) this.f2740fB, (Object[]) dVar.f2740fB) && C2164qu.equals((Object[]) this.f2741fC, (Object[]) dVar.f2741fC)) {
                return mo17073a(dVar);
            }
            return false;
        }

        /* renamed from: h */
        public C1355d mo14989h() {
            this.f2739fA = C1408d.C1409a.m4227r();
            this.f2740fB = C1408d.C1409a.m4227r();
            this.f2741fC = C1354c.m4105f();
            this.ayW = null;
            this.azh = -1;
            return this;
        }

        public int hashCode() {
            return (31 * (((((527 + C2164qu.hashCode((Object[]) this.f2739fA)) * 31) + C2164qu.hashCode((Object[]) this.f2740fB)) * 31) + C2164qu.hashCode((Object[]) this.f2741fC))) + mo17074rQ();
        }
    }

    /* renamed from: com.google.android.gms.internal.c$e */
    public static final class C1356e extends C2160qq<C1356e> {

        /* renamed from: fD */
        private static volatile C1356e[] f2742fD;
        public int key;
        public int value;

        public C1356e() {
            mo14994j();
        }

        /* renamed from: i */
        public static C1356e[] m4116i() {
            if (f2742fD == null) {
                synchronized (C2164qu.azg) {
                    if (f2742fD == null) {
                        f2742fD = new C1356e[0];
                    }
                }
            }
            return f2742fD;
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            qpVar.mo17067t(1, this.key);
            qpVar.mo17067t(2, this.value);
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            return super.mo11553c() + C2158qp.m6407v(1, this.key) + C2158qp.m6407v(2, this.value);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1356e)) {
                return false;
            }
            C1356e eVar = (C1356e) obj;
            if (this.key == eVar.key && this.value == eVar.value) {
                return mo17073a(eVar);
            }
            return false;
        }

        /* renamed from: f */
        public C1356e mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 8) {
                    this.key = qoVar.mo17022rC();
                } else if (rz == 16) {
                    this.value = qoVar.mo17022rC();
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }

        public int hashCode() {
            return (31 * (((527 + this.key) * 31) + this.value)) + mo17074rQ();
        }

        /* renamed from: j */
        public C1356e mo14994j() {
            this.key = 0;
            this.value = 0;
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.c$f */
    public static final class C1357f extends C2160qq<C1357f> {

        /* renamed from: fE */
        public String[] f2743fE;

        /* renamed from: fF */
        public String[] f2744fF;

        /* renamed from: fG */
        public C1408d.C1409a[] f2745fG;

        /* renamed from: fH */
        public C1356e[] f2746fH;

        /* renamed from: fI */
        public C1353b[] f2747fI;

        /* renamed from: fJ */
        public C1353b[] f2748fJ;

        /* renamed from: fK */
        public C1353b[] f2749fK;

        /* renamed from: fL */
        public C1358g[] f2750fL;

        /* renamed from: fM */
        public String f2751fM;

        /* renamed from: fN */
        public String f2752fN;

        /* renamed from: fO */
        public String f2753fO;

        /* renamed from: fP */
        public C1352a f2754fP;

        /* renamed from: fQ */
        public float f2755fQ;

        /* renamed from: fR */
        public boolean f2756fR;

        /* renamed from: fS */
        public String[] f2757fS;

        /* renamed from: fT */
        public int f2758fT;
        public String version;

        public C1357f() {
            mo14998k();
        }

        /* renamed from: a */
        public static C1357f m4122a(byte[] bArr) throws C2165qv {
            return (C1357f) C2166qw.m6477a(new C1357f(), bArr);
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.f2744fF != null && this.f2744fF.length > 0) {
                for (String str : this.f2744fF) {
                    if (str != null) {
                        qpVar.mo17050b(1, str);
                    }
                }
            }
            if (this.f2745fG != null && this.f2745fG.length > 0) {
                for (C1408d.C1409a aVar : this.f2745fG) {
                    if (aVar != null) {
                        qpVar.mo17045a(2, (C2166qw) aVar);
                    }
                }
            }
            if (this.f2746fH != null && this.f2746fH.length > 0) {
                for (C1356e eVar : this.f2746fH) {
                    if (eVar != null) {
                        qpVar.mo17045a(3, (C2166qw) eVar);
                    }
                }
            }
            if (this.f2747fI != null && this.f2747fI.length > 0) {
                for (C1353b bVar : this.f2747fI) {
                    if (bVar != null) {
                        qpVar.mo17045a(4, (C2166qw) bVar);
                    }
                }
            }
            if (this.f2748fJ != null && this.f2748fJ.length > 0) {
                for (C1353b bVar2 : this.f2748fJ) {
                    if (bVar2 != null) {
                        qpVar.mo17045a(5, (C2166qw) bVar2);
                    }
                }
            }
            if (this.f2749fK != null && this.f2749fK.length > 0) {
                for (C1353b bVar3 : this.f2749fK) {
                    if (bVar3 != null) {
                        qpVar.mo17045a(6, (C2166qw) bVar3);
                    }
                }
            }
            if (this.f2750fL != null && this.f2750fL.length > 0) {
                for (C1358g gVar : this.f2750fL) {
                    if (gVar != null) {
                        qpVar.mo17045a(7, (C2166qw) gVar);
                    }
                }
            }
            if (!this.f2751fM.equals("")) {
                qpVar.mo17050b(9, this.f2751fM);
            }
            if (!this.f2752fN.equals("")) {
                qpVar.mo17050b(10, this.f2752fN);
            }
            if (!this.f2753fO.equals("0")) {
                qpVar.mo17050b(12, this.f2753fO);
            }
            if (!this.version.equals("")) {
                qpVar.mo17050b(13, this.version);
            }
            if (this.f2754fP != null) {
                qpVar.mo17045a(14, (C2166qw) this.f2754fP);
            }
            if (Float.floatToIntBits(this.f2755fQ) != Float.floatToIntBits(0.0f)) {
                qpVar.mo17048b(15, this.f2755fQ);
            }
            if (this.f2757fS != null && this.f2757fS.length > 0) {
                for (String str2 : this.f2757fS) {
                    if (str2 != null) {
                        qpVar.mo17050b(16, str2);
                    }
                }
            }
            if (this.f2758fT != 0) {
                qpVar.mo17067t(17, this.f2758fT);
            }
            if (this.f2756fR) {
                qpVar.mo17051b(18, this.f2756fR);
            }
            if (this.f2743fE != null && this.f2743fE.length > 0) {
                for (String str3 : this.f2743fE) {
                    if (str3 != null) {
                        qpVar.mo17050b(19, str3);
                    }
                }
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.f2744fF != null && this.f2744fF.length > 0) {
                int i = 0;
                int i2 = 0;
                for (String str : this.f2744fF) {
                    if (str != null) {
                        i2++;
                        i += C2158qp.m6394dk(str);
                    }
                }
                c = c + i + (1 * i2);
            }
            if (this.f2745fG != null && this.f2745fG.length > 0) {
                int i3 = c;
                for (C1408d.C1409a aVar : this.f2745fG) {
                    if (aVar != null) {
                        i3 += C2158qp.m6390c(2, (C2166qw) aVar);
                    }
                }
                c = i3;
            }
            if (this.f2746fH != null && this.f2746fH.length > 0) {
                int i4 = c;
                for (C1356e eVar : this.f2746fH) {
                    if (eVar != null) {
                        i4 += C2158qp.m6390c(3, (C2166qw) eVar);
                    }
                }
                c = i4;
            }
            if (this.f2747fI != null && this.f2747fI.length > 0) {
                int i5 = c;
                for (C1353b bVar : this.f2747fI) {
                    if (bVar != null) {
                        i5 += C2158qp.m6390c(4, (C2166qw) bVar);
                    }
                }
                c = i5;
            }
            if (this.f2748fJ != null && this.f2748fJ.length > 0) {
                int i6 = c;
                for (C1353b bVar2 : this.f2748fJ) {
                    if (bVar2 != null) {
                        i6 += C2158qp.m6390c(5, (C2166qw) bVar2);
                    }
                }
                c = i6;
            }
            if (this.f2749fK != null && this.f2749fK.length > 0) {
                int i7 = c;
                for (C1353b bVar3 : this.f2749fK) {
                    if (bVar3 != null) {
                        i7 += C2158qp.m6390c(6, (C2166qw) bVar3);
                    }
                }
                c = i7;
            }
            if (this.f2750fL != null && this.f2750fL.length > 0) {
                int i8 = c;
                for (C1358g gVar : this.f2750fL) {
                    if (gVar != null) {
                        i8 += C2158qp.m6390c(7, (C2166qw) gVar);
                    }
                }
                c = i8;
            }
            if (!this.f2751fM.equals("")) {
                c += C2158qp.m6404j(9, this.f2751fM);
            }
            if (!this.f2752fN.equals("")) {
                c += C2158qp.m6404j(10, this.f2752fN);
            }
            if (!this.f2753fO.equals("0")) {
                c += C2158qp.m6404j(12, this.f2753fO);
            }
            if (!this.version.equals("")) {
                c += C2158qp.m6404j(13, this.version);
            }
            if (this.f2754fP != null) {
                c += C2158qp.m6390c(14, (C2166qw) this.f2754fP);
            }
            if (Float.floatToIntBits(this.f2755fQ) != Float.floatToIntBits(0.0f)) {
                c += C2158qp.m6389c(15, this.f2755fQ);
            }
            if (this.f2757fS != null && this.f2757fS.length > 0) {
                int i9 = 0;
                int i10 = 0;
                for (String str2 : this.f2757fS) {
                    if (str2 != null) {
                        i10++;
                        i9 += C2158qp.m6394dk(str2);
                    }
                }
                c = c + i9 + (i10 * 2);
            }
            if (this.f2758fT != 0) {
                c += C2158qp.m6407v(17, this.f2758fT);
            }
            if (this.f2756fR) {
                c += C2158qp.m6391c(18, this.f2756fR);
            }
            if (this.f2743fE == null || this.f2743fE.length <= 0) {
                return c;
            }
            int i11 = 0;
            int i12 = 0;
            for (String str3 : this.f2743fE) {
                if (str3 != null) {
                    i12++;
                    i11 += C2158qp.m6394dk(str3);
                }
            }
            return c + i11 + (2 * i12);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1357f)) {
                return false;
            }
            C1357f fVar = (C1357f) obj;
            if (!C2164qu.equals((Object[]) this.f2743fE, (Object[]) fVar.f2743fE) || !C2164qu.equals((Object[]) this.f2744fF, (Object[]) fVar.f2744fF) || !C2164qu.equals((Object[]) this.f2745fG, (Object[]) fVar.f2745fG) || !C2164qu.equals((Object[]) this.f2746fH, (Object[]) fVar.f2746fH) || !C2164qu.equals((Object[]) this.f2747fI, (Object[]) fVar.f2747fI) || !C2164qu.equals((Object[]) this.f2748fJ, (Object[]) fVar.f2748fJ) || !C2164qu.equals((Object[]) this.f2749fK, (Object[]) fVar.f2749fK) || !C2164qu.equals((Object[]) this.f2750fL, (Object[]) fVar.f2750fL)) {
                return false;
            }
            if (this.f2751fM == null) {
                if (fVar.f2751fM != null) {
                    return false;
                }
            } else if (!this.f2751fM.equals(fVar.f2751fM)) {
                return false;
            }
            if (this.f2752fN == null) {
                if (fVar.f2752fN != null) {
                    return false;
                }
            } else if (!this.f2752fN.equals(fVar.f2752fN)) {
                return false;
            }
            if (this.f2753fO == null) {
                if (fVar.f2753fO != null) {
                    return false;
                }
            } else if (!this.f2753fO.equals(fVar.f2753fO)) {
                return false;
            }
            if (this.version == null) {
                if (fVar.version != null) {
                    return false;
                }
            } else if (!this.version.equals(fVar.version)) {
                return false;
            }
            if (this.f2754fP == null) {
                if (fVar.f2754fP != null) {
                    return false;
                }
            } else if (!this.f2754fP.equals(fVar.f2754fP)) {
                return false;
            }
            if (Float.floatToIntBits(this.f2755fQ) == Float.floatToIntBits(fVar.f2755fQ) && this.f2756fR == fVar.f2756fR && C2164qu.equals((Object[]) this.f2757fS, (Object[]) fVar.f2757fS) && this.f2758fT == fVar.f2758fT) {
                return mo17073a(fVar);
            }
            return false;
        }

        /* renamed from: g */
        public C1357f mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                switch (rz) {
                    case 0:
                        return this;
                    case 10:
                        int b = C2169qz.m6494b(qoVar, 10);
                        int length = this.f2744fF == null ? 0 : this.f2744fF.length;
                        String[] strArr = new String[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f2744fF, 0, strArr, 0, length);
                        }
                        while (length < strArr.length - 1) {
                            strArr[length] = qoVar.readString();
                            qoVar.mo17037rz();
                            length++;
                        }
                        strArr[length] = qoVar.readString();
                        this.f2744fF = strArr;
                        break;
                    case 18:
                        int b2 = C2169qz.m6494b(qoVar, 18);
                        int length2 = this.f2745fG == null ? 0 : this.f2745fG.length;
                        C1408d.C1409a[] aVarArr = new C1408d.C1409a[(b2 + length2)];
                        if (length2 != 0) {
                            System.arraycopy(this.f2745fG, 0, aVarArr, 0, length2);
                        }
                        while (length2 < aVarArr.length - 1) {
                            aVarArr[length2] = new C1408d.C1409a();
                            qoVar.mo17010a(aVarArr[length2]);
                            qoVar.mo17037rz();
                            length2++;
                        }
                        aVarArr[length2] = new C1408d.C1409a();
                        qoVar.mo17010a(aVarArr[length2]);
                        this.f2745fG = aVarArr;
                        break;
                    case 26:
                        int b3 = C2169qz.m6494b(qoVar, 26);
                        int length3 = this.f2746fH == null ? 0 : this.f2746fH.length;
                        C1356e[] eVarArr = new C1356e[(b3 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(this.f2746fH, 0, eVarArr, 0, length3);
                        }
                        while (length3 < eVarArr.length - 1) {
                            eVarArr[length3] = new C1356e();
                            qoVar.mo17010a(eVarArr[length3]);
                            qoVar.mo17037rz();
                            length3++;
                        }
                        eVarArr[length3] = new C1356e();
                        qoVar.mo17010a(eVarArr[length3]);
                        this.f2746fH = eVarArr;
                        break;
                    case 34:
                        int b4 = C2169qz.m6494b(qoVar, 34);
                        int length4 = this.f2747fI == null ? 0 : this.f2747fI.length;
                        C1353b[] bVarArr = new C1353b[(b4 + length4)];
                        if (length4 != 0) {
                            System.arraycopy(this.f2747fI, 0, bVarArr, 0, length4);
                        }
                        while (length4 < bVarArr.length - 1) {
                            bVarArr[length4] = new C1353b();
                            qoVar.mo17010a(bVarArr[length4]);
                            qoVar.mo17037rz();
                            length4++;
                        }
                        bVarArr[length4] = new C1353b();
                        qoVar.mo17010a(bVarArr[length4]);
                        this.f2747fI = bVarArr;
                        break;
                    case 42:
                        int b5 = C2169qz.m6494b(qoVar, 42);
                        int length5 = this.f2748fJ == null ? 0 : this.f2748fJ.length;
                        C1353b[] bVarArr2 = new C1353b[(b5 + length5)];
                        if (length5 != 0) {
                            System.arraycopy(this.f2748fJ, 0, bVarArr2, 0, length5);
                        }
                        while (length5 < bVarArr2.length - 1) {
                            bVarArr2[length5] = new C1353b();
                            qoVar.mo17010a(bVarArr2[length5]);
                            qoVar.mo17037rz();
                            length5++;
                        }
                        bVarArr2[length5] = new C1353b();
                        qoVar.mo17010a(bVarArr2[length5]);
                        this.f2748fJ = bVarArr2;
                        break;
                    case 50:
                        int b6 = C2169qz.m6494b(qoVar, 50);
                        int length6 = this.f2749fK == null ? 0 : this.f2749fK.length;
                        C1353b[] bVarArr3 = new C1353b[(b6 + length6)];
                        if (length6 != 0) {
                            System.arraycopy(this.f2749fK, 0, bVarArr3, 0, length6);
                        }
                        while (length6 < bVarArr3.length - 1) {
                            bVarArr3[length6] = new C1353b();
                            qoVar.mo17010a(bVarArr3[length6]);
                            qoVar.mo17037rz();
                            length6++;
                        }
                        bVarArr3[length6] = new C1353b();
                        qoVar.mo17010a(bVarArr3[length6]);
                        this.f2749fK = bVarArr3;
                        break;
                    case 58:
                        int b7 = C2169qz.m6494b(qoVar, 58);
                        int length7 = this.f2750fL == null ? 0 : this.f2750fL.length;
                        C1358g[] gVarArr = new C1358g[(b7 + length7)];
                        if (length7 != 0) {
                            System.arraycopy(this.f2750fL, 0, gVarArr, 0, length7);
                        }
                        while (length7 < gVarArr.length - 1) {
                            gVarArr[length7] = new C1358g();
                            qoVar.mo17010a(gVarArr[length7]);
                            qoVar.mo17037rz();
                            length7++;
                        }
                        gVarArr[length7] = new C1358g();
                        qoVar.mo17010a(gVarArr[length7]);
                        this.f2750fL = gVarArr;
                        break;
                    case 74:
                        this.f2751fM = qoVar.readString();
                        break;
                    case 82:
                        this.f2752fN = qoVar.readString();
                        break;
                    case 98:
                        this.f2753fO = qoVar.readString();
                        break;
                    case 106:
                        this.version = qoVar.readString();
                        break;
                    case 114:
                        if (this.f2754fP == null) {
                            this.f2754fP = new C1352a();
                        }
                        qoVar.mo17010a(this.f2754fP);
                        break;
                    case 125:
                        this.f2755fQ = qoVar.readFloat();
                        break;
                    case 130:
                        int b8 = C2169qz.m6494b(qoVar, 130);
                        int length8 = this.f2757fS == null ? 0 : this.f2757fS.length;
                        String[] strArr2 = new String[(b8 + length8)];
                        if (length8 != 0) {
                            System.arraycopy(this.f2757fS, 0, strArr2, 0, length8);
                        }
                        while (length8 < strArr2.length - 1) {
                            strArr2[length8] = qoVar.readString();
                            qoVar.mo17037rz();
                            length8++;
                        }
                        strArr2[length8] = qoVar.readString();
                        this.f2757fS = strArr2;
                        break;
                    case 136:
                        this.f2758fT = qoVar.mo17022rC();
                        break;
                    case 144:
                        this.f2756fR = qoVar.mo17023rD();
                        break;
                    case 154:
                        int b9 = C2169qz.m6494b(qoVar, 154);
                        int length9 = this.f2743fE == null ? 0 : this.f2743fE.length;
                        String[] strArr3 = new String[(b9 + length9)];
                        if (length9 != 0) {
                            System.arraycopy(this.f2743fE, 0, strArr3, 0, length9);
                        }
                        while (length9 < strArr3.length - 1) {
                            strArr3[length9] = qoVar.readString();
                            qoVar.mo17037rz();
                            length9++;
                        }
                        strArr3[length9] = qoVar.readString();
                        this.f2743fE = strArr3;
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

        public int hashCode() {
            int i = 0;
            int hashCode = (((((((((((((((((((((((527 + C2164qu.hashCode((Object[]) this.f2743fE)) * 31) + C2164qu.hashCode((Object[]) this.f2744fF)) * 31) + C2164qu.hashCode((Object[]) this.f2745fG)) * 31) + C2164qu.hashCode((Object[]) this.f2746fH)) * 31) + C2164qu.hashCode((Object[]) this.f2747fI)) * 31) + C2164qu.hashCode((Object[]) this.f2748fJ)) * 31) + C2164qu.hashCode((Object[]) this.f2749fK)) * 31) + C2164qu.hashCode((Object[]) this.f2750fL)) * 31) + (this.f2751fM == null ? 0 : this.f2751fM.hashCode())) * 31) + (this.f2752fN == null ? 0 : this.f2752fN.hashCode())) * 31) + (this.f2753fO == null ? 0 : this.f2753fO.hashCode())) * 31) + (this.version == null ? 0 : this.version.hashCode())) * 31;
            if (this.f2754fP != null) {
                i = this.f2754fP.hashCode();
            }
            return (31 * (((((((((hashCode + i) * 31) + Float.floatToIntBits(this.f2755fQ)) * 31) + (this.f2756fR ? 1231 : 1237)) * 31) + C2164qu.hashCode((Object[]) this.f2757fS)) * 31) + this.f2758fT)) + mo17074rQ();
        }

        /* renamed from: k */
        public C1357f mo14998k() {
            this.f2743fE = C2169qz.azo;
            this.f2744fF = C2169qz.azo;
            this.f2745fG = C1408d.C1409a.m4227r();
            this.f2746fH = C1356e.m4116i();
            this.f2747fI = C1353b.m4099d();
            this.f2748fJ = C1353b.m4099d();
            this.f2749fK = C1353b.m4099d();
            this.f2750fL = C1358g.m4128l();
            this.f2751fM = "";
            this.f2752fN = "";
            this.f2753fO = "0";
            this.version = "";
            this.f2754fP = null;
            this.f2755fQ = 0.0f;
            this.f2756fR = false;
            this.f2757fS = C2169qz.azo;
            this.f2758fT = 0;
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.c$g */
    public static final class C1358g extends C2160qq<C1358g> {

        /* renamed from: fU */
        private static volatile C1358g[] f2759fU;

        /* renamed from: fV */
        public int[] f2760fV;

        /* renamed from: fW */
        public int[] f2761fW;

        /* renamed from: fX */
        public int[] f2762fX;

        /* renamed from: fY */
        public int[] f2763fY;

        /* renamed from: fZ */
        public int[] f2764fZ;

        /* renamed from: ga */
        public int[] f2765ga;

        /* renamed from: gb */
        public int[] f2766gb;

        /* renamed from: gc */
        public int[] f2767gc;

        /* renamed from: gd */
        public int[] f2768gd;

        /* renamed from: ge */
        public int[] f2769ge;

        public C1358g() {
            mo15002m();
        }

        /* renamed from: l */
        public static C1358g[] m4128l() {
            if (f2759fU == null) {
                synchronized (C2164qu.azg) {
                    if (f2759fU == null) {
                        f2759fU = new C1358g[0];
                    }
                }
            }
            return f2759fU;
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.f2760fV != null && this.f2760fV.length > 0) {
                for (int t : this.f2760fV) {
                    qpVar.mo17067t(1, t);
                }
            }
            if (this.f2761fW != null && this.f2761fW.length > 0) {
                for (int t2 : this.f2761fW) {
                    qpVar.mo17067t(2, t2);
                }
            }
            if (this.f2762fX != null && this.f2762fX.length > 0) {
                for (int t3 : this.f2762fX) {
                    qpVar.mo17067t(3, t3);
                }
            }
            if (this.f2763fY != null && this.f2763fY.length > 0) {
                for (int t4 : this.f2763fY) {
                    qpVar.mo17067t(4, t4);
                }
            }
            if (this.f2764fZ != null && this.f2764fZ.length > 0) {
                for (int t5 : this.f2764fZ) {
                    qpVar.mo17067t(5, t5);
                }
            }
            if (this.f2765ga != null && this.f2765ga.length > 0) {
                for (int t6 : this.f2765ga) {
                    qpVar.mo17067t(6, t6);
                }
            }
            if (this.f2766gb != null && this.f2766gb.length > 0) {
                for (int t7 : this.f2766gb) {
                    qpVar.mo17067t(7, t7);
                }
            }
            if (this.f2767gc != null && this.f2767gc.length > 0) {
                for (int t8 : this.f2767gc) {
                    qpVar.mo17067t(8, t8);
                }
            }
            if (this.f2768gd != null && this.f2768gd.length > 0) {
                for (int t9 : this.f2768gd) {
                    qpVar.mo17067t(9, t9);
                }
            }
            if (this.f2769ge != null && this.f2769ge.length > 0) {
                for (int t10 : this.f2769ge) {
                    qpVar.mo17067t(10, t10);
                }
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.f2760fV != null && this.f2760fV.length > 0) {
                int i = 0;
                for (int gZ : this.f2760fV) {
                    i += C2158qp.m6399gZ(gZ);
                }
                c = c + i + (this.f2760fV.length * 1);
            }
            if (this.f2761fW != null && this.f2761fW.length > 0) {
                int i2 = 0;
                for (int gZ2 : this.f2761fW) {
                    i2 += C2158qp.m6399gZ(gZ2);
                }
                c = c + i2 + (this.f2761fW.length * 1);
            }
            if (this.f2762fX != null && this.f2762fX.length > 0) {
                int i3 = 0;
                for (int gZ3 : this.f2762fX) {
                    i3 += C2158qp.m6399gZ(gZ3);
                }
                c = c + i3 + (this.f2762fX.length * 1);
            }
            if (this.f2763fY != null && this.f2763fY.length > 0) {
                int i4 = 0;
                for (int gZ4 : this.f2763fY) {
                    i4 += C2158qp.m6399gZ(gZ4);
                }
                c = c + i4 + (this.f2763fY.length * 1);
            }
            if (this.f2764fZ != null && this.f2764fZ.length > 0) {
                int i5 = 0;
                for (int gZ5 : this.f2764fZ) {
                    i5 += C2158qp.m6399gZ(gZ5);
                }
                c = c + i5 + (this.f2764fZ.length * 1);
            }
            if (this.f2765ga != null && this.f2765ga.length > 0) {
                int i6 = 0;
                for (int gZ6 : this.f2765ga) {
                    i6 += C2158qp.m6399gZ(gZ6);
                }
                c = c + i6 + (this.f2765ga.length * 1);
            }
            if (this.f2766gb != null && this.f2766gb.length > 0) {
                int i7 = 0;
                for (int gZ7 : this.f2766gb) {
                    i7 += C2158qp.m6399gZ(gZ7);
                }
                c = c + i7 + (this.f2766gb.length * 1);
            }
            if (this.f2767gc != null && this.f2767gc.length > 0) {
                int i8 = 0;
                for (int gZ8 : this.f2767gc) {
                    i8 += C2158qp.m6399gZ(gZ8);
                }
                c = c + i8 + (this.f2767gc.length * 1);
            }
            if (this.f2768gd != null && this.f2768gd.length > 0) {
                int i9 = 0;
                for (int gZ9 : this.f2768gd) {
                    i9 += C2158qp.m6399gZ(gZ9);
                }
                c = c + i9 + (this.f2768gd.length * 1);
            }
            if (this.f2769ge == null || this.f2769ge.length <= 0) {
                return c;
            }
            int i10 = 0;
            for (int gZ10 : this.f2769ge) {
                i10 += C2158qp.m6399gZ(gZ10);
            }
            return c + i10 + (1 * this.f2769ge.length);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1358g)) {
                return false;
            }
            C1358g gVar = (C1358g) obj;
            if (C2164qu.equals(this.f2760fV, gVar.f2760fV) && C2164qu.equals(this.f2761fW, gVar.f2761fW) && C2164qu.equals(this.f2762fX, gVar.f2762fX) && C2164qu.equals(this.f2763fY, gVar.f2763fY) && C2164qu.equals(this.f2764fZ, gVar.f2764fZ) && C2164qu.equals(this.f2765ga, gVar.f2765ga) && C2164qu.equals(this.f2766gb, gVar.f2766gb) && C2164qu.equals(this.f2767gc, gVar.f2767gc) && C2164qu.equals(this.f2768gd, gVar.f2768gd) && C2164qu.equals(this.f2769ge, gVar.f2769ge)) {
                return mo17073a(gVar);
            }
            return false;
        }

        /* renamed from: h */
        public C1358g mo11552b(C2157qo qoVar) throws IOException {
            int i;
            while (true) {
                int rz = qoVar.mo17037rz();
                switch (rz) {
                    case 0:
                        return this;
                    case 8:
                        int b = C2169qz.m6494b(qoVar, 8);
                        int length = this.f2760fV == null ? 0 : this.f2760fV.length;
                        int[] iArr = new int[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f2760fV, 0, iArr, 0, length);
                        }
                        while (length < iArr.length - 1) {
                            iArr[length] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length++;
                        }
                        iArr[length] = qoVar.mo17022rC();
                        this.f2760fV = iArr;
                        continue;
                    case 10:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position = qoVar.getPosition();
                        int i2 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i2++;
                        }
                        qoVar.mo17016gU(position);
                        int length2 = this.f2760fV == null ? 0 : this.f2760fV.length;
                        int[] iArr2 = new int[(i2 + length2)];
                        if (length2 != 0) {
                            System.arraycopy(this.f2760fV, 0, iArr2, 0, length2);
                        }
                        while (length2 < iArr2.length) {
                            iArr2[length2] = qoVar.mo17022rC();
                            length2++;
                        }
                        this.f2760fV = iArr2;
                        break;
                    case 16:
                        int b2 = C2169qz.m6494b(qoVar, 16);
                        int length3 = this.f2761fW == null ? 0 : this.f2761fW.length;
                        int[] iArr3 = new int[(b2 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(this.f2761fW, 0, iArr3, 0, length3);
                        }
                        while (length3 < iArr3.length - 1) {
                            iArr3[length3] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length3++;
                        }
                        iArr3[length3] = qoVar.mo17022rC();
                        this.f2761fW = iArr3;
                        continue;
                    case 18:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position2 = qoVar.getPosition();
                        int i3 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i3++;
                        }
                        qoVar.mo17016gU(position2);
                        int length4 = this.f2761fW == null ? 0 : this.f2761fW.length;
                        int[] iArr4 = new int[(i3 + length4)];
                        if (length4 != 0) {
                            System.arraycopy(this.f2761fW, 0, iArr4, 0, length4);
                        }
                        while (length4 < iArr4.length) {
                            iArr4[length4] = qoVar.mo17022rC();
                            length4++;
                        }
                        this.f2761fW = iArr4;
                        break;
                    case 24:
                        int b3 = C2169qz.m6494b(qoVar, 24);
                        int length5 = this.f2762fX == null ? 0 : this.f2762fX.length;
                        int[] iArr5 = new int[(b3 + length5)];
                        if (length5 != 0) {
                            System.arraycopy(this.f2762fX, 0, iArr5, 0, length5);
                        }
                        while (length5 < iArr5.length - 1) {
                            iArr5[length5] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length5++;
                        }
                        iArr5[length5] = qoVar.mo17022rC();
                        this.f2762fX = iArr5;
                        continue;
                    case 26:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position3 = qoVar.getPosition();
                        int i4 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i4++;
                        }
                        qoVar.mo17016gU(position3);
                        int length6 = this.f2762fX == null ? 0 : this.f2762fX.length;
                        int[] iArr6 = new int[(i4 + length6)];
                        if (length6 != 0) {
                            System.arraycopy(this.f2762fX, 0, iArr6, 0, length6);
                        }
                        while (length6 < iArr6.length) {
                            iArr6[length6] = qoVar.mo17022rC();
                            length6++;
                        }
                        this.f2762fX = iArr6;
                        break;
                    case 32:
                        int b4 = C2169qz.m6494b(qoVar, 32);
                        int length7 = this.f2763fY == null ? 0 : this.f2763fY.length;
                        int[] iArr7 = new int[(b4 + length7)];
                        if (length7 != 0) {
                            System.arraycopy(this.f2763fY, 0, iArr7, 0, length7);
                        }
                        while (length7 < iArr7.length - 1) {
                            iArr7[length7] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length7++;
                        }
                        iArr7[length7] = qoVar.mo17022rC();
                        this.f2763fY = iArr7;
                        continue;
                    case 34:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position4 = qoVar.getPosition();
                        int i5 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i5++;
                        }
                        qoVar.mo17016gU(position4);
                        int length8 = this.f2763fY == null ? 0 : this.f2763fY.length;
                        int[] iArr8 = new int[(i5 + length8)];
                        if (length8 != 0) {
                            System.arraycopy(this.f2763fY, 0, iArr8, 0, length8);
                        }
                        while (length8 < iArr8.length) {
                            iArr8[length8] = qoVar.mo17022rC();
                            length8++;
                        }
                        this.f2763fY = iArr8;
                        break;
                    case 40:
                        int b5 = C2169qz.m6494b(qoVar, 40);
                        int length9 = this.f2764fZ == null ? 0 : this.f2764fZ.length;
                        int[] iArr9 = new int[(b5 + length9)];
                        if (length9 != 0) {
                            System.arraycopy(this.f2764fZ, 0, iArr9, 0, length9);
                        }
                        while (length9 < iArr9.length - 1) {
                            iArr9[length9] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length9++;
                        }
                        iArr9[length9] = qoVar.mo17022rC();
                        this.f2764fZ = iArr9;
                        continue;
                    case 42:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position5 = qoVar.getPosition();
                        int i6 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i6++;
                        }
                        qoVar.mo17016gU(position5);
                        int length10 = this.f2764fZ == null ? 0 : this.f2764fZ.length;
                        int[] iArr10 = new int[(i6 + length10)];
                        if (length10 != 0) {
                            System.arraycopy(this.f2764fZ, 0, iArr10, 0, length10);
                        }
                        while (length10 < iArr10.length) {
                            iArr10[length10] = qoVar.mo17022rC();
                            length10++;
                        }
                        this.f2764fZ = iArr10;
                        break;
                    case 48:
                        int b6 = C2169qz.m6494b(qoVar, 48);
                        int length11 = this.f2765ga == null ? 0 : this.f2765ga.length;
                        int[] iArr11 = new int[(b6 + length11)];
                        if (length11 != 0) {
                            System.arraycopy(this.f2765ga, 0, iArr11, 0, length11);
                        }
                        while (length11 < iArr11.length - 1) {
                            iArr11[length11] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length11++;
                        }
                        iArr11[length11] = qoVar.mo17022rC();
                        this.f2765ga = iArr11;
                        continue;
                    case 50:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position6 = qoVar.getPosition();
                        int i7 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i7++;
                        }
                        qoVar.mo17016gU(position6);
                        int length12 = this.f2765ga == null ? 0 : this.f2765ga.length;
                        int[] iArr12 = new int[(i7 + length12)];
                        if (length12 != 0) {
                            System.arraycopy(this.f2765ga, 0, iArr12, 0, length12);
                        }
                        while (length12 < iArr12.length) {
                            iArr12[length12] = qoVar.mo17022rC();
                            length12++;
                        }
                        this.f2765ga = iArr12;
                        break;
                    case 56:
                        int b7 = C2169qz.m6494b(qoVar, 56);
                        int length13 = this.f2766gb == null ? 0 : this.f2766gb.length;
                        int[] iArr13 = new int[(b7 + length13)];
                        if (length13 != 0) {
                            System.arraycopy(this.f2766gb, 0, iArr13, 0, length13);
                        }
                        while (length13 < iArr13.length - 1) {
                            iArr13[length13] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length13++;
                        }
                        iArr13[length13] = qoVar.mo17022rC();
                        this.f2766gb = iArr13;
                        continue;
                    case 58:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position7 = qoVar.getPosition();
                        int i8 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i8++;
                        }
                        qoVar.mo17016gU(position7);
                        int length14 = this.f2766gb == null ? 0 : this.f2766gb.length;
                        int[] iArr14 = new int[(i8 + length14)];
                        if (length14 != 0) {
                            System.arraycopy(this.f2766gb, 0, iArr14, 0, length14);
                        }
                        while (length14 < iArr14.length) {
                            iArr14[length14] = qoVar.mo17022rC();
                            length14++;
                        }
                        this.f2766gb = iArr14;
                        break;
                    case 64:
                        int b8 = C2169qz.m6494b(qoVar, 64);
                        int length15 = this.f2767gc == null ? 0 : this.f2767gc.length;
                        int[] iArr15 = new int[(b8 + length15)];
                        if (length15 != 0) {
                            System.arraycopy(this.f2767gc, 0, iArr15, 0, length15);
                        }
                        while (length15 < iArr15.length - 1) {
                            iArr15[length15] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length15++;
                        }
                        iArr15[length15] = qoVar.mo17022rC();
                        this.f2767gc = iArr15;
                        continue;
                    case 66:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position8 = qoVar.getPosition();
                        int i9 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i9++;
                        }
                        qoVar.mo17016gU(position8);
                        int length16 = this.f2767gc == null ? 0 : this.f2767gc.length;
                        int[] iArr16 = new int[(i9 + length16)];
                        if (length16 != 0) {
                            System.arraycopy(this.f2767gc, 0, iArr16, 0, length16);
                        }
                        while (length16 < iArr16.length) {
                            iArr16[length16] = qoVar.mo17022rC();
                            length16++;
                        }
                        this.f2767gc = iArr16;
                        break;
                    case 72:
                        int b9 = C2169qz.m6494b(qoVar, 72);
                        int length17 = this.f2768gd == null ? 0 : this.f2768gd.length;
                        int[] iArr17 = new int[(b9 + length17)];
                        if (length17 != 0) {
                            System.arraycopy(this.f2768gd, 0, iArr17, 0, length17);
                        }
                        while (length17 < iArr17.length - 1) {
                            iArr17[length17] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length17++;
                        }
                        iArr17[length17] = qoVar.mo17022rC();
                        this.f2768gd = iArr17;
                        continue;
                    case 74:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position9 = qoVar.getPosition();
                        int i10 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i10++;
                        }
                        qoVar.mo17016gU(position9);
                        int length18 = this.f2768gd == null ? 0 : this.f2768gd.length;
                        int[] iArr18 = new int[(i10 + length18)];
                        if (length18 != 0) {
                            System.arraycopy(this.f2768gd, 0, iArr18, 0, length18);
                        }
                        while (length18 < iArr18.length) {
                            iArr18[length18] = qoVar.mo17022rC();
                            length18++;
                        }
                        this.f2768gd = iArr18;
                        break;
                    case 80:
                        int b10 = C2169qz.m6494b(qoVar, 80);
                        int length19 = this.f2769ge == null ? 0 : this.f2769ge.length;
                        int[] iArr19 = new int[(b10 + length19)];
                        if (length19 != 0) {
                            System.arraycopy(this.f2769ge, 0, iArr19, 0, length19);
                        }
                        while (length19 < iArr19.length - 1) {
                            iArr19[length19] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length19++;
                        }
                        iArr19[length19] = qoVar.mo17022rC();
                        this.f2769ge = iArr19;
                        continue;
                    case 82:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position10 = qoVar.getPosition();
                        int i11 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i11++;
                        }
                        qoVar.mo17016gU(position10);
                        int length20 = this.f2769ge == null ? 0 : this.f2769ge.length;
                        int[] iArr20 = new int[(i11 + length20)];
                        if (length20 != 0) {
                            System.arraycopy(this.f2769ge, 0, iArr20, 0, length20);
                        }
                        while (length20 < iArr20.length) {
                            iArr20[length20] = qoVar.mo17022rC();
                            length20++;
                        }
                        this.f2769ge = iArr20;
                        break;
                    default:
                        if (!mo17072a(qoVar, rz)) {
                            return this;
                        }
                        continue;
                }
                qoVar.mo17015gT(i);
            }
        }

        public int hashCode() {
            return (31 * (((((((((((((((((((527 + C2164qu.hashCode(this.f2760fV)) * 31) + C2164qu.hashCode(this.f2761fW)) * 31) + C2164qu.hashCode(this.f2762fX)) * 31) + C2164qu.hashCode(this.f2763fY)) * 31) + C2164qu.hashCode(this.f2764fZ)) * 31) + C2164qu.hashCode(this.f2765ga)) * 31) + C2164qu.hashCode(this.f2766gb)) * 31) + C2164qu.hashCode(this.f2767gc)) * 31) + C2164qu.hashCode(this.f2768gd)) * 31) + C2164qu.hashCode(this.f2769ge))) + mo17074rQ();
        }

        /* renamed from: m */
        public C1358g mo15002m() {
            this.f2760fV = C2169qz.azj;
            this.f2761fW = C2169qz.azj;
            this.f2762fX = C2169qz.azj;
            this.f2763fY = C2169qz.azj;
            this.f2764fZ = C2169qz.azj;
            this.f2765ga = C2169qz.azj;
            this.f2766gb = C2169qz.azj;
            this.f2767gc = C2169qz.azj;
            this.f2768gd = C2169qz.azj;
            this.f2769ge = C2169qz.azj;
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.c$h */
    public static final class C1359h extends C2160qq<C1359h> {

        /* renamed from: gf */
        public static final C2161qr<C1408d.C1409a, C1359h> f2770gf = C2161qr.m6447a(11, C1359h.class, 810);

        /* renamed from: gg */
        private static final C1359h[] f2771gg = new C1359h[0];

        /* renamed from: gh */
        public int[] f2772gh;

        /* renamed from: gi */
        public int[] f2773gi;

        /* renamed from: gj */
        public int[] f2774gj;

        /* renamed from: gk */
        public int f2775gk;

        /* renamed from: gl */
        public int[] f2776gl;

        /* renamed from: gm */
        public int f2777gm;

        /* renamed from: gn */
        public int f2778gn;

        public C1359h() {
            mo15006n();
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.f2772gh != null && this.f2772gh.length > 0) {
                for (int t : this.f2772gh) {
                    qpVar.mo17067t(1, t);
                }
            }
            if (this.f2773gi != null && this.f2773gi.length > 0) {
                for (int t2 : this.f2773gi) {
                    qpVar.mo17067t(2, t2);
                }
            }
            if (this.f2774gj != null && this.f2774gj.length > 0) {
                for (int t3 : this.f2774gj) {
                    qpVar.mo17067t(3, t3);
                }
            }
            if (this.f2775gk != 0) {
                qpVar.mo17067t(4, this.f2775gk);
            }
            if (this.f2776gl != null && this.f2776gl.length > 0) {
                for (int t4 : this.f2776gl) {
                    qpVar.mo17067t(5, t4);
                }
            }
            if (this.f2777gm != 0) {
                qpVar.mo17067t(6, this.f2777gm);
            }
            if (this.f2778gn != 0) {
                qpVar.mo17067t(7, this.f2778gn);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.f2772gh != null && this.f2772gh.length > 0) {
                int i = 0;
                for (int gZ : this.f2772gh) {
                    i += C2158qp.m6399gZ(gZ);
                }
                c = c + i + (this.f2772gh.length * 1);
            }
            if (this.f2773gi != null && this.f2773gi.length > 0) {
                int i2 = 0;
                for (int gZ2 : this.f2773gi) {
                    i2 += C2158qp.m6399gZ(gZ2);
                }
                c = c + i2 + (this.f2773gi.length * 1);
            }
            if (this.f2774gj != null && this.f2774gj.length > 0) {
                int i3 = 0;
                for (int gZ3 : this.f2774gj) {
                    i3 += C2158qp.m6399gZ(gZ3);
                }
                c = c + i3 + (this.f2774gj.length * 1);
            }
            if (this.f2775gk != 0) {
                c += C2158qp.m6407v(4, this.f2775gk);
            }
            if (this.f2776gl != null && this.f2776gl.length > 0) {
                int i4 = 0;
                for (int gZ4 : this.f2776gl) {
                    i4 += C2158qp.m6399gZ(gZ4);
                }
                c = c + i4 + (1 * this.f2776gl.length);
            }
            if (this.f2777gm != 0) {
                c += C2158qp.m6407v(6, this.f2777gm);
            }
            return this.f2778gn != 0 ? c + C2158qp.m6407v(7, this.f2778gn) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1359h)) {
                return false;
            }
            C1359h hVar = (C1359h) obj;
            if (C2164qu.equals(this.f2772gh, hVar.f2772gh) && C2164qu.equals(this.f2773gi, hVar.f2773gi) && C2164qu.equals(this.f2774gj, hVar.f2774gj) && this.f2775gk == hVar.f2775gk && C2164qu.equals(this.f2776gl, hVar.f2776gl) && this.f2777gm == hVar.f2777gm && this.f2778gn == hVar.f2778gn) {
                return mo17073a(hVar);
            }
            return false;
        }

        public int hashCode() {
            return (31 * (((((((((((((527 + C2164qu.hashCode(this.f2772gh)) * 31) + C2164qu.hashCode(this.f2773gi)) * 31) + C2164qu.hashCode(this.f2774gj)) * 31) + this.f2775gk) * 31) + C2164qu.hashCode(this.f2776gl)) * 31) + this.f2777gm) * 31) + this.f2778gn)) + mo17074rQ();
        }

        /* renamed from: i */
        public C1359h mo11552b(C2157qo qoVar) throws IOException {
            int i;
            while (true) {
                int rz = qoVar.mo17037rz();
                switch (rz) {
                    case 0:
                        return this;
                    case 8:
                        int b = C2169qz.m6494b(qoVar, 8);
                        int length = this.f2772gh == null ? 0 : this.f2772gh.length;
                        int[] iArr = new int[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f2772gh, 0, iArr, 0, length);
                        }
                        while (length < iArr.length - 1) {
                            iArr[length] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length++;
                        }
                        iArr[length] = qoVar.mo17022rC();
                        this.f2772gh = iArr;
                        continue;
                    case 10:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position = qoVar.getPosition();
                        int i2 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i2++;
                        }
                        qoVar.mo17016gU(position);
                        int length2 = this.f2772gh == null ? 0 : this.f2772gh.length;
                        int[] iArr2 = new int[(i2 + length2)];
                        if (length2 != 0) {
                            System.arraycopy(this.f2772gh, 0, iArr2, 0, length2);
                        }
                        while (length2 < iArr2.length) {
                            iArr2[length2] = qoVar.mo17022rC();
                            length2++;
                        }
                        this.f2772gh = iArr2;
                        break;
                    case 16:
                        int b2 = C2169qz.m6494b(qoVar, 16);
                        int length3 = this.f2773gi == null ? 0 : this.f2773gi.length;
                        int[] iArr3 = new int[(b2 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(this.f2773gi, 0, iArr3, 0, length3);
                        }
                        while (length3 < iArr3.length - 1) {
                            iArr3[length3] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length3++;
                        }
                        iArr3[length3] = qoVar.mo17022rC();
                        this.f2773gi = iArr3;
                        continue;
                    case 18:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position2 = qoVar.getPosition();
                        int i3 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i3++;
                        }
                        qoVar.mo17016gU(position2);
                        int length4 = this.f2773gi == null ? 0 : this.f2773gi.length;
                        int[] iArr4 = new int[(i3 + length4)];
                        if (length4 != 0) {
                            System.arraycopy(this.f2773gi, 0, iArr4, 0, length4);
                        }
                        while (length4 < iArr4.length) {
                            iArr4[length4] = qoVar.mo17022rC();
                            length4++;
                        }
                        this.f2773gi = iArr4;
                        break;
                    case 24:
                        int b3 = C2169qz.m6494b(qoVar, 24);
                        int length5 = this.f2774gj == null ? 0 : this.f2774gj.length;
                        int[] iArr5 = new int[(b3 + length5)];
                        if (length5 != 0) {
                            System.arraycopy(this.f2774gj, 0, iArr5, 0, length5);
                        }
                        while (length5 < iArr5.length - 1) {
                            iArr5[length5] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length5++;
                        }
                        iArr5[length5] = qoVar.mo17022rC();
                        this.f2774gj = iArr5;
                        continue;
                    case 26:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position3 = qoVar.getPosition();
                        int i4 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i4++;
                        }
                        qoVar.mo17016gU(position3);
                        int length6 = this.f2774gj == null ? 0 : this.f2774gj.length;
                        int[] iArr6 = new int[(i4 + length6)];
                        if (length6 != 0) {
                            System.arraycopy(this.f2774gj, 0, iArr6, 0, length6);
                        }
                        while (length6 < iArr6.length) {
                            iArr6[length6] = qoVar.mo17022rC();
                            length6++;
                        }
                        this.f2774gj = iArr6;
                        break;
                    case 32:
                        this.f2775gk = qoVar.mo17022rC();
                        continue;
                    case 40:
                        int b4 = C2169qz.m6494b(qoVar, 40);
                        int length7 = this.f2776gl == null ? 0 : this.f2776gl.length;
                        int[] iArr7 = new int[(b4 + length7)];
                        if (length7 != 0) {
                            System.arraycopy(this.f2776gl, 0, iArr7, 0, length7);
                        }
                        while (length7 < iArr7.length - 1) {
                            iArr7[length7] = qoVar.mo17022rC();
                            qoVar.mo17037rz();
                            length7++;
                        }
                        iArr7[length7] = qoVar.mo17022rC();
                        this.f2776gl = iArr7;
                        continue;
                    case 42:
                        i = qoVar.mo17014gS(qoVar.mo17026rG());
                        int position4 = qoVar.getPosition();
                        int i5 = 0;
                        while (qoVar.mo17030rL() > 0) {
                            qoVar.mo17022rC();
                            i5++;
                        }
                        qoVar.mo17016gU(position4);
                        int length8 = this.f2776gl == null ? 0 : this.f2776gl.length;
                        int[] iArr8 = new int[(i5 + length8)];
                        if (length8 != 0) {
                            System.arraycopy(this.f2776gl, 0, iArr8, 0, length8);
                        }
                        while (length8 < iArr8.length) {
                            iArr8[length8] = qoVar.mo17022rC();
                            length8++;
                        }
                        this.f2776gl = iArr8;
                        break;
                    case 48:
                        this.f2777gm = qoVar.mo17022rC();
                        continue;
                    case 56:
                        this.f2778gn = qoVar.mo17022rC();
                        continue;
                    default:
                        if (!mo17072a(qoVar, rz)) {
                            return this;
                        }
                        continue;
                }
                qoVar.mo17015gT(i);
            }
        }

        /* renamed from: n */
        public C1359h mo15006n() {
            this.f2772gh = C2169qz.azj;
            this.f2773gi = C2169qz.azj;
            this.f2774gj = C2169qz.azj;
            this.f2775gk = 0;
            this.f2776gl = C2169qz.azj;
            this.f2777gm = 0;
            this.f2778gn = 0;
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.c$i */
    public static final class C1360i extends C2160qq<C1360i> {

        /* renamed from: go */
        private static volatile C1360i[] f2779go;

        /* renamed from: gp */
        public C1408d.C1409a f2780gp;

        /* renamed from: gq */
        public C1355d f2781gq;
        public String name;

        public C1360i() {
            mo15010p();
        }

        /* renamed from: o */
        public static C1360i[] m4139o() {
            if (f2779go == null) {
                synchronized (C2164qu.azg) {
                    if (f2779go == null) {
                        f2779go = new C1360i[0];
                    }
                }
            }
            return f2779go;
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (!this.name.equals("")) {
                qpVar.mo17050b(1, this.name);
            }
            if (this.f2780gp != null) {
                qpVar.mo17045a(2, (C2166qw) this.f2780gp);
            }
            if (this.f2781gq != null) {
                qpVar.mo17045a(3, (C2166qw) this.f2781gq);
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
            if (this.f2780gp != null) {
                c += C2158qp.m6390c(2, (C2166qw) this.f2780gp);
            }
            return this.f2781gq != null ? c + C2158qp.m6390c(3, (C2166qw) this.f2781gq) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1360i)) {
                return false;
            }
            C1360i iVar = (C1360i) obj;
            if (this.name == null) {
                if (iVar.name != null) {
                    return false;
                }
            } else if (!this.name.equals(iVar.name)) {
                return false;
            }
            if (this.f2780gp == null) {
                if (iVar.f2780gp != null) {
                    return false;
                }
            } else if (!this.f2780gp.equals(iVar.f2780gp)) {
                return false;
            }
            if (this.f2781gq == null) {
                if (iVar.f2781gq != null) {
                    return false;
                }
            } else if (!this.f2781gq.equals(iVar.f2781gq)) {
                return false;
            }
            return mo17073a(iVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((527 + (this.name == null ? 0 : this.name.hashCode())) * 31) + (this.f2780gp == null ? 0 : this.f2780gp.hashCode())) * 31;
            if (this.f2781gq != null) {
                i = this.f2781gq.hashCode();
            }
            return (31 * (hashCode + i)) + mo17074rQ();
        }

        /* renamed from: j */
        public C1360i mo11552b(C2157qo qoVar) throws IOException {
            C2166qw qwVar;
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz != 10) {
                    if (rz == 18) {
                        if (this.f2780gp == null) {
                            this.f2780gp = new C1408d.C1409a();
                        }
                        qwVar = this.f2780gp;
                    } else if (rz == 26) {
                        if (this.f2781gq == null) {
                            this.f2781gq = new C1355d();
                        }
                        qwVar = this.f2781gq;
                    } else if (!mo17072a(qoVar, rz)) {
                        return this;
                    }
                    qoVar.mo17010a(qwVar);
                } else {
                    this.name = qoVar.readString();
                }
            }
        }

        /* renamed from: p */
        public C1360i mo15010p() {
            this.name = "";
            this.f2780gp = null;
            this.f2781gq = null;
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.c$j */
    public static final class C1361j extends C2160qq<C1361j> {

        /* renamed from: gr */
        public C1360i[] f2782gr;

        /* renamed from: gs */
        public C1357f f2783gs;

        /* renamed from: gt */
        public String f2784gt;

        public C1361j() {
            mo15014q();
        }

        /* renamed from: b */
        public static C1361j m4145b(byte[] bArr) throws C2165qv {
            return (C1361j) C2166qw.m6477a(new C1361j(), bArr);
        }

        /* renamed from: a */
        public void mo11551a(C2158qp qpVar) throws IOException {
            if (this.f2782gr != null && this.f2782gr.length > 0) {
                for (C1360i iVar : this.f2782gr) {
                    if (iVar != null) {
                        qpVar.mo17045a(1, (C2166qw) iVar);
                    }
                }
            }
            if (this.f2783gs != null) {
                qpVar.mo17045a(2, (C2166qw) this.f2783gs);
            }
            if (!this.f2784gt.equals("")) {
                qpVar.mo17050b(3, this.f2784gt);
            }
            super.mo11551a(qpVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo11553c() {
            int c = super.mo11553c();
            if (this.f2782gr != null && this.f2782gr.length > 0) {
                for (C1360i iVar : this.f2782gr) {
                    if (iVar != null) {
                        c += C2158qp.m6390c(1, (C2166qw) iVar);
                    }
                }
            }
            if (this.f2783gs != null) {
                c += C2158qp.m6390c(2, (C2166qw) this.f2783gs);
            }
            return !this.f2784gt.equals("") ? c + C2158qp.m6404j(3, this.f2784gt) : c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1361j)) {
                return false;
            }
            C1361j jVar = (C1361j) obj;
            if (!C2164qu.equals((Object[]) this.f2782gr, (Object[]) jVar.f2782gr)) {
                return false;
            }
            if (this.f2783gs == null) {
                if (jVar.f2783gs != null) {
                    return false;
                }
            } else if (!this.f2783gs.equals(jVar.f2783gs)) {
                return false;
            }
            if (this.f2784gt == null) {
                if (jVar.f2784gt != null) {
                    return false;
                }
            } else if (!this.f2784gt.equals(jVar.f2784gt)) {
                return false;
            }
            return mo17073a(jVar);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((527 + C2164qu.hashCode((Object[]) this.f2782gr)) * 31) + (this.f2783gs == null ? 0 : this.f2783gs.hashCode())) * 31;
            if (this.f2784gt != null) {
                i = this.f2784gt.hashCode();
            }
            return (31 * (hashCode + i)) + mo17074rQ();
        }

        /* renamed from: k */
        public C1361j mo11552b(C2157qo qoVar) throws IOException {
            while (true) {
                int rz = qoVar.mo17037rz();
                if (rz == 0) {
                    return this;
                }
                if (rz == 10) {
                    int b = C2169qz.m6494b(qoVar, 10);
                    int length = this.f2782gr == null ? 0 : this.f2782gr.length;
                    C1360i[] iVarArr = new C1360i[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f2782gr, 0, iVarArr, 0, length);
                    }
                    while (length < iVarArr.length - 1) {
                        iVarArr[length] = new C1360i();
                        qoVar.mo17010a(iVarArr[length]);
                        qoVar.mo17037rz();
                        length++;
                    }
                    iVarArr[length] = new C1360i();
                    qoVar.mo17010a(iVarArr[length]);
                    this.f2782gr = iVarArr;
                } else if (rz == 18) {
                    if (this.f2783gs == null) {
                        this.f2783gs = new C1357f();
                    }
                    qoVar.mo17010a(this.f2783gs);
                } else if (rz == 26) {
                    this.f2784gt = qoVar.readString();
                } else if (!mo17072a(qoVar, rz)) {
                    return this;
                }
            }
        }

        /* renamed from: q */
        public C1361j mo15014q() {
            this.f2782gr = C1360i.m4139o();
            this.f2783gs = null;
            this.f2784gt = "";
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }
}
