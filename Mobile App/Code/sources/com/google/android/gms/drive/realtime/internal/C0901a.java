package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.realtime.internal.a */
public class C0901a implements Parcelable.Creator<BeginCompoundOperationRequest> {
    /* renamed from: a */
    static void m1394a(BeginCompoundOperationRequest beginCompoundOperationRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, beginCompoundOperationRequest.f1212CK);
        C0723b.m766a(parcel, 2, beginCompoundOperationRequest.f1213SF);
        C0723b.m763a(parcel, 3, beginCompoundOperationRequest.mName, false);
        C0723b.m766a(parcel, 4, beginCompoundOperationRequest.f1214SG);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bc */
    public BeginCompoundOperationRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    z2 = C0721a.m724c(parcel, F);
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    z = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new BeginCompoundOperationRequest(i, z2, str, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: cr */
    public BeginCompoundOperationRequest[] newArray(int i) {
        return new BeginCompoundOperationRequest[i];
    }
}
