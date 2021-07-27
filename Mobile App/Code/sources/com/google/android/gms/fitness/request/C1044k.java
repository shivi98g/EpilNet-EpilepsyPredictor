package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.request.k */
public class C1044k implements Parcelable.Creator<C1043j> {
    /* renamed from: a */
    static void m1913a(C1043j jVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, jVar.getName(), false);
        C0723b.m775c(parcel, 1000, jVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bO */
    public C1043j createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                str = C0721a.m736o(parcel, F);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1043j(i, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: di */
    public C1043j[] newArray(int i) {
        return new C1043j[i];
    }
}
