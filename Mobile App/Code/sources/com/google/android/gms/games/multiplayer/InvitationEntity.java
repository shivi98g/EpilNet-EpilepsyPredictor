package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;

public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Parcelable.Creator<InvitationEntity> CREATOR = new InvitationEntityCreatorCompat();

    /* renamed from: CK */
    private final int f2123CK;

    /* renamed from: YG */
    private final String f2124YG;
    private final GameEntity acs;
    private final long adS;
    private final int adT;
    private final ParticipantEntity adU;
    private final ArrayList<ParticipantEntity> adV;
    private final int adW;
    private final int adX;

    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator {
        InvitationEntityCreatorCompat() {
        }

        /* renamed from: cz */
        public InvitationEntity createFromParcel(Parcel parcel) {
            if (InvitationEntity.m2564c(InvitationEntity.m5171ht()) || InvitationEntity.m5169aW(InvitationEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            GameEntity createFromParcel = GameEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ParticipantEntity createFromParcel2 = ParticipantEntity.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new InvitationEntity(2, createFromParcel, readString, readLong, readInt, createFromParcel2, arrayList, -1, 0);
        }
    }

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList<ParticipantEntity> arrayList, int i3, int i4) {
        this.f2123CK = i;
        this.acs = gameEntity;
        this.f2124YG = str;
        this.adS = j;
        this.adT = i2;
        this.adU = participantEntity;
        this.adV = arrayList;
        this.adW = i3;
        this.adX = i4;
    }

    InvitationEntity(Invitation invitation) {
        this.f2123CK = 2;
        this.acs = new GameEntity(invitation.getGame());
        this.f2124YG = invitation.getInvitationId();
        this.adS = invitation.getCreationTimestamp();
        this.adT = invitation.getInvitationType();
        this.adW = invitation.getVariant();
        this.adX = invitation.getAvailableAutoMatchSlots();
        String participantId = invitation.getInviter().getParticipantId();
        ArrayList<Participant> participants = invitation.getParticipants();
        int size = participants.size();
        this.adV = new ArrayList<>(size);
        Participant participant = null;
        for (int i = 0; i < size; i++) {
            Participant participant2 = participants.get(i);
            if (participant2.getParticipantId().equals(participantId)) {
                participant = participant2;
            }
            this.adV.add((ParticipantEntity) participant2.freeze());
        }
        C1785jx.m5359b(participant, (Object) "Must have a valid inviter!");
        this.adU = (ParticipantEntity) participant.freeze();
    }

    /* renamed from: a */
    static int m3702a(Invitation invitation) {
        return C1781jv.hashCode(invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.getInvitationType()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()));
    }

    /* renamed from: a */
    static boolean m3703a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return C1781jv.equal(invitation2.getGame(), invitation.getGame()) && C1781jv.equal(invitation2.getInvitationId(), invitation.getInvitationId()) && C1781jv.equal(Long.valueOf(invitation2.getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) && C1781jv.equal(Integer.valueOf(invitation2.getInvitationType()), Integer.valueOf(invitation.getInvitationType())) && C1781jv.equal(invitation2.getInviter(), invitation.getInviter()) && C1781jv.equal(invitation2.getParticipants(), invitation.getParticipants()) && C1781jv.equal(Integer.valueOf(invitation2.getVariant()), Integer.valueOf(invitation.getVariant())) && C1781jv.equal(Integer.valueOf(invitation2.getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()));
    }

    /* renamed from: b */
    static String m3704b(Invitation invitation) {
        return C1781jv.m5348h(invitation).mo15935a("Game", invitation.getGame()).mo15935a("InvitationId", invitation.getInvitationId()).mo15935a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).mo15935a("InvitationType", Integer.valueOf(invitation.getInvitationType())).mo15935a("Inviter", invitation.getInviter()).mo15935a("Participants", invitation.getParticipants()).mo15935a("Variant", Integer.valueOf(invitation.getVariant())).mo15935a("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3703a(this, obj);
    }

    public Invitation freeze() {
        return this;
    }

    public int getAvailableAutoMatchSlots() {
        return this.adX;
    }

    public long getCreationTimestamp() {
        return this.adS;
    }

    public Game getGame() {
        return this.acs;
    }

    public String getInvitationId() {
        return this.f2124YG;
    }

    public int getInvitationType() {
        return this.adT;
    }

    public Participant getInviter() {
        return this.adU;
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<>(this.adV);
    }

    public int getVariant() {
        return this.adW;
    }

    public int getVersionCode() {
        return this.f2123CK;
    }

    public int hashCode() {
        return m3702a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m3704b((Invitation) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo15802hu()) {
            InvitationEntityCreator.m3709a(this, parcel, i);
            return;
        }
        this.acs.writeToParcel(parcel, i);
        parcel.writeString(this.f2124YG);
        parcel.writeLong(this.adS);
        parcel.writeInt(this.adT);
        this.adU.writeToParcel(parcel, i);
        int size = this.adV.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.adV.get(i2).writeToParcel(parcel, i);
        }
    }
}
