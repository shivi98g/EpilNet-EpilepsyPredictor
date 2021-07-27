package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CountrySpecification implements SafeParcelable {
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new C1257a();

    /* renamed from: CK */
    private final int f2176CK;

    /* renamed from: vk */
    String f2177vk;

    CountrySpecification(int i, String str) {
        this.f2176CK = i;
        this.f2177vk = str;
    }

    public CountrySpecification(String str) {
        this.f2176CK = 1;
        this.f2177vk = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getCountryCode() {
        return this.f2177vk;
    }

    public int getVersionCode() {
        return this.f2176CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1257a.m3822a(this, parcel, i);
    }
}
