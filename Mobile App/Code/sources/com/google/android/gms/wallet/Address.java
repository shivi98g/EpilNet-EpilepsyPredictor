package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public final class Address implements SafeParcelable {
    public static final Parcelable.Creator<Address> CREATOR = new C2646a();

    /* renamed from: CK */
    private final int f4483CK;
    String afK;
    String afL;
    String afM;
    String afR;
    String afT;
    boolean afU;
    String afV;
    String auD;
    String auE;
    String name;

    /* renamed from: vk */
    String f4484vk;

    Address() {
        this.f4483CK = 1;
    }

    Address(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.f4483CK = i;
        this.name = str;
        this.afK = str2;
        this.afL = str3;
        this.afM = str4;
        this.f4484vk = str5;
        this.auD = str6;
        this.auE = str7;
        this.afR = str8;
        this.afT = str9;
        this.afU = z;
        this.afV = str10;
    }

    public int describeContents() {
        return 0;
    }

    public String getAddress1() {
        return this.afK;
    }

    public String getAddress2() {
        return this.afL;
    }

    public String getAddress3() {
        return this.afM;
    }

    public String getCity() {
        return this.auD;
    }

    public String getCompanyName() {
        return this.afV;
    }

    public String getCountryCode() {
        return this.f4484vk;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.afT;
    }

    public String getPostalCode() {
        return this.afR;
    }

    public String getState() {
        return this.auE;
    }

    public int getVersionCode() {
        return this.f4483CK;
    }

    public boolean isPostBox() {
        return this.afU;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2646a.m7721a(this, parcel, i);
    }
}
