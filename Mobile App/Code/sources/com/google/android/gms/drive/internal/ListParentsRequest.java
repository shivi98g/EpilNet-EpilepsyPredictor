package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ListParentsRequest implements SafeParcelable {
    public static final Parcelable.Creator<ListParentsRequest> CREATOR = new C0766ai();

    /* renamed from: CK */
    final int f965CK;

    /* renamed from: QE */
    final DriveId f966QE;

    ListParentsRequest(int i, DriveId driveId) {
        this.f965CK = i;
        this.f966QE = driveId;
    }

    public ListParentsRequest(DriveId driveId) {
        this(1, driveId);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0766ai.m990a(this, parcel, i);
    }
}
