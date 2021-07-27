package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import java.util.ArrayList;

public class ExtendedGameEntityCreator implements Parcelable.Creator<ExtendedGameEntity> {
    /* renamed from: a */
    static void m3588a(ExtendedGameEntity extendedGameEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) extendedGameEntity.getGame(), i, false);
        C0723b.m775c(parcel, 1000, extendedGameEntity.getVersionCode());
        C0723b.m775c(parcel, 2, extendedGameEntity.mo14126lZ());
        C0723b.m766a(parcel, 3, extendedGameEntity.mo14127ma());
        C0723b.m775c(parcel, 4, extendedGameEntity.mo14128mb());
        C0723b.m755a(parcel, 5, extendedGameEntity.mo14129mc());
        C0723b.m755a(parcel, 6, extendedGameEntity.mo14130md());
        C0723b.m763a(parcel, 7, extendedGameEntity.mo14131me(), false);
        C0723b.m755a(parcel, 8, extendedGameEntity.mo14132mf());
        C0723b.m763a(parcel, 9, extendedGameEntity.mo14133mg(), false);
        C0723b.m776c(parcel, 10, extendedGameEntity.mo14125lY(), false);
        C0723b.m759a(parcel, 11, (Parcelable) extendedGameEntity.mo14134mh(), i, false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cu */
    public ExtendedGameEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        GameEntity gameEntity = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        gameEntity = (GameEntity) C0721a.m716a(parcel2, F, GameEntity.CREATOR);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 3:
                        z = C0721a.m724c(parcel2, F);
                        break;
                    case 4:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 5:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 6:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 7:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 8:
                        j3 = C0721a.m730i(parcel2, F);
                        break;
                    case 9:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 10:
                        arrayList = C0721a.m723c(parcel2, F, GameBadgeEntity.CREATOR);
                        break;
                    case 11:
                        snapshotMetadataEntity = (SnapshotMetadataEntity) C0721a.m716a(parcel2, F, SnapshotMetadataEntity.CREATOR);
                        break;
                    default:
                        C0721a.m721b(parcel2, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel2, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new ExtendedGameEntity(i, gameEntity, i2, z, i3, j, j2, str, j3, str2, arrayList, snapshotMetadataEntity);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: eb */
    public ExtendedGameEntity[] newArray(int i) {
        return new ExtendedGameEntity[i];
    }
}
