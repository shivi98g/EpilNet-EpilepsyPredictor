package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataType;

/* renamed from: com.google.android.gms.fitness.request.n */
public class C1051n implements Parcelable.Creator<C1048m> {
    /* renamed from: a */
    static void m1920a(C1048m mVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) mVar.getDataType(), i, false);
        C0723b.m775c(parcel, 1000, mVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bP */
    public C1048m createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DataType dataType = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                dataType = (DataType) C0721a.m716a(parcel, F, DataType.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1048m(i, dataType);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dj */
    public C1048m[] newArray(int i) {
        return new C1048m[i];
    }
}
