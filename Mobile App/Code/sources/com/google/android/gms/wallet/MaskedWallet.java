package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.internal.C1785jx;

public final class MaskedWallet implements SafeParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new C2669k();

    /* renamed from: CK */
    private final int f4494CK;
    String auL;
    String auM;
    String auO;
    Address auP;
    Address auQ;
    String[] auR;
    UserAddress auS;
    UserAddress auT;
    InstrumentInfo[] auU;
    LoyaltyWalletObject[] avw;
    OfferWalletObject[] avx;

    public final class Builder {
        private Builder() {
        }

        public MaskedWallet build() {
            return MaskedWallet.this;
        }

        public Builder setBillingAddress(Address address) {
            MaskedWallet.this.auP = address;
            return this;
        }

        public Builder setBuyerBillingAddress(UserAddress userAddress) {
            MaskedWallet.this.auS = userAddress;
            return this;
        }

        public Builder setBuyerShippingAddress(UserAddress userAddress) {
            MaskedWallet.this.auT = userAddress;
            return this;
        }

        public Builder setEmail(String str) {
            MaskedWallet.this.auO = str;
            return this;
        }

        public Builder setGoogleTransactionId(String str) {
            MaskedWallet.this.auL = str;
            return this;
        }

        public Builder setInstrumentInfos(InstrumentInfo[] instrumentInfoArr) {
            MaskedWallet.this.auU = instrumentInfoArr;
            return this;
        }

        public Builder setLoyaltyWalletObjects(LoyaltyWalletObject[] loyaltyWalletObjectArr) {
            MaskedWallet.this.avw = loyaltyWalletObjectArr;
            return this;
        }

        public Builder setMerchantTransactionId(String str) {
            MaskedWallet.this.auM = str;
            return this;
        }

        public Builder setOfferWalletObjects(OfferWalletObject[] offerWalletObjectArr) {
            MaskedWallet.this.avx = offerWalletObjectArr;
            return this;
        }

        public Builder setPaymentDescriptions(String[] strArr) {
            MaskedWallet.this.auR = strArr;
            return this;
        }

        public Builder setShippingAddress(Address address) {
            MaskedWallet.this.auQ = address;
            return this;
        }
    }

    private MaskedWallet() {
        this.f4494CK = 2;
    }

    MaskedWallet(int i, String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f4494CK = i;
        this.auL = str;
        this.auM = str2;
        this.auR = strArr;
        this.auO = str3;
        this.auP = address;
        this.auQ = address2;
        this.avw = loyaltyWalletObjectArr;
        this.avx = offerWalletObjectArr;
        this.auS = userAddress;
        this.auT = userAddress2;
        this.auU = instrumentInfoArr;
    }

    public static Builder newBuilderFrom(MaskedWallet maskedWallet) {
        C1785jx.m5364i(maskedWallet);
        return m7713rd().setGoogleTransactionId(maskedWallet.getGoogleTransactionId()).setMerchantTransactionId(maskedWallet.getMerchantTransactionId()).setPaymentDescriptions(maskedWallet.getPaymentDescriptions()).setInstrumentInfos(maskedWallet.getInstrumentInfos()).setEmail(maskedWallet.getEmail()).setLoyaltyWalletObjects(maskedWallet.getLoyaltyWalletObjects()).setOfferWalletObjects(maskedWallet.getOfferWalletObjects()).setBuyerBillingAddress(maskedWallet.getBuyerBillingAddress()).setBuyerShippingAddress(maskedWallet.getBuyerShippingAddress());
    }

    /* renamed from: rd */
    public static Builder m7713rd() {
        MaskedWallet maskedWallet = new MaskedWallet();
        maskedWallet.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public Address getBillingAddress() {
        return this.auP;
    }

    public UserAddress getBuyerBillingAddress() {
        return this.auS;
    }

    public UserAddress getBuyerShippingAddress() {
        return this.auT;
    }

    public String getEmail() {
        return this.auO;
    }

    public String getGoogleTransactionId() {
        return this.auL;
    }

    public InstrumentInfo[] getInstrumentInfos() {
        return this.auU;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects() {
        return this.avw;
    }

    public String getMerchantTransactionId() {
        return this.auM;
    }

    public OfferWalletObject[] getOfferWalletObjects() {
        return this.avx;
    }

    public String[] getPaymentDescriptions() {
        return this.auR;
    }

    @Deprecated
    public Address getShippingAddress() {
        return this.auQ;
    }

    public int getVersionCode() {
        return this.f4494CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2669k.m7832a(this, parcel, i);
    }
}
