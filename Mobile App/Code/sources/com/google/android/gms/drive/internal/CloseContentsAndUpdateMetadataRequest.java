package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CloseContentsAndUpdateMetadataRequest implements SafeParcelable {
    public static final Parcelable.Creator<CloseContentsAndUpdateMetadataRequest> CREATOR = new C0797f();

    /* renamed from: CK */
    final int f923CK;

    /* renamed from: Oy */
    final String f924Oy;

    /* renamed from: Oz */
    final boolean f925Oz;

    /* renamed from: Pp */
    final DriveId f926Pp;

    /* renamed from: Pq */
    final MetadataBundle f927Pq;

    /* renamed from: Pr */
    final Contents f928Pr;

    /* renamed from: Ps */
    final int f929Ps;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, boolean z, String str, int i2) {
        this.f923CK = i;
        this.f926Pp = driveId;
        this.f927Pq = metadataBundle;
        this.f928Pr = contents;
        this.f925Oz = z;
        this.f924Oy = str;
        this.f929Ps = i2;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle, Contents contents, ExecutionOptions executionOptions) {
        this(1, driveId, metadataBundle, contents, executionOptions.mo11234iw(), executionOptions.mo11233iv(), executionOptions.mo11235ix());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0797f.m1094a(this, parcel, i);
    }
}
