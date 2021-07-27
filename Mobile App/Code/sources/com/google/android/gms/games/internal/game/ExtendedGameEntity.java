package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;

public final class ExtendedGameEntity extends GamesDowngradeableSafeParcel implements ExtendedGame {
    public static final ExtendedGameEntityCreator CREATOR = new ExtendedGameEntityCreatorCompat();

    /* renamed from: CK */
    private final int f2103CK;
    private final String acA;
    private final ArrayList<GameBadgeEntity> acB;
    private final SnapshotMetadataEntity acC;
    private final GameEntity acs;
    private final int act;
    private final boolean acu;
    private final int acv;
    private final long acw;
    private final long acx;
    private final String acy;
    private final long acz;

    static final class ExtendedGameEntityCreatorCompat extends ExtendedGameEntityCreator {
        ExtendedGameEntityCreatorCompat() {
        }

        /* renamed from: cu */
        public ExtendedGameEntity createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (ExtendedGameEntity.m2564c(ExtendedGameEntity.m5171ht()) || ExtendedGameEntity.m5169aW(ExtendedGameEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            GameEntity createFromParcel = GameEntity.CREATOR.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            int i = 0;
            boolean z = parcel.readInt() == 1;
            int readInt2 = parcel.readInt();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            long readLong3 = parcel.readLong();
            String readString2 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (i < readInt3) {
                arrayList.add(GameBadgeEntity.CREATOR.createFromParcel(parcel2));
                i++;
                readInt3 = readInt3;
            }
            return new ExtendedGameEntity(2, createFromParcel, readInt, z, readInt2, readLong, readLong2, readString, readLong3, readString2, arrayList, (SnapshotMetadataEntity) null);
        }
    }

    ExtendedGameEntity(int i, GameEntity gameEntity, int i2, boolean z, int i3, long j, long j2, String str, long j3, String str2, ArrayList<GameBadgeEntity> arrayList, SnapshotMetadataEntity snapshotMetadataEntity) {
        this.f2103CK = i;
        this.acs = gameEntity;
        this.act = i2;
        this.acu = z;
        this.acv = i3;
        this.acw = j;
        this.acx = j2;
        this.acy = str;
        this.acz = j3;
        this.acA = str2;
        this.acB = arrayList;
        this.acC = snapshotMetadataEntity;
    }

    public ExtendedGameEntity(ExtendedGame extendedGame) {
        this.f2103CK = 2;
        Game game = extendedGame.getGame();
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        this.acs = game == null ? null : new GameEntity(game);
        this.act = extendedGame.mo14126lZ();
        this.acu = extendedGame.mo14127ma();
        this.acv = extendedGame.mo14128mb();
        this.acw = extendedGame.mo14129mc();
        this.acx = extendedGame.mo14130md();
        this.acy = extendedGame.mo14131me();
        this.acz = extendedGame.mo14132mf();
        this.acA = extendedGame.mo14133mg();
        SnapshotMetadata mh = extendedGame.mo14134mh();
        this.acC = mh != null ? new SnapshotMetadataEntity(mh) : snapshotMetadataEntity;
        ArrayList<GameBadge> lY = extendedGame.mo14125lY();
        int size = lY.size();
        this.acB = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.acB.add((GameBadgeEntity) lY.get(i).freeze());
        }
    }

    /* renamed from: a */
    static int m3569a(ExtendedGame extendedGame) {
        return C1781jv.hashCode(extendedGame.getGame(), Integer.valueOf(extendedGame.mo14126lZ()), Boolean.valueOf(extendedGame.mo14127ma()), Integer.valueOf(extendedGame.mo14128mb()), Long.valueOf(extendedGame.mo14129mc()), Long.valueOf(extendedGame.mo14130md()), extendedGame.mo14131me(), Long.valueOf(extendedGame.mo14132mf()), extendedGame.mo14133mg());
    }

