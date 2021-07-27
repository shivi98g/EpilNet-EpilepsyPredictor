package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.drive.internal.bf */
public class C0790bf implements Parcelable.Creator<SetResourceParentsRequest> {
    /* renamed from: a */
    static void m1065a(SetResourceParentsRequest setResourceParentsRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, setResourceParentsRequest.f1018CK);
        C0723b.m759a(parcel, 2, (Parcelable) setResourceParentsRequest.f1019QW, i, false);
        C0723b.m776c(parcel, 3, setResourceParentsRequest.f1020QX, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aJ */
    public SetResourceParentsRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        DriveId driveId = null;
        int i = 0;
        ArrayList<DriveId> arrayList = null;
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
                    arrayList = C0721a.m723c(parcel, F, DriveId.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new SetResourceParentsRequest(i, driveId, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bY */
    public SetResourceParentsRequest[] newArray(int i) {
        return new SetResourceParentsRequest[i];
    }
}
