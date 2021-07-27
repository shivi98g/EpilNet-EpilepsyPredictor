package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wallet.d */
public final class C2649d implements SafeParcelable {
    public static final Parcelable.Creator<C2649d> CREATOR = new C2650e();

    /* renamed from: CK */
    private final int f4502CK;
    LoyaltyWalletObject auJ;
    OfferWalletObject auK;

    C2649d() {
        this.f4502CK = 2;
    }

    C2649d(int i, LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject) {
        this.f4502CK = i;
        this.auJ = loyaltyWalletObject;
        this.auK = offerWalletObject;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f4502CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2650e.m7730a(this, parcel, i);
    }
}
