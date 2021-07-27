package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.e */
public class C2650e implements Parcelable.Creator<C2649d> {
    /* renamed from: a */
    static void m7730a(C2649d dVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, dVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) dVar.auJ, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) dVar.auK, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dM */
    public C2649d createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        LoyaltyWalletObject loyaltyWalletObject = null;
        int i = 0;
        OfferWalletObject offerWalletObject = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    loyaltyWalletObject = (LoyaltyWalletObject) C0721a.m716a(parcel, F, LoyaltyWalletObject.CREATOR);
                    break;
                case 3:
                    offerWalletObject = (OfferWalletObject) C0721a.m716a(parcel, F, OfferWalletObject.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2649d(i, loyaltyWalletObject, offerWalletObject);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fT */
    public C2649d[] newArray(int i) {
        return new C2649d[i];
    }
}
