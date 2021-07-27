package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.maps.model.internal.a */
public final class C2353a implements SafeParcelable {
    public static final C2354b CREATOR = new C2354b();

    /* renamed from: CK */
    private final int f4353CK;
    private byte amJ;
    private Bundle amK;
    private Bitmap amL;

    C2353a(int i, byte b, Bundle bundle, Bitmap bitmap) {
        this.f4353CK = i;
        this.amJ = b;
        this.amK = bundle;
        this.amL = bitmap;
    }

    public int describeContents() {
        return 0;
    }

    public Bitmap getBitmap() {
        return this.amL;
    }

    public int getVersionCode() {
        return this.f4353CK;
    }

    /* renamed from: oh */
    public byte mo18150oh() {
        return this.amJ;
    }

    /* renamed from: oi */
    public Bundle mo18151oi() {
        return this.amK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2354b.m6845a(this, parcel, i);
    }
}
