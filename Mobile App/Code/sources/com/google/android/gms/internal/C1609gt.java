package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.gt */
public class C1609gt implements Parcelable.Creator<C1608gs> {
    /* renamed from: a */
    static void m4715a(C1608gs gsVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, gsVar.versionCode);
        C0723b.m763a(parcel, 2, gsVar.f3554wS, false);
        C0723b.m775c(parcel, 3, gsVar.f3555wT);
        C0723b.m775c(parcel, 4, gsVar.f3556wU);
        C0723b.m766a(parcel, 5, gsVar.f3557wV);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: j */
    public C1608gs createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        String str = null;
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
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1608gs(i, str, i2, i3, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: w */
    public C1608gs[] newArray(int i) {
        return new C1608gs[i];
    }
}
