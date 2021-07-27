package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: com.google.android.gms.maps.a */
public class C2248a implements Parcelable.Creator<GoogleMapOptions> {
    /* renamed from: a */
    static void m6704a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, googleMapOptions.getVersionCode());
        C0723b.m752a(parcel, 2, googleMapOptions.mo17356nD());
        C0723b.m752a(parcel, 3, googleMapOptions.mo17357nE());
        C0723b.m775c(parcel, 4, googleMapOptions.getMapType());
        C0723b.m759a(parcel, 5, (Parcelable) googleMapOptions.getCamera(), i, false);
        C0723b.m752a(parcel, 6, googleMapOptions.mo17358nF());
        C0723b.m752a(parcel, 7, googleMapOptions.mo17359nG());
        C0723b.m752a(parcel, 8, googleMapOptions.mo17360nH());
        C0723b.m752a(parcel, 9, googleMapOptions.mo17361nI());
        C0723b.m752a(parcel, 10, googleMapOptions.mo17362nJ());
        C0723b.m752a(parcel, 11, googleMapOptions.mo17363nK());
        C0723b.m752a(parcel, 12, googleMapOptions.mo17364nL());
        C0723b.m752a(parcel, 14, googleMapOptions.mo17365nM());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cX */
    public GoogleMapOptions createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        int i2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        CameraPosition cameraPosition = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    b = C0721a.m726e(parcel2, F);
                    break;
                case 3:
                    b2 = C0721a.m726e(parcel2, F);
                    break;
                case 4:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C0721a.m716a(parcel2, F, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = C0721a.m726e(parcel2, F);
                    break;
                case 7:
                    b4 = C0721a.m726e(parcel2, F);
                    break;
                case 8:
                    b5 = C0721a.m726e(parcel2, F);
                    break;
                case 9:
                    b6 = C0721a.m726e(parcel2, F);
                    break;
                case 10:
                    b7 = C0721a.m726e(parcel2, F);
                    break;
                case 11:
                    b8 = C0721a.m726e(parcel2, F);
                    break;
                case 12:
                    b9 = C0721a.m726e(parcel2, F);
                    break;
                case 14:
                    b10 = C0721a.m726e(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new GoogleMapOptions(i, b, b2, i2, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: eT */
    public GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
