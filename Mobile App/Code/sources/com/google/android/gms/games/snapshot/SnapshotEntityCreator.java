package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class SnapshotEntityCreator implements Parcelable.Creator<SnapshotEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3797a(SnapshotEntity snapshotEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) snapshotEntity.getMetadata(), i, false);
        C0723b.m775c(parcel, 1000, snapshotEntity.getVersionCode());
        C0723b.m759a(parcel, 3, (Parcelable) snapshotEntity.getSnapshotContents(), i, false);
        C0723b.m751H(parcel, H);
    }

    public SnapshotEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        int i = 0;
        SnapshotContentsEntity snapshotContentsEntity = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 1) {
                snapshotMetadataEntity = (SnapshotMetadataEntity) C0721a.m716a(parcel, F, SnapshotMetadataEntity.CREATOR);
            } else if (aH == 3) {
                snapshotContentsEntity = (SnapshotContentsEntity) C0721a.m716a(parcel, F, SnapshotContentsEntity.CREATOR);
            } else if (aH != 1000) {
                C0721a.m721b(parcel, F);
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new SnapshotEntity(i, snapshotMetadataEntity, snapshotContentsEntity);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public SnapshotEntity[] newArray(int i) {
        return new SnapshotEntity[i];
    }
}
