package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;

public final class InvitationRef extends C0705d implements Invitation {
    private final ArrayList<Participant> adV;
    private final ParticipantRef adY;
    private final Game adq;

    InvitationRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.adq = new GameRef(dataHolder, i);
        this.adV = new ArrayList<>(i2);
        String string = getString("external_inviter_id");
        ParticipantRef participantRef = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ParticipantRef participantRef2 = new ParticipantRef(this.f790JG, this.f791KZ + i3);
            if (participantRef2.getParticipantId().equals(string)) {
                participantRef = participantRef2;
            }
            this.adV.add(participantRef2);
        }
        this.adY = (ParticipantRef) C1785jx.m5359b(participantRef, (Object) "Must have a valid inviter!");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return InvitationEntity.m3703a(this, obj);
    }

    public Invitation freeze() {
        return new InvitationEntity(this);
    }

    public int getAvailableAutoMatchSlots() {
        if (!getBoolean("has_automatch_criteria")) {
            return 0;
        }
        return getInteger("automatch_max_players");
    }

    public long getCreationTimestamp() {
        return Math.max(getLong("creation_timestamp"), getLong("last_modified_timestamp"));
    }

    public Game getGame() {
        return this.adq;
    }

    public String getInvitationId() {
        return getString("external_invitation_id");
    }

    public int getInvitationType() {
        return getInteger("type");
    }

    public Participant getInviter() {
        return this.adY;
    }

    public ArrayList<Participant> getParticipants() {
        return this.adV;
    }

    public int getVariant() {
        return getInteger("variant");
    }

    public int hashCode() {
        return InvitationEntity.m3702a(this);
    }

    public String toString() {
        return InvitationEntity.m3704b((Invitation) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) freeze()).writeToParcel(parcel, i);
    }
}
