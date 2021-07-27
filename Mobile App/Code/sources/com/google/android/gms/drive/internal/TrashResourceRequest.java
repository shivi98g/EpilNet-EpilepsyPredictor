package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class TrashResourceRequest implements SafeParcelable {
    public static final Parcelable.Creator<TrashResourceRequest> CREATOR = new C0792bh();

    /* renamed from: CK */
    final int f1021CK;

    /* renamed from: Pp */
    final DriveId f1022Pp;

    TrashResourceRequest(int i, DriveId driveId) {
        this.f1021CK = i;
        this.f1022Pp = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0792bh.m1069a(this, parcel, i);
    }
}
