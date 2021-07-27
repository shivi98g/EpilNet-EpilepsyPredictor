package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.internal.ac */
public class C0752ac implements Parcelable.Creator<GetDriveIdFromUniqueIdentifierRequest> {
    /* renamed from: a */
    static void m880a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, getDriveIdFromUniqueIdentifierRequest.f960CK);
        C0723b.m763a(parcel, 2, getDriveIdFromUniqueIdentifierRequest.f961QC, false);
        C0723b.m766a(parcel, 3, getDriveIdFromUniqueIdentifierRequest.f962QD);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: am */
    public GetDriveIdFromUniqueIdentifierRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        String str = null;
        boolean z = false;
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
                    z = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new GetDriveIdFromUniqueIdentifierRequest(i, str, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bB */
    public GetDriveIdFromUniqueIdentifierRequest[] newArray(int i) {
        return new GetDriveIdFromUniqueIdentifierRequest[i];
    }
}
