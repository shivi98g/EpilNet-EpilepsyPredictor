package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.identity.intents.model.b */
public class C1258b implements Parcelable.Creator<UserAddress> {
    /* renamed from: a */
    static void m3825a(UserAddress userAddress, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, userAddress.getVersionCode());
        C0723b.m763a(parcel, 2, userAddress.name, false);
        C0723b.m763a(parcel, 3, userAddress.afK, false);
        C0723b.m763a(parcel, 4, userAddress.afL, false);
        C0723b.m763a(parcel, 5, userAddress.afM, false);
        C0723b.m763a(parcel, 6, userAddress.afN, false);
        C0723b.m763a(parcel, 7, userAddress.afO, false);
        C0723b.m763a(parcel, 8, userAddress.afP, false);
        C0723b.m763a(parcel, 9, userAddress.afQ, false);
        C0723b.m763a(parcel, 10, userAddress.f2179vk, false);
        C0723b.m763a(parcel, 11, userAddress.afR, false);
        C0723b.m763a(parcel, 12, userAddress.afS, false);
        C0723b.m763a(parcel, 13, userAddress.afT, false);
        C0723b.m766a(parcel, 14, userAddress.afU);
        C0723b.m763a(parcel, 15, userAddress.afV, false);
        C0723b.m763a(parcel, 16, userAddress.afW, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cH */
    public UserAddress createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                case 5:
                    str4 = C0721a.m736o(parcel2, F);
                    break;
                case 6:
                    str5 = C0721a.m736o(parcel2, F);
                    break;
                case 7:
                    str6 = C0721a.m736o(parcel2, F);
                    break;
                case 8:
                    str7 = C0721a.m736o(parcel2, F);
                    break;
                case 9:
                    str8 = C0721a.m736o(parcel2, F);
                    break;
                case 10:
                    str9 = C0721a.m736o(parcel2, F);
                    break;
                case 11:
                    str10 = C0721a.m736o(parcel2, F);
                    break;
                case 12:
                    str11 = C0721a.m736o(parcel2, F);
                    break;
                case 13:
                    str12 = C0721a.m736o(parcel2, F);
                    break;
                case 14:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 15:
                    str13 = C0721a.m736o(parcel2, F);
                    break;
                case 16:
                    str14 = C0721a.m736o(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new UserAddress(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: eu */
    public UserAddress[] newArray(int i) {
        return new UserAddress[i];
    }
}
