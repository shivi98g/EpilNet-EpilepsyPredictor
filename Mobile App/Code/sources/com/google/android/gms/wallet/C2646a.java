package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.a */
public class C2646a implements Parcelable.Creator<Address> {
    /* renamed from: a */
    static void m7721a(Address address, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, address.getVersionCode());
        C0723b.m763a(parcel, 2, address.name, false);
        C0723b.m763a(parcel, 3, address.afK, false);
        C0723b.m763a(parcel, 4, address.afL, false);
        C0723b.m763a(parcel, 5, address.afM, false);
        C0723b.m763a(parcel, 6, address.f4484vk, false);
        C0723b.m763a(parcel, 7, address.auD, false);
        C0723b.m763a(parcel, 8, address.auE, false);
        C0723b.m763a(parcel, 9, address.afR, false);
        C0723b.m763a(parcel, 10, address.afT, false);
        C0723b.m766a(parcel, 11, address.afU);
        C0723b.m763a(parcel, 12, address.afV, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dJ */
    public Address createFromParcel(Parcel parcel) {
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
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 12:
                    str10 = C0721a.m736o(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new Address(i, str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: fQ */
    public Address[] newArray(int i) {
        return new Address[i];
    }
}
