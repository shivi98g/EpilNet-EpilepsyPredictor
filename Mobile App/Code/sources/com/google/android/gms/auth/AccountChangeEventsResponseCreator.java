package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

public class AccountChangeEventsResponseCreator implements Parcelable.Creator<AccountChangeEventsResponse> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m371a(AccountChangeEventsResponse accountChangeEventsResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, accountChangeEventsResponse.f450Ef);
        C0723b.m776c(parcel, 2, accountChangeEventsResponse.f451mp, false);
        C0723b.m751H(parcel, H);
    }

    public AccountChangeEventsResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList = C0721a.m723c(parcel, F, AccountChangeEvent.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new AccountChangeEventsResponse(i, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public AccountChangeEventsResponse[] newArray(int i) {
        return new AccountChangeEventsResponse[i];
    }
}
