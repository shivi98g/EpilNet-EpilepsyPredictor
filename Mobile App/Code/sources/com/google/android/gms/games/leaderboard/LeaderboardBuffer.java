package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardBuffer extends C0708g<Leaderboard> {
    public LeaderboardBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "external_leaderboard_id";
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Leaderboard mo11099f(int i, int i2) {
        return new LeaderboardRef(this.f763JG, i, i2);
    }
}
