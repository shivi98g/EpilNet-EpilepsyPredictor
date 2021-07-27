package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1351c;
import com.google.android.gms.internal.C1408d;
import com.google.android.gms.tagmanager.C2551cr;
import com.google.android.gms.tagmanager.C2604l;
import com.google.android.gms.tagmanager.C2623s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.ct */
class C2561ct {
    private static final C2523bz<C1408d.C1409a> atb = new C2523bz<>(C2590di.m7548rb(), true);
    private final DataLayer aqn;
    private final C2551cr.C2555c atc;
    private final C2471ag atd;
    private final Map<String, C2474aj> ate;
    private final Map<String, C2474aj> atf;
    private final Map<String, C2474aj> atg;
    private final C2603k<C2551cr.C2553a, C2523bz<C1408d.C1409a>> ath;
    private final C2603k<String, C2567b> ati;
    private final Set<C2551cr.C2557e> atj;
    private final Map<String, C2568c> atk;
    private volatile String atl;
    private int atm;

    /* renamed from: com.google.android.gms.tagmanager.ct$a */
    interface C2566a {
        /* renamed from: a */
        void mo18802a(C2551cr.C2557e eVar, Set<C2551cr.C2553a> set, Set<C2551cr.C2553a> set2, C2541cn cnVar);
    }

    /* renamed from: com.google.android.gms.tagmanager.ct$b */
    private static class C2567b {
        private C1408d.C1409a asN;
        private C2523bz<C1408d.C1409a> ats;

        public C2567b(C2523bz<C1408d.C1409a> bzVar, C1408d.C1409a aVar) {
            this.ats = bzVar;
            this.asN = aVar;
        }

        public int getSize() {
            return this.ats.getObject().mo17097rY() + (this.asN == null ? 0 : this.asN.mo17097rY());
        }

        /* renamed from: qG */
        public C2523bz<C1408d.C1409a> mo18804qG() {
            return this.ats;
        }

        /* renamed from: qm */
        public C1408d.C1409a mo18805qm() {
            return this.asN;
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.ct$c */
    private static class C2568c {
        private final Set<C2551cr.C2557e> atj = new HashSet();
        private final Map<C2551cr.C2557e, List<C2551cr.C2553a>> att = new HashMap();
        private final Map<C2551cr.C2557e, List<C2551cr.C2553a>> atu = new HashMap();
        private final Map<C2551cr.C2557e, List<String>> atv = new HashMap();
        private final Map<C2551cr.C2557e, List<String>> atw = new HashMap();
        private C2551cr.C2553a atx;

        /* renamed from: a */
        public void mo18806a(C2551cr.C2557e eVar, C2551cr.C2553a aVar) {
            List list = this.att.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.att.put(eVar, list);
            }
            list.add(aVar);
        }

        /* renamed from: a */
        public void mo18807a(C2551cr.C2557e eVar, String str) {
            List list = this.atv.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.atv.put(eVar, list);
            }
            list.add(str);
        }

        /* renamed from: b */
        public void mo18808b(C2551cr.C2557e eVar) {
            this.atj.add(eVar);
        }

        /* renamed from: b */
        public void mo18809b(C2551cr.C2557e eVar, C2551cr.C2553a aVar) {
            List list = this.atu.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.atu.put(eVar, list);
            }
            list.add(aVar);
        }

