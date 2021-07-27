package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.od */
public class C2023od implements Parcelable.Creator<C2022oc> {
    /* renamed from: a */
    static void m6001a(C2022oc ocVar, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, ocVar.getName(), false);
        C0723b.m775c(parcel, 1000, ocVar.f4158CK);
        C0723b.m759a(parcel, 2, (Parcelable) ocVar.mo16448nx(), i, false);
        C0723b.m763a(parcel, 3, ocVar.getAddress(), false);
        C0723b.m776c(parcel, 4, ocVar.mo16449ny(), false);
        C0723b.m763a(parcel, 5, ocVar.getPhoneNumber(), false);
        C0723b.m763a(parcel, 6, ocVar.mo16450nz(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cU */
    public C2022oc createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        LatLng latLng = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 2:
                        latLng = (LatLng) C0721a.m716a(parcel, F, LatLng.CREATOR);
                        break;
                    case 3:
                        str2 = C0721a.m736o(parcel, F);
                        break;
                    case 4:
                        arrayList = C0721a.m723c(parcel, F, C2020oa.CREATOR);
                        break;
                    case 5:
                        str3 = C0721a.m736o(parcel, F);
                        break;
                    case 6:
                        str4 = C0721a.m736o(parcel, F);
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
            return new C2022oc(i, str, latLng, str2, arrayList, str3, str4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eQ */
    public C2022oc[] newArray(int i) {
        return new C2022oc[i];
    }
}
