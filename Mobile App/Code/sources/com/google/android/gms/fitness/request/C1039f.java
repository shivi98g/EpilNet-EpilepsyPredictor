package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSet;

/* renamed from: com.google.android.gms.fitness.request.f */
public class C1039f implements Parcelable.Creator<C1036e> {
    /* renamed from: a */
    static void m1900a(C1036e eVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) eVar.mo12752jH(), i, false);
        C0723b.m775c(parcel, 1000, eVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bK */
    public C1036e createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DataSet dataSet = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                dataSet = (DataSet) C0721a.m716a(parcel, F, DataSet.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1036e(i, dataSet);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: de */
    public C1036e[] newArray(int i) {
        return new C1036e[i];
    }
}
