package com.google.android.gms.internal;

import java.util.LinkedList;
import java.util.List;

@C1507ey
/* renamed from: com.google.android.gms.internal.al */
public class C1286al {

    /* renamed from: mH */
    private final Object f2346mH = new Object();

    /* renamed from: nA */
    private List<C1285ak> f2347nA = new LinkedList();

    /* renamed from: nz */
    private int f2348nz;

    /* renamed from: a */
    public boolean mo14769a(C1285ak akVar) {
        synchronized (this.f2346mH) {
            return this.f2347nA.contains(akVar);
        }
    }

    /* renamed from: aZ */
    public C1285ak mo14770aZ() {
        synchronized (this.f2346mH) {
            C1285ak akVar = null;
            if (this.f2347nA.size() == 0) {
                C1607gr.m4705S("Queue empty");
                return null;
            } else if (this.f2347nA.size() >= 2) {
                int i = Integer.MIN_VALUE;
                for (C1285ak next : this.f2347nA) {
                    int score = next.getScore();
                    if (score > i) {
                        akVar = next;
                        i = score;
                    }
                }
                this.f2347nA.remove(akVar);
                return akVar;
            } else {
                C1285ak akVar2 = this.f2347nA.get(0);
                akVar2.mo14757aU();
                return akVar2;
            }
        }
    }

    /* renamed from: b */
    public boolean mo14771b(C1285ak akVar) {
        synchronized (this.f2346mH) {
            for (C1285ak next : this.f2347nA) {
                if (akVar != next && next.mo14756aT().equals(akVar.mo14756aT())) {
                    this.f2347nA.remove(akVar);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public void mo14772c(C1285ak akVar) {
        synchronized (this.f2346mH) {
            if (this.f2347nA.size() >= 10) {
                C1607gr.m4705S("Queue is full, current size = " + this.f2347nA.size());
                this.f2347nA.remove(0);
            }
            int i = this.f2348nz;
            this.f2348nz = i + 1;
            akVar.mo14762c(i);
            this.f2347nA.add(akVar);
        }
    }
}
