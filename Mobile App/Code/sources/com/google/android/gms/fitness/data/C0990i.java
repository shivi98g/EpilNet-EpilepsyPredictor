package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.i */
public class C0990i implements Parcelable.Creator<Device> {
    /* renamed from: a */
    static void m1737a(Device device, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, device.getManufacturer(), false);
        C0723b.m775c(parcel, 1000, device.getVersionCode());
        C0723b.m763a(parcel, 2, device.getModel(), false);
        C0723b.m763a(parcel, 3, device.getVersion(), false);
        C0723b.m763a(parcel, 4, device.mo12348jF(), false);
        C0723b.m775c(parcel, 5, device.getType());
        C0723b.m775c(parcel, 6, device.mo12346jC());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bx */
    public Device createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                    case 4:
                        str4 = C0721a.m736o(parcel, F);
                        break;
                    case 5:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 6:
                        i3 = C0721a.m728g(parcel, F);
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
            return new Device(i, str, str2, str3, str4, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cQ */
    public Device[] newArray(int i) {
        return new Device[i];
    }
}
