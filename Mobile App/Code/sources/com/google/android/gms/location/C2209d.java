package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.location.d */
public class C2209d implements Parcelable.Creator<LocationRequest> {
    /* renamed from: a */
    static void m6633a(LocationRequest locationRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, locationRequest.mPriority);
        C0723b.m775c(parcel, 1000, locationRequest.getVersionCode());
        C0723b.m755a(parcel, 2, locationRequest.agr);
        C0723b.m755a(parcel, 3, locationRequest.ags);
        C0723b.m766a(parcel, 4, locationRequest.f4284Wg);
        C0723b.m755a(parcel, 5, locationRequest.age);
        C0723b.m775c(parcel, 6, locationRequest.agt);
        C0723b.m754a(parcel, 7, locationRequest.agu);
        C0723b.m755a(parcel, 8, locationRequest.agv);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cJ */
    public LocationRequest createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 102;
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 2:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 3:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 4:
                        z = C0721a.m724c(parcel2, F);
                        break;
                    case 5:
                        j3 = C0721a.m730i(parcel2, F);
                        break;
                    case 6:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 7:
                        f = C0721a.m733l(parcel2, F);
                        break;
                    case 8:
                        j4 = C0721a.m730i(parcel2, F);
                        break;
                    default:
                        C0721a.m721b(parcel2, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new LocationRequest(i, i2, j, j2, z, j3, i3, f, j4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: eA */
    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
