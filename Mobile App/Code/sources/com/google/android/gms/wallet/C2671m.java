package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wallet.m */
public class C2671m implements Parcelable.Creator<NotifyTransactionStatusRequest> {
    /* renamed from: a */
    static void m7838a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, notifyTransactionStatusRequest.f4496CK);
        C0723b.m763a(parcel, 2, notifyTransactionStatusRequest.auL, false);
        C0723b.m775c(parcel, 3, notifyTransactionStatusRequest.status);
        C0723b.m763a(parcel, 4, notifyTransactionStatusRequest.avL, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dU */
    public NotifyTransactionStatusRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        int i2 = 0;
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
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new NotifyTransactionStatusRequest(i, str, i2, str2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gb */
    public NotifyTransactionStatusRequest[] newArray(int i) {
        return new NotifyTransactionStatusRequest[i];
    }
}
