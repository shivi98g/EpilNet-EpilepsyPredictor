package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class StatusCreator implements Parcelable.Creator<Status> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m549a(Status status, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, status.getStatusCode());
        C0723b.m775c(parcel, 1000, status.getVersionCode());
        C0723b.m763a(parcel, 2, status.getStatusMessage(), false);
        C0723b.m759a(parcel, 3, (Parcelable) status.mo10981gP(), i, false);
        C0723b.m751H(parcel, H);
    }

    public Status createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel, F);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) C0721a.m716a(parcel, F, PendingIntent.CREATOR);
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
            return new Status(i, i2, str, pendingIntent);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public Status[] newArray(int i) {
        return new Status[i];
    }
}
