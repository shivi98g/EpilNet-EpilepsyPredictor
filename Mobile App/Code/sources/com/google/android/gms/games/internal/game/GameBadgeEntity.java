package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.C1781jv;

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntityCreatorCompat();

    /* renamed from: CK */
    private final int f2105CK;

    /* renamed from: Gt */
    private int f2106Gt;

    /* renamed from: OH */
    private String f2107OH;

    /* renamed from: UO */
    private String f2108UO;

    /* renamed from: WD */
    private Uri f2109WD;

    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator {
        GameBadgeEntityCreatorCompat() {
        }

        /* renamed from: cv */
        public GameBadgeEntity createFromParcel(Parcel parcel) {
            if (GameBadgeEntity.m2564c(GameBadgeEntity.m5171ht()) || GameBadgeEntity.m5169aW(GameBadgeEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            return new GameBadgeEntity(1, readInt, readString, readString2, readString3 == null ? null : Uri.parse(readString3));
        }
    }

    GameBadgeEntity(int i, int i2, String str, String str2, Uri uri) {
        this.f2105CK = i;
        this.f2106Gt = i2;
        this.f2107OH = str;
        this.f2108UO = str2;
        this.f2109WD = uri;
    }

    public GameBadgeEntity(GameBadge gameBadge) {
        this.f2105CK = 1;
        this.f2106Gt = gameBadge.getType();
        this.f2107OH = gameBadge.getTitle();
        this.f2108UO = gameBadge.getDescription();
        this.f2109WD = gameBadge.getIconImageUri();
    }

    /* renamed from: a */
    static int m3603a(GameBadge gameBadge) {
        return C1781jv.hashCode(Integer.valueOf(gameBadge.getType()), gameBadge.getTitle(), gameBadge.getDescription(), gameBadge.getIconImageUri());
    }

    /* renamed from: a */
    static boolean m3604a(GameBadge gameBadge, Object obj) {
        if (!(obj instanceof GameBadge)) {
            return false;
        }
        if (gameBadge == obj) {
            return true;
        }
        GameBadge gameBadge2 = (GameBadge) obj;
        return C1781jv.equal(Integer.valueOf(gameBadge2.getType()), gameBadge.getTitle()) && C1781jv.equal(gameBadge2.getDescription(), gameBadge.getIconImageUri());
    }

    /* renamed from: b */
    static String m3605b(GameBadge gameBadge) {
        return C1781jv.m5348h(gameBadge).mo15935a("Type", Integer.valueOf(gameBadge.getType())).mo15935a("Title", gameBadge.getTitle()).mo15935a("Description", gameBadge.getDescription()).mo15935a("IconImageUri", gameBadge.getIconImageUri()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3604a(this, obj);
    }

    public String getDescription() {
        return this.f2108UO;
    }

    public Uri getIconImageUri() {
        return this.f2109WD;
    }

    public String getTitle() {
        return this.f2107OH;
    }

    public int getType() {
        return this.f2106Gt;
    }

    public int getVersionCode() {
        return this.f2105CK;
    }

    public int hashCode() {
        return m3603a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: mk */
    public GameBadge freeze() {
        return this;
    }

    public String toString() {
        return m3605b((GameBadge) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo15802hu()) {
            GameBadgeEntityCreator.m3611a(this, parcel, i);
            return;
        }
        parcel.writeInt(this.f2106Gt);
        parcel.writeString(this.f2107OH);
        parcel.writeString(this.f2108UO);
        parcel.writeString(this.f2109WD == null ? null : this.f2109WD.toString());
    }
}
