package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;
import java.util.ArrayList;

public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Parcelable.Creator<RoomEntity> CREATOR = new RoomEntityCreatorCompat();

    /* renamed from: CK */
    private final int f2139CK;

    /* renamed from: UO */
    private final String f2140UO;

    /* renamed from: YI */
    private final String f2141YI;
    private final long adS;
    private final ArrayList<ParticipantEntity> adV;
    private final int adW;
    private final Bundle aem;
    private final String aep;
    private final int aeq;
    private final int aer;

    static final class RoomEntityCreatorCompat extends RoomEntityCreator {
        RoomEntityCreatorCompat() {
        }

        /* renamed from: cC */
        public RoomEntity createFromParcel(Parcel parcel) {
            if (RoomEntity.m2564c(RoomEntity.m5171ht()) || RoomEntity.m5169aW(RoomEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            Bundle readBundle = parcel.readBundle();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i < readInt3; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
        }
    }

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList<ParticipantEntity> arrayList, int i4) {
        this.f2139CK = i;
        this.f2141YI = str;
        this.aep = str2;
        this.adS = j;
        this.aeq = i2;
        this.f2140UO = str3;
        this.adW = i3;
        this.aem = bundle;
        this.adV = arrayList;
        this.aer = i4;
    }

    public RoomEntity(Room room) {
        this.f2139CK = 2;
        this.f2141YI = room.getRoomId();
        this.aep = room.getCreatorId();
        this.adS = room.getCreationTimestamp();
        this.aeq = room.getStatus();
        this.f2140UO = room.getDescription();
        this.adW = room.getVariant();
        this.aem = room.getAutoMatchCriteria();
        ArrayList<Participant> participants = room.getParticipants();
        int size = participants.size();
        this.adV = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.adV.add((ParticipantEntity) participants.get(i).freeze());
        }
        this.aer = room.getAutoMatchWaitEstimateSeconds();
    }

    /* renamed from: a */
    static int m3732a(Room room) {
        return C1781jv.hashCode(room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()));
    }

    /* renamed from: a */
    static int m3733a(Room room, String str) {
        ArrayList<Participant> participants = room.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant.getStatus();
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in room " + room.getRoomId());
    }

    /* renamed from: a */
    static boolean m3734a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return C1781jv.equal(room2.getRoomId(), room.getRoomId()) && C1781jv.equal(room2.getCreatorId(), room.getCreatorId()) && C1781jv.equal(Long.valueOf(room2.getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) && C1781jv.equal(Integer.valueOf(room2.getStatus()), Integer.valueOf(room.getStatus())) && C1781jv.equal(room2.getDescription(), room.getDescription()) && C1781jv.equal(Integer.valueOf(room2.getVariant()), Integer.valueOf(room.getVariant())) && C1781jv.equal(room2.getAutoMatchCriteria(), room.getAutoMatchCriteria()) && C1781jv.equal(room2.getParticipants(), room.getParticipants()) && C1781jv.equal(Integer.valueOf(room2.getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()));
    }

    /* renamed from: b */
    static String m3735b(Room room) {
        return C1781jv.m5348h(room).mo15935a("RoomId", room.getRoomId()).mo15935a("CreatorId", room.getCreatorId()).mo15935a("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).mo15935a("RoomStatus", Integer.valueOf(room.getStatus())).mo15935a("Description", room.getDescription()).mo15935a("Variant", Integer.valueOf(room.getVariant())).mo15935a("AutoMatchCriteria", room.getAutoMatchCriteria()).mo15935a("Participants", room.getParticipants()).mo15935a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    /* renamed from: b */
    static String m3736b(Room room, String str) {
        ArrayList<Participant> participants = room.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = participants.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(str)) {
                return participant.getParticipantId();
            }
        }
        return null;
    }

    /* renamed from: c */
    static Participant m3739c(Room room, String str) {
        ArrayList<Participant> participants = room.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant;
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in match " + room.getRoomId());
    }

    /* renamed from: c */
    static ArrayList<String> m3740c(Room room) {
        ArrayList<Participant> participants = room.getParticipants();
        int size = participants.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(participants.get(i).getParticipantId());
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3734a((Room) this, obj);
    }

    public Room freeze() {
        return this;
    }

    public Bundle getAutoMatchCriteria() {
        return this.aem;
    }

    public int getAutoMatchWaitEstimateSeconds() {
        return this.aer;
    }

    public long getCreationTimestamp() {
        return this.adS;
    }

    public String getCreatorId() {
        return this.aep;
    }

    public String getDescription() {
        return this.f2140UO;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f2140UO, charArrayBuffer);
    }

    public Participant getParticipant(String str) {
        return m3739c(this, str);
    }

    public String getParticipantId(String str) {
        return m3736b(this, str);
    }

    public ArrayList<String> getParticipantIds() {
        return m3740c(this);
    }

    public int getParticipantStatus(String str) {
        return m3733a((Room) this, str);
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<>(this.adV);
    }

    public String getRoomId() {
        return this.f2141YI;
    }

    public int getStatus() {
        return this.aeq;
    }

    public int getVariant() {
        return this.adW;
    }

    public int getVersionCode() {
        return this.f2139CK;
    }

    public int hashCode() {
        return m3732a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m3735b((Room) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo15802hu()) {
            RoomEntityCreator.m3743a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f2141YI);
        parcel.writeString(this.aep);
        parcel.writeLong(this.adS);
        parcel.writeInt(this.aeq);
        parcel.writeString(this.f2140UO);
        parcel.writeInt(this.adW);
        parcel.writeBundle(this.aem);
        int size = this.adV.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.adV.get(i2).writeToParcel(parcel, i);
        }
    }
}
