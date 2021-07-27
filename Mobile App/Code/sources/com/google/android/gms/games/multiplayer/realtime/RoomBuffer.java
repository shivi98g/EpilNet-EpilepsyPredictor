package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;

public final class RoomBuffer extends C0708g<Room> {
    public RoomBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "external_match_id";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Room mo11099f(int i, int i2) {
        return new RoomRef(this.f763JG, i, i2);
    }
}
