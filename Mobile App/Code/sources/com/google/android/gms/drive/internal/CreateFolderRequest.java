package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C1785jx;

public class CreateFolderRequest implements SafeParcelable {
    public static final Parcelable.Creator<CreateFolderRequest> CREATOR = new C0803l();

    /* renamed from: CK */
    final int f950CK;

    /* renamed from: Px */
    final MetadataBundle f951Px;

    /* renamed from: Pz */
    final DriveId f952Pz;

    CreateFolderRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.f950CK = i;
        this.f952Pz = (DriveId) C1785jx.m5364i(driveId);
        this.f951Px = (MetadataBundle) C1785jx.m5364i(metadataBundle);
    }

    public CreateFolderRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this(1, driveId, metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0803l.m1113a(this, parcel, i);
    }
}
