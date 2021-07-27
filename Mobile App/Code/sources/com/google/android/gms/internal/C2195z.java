package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.z */
public class C2195z implements Parcelable.Creator<C2194y> {
    /* renamed from: a */
    static void m6602a(C2194y yVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, yVar.versionCode);
        C0723b.m766a(parcel, 2, yVar.f4274mi);
        C0723b.m766a(parcel, 3, yVar.f4275ms);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: a */
    public C2194y createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 3:
                    z2 = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2194y(i, z, z2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: b */
    public C2194y[] newArray(int i) {
        return new C2194y[i];
    }
}
