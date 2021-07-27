package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.d */
public class C2704d implements Parcelable.Creator<C2703c> {
    /* renamed from: a */
    static void m7911a(C2703c cVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, cVar.f4531CK);
        C0723b.m763a(parcel, 2, cVar.getName(), false);
        C0723b.m763a(parcel, 3, cVar.getAddress(), false);
        C0723b.m775c(parcel, 4, cVar.getType());
        C0723b.m775c(parcel, 5, cVar.getRole());
        C0723b.m766a(parcel, 6, cVar.isEnabled());
        C0723b.m766a(parcel, 7, cVar.isConnected());
        C0723b.m763a(parcel, 8, cVar.mo19409rj(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: em */
    public C2703c createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
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
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 6:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 7:
                    z2 = C0721a.m724c(parcel, F);
                    break;
                case 8:
                    str3 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2703c(i, str, str2, i2, i3, z, z2, str3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gv */
    public C2703c[] newArray(int i) {
        return new C2703c[i];
    }
}
