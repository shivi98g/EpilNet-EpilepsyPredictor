package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.StorageStats;

/* renamed from: com.google.android.gms.drive.internal.aw */
public class C0780aw implements Parcelable.Creator<OnStorageStatsResponse> {
    /* renamed from: a */
    static void m1035a(OnStorageStatsResponse onStorageStatsResponse, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, onStorageStatsResponse.f997CK);
        C0723b.m759a(parcel, 2, (Parcelable) onStorageStatsResponse.f998QS, i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: aB */
    public OnStorageStatsResponse createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        StorageStats storageStats = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    i = C0721a.m728g(parcel, F);
                    break;
                case 2:
                    storageStats = (StorageStats) C0721a.m716a(parcel, F, StorageStats.CREATOR);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new OnStorageStatsResponse(i, storageStats);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: bQ */
    public OnStorageStatsResponse[] newArray(int i) {
        return new OnStorageStatsResponse[i];
    }
}
