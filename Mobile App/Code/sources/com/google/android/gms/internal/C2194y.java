package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C1507ey
/* renamed from: com.google.android.gms.internal.y */
public final class C2194y implements SafeParcelable {
    public static final C2195z CREATOR = new C2195z();

    /* renamed from: mi */
    public final boolean f4274mi;

    /* renamed from: ms */
    public final boolean f4275ms;
    public final int versionCode;

    C2194y(int i, boolean z, boolean z2) {
        this.versionCode = i;
        this.f4274mi = z;
        this.f4275ms = z2;
    }

    public C2194y(boolean z, boolean z2) {
        this.versionCode = 1;
        this.f4274mi = z;
        this.f4275ms = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2195z.m6602a(this, parcel, i);
    }
}
