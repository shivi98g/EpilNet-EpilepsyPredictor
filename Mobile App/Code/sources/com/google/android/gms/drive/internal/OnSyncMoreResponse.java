package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnSyncMoreResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnSyncMoreResponse> CREATOR = new C0781ax();

    /* renamed from: CK */
    final int f999CK;

    /* renamed from: PJ */
    final boolean f1000PJ;

    OnSyncMoreResponse(int i, boolean z) {
        this.f999CK = i;
        this.f1000PJ = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0781ax.m1038a(this, parcel, i);
    }
}
