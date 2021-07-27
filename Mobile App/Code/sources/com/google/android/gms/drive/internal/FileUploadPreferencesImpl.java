package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

public final class FileUploadPreferencesImpl implements SafeParcelable, FileUploadPreferences {
    public static final Parcelable.Creator<FileUploadPreferencesImpl> CREATOR = new C0751ab();

    /* renamed from: CK */
    final int f956CK;

    /* renamed from: QA */
    int f957QA;

    /* renamed from: QB */
    boolean f958QB;

    /* renamed from: Qz */
    int f959Qz;

    FileUploadPreferencesImpl(int i, int i2, int i3, boolean z) {
        this.f956CK = i;
        this.f959Qz = i2;
        this.f957QA = i3;
        this.f958QB = z;
    }

    /* renamed from: by */
    public static boolean m855by(int i) {
        switch (i) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: bz */
    public static boolean m856bz(int i) {
        switch (i) {
            case 256:
            case 257:
                return true;
            default:
                return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getBatteryUsagePreference() {
        if (!m856bz(this.f957QA)) {
            return 0;
        }
        return this.f957QA;
    }

    public int getNetworkTypePreference() {
        if (!m855by(this.f959Qz)) {
            return 0;
        }
        return this.f959Qz;
    }

    public boolean isRoamingAllowed() {
        return this.f958QB;
    }

    public void setBatteryUsagePreference(int i) {
        if (!m856bz(i)) {
            throw new IllegalArgumentException("Invalid battery usage preference value.");
        }
        this.f957QA = i;
    }

    public void setNetworkTypePreference(int i) {
        if (!m855by(i)) {
            throw new IllegalArgumentException("Invalid data connection preference value.");
        }
        this.f959Qz = i;
    }

    public void setRoamingAllowed(boolean z) {
        this.f958QB = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0751ab.m877a(this, parcel, i);
    }
}
