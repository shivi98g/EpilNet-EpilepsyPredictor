package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;

public final class MilestoneRef extends C0705d implements Milestone {
    MilestoneRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: mP */
    private long m3764mP() {
        return getLong("initial_value");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return MilestoneEntity.m3761a(this, obj);
    }

    public Milestone freeze() {
        return new MilestoneEntity(this);
    }

    public byte[] getCompletionRewardData() {
        return getByteArray("completion_reward_data");
    }

    public long getCurrentProgress() {
        switch (getState()) {
            case 1:
                return 0;
            case 2:
                return getLong("current_value") - m3764mP();
            case 3:
            case 4:
                return getTargetProgress();
            default:
                return 0;
        }
    }

    public String getEventId() {
        return getString("external_event_id");
    }

    public String getMilestoneId() {
        return getString("external_milestone_id");
    }

    public int getState() {
        return getInteger("milestone_state");
    }

    public long getTargetProgress() {
        return getLong("target_value");
    }

    public int hashCode() {
        return MilestoneEntity.m3760a(this);
    }

    public String toString() {
        return MilestoneEntity.m3762b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MilestoneEntity) freeze()).writeToParcel(parcel, i);
    }
}
