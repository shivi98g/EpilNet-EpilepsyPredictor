package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.py */
public final class C2116py implements SafeParcelable {
    public static final Parcelable.Creator<C2116py> CREATOR = new C2117pz();

    /* renamed from: CK */
    private final int f4211CK;
    String[] avY;
    byte[][] avZ;

    C2116py() {
        this(1, new String[0], new byte[0][]);
    }

    C2116py(int i, String[] strArr, byte[][] bArr) {
        this.f4211CK = i;
        this.avY = strArr;
        this.avZ = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4211CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2117pz.m6217a(this, parcel, i);
    }
}
