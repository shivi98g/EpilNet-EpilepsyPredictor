package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest implements SafeParcelable {
    public static final Parcelable.Creator<CreateFileIntentSenderRequest> CREATOR = new C0801j();

    /* renamed from: CK */
    final int f935CK;

    /* renamed from: OH */
    final String f936OH;

    /* renamed from: OJ */
    final DriveId f937OJ;

    /* renamed from: Px */
    final MetadataBundle f938Px;

    /* renamed from: Py */
    final Integer f939Py;

    /* renamed from: ve */
    final int f940ve;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadataBundle, int i2, String str, DriveId driveId, Integer num) {
        this.f935CK = i;
        this.f938Px = metadataBundle;
        this.f940ve = i2;
        this.f936OH = str;
        this.f937OJ = driveId;
        this.f939Py = num;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadataBundle, int i, String str, DriveId driveId, int i2) {
        this(1, metadataBundle, i, str, driveId, Integer.valueOf(i2));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0801j.m1107a(this, parcel, i);
    }
}
