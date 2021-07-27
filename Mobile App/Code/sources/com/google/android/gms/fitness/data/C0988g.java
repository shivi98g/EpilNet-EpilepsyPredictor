package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.data.g */
public class C0988g implements Parcelable.Creator<DataSource> {
    /* renamed from: a */
    static void m1731a(DataSource dataSource, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) dataSource.getDataType(), i, false);
        C0723b.m775c(parcel, 1000, dataSource.getVersionCode());
        C0723b.m763a(parcel, 2, dataSource.getName(), false);
        C0723b.m775c(parcel, 3, dataSource.getType());
        C0723b.m759a(parcel, 4, (Parcelable) dataSource.getDevice(), i, false);
        C0723b.m759a(parcel, 5, (Parcelable) dataSource.mo12312jx(), i, false);
        C0723b.m763a(parcel, 6, dataSource.getStreamName(), false);
        C0723b.m766a(parcel, 7, dataSource.mo12313jz());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bv */
    public DataSource createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        DataType dataType = null;
        String str = null;
        Device device = null;
        C0982a aVar = null;
        String str2 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        dataType = (DataType) C0721a.m716a(parcel, F, DataType.CREATOR);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 4:
                        device = (Device) C0721a.m716a(parcel, F, Device.CREATOR);
                        break;
                    case 5:
                        aVar = (C0982a) C0721a.m716a(parcel, F, C0982a.CREATOR);
                        break;
                    case 6:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 7:
                        z = C0721a.m724c(parcel, F);
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
            return new DataSource(i, dataType, str, i2, device, aVar, str2, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cO */
    public DataSource[] newArray(int i) {
        return new DataSource[i];
    }
}
