package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnDriveIdResponse> CREATOR = new C0772ao();

    /* renamed from: CK */
    final int f978CK;

    /* renamed from: Pp */
    DriveId f979Pp;

    OnDriveIdResponse(int i, DriveId driveId) {
        this.f978CK = i;
        this.f979Pp = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public DriveId getDriveId() {
        return this.f979Pp;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0772ao.m1011a(this, parcel, i);
    }
}
