package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public class CountrySpecification implements SafeParcelable {
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new C2648c();

    /* renamed from: CK */
    private final int f4486CK;

    /* renamed from: vk */
    String f4487vk;

    CountrySpecification(int i, String str) {
        this.f4486CK = i;
        this.f4487vk = str;
    }

    public CountrySpecification(String str) {
        this.f4486CK = 1;
        this.f4487vk = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getCountryCode() {
        return this.f4487vk;
    }

    public int getVersionCode() {
        return this.f4486CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2648c.m7727a(this, parcel, i);
    }
}
