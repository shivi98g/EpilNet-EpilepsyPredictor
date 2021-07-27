package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

/* renamed from: com.google.android.gms.wallet.fragment.a */
public class C2662a implements Parcelable.Creator<WalletFragmentInitParams> {
    /* renamed from: a */
    static void m7811a(WalletFragmentInitParams walletFragmentInitParams, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, walletFragmentInitParams.f4505CK);
        C0723b.m763a(parcel, 2, walletFragmentInitParams.getAccountName(), false);
        C0723b.m759a(parcel, 3, (Parcelable) walletFragmentInitParams.getMaskedWalletRequest(), i, false);
        C0723b.m775c(parcel, 4, walletFragmentInitParams.getMaskedWalletRequestCode());
        C0723b.m759a(parcel, 5, (Parcelable) walletFragmentInitParams.getMaskedWallet(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dZ */
    public WalletFragmentInitParams createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        MaskedWalletRequest maskedWalletRequest = null;
        MaskedWallet maskedWallet = null;
        int i = 0;
        int i2 = -1;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    maskedWalletRequest = (MaskedWalletRequest) C0721a.m716a(parcel, F, MaskedWalletRequest.CREATOR);
                    break;
                case 4:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    maskedWallet = (MaskedWallet) C0721a.m716a(parcel, F, MaskedWallet.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new WalletFragmentInitParams(i, str, maskedWalletRequest, i2, maskedWallet);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gh */
    public WalletFragmentInitParams[] newArray(int i) {
        return new WalletFragmentInitParams[i];
    }
}