    /* renamed from: a */
    static boolean m3570a(ExtendedGame extendedGame, Object obj) {
        if (!(obj instanceof ExtendedGame)) {
            return false;
        }
        if (extendedGame == obj) {
            return true;
        }
        ExtendedGame extendedGame2 = (ExtendedGame) obj;
        return C1781jv.equal(extendedGame2.getGame(), extendedGame.getGame()) && C1781jv.equal(Integer.valueOf(extendedGame2.mo14126lZ()), Integer.valueOf(extendedGame.mo14126lZ())) && C1781jv.equal(Boolean.valueOf(extendedGame2.mo14127ma()), Boolean.valueOf(extendedGame.mo14127ma())) && C1781jv.equal(Integer.valueOf(extendedGame2.mo14128mb()), Integer.valueOf(extendedGame.mo14128mb())) && C1781jv.equal(Long.valueOf(extendedGame2.mo14129mc()), Long.valueOf(extendedGame.mo14129mc())) && C1781jv.equal(Long.valueOf(extendedGame2.mo14130md()), Long.valueOf(extendedGame.mo14130md())) && C1781jv.equal(extendedGame2.mo14131me(), extendedGame.mo14131me()) && C1781jv.equal(Long.valueOf(extendedGame2.mo14132mf()), Long.valueOf(extendedGame.mo14132mf())) && C1781jv.equal(extendedGame2.mo14133mg(), extendedGame.mo14133mg());
    }

    /* renamed from: b */
    static String m3571b(ExtendedGame extendedGame) {
        return C1781jv.m5348h(extendedGame).mo15935a("Game", extendedGame.getGame()).mo15935a("Availability", Integer.valueOf(extendedGame.mo14126lZ())).mo15935a("Owned", Boolean.valueOf(extendedGame.mo14127ma())).mo15935a("AchievementUnlockedCount", Integer.valueOf(extendedGame.mo14128mb())).mo15935a("LastPlayedServerTimestamp", Long.valueOf(extendedGame.mo14129mc())).mo15935a("PriceMicros", Long.valueOf(extendedGame.mo14130md())).mo15935a("FormattedPrice", extendedGame.mo14131me()).mo15935a("FullPriceMicros", Long.valueOf(extendedGame.mo14132mf())).mo15935a("FormattedFullPrice", extendedGame.mo14133mg()).mo15935a("Snapshot", extendedGame.mo14134mh()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3570a(this, obj);
    }

    public int getVersionCode() {
        return this.f2103CK;
    }

    public int hashCode() {
        return m3569a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: lY */
    public ArrayList<GameBadge> mo14125lY() {
        return new ArrayList<>(this.acB);
    }

    /* renamed from: lZ */
    public int mo14126lZ() {
        return this.act;
    }

    /* renamed from: ma */
    public boolean mo14127ma() {
        return this.acu;
    }

    /* renamed from: mb */
    public int mo14128mb() {
        return this.acv;
    }

    /* renamed from: mc */
    public long mo14129mc() {
        return this.acw;
    }

    /* renamed from: md */
    public long mo14130md() {
        return this.acx;
    }

    /* renamed from: me */
    public String mo14131me() {
        return this.acy;
    }

    /* renamed from: mf */
    public long mo14132mf() {
        return this.acz;
    }

    /* renamed from: mg */
    public String mo14133mg() {
        return this.acA;
    }

    /* renamed from: mh */
    public SnapshotMetadata mo14134mh() {
        return this.acC;
    }

    /* renamed from: mi */
    public GameEntity getGame() {
        return this.acs;
    }

    /* renamed from: mj */
    public ExtendedGame freeze() {
        return this;
    }

    public String toString() {
        return m3571b((ExtendedGame) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo15802hu()) {
            ExtendedGameEntityCreator.m3588a(this, parcel, i);
            return;
        }
        this.acs.writeToParcel(parcel, i);
        parcel.writeInt(this.act);
        parcel.writeInt(this.acu ? 1 : 0);
        parcel.writeInt(this.acv);
        parcel.writeLong(this.acw);
        parcel.writeLong(this.acx);
        parcel.writeString(this.acy);
        parcel.writeLong(this.acz);
        parcel.writeString(this.acA);
        int size = this.acB.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.acB.get(i2).writeToParcel(parcel, i);
        }
    }
}
