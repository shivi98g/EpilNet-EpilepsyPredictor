package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest implements SafeParcelable {
    public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new C2670l();

    /* renamed from: CK */
    private final int f4495CK;
    String auG;
    String auM;
    Cart auV;
    boolean avA;
    boolean avB;
    String avC;
    String avD;
    boolean avE;
    boolean avF;
    CountrySpecification[] avG;
    boolean avH;
    boolean avI;
    ArrayList<CountrySpecification> avJ;
    boolean avz;

    public final class Builder {
        private Builder() {
        }

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countrySpecification) {
            if (MaskedWalletRequest.this.avJ == null) {
                MaskedWalletRequest.this.avJ = new ArrayList<>();
            }
            MaskedWalletRequest.this.avJ.add(countrySpecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection<CountrySpecification> collection) {
            if (collection != null) {
                if (MaskedWalletRequest.this.avJ == null) {
                    MaskedWalletRequest.this.avJ = new ArrayList<>();
                }
                MaskedWalletRequest.this.avJ.addAll(collection);
            }
            return this;
        }

        public MaskedWalletRequest build() {
            return MaskedWalletRequest.this;
        }

        public Builder setAllowDebitCard(boolean z) {
            MaskedWalletRequest.this.avI = z;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean z) {
            MaskedWalletRequest.this.avH = z;
            return this;
        }

        public Builder setCart(Cart cart) {
            MaskedWalletRequest.this.auV = cart;
            return this;
        }

        public Builder setCurrencyCode(String str) {
            MaskedWalletRequest.this.auG = str;
            return this;
        }

        public Builder setEstimatedTotalPrice(String str) {
            MaskedWalletRequest.this.avC = str;
            return this;
        }

        public Builder setIsBillingAgreement(boolean z) {
            MaskedWalletRequest.this.avF = z;
            return this;
        }

        public Builder setMerchantName(String str) {
            MaskedWalletRequest.this.avD = str;
            return this;
        }

        public Builder setMerchantTransactionId(String str) {
            MaskedWalletRequest.this.auM = str;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean z) {
            MaskedWalletRequest.this.avz = z;
            return this;
        }

        public Builder setShippingAddressRequired(boolean z) {
            MaskedWalletRequest.this.avA = z;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean z) {
            MaskedWalletRequest.this.avE = z;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean z) {
            MaskedWalletRequest.this.avB = z;
            return this;
        }
    }

    MaskedWalletRequest() {
        this.f4495CK = 3;
        this.avH = true;
        this.avI = true;
    }

    MaskedWalletRequest(int i, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList<CountrySpecification> arrayList) {
        this.f4495CK = i;
        this.auM = str;
        this.avz = z;
        this.avA = z2;
        this.avB = z3;
        this.avC = str2;
        this.auG = str3;
        this.avD = str4;
        this.auV = cart;
        this.avE = z4;
        this.avF = z5;
        this.avG = countrySpecificationArr;
        this.avH = z6;
        this.avI = z7;
        this.avJ = arrayList;
    }

    public static Builder newBuilder() {
        MaskedWalletRequest maskedWalletRequest = new MaskedWalletRequest();
        maskedWalletRequest.getClass();
        return new Builder();
    }

    public boolean allowDebitCard() {
        return this.avI;
    }

    public boolean allowPrepaidCard() {
        return this.avH;
    }

    public int describeContents() {
        return 0;
    }

    public ArrayList<CountrySpecification> getAllowedCountrySpecificationsForShipping() {
        return this.avJ;
    }

    public CountrySpecification[] getAllowedShippingCountrySpecifications() {
        return this.avG;
    }

    public Cart getCart() {
        return this.auV;
    }

    public String getCurrencyCode() {
        return this.auG;
    }

    public String getEstimatedTotalPrice() {
        return this.avC;
    }

    public String getMerchantName() {
        return this.avD;
    }

    public String getMerchantTransactionId() {
        return this.auM;
    }

    public int getVersionCode() {
        return this.f4495CK;
    }

    public boolean isBillingAgreement() {
        return this.avF;
    }

    public boolean isPhoneNumberRequired() {
        return this.avz;
    }

    public boolean isShippingAddressRequired() {
        return this.avA;
    }

    public boolean shouldRetrieveWalletObjects() {
        return this.avE;
    }

    public boolean useMinimalBillingAddress() {
        return this.avB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2670l.m7835a(this, parcel, i);
    }
}
