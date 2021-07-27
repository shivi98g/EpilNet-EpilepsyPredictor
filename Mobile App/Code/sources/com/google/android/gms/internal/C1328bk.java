package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.bk */
public class C1328bk implements Parcelable.Creator<C1327bj> {
    /* renamed from: a */
    static void m4017a(C1327bj bjVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, bjVar.versionCode);
        C0723b.m775c(parcel, 2, bjVar.f2665oQ);
        C0723b.m775c(parcel, 3, bjVar.backgroundColor);
        C0723b.m775c(parcel, 4, bjVar.f2666oR);
        C0723b.m775c(parcel, 5, bjVar.f2667oS);
        C0723b.m775c(parcel, 6, bjVar.f2668oT);
        C0723b.m775c(parcel, 7, bjVar.f2669oU);
        C0723b.m775c(parcel, 8, bjVar.f2670oV);
        C0723b.m775c(parcel, 9, bjVar.f2671oW);
        C0723b.m763a(parcel, 10, bjVar.f2672oX, false);
        C0723b.m775c(parcel, 11, bjVar.f2673oY);
        C0723b.m763a(parcel, 12, bjVar.f2674oZ, false);
        C0723b.m775c(parcel, 13, bjVar.f2675pa);
        C0723b.m775c(parcel, 14, bjVar.f2676pb);
        C0723b.m763a(parcel, 15, bjVar.f2677pc, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: d */
    public C1327bj createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 3:
                    i3 = C0721a.m728g(parcel2, F);
                    break;
                case 4:
                    i4 = C0721a.m728g(parcel2, F);
                    break;
                case 5:
                    i5 = C0721a.m728g(parcel2, F);
                    break;
                case 6:
                    i6 = C0721a.m728g(parcel2, F);
                    break;
                case 7:
                    i7 = C0721a.m728g(parcel2, F);
                    break;
                case 8:
                    i8 = C0721a.m728g(parcel2, F);
                    break;
                case 9:
                    i9 = C0721a.m728g(parcel2, F);
                    break;
                case 10:
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 11:
                    i10 = C0721a.m728g(parcel2, F);
                    break;
                case 12:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 13:
                    i11 = C0721a.m728g(parcel2, F);
                    break;
                case 14:
                    i12 = C0721a.m728g(parcel2, F);
                    break;
                case 15:
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1327bj(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: i */
    public C1327bj[] newArray(int i) {
        return new C1327bj[i];
    }
}
