package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.if */
public class C1688if implements SafeParcelable {
    public static final C1689ig CREATOR = new C1689ig();

    /* renamed from: Ep */
    final Bundle f3700Ep;

    /* renamed from: Eq */
    final byte[] f3701Eq;
    final int responseCode;
    final int versionCode;

    public C1688if(int i, int i2, Bundle bundle, byte[] bArr) {
        this.versionCode = i;
        this.responseCode = i2;
        this.f3700Ep = bundle;
        this.f3701Eq = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1689ig.m4951a(this, parcel, i);
    }
}
