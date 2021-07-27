package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.h */
public class C0745h implements Parcelable.Creator<UserMetadata> {
    /* renamed from: a */
    static void m849a(UserMetadata userMetadata, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, userMetadata.f883CK);
        C0723b.m763a(parcel, 2, userMetadata.f884OR, false);
        C0723b.m763a(parcel, 3, userMetadata.f885OS, false);
        C0723b.m763a(parcel, 4, userMetadata.f886OT, false);
        C0723b.m766a(parcel, 5, userMetadata.f887OU);
        C0723b.m763a(parcel, 6, userMetadata.f888OV, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: W */
    public UserMetadata createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                    str2 = C0721a.m736o(parcel, F);
                    break;
                case 4:
                    str3 = C0721a.m736o(parcel, F);
                    break;
                case 5:
                    z = C0721a.m724c(parcel, F);
                    break;
                case 6:
                    str4 = C0721a.m736o(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new UserMetadata(i, str, str2, str3, z, str4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: be */
    public UserMetadata[] newArray(int i) {
        return new UserMetadata[i];
    }
}
