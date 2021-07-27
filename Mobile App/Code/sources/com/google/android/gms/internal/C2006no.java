package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.no */
public class C2006no implements Parcelable.Creator<C2005nn> {
    /* renamed from: a */
    static void m5962a(C2005nn nnVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, nnVar.getRequestId(), false);
        C0723b.m775c(parcel, 1000, nnVar.getVersionCode());
        C0723b.m755a(parcel, 2, nnVar.getExpirationTime());
        C0723b.m765a(parcel, 3, nnVar.mo16366nn());
        C0723b.m753a(parcel, 4, nnVar.getLatitude());
        C0723b.m753a(parcel, 5, nnVar.getLongitude());
        C0723b.m754a(parcel, 6, nnVar.mo16367no());
        C0723b.m775c(parcel, 7, nnVar.mo16368np());
        C0723b.m775c(parcel, 8, nnVar.getNotificationResponsiveness());
        C0723b.m775c(parcel, 9, nnVar.mo16369nq());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cN */
    public C2005nn createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        int i2 = 0;
        short s = 0;
        int i3 = 0;
        String str = null;
        float f = 0.0f;
        long j = 0;
        int i4 = -1;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 2:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 3:
                        s = C0721a.m727f(parcel2, F);
                        break;
                    case 4:
                        d = C0721a.m734m(parcel2, F);
                        break;
                    case 5:
                        d2 = C0721a.m734m(parcel2, F);
                        break;
                    case 6:
                        f = C0721a.m733l(parcel2, F);
                        break;
                    case 7:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 8:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 9:
                        i4 = C0721a.m728g(parcel2, F);
                        break;
                    default:
                        C0721a.m721b(parcel2, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2005nn(i, str, i2, s, d, d2, f, j, i3, i4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: eJ */
    public C2005nn[] newArray(int i) {
        return new C2005nn[i];
    }
}
