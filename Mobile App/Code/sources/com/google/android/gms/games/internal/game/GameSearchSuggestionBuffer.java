package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class GameSearchSuggestionBuffer extends DataBuffer<GameSearchSuggestion> {
    public GameSearchSuggestionBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: ef */
    public GameSearchSuggestion get(int i) {
        return new GameSearchSuggestionRef(this.f763JG, i);
    }
}
