package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.maps.model.a */
public class C2342a implements Parcelable.Creator<CameraPosition> {
    /* renamed from: a */
    static void m6823a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, cameraPosition.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) cameraPosition.target, i, false);
        C0723b.m754a(parcel, 3, cameraPosition.zoom);
        C0723b.m754a(parcel, 4, cameraPosition.tilt);
        C0723b.m754a(parcel, 5, cameraPosition.bearing);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: da */
    public CameraPosition createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        LatLng latLng = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    latLng = (LatLng) C0721a.m716a(parcel, F, LatLng.CREATOR);
                    break;
                case 3:
                    f = C0721a.m733l(parcel, F);
                    break;
                case 4:
                    f2 = C0721a.m733l(parcel, F);
                    break;
                case 5:
                    f3 = C0721a.m733l(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CameraPosition(i, latLng, f, f2, f3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eW */
    public CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
