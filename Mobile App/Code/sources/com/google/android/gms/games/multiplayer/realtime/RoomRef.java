package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;

public final class RoomRef extends C0705d implements Room {

    /* renamed from: Ya */
    private final int f2142Ya;

    RoomRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f2142Ya = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return RoomEntity.m3734a((Room) this, obj);
    }

    public Room freeze() {
        return new RoomEntity(this);
    }

    public Bundle getAutoMatchCriteria() {
        if (!getBoolean("has_automatch_criteria")) {
            return null;
        }
        return RoomConfig.createAutoMatchCriteria(getInteger("automatch_min_players"), getInteger("automatch_max_players"), getLong("automatch_bit_mask"));
    }

    public int getAutoMatchWaitEstimateSeconds() {
        return getInteger("automatch_wait_estimate_sec");
    }

    public long getCreationTimestamp() {
        return getLong("creation_timestamp");
    }

    public String getCreatorId() {
        return getString("creator_external");
    }

    public String getDescription() {
        return getString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        mo11079a(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, charArrayBuffer);
    }

    public Participant getParticipant(String str) {
        return RoomEntity.m3739c(this, str);
    }

    public String getParticipantId(String str) {
        return RoomEntity.m3736b(this, str);
    }

    public ArrayList<String> getParticipantIds() {
        return RoomEntity.m3740c(this);
    }

    public int getParticipantStatus(String str) {
        return RoomEntity.m3733a((Room) this, str);
    }

    public ArrayList<Participant> getParticipants() {
        ArrayList<Participant> arrayList = new ArrayList<>(this.f2142Ya);
        for (int i = 0; i < this.f2142Ya; i++) {
            arrayList.add(new ParticipantRef(this.f790JG, this.f791KZ + i));
        }
        return arrayList;
    }

    public String getRoomId() {
        return getString("external_match_id");
    }

    public int getStatus() {
        return getInteger(NotificationCompat.CATEGORY_STATUS);
    }

    public int getVariant() {
        return getInteger("variant");
    }

    public int hashCode() {
        return RoomEntity.m3732a(this);
    }

    public String toString() {
        return RoomEntity.m3735b((Room) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) freeze()).writeToParcel(parcel, i);
    }
}
