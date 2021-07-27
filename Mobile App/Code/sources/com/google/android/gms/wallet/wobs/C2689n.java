package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wallet.wobs.n */
public final class C2689n implements SafeParcelable {
    public static final Parcelable.Creator<C2689n> CREATOR = new C2690o();

    /* renamed from: CK */
    private final int f4519CK;
    String awW;
    String description;

    C2689n() {
        this.f4519CK = 1;
    }

    C2689n(int i, String str, String str2) {
        this.f4519CK = i;
        this.awW = str;
        this.description = str2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4519CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2690o.m7871a(this, parcel, i);
    }
}
