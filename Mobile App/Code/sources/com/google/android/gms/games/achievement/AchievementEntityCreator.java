package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.PlayerEntity;

public class AchievementEntityCreator implements Parcelable.Creator<AchievementEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m2077a(AchievementEntity achievementEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, achievementEntity.getAchievementId(), false);
        C0723b.m775c(parcel, 2, achievementEntity.getType());
        C0723b.m763a(parcel, 3, achievementEntity.getName(), false);
        C0723b.m763a(parcel, 4, achievementEntity.getDescription(), false);
        C0723b.m759a(parcel, 5, (Parcelable) achievementEntity.getUnlockedImageUri(), i, false);
        C0723b.m763a(parcel, 6, achievementEntity.getUnlockedImageUrl(), false);
        C0723b.m759a(parcel, 7, (Parcelable) achievementEntity.getRevealedImageUri(), i, false);
        C0723b.m763a(parcel, 8, achievementEntity.getRevealedImageUrl(), false);
        C0723b.m775c(parcel, 9, achievementEntity.getTotalSteps());
        C0723b.m763a(parcel, 10, achievementEntity.getFormattedTotalSteps(), false);
        C0723b.m759a(parcel, 11, (Parcelable) achievementEntity.getPlayer(), i, false);
        C0723b.m775c(parcel, 12, achievementEntity.getState());
        C0723b.m775c(parcel, 13, achievementEntity.getCurrentSteps());
        C0723b.m763a(parcel, 14, achievementEntity.getFormattedCurrentSteps(), false);
        C0723b.m755a(parcel, 15, achievementEntity.getLastUpdatedTimestamp());
        C0723b.m755a(parcel, 16, achievementEntity.getXpValue());
        C0723b.m775c(parcel, 1000, achievementEntity.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    public AchievementEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        Uri uri2 = null;
        String str5 = null;
        String str6 = null;
        PlayerEntity playerEntity = null;
        String str7 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 2:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 3:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 4:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 5:
                        uri = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 6:
                        str4 = C0721a.m736o(parcel2, F);
                        break;
                    case 7:
                        uri2 = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 8:
                        str5 = C0721a.m736o(parcel2, F);
                        break;
                    case 9:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 10:
                        str6 = C0721a.m736o(parcel2, F);
                        break;
                    case 11:
                        playerEntity = (PlayerEntity) C0721a.m716a(parcel2, F, PlayerEntity.CREATOR);
                        break;
                    case 12:
                        i4 = C0721a.m728g(parcel2, F);
                        break;
                    case 13:
                        i5 = C0721a.m728g(parcel2, F);
                        break;
                    case 14:
                        str7 = C0721a.m736o(parcel2, F);
                        break;
                    case 15:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 16:
                        j2 = C0721a.m730i(parcel2, F);
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
            return new AchievementEntity(i, str, i2, str2, str3, uri, str4, uri2, str5, i3, str6, playerEntity, i4, i5, str7, j, j2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    public AchievementEntity[] newArray(int i) {
        return new AchievementEntity[i];
    }
}
