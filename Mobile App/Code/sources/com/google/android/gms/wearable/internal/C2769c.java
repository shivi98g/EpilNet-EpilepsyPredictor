package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.c */
public class C2769c implements Parcelable.Creator<C2765b> {
    /* renamed from: a */
    static void m8127a(C2765b bVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, bVar.f4552CK);
        C0723b.m757a(parcel, 2, bVar.mo19549rm(), false);
        C0723b.m769a(parcel, 3, (T[]) bVar.axw, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eo */
    public C2765b createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        IBinder iBinder = null;
        int i = 0;
        IntentFilter[] intentFilterArr = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    iBinder = C0721a.m737p(parcel, F);
                    break;
                case 3:
                    intentFilterArr = (IntentFilter[]) C0721a.m722b(parcel, F, IntentFilter.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2765b(i, iBinder, intentFilterArr);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gx */
    public C2765b[] newArray(int i) {
        return new C2765b[i];
    }
}
