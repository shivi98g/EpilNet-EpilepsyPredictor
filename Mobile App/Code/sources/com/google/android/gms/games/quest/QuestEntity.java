package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1833le;
import java.util.ArrayList;
import java.util.List;

public final class QuestEntity implements SafeParcelable, Quest {
    public static final QuestEntityCreator CREATOR = new QuestEntityCreator();

    /* renamed from: CK */
    private final int f2152CK;

    /* renamed from: Gt */
    private final int f2153Gt;

    /* renamed from: UO */
    private final String f2154UO;

    /* renamed from: XH */
    private final long f2155XH;
    private final GameEntity acs;
    private final String aeK;
    private final long aeL;
    private final Uri aeM;
    private final String aeN;
    private final long aeO;
    private final Uri aeP;
    private final String aeQ;
    private final long aeR;
    private final long aeS;
    private final ArrayList<MilestoneEntity> aeT;
    private final String mName;
    private final int mState;

    QuestEntity(int i, GameEntity gameEntity, String str, long j, Uri uri, String str2, String str3, long j2, long j3, Uri uri2, String str4, String str5, long j4, long j5, int i2, int i3, ArrayList<MilestoneEntity> arrayList) {
        this.f2152CK = i;
        this.acs = gameEntity;
        this.aeK = str;
        this.aeL = j;
        this.aeM = uri;
        this.aeN = str2;
        this.f2154UO = str3;
        this.aeO = j2;
        this.f2155XH = j3;
        this.aeP = uri2;
        this.aeQ = str4;
        this.mName = str5;
        this.aeR = j4;
        this.aeS = j5;
        this.mState = i2;
        this.f2153Gt = i3;
        this.aeT = arrayList;
    }

