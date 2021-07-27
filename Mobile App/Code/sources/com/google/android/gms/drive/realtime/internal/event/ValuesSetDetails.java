package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesSetDetails implements SafeParcelable {
    public static final Parcelable.Creator<ValuesSetDetails> CREATOR = new C0921j();

    /* renamed from: CK */
    final int f1274CK;

    /* renamed from: SO */
    final int f1275SO;

    /* renamed from: SP */
    final int f1276SP;
    final int mIndex;

    ValuesSetDetails(int i, int i2, int i3, int i4) {
        this.f1274CK = i;
        this.mIndex = i2;
        this.f1275SO = i3;
        this.f1276SP = i4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0921j.m1442a(this, parcel, i);
    }
}
