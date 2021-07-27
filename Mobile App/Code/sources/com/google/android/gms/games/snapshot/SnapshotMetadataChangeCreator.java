package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.C0702a;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class SnapshotMetadataChangeCreator implements Parcelable.Creator<SnapshotMetadataChangeEntity> {
    /* renamed from: a */
    static void m3799a(SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, snapshotMetadataChangeEntity.getDescription(), false);
        C0723b.m775c(parcel, 1000, snapshotMetadataChangeEntity.getVersionCode());
        C0723b.m762a(parcel, 2, snapshotMetadataChangeEntity.getPlayedTimeMillis(), false);
        C0723b.m759a(parcel, 4, (Parcelable) snapshotMetadataChangeEntity.getCoverImageUri(), i, false);
        C0723b.m759a(parcel, 5, (Parcelable) snapshotMetadataChangeEntity.mo14605mT(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cE */
    public SnapshotMetadataChangeEntity createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        String str = null;
        Long l = null;
        C0702a aVar = null;
        Uri uri = null;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            switch (C0721a.m720aH(F)) {
                case 1:
                    str = C0721a.m736o(parcel, F);
                    break;
                case 2:
                    l = C0721a.m731j(parcel, F);
                    break;
                case 4:
                    uri = (Uri) C0721a.m716a(parcel, F, Uri.CREATOR);
                    break;
                case 5:
                    aVar = (C0702a) C0721a.m716a(parcel, F, C0702a.CREATOR);
                    break;
                case 1000:
                    i = C0721a.m728g(parcel, F);
                    break;
                default:
                    C0721a.m721b(parcel, F);
                    break;
            }
        }
        if (parcel.dataPosition() == G) {
            return new SnapshotMetadataChangeEntity(i, str, l, aVar, uri);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    /* renamed from: er */
    public SnapshotMetadataChangeEntity[] newArray(int i) {
        return new SnapshotMetadataChangeEntity[i];
    }
}
