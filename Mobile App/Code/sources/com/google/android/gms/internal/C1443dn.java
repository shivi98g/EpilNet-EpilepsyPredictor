package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.dn */
public class C1443dn implements Parcelable.Creator<C1444do> {
    /* renamed from: a */
    static void m4284a(C1444do doVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, doVar.versionCode);
        C0723b.m763a(parcel, 2, doVar.f2936rG, false);
        C0723b.m763a(parcel, 3, doVar.f2937rH, false);
        C0723b.m763a(parcel, 4, doVar.mimeType, false);
        C0723b.m763a(parcel, 5, doVar.packageName, false);
        C0723b.m763a(parcel, 6, doVar.f2938rI, false);
        C0723b.m763a(parcel, 7, doVar.f2939rJ, false);
        C0723b.m763a(parcel, 8, doVar.f2940rK, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: e */
    public C1444do createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    str3 = C0721a.m736o(parcel, F);
                    break;
                case 5:
                    str4 = C0721a.m736o(parcel, F);
                    break;
                case 6:
                    str5 = C0721a.m736o(parcel, F);
                    break;
                case 7:
                    str6 = C0721a.m736o(parcel, F);
                    break;
                case 8:
                    str7 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1444do(i, str, str2, str3, str4, str5, str6, str7);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: m */
    public C1444do[] newArray(int i) {
        return new C1444do[i];
    }
}
