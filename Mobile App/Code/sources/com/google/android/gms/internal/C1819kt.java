package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1815kr;

/* renamed from: com.google.android.gms.internal.kt */
public class C1819kt implements Parcelable.Creator<C1815kr.C1816a> {
    /* renamed from: a */
    static void m5464a(C1815kr.C1816a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, aVar.getVersionCode());
        C0723b.m775c(parcel, 2, aVar.mo16016hI());
        C0723b.m766a(parcel, 3, aVar.mo16019hO());
        C0723b.m775c(parcel, 4, aVar.mo16017hJ());
        C0723b.m766a(parcel, 5, aVar.mo16020hP());
        C0723b.m763a(parcel, 6, aVar.mo16021hQ(), false);
        C0723b.m775c(parcel, 7, aVar.mo16022hR());
        C0723b.m763a(parcel, 8, aVar.mo16024hT(), false);
        C0723b.m759a(parcel, 9, (Parcelable) aVar.mo16026hV(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: M */
    public C1815kr.C1816a createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        C1809km kmVar = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 4:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    z2 = C0721a.m724c(parcel, F);
                    break;
                case 6:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 7:
                    i4 = C0721a.m728g(parcel, F);
                    break;
                case 8:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 9:
                    kmVar = (C1809km) C0721a.m716a(parcel, F, C1809km.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1815kr.C1816a(i, i2, z, i3, z2, str, i4, str2, kmVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aN */
    public C1815kr.C1816a[] newArray(int i) {
        return new C1815kr.C1816a[i];
    }
}
