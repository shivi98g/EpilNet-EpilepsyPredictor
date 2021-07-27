package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.a */
public class C0731a implements Parcelable.Creator<Contents> {
    /* renamed from: a */
    static void m813a(Contents contents, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, contents.f833CK);
        C0723b.m759a(parcel, 2, (Parcelable) contents.f834LG, i, false);
        C0723b.m775c(parcel, 3, contents.f838ve);
        C0723b.m775c(parcel, 4, contents.f835Oi);
        C0723b.m759a(parcel, 5, (Parcelable) contents.f836Oj, i, false);
        C0723b.m766a(parcel, 7, contents.f837Ok);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: R */
    public Contents createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 7) {
                switch (aH) {
                    case 1:
                        i = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        parcelFileDescriptor = (ParcelFileDescriptor) C0721a.m716a(parcel, F, ParcelFileDescriptor.CREATOR);
                        break;
                    case 3:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 4:
                        i3 = C0721a.m728g(parcel, F);
                        break;
                    case 5:
                        driveId = (DriveId) C0721a.m716a(parcel, F, DriveId.CREATOR);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                z = C0721a.m724c(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new Contents(i, parcelFileDescriptor, i2, i3, driveId, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: aX */
    public Contents[] newArray(int i) {
        return new Contents[i];
    }
}
