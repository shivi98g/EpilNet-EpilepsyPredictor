package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AddEventListenerRequest implements SafeParcelable {
    public static final Parcelable.Creator<AddEventListenerRequest> CREATOR = new C0747a();

    /* renamed from: CK */
    final int f913CK;

    /* renamed from: Oj */
    final DriveId f914Oj;

    /* renamed from: Pm */
    final int f915Pm;

    AddEventListenerRequest(int i, DriveId driveId, int i2) {
        this.f913CK = i;
        this.f914Oj = driveId;
        this.f915Pm = i2;
    }

    public AddEventListenerRequest(DriveId driveId, int i) {
        this(1, driveId, i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0747a.m870a(this, parcel, i);
    }
}
