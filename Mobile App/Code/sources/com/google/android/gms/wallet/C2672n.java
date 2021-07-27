package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: com.google.android.gms.wallet.n */
public class C2672n implements Parcelable.Creator<OfferWalletObject> {
    /* renamed from: a */
    static void m7841a(OfferWalletObject offerWalletObject, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, offerWalletObject.getVersionCode());
        C0723b.m763a(parcel, 2, offerWalletObject.f4498fl, false);
        C0723b.m763a(parcel, 3, offerWalletObject.avN, false);
        C0723b.m759a(parcel, 4, (Parcelable) offerWalletObject.avO, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dV */
    public OfferWalletObject createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        CommonWalletObject commonWalletObject = null;
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
                    commonWalletObject = (CommonWalletObject) C0721a.m716a(parcel, F, CommonWalletObject.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new OfferWalletObject(i, str, str2, commonWalletObject);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gc */
    public OfferWalletObject[] newArray(int i) {
        return new OfferWalletObject[i];
    }
}
