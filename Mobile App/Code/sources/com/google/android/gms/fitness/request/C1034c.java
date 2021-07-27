package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.BleDevice;

/* renamed from: com.google.android.gms.fitness.request.c */
public class C1034c implements Parcelable.Creator<C1033b> {
    /* renamed from: a */
    static void m1889a(C1033b bVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, bVar.getDeviceAddress(), false);
        C0723b.m775c(parcel, 1000, bVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) bVar.mo12737jQ(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bI */
    public C1033b createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        BleDevice bleDevice = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        bleDevice = (BleDevice) C0721a.m716a(parcel, F, BleDevice.CREATOR);
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
            return new C1033b(i, str, bleDevice);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dc */
    public C1033b[] newArray(int i) {
        return new C1033b[i];
    }
}
