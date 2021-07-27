package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DrivePreferences implements SafeParcelable {
    public static final Parcelable.Creator<DrivePreferences> CREATOR = new C0734d();

    /* renamed from: CK */
    final int f854CK;

    /* renamed from: Ox */
    final boolean f855Ox;

    DrivePreferences(int i, boolean z) {
        this.f854CK = i;
        this.f855Ox = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0734d.m819a(this, parcel, i);
    }
}
