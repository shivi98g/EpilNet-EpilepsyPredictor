package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.ow */
public class C2059ow implements Parcelable.Creator<C2058ov> {
    /* renamed from: a */
    static void m6068a(C2058ov ovVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, ovVar.versionCode);
        C0723b.m763a(parcel, 2, ovVar.packageName, false);
        C0723b.m775c(parcel, 3, ovVar.ang);
        C0723b.m775c(parcel, 4, ovVar.anh);
        C0723b.m763a(parcel, 5, ovVar.ani, false);
        C0723b.m763a(parcel, 6, ovVar.anj, false);
        C0723b.m766a(parcel, 7, ovVar.ank);
        C0723b.m763a(parcel, 8, ovVar.anl, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: du */
    public C2058ov createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
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
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 6:
                    str3 = C0721a.m736o(parcel, F);
                    break;
                case 7:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 8:
                    str4 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2058ov(i, str, i2, i3, str2, str3, z, str4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fr */
    public C2058ov[] newArray(int i) {
        return new C2058ov[i];
    }
}
