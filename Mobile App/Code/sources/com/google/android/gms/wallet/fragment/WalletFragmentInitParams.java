package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams implements SafeParcelable {
    public static final Parcelable.Creator<WalletFragmentInitParams> CREATOR = new C2662a();

    /* renamed from: CK */
    final int f4505CK;
    /* access modifiers changed from: private */

    /* renamed from: DZ */
    public String f4506DZ;
    /* access modifiers changed from: private */
    public MaskedWalletRequest awg;
    /* access modifiers changed from: private */
    public MaskedWallet awh;
    /* access modifiers changed from: private */
    public int awu;

    public final class Builder {
        private Builder() {
        }

        public WalletFragmentInitParams build() {
            boolean z = false;
            C1785jx.m5355a((WalletFragmentInitParams.this.awh != null && WalletFragmentInitParams.this.awg == null) || (WalletFragmentInitParams.this.awh == null && WalletFragmentInitParams.this.awg != null), "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (WalletFragmentInitParams.this.awu >= 0) {
                z = true;
            }
            C1785jx.m5355a(z, "masked wallet request code is required and must be non-negative");
            return WalletFragmentInitParams.this;
        }

        public Builder setAccountName(String str) {
            String unused = WalletFragmentInitParams.this.f4506DZ = str;
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedWallet) {
            MaskedWallet unused = WalletFragmentInitParams.this.awh = maskedWallet;
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
            MaskedWalletRequest unused = WalletFragmentInitParams.this.awg = maskedWalletRequest;
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i) {
            int unused = WalletFragmentInitParams.this.awu = i;
            return this;
        }
    }

    private WalletFragmentInitParams() {
        this.f4505CK = 1;
        this.awu = -1;
    }

    WalletFragmentInitParams(int i, String str, MaskedWalletRequest maskedWalletRequest, int i2, MaskedWallet maskedWallet) {
        this.f4505CK = i;
        this.f4506DZ = str;
        this.awg = maskedWalletRequest;
        this.awu = i2;
        this.awh = maskedWallet;
    }

    public static Builder newBuilder() {
        WalletFragmentInitParams walletFragmentInitParams = new WalletFragmentInitParams();
        walletFragmentInitParams.getClass();
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public String getAccountName() {
        return this.f4506DZ;
    }

    public MaskedWallet getMaskedWallet() {
        return this.awh;
    }

    public MaskedWalletRequest getMaskedWalletRequest() {
        return this.awg;
    }

    public int getMaskedWalletRequestCode() {
        return this.awu;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2662a.m7811a(this, parcel, i);
    }
}
