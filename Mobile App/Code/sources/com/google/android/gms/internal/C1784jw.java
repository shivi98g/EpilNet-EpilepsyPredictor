package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1744jg;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.jw */
public class C1784jw implements Parcelable.Creator<C1744jg.C1745a> {
    /* renamed from: a */
    static void m5350a(C1744jg.C1745a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, aVar.getAccountName(), false);
        C0723b.m775c(parcel, 1000, aVar.getVersionCode());
        C0723b.m774b(parcel, 2, aVar.mo15798ho(), false);
        C0723b.m775c(parcel, 3, aVar.mo15797hn());
        C0723b.m763a(parcel, 4, aVar.mo15799hq(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: E */
    public C1744jg.C1745a createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        arrayList = C0721a.m710C(parcel, F);
                        break;
                    case 3:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 4:
                        str2 = C0721a.m736o(parcel, F);
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
            return new C1744jg.C1745a(i, str, arrayList, i2, str2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aG */
    public C1744jg.C1745a[] newArray(int i) {
        return new C1744jg.C1745a[i];
    }
}
