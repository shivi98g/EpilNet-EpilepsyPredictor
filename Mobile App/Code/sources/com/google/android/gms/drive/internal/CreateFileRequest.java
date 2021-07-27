package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C1785jx;

public class CreateFileRequest implements SafeParcelable {
    public static final Parcelable.Creator<CreateFileRequest> CREATOR = new C0802k();

    /* renamed from: CK */
    final int f941CK;

    /* renamed from: Oy */
    final String f942Oy;

    /* renamed from: PA */
    final boolean f943PA;

    /* renamed from: PB */
    final int f944PB;

    /* renamed from: PC */
    final int f945PC;

    /* renamed from: Pr */
    final Contents f946Pr;

    /* renamed from: Px */
    final MetadataBundle f947Px;

    /* renamed from: Py */
    final Integer f948Py;

    /* renamed from: Pz */
    final DriveId f949Pz;

    CreateFileRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, Integer num, boolean z, String str, int i2, int i3) {
        if (!(contents == null || i3 == 0)) {
            C1785jx.m5361b(contents.getRequestId() == i3, (Object) "inconsistent contents reference");
        }
        if ((num == null || num.intValue() == 0) && contents == null && i3 == 0) {
            throw new IllegalArgumentException("Need a valid contents");
        }
        this.f941CK = i;
        this.f949Pz = (DriveId) C1785jx.m5364i(driveId);
        this.f947Px = (MetadataBundle) C1785jx.m5364i(metadataBundle);
        this.f946Pr = contents;
        this.f948Py = num;
        this.f942Oy = str;
        this.f944PB = i2;
        this.f943PA = z;
        this.f945PC = i3;
    }

    public CreateFileRequest(DriveId driveId, MetadataBundle metadataBundle, int i, int i2, ExecutionOptions executionOptions) {
        this(2, driveId, metadataBundle, (Contents) null, Integer.valueOf(i2), executionOptions.mo11234iw(), executionOptions.mo11233iv(), executionOptions.mo11235ix(), i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0802k.m1110a(this, parcel, i);
    }
}
