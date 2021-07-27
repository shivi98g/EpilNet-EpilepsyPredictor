package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class UserMetadata implements SafeParcelable {
    public static final Parcelable.Creator<UserMetadata> CREATOR = new C0745h();

    /* renamed from: CK */
    final int f883CK;

    /* renamed from: OR */
    final String f884OR;

    /* renamed from: OS */
    final String f885OS;

    /* renamed from: OT */
    final String f886OT;

    /* renamed from: OU */
    final boolean f887OU;

    /* renamed from: OV */
    final String f888OV;

    UserMetadata(int i, String str, String str2, String str3, boolean z, String str4) {
        this.f883CK = i;
        this.f884OR = str;
        this.f885OS = str2;
        this.f886OT = str3;
        this.f887OU = z;
        this.f888OV = str4;
    }

    public UserMetadata(String str, String str2, String str3, boolean z, String str4) {
        this(1, str, str2, str3, z, str4);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[]{this.f884OR, this.f885OS, this.f886OT, Boolean.valueOf(this.f887OU), this.f888OV});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0745h.m849a(this, parcel, i);
    }
}
