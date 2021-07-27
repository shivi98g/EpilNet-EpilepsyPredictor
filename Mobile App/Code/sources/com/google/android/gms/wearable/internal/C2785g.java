package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* renamed from: com.google.android.gms.wearable.internal.g */
public class C2785g implements DataEvent {

    /* renamed from: Gt */
    private int f4558Gt;
    private DataItem axE;

    public C2785g(DataEvent dataEvent) {
        this.f4558Gt = dataEvent.getType();
        this.axE = (DataItem) dataEvent.getDataItem().freeze();
    }

    public DataItem getDataItem() {
        return this.axE;
    }

    public int getType() {
        return this.f4558Gt;
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: rn */
    public DataEvent freeze() {
        return this;
    }
}
