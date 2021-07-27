package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.fi */
public class C1547fi implements Parcelable.Creator<C1545fh> {
    /* renamed from: a */
    static void m4486a(C1545fh fhVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, fhVar.versionCode);
        C0723b.m756a(parcel, 2, fhVar.f3307tK, false);
        C0723b.m759a(parcel, 3, (Parcelable) fhVar.f3308tL, i, false);
        C0723b.m759a(parcel, 4, (Parcelable) fhVar.f3305lS, i, false);
        C0723b.m763a(parcel, 5, fhVar.f3303lL, false);
        C0723b.m759a(parcel, 6, (Parcelable) fhVar.applicationInfo, i, false);
        C0723b.m759a(parcel, 7, (Parcelable) fhVar.f3309tM, i, false);
        C0723b.m763a(parcel, 8, fhVar.f3310tN, false);
        C0723b.m763a(parcel, 9, fhVar.f3311tO, false);
        C0723b.m763a(parcel, 10, fhVar.f3312tP, false);
        C0723b.m759a(parcel, 11, (Parcelable) fhVar.f3304lO, i, false);
        C0723b.m756a(parcel, 12, fhVar.f3313tQ, false);
        C0723b.m775c(parcel, 13, fhVar.f3314tR);
        C0723b.m774b(parcel, 14, fhVar.f3306mc, false);
        C0723b.m756a(parcel, 15, fhVar.f3315tS, false);
        C0723b.m766a(parcel, 16, fhVar.f3316tT);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: h */
    public C1545fh createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        Bundle bundle = null;
        C1303av avVar = null;
        C1306ay ayVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C1608gs gsVar = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    bundle = C0721a.m738q(parcel2, F);
                    break;
                case 3:
                    avVar = (C1303av) C0721a.m716a(parcel2, F, C1303av.CREATOR);
                    break;
                case 4:
                    ayVar = (C1306ay) C0721a.m716a(parcel2, F, C1306ay.CREATOR);
                    break;
                case 5:
                    str = C0721a.m736o(parcel2, F);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C0721a.m716a(parcel2, F, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C0721a.m716a(parcel2, F, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C0721a.m736o(parcel2, F);
                    break;
                case 9:
                    str3 = C0721a.m736o(parcel2, F);
                    break;
                case 10:
                    str4 = C0721a.m736o(parcel2, F);
                    break;
                case 11:
                    gsVar = (C1608gs) C0721a.m716a(parcel2, F, C1608gs.CREATOR);
                    break;
                case 12:
                    bundle2 = C0721a.m738q(parcel2, F);
                    break;
                case 13:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 14:
                    arrayList = C0721a.m710C(parcel2, F);
                    break;
                case 15:
                    bundle3 = C0721a.m738q(parcel2, F);
                    break;
                case 16:
                    z = C0721a.m724c(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1545fh(i, bundle, avVar, ayVar, str, applicationInfo, packageInfo, str2, str3, str4, gsVar, bundle2, i2, arrayList, bundle3, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: q */
    public C1545fh[] newArray(int i) {
        return new C1545fh[i];
    }
}
