package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataBuffer;

public final class GameBadgeBuffer extends DataBuffer<GameBadge> {
    /* renamed from: ec */
    public GameBadge get(int i) {
        return new GameBadgeRef(this.f763JG, i);
    }
}
