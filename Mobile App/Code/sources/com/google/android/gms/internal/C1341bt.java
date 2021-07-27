package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1343bv;
import com.google.android.gms.internal.C1345bw;

@C1507ey
/* renamed from: com.google.android.gms.internal.bt */
public class C1341bt extends C1345bw.C1346a implements C1343bv.C1344a {

    /* renamed from: mH */
    private final Object f2705mH = new Object();

    /* renamed from: pB */
    private final String f2706pB;

    /* renamed from: pC */
    private final Drawable f2707pC;

    /* renamed from: pD */
    private final String f2708pD;

    /* renamed from: pE */
    private final Drawable f2709pE;

    /* renamed from: pF */
    private final String f2710pF;

    /* renamed from: pG */
    private final double f2711pG;

    /* renamed from: pH */
    private final String f2712pH;

    /* renamed from: pI */
    private final String f2713pI;

    /* renamed from: pJ */
    private C1343bv f2714pJ;

    public C1341bt(String str, Drawable drawable, String str2, Drawable drawable2, String str3, double d, String str4, String str5) {
        this.f2706pB = str;
        this.f2707pC = drawable;
        this.f2708pD = str2;
        this.f2709pE = drawable2;
        this.f2710pF = str3;
        this.f2711pG = d;
        this.f2712pH = str4;
        this.f2713pI = str5;
    }

    /* renamed from: a */
    public void mo14948a(C1343bv bvVar) {
        synchronized (this.f2705mH) {
            this.f2714pJ = bvVar;
        }
    }

    /* renamed from: aw */
    public void mo14949aw() {
        synchronized (this.f2705mH) {
            if (this.f2714pJ == null) {
                C1607gr.m4706T("Attempt to record impression before app install ad initialized.");
            } else {
                this.f2714pJ.mo14967aw();
            }
        }
    }

    /* renamed from: bB */
    public String mo14950bB() {
        return this.f2706pB;
    }

    /* renamed from: bC */
    public C0967d mo14951bC() {
        return C0970e.m1613k(this.f2707pC);
    }

    /* renamed from: bD */
    public C0967d mo14952bD() {
        return C0970e.m1613k(this.f2709pE);
    }

    /* renamed from: bE */
    public String mo14953bE() {
        return this.f2710pF;
    }

    /* renamed from: bF */
    public double mo14954bF() {
        return this.f2711pG;
    }

    /* renamed from: bG */
    public String mo14955bG() {
        return this.f2712pH;
    }

    /* renamed from: bH */
    public String mo14956bH() {
        return this.f2713pI;
    }

    public String getBody() {
        return this.f2708pD;
    }

    /* renamed from: j */
    public void mo14958j(int i) {
        synchronized (this.f2705mH) {
            if (this.f2714pJ == null) {
                C1607gr.m4706T("Attempt to perform click before app install ad initialized.");
            } else {
                this.f2714pJ.mo14968b("2", i);
            }
        }
    }
}
