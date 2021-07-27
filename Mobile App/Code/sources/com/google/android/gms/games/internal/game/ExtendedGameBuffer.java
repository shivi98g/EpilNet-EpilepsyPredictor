package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;

public final class ExtendedGameBuffer extends C0708g<ExtendedGame> {
    public ExtendedGameBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "external_game_id";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public ExtendedGame mo11099f(int i, int i2) {
        return new ExtendedGameRef(this.f763JG, i, i2);
    }
}
