package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1334bq;

@C1507ey
/* renamed from: com.google.android.gms.internal.bo */
public final class C1332bo extends C1334bq.C1335a {

    /* renamed from: px */
    private final C2192w f2698px;

    /* renamed from: py */
    private final String f2699py;

    /* renamed from: pz */
    private final String f2700pz;

    public C1332bo(C2192w wVar, String str, String str2) {
        this.f2698px = wVar;
        this.f2699py = str;
        this.f2700pz = str2;
    }

    /* renamed from: a */
    public void mo14936a(C0967d dVar) {
        if (dVar != null) {
            this.f2698px.mo17138b((View) C0970e.m1612f(dVar));
        }
    }

    /* renamed from: av */
    public void mo14937av() {
        this.f2698px.mo17136av();
    }

    /* renamed from: aw */
    public void mo14938aw() {
        this.f2698px.mo17137aw();
    }

    /* renamed from: bA */
    public String mo14939bA() {
        return this.f2700pz;
    }

    /* renamed from: bz */
    public String mo14940bz() {
        return this.f2699py;
    }
}
