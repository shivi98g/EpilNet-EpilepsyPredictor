package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.fitness.request.ab */
public class C1019ab implements Parcelable.Creator<C1018aa> {
    /* renamed from: a */
    static void m1857a(C1018aa aaVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) aaVar.mo12680kb(), i, false);
        C0723b.m775c(parcel, 1000, aaVar.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: bX */
    public C1018aa createFromParcel(Parcel parcel) {
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
            return new C1018aa(i, pendingIntent);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ds */
    public C1018aa[] newArray(int i) {
        return new C1018aa[i];
    }
}
