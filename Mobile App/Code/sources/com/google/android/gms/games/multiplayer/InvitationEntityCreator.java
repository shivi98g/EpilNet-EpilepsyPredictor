package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class InvitationEntityCreator implements Parcelable.Creator<InvitationEntity> {
    /* renamed from: a */
    static void m3709a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) invitationEntity.getGame(), i, false);
        C0723b.m775c(parcel, 1000, invitationEntity.getVersionCode());
        C0723b.m763a(parcel, 2, invitationEntity.getInvitationId(), false);
        C0723b.m755a(parcel, 3, invitationEntity.getCreationTimestamp());
        C0723b.m775c(parcel, 4, invitationEntity.getInvitationType());
        C0723b.m759a(parcel, 5, (Parcelable) invitationEntity.getInviter(), i, false);
        C0723b.m776c(parcel, 6, invitationEntity.getParticipants(), false);
        C0723b.m775c(parcel, 7, invitationEntity.getVariant());
        C0723b.m775c(parcel, 8, invitationEntity.getAvailableAutoMatchSlots());
        C0723b.m751H(parcel, H);
    }

    /* renamed from: cz */
    public InvitationEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        GameEntity gameEntity = null;
        String str = null;
        ParticipantEntity participantEntity = null;
        ArrayList<ParticipantEntity> arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            int aH = C0721a.m720aH(F);
            if (aH != 1000) {
                switch (aH) {
                    case 1:
                        gameEntity = (GameEntity) C0721a.m716a(parcel2, F, GameEntity.CREATOR);
                        break;
                    case 2:
                        str = C0721a.m736o(parcel2, F);
                        break;
                    case 3:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 4:
                        i2 = C0721a.m728g(parcel2, F);
                        break;
                    case 5:
                        participantEntity = (ParticipantEntity) C0721a.m716a(parcel2, F, ParticipantEntity.CREATOR);
                        break;
                    case 6:
                        arrayList = C0721a.m723c(parcel2, F, ParticipantEntity.CREATOR);
                        break;
                    case 7:
                        i3 = C0721a.m728g(parcel2, F);
                        break;
                    case 8:
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
            return new InvitationEntity(i, gameEntity, str, j, i2, participantEntity, arrayList, i3, i4);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    /* renamed from: el */
    public InvitationEntity[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
