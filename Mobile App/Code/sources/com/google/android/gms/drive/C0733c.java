package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.c */
public class C0733c implements Parcelable.Creator<DriveId> {
    /* renamed from: a */
    static void m816a(DriveId driveId, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, driveId.f849CK);
        C0723b.m763a(parcel, 2, driveId.f850Ot, false);
        C0723b.m755a(parcel, 3, driveId.f851Ou);
        C0723b.m755a(parcel, 4, driveId.f852Ov);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: S */
    public DriveId createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        String str = null;
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
                    j = C0721a.m730i(parcel, F);
                    break;
                case 4:
                    j2 = C0721a.m730i(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new DriveId(i, str, j, j2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aY */
    public DriveId[] newArray(int i) {
        return new DriveId[i];
    }
}
