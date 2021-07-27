package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.DrivePreferences;

/* renamed from: com.google.android.gms.drive.internal.bd */
public class C0788bd implements Parcelable.Creator<SetDrivePreferencesRequest> {
    /* renamed from: a */
    static void m1059a(SetDrivePreferencesRequest setDrivePreferencesRequest, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, setDrivePreferencesRequest.f1014CK);
        C0723b.m759a(parcel, 2, (Parcelable) setDrivePreferencesRequest.f1015QN, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aH */
    public SetDrivePreferencesRequest createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        DrivePreferences drivePreferences = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    drivePreferences = (DrivePreferences) C0721a.m716a(parcel, F, DrivePreferences.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new SetDrivePreferencesRequest(i, drivePreferences);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bW */
    public SetDrivePreferencesRequest[] newArray(int i) {
        return new SetDrivePreferencesRequest[i];
    }
}
