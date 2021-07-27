package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

public class SnapshotMetadataEntityCreator implements Parcelable.Creator<SnapshotMetadataEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3806a(SnapshotMetadataEntity snapshotMetadataEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) snapshotMetadataEntity.getGame(), i, false);
        C0723b.m775c(parcel, 1000, snapshotMetadataEntity.getVersionCode());
        C0723b.m759a(parcel, 2, (Parcelable) snapshotMetadataEntity.getOwner(), i, false);
        C0723b.m763a(parcel, 3, snapshotMetadataEntity.getSnapshotId(), false);
        C0723b.m759a(parcel, 5, (Parcelable) snapshotMetadataEntity.getCoverImageUri(), i, false);
        C0723b.m763a(parcel, 6, snapshotMetadataEntity.getCoverImageUrl(), false);
        C0723b.m763a(parcel, 7, snapshotMetadataEntity.getTitle(), false);
        C0723b.m763a(parcel, 8, snapshotMetadataEntity.getDescription(), false);
        C0723b.m755a(parcel, 9, snapshotMetadataEntity.getLastModifiedTimestamp());
        C0723b.m755a(parcel, 10, snapshotMetadataEntity.getPlayedTime());
        C0723b.m754a(parcel, 11, snapshotMetadataEntity.getCoverImageAspectRatio());
        C0723b.m763a(parcel, 12, snapshotMetadataEntity.getUniqueName(), false);
        C0723b.m766a(parcel, 13, snapshotMetadataEntity.hasChangePending());
        C0723b.m751H(parcel, H);
    }

    public SnapshotMetadataEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean z = false;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        gameEntity = (GameEntity) C0721a.m716a(parcel2, F, GameEntity.CREATOR);
                        break;
                    case 2:
                        playerEntity = (PlayerEntity) C0721a.m716a(parcel2, F, PlayerEntity.CREATOR);
                        break;
                    case 3:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    default:
                        switch (aH) {
                            case 5:
                                uri = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                                break;
                            case 6:
                                str2 = C0721a.m736o(parcel2, F);
                                break;
                            case 7:
                                str3 = C0721a.m736o(parcel2, F);
                                break;
                            case 8:
                                str4 = C0721a.m736o(parcel2, F);
                                break;
                            case 9:
                                j = C0721a.m730i(parcel2, F);
                                break;
                            case 10:
                                j2 = C0721a.m730i(parcel2, F);
                                break;
                            case 11:
                                f = C0721a.m733l(parcel2, F);
                                break;
                            case 12:
                                str5 = C0721a.m736o(parcel2, F);
                                break;
                            case 13:
                                z = C0721a.m724c(parcel2, F);
                                break;
                            default:
                                C0721a.m721b(parcel2, F);
                                break;
                        }
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new SnapshotMetadataEntity(i, gameEntity, playerEntity, str, uri, str2, str3, str4, j, j2, f, str5, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    public SnapshotMetadataEntity[] newArray(int i) {
        return new SnapshotMetadataEntity[i];
    }
}
