package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest implements SafeParcelable {
    public static final Parcelable.Creator<GetMetadataRequest> CREATOR = new C0753ad();

    /* renamed from: CK */
    final int f963CK;

    /* renamed from: Pp */
    final DriveId f964Pp;

    GetMetadataRequest(int i, DriveId driveId) {
        this.f963CK = i;
        this.f964Pp = driveId;
    }

    public GetMetadataRequest(DriveId driveId) {
        this(1, driveId);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0753ad.m883a(this, parcel, i);
    }
}
