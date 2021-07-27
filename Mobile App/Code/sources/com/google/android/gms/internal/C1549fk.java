package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.fk */
public class C1549fk implements Parcelable.Creator<C1548fj> {
    /* renamed from: a */
    static void m4489a(C1548fj fjVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, fjVar.versionCode);
        C0723b.m763a(parcel, 2, fjVar.f3333sg, false);
        C0723b.m763a(parcel, 3, fjVar.f3335tU, false);
        C0723b.m774b(parcel, 4, fjVar.f3331qw, false);
        C0723b.m775c(parcel, 5, fjVar.errorCode);
        C0723b.m774b(parcel, 6, fjVar.f3332qx, false);
        C0723b.m755a(parcel, 7, fjVar.f3336tV);
        C0723b.m766a(parcel, 8, fjVar.f3337tW);
        C0723b.m755a(parcel, 9, fjVar.f3338tX);
        C0723b.m774b(parcel, 10, fjVar.f3339tY, false);
        C0723b.m755a(parcel, 11, fjVar.f3330qA);
        C0723b.m775c(parcel, 12, fjVar.orientation);
        C0723b.m763a(parcel, 13, fjVar.f3340tZ, false);
        C0723b.m755a(parcel, 14, fjVar.f3341ua);
        C0723b.m763a(parcel, 15, fjVar.f3342ub, false);
        C0723b.m763a(parcel, 19, fjVar.f3344ud, false);
        C0723b.m766a(parcel, 18, fjVar.f3343uc);
        C0723b.m763a(parcel, 21, fjVar.f3345ue, false);
        C0723b.m766a(parcel, 23, fjVar.f3347ug);
        C0723b.m766a(parcel, 22, fjVar.f3346uf);
        C0723b.m766a(parcel, 25, fjVar.f3348uh);
        C0723b.m766a(parcel, 24, fjVar.f3334tT);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: i */
    public C1548fj createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
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
                    arrayList = C0721a.m710C(parcel2, F);
                    break;
                case 5:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 6:
                    arrayList2 = C0721a.m710C(parcel2, F);
                    break;
                case 7:
                    j = C0721a.m730i(parcel2, F);
                    break;
                case 8:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 9:
                    j2 = C0721a.m730i(parcel2, F);
                    break;
                case 10:
                    arrayList3 = C0721a.m710C(parcel2, F);
                    break;
                case 11:
                    j3 = C0721a.m730i(parcel2, F);
                    break;
                case 12:
                    i3 = C0721a.m728g(parcel2, F);
                    break;
                case 13:
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                case 14:
                    j4 = C0721a.m730i(parcel2, F);
                    break;
                case 15:
                    str4 = C0721a.m736o(parcel2, F);
                    break;
                case 18:
                    z2 = C0721a.m724c(parcel2, F);
                    break;
                case 19:
                    str5 = C0721a.m736o(parcel2, F);
                    break;
                case 21:
                    str6 = C0721a.m736o(parcel2, F);
                    break;
                case 22:
                    z3 = C0721a.m724c(parcel2, F);
                    break;
                case 23:
                    z4 = C0721a.m724c(parcel2, F);
                    break;
                case 24:
                    z5 = C0721a.m724c(parcel2, F);
                    break;
                case 25:
                    z6 = C0721a.m724c(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1548fj(i, str, str2, arrayList, i2, arrayList2, j, z, j2, arrayList3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: r */
    public C1548fj[] newArray(int i) {
        return new C1548fj[i];
    }
}
