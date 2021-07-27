package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class FullWallet implements SafeParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new C2651f();

    /* renamed from: CK */
    private final int f4488CK;
    String auL;
    String auM;
    ProxyCard auN;
    String auO;
    Address auP;
    Address auQ;
    String[] auR;
    UserAddress auS;
    UserAddress auT;
    InstrumentInfo[] auU;

    private FullWallet() {
        this.f4488CK = 1;
    }

    FullWallet(int i, String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f4488CK = i;
        this.auL = str;
        this.auM = str2;
        this.auN = proxyCard;
        this.auO = str3;
        this.auP = address;
        this.auQ = address2;
        this.auR = strArr;
        this.auS = userAddress;
        this.auT = userAddress2;
        this.auU = instrumentInfoArr;
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

    public String getMerchantTransactionId() {
        return this.auM;
    }

    public String[] getPaymentDescriptions() {
        return this.auR;
    }

    public ProxyCard getProxyCard() {
        return this.auN;
    }

    @Deprecated
    public Address getShippingAddress() {
        return this.auQ;
    }

    public int getVersionCode() {
        return this.f4488CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2651f.m7733a(this, parcel, i);
    }
}
