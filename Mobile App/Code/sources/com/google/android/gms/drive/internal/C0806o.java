package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.o */
public class C0806o implements Parcelable.Creator<DisconnectRequest> {
    /* renamed from: a */
    static void m1121a(DisconnectRequest disconnectRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, disconnectRequest.f955CK);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ak */
    public DisconnectRequest createFromParcel(Parcel parcel) {
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
            return new DisconnectRequest(i);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bv */
    public DisconnectRequest[] newArray(int i) {
        return new DisconnectRequest[i];
    }
}
