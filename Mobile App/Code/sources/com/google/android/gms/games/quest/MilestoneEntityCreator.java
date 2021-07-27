package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;

public class MilestoneEntityCreator implements Parcelable.Creator<MilestoneEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3763a(MilestoneEntity milestoneEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, milestoneEntity.getMilestoneId(), false);
        C0723b.m775c(parcel, 1000, milestoneEntity.getVersionCode());
        C0723b.m755a(parcel, 2, milestoneEntity.getCurrentProgress());
        C0723b.m755a(parcel, 3, milestoneEntity.getTargetProgress());
        C0723b.m767a(parcel, 4, milestoneEntity.getCompletionRewardData(), false);
        C0723b.m775c(parcel, 5, milestoneEntity.getState());
        C0723b.m763a(parcel, 6, milestoneEntity.getEventId(), false);
        C0723b.m751H(parcel, H);
    }

    public MilestoneEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 2:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 3:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 4:
                        bArr = C0721a.m739r(parcel2, F);
                        break;
                    case 5:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 6:
                        str2 = C0721a.m736o(parcel2, F);
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
            return new MilestoneEntity(i, str, j, j2, bArr, i2, str2);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    public MilestoneEntity[] newArray(int i) {
        return new MilestoneEntity[i];
    }
}
