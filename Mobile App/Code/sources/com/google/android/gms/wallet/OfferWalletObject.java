package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class OfferWalletObject implements SafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new C2672n();

    /* renamed from: CK */
    private final int f4497CK;
    String avN;
    CommonWalletObject avO;

    /* renamed from: fl */
    String f4498fl;

    OfferWalletObject() {
        this.f4497CK = 3;
    }

    OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f4497CK = i;
        this.avN = str2;
        if (i < 3) {
            this.avO = CommonWalletObject.m7847rh().mo19199dh(str).mo19200ri();
        } else {
            this.avO = commonWalletObject;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.avO.getId();
    }

    public String getRedemptionCode() {
        return this.avN;
    }

    public int getVersionCode() {
        return this.f4497CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2672n.m7841a(this, parcel, i);
    }
}
