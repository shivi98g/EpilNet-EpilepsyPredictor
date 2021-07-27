package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.ai */
public class C0766ai implements Parcelable.Creator<ListParentsRequest> {
    /* renamed from: a */
    static void m990a(ListParentsRequest listParentsRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, listParentsRequest.f965CK);
        C0723b.m759a(parcel, 2, (Parcelable) listParentsRequest.f966QE, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ao */
    public ListParentsRequest createFromParcel(Parcel parcel) {
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
            return new ListParentsRequest(i, driveId);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bD */
    public ListParentsRequest[] newArray(int i) {
        return new ListParentsRequest[i];
    }
}
