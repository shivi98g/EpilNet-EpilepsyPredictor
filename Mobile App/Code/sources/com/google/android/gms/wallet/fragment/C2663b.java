package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.fragment.b */
public class C2663b implements Parcelable.Creator<WalletFragmentOptions> {
    /* renamed from: a */
    static void m7814a(WalletFragmentOptions walletFragmentOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, walletFragmentOptions.f4507CK);
        C0723b.m775c(parcel, 2, walletFragmentOptions.getEnvironment());
        C0723b.m775c(parcel, 3, walletFragmentOptions.getTheme());
        C0723b.m759a(parcel, 4, (Parcelable) walletFragmentOptions.getFragmentStyle(), i, false);
        C0723b.m775c(parcel, 5, walletFragmentOptions.getMode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ea */
    public WalletFragmentOptions createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        WalletFragmentStyle walletFragmentStyle = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    i4 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    walletFragmentStyle = (WalletFragmentStyle) C0721a.m716a(parcel, F, WalletFragmentStyle.CREATOR);
                    break;
                case 5:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new WalletFragmentOptions(i3, i, i4, walletFragmentStyle, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gi */
    public WalletFragmentOptions[] newArray(int i) {
        return new WalletFragmentOptions[i];
    }
}
