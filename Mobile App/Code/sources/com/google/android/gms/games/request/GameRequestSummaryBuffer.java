package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataBuffer;

public final class GameRequestSummaryBuffer extends DataBuffer<GameRequestSummary> {
    /* renamed from: ep */
    public GameRequestSummary get(int i) {
        return new GameRequestSummaryRef(this.f763JG, i);
    }
}
