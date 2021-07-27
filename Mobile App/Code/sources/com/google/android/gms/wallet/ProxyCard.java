package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard implements SafeParcelable {
    public static final Parcelable.Creator<ProxyCard> CREATOR = new C2673o();

    /* renamed from: CK */
    private final int f4499CK;
    String avP;
    String avQ;
    int avR;
    int avS;

    ProxyCard(int i, String str, String str2, int i2, int i3) {
        this.f4499CK = i;
        this.avP = str;
        this.avQ = str2;
        this.avR = i2;
        this.avS = i3;
    }

    public int describeContents() {
        return 0;
    }

    public String getCvn() {
        return this.avQ;
    }

    public int getExpirationMonth() {
        return this.avR;
    }

    public int getExpirationYear() {
        return this.avS;
    }

    public String getPan() {
        return this.avP;
    }

    public int getVersionCode() {
        return this.f4499CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2673o.m7844a(this, parcel, i);
    }
}
