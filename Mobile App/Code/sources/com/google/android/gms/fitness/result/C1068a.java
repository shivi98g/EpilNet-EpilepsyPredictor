package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.result.a */
public class C1068a implements Parcelable.Creator<BleDevicesResult> {
    /* renamed from: a */
    static void m1989a(BleDevicesResult bleDevicesResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, bleDevicesResult.getClaimedBleDevices(), false);
        C0723b.m775c(parcel, 1000, bleDevicesResult.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) bleDevicesResult.getStatus(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cd */
    public BleDevicesResult createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList<BleDevice> arrayList = null;
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, BleDevice.CREATOR);
                        break;
                    case 2:
                        status = (Status) C0721a.m716a(parcel, F, Status.CREATOR);
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
            return new BleDevicesResult(i, arrayList, status);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dy */
    public BleDevicesResult[] newArray(int i) {
        return new BleDevicesResult[i];
    }
}
