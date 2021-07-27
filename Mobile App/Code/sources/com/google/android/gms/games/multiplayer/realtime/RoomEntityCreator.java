package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class RoomEntityCreator implements Parcelable.Creator<RoomEntity> {
    /* renamed from: a */
    static void m3743a(RoomEntity roomEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, roomEntity.getRoomId(), false);
        C0723b.m775c(parcel, 1000, roomEntity.getVersionCode());
        C0723b.m763a(parcel, 2, roomEntity.getCreatorId(), false);
        C0723b.m755a(parcel, 3, roomEntity.getCreationTimestamp());
        C0723b.m775c(parcel, 4, roomEntity.getStatus());
        C0723b.m763a(parcel, 5, roomEntity.getDescription(), false);
        C0723b.m775c(parcel, 6, roomEntity.getVariant());
        C0723b.m756a(parcel, 7, roomEntity.getAutoMatchCriteria(), false);
        C0723b.m776c(parcel, 8, roomEntity.getParticipants(), false);
        C0723b.m775c(parcel, 9, roomEntity.getAutoMatchWaitEstimateSeconds());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cC */
    public RoomEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        ArrayList<ParticipantEntity> arrayList = null;
        long j = 0;
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
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 5:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 6:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 7:
                        bundle = C0721a.m738q(parcel2, F);
                        break;
                    case 8:
                        arrayList = C0721a.m723c(parcel2, F, ParticipantEntity.CREATOR);
                        break;
                    case 9:
                        i4 = C0721a.m728g(parcel2, F);
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
            return new RoomEntity(i, str, str2, j, i2, str3, i3, bundle, arrayList, i4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: eo */
    public RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }
}
