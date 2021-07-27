package com.google.android.gms.games.request;

import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;

public final class GameRequestBuffer extends C0708g<GameRequest> {
    public GameRequestBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "external_request_id";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public GameRequest mo11099f(int i, int i2) {
        return new GameRequestRef(this.f763JG, i, i2);
    }
}
