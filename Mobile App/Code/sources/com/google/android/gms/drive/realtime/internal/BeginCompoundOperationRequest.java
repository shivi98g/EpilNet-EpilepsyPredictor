package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class BeginCompoundOperationRequest implements SafeParcelable {
    public static final Parcelable.Creator<BeginCompoundOperationRequest> CREATOR = new C0901a();

    /* renamed from: CK */
    final int f1212CK;

    /* renamed from: SF */
    final boolean f1213SF;

    /* renamed from: SG */
    final boolean f1214SG;
    final String mName;

    BeginCompoundOperationRequest(int i, boolean z, String str, boolean z2) {
        this.f1212CK = i;
        this.f1213SF = z;
        this.mName = str;
        this.f1214SG = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0901a.m1394a(this, parcel, i);
    }
}
