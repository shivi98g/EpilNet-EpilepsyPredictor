package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class GameEntityCreator implements Parcelable.Creator<GameEntity> {
    /* renamed from: a */
    static void m2038a(GameEntity gameEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, gameEntity.getApplicationId(), false);
        C0723b.m763a(parcel, 2, gameEntity.getDisplayName(), false);
        C0723b.m763a(parcel, 3, gameEntity.getPrimaryCategory(), false);
        C0723b.m763a(parcel, 4, gameEntity.getSecondaryCategory(), false);
        C0723b.m763a(parcel, 5, gameEntity.getDescription(), false);
        C0723b.m763a(parcel, 6, gameEntity.getDeveloperName(), false);
        C0723b.m759a(parcel, 7, (Parcelable) gameEntity.getIconImageUri(), i, false);
        C0723b.m759a(parcel, 8, (Parcelable) gameEntity.getHiResImageUri(), i, false);
        C0723b.m759a(parcel, 9, (Parcelable) gameEntity.getFeaturedImageUri(), i, false);
        C0723b.m766a(parcel, 10, gameEntity.mo13018ky());
        C0723b.m766a(parcel, 11, gameEntity.mo13015kA());
        C0723b.m763a(parcel, 12, gameEntity.mo13016kB(), false);
        C0723b.m775c(parcel, 13, gameEntity.mo13017kC());
        C0723b.m775c(parcel, 14, gameEntity.getAchievementTotalCount());
        C0723b.m775c(parcel, 15, gameEntity.getLeaderboardCount());
        C0723b.m766a(parcel, 17, gameEntity.isTurnBasedMultiplayerEnabled());
        C0723b.m766a(parcel, 16, gameEntity.isRealTimeMultiplayerEnabled());
        C0723b.m775c(parcel, 1000, gameEntity.getVersionCode());
        C0723b.m763a(parcel, 19, gameEntity.getHiResImageUrl(), false);
        C0723b.m763a(parcel, 18, gameEntity.getIconImageUrl(), false);
        C0723b.m766a(parcel, 21, gameEntity.isMuted());
        C0723b.m763a(parcel, 20, gameEntity.getFeaturedImageUrl(), false);
        C0723b.m766a(parcel, 23, gameEntity.areSnapshotsEnabled());
        C0723b.m766a(parcel, 22, gameEntity.mo13019kz());
        C0723b.m763a(parcel, 24, gameEntity.getThemeColor(), false);
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cl */
    public GameEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 2:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 3:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 4:
                        str4 = C0721a.m736o(parcel2, F);
                        break;
                    case 5:
                        str5 = C0721a.m736o(parcel2, F);
                        break;
                    case 6:
                        str6 = C0721a.m736o(parcel2, F);
                        break;
                    case 7:
                        uri = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 8:
                        uri2 = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 9:
                        uri3 = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 10:
                        z = C0721a.m724c(parcel2, F);
                        break;
                    case 11:
                        z2 = C0721a.m724c(parcel2, F);
                        break;
                    case 12:
                        str7 = C0721a.m736o(parcel2, F);
                        break;
                    case 13:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 14:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 15:
                        i4 = C0721a.m728g(parcel2, F);
                        break;
                    case 16:
                        z3 = C0721a.m724c(parcel2, F);
                        break;
                    case 17:
                        z4 = C0721a.m724c(parcel2, F);
                        break;
                    case 18:
                        str8 = C0721a.m736o(parcel2, F);
                        break;
                    case 19:
                        str9 = C0721a.m736o(parcel2, F);
                        break;
                    case 20:
                        str10 = C0721a.m736o(parcel2, F);
                        break;
                    case 21:
                        z5 = C0721a.m724c(parcel2, F);
                        break;
                    case 22:
                        z6 = C0721a.m724c(parcel2, F);
                        break;
                    case 23:
                        z7 = C0721a.m724c(parcel2, F);
                        break;
                    case 24:
                        str11 = C0721a.m736o(parcel2, F);
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
            return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4, z3, z4, str8, str9, str10, z5, z6, z7, str11);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: dG */
    public GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
