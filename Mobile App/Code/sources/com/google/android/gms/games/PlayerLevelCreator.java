package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class PlayerLevelCreator implements Parcelable.Creator<PlayerLevel> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m2069a(PlayerLevel playerLevel, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m775c(parcel, 1, playerLevel.getLevelNumber());
        C0723b.m775c(parcel, 1000, playerLevel.getVersionCode());
        C0723b.m755a(parcel, 2, playerLevel.getMinXp());
        C0723b.m755a(parcel, 3, playerLevel.getMaxXp());
        C0723b.m751H(parcel, H);
    }

    public PlayerLevel createFromParcel(Parcel parcel) {
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        i2 = C0721a.m728g(parcel, F);
                        break;
                    case 2:
                        j = C0721a.m730i(parcel, F);
                        break;
                    case 3:
                        j2 = C0721a.m730i(parcel, F);
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
            return new PlayerLevel(i, i2, j, j2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
    }

    public PlayerLevel[] newArray(int i) {
        return new PlayerLevel[i];
    }
}
