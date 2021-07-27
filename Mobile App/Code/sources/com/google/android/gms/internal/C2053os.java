package com.google.android.gms.internal;

import com.google.android.gms.internal.C2173ra;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.os */
public class C2053os {
    private final ArrayList<C2055a> amZ;
    private int ana;

    /* renamed from: com.google.android.gms.internal.os$a */
    public static class C2055a {
        public final C2058ov anb;
        public final C2052or anc;
        public final C2173ra.C2176c and;

        private C2055a(C2058ov ovVar, C2052or orVar) {
            this.anb = (C2058ov) C1785jx.m5364i(ovVar);
            this.anc = (C2052or) C1785jx.m5364i(orVar);
            this.and = null;
        }
    }

    public C2053os() {
        this(100);
    }

    public C2053os(int i) {
        this.amZ = new ArrayList<>();
        this.ana = i;
    }

    /* renamed from: oq */
    private void m6060oq() {
        while (getSize() > getCapacity()) {
            this.amZ.remove(0);
        }
    }

    /* renamed from: a */
    public void mo16511a(C2058ov ovVar, C2052or orVar) {
        this.amZ.add(new C2055a(ovVar, orVar));
        m6060oq();
    }

    public void clear() {
        this.amZ.clear();
    }

    public int getCapacity() {
        return this.ana;
    }

    public int getSize() {
        return this.amZ.size();
    }

    public boolean isEmpty() {
        return this.amZ.isEmpty();
    }

    /* renamed from: op */
    public ArrayList<C2055a> mo16516op() {
        return this.amZ;
    }
}
