package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.games.PlayerEntity;

public class EventEntityCreator implements Parcelable.Creator<EventEntity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m2208a(EventEntity eventEntity, Parcel parcel, int i) {
        int H = C0723b.m750H(parcel);
        C0723b.m763a(parcel, 1, eventEntity.getEventId(), false);
        C0723b.m775c(parcel, 1000, eventEntity.getVersionCode());
        C0723b.m763a(parcel, 2, eventEntity.getName(), false);
        C0723b.m763a(parcel, 3, eventEntity.getDescription(), false);
        C0723b.m759a(parcel, 4, (Parcelable) eventEntity.getIconImageUri(), i, false);
        C0723b.m763a(parcel, 5, eventEntity.getIconImageUrl(), false);
        C0723b.m759a(parcel, 6, (Parcelable) eventEntity.getPlayer(), i, false);
        C0723b.m755a(parcel, 7, eventEntity.getValue());
        C0723b.m763a(parcel, 8, eventEntity.getFormattedValue(), false);
        C0723b.m766a(parcel, 9, eventEntity.isVisible());
        C0723b.m751H(parcel, H);
    }

    public EventEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int G = C0721a.m714G(parcel);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        PlayerEntity playerEntity = null;
        String str5 = null;
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
                        str3 = C0721a.m736o(parcel2, F);
                        break;
                    case 4:
                        uri = (Uri) C0721a.m716a(parcel2, F, Uri.CREATOR);
                        break;
                    case 5:
                        str4 = C0721a.m736o(parcel2, F);
                        break;
                    case 6:
                        playerEntity = (PlayerEntity) C0721a.m716a(parcel2, F, PlayerEntity.CREATOR);
                        break;
                    case 7:
                        j = C0721a.m730i(parcel2, F);
                        break;
                    case 8:
                        str5 = C0721a.m736o(parcel2, F);
                        break;
                    case 9:
                        z = C0721a.m724c(parcel2, F);
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
            return new EventEntity(i, str, str2, str3, uri, str4, playerEntity, j, str5, z);
        }
        throw new C0721a.C0722a("Overread allowed size end=" + G, parcel2);
    }

    public EventEntity[] newArray(int i) {
        return new EventEntity[i];
    }
}
