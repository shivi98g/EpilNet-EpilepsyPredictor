package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataSource;

/* renamed from: com.google.android.gms.fitness.service.a */
public class C1077a implements Parcelable.Creator<FitnessSensorServiceRequest> {
    /* renamed from: a */
    static void m2018a(FitnessSensorServiceRequest fitnessSensorServiceRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) fitnessSensorServiceRequest.getDataSource(), i, false);
        C0723b.m775c(parcel, 1000, fitnessSensorServiceRequest.getVersionCode());
        C0723b.m757a(parcel, 2, fitnessSensorServiceRequest.mo12983kg(), false);
        C0723b.m755a(parcel, 3, fitnessSensorServiceRequest.mo12982jI());
        C0723b.m755a(parcel, 4, fitnessSensorServiceRequest.mo12984kx());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ck */
    public FitnessSensorServiceRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        DataSource dataSource = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        dataSource = (DataSource) C0721a.m716a(parcel, F, DataSource.CREATOR);
                        break;
                    case 2:
                        iBinder = C0721a.m737p(parcel, F);
                        break;
                    case 3:
                        j = C0721a.m730i(parcel, F);
                        break;
                    case 4:
                        j2 = C0721a.m730i(parcel, F);
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
            return new FitnessSensorServiceRequest(i, dataSource, iBinder, j, j2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dF */
    public FitnessSensorServiceRequest[] newArray(int i) {
        return new FitnessSensorServiceRequest[i];
    }
}
