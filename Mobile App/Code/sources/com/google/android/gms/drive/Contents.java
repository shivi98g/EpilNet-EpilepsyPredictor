package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Contents implements SafeParcelable {
    public static final Parcelable.Creator<Contents> CREATOR = new C0731a();

    /* renamed from: CK */
    final int f833CK;

    /* renamed from: LG */
    final ParcelFileDescriptor f834LG;

    /* renamed from: Oi */
    final int f835Oi;

    /* renamed from: Oj */
    final DriveId f836Oj;

    /* renamed from: Ok */
    final boolean f837Ok;

    /* renamed from: ve */
    final int f838ve;

    Contents(int i, ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, DriveId driveId, boolean z) {
        this.f833CK = i;
        this.f834LG = parcelFileDescriptor;
        this.f838ve = i2;
        this.f835Oi = i3;
        this.f836Oj = driveId;
        this.f837Ok = z;
    }

    public int describeContents() {
        return 0;
    }

    public DriveId getDriveId() {
        return this.f836Oj;
    }

    public InputStream getInputStream() {
        return new FileInputStream(this.f834LG.getFileDescriptor());
    }

    public int getMode() {
        return this.f835Oi;
    }

    public OutputStream getOutputStream() {
        return new FileOutputStream(this.f834LG.getFileDescriptor());
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.f834LG;
    }

    public int getRequestId() {
        return this.f838ve;
    }

    /* renamed from: ip */
    public boolean mo11161ip() {
        return this.f837Ok;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0731a.m813a(this, parcel, i);
    }
}
