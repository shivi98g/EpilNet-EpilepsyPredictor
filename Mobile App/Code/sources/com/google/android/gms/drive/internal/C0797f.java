package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.f */
public class C0797f implements Parcelable.Creator<CloseContentsAndUpdateMetadataRequest> {
    /* renamed from: a */
    static void m1094a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, closeContentsAndUpdateMetadataRequest.f923CK);
        C0723b.m759a(parcel, 2, (Parcelable) closeContentsAndUpdateMetadataRequest.f926Pp, i, false);
        C0723b.m759a(parcel, 3, (Parcelable) closeContentsAndUpdateMetadataRequest.f927Pq, i, false);
        C0723b.m759a(parcel, 4, (Parcelable) closeContentsAndUpdateMetadataRequest.f928Pr, i, false);
        C0723b.m766a(parcel, 5, closeContentsAndUpdateMetadataRequest.f925Oz);
        C0723b.m763a(parcel, 6, closeContentsAndUpdateMetadataRequest.f924Oy, false);
        C0723b.m775c(parcel, 7, closeContentsAndUpdateMetadataRequest.f929Ps);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ad */
    public CloseContentsAndUpdateMetadataRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        DriveId driveId = null;
        MetadataBundle metadataBundle = null;
        Contents contents = null;
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
                    z = C0721a.m724c(parcel, F);
                    break;
                case 6:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 7:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CloseContentsAndUpdateMetadataRequest(i, driveId, metadataBundle, contents, z, str, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bn */
    public CloseContentsAndUpdateMetadataRequest[] newArray(int i) {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }
}
