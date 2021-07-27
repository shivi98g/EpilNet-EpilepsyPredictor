package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class DetectedActivityCreator implements Parcelable.Creator<DetectedActivity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m6611a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, detectedActivity.agb);
        C0723b.m775c(parcel, 1000, detectedActivity.getVersionCode());
        C0723b.m775c(parcel, 2, detectedActivity.agc);
        C0723b.m751H(parcel, H);
    }

    public DetectedActivity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        i3 = C0721a.m728g(parcel, F);
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
            return new DetectedActivity(i, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public DetectedActivity[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
