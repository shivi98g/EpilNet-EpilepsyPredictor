package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DriveId;

/* renamed from: com.google.android.gms.drive.internal.ba */
public class C0785ba implements Parcelable.Creator<OpenFileIntentSenderRequest> {
    /* renamed from: a */
    static void m1050a(OpenFileIntentSenderRequest openFileIntentSenderRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, openFileIntentSenderRequest.f1005CK);
        C0723b.m763a(parcel, 2, openFileIntentSenderRequest.f1006OH, false);
        C0723b.m770a(parcel, 3, openFileIntentSenderRequest.f1007OI, false);
        C0723b.m759a(parcel, 4, (Parcelable) openFileIntentSenderRequest.f1008OJ, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aE */
    public OpenFileIntentSenderRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        int i = 0;
        String[] strArr = null;
        DriveId driveId = null;
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
                    strArr = C0721a.m708A(parcel, F);
                    break;
                case 4:
                    driveId = (DriveId) C0721a.m716a(parcel, F, DriveId.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new OpenFileIntentSenderRequest(i, str, strArr, driveId);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bT */
    public OpenFileIntentSenderRequest[] newArray(int i) {
        return new OpenFileIntentSenderRequest[i];
    }
}
