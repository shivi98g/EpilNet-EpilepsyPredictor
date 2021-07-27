package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wallet.wobs.b */
public final class C2677b implements SafeParcelable {
    public static final Parcelable.Creator<C2677b> CREATOR = new C2678c();

    /* renamed from: CK */
    private final int f4512CK;
    String label;
    String value;

    C2677b() {
        this.f4512CK = 1;
    }

    C2677b(int i, String str, String str2) {
        this.f4512CK = i;
        this.label = str;
        this.value = str2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4512CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2678c.m7853a(this, parcel, i);
    }
}
