package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: com.google.android.gms.wallet.f */
public class C2651f implements Parcelable.Creator<FullWallet> {
    /* renamed from: a */
    static void m7733a(FullWallet fullWallet, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, fullWallet.getVersionCode());
        C0723b.m763a(parcel, 2, fullWallet.auL, false);
        C0723b.m763a(parcel, 3, fullWallet.auM, false);
        C0723b.m759a(parcel, 4, (Parcelable) fullWallet.auN, i, false);
        C0723b.m763a(parcel, 5, fullWallet.auO, false);
        C0723b.m759a(parcel, 6, (Parcelable) fullWallet.auP, i, false);
        C0723b.m759a(parcel, 7, (Parcelable) fullWallet.auQ, i, false);
        C0723b.m770a(parcel, 8, fullWallet.auR, false);
        C0723b.m759a(parcel, 9, (Parcelable) fullWallet.auS, i, false);
        C0723b.m759a(parcel, 10, (Parcelable) fullWallet.auT, i, false);
        C0723b.m769a(parcel, 11, (T[]) fullWallet.auU, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dN */
    public FullWallet createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        ProxyCard proxyCard = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 4:
                    proxyCard = (ProxyCard) C0721a.m716a(parcel2, F, ProxyCard.CREATOR);
                    break;
                case 5:
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                case 6:
                    address = (Address) C0721a.m716a(parcel2, F, Address.CREATOR);
                    break;
                case 7:
                    address2 = (Address) C0721a.m716a(parcel2, F, Address.CREATOR);
                    break;
                case 8:
                    strArr = C0721a.m708A(parcel2, F);
                    break;
                case 9:
                    userAddress = (UserAddress) C0721a.m716a(parcel2, F, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) C0721a.m716a(parcel2, F, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) C0721a.m722b(parcel2, F, InstrumentInfo.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new FullWallet(i, str, str2, proxyCard, str3, address, address2, strArr, userAddress, userAddress2, instrumentInfoArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: fU */
    public FullWallet[] newArray(int i) {
        return new FullWallet[i];
    }
}
