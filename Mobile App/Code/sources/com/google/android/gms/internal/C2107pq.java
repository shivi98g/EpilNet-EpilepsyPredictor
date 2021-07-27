package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2089pi;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pq */
public class C2107pq implements Parcelable.Creator<C2089pi.C2097f> {
    /* renamed from: a */
    static void m6195a(C2089pi.C2097f fVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = fVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, fVar.f4201CK);
        }
        if (set.contains(2)) {
            C0723b.m763a(parcel, 2, fVar.apP, true);
        }
        if (set.contains(3)) {
            C0723b.m763a(parcel, 3, fVar.f4204UO, true);
        }
        if (set.contains(4)) {
            C0723b.m763a(parcel, 4, fVar.aoK, true);
        }
        if (set.contains(5)) {
            C0723b.m763a(parcel, 5, fVar.apQ, true);
        }
        if (set.contains(6)) {
            C0723b.m763a(parcel, 6, fVar.mName, true);
        }
        if (set.contains(7)) {
            C0723b.m766a(parcel, 7, fVar.apR);
        }
        if (set.contains(8)) {
            C0723b.m763a(parcel, 8, fVar.apa, true);
        }
        if (set.contains(9)) {
            C0723b.m763a(parcel, 9, fVar.f4203OH, true);
        }
        if (set.contains(10)) {
            C0723b.m775c(parcel, 10, fVar.f4202Gt);
        }
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dG */
    public C2089pi.C2097f createFromParcel(Parcel parcel) {
        int i;
        int G = C0721a.m714G(parcel);
        HashSet hashSet = new HashSet();
        boolean z = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i3 = C0721a.m728g(parcel, F);
                    i = 1;
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    i = 2;
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel, F);
                    i = 3;
                    break;
                case 4:
                    str3 = C0721a.m736o(parcel, F);
                    i = 4;
                    break;
                case 5:
                    str4 = C0721a.m736o(parcel, F);
                    i = 5;
                    break;
                case 6:
                    str5 = C0721a.m736o(parcel, F);
                    i = 6;
                    break;
                case 7:
                    z = C0721a.m724c(parcel, F);
                    i = 7;
                    break;
                case 8:
                    str6 = C0721a.m736o(parcel, F);
                    i = 8;
                    break;
                case 9:
                    str7 = C0721a.m736o(parcel, F);
                    i = 9;
                    break;
                case 10:
                    i2 = C0721a.m728g(parcel, F);
                    i = 10;
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == G) {
            return new C2089pi.C2097f(hashSet, i3, str, str2, str3, str4, str5, z, str6, str7, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fE */
    public C2089pi.C2097f[] newArray(int i) {
        return new C2089pi.C2097f[i];
    }
}
