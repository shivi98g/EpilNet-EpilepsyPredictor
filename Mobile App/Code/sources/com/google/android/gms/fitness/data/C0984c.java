package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.data.c */
public class C0984c implements Parcelable.Creator<BleDevice> {
    /* renamed from: a */
    static void m1719a(BleDevice bleDevice, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, bleDevice.getAddress(), false);
        C0723b.m775c(parcel, 1000, bleDevice.getVersionCode());
        C0723b.m763a(parcel, 2, bleDevice.getName(), false);
        C0723b.m774b(parcel, 3, bleDevice.getSupportedProfiles(), false);
        C0723b.m776c(parcel, 4, bleDevice.getDataTypes(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: br */
    public BleDevice createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<DataType> arrayList2 = null;
        int i = 0;
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
                        arrayList = C0721a.m710C(parcel, F);
                        break;
                    case 4:
                        arrayList2 = C0721a.m723c(parcel, F, DataType.CREATOR);
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
            return new BleDevice(i, str, str2, arrayList, arrayList2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cI */
    public BleDevice[] newArray(int i) {
        return new BleDevice[i];
    }
}
