package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public final class MilestoneEntity implements SafeParcelable, Milestone {
    public static final MilestoneEntityCreator CREATOR = new MilestoneEntityCreator();

    /* renamed from: CK */
    private final int f2149CK;

    /* renamed from: Ye */
    private final String f2150Ye;

    /* renamed from: Zn */
    private final String f2151Zn;
    private final long aeH;
    private final long aeI;
    private final byte[] aeJ;
    private final int mState;

    MilestoneEntity(int i, String str, long j, long j2, byte[] bArr, int i2, String str2) {
        this.f2149CK = i;
        this.f2151Zn = str;
        this.aeH = j;
        this.aeI = j2;
        this.aeJ = bArr;
        this.mState = i2;
        this.f2150Ye = str2;
    }

    public MilestoneEntity(Milestone milestone) {
        this.f2149CK = 4;
        this.f2151Zn = milestone.getMilestoneId();
        this.aeH = milestone.getCurrentProgress();
        this.aeI = milestone.getTargetProgress();
        this.mState = milestone.getState();
        this.f2150Ye = milestone.getEventId();
        byte[] completionRewardData = milestone.getCompletionRewardData();
        if (completionRewardData == null) {
            this.aeJ = null;
            return;
        }
        this.aeJ = new byte[completionRewardData.length];
        System.arraycopy(completionRewardData, 0, this.aeJ, 0, completionRewardData.length);
    }

    /* renamed from: a */
    static int m3760a(Milestone milestone) {
        return C1781jv.hashCode(milestone.getMilestoneId(), Long.valueOf(milestone.getCurrentProgress()), Long.valueOf(milestone.getTargetProgress()), Integer.valueOf(milestone.getState()), milestone.getEventId());
    }

    /* renamed from: a */
    static boolean m3761a(Milestone milestone, Object obj) {
        if (!(obj instanceof Milestone)) {
            return false;
        }
        if (milestone == obj) {
            return true;
        }
        Milestone milestone2 = (Milestone) obj;
        return C1781jv.equal(milestone2.getMilestoneId(), milestone.getMilestoneId()) && C1781jv.equal(Long.valueOf(milestone2.getCurrentProgress()), Long.valueOf(milestone.getCurrentProgress())) && C1781jv.equal(Long.valueOf(milestone2.getTargetProgress()), Long.valueOf(milestone.getTargetProgress())) && C1781jv.equal(Integer.valueOf(milestone2.getState()), Integer.valueOf(milestone.getState())) && C1781jv.equal(milestone2.getEventId(), milestone.getEventId());
    }

    /* renamed from: b */
    static String m3762b(Milestone milestone) {
        return C1781jv.m5348h(milestone).mo15935a("MilestoneId", milestone.getMilestoneId()).mo15935a("CurrentProgress", Long.valueOf(milestone.getCurrentProgress())).mo15935a("TargetProgress", Long.valueOf(milestone.getTargetProgress())).mo15935a("State", Integer.valueOf(milestone.getState())).mo15935a("CompletionRewardData", milestone.getCompletionRewardData()).mo15935a("EventId", milestone.getEventId()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m3761a(this, obj);
    }

    public Milestone freeze() {
        return this;
    }

    public byte[] getCompletionRewardData() {
        return this.aeJ;
    }

    public long getCurrentProgress() {
        return this.aeH;
    }

    public String getEventId() {
        return this.f2150Ye;
    }

    public String getMilestoneId() {
        return this.f2151Zn;
    }

    public int getState() {
        return this.mState;
    }

    public long getTargetProgress() {
        return this.aeI;
    }

    public int getVersionCode() {
        return this.f2149CK;
    }

    public int hashCode() {
        return m3760a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m3762b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        MilestoneEntityCreator.m3763a(this, parcel, i);
    }
}
