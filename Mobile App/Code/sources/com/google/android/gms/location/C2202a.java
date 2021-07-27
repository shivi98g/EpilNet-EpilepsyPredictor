package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.internal.C2005nn;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.a */
public class C2202a implements Parcelable.Creator<GeofencingRequest> {
    /* renamed from: a */
    static void m6626a(GeofencingRequest geofencingRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m776c(parcel, 1, geofencingRequest.mo17201ng(), false);
        C0723b.m775c(parcel, 1000, geofencingRequest.getVersionCode());
        C0723b.m775c(parcel, 2, geofencingRequest.getInitialTrigger());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cI */
    public GeofencingRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        arrayList = C0721a.m723c(parcel, F, C2005nn.CREATOR);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel, F);
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
            return new GeofencingRequest(i, (List<C2005nn>) arrayList, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: ex */
    public GeofencingRequest[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
