package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.he */
public class C1636he implements Parcelable.Creator<C1634hd> {
    /* renamed from: a */
    static void m4794a(C1634hd hdVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m769a(parcel, 1, (T[]) hdVar.f3613CL, i, false);
        C0723b.m775c(parcel, 1000, hdVar.f3612CK);
        C0723b.m763a(parcel, 2, hdVar.f3614CM, false);
        C0723b.m766a(parcel, 3, hdVar.f3615CN);
        C0723b.m759a(parcel, 4, (Parcelable) hdVar.account, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: J */
    public C1634hd[] newArray(int i) {
        return new C1634hd[i];
    }

    /* renamed from: l */
    public C1634hd createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        C1639hh[] hhVarArr = null;
        String str = null;
        Account account = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        hhVarArr = (C1639hh[]) C0721a.m722b(parcel, F, C1639hh.CREATOR);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        z = C0721a.m724c(parcel, F);
                        break;
                    case 4:
                        account = (Account) C0721a.m716a(parcel, F, Account.CREATOR);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1634hd(i, hhVarArr, str, z, account);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
