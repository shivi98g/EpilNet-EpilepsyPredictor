package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.ac */
public class C2710ac implements Parcelable.Creator<C2709ab> {
    /* renamed from: a */
    static void m7933a(C2709ab abVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, abVar.versionCode);
        C0723b.m775c(parcel, 2, abVar.statusCode);
        C0723b.m759a(parcel, 3, (Parcelable) abVar.axO, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ex */
    public C2709ab createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        C2740al alVar = null;
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
                    alVar = (C2740al) C0721a.m716a(parcel, F, C2740al.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2709ab(i, i2, alVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gG */
    public C2709ab[] newArray(int i) {
        return new C2709ab[i];
    }
}
