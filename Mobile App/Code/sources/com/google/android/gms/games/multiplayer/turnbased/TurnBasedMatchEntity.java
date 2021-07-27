package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;
import java.util.ArrayList;

public final class TurnBasedMatchEntity implements SafeParcelable, TurnBasedMatch {
    public static final TurnBasedMatchEntityCreator CREATOR = new TurnBasedMatchEntityCreator();

    /* renamed from: CK */
    private final int f2143CK;

    /* renamed from: Ef */
    private final int f2144Ef;

    /* renamed from: UO */
    private final String f2145UO;

    /* renamed from: XH */
    private final long f2146XH;

    /* renamed from: Zb */
    private final String f2147Zb;
    private final GameEntity acs;
    private final long adS;
    private final ArrayList<ParticipantEntity> adV;
    private final int adW;
    private final byte[] aeA;
    private final String aeB;
    private final byte[] aeC;
    private final int aeD;
    private final int aeE;
    private final boolean aeF;
    private final String aeG;
    private final Bundle aem;
    private final String aep;
    private final String aex;
    private final String aey;
    private final int aez;

    TurnBasedMatchEntity(int i, GameEntity gameEntity, String str, String str2, long j, String str3, long j2, String str4, int i2, int i3, int i4, byte[] bArr, ArrayList<ParticipantEntity> arrayList, String str5, byte[] bArr2, int i5, Bundle bundle, int i6, boolean z, String str6, String str7) {
        this.f2143CK = i;
        this.acs = gameEntity;
        this.f2147Zb = str;
        this.aep = str2;
        this.adS = j;
        this.aex = str3;
        this.f2146XH = j2;
        this.aey = str4;
        this.aez = i2;
        this.aeE = i6;
        this.adW = i3;
        this.f2144Ef = i4;
        this.aeA = bArr;
        this.adV = arrayList;
        this.aeB = str5;
        this.aeC = bArr2;
        this.aeD = i5;
        this.aem = bundle;
        this.aeF = z;
        this.f2145UO = str6;
        this.aeG = str7;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnBasedMatch) {
        this.f2143CK = 2;
        this.acs = new GameEntity(turnBasedMatch.getGame());
        this.f2147Zb = turnBasedMatch.getMatchId();
        this.aep = turnBasedMatch.getCreatorId();
        this.adS = turnBasedMatch.getCreationTimestamp();
        this.aex = turnBasedMatch.getLastUpdaterId();
        this.f2146XH = turnBasedMatch.getLastUpdatedTimestamp();
        this.aey = turnBasedMatch.getPendingParticipantId();
        this.aez = turnBasedMatch.getStatus();
        this.aeE = turnBasedMatch.getTurnStatus();
        this.adW = turnBasedMatch.getVariant();
        this.f2144Ef = turnBasedMatch.getVersion();
        this.aeB = turnBasedMatch.getRematchId();
        this.aeD = turnBasedMatch.getMatchNumber();
        this.aem = turnBasedMatch.getAutoMatchCriteria();
        this.aeF = turnBasedMatch.isLocallyModified();
        this.f2145UO = turnBasedMatch.getDescription();
        this.aeG = turnBasedMatch.getDescriptionParticipantId();
        byte[] data = turnBasedMatch.getData();
        if (data == null) {
            this.aeA = null;
        } else {
            this.aeA = new byte[data.length];
            System.arraycopy(data, 0, this.aeA, 0, data.length);
        }
        byte[] previousMatchData = turnBasedMatch.getPreviousMatchData();
        if (previousMatchData == null) {
            this.aeC = null;
        } else {
            this.aeC = new byte[previousMatchData.length];
            System.arraycopy(previousMatchData, 0, this.aeC, 0, previousMatchData.length);
        }
        ArrayList<Participant> participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        this.adV = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.adV.add((ParticipantEntity) participants.get(i).freeze());
        }
    }

    /* renamed from: a */
    static int m3752a(TurnBasedMatch turnBasedMatch) {
        return C1781jv.hashCode(turnBasedMatch.getGame(), turnBasedMatch.getMatchId(), turnBasedMatch.getCreatorId(), Long.valueOf(turnBasedMatch.getCreationTimestamp()), turnBasedMatch.getLastUpdaterId(), Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp()), turnBasedMatch.getPendingParticipantId(), Integer.valueOf(turnBasedMatch.getStatus()), Integer.valueOf(turnBasedMatch.getTurnStatus()), turnBasedMatch.getDescription(), Integer.valueOf(turnBasedMatch.getVariant()), Integer.valueOf(turnBasedMatch.getVersion()), turnBasedMatch.getParticipants(), turnBasedMatch.getRematchId(), Integer.valueOf(turnBasedMatch.getMatchNumber()), turnBasedMatch.getAutoMatchCriteria(), Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnBasedMatch.isLocallyModified()));
    }

    /* renamed from: a */
    static int m3753a(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList<Participant> participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant.getStatus();
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in match " + turnBasedMatch.getMatchId());
    }

    /* renamed from: a */
    static boolean m3754a(TurnBasedMatch turnBasedMatch, Object obj) {
        if (!(obj instanceof TurnBasedMatch)) {
            return false;
        }
        if (turnBasedMatch == obj) {
            return true;
        }
        TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch) obj;
        return C1781jv.equal(turnBasedMatch2.getGame(), turnBasedMatch.getGame()) && C1781jv.equal(turnBasedMatch2.getMatchId(), turnBasedMatch.getMatchId()) && C1781jv.equal(turnBasedMatch2.getCreatorId(), turnBasedMatch.getCreatorId()) && C1781jv.equal(Long.valueOf(turnBasedMatch2.getCreationTimestamp()), Long.valueOf(turnBasedMatch.getCreationTimestamp())) && C1781jv.equal(turnBasedMatch2.getLastUpdaterId(), turnBasedMatch.getLastUpdaterId()) && C1781jv.equal(Long.valueOf(turnBasedMatch2.getLastUpdatedTimestamp()), Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp())) && C1781jv.equal(turnBasedMatch2.getPendingParticipantId(), turnBasedMatch.getPendingParticipantId()) && C1781jv.equal(Integer.valueOf(turnBasedMatch2.getStatus()), Integer.valueOf(turnBasedMatch.getStatus())) && C1781jv.equal(Integer.valueOf(turnBasedMatch2.getTurnStatus()), Integer.valueOf(turnBasedMatch.getTurnStatus())) && C1781jv.equal(turnBasedMatch2.getDescription(), turnBasedMatch.getDescription()) && C1781jv.equal(Integer.valueOf(turnBasedMatch2.getVariant()), Integer.valueOf(turnBasedMatch.getVariant())) && C1781jv.equal(Integer.valueOf(turnBasedMatch2.getVersion()), Integer.valueOf(turnBasedMatch.getVersion())) && C1781jv.equal(turnBasedMatch2.getParticipants(), turnBasedMatch.getParticipants()) && C1781jv.equal(turnBasedMatch2.getRematchId(), turnBasedMatch.getRematchId()) && C1781jv.equal(Integer.valueOf(turnBasedMatch2.getMatchNumber()), Integer.valueOf(turnBasedMatch.getMatchNumber())) && C1781jv.equal(turnBasedMatch2.getAutoMatchCriteria(), turnBasedMatch.getAutoMatchCriteria()) && C1781jv.equal(Integer.valueOf(turnBasedMatch2.getAvailableAutoMatchSlots()), Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots())) && C1781jv.equal(Boolean.valueOf(turnBasedMatch2.isLocallyModified()), Boolean.valueOf(turnBasedMatch.isLocallyModified()));
    }

    /* renamed from: b */
    static String m3755b(TurnBasedMatch turnBasedMatch) {
        return C1781jv.m5348h(turnBasedMatch).mo15935a("Game", turnBasedMatch.getGame()).mo15935a("MatchId", turnBasedMatch.getMatchId()).mo15935a("CreatorId", turnBasedMatch.getCreatorId()).mo15935a("CreationTimestamp", Long.valueOf(turnBasedMatch.getCreationTimestamp())).mo15935a("LastUpdaterId", turnBasedMatch.getLastUpdaterId()).mo15935a("LastUpdatedTimestamp", Long.valueOf(turnBasedMatch.getLastUpdatedTimestamp())).mo15935a("PendingParticipantId", turnBasedMatch.getPendingParticipantId()).mo15935a("MatchStatus", Integer.valueOf(turnBasedMatch.getStatus())).mo15935a("TurnStatus", Integer.valueOf(turnBasedMatch.getTurnStatus())).mo15935a("Description", turnBasedMatch.getDescription()).mo15935a("Variant", Integer.valueOf(turnBasedMatch.getVariant())).mo15935a("Data", turnBasedMatch.getData()).mo15935a("Version", Integer.valueOf(turnBasedMatch.getVersion())).mo15935a("Participants", turnBasedMatch.getParticipants()).mo15935a("RematchId", turnBasedMatch.getRematchId()).mo15935a("PreviousData", turnBasedMatch.getPreviousMatchData()).mo15935a("MatchNumber", Integer.valueOf(turnBasedMatch.getMatchNumber())).mo15935a("AutoMatchCriteria", turnBasedMatch.getAutoMatchCriteria()).mo15935a("AvailableAutoMatchSlots", Integer.valueOf(turnBasedMatch.getAvailableAutoMatchSlots())).mo15935a("LocallyModified", Boolean.valueOf(turnBasedMatch.isLocallyModified())).mo15935a("DescriptionParticipantId", turnBasedMatch.getDescriptionParticipantId()).toString();
    }

    /* renamed from: b */
    static String m3756b(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList<Participant> participants = turnBasedMatch.getParticipants();
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
    static Participant m3757c(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList<Participant> participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant;
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in match " + turnBasedMatch.getMatchId());
    }

    /* renamed from: c */
    static ArrayList<String> m3758c(TurnBasedMatch turnBasedMatch) {
        ArrayList<Participant> participants = turnBasedMatch.getParticipants();
        int size = participants.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(participants.get(i).getParticipantId());
        }
        return arrayList;
    }

    public boolean canRematch() {
        return this.aez == 2 && this.aeB == null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3754a((TurnBasedMatch) this, obj);
    }

    public TurnBasedMatch freeze() {
        return this;
    }

    public Bundle getAutoMatchCriteria() {
        return this.aem;
    }

    public int getAvailableAutoMatchSlots() {
        if (this.aem == null) {
            return 0;
        }
        return this.aem.getInt(Multiplayer.EXTRA_MAX_AUTOMATCH_PLAYERS);
    }

    public long getCreationTimestamp() {
        return this.adS;
    }

    public String getCreatorId() {
        return this.aep;
    }

    public byte[] getData() {
        return this.aeA;
    }

    public String getDescription() {
        return this.f2145UO;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f2145UO, charArrayBuffer);
    }

    public Participant getDescriptionParticipant() {
        String descriptionParticipantId = getDescriptionParticipantId();
        if (descriptionParticipantId == null) {
            return null;
        }
        return getParticipant(descriptionParticipantId);
    }

    public String getDescriptionParticipantId() {
        return this.aeG;
    }

    public Game getGame() {
        return this.acs;
    }

    public long getLastUpdatedTimestamp() {
        return this.f2146XH;
    }

    public String getLastUpdaterId() {
        return this.aex;
    }

    public String getMatchId() {
        return this.f2147Zb;
    }

    public int getMatchNumber() {
        return this.aeD;
    }

    public Participant getParticipant(String str) {
        return m3757c(this, str);
    }

    public String getParticipantId(String str) {
        return m3756b(this, str);
    }

    public ArrayList<String> getParticipantIds() {
        return m3758c(this);
    }

    public int getParticipantStatus(String str) {
        return m3753a((TurnBasedMatch) this, str);
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<>(this.adV);
    }

    public String getPendingParticipantId() {
        return this.aey;
    }

    public byte[] getPreviousMatchData() {
        return this.aeC;
    }

    public String getRematchId() {
        return this.aeB;
    }

    public int getStatus() {
        return this.aez;
    }

    public int getTurnStatus() {
        return this.aeE;
    }

    public int getVariant() {
        return this.adW;
    }

    public int getVersion() {
        return this.f2144Ef;
    }

    public int getVersionCode() {
        return this.f2143CK;
    }

    public int hashCode() {
        return m3752a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isLocallyModified() {
        return this.aeF;
    }

    public String toString() {
        return m3755b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        TurnBasedMatchEntityCreator.m3759a(this, parcel, i);
    }
}
