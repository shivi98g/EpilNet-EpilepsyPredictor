package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.b */
public class C0662b implements Parcelable.Creator<CastDevice> {
    /* renamed from: a */
    static void m465a(CastDevice castDevice, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, castDevice.getVersionCode());
        C0723b.m763a(parcel, 2, castDevice.getDeviceId(), false);
        C0723b.m763a(parcel, 3, castDevice.f493FH, false);
        C0723b.m763a(parcel, 4, castDevice.getFriendlyName(), false);
        C0723b.m763a(parcel, 5, castDevice.getModelName(), false);
        C0723b.m763a(parcel, 6, castDevice.getDeviceVersion(), false);
        C0723b.m775c(parcel, 7, castDevice.getServicePort());
        C0723b.m776c(parcel, 8, castDevice.getIcons(), false);
        C0723b.m775c(parcel, 9, castDevice.getCapabilities());
        C0723b.m775c(parcel, 10, castDevice.getStatus());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: Z */
    public CastDevice[] newArray(int i) {
        return new CastDevice[i];
    }

    /* renamed from: v */
    public CastDevice createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<WebImage> arrayList = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 3:
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    str3 = C0721a.m736o(parcel, F);
                    break;
                case 5:
                    str4 = C0721a.m736o(parcel, F);
                    break;
                case 6:
                    str5 = C0721a.m736o(parcel, F);
                    break;
                case 7:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 8:
                    arrayList = C0721a.m723c(parcel, F, WebImage.CREATOR);
                    break;
                case 9:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                case 10:
                    i4 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CastDevice(i, str, str2, str3, str4, str5, i2, arrayList, i3, i4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }
}
