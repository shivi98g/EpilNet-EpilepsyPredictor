package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest implements SafeParcelable {
    public static final Parcelable.Creator<FullWalletRequest> CREATOR = new C2665g();

    /* renamed from: CK */
    private final int f4489CK;
    String auL;
    String auM;
    Cart auV;

    public final class Builder {
        private Builder() {
        }

        public FullWalletRequest build() {
            return FullWalletRequest.this;
        }

        public Builder setCart(Cart cart) {
            FullWalletRequest.this.auV = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String str) {
            FullWalletRequest.this.auL = str;
            return this;
        }

        public Builder setMerchantTransactionId(String str) {
            FullWalletRequest.this.auM = str;
            return this;
        }
    }

    FullWalletRequest() {
        this.f4489CK = 1;
    }

    FullWalletRequest(int i, String str, String str2, Cart cart) {
        this.f4489CK = i;
        this.auL = str;
        this.auM = str2;
        this.auV = cart;
    }

    public static Builder newBuilder() {
        FullWalletRequest fullWalletRequest = new FullWalletRequest();
        fullWalletRequest.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public Cart getCart() {
        return this.auV;
    }

    public String getGoogleTransactionId() {
        return this.auL;
    }

    public String getMerchantTransactionId() {
        return this.auM;
    }

    public int getVersionCode() {
        return this.f4489CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2665g.m7820a(this, parcel, i);
    }
}
