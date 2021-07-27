package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;

public class CreateContentsRequest implements SafeParcelable {
    public static final Parcelable.Creator<CreateContentsRequest> CREATOR = new C0799h();

    /* renamed from: CK */
    final int f933CK;

    /* renamed from: Oi */
    final int f934Oi;

    public CreateContentsRequest(int i) {
        this(1, i);
    }

    CreateContentsRequest(int i, int i2) {
        this.f933CK = i;
        C1785jx.m5361b(i2 == 536870912 || i2 == 805306368, (Object) "Cannot create a new read-only contents!");
        this.f934Oi = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0799h.m1100a(this, parcel, i);
    }
}
