package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataType;

/* renamed from: com.google.android.gms.fitness.result.d */
public class C1071d implements Parcelable.Creator<DataTypeResult> {
    /* renamed from: a */
    static void m1998a(DataTypeResult dataTypeResult, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) dataTypeResult.getStatus(), i, false);
        C0723b.m775c(parcel, 1000, dataTypeResult.getVersionCode());
        C0723b.m759a(parcel, 3, (Parcelable) dataTypeResult.getDataType(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cg */
    public DataTypeResult createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        Status status = null;
        int i = 0;
        DataType dataType = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                status = (Status) C0721a.m716a(parcel, F, Status.CREATOR);
            } else if (aH == 3) {
                dataType = (DataType) C0721a.m716a(parcel, F, DataType.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new DataTypeResult(i, status, dataType);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dB */
    public DataTypeResult[] newArray(int i) {
        return new DataTypeResult[i];
    }
}
