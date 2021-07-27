package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.data.o */
public class C1000o implements Parcelable.Creator<RawDataSet> {
    /* renamed from: a */
    static void m1757a(RawDataSet rawDataSet, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, rawDataSet.f1409UJ);
        C0723b.m775c(parcel, 1000, rawDataSet.f1408CK);
        C0723b.m775c(parcel, 2, rawDataSet.f1410UL);
        C0723b.m776c(parcel, 3, rawDataSet.f1411UM, false);
        C0723b.m766a(parcel, 4, rawDataSet.f1412Uc);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bB */
    public RawDataSet createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        ArrayList<RawDataPoint> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        i3 = C0721a.m728g(parcel, F);
                        break;
                    case 3:
                        arrayList = C0721a.m723c(parcel, F, RawDataPoint.CREATOR);
                        break;
                    case 4:
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
            return new RawDataSet(i, i2, i3, arrayList, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cU */
    public RawDataSet[] newArray(int i) {
        return new RawDataSet[i];
    }
}
