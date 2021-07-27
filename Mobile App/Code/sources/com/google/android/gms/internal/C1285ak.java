package com.google.android.gms.internal;

import android.support.p003v7.widget.helper.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Iterator;

@C1507ey
/* renamed from: com.google.android.gms.internal.ak */
public class C1285ak {

    /* renamed from: mH */
    private final Object f2335mH = new Object();

    /* renamed from: np */
    private final int f2336np;

    /* renamed from: nq */
    private final int f2337nq;

    /* renamed from: nr */
    private final int f2338nr;

    /* renamed from: ns */
    private final C1294ap f2339ns;

    /* renamed from: nt */
    private ArrayList<String> f2340nt = new ArrayList<>();

    /* renamed from: nu */
    private int f2341nu = 0;

    /* renamed from: nv */
    private int f2342nv = 0;

    /* renamed from: nw */
    private int f2343nw = 0;

    /* renamed from: nx */
    private int f2344nx;

    /* renamed from: ny */
    private String f2345ny = "";

    public C1285ak(int i, int i2, int i3, int i4) {
        this.f2336np = i;
        this.f2337nq = i2;
        this.f2338nr = i3;
        this.f2339ns = new C1294ap(i4);
    }

    /* renamed from: a */
    private String m3891a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append(' ');
            if (stringBuffer.length() > i) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() < i ? stringBuffer2 : stringBuffer2.substring(0, i);
    }

    /* renamed from: j */
    private void m3892j(String str) {
        if (str != null && str.length() >= this.f2338nr) {
            synchronized (this.f2335mH) {
                this.f2340nt.add(str);
                this.f2341nu += str.length();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo14754a(int i, int i2) {
        return (i * this.f2336np) + (i2 * this.f2337nq);
    }

    /* renamed from: aS */
    public boolean mo14755aS() {
        boolean z;
        synchronized (this.f2335mH) {
            z = this.f2343nw == 0;
        }
        return z;
    }

    /* renamed from: aT */
    public String mo14756aT() {
        return this.f2345ny;
    }

    /* renamed from: aU */
    public void mo14757aU() {
        synchronized (this.f2335mH) {
            this.f2344nx -= 100;
        }
    }

    /* renamed from: aV */
    public void mo14758aV() {
        synchronized (this.f2335mH) {
            this.f2343nw--;
        }
    }

    /* renamed from: aW */
    public void mo14759aW() {
        synchronized (this.f2335mH) {
            this.f2343nw++;
        }
    }

    /* renamed from: aX */
    public void mo14760aX() {
        synchronized (this.f2335mH) {
            int a = mo14754a(this.f2341nu, this.f2342nv);
            if (a > this.f2344nx) {
                this.f2344nx = a;
                this.f2345ny = this.f2339ns.mo14798a(this.f2340nt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aY */
    public int mo14761aY() {
        return this.f2341nu;
    }

    /* renamed from: c */
    public void mo14762c(int i) {
        this.f2342nv = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1285ak)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1285ak akVar = (C1285ak) obj;
        return akVar.mo14756aT() != null && akVar.mo14756aT().equals(mo14756aT());
    }

    public int getScore() {
        return this.f2344nx;
    }

    /* renamed from: h */
    public void mo14765h(String str) {
        m3892j(str);
        synchronized (this.f2335mH) {
            if (this.f2343nw < 0) {
                C1607gr.m4705S("ActivityContent: negative number of WebViews.");
            }
            mo14760aX();
        }
    }

    public int hashCode() {
        return mo14756aT().hashCode();
    }

    /* renamed from: i */
    public void mo14767i(String str) {
        m3892j(str);
    }

    public String toString() {
        return "ActivityContent fetchId: " + this.f2342nv + " score:" + this.f2344nx + " total_length:" + this.f2341nu + "\n text: " + m3891a(this.f2340nt, (int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION) + "\n signture: " + this.f2345ny;
    }
}
