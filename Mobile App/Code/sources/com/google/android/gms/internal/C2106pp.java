package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2089pi;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pp */
public class C2106pp implements Parcelable.Creator<C2089pi.C2095d> {
    /* renamed from: a */
    static void m6192a(C2089pi.C2095d dVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        Set<Integer> set = dVar.aon;
        if (set.contains(1)) {
            C0723b.m775c(parcel, 1, dVar.f4200CK);
        }
        if (set.contains(2)) {
            C0723b.m763a(parcel, 2, dVar.aoL, true);
        }
        if (set.contains(3)) {
            C0723b.m763a(parcel, 3, dVar.apL, true);
        }
        if (set.contains(4)) {
            C0723b.m763a(parcel, 4, dVar.aoO, true);
        }
        if (set.contains(5)) {
            C0723b.m763a(parcel, 5, dVar.apM, true);
        }
        if (set.contains(6)) {
            C0723b.m763a(parcel, 6, dVar.apN, true);
        }
        if (set.contains(7)) {
            C0723b.m763a(parcel, 7, dVar.apO, true);
        }
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dF */
    public C2089pi.C2095d createFromParcel(Parcel parcel) {
        int i;
        int G = C0721a.m714G(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i2 = C0721a.m728g(parcel, F);
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
                    str6 = C0721a.m736o(parcel, F);
                    i = 7;
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == G) {
            return new C2089pi.C2095d(hashSet, i2, str, str2, str3, str4, str5, str6);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fD */
    public C2089pi.C2095d[] newArray(int i) {
        return new C2089pi.C2095d[i];
    }
}
