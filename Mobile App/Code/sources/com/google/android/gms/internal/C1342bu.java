package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1343bv;
import com.google.android.gms.internal.C1347bx;

@C1507ey
/* renamed from: com.google.android.gms.internal.bu */
public class C1342bu extends C1347bx.C1348a implements C1343bv.C1344a {

    /* renamed from: mH */
    private final Object f2715mH = new Object();

    /* renamed from: pB */
    private final String f2716pB;

    /* renamed from: pC */
    private final Drawable f2717pC;

    /* renamed from: pD */
    private final String f2718pD;

    /* renamed from: pF */
    private final String f2719pF;

    /* renamed from: pJ */
    private C1343bv f2720pJ;

    /* renamed from: pK */
    private final Drawable f2721pK;

    /* renamed from: pL */
    private final String f2722pL;

    public C1342bu(String str, Drawable drawable, String str2, Drawable drawable2, String str3, String str4) {
        this.f2716pB = str;
        this.f2717pC = drawable;
        this.f2718pD = str2;
        this.f2721pK = drawable2;
        this.f2719pF = str3;
        this.f2722pL = str4;
    }

    /* renamed from: a */
    public void mo14948a(C1343bv bvVar) {
        synchronized (this.f2715mH) {
            this.f2720pJ = bvVar;
        }
    }

    /* renamed from: aw */
    public void mo14959aw() {
        synchronized (this.f2715mH) {
            if (this.f2720pJ == null) {
                C1607gr.m4706T("Attempt to record impression before content ad initialized.");
            } else {
                this.f2720pJ.mo14967aw();
            }
        }
    }

    /* renamed from: bB */
    public String mo14960bB() {
        return this.f2716pB;
    }

    /* renamed from: bC */
    public C0967d mo14961bC() {
        return C0970e.m1613k(this.f2717pC);
    }

    /* renamed from: bE */
    public String mo14962bE() {
        return this.f2719pF;
    }

    /* renamed from: bI */
    public C0967d mo14963bI() {
        return C0970e.m1613k(this.f2721pK);
    }

    /* renamed from: bJ */
    public String mo14964bJ() {
        return this.f2722pL;
    }

    public String getBody() {
        return this.f2718pD;
    }

    /* renamed from: j */
    public void mo14966j(int i) {
        synchronized (this.f2715mH) {
            if (this.f2720pJ == null) {
                C1607gr.m4706T("Attempt to perform click before content ad initialized.");
            } else {
                this.f2720pJ.mo14968b("1", i);
            }
        }
    }
}
