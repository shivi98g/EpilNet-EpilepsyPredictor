package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1821kv;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.kx */
public class C1825kx implements Parcelable.Creator<C1821kv.C1822a> {
    /* renamed from: a */
    static void m5483a(C1821kv.C1822a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, aVar.versionCode);
        C0723b.m763a(parcel, 2, aVar.className, false);
        C0723b.m776c(parcel, 3, aVar.f3994NY, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: P */
    public C1821kv.C1822a createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    arrayList = C0721a.m723c(parcel, F, C1821kv.C1823b.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1821kv.C1822a(i, str, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aQ */
    public C1821kv.C1822a[] newArray(int i) {
        return new C1821kv.C1822a[i];
    }
}
