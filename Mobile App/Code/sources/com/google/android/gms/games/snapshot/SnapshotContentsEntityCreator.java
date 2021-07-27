package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.drive.Contents;

public class SnapshotContentsEntityCreator implements Parcelable.Creator<SnapshotContentsEntity> {
    /* renamed from: a */
    static void m3791a(SnapshotContentsEntity snapshotContentsEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) snapshotContentsEntity.mo14569ir(), i, false);
        C0723b.m775c(parcel, 1000, snapshotContentsEntity.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cD */
    public SnapshotContentsEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        int i = 0;
        Contents contents = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                contents = (Contents) C0721a.m716a(parcel, F, Contents.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new SnapshotContentsEntity(i, contents);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: eq */
    public SnapshotContentsEntity[] newArray(int i) {
        return new SnapshotContentsEntity[i];
    }
}
