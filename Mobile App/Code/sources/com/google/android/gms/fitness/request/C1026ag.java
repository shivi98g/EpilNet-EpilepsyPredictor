package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.fitness.data.Subscription;

/* renamed from: com.google.android.gms.fitness.request.ag */
public class C1026ag implements Parcelable.Creator<C1023af> {
    /* renamed from: a */
    static void m1873a(C1023af afVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) afVar.mo12701kn(), i, false);
        C0723b.m775c(parcel, 1000, afVar.getVersionCode());
        C0723b.m766a(parcel, 2, afVar.mo12702ko());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ca */
    public C1023af createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Subscription subscription = null;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        subscription = (Subscription) C0721a.m716a(parcel, F, Subscription.CREATOR);
                        break;
                    case 2:
                        z = C0721a.m724c(parcel, F);
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
            return new C1023af(i, subscription, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dv */
    public C1023af[] newArray(int i) {
        return new C1023af[i];
    }
}
