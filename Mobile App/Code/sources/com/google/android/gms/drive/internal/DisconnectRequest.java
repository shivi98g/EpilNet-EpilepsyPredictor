package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DisconnectRequest implements SafeParcelable {
    public static final Parcelable.Creator<DisconnectRequest> CREATOR = new C0806o();

    /* renamed from: CK */
    final int f955CK;

    public DisconnectRequest() {
        this(1);
    }

    DisconnectRequest(int i) {
        this.f955CK = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0806o.m1121a(this, parcel, i);
    }
}
