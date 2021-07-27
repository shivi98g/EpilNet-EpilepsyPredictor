package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest implements SafeParcelable {
    public static final Parcelable.Creator<OpenContentsRequest> CREATOR = new C0782ay();

    /* renamed from: CK */
    final int f1001CK;

    /* renamed from: Oi */
    final int f1002Oi;

    /* renamed from: Pp */
    final DriveId f1003Pp;

    /* renamed from: QT */
    final int f1004QT;

    OpenContentsRequest(int i, DriveId driveId, int i2, int i3) {
        this.f1001CK = i;
        this.f1003Pp = driveId;
        this.f1002Oi = i2;
        this.f1004QT = i3;
    }

    public OpenContentsRequest(DriveId driveId, int i, int i2) {
        this(1, driveId, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0782ay.m1041a(this, parcel, i);
    }
}
