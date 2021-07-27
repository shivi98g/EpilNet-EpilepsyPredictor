package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public final class MostRecentGameInfoEntity implements SafeParcelable, MostRecentGameInfo {
    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();

    /* renamed from: CK */
    private final int f2111CK;
    private final String acF;
    private final String acG;
    private final long acH;
    private final Uri acI;
    private final Uri acJ;
    private final Uri acK;

    MostRecentGameInfoEntity(int i, String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.f2111CK = i;
        this.acF = str;
        this.acG = str2;
        this.acH = j;
        this.acI = uri;
        this.acJ = uri2;
        this.acK = uri3;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostRecentGameInfo) {
        this.f2111CK = 2;
        this.acF = mostRecentGameInfo.mo14214mw();
        this.acG = mostRecentGameInfo.mo14215mx();
        this.acH = mostRecentGameInfo.mo14216my();
        this.acI = mostRecentGameInfo.mo14217mz();
        this.acJ = mostRecentGameInfo.mo14212mA();
        this.acK = mostRecentGameInfo.mo14213mB();
    }

    /* renamed from: a */
    static int m3639a(MostRecentGameInfo mostRecentGameInfo) {
        return C1781jv.hashCode(mostRecentGameInfo.mo14214mw(), mostRecentGameInfo.mo14215mx(), Long.valueOf(mostRecentGameInfo.mo14216my()), mostRecentGameInfo.mo14217mz(), mostRecentGameInfo.mo14212mA(), mostRecentGameInfo.mo14213mB());
    }

    /* renamed from: a */
    static boolean m3640a(MostRecentGameInfo mostRecentGameInfo, Object obj) {
        if (!(obj instanceof MostRecentGameInfo)) {
            return false;
        }
        if (mostRecentGameInfo == obj) {
            return true;
        }
        MostRecentGameInfo mostRecentGameInfo2 = (MostRecentGameInfo) obj;
        return C1781jv.equal(mostRecentGameInfo2.mo14214mw(), mostRecentGameInfo.mo14214mw()) && C1781jv.equal(mostRecentGameInfo2.mo14215mx(), mostRecentGameInfo.mo14215mx()) && C1781jv.equal(Long.valueOf(mostRecentGameInfo2.mo14216my()), Long.valueOf(mostRecentGameInfo.mo14216my())) && C1781jv.equal(mostRecentGameInfo2.mo14217mz(), mostRecentGameInfo.mo14217mz()) && C1781jv.equal(mostRecentGameInfo2.mo14212mA(), mostRecentGameInfo.mo14212mA()) && C1781jv.equal(mostRecentGameInfo2.mo14213mB(), mostRecentGameInfo.mo14213mB());
    }

    /* renamed from: b */
    static String m3641b(MostRecentGameInfo mostRecentGameInfo) {
        return C1781jv.m5348h(mostRecentGameInfo).mo15935a("GameId", mostRecentGameInfo.mo14214mw()).mo15935a("GameName", mostRecentGameInfo.mo14215mx()).mo15935a("ActivityTimestampMillis", Long.valueOf(mostRecentGameInfo.mo14216my())).mo15935a("GameIconUri", mostRecentGameInfo.mo14217mz()).mo15935a("GameHiResUri", mostRecentGameInfo.mo14212mA()).mo15935a("GameFeaturedUri", mostRecentGameInfo.mo14213mB()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3640a(this, obj);
    }

    public int getVersionCode() {
        return this.f2111CK;
    }

    public int hashCode() {
        return m3639a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: mA */
    public Uri mo14212mA() {
        return this.acJ;
    }

    /* renamed from: mB */
    public Uri mo14213mB() {
        return this.acK;
    }

    /* renamed from: mC */
    public MostRecentGameInfo freeze() {
        return this;
    }

    /* renamed from: mw */
    public String mo14214mw() {
        return this.acF;
    }

    /* renamed from: mx */
    public String mo14215mx() {
        return this.acG;
    }

    /* renamed from: my */
    public long mo14216my() {
        return this.acH;
    }

    /* renamed from: mz */
    public Uri mo14217mz() {
        return this.acI;
    }

    public String toString() {
        return m3641b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        MostRecentGameInfoEntityCreator.m3649a(this, parcel, i);
    }
}
