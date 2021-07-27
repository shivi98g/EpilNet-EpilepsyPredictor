package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.wearable.internal.as */
public class C2747as implements Parcelable.Creator<C2746ar> {
    /* renamed from: a */
    static void m8074a(C2746ar arVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, arVar.f4550CK);
        C0723b.m757a(parcel, 2, arVar.mo19529rm(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: eC */
    public C2746ar createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    iBinder = C0721a.m737p(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2746ar(i, iBinder);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: gL */
    public C2746ar[] newArray(int i) {
        return new C2746ar[i];
    }
}
