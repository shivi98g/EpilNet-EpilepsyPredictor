package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

/* renamed from: com.google.android.gms.drive.g */
public class C0744g implements Parcelable.Creator<StorageStats> {
    /* renamed from: a */
    static void m846a(StorageStats storageStats, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, storageStats.f877CK);
        C0723b.m755a(parcel, 2, storageStats.f878OM);
        C0723b.m755a(parcel, 3, storageStats.f879ON);
        C0723b.m755a(parcel, 4, storageStats.f880OO);
        C0723b.m755a(parcel, 5, storageStats.f881OP);
        C0723b.m775c(parcel, 6, storageStats.f882OQ);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: V */
    public StorageStats createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel2, F);
                    break;
                case 2:
                    j = C0721a.m730i(parcel2, F);
                    break;
                case 3:
                    j2 = C0721a.m730i(parcel2, F);
                    break;
                case 4:
                    j3 = C0721a.m730i(parcel2, F);
                    break;
                case 5:
                    j4 = C0721a.m730i(parcel2, F);
                    break;
                case 6:
                    i2 = C0721a.m728g(parcel2, F);
                    break;
                default:
                    C0721a.m721b(parcel2, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new StorageStats(i, j, j2, j3, j4, i2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: bd */
    public StorageStats[] newArray(int i) {
        return new StorageStats[i];
    }
}
