package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class AccountChangeEventsRequestCreator implements Parcelable.Creator<AccountChangeEventsRequest> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m370a(AccountChangeEventsRequest accountChangeEventsRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, accountChangeEventsRequest.f448Ef);
        C0723b.m775c(parcel, 2, accountChangeEventsRequest.f449Ei);
        C0723b.m763a(parcel, 3, accountChangeEventsRequest.f447DZ, false);
        C0723b.m751H(parcel, H);
    }

    public AccountChangeEventsRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
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
                    str = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new AccountChangeEventsRequest(i, i2, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public AccountChangeEventsRequest[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }
}
