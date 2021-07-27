package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.request.r */
public class C1055r implements Parcelable.Creator<C1054q> {
    /* renamed from: a */
    static void m1936a(C1054q qVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m757a(parcel, 1, qVar.mo12820kg(), false);
        C0723b.m775c(parcel, 1000, qVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) qVar.mo12819kb(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bR */
    public C1054q createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        IBinder iBinder = null;
        int i = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        iBinder = C0721a.m737p(parcel, F);
                        break;
                    case 2:
                        pendingIntent = (PendingIntent) C0721a.m716a(parcel, F, PendingIntent.CREATOR);
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
            return new C1054q(i, iBinder, pendingIntent);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dm */
    public C1054q[] newArray(int i) {
        return new C1054q[i];
    }
}
