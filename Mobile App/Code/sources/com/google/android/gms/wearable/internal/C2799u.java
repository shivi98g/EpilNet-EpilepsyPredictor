package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.wearable.C2703c;

/* renamed from: com.google.android.gms.wearable.internal.u */
public class C2799u implements Parcelable.Creator<C2798t> {
    /* renamed from: a */
    static void m8189a(C2798t tVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, tVar.versionCode);
        C0723b.m775c(parcel, 2, tVar.statusCode);
        C0723b.m769a(parcel, 3, (T[]) tVar.axK, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: et */
    public C2798t createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        C2703c[] cVarArr = null;
        int i2 = 0;
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
                    cVarArr = (C2703c[]) C0721a.m722b(parcel, F, C2703c.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2798t(i, i2, cVarArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gC */
    public C2798t[] newArray(int i) {
        return new C2798t[i];
    }
}