        /* renamed from: b */
        public void mo18810b(C2551cr.C2557e eVar, String str) {
            List list = this.atw.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.atw.put(eVar, list);
            }
            list.add(str);
        }

        /* renamed from: i */
        public void mo18811i(C2551cr.C2553a aVar) {
            this.atx = aVar;
        }

        /* renamed from: qH */
        public Set<C2551cr.C2557e> mo18812qH() {
            return this.atj;
        }

        /* renamed from: qI */
        public Map<C2551cr.C2557e, List<C2551cr.C2553a>> mo18813qI() {
            return this.att;
        }

        /* renamed from: qJ */
        public Map<C2551cr.C2557e, List<String>> mo18814qJ() {
            return this.atv;
        }

        /* renamed from: qK */
        public Map<C2551cr.C2557e, List<String>> mo18815qK() {
            return this.atw;
        }

        /* renamed from: qL */
        public Map<C2551cr.C2557e, List<C2551cr.C2553a>> mo18816qL() {
            return this.atu;
        }

        /* renamed from: qM */
        public C2551cr.C2553a mo18817qM() {
            return this.atx;
        }
    }

    public C2561ct(Context context, C2551cr.C2555c cVar, DataLayer dataLayer, C2623s.C2624a aVar, C2623s.C2624a aVar2, C2471ag agVar) {
        if (cVar == null) {
            throw new NullPointerException("resource cannot be null");
        }
        this.atc = cVar;
        this.atj = new HashSet(cVar.mo18757qp());
        this.aqn = dataLayer;
        this.atd = agVar;
        this.ath = new C2604l().mo18850a(1048576, new C2604l.C2606a<C2551cr.C2553a, C2523bz<C1408d.C1409a>>() {
            /* renamed from: a */
            public int sizeOf(C2551cr.C2553a aVar, C2523bz<C1408d.C1409a> bzVar) {
                return bzVar.getObject().mo17097rY();
            }
        });
        this.ati = new C2604l().mo18850a(1048576, new C2604l.C2606a<String, C2567b>() {
            /* renamed from: a */
            public int sizeOf(String str, C2567b bVar) {
                return str.length() + bVar.getSize();
            }
        });
        this.ate = new HashMap();
        mo18792b(new C2599i(context));
        mo18792b(new C2623s(aVar2));
        mo18792b(new C2633w(dataLayer));
        mo18792b(new C2591dj(context, dataLayer));
        this.atf = new HashMap();
        mo18793c(new C2621q());
        mo18793c(new C2468ad());
        mo18793c(new C2469ae());
        mo18793c(new C2476al());
        mo18793c(new C2477am());
        mo18793c(new C2499bd());
        mo18793c(new C2500be());
        mo18793c(new C2536ci());
        mo18793c(new C2583dc());
        this.atg = new HashMap();
        mo18791a(new C2494b(context));
        mo18791a(new C2524c(context));
        mo18791a(new C2595e(context));
        mo18791a(new C2596f(context));
        mo18791a(new C2597g(context));
        mo18791a(new C2598h(context));
        mo18791a(new C2607m());
        mo18791a(new C2620p(this.atc.getVersion()));
        mo18791a(new C2623s(aVar));
        mo18791a(new C2626u(dataLayer));
        mo18791a(new C2636z(context));
        mo18791a(new C2465aa());
        mo18791a(new C2467ac());
        mo18791a(new C2472ah(this));
        mo18791a(new C2478an());
        mo18791a(new C2479ao());
        mo18791a(new C2489ax(context));
        mo18791a(new C2491az());
        mo18791a(new C2498bc());
        mo18791a(new C2506bj());
        mo18791a(new C2508bl(context));
        mo18791a(new C2525ca());
        mo18791a(new C2529cc());
        mo18791a(new C2533cf());
        mo18791a(new C2535ch());
        mo18791a(new C2537cj(context));
        mo18791a(new C2569cu());
        mo18791a(new C2570cv());
        mo18791a(new C2585de());
        mo18791a(new C2592dk());
        this.atk = new HashMap();
        for (C2551cr.C2557e next : this.atj) {
            if (agVar.mo18645pH()) {
                m7436a(next.mo18772qx(), next.mo18773qy(), "add macro");
                m7436a(next.mo18767qC(), next.mo18774qz(), "remove macro");
                m7436a(next.mo18770qv(), next.mo18765qA(), "add tag");
                m7436a(next.mo18771qw(), next.mo18766qB(), "remove tag");
            }
            for (int i = 0; i < next.mo18772qx().size(); i++) {
                C2551cr.C2553a aVar3 = next.mo18772qx().get(i);
                String str = "Unknown";
                if (agVar.mo18645pH() && i < next.mo18773qy().size()) {
                    str = next.mo18773qy().get(i);
                }
                C2568c e = m7438e(this.atk, m7439h(aVar3));
                e.mo18808b(next);
                e.mo18806a(next, aVar3);
                e.mo18807a(next, str);
            }
            for (int i2 = 0; i2 < next.mo18767qC().size(); i2++) {
                C2551cr.C2553a aVar4 = next.mo18767qC().get(i2);
                String str2 = "Unknown";
                if (agVar.mo18645pH() && i2 < next.mo18774qz().size()) {
                    str2 = next.mo18774qz().get(i2);
                }
                C2568c e2 = m7438e(this.atk, m7439h(aVar4));
                e2.mo18808b(next);
                e2.mo18809b(next, aVar4);
                e2.mo18810b(next, str2);
            }
        }
        for (Map.Entry next2 : this.atc.mo18758qq().entrySet()) {
            for (C2551cr.C2553a aVar5 : (List) next2.getValue()) {
                if (!C2590di.m7537n(aVar5.mo18750ql().get(C1308b.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                    m7438e(this.atk, (String) next2.getKey()).mo18811i(aVar5);
                }
            }
        }
    }

    /* renamed from: a */
    private C2523bz<C1408d.C1409a> m7431a(C1408d.C1409a aVar, Set<String> set, C2593dl dlVar) {
        if (!aVar.f2858gF) {
            return new C2523bz<>(aVar, true);
        }
        int i = aVar.type;
        if (i != 7) {
            switch (i) {
                case 2:
                    C1408d.C1409a g = C2551cr.m7390g(aVar);
                    g.f2860gw = new C1408d.C1409a[aVar.f2860gw.length];
                    for (int i2 = 0; i2 < aVar.f2860gw.length; i2++) {
                        C2523bz<C1408d.C1409a> a = m7431a(aVar.f2860gw[i2], set, dlVar.mo18704fK(i2));
                        if (a == atb) {
                            return atb;
                        }
                        g.f2860gw[i2] = a.getObject();
                    }
                    return new C2523bz<>(g, false);
                case 3:
                    C1408d.C1409a g2 = C2551cr.m7390g(aVar);
                    if (aVar.f2861gx.length != aVar.f2862gy.length) {
                        C2504bh.m7243T("Invalid serving value: " + aVar.toString());
                        return atb;
                    }
                    g2.f2861gx = new C1408d.C1409a[aVar.f2861gx.length];
                    g2.f2862gy = new C1408d.C1409a[aVar.f2861gx.length];
                    for (int i3 = 0; i3 < aVar.f2861gx.length; i3++) {
                        C2523bz<C1408d.C1409a> a2 = m7431a(aVar.f2861gx[i3], set, dlVar.mo18705fL(i3));
                        C2523bz<C1408d.C1409a> a3 = m7431a(aVar.f2862gy[i3], set, dlVar.mo18706fM(i3));
                        if (a2 == atb || a3 == atb) {
                            return atb;
                        }
                        g2.f2861gx[i3] = a2.getObject();
                        g2.f2862gy[i3] = a3.getObject();
                    }
                    return new C2523bz<>(g2, false);
                case 4:
                    if (set.contains(aVar.f2863gz)) {
                        C2504bh.m7243T("Macro cycle detected.  Current macro reference: " + aVar.f2863gz + "." + "  Previous macro references: " + set.toString() + ".");
                        return atb;
                    }
                    set.add(aVar.f2863gz);
                    C2523bz<C1408d.C1409a> a4 = C2594dm.m7580a(m7432a(aVar.f2863gz, set, dlVar.mo18708pW()), aVar.f2857gE);
                    set.remove(aVar.f2863gz);
                    return a4;
                default:
                    C2504bh.m7243T("Unknown type: " + aVar.type);
                    return atb;
            }
        } else {
            C1408d.C1409a g3 = C2551cr.m7390g(aVar);
            g3.f2856gD = new C1408d.C1409a[aVar.f2856gD.length];
            for (int i4 = 0; i4 < aVar.f2856gD.length; i4++) {
                C2523bz<C1408d.C1409a> a5 = m7431a(aVar.f2856gD[i4], set, dlVar.mo18707fN(i4));
                if (a5 == atb) {
                    return atb;
                }
                g3.f2856gD[i4] = a5.getObject();
            }
            return new C2523bz<>(g3, false);
        }
    }

    /* renamed from: a */
    private C2523bz<C1408d.C1409a> m7432a(String str, Set<String> set, C2507bk bkVar) {
        C2551cr.C2553a aVar;
        this.atm++;
        C2567b bVar = this.ati.get(str);
        if (bVar == null || this.atd.mo18645pH()) {
            C2568c cVar = this.atk.get(str);
            if (cVar == null) {
                C2504bh.m7243T(m7440qF() + "Invalid macro: " + str);
                this.atm = this.atm - 1;
                return atb;
            }
            C2523bz<Set<C2551cr.C2553a>> a = mo18789a(str, cVar.mo18812qH(), cVar.mo18813qI(), cVar.mo18814qJ(), cVar.mo18816qL(), cVar.mo18815qK(), set, bkVar.mo18683py());
            if (a.getObject().isEmpty()) {
                aVar = cVar.mo18817qM();
            } else {
                if (a.getObject().size() > 1) {
                    C2504bh.m7246W(m7440qF() + "Multiple macros active for macroName " + str);
                }
                aVar = (C2551cr.C2553a) a.getObject().iterator().next();
            }
            if (aVar == null) {
                this.atm--;
                return atb;
            }
            C2523bz<C1408d.C1409a> a2 = m7433a(this.atg, aVar, set, bkVar.mo18682pN());
            C2523bz<C1408d.C1409a> bzVar = a2 == atb ? atb : new C2523bz<>(a2.getObject(), a.mo18711pX() && a2.mo18711pX());
            C1408d.C1409a qm = aVar.mo18751qm();
            if (bzVar.mo18711pX()) {
                this.ati.mo18667e(str, new C2567b(bzVar, qm));
            }
            m7435a(qm, set);
            this.atm--;
            return bzVar;
        }
        m7435a(bVar.mo18805qm(), set);
        this.atm--;
        return bVar.mo18804qG();
    }

    /* renamed from: a */
    private C2523bz<C1408d.C1409a> m7433a(Map<String, C2474aj> map, C2551cr.C2553a aVar, Set<String> set, C2538ck ckVar) {
        String str;
        C1408d.C1409a aVar2 = aVar.mo18750ql().get(C1308b.FUNCTION.toString());
        if (aVar2 == null) {
            str = "No function id in properties";
        } else {
            String str2 = aVar2.f2853gA;
            C2474aj ajVar = map.get(str2);
            if (ajVar == null) {
                str = str2 + " has no backing implementation.";
            } else {
                C2523bz<C1408d.C1409a> bzVar = this.ath.get(aVar);
                if (bzVar != null && !this.atd.mo18645pH()) {
                    return bzVar;
                }
                HashMap hashMap = new HashMap();
                boolean z = true;
                boolean z2 = true;
                for (Map.Entry next : aVar.mo18750ql().entrySet()) {
                    C2523bz<C1408d.C1409a> a = m7431a((C1408d.C1409a) next.getValue(), set, ckVar.mo18691cJ((String) next.getKey()).mo18693e((C1408d.C1409a) next.getValue()));
                    if (a == atb) {
                        return atb;
                    }
                    if (a.mo18711pX()) {
                        aVar.mo18749a((String) next.getKey(), a.getObject());
                    } else {
                        z2 = false;
                    }
                    hashMap.put(next.getKey(), a.getObject());
                }
                if (!ajVar.mo18646a(hashMap.keySet())) {
                    str = "Incorrect keys for function " + str2 + " required " + ajVar.mo18648pJ() + " had " + hashMap.keySet();
                } else {
                    if (!z2 || !ajVar.mo18636pe()) {
                        z = false;
                    }
                    C2523bz<C1408d.C1409a> bzVar2 = new C2523bz<>(ajVar.mo18635B(hashMap), z);
                    if (z) {
                        this.ath.mo18667e(aVar, bzVar2);
                    }
                    ckVar.mo18692d(bzVar2.getObject());
                    return bzVar2;
                }
            }
        }
        C2504bh.m7243T(str);
        return atb;
    }

    /* renamed from: a */
    private C2523bz<Set<C2551cr.C2553a>> m7434a(Set<C2551cr.C2557e> set, Set<String> set2, C2566a aVar, C2560cs csVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<C2551cr.C2557e> it = set.iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (it.hasNext()) {
                    C2551cr.C2557e next = it.next();
                    C2541cn pV = csVar.mo18703pV();
                    C2523bz<Boolean> a = mo18788a(next, set2, pV);
                    if (a.getObject().booleanValue()) {
                        aVar.mo18802a(next, hashSet, hashSet2, pV);
                    }
                    if (!z || !a.mo18711pX()) {
                        z = false;
                    }
                } else {
                    hashSet.removeAll(hashSet2);
                    csVar.mo18702b(hashSet);
                    return new C2523bz<>(hashSet, z);
                }
            }
        }
    }

    /* renamed from: a */
    private void m7435a(C1408d.C1409a aVar, Set<String> set) {
        C2523bz<C1408d.C1409a> a;
        if (aVar != null && (a = m7431a(aVar, set, (C2593dl) new C2521bx())) != atb) {
            Object o = C2590di.m7538o(a.getObject());
            if (o instanceof Map) {
                this.aqn.push((Map) o);
            } else if (o instanceof List) {
                for (Object next : (List) o) {
                    if (next instanceof Map) {
                        this.aqn.push((Map) next);
                    } else {
                        C2504bh.m7246W("pushAfterEvaluate: value not a Map");
                    }
                }
            } else {
                C2504bh.m7246W("pushAfterEvaluate: value not a Map or List");
            }
        }
    }

    /* renamed from: a */
    private static void m7436a(List<C2551cr.C2553a> list, List<String> list2, String str) {
        if (list.size() != list2.size()) {
            C2504bh.m7244U("Invalid resource: imbalance of rule names of functions for " + str + " operation. Using default rule name instead");
        }
    }

    /* renamed from: a */
    private static void m7437a(Map<String, C2474aj> map, C2474aj ajVar) {
        if (map.containsKey(ajVar.mo18647pI())) {
            throw new IllegalArgumentException("Duplicate function type name: " + ajVar.mo18647pI());
        }
        map.put(ajVar.mo18647pI(), ajVar);
    }

    /* renamed from: e */
    private static C2568c m7438e(Map<String, C2568c> map, String str) {
        C2568c cVar = map.get(str);
        if (cVar != null) {
            return cVar;
        }
        C2568c cVar2 = new C2568c();
        map.put(str, cVar2);
        return cVar2;
    }

    /* renamed from: h */
    private static String m7439h(C2551cr.C2553a aVar) {
        return C2590di.m7533j(aVar.mo18750ql().get(C1308b.INSTANCE_NAME.toString()));
    }

    /* renamed from: qF */
    private String m7440qF() {
        if (this.atm <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.atm));
        for (int i = 2; i < this.atm; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2523bz<Boolean> mo18787a(C2551cr.C2553a aVar, Set<String> set, C2538ck ckVar) {
        C2523bz<C1408d.C1409a> a = m7433a(this.atf, aVar, set, ckVar);
        Boolean n = C2590di.m7537n(a.getObject());
        ckVar.mo18692d(C2590di.m7551u(n));
        return new C2523bz<>(n, a.mo18711pX());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2523bz<Boolean> mo18788a(C2551cr.C2557e eVar, Set<String> set, C2541cn cnVar) {
        boolean z;
        Iterator<C2551cr.C2553a> it = eVar.mo18769qu().iterator();
        while (true) {
            boolean z2 = true;
            while (true) {
                if (it.hasNext()) {
                    C2523bz<Boolean> a = mo18787a(it.next(), set, cnVar.mo18695pP());
                    if (a.getObject().booleanValue()) {
                        cnVar.mo18694f(C2590di.m7551u(false));
                        return new C2523bz<>(false, a.mo18711pX());
                    } else if (!z || !a.mo18711pX()) {
                        z2 = false;
                    }
                } else {
                    for (C2551cr.C2553a a2 : eVar.mo18768qt()) {
                        C2523bz<Boolean> a3 = mo18787a(a2, set, cnVar.mo18696pQ());
                        if (!a3.getObject().booleanValue()) {
                            cnVar.mo18694f(C2590di.m7551u(false));
                            return new C2523bz<>(false, a3.mo18711pX());
                        }
                        z = z && a3.mo18711pX();
                    }
                    cnVar.mo18694f(C2590di.m7551u(true));
                    return new C2523bz<>(true, z);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2523bz<Set<C2551cr.C2553a>> mo18789a(String str, Set<C2551cr.C2557e> set, Map<C2551cr.C2557e, List<C2551cr.C2553a>> map, Map<C2551cr.C2557e, List<String>> map2, Map<C2551cr.C2557e, List<C2551cr.C2553a>> map3, Map<C2551cr.C2557e, List<String>> map4, Set<String> set2, C2560cs csVar) {
        final Map<C2551cr.C2557e, List<C2551cr.C2553a>> map5 = map;
        final Map<C2551cr.C2557e, List<String>> map6 = map2;
        final Map<C2551cr.C2557e, List<C2551cr.C2553a>> map7 = map3;
        final Map<C2551cr.C2557e, List<String>> map8 = map4;
        return m7434a(set, set2, (C2566a) new C2566a() {
            /* renamed from: a */
            public void mo18802a(C2551cr.C2557e eVar, Set<C2551cr.C2553a> set, Set<C2551cr.C2553a> set2, C2541cn cnVar) {
                List list = (List) map5.get(eVar);
                List list2 = (List) map6.get(eVar);
                if (list != null) {
                    set.addAll(list);
                    cnVar.mo18697pR().mo18701c(list, list2);
                }
                List list3 = (List) map7.get(eVar);
                List list4 = (List) map8.get(eVar);
                if (list3 != null) {
                    set2.addAll(list3);
                    cnVar.mo18698pS().mo18701c(list3, list4);
                }
            }
        }, csVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2523bz<Set<C2551cr.C2553a>> mo18790a(Set<C2551cr.C2557e> set, C2560cs csVar) {
        return m7434a(set, (Set<String>) new HashSet(), (C2566a) new C2566a() {
            /* renamed from: a */
            public void mo18802a(C2551cr.C2557e eVar, Set<C2551cr.C2553a> set, Set<C2551cr.C2553a> set2, C2541cn cnVar) {
                set.addAll(eVar.mo18770qv());
                set2.addAll(eVar.mo18771qw());
                cnVar.mo18699pT().mo18701c(eVar.mo18770qv(), eVar.mo18765qA());
                cnVar.mo18700pU().mo18701c(eVar.mo18771qw(), eVar.mo18766qB());
            }
        }, csVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18791a(C2474aj ajVar) {
        m7437a(this.atg, ajVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18792b(C2474aj ajVar) {
        m7437a(this.ate, ajVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18793c(C2474aj ajVar) {
        m7437a(this.atf, ajVar);
    }

    /* renamed from: cT */
    public C2523bz<C1408d.C1409a> mo18794cT(String str) {
        this.atm = 0;
        C2470af cC = this.atd.mo18643cC(str);
        C2523bz<C1408d.C1409a> a = m7432a(str, (Set<String>) new HashSet(), cC.mo18640pE());
        cC.mo18642pG();
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cU */
    public synchronized void mo18795cU(String str) {
        this.atl = str;
    }

    /* renamed from: cr */
    public synchronized void mo18796cr(String str) {
        mo18795cU(str);
        C2470af cD = this.atd.mo18644cD(str);
        C2625t pF = cD.mo18641pF();
        for (C2551cr.C2553a a : mo18790a(this.atj, pF.mo18690py()).getObject()) {
            m7433a(this.ate, a, (Set<String>) new HashSet(), pF.mo18689px());
        }
        cD.mo18642pG();
        mo18795cU((String) null);
    }

    /* renamed from: l */
    public synchronized void mo18797l(List<C1351c.C1360i> list) {
        for (C1351c.C1360i next : list) {
            if (next.name != null) {
                if (next.name.startsWith("gaExperiment:")) {
                    C2473ai.m7173a(this.aqn, next);
                }
            }
            C2504bh.m7245V("Ignored supplemental: " + next);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qE */
    public synchronized String mo18798qE() {
        return this.atl;
    }
}
