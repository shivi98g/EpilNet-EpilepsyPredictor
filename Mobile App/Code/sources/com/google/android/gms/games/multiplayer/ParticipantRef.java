package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class ParticipantRef extends C0705d implements Participant {
    private final PlayerRef aeb;

    public ParticipantRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.aeb = new PlayerRef(dataHolder, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return ParticipantEntity.m3714a(this, obj);
    }

    public Participant freeze() {
        return new ParticipantEntity(this);
    }

    public int getCapabilities() {
        return getInteger("capabilities");
    }

    public String getDisplayName() {
        return mo11082aS("external_player_id") ? getString("default_display_name") : this.aeb.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        if (mo11082aS("external_player_id")) {
            mo11079a("default_display_name", charArrayBuffer);
        } else {
            this.aeb.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getHiResImageUri() {
        return mo11082aS("external_player_id") ? mo11081aR("default_display_hi_res_image_uri") : this.aeb.getHiResImageUri();
    }

    public String getHiResImageUrl() {
        return mo11082aS("external_player_id") ? getString("default_display_hi_res_image_url") : this.aeb.getHiResImageUrl();
    }

    public Uri getIconImageUri() {
        return mo11082aS("external_player_id") ? mo11081aR("default_display_image_uri") : this.aeb.getIconImageUri();
    }

    public String getIconImageUrl() {
        return mo11082aS("external_player_id") ? getString("default_display_image_url") : this.aeb.getIconImageUrl();
    }

    public String getParticipantId() {
        return getString("external_participant_id");
    }

    public Player getPlayer() {
        if (mo11082aS("external_player_id")) {
            return null;
        }
        return this.aeb;
    }

    public ParticipantResult getResult() {
        if (mo11082aS("result_type")) {
            return null;
        }
        return new ParticipantResult(getParticipantId(), getInteger("result_type"), getInteger("placing"));
    }

    public int getStatus() {
        return getInteger("player_status");
    }

    public int hashCode() {
        return ParticipantEntity.m3713a(this);
    }

    public boolean isConnectedToRoom() {
        return getInteger("connected") > 0;
    }

    /* renamed from: le */
    public String mo14349le() {
        return getString("client_address");
    }

    public String toString() {
        return ParticipantEntity.m3715b((Participant) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) freeze()).writeToParcel(parcel, i);
    }
}
