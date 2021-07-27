package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ObjectChangedDetails implements SafeParcelable {
    public static final Parcelable.Creator<ObjectChangedDetails> CREATOR = new C0912a();

    /* renamed from: CK */
    final int f1230CK;

    /* renamed from: SO */
    final int f1231SO;

    /* renamed from: SP */
    final int f1232SP;

    ObjectChangedDetails(int i, int i2, int i3) {
        this.f1230CK = i;
        this.f1231SO = i2;
        this.f1232SP = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0912a.m1415a(this, parcel, i);
    }
}
