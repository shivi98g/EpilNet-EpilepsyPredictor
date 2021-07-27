package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.maps.model.internal.c */
public final class C2355c implements SafeParcelable {
    public static final C2356d CREATOR = new C2356d();

    /* renamed from: CK */
    private final int f4354CK;
    private Bundle amK;
    private int type;

    C2355c(int i, int i2, Bundle bundle) {
        this.f4354CK = i;
        this.type = i2;
        this.amK = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return this.type;
    }

    public int getVersionCode() {
        return this.f4354CK;
    }

    /* renamed from: oi */
    public Bundle mo18160oi() {
        return this.amK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2356d.m6849a(this, parcel, i);
    }
}
