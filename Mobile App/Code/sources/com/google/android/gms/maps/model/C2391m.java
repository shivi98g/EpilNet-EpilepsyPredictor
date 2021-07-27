package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.m */
public class C2391m implements Parcelable.Creator<PolygonOptions> {
    /* renamed from: a */
    static void m6912a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, polygonOptions.getVersionCode());
        C0723b.m776c(parcel, 2, polygonOptions.getPoints(), false);
        C0723b.m777d(parcel, 3, polygonOptions.mo18002of(), false);
        C0723b.m754a(parcel, 4, polygonOptions.getStrokeWidth());
        C0723b.m775c(parcel, 5, polygonOptions.getStrokeColor());
        C0723b.m775c(parcel, 6, polygonOptions.getFillColor());
        C0723b.m754a(parcel, 7, polygonOptions.getZIndex());
        C0723b.m766a(parcel, 8, polygonOptions.isVisible());
        C0723b.m766a(parcel, 9, polygonOptions.isGeodesic());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: dg */
    public PolygonOptions createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    arrayList2 = C0721a.m723c(parcel, F, LatLng.CREATOR);
                    break;
                case 3:
                    C0721a.m719a(parcel, F, (List) arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    f = C0721a.m733l(parcel, F);
                    break;
                case 5:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 6:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 7:
                    f2 = C0721a.m733l(parcel, F);
                    break;
                case 8:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 9:
                    z2 = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new PolygonOptions(i, arrayList2, arrayList, f, i2, i3, f2, z, z2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: fc */
    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
