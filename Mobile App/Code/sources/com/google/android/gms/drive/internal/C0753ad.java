package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.ad */
public class C0753ad implements Parcelable.Creator<GetMetadataRequest> {
    /* renamed from: a */
    static void m883a(GetMetadataRequest getMetadataRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, getMetadataRequest.f963CK);
        C0723b.m759a(parcel, 2, (Parcelable) getMetadataRequest.f964Pp, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: an */
    public GetMetadataRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    driveId = (DriveId) C0721a.m716a(parcel, F, DriveId.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new GetMetadataRequest(i, driveId);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bC */
    public GetMetadataRequest[] newArray(int i) {
        return new GetMetadataRequest[i];
    }
}
