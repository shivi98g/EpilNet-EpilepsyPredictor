package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;

public final class SnapshotMetadataEntity implements SafeParcelable, SnapshotMetadata {
    public static final SnapshotMetadataEntityCreator CREATOR = new SnapshotMetadataEntityCreator();

    /* renamed from: CK */
    private final int f2168CK;

    /* renamed from: OH */
    private final String f2169OH;

    /* renamed from: UO */
    private final String f2170UO;

    /* renamed from: YB */
    private final String f2171YB;
    private final GameEntity acs;
    private final Uri afd;
    private final PlayerEntity afg;
    private final String afh;
    private final long afi;
    private final long afj;
    private final float afk;
    private final String afl;
    private final boolean afm;

    SnapshotMetadataEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z) {
        this.f2168CK = i;
        this.acs = gameEntity;
        this.afg = playerEntity;
        this.f2171YB = str;
        this.afd = uri;
        this.afh = str2;
        this.afk = f;
        this.f2169OH = str3;
        this.f2170UO = str4;
        this.afi = j;
        this.afj = j2;
        this.afl = str5;
        this.afm = z;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        this.f2168CK = 4;
        this.acs = new GameEntity(snapshotMetadata.getGame());
        this.afg = new PlayerEntity(snapshotMetadata.getOwner());
        this.f2171YB = snapshotMetadata.getSnapshotId();
        this.afd = snapshotMetadata.getCoverImageUri();
        this.afh = snapshotMetadata.getCoverImageUrl();
        this.afk = snapshotMetadata.getCoverImageAspectRatio();
        this.f2169OH = snapshotMetadata.getTitle();
        this.f2170UO = snapshotMetadata.getDescription();
        this.afi = snapshotMetadata.getLastModifiedTimestamp();
        this.afj = snapshotMetadata.getPlayedTime();
        this.afl = snapshotMetadata.getUniqueName();
        this.afm = snapshotMetadata.hasChangePending();
    }

    /* renamed from: a */
    static int m3803a(SnapshotMetadata snapshotMetadata) {
        return C1781jv.hashCode(snapshotMetadata.getGame(), snapshotMetadata.getOwner(), snapshotMetadata.getSnapshotId(), snapshotMetadata.getCoverImageUri(), Float.valueOf(snapshotMetadata.getCoverImageAspectRatio()), snapshotMetadata.getTitle(), snapshotMetadata.getDescription(), Long.valueOf(snapshotMetadata.getLastModifiedTimestamp()), Long.valueOf(snapshotMetadata.getPlayedTime()), snapshotMetadata.getUniqueName(), Boolean.valueOf(snapshotMetadata.hasChangePending()));
    }

    /* renamed from: a */
    static boolean m3804a(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return C1781jv.equal(snapshotMetadata2.getGame(), snapshotMetadata.getGame()) && C1781jv.equal(snapshotMetadata2.getOwner(), snapshotMetadata.getOwner()) && C1781jv.equal(snapshotMetadata2.getSnapshotId(), snapshotMetadata.getSnapshotId()) && C1781jv.equal(snapshotMetadata2.getCoverImageUri(), snapshotMetadata.getCoverImageUri()) && C1781jv.equal(Float.valueOf(snapshotMetadata2.getCoverImageAspectRatio()), Float.valueOf(snapshotMetadata.getCoverImageAspectRatio())) && C1781jv.equal(snapshotMetadata2.getTitle(), snapshotMetadata.getTitle()) && C1781jv.equal(snapshotMetadata2.getDescription(), snapshotMetadata.getDescription()) && C1781jv.equal(Long.valueOf(snapshotMetadata2.getLastModifiedTimestamp()), Long.valueOf(snapshotMetadata.getLastModifiedTimestamp())) && C1781jv.equal(Long.valueOf(snapshotMetadata2.getPlayedTime()), Long.valueOf(snapshotMetadata.getPlayedTime())) && C1781jv.equal(snapshotMetadata2.getUniqueName(), snapshotMetadata.getUniqueName()) && C1781jv.equal(Boolean.valueOf(snapshotMetadata2.hasChangePending()), Boolean.valueOf(snapshotMetadata.hasChangePending()));
    }

    /* renamed from: b */
    static String m3805b(SnapshotMetadata snapshotMetadata) {
        return C1781jv.m5348h(snapshotMetadata).mo15935a("Game", snapshotMetadata.getGame()).mo15935a("Owner", snapshotMetadata.getOwner()).mo15935a("SnapshotId", snapshotMetadata.getSnapshotId()).mo15935a("CoverImageUri", snapshotMetadata.getCoverImageUri()).mo15935a("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).mo15935a("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.getCoverImageAspectRatio())).mo15935a("Description", snapshotMetadata.getDescription()).mo15935a("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.getLastModifiedTimestamp())).mo15935a("PlayedTime", Long.valueOf(snapshotMetadata.getPlayedTime())).mo15935a("UniqueName", snapshotMetadata.getUniqueName()).mo15935a("ChangePending", Boolean.valueOf(snapshotMetadata.hasChangePending())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3804a(this, obj);
    }

    public SnapshotMetadata freeze() {
        return this;
    }

    public float getCoverImageAspectRatio() {
        return this.afk;
    }

    public Uri getCoverImageUri() {
        return this.afd;
    }

    public String getCoverImageUrl() {
        return this.afh;
    }

    public String getDescription() {
        return this.f2170UO;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f2170UO, charArrayBuffer);
    }

    public Game getGame() {
        return this.acs;
    }

    public long getLastModifiedTimestamp() {
        return this.afi;
    }

    public Player getOwner() {
        return this.afg;
    }

    public long getPlayedTime() {
        return this.afj;
    }

    public String getSnapshotId() {
        return this.f2171YB;
    }

    public String getTitle() {
        return this.f2169OH;
    }

    public String getUniqueName() {
        return this.afl;
    }

    public int getVersionCode() {
        return this.f2168CK;
    }

    public boolean hasChangePending() {
        return this.afm;
    }

    public int hashCode() {
        return m3803a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m3805b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnapshotMetadataEntityCreator.m3806a(this, parcel, i);
    }
}
