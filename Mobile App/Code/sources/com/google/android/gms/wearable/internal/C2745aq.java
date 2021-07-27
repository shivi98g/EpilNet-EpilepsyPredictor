package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.aq */
public class C2745aq implements Parcelable.Creator<C2744ap> {
    /* renamed from: a */
    static void m8070a(C2744ap apVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, apVar.versionCode);
        C0723b.m775c(parcel, 2, apVar.statusCode);
        C0723b.m759a(parcel, 3, (Parcelable) apVar.axM, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eB */
    public C2744ap createFromParcel(Parcel parcel) {
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
            return new C2744ap(i, i2, mVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gK */
    public C2744ap[] newArray(int i) {
        return new C2744ap[i];
    }
}
