package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class QuestEntityCreator implements Parcelable.Creator<QuestEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m3775a(QuestEntity questEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m759a(parcel, 1, (Parcelable) questEntity.getGame(), i, false);
        C0723b.m763a(parcel, 2, questEntity.getQuestId(), false);
        C0723b.m755a(parcel, 3, questEntity.getAcceptedTimestamp());
        C0723b.m759a(parcel, 4, (Parcelable) questEntity.getBannerImageUri(), i, false);
        C0723b.m763a(parcel, 5, questEntity.getBannerImageUrl(), false);
        C0723b.m763a(parcel, 6, questEntity.getDescription(), false);
        C0723b.m755a(parcel, 7, questEntity.getEndTimestamp());
        C0723b.m755a(parcel, 8, questEntity.getLastUpdatedTimestamp());
        C0723b.m759a(parcel, 9, (Parcelable) questEntity.getIconImageUri(), i, false);
        C0723b.m763a(parcel, 10, questEntity.getIconImageUrl(), false);
        C0723b.m763a(parcel, 12, questEntity.getName(), false);
        C0723b.m755a(parcel, 13, questEntity.mo14535mR());
        C0723b.m755a(parcel, 14, questEntity.getStartTimestamp());
        C0723b.m775c(parcel, 15, questEntity.getState());
        C0723b.m776c(parcel, 17, questEntity.mo14534mQ(), false);
        C0723b.m775c(parcel, 16, questEntity.getType());
        C0723b.m775c(parcel, 1000, questEntity.getVersionCode());
        C0723b.m751H(parcel, H);
    }

    public QuestEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        GameEntity gameEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        Uri uri2 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
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
                        uri = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 5:
                        str2 = C0721a.m736o(parcel2, F);
                        break;
                    case 6:
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 7:
                        j2 = C0721a.m730i(parcel2, F);
                        break;
                    case 8:
                        j3 = C0721a.m730i(parcel2, F);
                        break;
                    case 9:
                        uri2 = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 10:
                        str4 = C0721a.m736o(parcel2, F);
                        break;
                    default:
                        switch (aH) {
                            case 12:
                                str5 = C0721a.m736o(parcel2, F);
                                break;
                            case 13:
                                j4 = C0721a.m730i(parcel2, F);
                                break;
                            case 14:
                                j5 = C0721a.m730i(parcel2, F);
                                break;
                            case 15:
                                i2 = C0721a.m728g(parcel2, F);
                                break;
                            case 16:
                                i3 = C0721a.m728g(parcel2, F);
                                break;
                            case 17:
                                arrayList = C0721a.m723c(parcel2, F, MilestoneEntity.CREATOR);
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
            return new QuestEntity(i, gameEntity, str, j, uri, str2, str3, j2, j3, uri2, str4, str5, j4, j5, i2, i3, arrayList);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    public QuestEntity[] newArray(int i) {
        return new QuestEntity[i];
    }
}