    public QuestEntity(Quest quest) {
        this.f2152CK = 2;
        this.acs = new GameEntity(quest.getGame());
        this.aeK = quest.getQuestId();
        this.aeL = quest.getAcceptedTimestamp();
        this.f2154UO = quest.getDescription();
        this.aeM = quest.getBannerImageUri();
        this.aeN = quest.getBannerImageUrl();
        this.aeO = quest.getEndTimestamp();
        this.aeP = quest.getIconImageUri();
        this.aeQ = quest.getIconImageUrl();
        this.f2155XH = quest.getLastUpdatedTimestamp();
        this.mName = quest.getName();
        this.aeR = quest.mo14535mR();
        this.aeS = quest.getStartTimestamp();
        this.mState = quest.getState();
        this.f2153Gt = quest.getType();
        List<Milestone> mQ = quest.mo14534mQ();
        int size = mQ.size();
        this.aeT = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.aeT.add((MilestoneEntity) mQ.get(i).freeze());
        }
    }

    /* renamed from: a */
    static int m3770a(Quest quest) {
        return C1781jv.hashCode(quest.getGame(), quest.getQuestId(), Long.valueOf(quest.getAcceptedTimestamp()), quest.getBannerImageUri(), quest.getDescription(), Long.valueOf(quest.getEndTimestamp()), quest.getIconImageUri(), Long.valueOf(quest.getLastUpdatedTimestamp()), quest.mo14534mQ(), quest.getName(), Long.valueOf(quest.mo14535mR()), Long.valueOf(quest.getStartTimestamp()), Integer.valueOf(quest.getState()));
    }

    /* renamed from: a */
    static boolean m3771a(Quest quest, Object obj) {
        if (!(obj instanceof Quest)) {
            return false;
        }
        if (quest == obj) {
            return true;
        }
        Quest quest2 = (Quest) obj;
        return C1781jv.equal(quest2.getGame(), quest.getGame()) && C1781jv.equal(quest2.getQuestId(), quest.getQuestId()) && C1781jv.equal(Long.valueOf(quest2.getAcceptedTimestamp()), Long.valueOf(quest.getAcceptedTimestamp())) && C1781jv.equal(quest2.getBannerImageUri(), quest.getBannerImageUri()) && C1781jv.equal(quest2.getDescription(), quest.getDescription()) && C1781jv.equal(Long.valueOf(quest2.getEndTimestamp()), Long.valueOf(quest.getEndTimestamp())) && C1781jv.equal(quest2.getIconImageUri(), quest.getIconImageUri()) && C1781jv.equal(Long.valueOf(quest2.getLastUpdatedTimestamp()), Long.valueOf(quest.getLastUpdatedTimestamp())) && C1781jv.equal(quest2.mo14534mQ(), quest.mo14534mQ()) && C1781jv.equal(quest2.getName(), quest.getName()) && C1781jv.equal(Long.valueOf(quest2.mo14535mR()), Long.valueOf(quest.mo14535mR())) && C1781jv.equal(Long.valueOf(quest2.getStartTimestamp()), Long.valueOf(quest.getStartTimestamp())) && C1781jv.equal(Integer.valueOf(quest2.getState()), Integer.valueOf(quest.getState()));
    }

    /* renamed from: b */
    static String m3772b(Quest quest) {
        return C1781jv.m5348h(quest).mo15935a("Game", quest.getGame()).mo15935a("QuestId", quest.getQuestId()).mo15935a("AcceptedTimestamp", Long.valueOf(quest.getAcceptedTimestamp())).mo15935a("BannerImageUri", quest.getBannerImageUri()).mo15935a("BannerImageUrl", quest.getBannerImageUrl()).mo15935a("Description", quest.getDescription()).mo15935a("EndTimestamp", Long.valueOf(quest.getEndTimestamp())).mo15935a("IconImageUri", quest.getIconImageUri()).mo15935a("IconImageUrl", quest.getIconImageUrl()).mo15935a("LastUpdatedTimestamp", Long.valueOf(quest.getLastUpdatedTimestamp())).mo15935a("Milestones", quest.mo14534mQ()).mo15935a("Name", quest.getName()).mo15935a("NotifyTimestamp", Long.valueOf(quest.mo14535mR())).mo15935a("StartTimestamp", Long.valueOf(quest.getStartTimestamp())).mo15935a("State", Integer.valueOf(quest.getState())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3771a(this, obj);
    }

    public Quest freeze() {
        return this;
    }

    public long getAcceptedTimestamp() {
        return this.aeL;
    }

    public Uri getBannerImageUri() {
        return this.aeM;
    }

    public String getBannerImageUrl() {
        return this.aeN;
    }

    public Milestone getCurrentMilestone() {
        return mo14534mQ().get(0);
    }

    public String getDescription() {
        return this.f2154UO;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.f2154UO, charArrayBuffer);
    }

    public long getEndTimestamp() {
        return this.aeO;
    }

    public Game getGame() {
        return this.acs;
    }

    public Uri getIconImageUri() {
        return this.aeP;
    }

    public String getIconImageUrl() {
        return this.aeQ;
    }

    public long getLastUpdatedTimestamp() {
        return this.f2155XH;
    }

    public String getName() {
        return this.mName;
    }

    public void getName(CharArrayBuffer charArrayBuffer) {
        C1833le.m5524b(this.mName, charArrayBuffer);
    }

    public String getQuestId() {
        return this.aeK;
    }

    public long getStartTimestamp() {
        return this.aeS;
    }

    public int getState() {
        return this.mState;
    }

    public int getType() {
        return this.f2153Gt;
    }

    public int getVersionCode() {
        return this.f2152CK;
    }

    public int hashCode() {
        return m3770a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isEndingSoon() {
        return this.aeR <= System.currentTimeMillis() + 1800000;
    }

    /* renamed from: mQ */
    public List<Milestone> mo14534mQ() {
        return new ArrayList(this.aeT);
    }

    /* renamed from: mR */
    public long mo14535mR() {
        return this.aeR;
    }

    public String toString() {
        return m3772b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        QuestEntityCreator.m3775a(this, parcel, i);
    }
}
