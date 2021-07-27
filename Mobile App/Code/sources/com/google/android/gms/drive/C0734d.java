package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.d */
public class C0734d implements Parcelable.Creator<DrivePreferences> {
    /* renamed from: a */
    static void m819a(DrivePreferences drivePreferences, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, drivePreferences.f854CK);
        C0723b.m766a(parcel, 2, drivePreferences.f855Ox);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: T */
    public DrivePreferences createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    z = C0721a.m724c(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new DrivePreferences(i, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aZ */
    public DrivePreferences[] newArray(int i) {
        return new DrivePreferences[i];
    }
}
