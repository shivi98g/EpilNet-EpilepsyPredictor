package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class MatchAllFilter extends AbstractFilter {
    public static final C0898j CREATOR = new C0898j();

    /* renamed from: CK */
    final int f1199CK;

    public MatchAllFilter() {
        this(1);
    }

    MatchAllFilter(int i) {
        this.f1199CK = i;
    }

    /* renamed from: a */
    public <F> F mo11821a(C0894f<F> fVar) {
        return fVar.mo11860jd();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0898j.m1385a(this, parcel, i);
    }
}
