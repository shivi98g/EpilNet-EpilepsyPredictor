package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* renamed from: com.google.android.gms.wearable.internal.h */
public final class C2786h extends C0705d implements DataEvent {

    /* renamed from: Ya */
    private final int f4559Ya;

    public C2786h(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f4559Ya = i2;
    }

    public DataItem getDataItem() {
        return new C2793o(this.f790JG, this.f791KZ, this.f4559Ya);
    }

    public int getType() {
        return getInteger("event_type");
    }

    /* renamed from: rn */
    public DataEvent freeze() {
        return new C2785g(this);
    }
}
