package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.internal.dz */
public class C1466dz implements Parcelable.Creator<C1468ea> {
    /* renamed from: a */
    static void m4340a(C1468ea eaVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, eaVar.versionCode);
        C0723b.m757a(parcel, 3, eaVar.mo15187cu(), false);
        C0723b.m757a(parcel, 4, eaVar.mo15188cv(), false);
        C0723b.m757a(parcel, 5, eaVar.mo15189cw(), false);
        C0723b.m757a(parcel, 6, eaVar.mo15186ct(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: g */
    public C1468ea createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1) {
                switch (aH) {
                    case 3:
                        iBinder = C0721a.m737p(parcel, F);
                        break;
                    case 4:
                        iBinder2 = C0721a.m737p(parcel, F);
                        break;
                    case 5:
                        iBinder3 = C0721a.m737p(parcel, F);
                        break;
                    case 6:
                        iBinder4 = C0721a.m737p(parcel, F);
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
            return new C1468ea(i, iBinder, iBinder2, iBinder3, iBinder4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: o */
    public C1468ea[] newArray(int i) {
        return new C1468ea[i];
    }
}
