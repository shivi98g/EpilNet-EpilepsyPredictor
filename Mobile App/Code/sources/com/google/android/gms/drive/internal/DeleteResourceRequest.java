package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class DeleteResourceRequest implements SafeParcelable {
    public static final Parcelable.Creator<DeleteResourceRequest> CREATOR = new C0805n();

    /* renamed from: CK */
    final int f953CK;

    /* renamed from: Pp */
    final DriveId f954Pp;

    DeleteResourceRequest(int i, DriveId driveId) {
        this.f953CK = i;
        this.f954Pp = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0805n.m1118a(this, parcel, i);
    }
}
