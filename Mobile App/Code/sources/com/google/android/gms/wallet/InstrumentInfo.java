package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class InstrumentInfo implements SafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new C2666h();

    /* renamed from: CK */
    private final int f4490CK;
    private String auX;
    private String auY;

    InstrumentInfo(int i, String str, String str2) {
        this.f4490CK = i;
        this.auX = str;
        this.auY = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String getInstrumentDetails() {
        return this.auY;
    }

    public String getInstrumentType() {
        return this.auX;
    }

    public int getVersionCode() {
        return this.f4490CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2666h.m7823a(this, parcel, i);
    }
}
