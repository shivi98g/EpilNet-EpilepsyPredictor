package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.n */
public class C0999n implements Parcelable.Creator<RawDataPoint> {
    /* renamed from: a */
    static void m1754a(RawDataPoint rawDataPoint, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m755a(parcel, 1, rawDataPoint.f1403Ud);
        C0723b.m775c(parcel, 1000, rawDataPoint.f1400CK);
        C0723b.m755a(parcel, 2, rawDataPoint.f1404Ue);
        C0723b.m769a(parcel, 3, (T[]) rawDataPoint.f1405Uf, i, false);
        C0723b.m775c(parcel, 4, rawDataPoint.f1401UJ);
        C0723b.m775c(parcel, 5, rawDataPoint.f1402UK);
        C0723b.m755a(parcel, 6, rawDataPoint.f1406Uh);
        C0723b.m755a(parcel, 7, rawDataPoint.f1407Ui);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bA */
    public RawDataPoint createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        Value[] valueArr = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 2:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 3:
                        valueArr = (Value[]) C0721a.m722b(parcel2, F, Value.CREATOR);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 5:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 6:
                        j3 = C0721a.m730i(parcel2, F);
                        break;
                    case 7:
                        j4 = C0721a.m730i(parcel2, F);
                        break;
                    default:
                        C0721a.m721b(parcel2, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new RawDataPoint(i, j, j2, valueArr, i2, i3, j3, j4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: cT */
    public RawDataPoint[] newArray(int i) {
        return new RawDataPoint[i];
    }
}
