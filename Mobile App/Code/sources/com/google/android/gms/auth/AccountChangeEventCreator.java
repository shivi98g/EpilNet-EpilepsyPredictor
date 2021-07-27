package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class AccountChangeEventCreator implements Parcelable.Creator<AccountChangeEvent> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m369a(AccountChangeEvent accountChangeEvent, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, accountChangeEvent.f442Ef);
        C0723b.m755a(parcel, 2, accountChangeEvent.f443Eg);
        C0723b.m763a(parcel, 3, accountChangeEvent.f441DZ, false);
        C0723b.m775c(parcel, 4, accountChangeEvent.f444Eh);
        C0723b.m775c(parcel, 5, accountChangeEvent.f445Ei);
        C0723b.m763a(parcel, 6, accountChangeEvent.f446Ej, false);
        C0723b.m751H(parcel, H);
    }

    public AccountChangeEvent createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    j = C0721a.m730i(parcel, F);
                    break;
                case 3:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 5:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 6:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new AccountChangeEvent(i, j, str, i2, i3, str2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public AccountChangeEvent[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
