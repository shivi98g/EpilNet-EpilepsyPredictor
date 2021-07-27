package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.mr */
public class C1943mr implements Parcelable.Creator<C1942mq> {
    /* renamed from: a */
    static void m5734a(C1942mq mqVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, mqVar.getDataTypes(), false);
        C0723b.m775c(parcel, 1000, mqVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bG */
    public C1942mq createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList<DataType> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                arrayList = C0721a.m723c(parcel, F, DataType.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1942mq(i, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: da */
    public C1942mq[] newArray(int i) {
        return new C1942mq[i];
    }
}
