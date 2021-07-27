package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.jk */
public class C1749jk implements Parcelable.Creator<C1748jj> {
    /* renamed from: a */
    static void m5177a(C1748jj jjVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, jjVar.version);
        C0723b.m775c(parcel, 2, jjVar.f3893MD);
        C0723b.m775c(parcel, 3, jjVar.f3894ME);
        C0723b.m763a(parcel, 4, jjVar.f3895MF, false);
        C0723b.m757a(parcel, 5, jjVar.f3896MG, false);
        C0723b.m769a(parcel, 6, (T[]) jjVar.f3897MH, i, false);
        C0723b.m756a(parcel, 7, jjVar.f3898MI, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: D */
    public C1748jj createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
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
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 5:
                    iBinder = C0721a.m737p(parcel, F);
                    break;
                case 6:
                    scopeArr = (Scope[]) C0721a.m722b(parcel, F, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C0721a.m738q(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1748jj(i, i2, i3, str, iBinder, scopeArr, bundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aC */
    public C1748jj[] newArray(int i) {
        return new C1748jj[i];
    }
}
