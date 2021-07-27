package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.b */
public class C0983b implements Parcelable.Creator<C0982a> {
    /* renamed from: a */
    static void m1716a(C0982a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, aVar.getPackageName(), false);
        C0723b.m775c(parcel, 1000, aVar.getVersionCode());
        C0723b.m763a(parcel, 2, aVar.getVersion(), false);
        C0723b.m763a(parcel, 3, aVar.mo12436jk(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bq */
    public C0982a createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        str3 = C0721a.m736o(parcel, F);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C0982a(i, str, str2, str3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cH */
    public C0982a[] newArray(int i) {
        return new C0982a[i];
    }
}
