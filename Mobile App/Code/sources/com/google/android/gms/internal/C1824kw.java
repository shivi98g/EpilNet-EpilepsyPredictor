package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1821kv;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.kw */
public class C1824kw implements Parcelable.Creator<C1821kv> {
    /* renamed from: a */
    static void m5480a(C1821kv kvVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, kvVar.getVersionCode());
        C0723b.m776c(parcel, 2, kvVar.mo16045hZ(), false);
        C0723b.m763a(parcel, 3, kvVar.mo16046ia(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: O */
    public C1821kv createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m723c(parcel, F, C1821kv.C1822a.CREATOR);
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1821kv(i, arrayList, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aP */
    public C1821kv[] newArray(int i) {
        return new C1821kv[i];
    }
}
