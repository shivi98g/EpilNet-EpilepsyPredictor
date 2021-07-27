package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wallet.wobs.j */
public final class C2685j implements SafeParcelable {
    public static final Parcelable.Creator<C2685j> CREATOR = new C2686k();

    /* renamed from: CK */
    private final int f4516CK;
    String awT;

    /* renamed from: tU */
    String f4517tU;

    C2685j() {
        this.f4516CK = 1;
    }

    C2685j(int i, String str, String str2) {
        this.f4516CK = i;
        this.awT = str;
        this.f4517tU = str2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4516CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2686k.m7865a(this, parcel, i);
    }
}
