package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C1643hl;

/* renamed from: com.google.android.gms.internal.hm */
public class C1646hm implements Parcelable.Creator<C1643hl.C1644a> {
    /* renamed from: a */
    static void m4807a(C1643hl.C1644a aVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) aVar.f3635Dc, i, false);
        C0723b.m775c(parcel, 1000, aVar.f3634CK);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: N */
    public C1643hl.C1644a[] newArray(int i) {
        return new C1643hl.C1644a[i];
    }

    /* renamed from: p */
    public C1643hl.C1644a createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Account account = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                account = (Account) C0721a.m716a(parcel, F, Account.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1643hl.C1644a(i, account);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
