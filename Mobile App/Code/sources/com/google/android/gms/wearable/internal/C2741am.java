package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.am */
public class C2741am implements Parcelable.Creator<C2740al> {
    /* renamed from: a */
    static void m8064a(C2740al alVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, alVar.f4548CK);
        C0723b.m763a(parcel, 2, alVar.getId(), false);
        C0723b.m763a(parcel, 3, alVar.getDisplayName(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ez */
    public C2740al createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
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
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2740al(i, str, str2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gI */
    public C2740al[] newArray(int i) {
        return new C2740al[i];
    }
}
