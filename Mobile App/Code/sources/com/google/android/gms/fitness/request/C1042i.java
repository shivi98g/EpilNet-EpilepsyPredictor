package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fitness.request.i */
public class C1042i implements Parcelable.Creator<DataTypeCreateRequest> {
    /* renamed from: a */
    static void m1909a(DataTypeCreateRequest dataTypeCreateRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, dataTypeCreateRequest.getName(), false);
        C0723b.m775c(parcel, 1000, dataTypeCreateRequest.getVersionCode());
        C0723b.m776c(parcel, 2, dataTypeCreateRequest.getFields(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bN */
    public DataTypeCreateRequest createFromParcel(Parcel parcel) {
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
            return new DataTypeCreateRequest(i, str, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dh */
    public DataTypeCreateRequest[] newArray(int i) {
        return new DataTypeCreateRequest[i];
    }
}
