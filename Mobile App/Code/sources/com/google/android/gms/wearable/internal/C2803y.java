package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.y */
public class C2803y implements Parcelable.Creator<C2802x> {
    /* renamed from: a */
    static void m8195a(C2802x xVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, xVar.versionCode);
        C0723b.m775c(parcel, 2, xVar.statusCode);
        C0723b.m759a(parcel, 3, (Parcelable) xVar.axM, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ev */
    public C2802x createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        C2791m mVar = null;
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
                    mVar = (C2791m) C0721a.m716a(parcel, F, C2791m.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2802x(i, i2, mVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gE */
    public C2802x[] newArray(int i) {
        return new C2802x[i];
    }
}
