package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1351c;
import com.google.android.gms.internal.C1408d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.cr */
class C2551cr {

    /* renamed from: com.google.android.gms.tagmanager.cr$a */
    public static class C2553a {
        private final Map<String, C1408d.C1409a> asM;
        private final C1408d.C1409a asN;

        private C2553a(Map<String, C1408d.C1409a> map, C1408d.C1409a aVar) {
            this.asM = map;
            this.asN = aVar;
        }

        /* renamed from: qk */
        public static C2554b m7392qk() {
            return new C2554b();
        }

        /* renamed from: a */
        public void mo18749a(String str, C1408d.C1409a aVar) {
            this.asM.put(str, aVar);
        }

        /* renamed from: ql */
        public Map<String, C1408d.C1409a> mo18750ql() {
            return Collections.unmodifiableMap(this.asM);
        }

        /* renamed from: qm */
        public C1408d.C1409a mo18751qm() {
            return this.asN;
        }

        public String toString() {
            return "Properties: " + mo18750ql() + " pushAfterEvaluate: " + this.asN;
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.cr$b */
    public static class C2554b {
        private final Map<String, C1408d.C1409a> asM;
        private C1408d.C1409a asN;

        private C2554b() {
            this.asM = new HashMap();
        }

        /* renamed from: b */
        public C2554b mo18753b(String str, C1408d.C1409a aVar) {
            this.asM.put(str, aVar);
            return this;
        }

        /* renamed from: i */
        public C2554b mo18754i(C1408d.C1409a aVar) {
            this.asN = aVar;
            return this;
        }

        /* renamed from: qn */
        public C2553a mo18755qn() {
            return new C2553a(this.asM, this.asN);
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.cr$c */
    public static class C2555c {

        /* renamed from: TU */
        private final String f4443TU;
        private final List<C2557e> asO;
        private final Map<String, List<C2553a>> asP;
        private final int asQ;

        private C2555c(List<C2557e> list, Map<String, List<C2553a>> map, String str, int i) {
            this.asO = Collections.unmodifiableList(list);
            this.asP = Collections.unmodifiableMap(map);
            this.f4443TU = str;
            this.asQ = i;
        }

        /* renamed from: qo */
        public static C2556d m7399qo() {
            return new C2556d();
        }

        public String getVersion() {
            return this.f4443TU;
        }

        /* renamed from: qp */
        public List<C2557e> mo18757qp() {
            return this.asO;
        }

        /* renamed from: qq */
        public Map<String, List<C2553a>> mo18758qq() {
            return this.asP;
        }

        public String toString() {
            return "Rules: " + mo18757qp() + "  Macros: " + this.asP;
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.cr$d */
    public static class C2556d {

        /* renamed from: TU */
        private String f4444TU;
        private final List<C2557e> asO;
        private final Map<String, List<C2553a>> asP;
        private int asQ;

        private C2556d() {
            this.asO = new ArrayList();
            this.asP = new HashMap();
            this.f4444TU = "";
            this.asQ = 0;
        }

        /* renamed from: a */
        public C2556d mo18760a(C2553a aVar) {
            String j = C2590di.m7533j(aVar.mo18750ql().get(C1308b.INSTANCE_NAME.toString()));
            List list = this.asP.get(j);
            if (list == null) {
                list = new ArrayList();
                this.asP.put(j, list);
            }
            list.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C2556d mo18761a(C2557e eVar) {
            this.asO.add(eVar);
            return this;
        }

        /* renamed from: cO */
        public C2556d mo18762cO(String str) {
            this.f4444TU = str;
            return this;
        }

        /* renamed from: fO */
        public C2556d mo18763fO(int i) {
            this.asQ = i;
            return this;
        }

        /* renamed from: qr */
        public C2555c mo18764qr() {
            return new C2555c(this.asO, this.asP, this.f4444TU, this.asQ);
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.cr$e */
    public static class C2557e {
        private final List<C2553a> asR;
        private final List<C2553a> asS;
        private final List<C2553a> asT;
        private final List<C2553a> asU;
        private final List<C2553a> asV;
        private final List<C2553a> asW;
        private final List<String> asX;
        private final List<String> asY;
        private final List<String> asZ;
        private final List<String> ata;

        private C2557e(List<C2553a> list, List<C2553a> list2, List<C2553a> list3, List<C2553a> list4, List<C2553a> list5, List<C2553a> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10) {
            this.asR = Collections.unmodifiableList(list);
            this.asS = Collections.unmodifiableList(list2);
            this.asT = Collections.unmodifiableList(list3);
            this.asU = Collections.unmodifiableList(list4);
            this.asV = Collections.unmodifiableList(list5);
            this.asW = Collections.unmodifiableList(list6);
            this.asX = Collections.unmodifiableList(list7);
            this.asY = Collections.unmodifiableList(list8);
            this.asZ = Collections.unmodifiableList(list9);
            this.ata = Collections.unmodifiableList(list10);
        }

        /* renamed from: qs */
        public static C2558f m7407qs() {
            return new C2558f();
        }

        /* renamed from: qA */
        public List<String> mo18765qA() {
            return this.asZ;
        }

        /* renamed from: qB */
        public List<String> mo18766qB() {
            return this.ata;
        }

        /* renamed from: qC */
        public List<C2553a> mo18767qC() {
            return this.asW;
        }

        /* renamed from: qt */
        public List<C2553a> mo18768qt() {
            return this.asR;
        }

        /* renamed from: qu */
        public List<C2553a> mo18769qu() {
            return this.asS;
        }

        /* renamed from: qv */
        public List<C2553a> mo18770qv() {
            return this.asT;
        }

        /* renamed from: qw */
        public List<C2553a> mo18771qw() {
            return this.asU;
        }

        /* renamed from: qx */
        public List<C2553a> mo18772qx() {
            return this.asV;
        }

        /* renamed from: qy */
        public List<String> mo18773qy() {
            return this.asX;
        }

        /* renamed from: qz */
        public List<String> mo18774qz() {
            return this.asY;
        }

        public String toString() {
            return "Positive predicates: " + mo18768qt() + "  Negative predicates: " + mo18769qu() + "  Add tags: " + mo18770qv() + "  Remove tags: " + mo18771qw() + "  Add macros: " + mo18772qx() + "  Remove macros: " + mo18767qC();
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.cr$f */
    public static class C2558f {
        private final List<C2553a> asR;
        private final List<C2553a> asS;
        private final List<C2553a> asT;
        private final List<C2553a> asU;
        private final List<C2553a> asV;
        private final List<C2553a> asW;
        private final List<String> asX;
        private final List<String> asY;
        private final List<String> asZ;
        private final List<String> ata;

        private C2558f() {
            this.asR = new ArrayList();
            this.asS = new ArrayList();
            this.asT = new ArrayList();
            this.asU = new ArrayList();
            this.asV = new ArrayList();
            this.asW = new ArrayList();
            this.asX = new ArrayList();
            this.asY = new ArrayList();
            this.asZ = new ArrayList();
            this.ata = new ArrayList();
        }

        /* renamed from: b */
        public C2558f mo18776b(C2553a aVar) {
            this.asR.add(aVar);
            return this;
        }

        /* renamed from: c */
        public C2558f mo18777c(C2553a aVar) {
            this.asS.add(aVar);
            return this;
        }

        /* renamed from: cP */
        public C2558f mo18778cP(String str) {
            this.asZ.add(str);
            return this;
        }

        /* renamed from: cQ */
        public C2558f mo18779cQ(String str) {
            this.ata.add(str);
            return this;
        }

        /* renamed from: cR */
        public C2558f mo18780cR(String str) {
            this.asX.add(str);
            return this;
        }

        /* renamed from: cS */
        public C2558f mo18781cS(String str) {
            this.asY.add(str);
            return this;
        }

        /* renamed from: d */
        public C2558f mo18782d(C2553a aVar) {
            this.asT.add(aVar);
            return this;
        }

        /* renamed from: e */
        public C2558f mo18783e(C2553a aVar) {
            this.asU.add(aVar);
            return this;
        }

        /* renamed from: f */
        public C2558f mo18784f(C2553a aVar) {
            this.asV.add(aVar);
            return this;
        }

        /* renamed from: g */
        public C2558f mo18785g(C2553a aVar) {
            this.asW.add(aVar);
            return this;
        }

        /* renamed from: qD */
        public C2557e mo18786qD() {
            return new C2557e(this.asR, this.asS, this.asT, this.asU, this.asV, this.asW, this.asX, this.asY, this.asZ, this.ata);
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.cr$g */
    public static class C2559g extends Exception {
        public C2559g(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private static C1408d.C1409a m7383a(int i, C1351c.C1357f fVar, C1408d.C1409a[] aVarArr, Set<Integer> set) throws C2559g {
        if (set.contains(Integer.valueOf(i))) {
            m7389cN("Value cycle detected.  Current value reference: " + i + "." + "  Previous value references: " + set + ".");
        }
        C1408d.C1409a aVar = (C1408d.C1409a) m7386a(fVar.f2745fG, i, "values");
        if (aVarArr[i] != null) {
            return aVarArr[i];
        }
        C1408d.C1409a aVar2 = null;
        set.add(Integer.valueOf(i));
        int i2 = 0;
        switch (aVar.type) {
            case 1:
            case 5:
            case 6:
            case 8:
                aVar2 = aVar;
                break;
            case 2:
                C1351c.C1359h h = m7391h(aVar);
                C1408d.C1409a g = m7390g(aVar);
                g.f2860gw = new C1408d.C1409a[h.f2772gh.length];
                int[] iArr = h.f2772gh;
                int length = iArr.length;
                int i3 = 0;
                while (i2 < length) {
                    g.f2860gw[i3] = m7383a(iArr[i2], fVar, aVarArr, set);
                    i2++;
                    i3++;
                }
                aVar2 = g;
                break;
            case 3:
                aVar2 = m7390g(aVar);
                C1351c.C1359h h2 = m7391h(aVar);
                if (h2.f2773gi.length != h2.f2774gj.length) {
                    m7389cN("Uneven map keys (" + h2.f2773gi.length + ") and map values (" + h2.f2774gj.length + ")");
                }
                aVar2.f2861gx = new C1408d.C1409a[h2.f2773gi.length];
                aVar2.f2862gy = new C1408d.C1409a[h2.f2773gi.length];
                int[] iArr2 = h2.f2773gi;
                int length2 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    aVar2.f2861gx[i5] = m7383a(iArr2[i4], fVar, aVarArr, set);
                    i4++;
                    i5++;
                }
                int[] iArr3 = h2.f2774gj;
                int length3 = iArr3.length;
                int i6 = 0;
                while (i2 < length3) {
                    aVar2.f2862gy[i6] = m7383a(iArr3[i2], fVar, aVarArr, set);
                    i2++;
                    i6++;
                }
                break;
            case 4:
                aVar2 = m7390g(aVar);
                aVar2.f2863gz = C2590di.m7533j(m7383a(m7391h(aVar).f2777gm, fVar, aVarArr, set));
                break;
            case 7:
                aVar2 = m7390g(aVar);
                C1351c.C1359h h3 = m7391h(aVar);
                aVar2.f2856gD = new C1408d.C1409a[h3.f2776gl.length];
                int[] iArr4 = h3.f2776gl;
                int length4 = iArr4.length;
                int i7 = 0;
                while (i2 < length4) {
                    aVar2.f2856gD[i7] = m7383a(iArr4[i2], fVar, aVarArr, set);
                    i2++;
                    i7++;
                }
                break;
        }
        if (aVar2 == null) {
            m7389cN("Invalid value: " + aVar);
        }
        aVarArr[i] = aVar2;
        set.remove(Integer.valueOf(i));
        return aVar2;
    }

    /* renamed from: a */
    private static C2553a m7384a(C1351c.C1353b bVar, C1351c.C1357f fVar, C1408d.C1409a[] aVarArr, int i) throws C2559g {
        C2554b qk = C2553a.m7392qk();
        for (int valueOf : bVar.f2729fq) {
            C1351c.C1356e eVar = (C1351c.C1356e) m7386a(fVar.f2746fH, Integer.valueOf(valueOf).intValue(), "properties");
            String str = (String) m7386a(fVar.f2744fF, eVar.key, "keys");
            C1408d.C1409a aVar = (C1408d.C1409a) m7386a(aVarArr, eVar.value, "values");
            if (C1308b.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                qk.mo18754i(aVar);
            } else {
                qk.mo18753b(str, aVar);
            }
        }
        return qk.mo18755qn();
    }

    /* renamed from: a */
    private static C2557e m7385a(C1351c.C1358g gVar, List<C2553a> list, List<C2553a> list2, List<C2553a> list3, C1351c.C1357f fVar) {
        C2558f qs = C2557e.m7407qs();
        for (int valueOf : gVar.f2760fV) {
            qs.mo18776b(list3.get(Integer.valueOf(valueOf).intValue()));
        }
        for (int valueOf2 : gVar.f2761fW) {
            qs.mo18777c(list3.get(Integer.valueOf(valueOf2).intValue()));
        }
        for (int valueOf3 : gVar.f2762fX) {
            qs.mo18782d(list.get(Integer.valueOf(valueOf3).intValue()));
        }
        for (int valueOf4 : gVar.f2764fZ) {
            qs.mo18778cP(fVar.f2745fG[Integer.valueOf(valueOf4).intValue()].f2859gv);
        }
        for (int valueOf5 : gVar.f2763fY) {
            qs.mo18783e(list.get(Integer.valueOf(valueOf5).intValue()));
        }
        for (int valueOf6 : gVar.f2765ga) {
            qs.mo18779cQ(fVar.f2745fG[Integer.valueOf(valueOf6).intValue()].f2859gv);
        }
        for (int valueOf7 : gVar.f2766gb) {
            qs.mo18784f(list2.get(Integer.valueOf(valueOf7).intValue()));
        }
        for (int valueOf8 : gVar.f2768gd) {
            qs.mo18780cR(fVar.f2745fG[Integer.valueOf(valueOf8).intValue()].f2859gv);
        }
        for (int valueOf9 : gVar.f2767gc) {
            qs.mo18785g(list2.get(Integer.valueOf(valueOf9).intValue()));
        }
        for (int valueOf10 : gVar.f2769ge) {
            qs.mo18781cS(fVar.f2745fG[Integer.valueOf(valueOf10).intValue()].f2859gv);
        }
        return qs.mo18786qD();
    }

    /* renamed from: a */
    private static <T> T m7386a(T[] tArr, int i, String str) throws C2559g {
        if (i < 0 || i >= tArr.length) {
            m7389cN("Index out of bounds detected: " + i + " in " + str);
        }
        return tArr[i];
    }

    /* renamed from: b */
    public static C2555c m7387b(C1351c.C1357f fVar) throws C2559g {
        C1408d.C1409a[] aVarArr = new C1408d.C1409a[fVar.f2745fG.length];
        for (int i = 0; i < fVar.f2745fG.length; i++) {
            m7383a(i, fVar, aVarArr, (Set<Integer>) new HashSet(0));
        }
        C2556d qo = C2555c.m7399qo();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < fVar.f2748fJ.length; i2++) {
            arrayList.add(m7384a(fVar.f2748fJ[i2], fVar, aVarArr, i2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < fVar.f2749fK.length; i3++) {
            arrayList2.add(m7384a(fVar.f2749fK[i3], fVar, aVarArr, i3));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < fVar.f2747fI.length; i4++) {
            C2553a a = m7384a(fVar.f2747fI[i4], fVar, aVarArr, i4);
            qo.mo18760a(a);
            arrayList3.add(a);
        }
        for (C1351c.C1358g a2 : fVar.f2750fL) {
            qo.mo18761a(m7385a(a2, arrayList, arrayList3, arrayList2, fVar));
        }
        qo.mo18762cO(fVar.version);
        qo.mo18763fO(fVar.f2758fT);
        return qo.mo18764qr();
    }

    /* renamed from: b */
    public static void m7388b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: cN */
    private static void m7389cN(String str) throws C2559g {
        C2504bh.m7243T(str);
        throw new C2559g(str);
    }

    /* renamed from: g */
    public static C1408d.C1409a m7390g(C1408d.C1409a aVar) {
        C1408d.C1409a aVar2 = new C1408d.C1409a();
        aVar2.type = aVar.type;
        aVar2.f2857gE = (int[]) aVar.f2857gE.clone();
        if (aVar.f2858gF) {
            aVar2.f2858gF = aVar.f2858gF;
        }
        return aVar2;
    }

    /* renamed from: h */
    private static C1351c.C1359h m7391h(C1408d.C1409a aVar) throws C2559g {
        if (((C1351c.C1359h) aVar.mo17071a(C1351c.C1359h.f2770gf)) == null) {
            m7389cN("Expected a ServingValue and didn't get one. Value is: " + aVar);
        }
        return (C1351c.C1359h) aVar.mo17071a(C1351c.C1359h.f2770gf);
    }
}
