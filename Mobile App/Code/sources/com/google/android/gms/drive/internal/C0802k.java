package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.k */
public class C0802k implements Parcelable.Creator<CreateFileRequest> {
    /* renamed from: a */
    static void m1110a(CreateFileRequest createFileRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, createFileRequest.f941CK);
        C0723b.m759a(parcel, 2, (Parcelable) createFileRequest.f949Pz, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) createFileRequest.f947Px, i, false);
        C0723b.m759a(parcel, 4, (Parcelable) createFileRequest.f946Pr, i, false);
        C0723b.m761a(parcel, 5, createFileRequest.f948Py, false);
        C0723b.m766a(parcel, 6, createFileRequest.f943PA);
        C0723b.m763a(parcel, 7, createFileRequest.f942Oy, false);
        C0723b.m775c(parcel, 8, createFileRequest.f944PB);
        C0723b.m775c(parcel, 9, createFileRequest.f945PC);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ah */
    public CreateFileRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        DriveId driveId = null;
        MetadataBundle metadataBundle = null;
        Contents contents = null;
        Integer num = null;
        String str = null;
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
                case 4:
                    contents = (Contents) C0721a.m716a(parcel, F, Contents.CREATOR);
                    break;
                case 5:
                    num = C0721a.m729h(parcel, F);
                    break;
                case 6:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 7:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 8:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 9:
                    i3 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CreateFileRequest(i, driveId, metadataBundle, contents, num, z, str, i2, i3);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bs */
    public CreateFileRequest[] newArray(int i) {
        return new CreateFileRequest[i];
    }
}
