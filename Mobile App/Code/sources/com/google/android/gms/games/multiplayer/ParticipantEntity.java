package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;

public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Parcelable.Creator<ParticipantEntity> CREATOR = new ParticipantEntityCreatorCompat();

    /* renamed from: CK */
    private final int f2125CK;

    /* renamed from: FO */
    private final int f2126FO;

    /* renamed from: FP */
    private final int f2127FP;

    /* renamed from: OS */
    private final String f2128OS;

    /* renamed from: WD */
    private final Uri f2129WD;

    /* renamed from: WE */
    private final Uri f2130WE;

    /* renamed from: WO */
    private final String f2131WO;

    /* renamed from: WP */
    private final String f2132WP;

    /* renamed from: XE */
    private final PlayerEntity f2133XE;

    /* renamed from: Yi */
    private final String f2134Yi;

    /* renamed from: Zk */
    private final String f2135Zk;
    private final boolean adZ;
    private final ParticipantResult aea;

    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator {
        ParticipantEntityCreatorCompat() {
        }

        /* renamed from: cA */
        public ParticipantEntity createFromParcel(Parcel parcel) {
            if (ParticipantEntity.m2564c(ParticipantEntity.m5171ht()) || ParticipantEntity.m5169aW(ParticipantEntity.class.getCanonicalName())) {
                Parcel parcel2 = parcel;
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            PlayerEntity playerEntity = null;
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            String readString4 = parcel.readString();
            Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() > 0;
            if (parcel.readInt() > 0) {
                z = true;
            }
            if (z) {
                playerEntity = PlayerEntity.CREATOR.createFromParcel(parcel);
            }
            return new ParticipantEntity(3, readString, readString2, parse, parse2, readInt, readString5, z2, playerEntity, 7, (ParticipantResult) null, (String) null, (String) null);
        }
    }

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3, ParticipantResult participantResult, String str4, String str5) {
        this.f2125CK = i;
        this.f2135Zk = str;
        this.f2128OS = str2;
        this.f2129WD = uri;
        this.f2130WE = uri2;
        this.f2127FP = i2;
        this.f2134Yi = str3;
        this.adZ = z;
        this.f2133XE = playerEntity;
        this.f2126FO = i3;
        this.aea = participantResult;
        this.f2131WO = str4;
        this.f2132WP = str5;
    }

    public ParticipantEntity(Participant participant) {
        this.f2125CK = 3;
        this.f2135Zk = participant.getParticipantId();
        this.f2128OS = participant.getDisplayName();
        this.f2129WD = participant.getIconImageUri();
        this.f2130WE = participant.getHiResImageUri();
        this.f2127FP = participant.getStatus();
        this.f2134Yi = participant.mo14349le();
        this.adZ = participant.isConnectedToRoom();
        Player player = participant.getPlayer();
        this.f2133XE = player == null ? null : new PlayerEntity(player);
        this.f2126FO = participant.getCapabilities();
        this.aea = participant.getResult();
        this.f2131WO = participant.getIconImageUrl();
        this.f2132WP = participant.getHiResImageUrl();
    }

    /* renamed from: a */
    static int m3713a(Participant participant) {
        return C1781jv.hashCode(participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.mo14349le(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId());
    }

    /* renamed from: a */
    static boolean m3714a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return C1781jv.equal(participant2.getPlayer(), participant.getPlayer()) && C1781jv.equal(Integer.valueOf(participant2.getStatus()), Integer.valueOf(participant.getStatus())) && C1781jv.equal(participant2.mo14349le(), participant.mo14349le()) && C1781jv.equal(Boolean.valueOf(participant2.isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) && C1781jv.equal(participant2.getDisplayName(), participant.getDisplayName()) && C1781jv.equal(participant2.getIconImageUri(), participant.getIconImageUri()) && C1781jv.equal(participant2.getHiResImageUri(), participant.getHiResImageUri()) && C1781jv.equal(Integer.valueOf(participant2.getCapabilities()), Integer.valueOf(participant.getCapabilities())) && C1781jv.equal(participant2.getResult(), participant.getResult()) && C1781jv.equal(participant2.getParticipantId(), participant.getParticipantId());
    }

    /* renamed from: b */
    static String m3715b(Participant participant) {
        return C1781jv.m5348h(participant).mo15935a("ParticipantId", participant.getParticipantId()).mo15935a("Player", participant.getPlayer()).mo15935a("Status", Integer.valueOf(participant.getStatus())).mo15935a("ClientAddress", participant.mo14349le()).mo15935a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).mo15935a("DisplayName", participant.getDisplayName()).mo15935a("IconImage", participant.getIconImageUri()).mo15935a("IconImageUrl", participant.getIconImageUrl()).mo15935a("HiResImage", participant.getHiResImageUri()).mo15935a("HiResImageUrl", participant.getHiResImageUrl()).mo15935a("Capabilities", Integer.valueOf(participant.getCapabilities())).mo15935a("Result", participant.getResult()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3714a(this, obj);
    }

    public Participant freeze() {
        return this;
    }

    public int getCapabilities() {
        return this.f2126FO;
    }

    public String getDisplayName() {
        return this.f2133XE == null ? this.f2128OS : this.f2133XE.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        if (this.f2133XE == null) {
            C1833le.m5524b(this.f2128OS, charArrayBuffer);
        } else {
            this.f2133XE.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getHiResImageUri() {
        return this.f2133XE == null ? this.f2130WE : this.f2133XE.getHiResImageUri();
    }

    public String getHiResImageUrl() {
        return this.f2133XE == null ? this.f2132WP : this.f2133XE.getHiResImageUrl();
    }

    public Uri getIconImageUri() {
        return this.f2133XE == null ? this.f2129WD : this.f2133XE.getIconImageUri();
    }

    public String getIconImageUrl() {
        return this.f2133XE == null ? this.f2131WO : this.f2133XE.getIconImageUrl();
    }

    public String getParticipantId() {
        return this.f2135Zk;
    }

    public Player getPlayer() {
        return this.f2133XE;
    }

    public ParticipantResult getResult() {
        return this.aea;
    }

    public int getStatus() {
        return this.f2127FP;
    }

    public int getVersionCode() {
        return this.f2125CK;
    }

    public int hashCode() {
        return m3713a(this);
    }

    public boolean isConnectedToRoom() {
        return this.adZ;
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: le */
    public String mo14349le() {
        return this.f2134Yi;
    }

    public String toString() {
        return m3715b((Participant) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo15802hu()) {
            ParticipantEntityCreator.m3721a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f2135Zk);
        parcel.writeString(this.f2128OS);
        String str = null;
        parcel.writeString(this.f2129WD == null ? null : this.f2129WD.toString());
        if (this.f2130WE != null) {
            str = this.f2130WE.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.f2127FP);
        parcel.writeString(this.f2134Yi);
        parcel.writeInt(this.adZ ? 1 : 0);
        parcel.writeInt(this.f2133XE == null ? 0 : 1);
        if (this.f2133XE != null) {
            this.f2133XE.writeToParcel(parcel, i);
        }
    }
}
