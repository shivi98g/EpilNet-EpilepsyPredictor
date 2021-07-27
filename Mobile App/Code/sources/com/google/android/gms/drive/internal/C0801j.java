package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.internal.j */
public class C0801j implements Parcelable.Creator<CreateFileIntentSenderRequest> {
    /* renamed from: a */
    static void m1107a(CreateFileIntentSenderRequest createFileIntentSenderRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, createFileIntentSenderRequest.f935CK);
        C0723b.m759a(parcel, 2, (Parcelable) createFileIntentSenderRequest.f938Px, i, false);
        C0723b.m775c(parcel, 3, createFileIntentSenderRequest.f940ve);
        C0723b.m763a(parcel, 4, createFileIntentSenderRequest.f936OH, false);
        C0723b.m759a(parcel, 5, (Parcelable) createFileIntentSenderRequest.f937OJ, i, false);
        C0723b.m761a(parcel, 6, createFileIntentSenderRequest.f939Py, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: ag */
    public CreateFileIntentSenderRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        MetadataBundle metadataBundle = null;
        String str = null;
        DriveId driveId = null;
        Integer num = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C0721a.m716a(parcel, F, MetadataBundle.CREATOR);
                    break;
                case 3:
                    i2 = C0721a.m728g(parcel, F);
                    break;
                case 4:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 5:
                    driveId = (DriveId) C0721a.m716a(parcel, F, DriveId.CREATOR);
                    break;
                case 6:
                    num = C0721a.m729h(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new CreateFileIntentSenderRequest(i, metadataBundle, i2, str, driveId, num);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: br */
    public CreateFileIntentSenderRequest[] newArray(int i) {
        return new CreateFileIntentSenderRequest[i];
    }
}
