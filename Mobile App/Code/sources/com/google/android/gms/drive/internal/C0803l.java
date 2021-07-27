package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.l */
public class C0803l implements Parcelable.Creator<CreateFolderRequest> {
    /* renamed from: a */
    static void m1113a(CreateFolderRequest createFolderRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, createFolderRequest.f950CK);
        C0723b.m759a(parcel, 2, (Parcelable) createFolderRequest.f952Pz, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) createFolderRequest.f951Px, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ai */
    public CreateFolderRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        DriveId driveId = null;
        int i = 0;
        MetadataBundle metadataBundle = null;
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
                    metadataBundle = (MetadataBundle) C0721a.m716a(parcel, F, MetadataBundle.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CreateFolderRequest(i, driveId, metadataBundle);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bt */
    public CreateFolderRequest[] newArray(int i) {
        return new CreateFolderRequest[i];
    }
}
