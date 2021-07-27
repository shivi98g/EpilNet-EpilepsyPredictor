package com.google.android.gms.maps.internal;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.internal.z */
public class C2339z implements Parcelable.Creator<C2338y> {
    /* renamed from: a */
    static void m6802a(C2338y yVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, yVar.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) yVar.mo17785oa(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cZ */
    public C2338y createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Point point = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    point = (Point) C0721a.m716a(parcel, F, Point.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new C2338y(i, point);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eV */
    public C2338y[] newArray(int i) {
        return new C2338y[i];
    }
}
