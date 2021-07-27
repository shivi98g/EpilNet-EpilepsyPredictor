package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.nl */
public class C2003nl implements SafeParcelable {
    public static final C2004nm CREATOR = new C2004nm();
    static final List<C1971nd> ahg = Collections.emptyList();

    /* renamed from: CK */
    private final int f4144CK;

    /* renamed from: We */
    LocationRequest f4145We;
    boolean ahh;
    boolean ahi;
    boolean ahj;
    List<C1971nd> ahk;
    final String mTag;

    C2003nl(int i, LocationRequest locationRequest, boolean z, boolean z2, boolean z3, List<C1971nd> list, String str) {
        this.f4144CK = i;
        this.f4145We = locationRequest;
        this.ahh = z;
        this.ahi = z2;
        this.ahj = z3;
        this.ahk = list;
        this.mTag = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2003nl)) {
            return false;
        }
        C2003nl nlVar = (C2003nl) obj;
        return C1781jv.equal(this.f4145We, nlVar.f4145We) && this.ahh == nlVar.ahh && this.ahi == nlVar.ahi && this.ahj == nlVar.ahj && C1781jv.equal(this.ahk, nlVar.ahk);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4144CK;
    }

    public int hashCode() {
        return this.f4145We.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4145We.toString());
        sb.append(" requestNlpDebugInfo=");
        sb.append(this.ahh);
        sb.append(" restorePendingIntentListeners=");
        sb.append(this.ahi);
        sb.append(" triggerUpdate=");
        sb.append(this.ahj);
        sb.append(" clients=");
        sb.append(this.ahk);
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2004nm.m5949a(this, parcel, i);
    }
}
