package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.az */
public class C1307az implements Parcelable.Creator<C1306ay> {
    /* renamed from: a */
    static void m3952a(C1306ay ayVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, ayVar.versionCode);
        C0723b.m763a(parcel, 2, ayVar.f2397op, false);
        C0723b.m775c(parcel, 3, ayVar.height);
        C0723b.m775c(parcel, 4, ayVar.heightPixels);
        C0723b.m766a(parcel, 5, ayVar.f2398oq);
        C0723b.m775c(parcel, 6, ayVar.width);
        C0723b.m775c(parcel, 7, ayVar.widthPixels);
        C0723b.m769a(parcel, 8, (T[]) ayVar.f2399or, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: c */
    public C1306ay createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        C1306ay[] ayVarArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
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
                    z = C0721a.m724c(parcel, F);
                    break;
                case 6:
                    i4 = C0721a.m728g(parcel, F);
                    break;
                case 7:
                    i5 = C0721a.m728g(parcel, F);
                    break;
                case 8:
                    ayVarArr = (C1306ay[]) C0721a.m722b(parcel, F, C1306ay.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1306ay(i, str, i2, i3, z, i4, i5, ayVarArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: g */
    public C1306ay[] newArray(int i) {
        return new C1306ay[i];
    }
}
