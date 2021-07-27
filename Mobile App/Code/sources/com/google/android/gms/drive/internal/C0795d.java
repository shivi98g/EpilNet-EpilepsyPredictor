package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.drive.internal.d */
public class C0795d implements Parcelable.Creator<CancelPendingActionsRequest> {
    /* renamed from: a */
    static void m1088a(CancelPendingActionsRequest cancelPendingActionsRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, cancelPendingActionsRequest.f919CK);
        C0723b.m774b(parcel, 2, cancelPendingActionsRequest.f920Pb, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ab */
    public CancelPendingActionsRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m710C(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CancelPendingActionsRequest(i, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bl */
    public CancelPendingActionsRequest[] newArray(int i) {
        return new CancelPendingActionsRequest[i];
    }
}
