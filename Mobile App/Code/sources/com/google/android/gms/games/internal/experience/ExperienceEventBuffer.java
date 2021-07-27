package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class ExperienceEventBuffer extends DataBuffer<ExperienceEvent> {
    public ExperienceEventBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: ea */
    public ExperienceEvent get(int i) {
        return new ExperienceEventRef(this.f763JG, i);
    }
}
