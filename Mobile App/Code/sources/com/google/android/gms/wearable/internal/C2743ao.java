package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.ao */
public class C2743ao implements Parcelable.Creator<C2742an> {
    /* renamed from: a */
    static void m8067a(C2742an anVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, anVar.versionCode);
        C0723b.m763a(parcel, 2, anVar.packageName, false);
        C0723b.m763a(parcel, 3, anVar.label, false);
        C0723b.m755a(parcel, 4, anVar.ayc);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eA */
    public C2742an createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        long j = 0;
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
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    j = C0721a.m730i(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2742an(i, str, str2, j);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gJ */
    public C2742an[] newArray(int i) {
        return new C2742an[i];
    }
}
