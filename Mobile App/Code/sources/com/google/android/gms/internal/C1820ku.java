package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1815kr;
import com.google.android.gms.internal.C1821kv;

/* renamed from: com.google.android.gms.internal.ku */
public class C1820ku implements Parcelable.Creator<C1821kv.C1823b> {
    /* renamed from: a */
    static void m5467a(C1821kv.C1823b bVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, bVar.versionCode);
        C0723b.m763a(parcel, 2, bVar.f3996fv, false);
        C0723b.m759a(parcel, 3, (Parcelable) bVar.f3995NZ, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: N */
    public C1821kv.C1823b createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        C1815kr.C1816a aVar = null;
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
                    aVar = (C1815kr.C1816a) C0721a.m716a(parcel, F, C1815kr.C1816a.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1821kv.C1823b(i, str, aVar);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aO */
    public C1821kv.C1823b[] newArray(int i) {
        return new C1821kv.C1823b[i];
    }
}
