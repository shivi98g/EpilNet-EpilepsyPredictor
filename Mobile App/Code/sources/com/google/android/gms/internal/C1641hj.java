package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.hj */
public class C1641hj implements SafeParcelable {
    public static final C1642hk CREATOR = new C1642hk();

    /* renamed from: CK */
    final int f3631CK;

    /* renamed from: Db */
    final Bundle f3632Db;

    /* renamed from: id */
    public final int f3633id;

    C1641hj(int i, int i2, Bundle bundle) {
        this.f3631CK = i;
        this.f3633id = i2;
        this.f3632Db = bundle;
    }

    public int describeContents() {
        C1642hk hkVar = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1642hk hkVar = CREATOR;
        C1642hk.m4804a(this, parcel, i);
    }
}
