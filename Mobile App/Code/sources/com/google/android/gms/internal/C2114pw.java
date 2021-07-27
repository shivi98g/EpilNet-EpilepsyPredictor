package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.pw */
public final class C2114pw implements SafeParcelable {
    public static final Parcelable.Creator<C2114pw> CREATOR = new C2115px();

    /* renamed from: CK */
    private final int f4210CK;
    int[] avX;

    C2114pw() {
        this(1, (int[]) null);
    }

    C2114pw(int i, int[] iArr) {
        this.f4210CK = i;
        this.avX = iArr;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4210CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2115px.m6214a(this, parcel, i);
    }
}
