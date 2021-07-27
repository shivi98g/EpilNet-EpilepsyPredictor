package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.request.ac */
public class C1020ac implements Parcelable.Creator<StartBleScanRequest> {
    /* renamed from: a */
    static void m1860a(StartBleScanRequest startBleScanRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, startBleScanRequest.getDataTypes(), false);
        C0723b.m775c(parcel, 1000, startBleScanRequest.getVersionCode());
        C0723b.m757a(parcel, 2, startBleScanRequest.mo12664km(), false);
        C0723b.m775c(parcel, 3, startBleScanRequest.getTimeoutSecs());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bY */
    public StartBleScanRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList<DataType> arrayList = null;
        int i = 0;
        IBinder iBinder = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, DataType.CREATOR);
                        break;
                    case 2:
                        iBinder = C0721a.m737p(parcel, F);
                        break;
                    case 3:
                        i2 = C0721a.m728g(parcel, F);
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
            return new StartBleScanRequest(i, arrayList, iBinder, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dt */
    public StartBleScanRequest[] newArray(int i) {
        return new StartBleScanRequest[i];
    }
}
