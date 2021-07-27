package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.event.d */
public class C0915d implements Parcelable.Creator<ReferenceShiftedDetails> {
    /* renamed from: a */
    static void m1424a(ReferenceShiftedDetails referenceShiftedDetails, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, referenceShiftedDetails.f1253CK);
        C0723b.m763a(parcel, 2, referenceShiftedDetails.f1254Te, false);
        C0723b.m763a(parcel, 3, referenceShiftedDetails.f1255Tf, false);
        C0723b.m775c(parcel, 4, referenceShiftedDetails.f1256Tg);
        C0723b.m775c(parcel, 5, referenceShiftedDetails.f1257Th);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bj */
    public ReferenceShiftedDetails createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new ReferenceShiftedDetails(i, str, str2, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cz */
    public ReferenceShiftedDetails[] newArray(int i) {
        return new ReferenceShiftedDetails[i];
    }
}
