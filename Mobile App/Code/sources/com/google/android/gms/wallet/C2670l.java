package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.l */
public class C2670l implements Parcelable.Creator<MaskedWalletRequest> {
    /* renamed from: a */
    static void m7835a(MaskedWalletRequest maskedWalletRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, maskedWalletRequest.getVersionCode());
        C0723b.m763a(parcel, 2, maskedWalletRequest.auM, false);
        C0723b.m766a(parcel, 3, maskedWalletRequest.avz);
        C0723b.m766a(parcel, 4, maskedWalletRequest.avA);
        C0723b.m766a(parcel, 5, maskedWalletRequest.avB);
        C0723b.m763a(parcel, 6, maskedWalletRequest.avC, false);
        C0723b.m763a(parcel, 7, maskedWalletRequest.auG, false);
        C0723b.m763a(parcel, 8, maskedWalletRequest.avD, false);
        C0723b.m759a(parcel, 9, (Parcelable) maskedWalletRequest.auV, i, false);
        C0723b.m766a(parcel, 10, maskedWalletRequest.avE);
        C0723b.m766a(parcel, 11, maskedWalletRequest.avF);
        C0723b.m769a(parcel, 12, (T[]) maskedWalletRequest.avG, i, false);
        C0723b.m766a(parcel, 13, maskedWalletRequest.avH);
        C0723b.m766a(parcel, 14, maskedWalletRequest.avI);
        C0723b.m776c(parcel, 15, maskedWalletRequest.avJ, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dT */
    public MaskedWalletRequest createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        CountrySpecification[] countrySpecificationArr = null;
        ArrayList<CountrySpecification> arrayList = null;
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
                    z3 = C0721a.m724c(parcel2, F);
                    break;
                case 4:
                    z4 = C0721a.m724c(parcel2, F);
                    break;
                case 5:
                    z5 = C0721a.m724c(parcel2, F);
                    break;
                case 6:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 7:
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                case 8:
                    str4 = C0721a.m736o(parcel2, F);
                    break;
                case 9:
                    cart = (Cart) C0721a.m716a(parcel2, F, Cart.CREATOR);
                    break;
                case 10:
                    z6 = C0721a.m724c(parcel2, F);
                    break;
                case 11:
                    z7 = C0721a.m724c(parcel2, F);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) C0721a.m722b(parcel2, F, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 14:
                    z2 = C0721a.m724c(parcel2, F);
                    break;
                case 15:
                    arrayList = C0721a.m723c(parcel2, F, CountrySpecification.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new MaskedWalletRequest(i, str, z3, z4, z5, str2, str3, str4, cart, z6, z7, countrySpecificationArr, z, z2, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: ga */
    public MaskedWalletRequest[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}
