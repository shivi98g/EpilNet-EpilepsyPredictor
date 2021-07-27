package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnMetadataResponse> CREATOR = new C0777at();

    /* renamed from: CK */
    final int f993CK;

    /* renamed from: Px */
    final MetadataBundle f994Px;

    OnMetadataResponse(int i, MetadataBundle metadataBundle) {
        this.f993CK = i;
        this.f994Px = metadataBundle;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: iU */
    public MetadataBundle mo11435iU() {
        return this.f994Px;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0777at.m1026a(this, parcel, i);
    }
}
