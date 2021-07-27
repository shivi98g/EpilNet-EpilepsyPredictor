package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;

public final class TurnBasedMatchBuffer extends C0708g<TurnBasedMatch> {
    public TurnBasedMatchBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "external_match_id";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public TurnBasedMatch mo11099f(int i, int i2) {
        return new TurnBasedMatchRef(this.f763JG, i, i2);
    }
}
