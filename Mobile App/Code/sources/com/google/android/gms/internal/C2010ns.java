package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.ns */
public final class C2010ns implements SafeParcelable {
    public static final C2011nt CREATOR = new C2011nt();

    /* renamed from: CK */
    private final int f4149CK;
    private final int agd;
    private final int ahp;
    private final C2012nu ahq;

    C2010ns(int i, int i2, int i3, C2012nu nuVar) {
        this.f4149CK = i;
        this.agd = i2;
        this.ahp = i3;
        this.ahq = nuVar;
    }

    public int describeContents() {
        C2011nt ntVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2010ns)) {
            return false;
        }
        C2010ns nsVar = (C2010ns) obj;
        return this.agd == nsVar.agd && this.ahp == nsVar.ahp && this.ahq.equals(nsVar.ahq);
    }

    public int getVersionCode() {
        return this.f4149CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.agd), Integer.valueOf(this.ahp));
    }

    /* renamed from: np */
    public int mo16389np() {
        return this.agd;
    }

    /* renamed from: ns */
    public int mo16390ns() {
        return this.ahp;
    }

    /* renamed from: nt */
    public C2012nu mo16391nt() {
        return this.ahq;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("transitionTypes", Integer.valueOf(this.agd)).mo15935a("loiteringTimeMillis", Integer.valueOf(this.ahp)).mo15935a("placeFilter", this.ahq).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2011nt ntVar = CREATOR;
        C2011nt.m5974a(this, parcel, i);
    }
}
