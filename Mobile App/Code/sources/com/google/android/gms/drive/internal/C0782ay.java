package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.ay */
public class C0782ay implements Parcelable.Creator<OpenContentsRequest> {
    /* renamed from: a */
    static void m1041a(OpenContentsRequest openContentsRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, openContentsRequest.f1001CK);
        C0723b.m759a(parcel, 2, (Parcelable) openContentsRequest.f1003Pp, i, false);
        C0723b.m775c(parcel, 3, openContentsRequest.f1002Oi);
        C0723b.m775c(parcel, 4, openContentsRequest.f1004QT);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aD */
    public OpenContentsRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DriveId driveId = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    driveId = (DriveId) C0721a.m716a(parcel, F, DriveId.CREATOR);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new OpenContentsRequest(i, driveId, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bS */
    public OpenContentsRequest[] newArray(int i) {
        return new OpenContentsRequest[i];
    }
}
