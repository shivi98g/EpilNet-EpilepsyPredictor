package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class PlayerLevelInfoCreator implements Parcelable.Creator<PlayerLevelInfo> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m2070a(PlayerLevelInfo playerLevelInfo, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m755a(parcel, 1, playerLevelInfo.getCurrentXpTotal());
        C0723b.m775c(parcel, 1000, playerLevelInfo.getVersionCode());
        C0723b.m755a(parcel, 2, playerLevelInfo.getLastLevelUpTimestamp());
        C0723b.m759a(parcel, 3, (Parcelable) playerLevelInfo.getCurrentLevel(), i, false);
        C0723b.m759a(parcel, 4, (Parcelable) playerLevelInfo.getNextLevel(), i, false);
        C0723b.m751H(parcel, H);
    }

    public PlayerLevelInfo createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        PlayerLevel playerLevel = null;
        PlayerLevel playerLevel2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        j = C0721a.m730i(parcel, F);
                        break;
                    case 2:
                        j2 = C0721a.m730i(parcel, F);
                        break;
                    case 3:
                        playerLevel = (PlayerLevel) C0721a.m716a(parcel, F, PlayerLevel.CREATOR);
                        break;
                    case 4:
                        playerLevel2 = (PlayerLevel) C0721a.m716a(parcel, F, PlayerLevel.CREATOR);
                        break;
                    default:
                        C0721a.m721b(parcel, F);
                        break;
                }
            } else {
                i = C0721a.m728g(parcel, F);
            }
        }
        if (parcel.dataPosition() == G) {
            return new PlayerLevelInfo(i, j, j2, playerLevel, playerLevel2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public PlayerLevelInfo[] newArray(int i) {
        return new PlayerLevelInfo[i];
    }
}
