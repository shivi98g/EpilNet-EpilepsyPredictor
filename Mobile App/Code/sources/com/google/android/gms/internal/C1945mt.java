package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSource;

/* renamed from: com.google.android.gms.internal.mt */
public class C1945mt implements Parcelable.Creator<C1944ms> {
    /* renamed from: a */
    static void m5737a(C1944ms msVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) msVar.getDataSource(), i, false);
        C0723b.m775c(parcel, 1000, msVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bH */
    public C1944ms createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DataSource dataSource = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                dataSource = (DataSource) C0721a.m716a(parcel, F, DataSource.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1944ms(i, dataSource);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: db */
    public C1944ms[] newArray(int i) {
        return new C1944ms[i];
    }
}
