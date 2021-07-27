package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wallet.wobs.l */
public final class C2687l implements SafeParcelable {
    public static final Parcelable.Creator<C2687l> CREATOR = new C2688m();

    /* renamed from: CK */
    private final int f4518CK;
    long awU;
    long awV;

    C2687l() {
        this.f4518CK = 1;
    }

    C2687l(int i, long j, long j2) {
        this.f4518CK = i;
        this.awU = j;
        this.awV = j2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4518CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2688m.m7868a(this, parcel, i);
    }
}
