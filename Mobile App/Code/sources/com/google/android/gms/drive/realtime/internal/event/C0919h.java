package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.event.h */
public class C0919h implements Parcelable.Creator<ValuesAddedDetails> {
    /* renamed from: a */
    static void m1436a(ValuesAddedDetails valuesAddedDetails, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, valuesAddedDetails.f1264CK);
        C0723b.m775c(parcel, 2, valuesAddedDetails.mIndex);
        C0723b.m775c(parcel, 3, valuesAddedDetails.f1265SO);
        C0723b.m775c(parcel, 4, valuesAddedDetails.f1266SP);
        C0723b.m763a(parcel, 5, valuesAddedDetails.f1267Tk, false);
        C0723b.m775c(parcel, 6, valuesAddedDetails.f1268Tl);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bn */
    public ValuesAddedDetails createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 3:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    i4 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 6:
                    i5 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ValuesAddedDetails(i, i2, i3, i4, str, i5);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cD */
    public ValuesAddedDetails[] newArray(int i) {
        return new ValuesAddedDetails[i];
    }
}
