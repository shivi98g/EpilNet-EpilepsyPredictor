package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public class PlayerEntityCreator implements Parcelable.Creator<PlayerEntity> {
    /* renamed from: a */
    static void m2066a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, playerEntity.getPlayerId(), false);
        C0723b.m763a(parcel, 2, playerEntity.getDisplayName(), false);
        C0723b.m759a(parcel, 3, (Parcelable) playerEntity.getIconImageUri(), i, false);
        C0723b.m759a(parcel, 4, (Parcelable) playerEntity.getHiResImageUri(), i, false);
        C0723b.m755a(parcel, 5, playerEntity.getRetrievedTimestamp());
        C0723b.m775c(parcel, 6, playerEntity.mo13061kE());
        C0723b.m755a(parcel, 7, playerEntity.getLastPlayedWithTimestamp());
        C0723b.m763a(parcel, 8, playerEntity.getIconImageUrl(), false);
        C0723b.m763a(parcel, 9, playerEntity.getHiResImageUrl(), false);
        C0723b.m763a(parcel, 14, playerEntity.getTitle(), false);
        C0723b.m759a(parcel, 15, (Parcelable) playerEntity.mo13062kF(), i, false);
        C0723b.m759a(parcel, 16, (Parcelable) playerEntity.getLevelInfo(), i, false);
        C0723b.m775c(parcel, 1000, playerEntity.getVersionCode());
        C0723b.m766a(parcel, 18, playerEntity.isProfileVisible());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cm */
    public PlayerEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH == 18) {
                z = C0721a.m724c(parcel2, F);
            } else if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 2:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 3:
                        uri = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 4:
                        uri2 = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 5:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 6:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 7:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 8:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 9:
                        str4 = C0721a.m736o(parcel2, F);
                        break;
                    default:
                        switch (aH) {
                            case 14:
                                str5 = C0721a.m736o(parcel2, F);
                                break;
                            case 15:
                                mostRecentGameInfoEntity = (MostRecentGameInfoEntity) C0721a.m716a(parcel2, F, MostRecentGameInfoEntity.CREATOR);
                                break;
                            case 16:
                                playerLevelInfo = (PlayerLevelInfo) C0721a.m716a(parcel2, F, PlayerLevelInfo.CREATOR);
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
            return new PlayerEntity(i, str, str2, uri, uri2, j, i2, j2, str3, str4, str5, mostRecentGameInfoEntity, playerLevelInfo, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: dH */
    public PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
