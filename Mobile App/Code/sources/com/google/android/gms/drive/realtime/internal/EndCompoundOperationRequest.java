package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class EndCompoundOperationRequest implements SafeParcelable {
    public static final Parcelable.Creator<EndCompoundOperationRequest> CREATOR = new C0902b();

    /* renamed from: CK */
    final int f1215CK;

    public EndCompoundOperationRequest() {
        this(1);
    }

    EndCompoundOperationRequest(int i) {
        this.f1215CK = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0902b.m1397a(this, parcel, i);
    }
}
