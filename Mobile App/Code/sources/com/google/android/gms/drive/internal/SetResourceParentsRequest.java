package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class SetResourceParentsRequest implements SafeParcelable {
    public static final Parcelable.Creator<SetResourceParentsRequest> CREATOR = new C0790bf();

    /* renamed from: CK */
    final int f1018CK;

    /* renamed from: QW */
    final DriveId f1019QW;

    /* renamed from: QX */
    final List<DriveId> f1020QX;

    SetResourceParentsRequest(int i, DriveId driveId, List<DriveId> list) {
        this.f1018CK = i;
        this.f1019QW = driveId;
        this.f1020QX = list;
    }

    public SetResourceParentsRequest(DriveId driveId, List<DriveId> list) {
        this(1, driveId, list);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0790bf.m1065a(this, parcel, i);
    }
}
