package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.AddressConstants;

public final class UserAddress implements SafeParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new C1258b();

    /* renamed from: CK */
    private final int f2178CK;
    String afK;
    String afL;
    String afM;
    String afN;
    String afO;
    String afP;
    String afQ;
    String afR;
    String afS;
    String afT;
    boolean afU;
    String afV;
    String afW;
    String name;

    /* renamed from: vk */
    String f2179vk;

    UserAddress() {
        this.f2178CK = 1;
    }

    UserAddress(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f2178CK = i;
        this.name = str;
        this.afK = str2;
        this.afL = str3;
        this.afM = str4;
        this.afN = str5;
        this.afO = str6;
        this.afP = str7;
        this.afQ = str8;
        this.f2179vk = str9;
        this.afR = str10;
        this.afS = str11;
        this.afT = str12;
        this.afU = z;
        this.afV = str13;
        this.afW = str14;
    }

    public static UserAddress fromIntent(Intent intent) {
        if (intent == null || !intent.hasExtra(AddressConstants.Extras.EXTRA_ADDRESS)) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra(AddressConstants.Extras.EXTRA_ADDRESS);
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

    public String getAddress4() {
        return this.afN;
    }

    public String getAddress5() {
        return this.afO;
    }

    public String getAdministrativeArea() {
        return this.afP;
    }

    public String getCompanyName() {
        return this.afV;
    }

    public String getCountryCode() {
        return this.f2179vk;
    }

    public String getEmailAddress() {
        return this.afW;
    }

    public String getLocality() {
        return this.afQ;
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

    public String getSortingCode() {
        return this.afS;
    }

    public int getVersionCode() {
        return this.f2178CK;
    }

    public boolean isPostBox() {
        return this.afU;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1258b.m3825a(this, parcel, i);
    }
}
