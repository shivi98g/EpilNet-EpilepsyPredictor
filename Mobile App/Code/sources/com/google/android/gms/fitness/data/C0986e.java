package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.e */
public class C0986e implements Parcelable.Creator<DataPoint> {
    /* renamed from: a */
    static void m1725a(DataPoint dataPoint, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) dataPoint.getDataSource(), i, false);
        C0723b.m775c(parcel, 1000, dataPoint.getVersionCode());
        C0723b.m755a(parcel, 3, dataPoint.getTimestampNanos());
        C0723b.m755a(parcel, 4, dataPoint.mo12275ju());
        C0723b.m769a(parcel, 5, (T[]) dataPoint.mo12272jr(), i, false);
        C0723b.m759a(parcel, 6, (Parcelable) dataPoint.getOriginalDataSource(), i, false);
        C0723b.m755a(parcel, 7, dataPoint.mo12273js());
        C0723b.m755a(parcel, 8, dataPoint.mo12274jt());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bt */
    public DataPoint createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        DataSource dataSource = null;
        Value[] valueArr = null;
        DataSource dataSource2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                dataSource = (DataSource) C0721a.m716a(parcel2, F, DataSource.CREATOR);
            } else if (aH != 1000) {
                switch (aH) {
                    case 3:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 4:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 5:
                        valueArr = (Value[]) C0721a.m722b(parcel2, F, Value.CREATOR);
                        break;
                    case 6:
                        dataSource2 = (DataSource) C0721a.m716a(parcel2, F, DataSource.CREATOR);
                        break;
                    case 7:
                        j3 = C0721a.m730i(parcel2, F);
                        break;
                    case 8:
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
            return new DataPoint(i, dataSource, j, j2, valueArr, dataSource2, j3, j4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: cM */
    public DataPoint[] newArray(int i) {
        return new DataPoint[i];
    }
}
