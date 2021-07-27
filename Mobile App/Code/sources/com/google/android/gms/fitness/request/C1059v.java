package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.request.v */
public class C1059v implements Parcelable.Creator<C1058u> {
    /* renamed from: a */
    static void m1947a(C1058u uVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) uVar.mo12839kb(), i, false);
        C0723b.m775c(parcel, 1000, uVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bU */
    public C1058u createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                pendingIntent = (PendingIntent) C0721a.m716a(parcel, F, PendingIntent.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new C1058u(i, pendingIntent);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: dp */
    public C1058u[] newArray(int i) {
        return new C1058u[i];
    }
}
