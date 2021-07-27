package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

public final class ChangeEvent implements SafeParcelable, ResourceEvent {
    public static final Parcelable.Creator<ChangeEvent> CREATOR = new C0739a();

    /* renamed from: CK */
    final int f889CK;

    /* renamed from: OX */
    final int f890OX;

    /* renamed from: Oj */
    final DriveId f891Oj;

    ChangeEvent(int i, DriveId driveId, int i2) {
        this.f889CK = i;
        this.f891Oj = driveId;
        this.f890OX = i2;
    }

    public int describeContents() {
        return 0;
    }

    public DriveId getDriveId() {
        return this.f891Oj;
    }

    public int getType() {
        return 1;
    }

    public boolean hasContentChanged() {
        return (this.f890OX & 2) != 0;
    }

    public boolean hasMetadataChanged() {
        return (this.f890OX & 1) != 0;
    }

    public String toString() {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[]{this.f891Oj, Integer.valueOf(this.f890OX)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0739a.m835a(this, parcel, i);
    }
}
