package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.nm */
public class C2004nm implements Parcelable.Creator<C2003nl> {
    /* renamed from: a */
    static void m5949a(C2003nl nlVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) nlVar.f4145We, i, false);
        C0723b.m775c(parcel, 1000, nlVar.getVersionCode());
        C0723b.m766a(parcel, 2, nlVar.ahh);
        C0723b.m766a(parcel, 3, nlVar.ahi);
        C0723b.m766a(parcel, 4, nlVar.ahj);
        C0723b.m776c(parcel, 5, nlVar.ahk, false);
        C0723b.m763a(parcel, 6, nlVar.mTag, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cM */
    public C2003nl createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList arrayList = C2003nl.ahg;
        boolean z = true;
        boolean z2 = true;
        LocationRequest locationRequest = null;
        String str = null;
        int i = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        locationRequest = (LocationRequest) C0721a.m716a(parcel, F, LocationRequest.CREATOR);
                        break;
                    case 2:
                        z3 = C0721a.m724c(parcel, F);
                        break;
                    case 3:
                        z = C0721a.m724c(parcel, F);
                        break;
                    case 4:
                        z2 = C0721a.m724c(parcel, F);
                        break;
                    case 5:
                        arrayList = C0721a.m723c(parcel, F, C1971nd.CREATOR);
                        break;
                    case 6:
                        str = C0721a.m736o(parcel, F);
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
            return new C2003nl(i, locationRequest, z3, z, z2, arrayList, str);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eG */
    public C2003nl[] newArray(int i) {
        return new C2003nl[i];
    }
}
