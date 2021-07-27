package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataBuffer;

public final class MilestoneBuffer extends DataBuffer<Milestone> {
    public Milestone get(int i) {
        return new MilestoneRef(this.f763JG, i);
    }
}
