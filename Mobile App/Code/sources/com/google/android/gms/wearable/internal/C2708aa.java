package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.aa */
public class C2708aa implements Parcelable.Creator<C2804z> {
    /* renamed from: a */
    static void m7930a(C2804z zVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, zVar.versionCode);
        C0723b.m775c(parcel, 2, zVar.statusCode);
        C0723b.m759a(parcel, 3, (Parcelable) zVar.axN, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ew */
    public C2804z createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    parcelFileDescriptor = (ParcelFileDescriptor) C0721a.m716a(parcel, F, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2804z(i, i2, parcelFileDescriptor);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gF */
    public C2804z[] newArray(int i) {
        return new C2804z[i];
    }
}
