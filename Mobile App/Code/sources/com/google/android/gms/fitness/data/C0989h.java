package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.data.h */
public class C0989h implements Parcelable.Creator<DataType> {
    /* renamed from: a */
    static void m1734a(DataType dataType, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, dataType.getName(), false);
        C0723b.m775c(parcel, 1000, dataType.getVersionCode());
        C0723b.m776c(parcel, 2, dataType.getFields(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bw */
    public DataType createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        ArrayList<Field> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        arrayList = C0721a.m723c(parcel, F, Field.CREATOR);
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
            return new DataType(i, str, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cP */
    public DataType[] newArray(int i) {
        return new DataType[i];
    }
}
