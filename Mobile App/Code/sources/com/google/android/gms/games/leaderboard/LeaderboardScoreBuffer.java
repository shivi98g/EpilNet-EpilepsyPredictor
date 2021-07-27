package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardScoreBuffer extends DataBuffer<LeaderboardScore> {
    private final LeaderboardScoreBufferHeader adr;

    public LeaderboardScoreBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.adr = new LeaderboardScoreBufferHeader(dataHolder.mo11058gV());
    }

    public LeaderboardScore get(int i) {
        return new LeaderboardScoreRef(this.f763JG, i);
    }

    /* renamed from: mH */
    public LeaderboardScoreBufferHeader mo14290mH() {
        return this.adr;
    }
}
