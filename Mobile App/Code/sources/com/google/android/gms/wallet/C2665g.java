package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.g */
public class C2665g implements Parcelable.Creator<FullWalletRequest> {
    /* renamed from: a */
    static void m7820a(FullWalletRequest fullWalletRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, fullWalletRequest.getVersionCode());
        C0723b.m763a(parcel, 2, fullWalletRequest.auL, false);
        C0723b.m763a(parcel, 3, fullWalletRequest.auM, false);
        C0723b.m759a(parcel, 4, (Parcelable) fullWalletRequest.auV, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dO */
    public FullWalletRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        Cart cart = null;
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
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    cart = (Cart) C0721a.m716a(parcel, F, Cart.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new FullWalletRequest(i, str, str2, cart);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fV */
    public FullWalletRequest[] newArray(int i) {
        return new FullWalletRequest[i];
    }
}
