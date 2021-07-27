package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.b */
public class C0902b implements Parcelable.Creator<EndCompoundOperationRequest> {
    /* renamed from: a */
    static void m1397a(EndCompoundOperationRequest endCompoundOperationRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, endCompoundOperationRequest.f1215CK);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bd */
    public EndCompoundOperationRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            if (C0721a.m720aH(F) != 1) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new EndCompoundOperationRequest(i);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cs */
    public EndCompoundOperationRequest[] newArray(int i) {
        return new EndCompoundOperationRequest[i];
    }
}
