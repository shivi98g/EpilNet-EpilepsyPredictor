package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.dq */
public class C1450dq implements Parcelable.Creator<C1451dr> {
    /* renamed from: a */
    static void m4303a(C1451dr drVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, drVar.versionCode);
        C0723b.m759a(parcel, 2, (Parcelable) drVar.f2962sb, i, false);
        C0723b.m757a(parcel, 3, drVar.mo15145ck(), false);
        C0723b.m757a(parcel, 4, drVar.mo15146cl(), false);
        C0723b.m757a(parcel, 5, drVar.mo15147cm(), false);
        C0723b.m757a(parcel, 6, drVar.mo15148cn(), false);
        C0723b.m763a(parcel, 7, drVar.f2967sg, false);
        C0723b.m766a(parcel, 8, drVar.f2968sh);
        C0723b.m763a(parcel, 9, drVar.f2969si, false);
        C0723b.m757a(parcel, 10, drVar.mo15150cp(), false);
        C0723b.m775c(parcel, 11, drVar.orientation);
        C0723b.m775c(parcel, 12, drVar.f2971sk);
        C0723b.m763a(parcel, 13, drVar.f2961rH, false);
        C0723b.m759a(parcel, 14, (Parcelable) drVar.f2960lO, i, false);
        C0723b.m757a(parcel, 15, drVar.mo15149co(), false);
        C0723b.m759a(parcel, 17, (Parcelable) drVar.f2974sn, i, false);
        C0723b.m763a(parcel, 16, drVar.f2973sm, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: f */
    public C1451dr createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        C1444do doVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        C1608gs gsVar = null;
        IBinder iBinder6 = null;
        String str4 = null;
        C2194y yVar = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    doVar = (C1444do) C0721a.m716a(parcel2, F, C1444do.CREATOR);
                    break;
                case 3:
                    iBinder = C0721a.m737p(parcel2, F);
                    break;
                case 4:
                    iBinder2 = C0721a.m737p(parcel2, F);
                    break;
                case 5:
                    iBinder3 = C0721a.m737p(parcel2, F);
                    break;
                case 6:
                    iBinder4 = C0721a.m737p(parcel2, F);
                    break;
                case 7:
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 8:
                    z = C0721a.m724c(parcel2, F);
                    break;
                case 9:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 10:
                    iBinder5 = C0721a.m737p(parcel2, F);
                    break;
                case 11:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 12:
                    i3 = C0721a.m728g(parcel2, F);
                    break;
                case 13:
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                case 14:
                    gsVar = (C1608gs) C0721a.m716a(parcel2, F, C1608gs.CREATOR);
                    break;
                case 15:
                    iBinder6 = C0721a.m737p(parcel2, F);
                    break;
                case 16:
                    str4 = C0721a.m736o(parcel2, F);
                    break;
                case 17:
                    yVar = (C2194y) C0721a.m716a(parcel2, F, C2194y.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1451dr(i, doVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, gsVar, iBinder6, str4, yVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: n */
    public C1451dr[] newArray(int i) {
        return new C1451dr[i];
    }
}
