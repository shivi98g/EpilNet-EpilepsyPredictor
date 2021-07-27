package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.au */
public class C2749au implements Parcelable.Creator<C2748at> {
    /* renamed from: a */
    static void m8077a(C2748at atVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, atVar.versionCode);
        C0723b.m775c(parcel, 2, atVar.statusCode);
        C0723b.m775c(parcel, 3, atVar.ayd);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eD */
    public C2748at createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
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
                    i3 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2748at(i, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gM */
    public C2748at[] newArray(int i) {
        return new C2748at[i];
    }
}
