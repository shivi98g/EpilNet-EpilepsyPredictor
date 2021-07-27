package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.C2786h;

public class DataEventBuffer extends C0708g<DataEvent> implements Result {

    /* renamed from: Eb */
    private final Status f4523Eb;

    public DataEventBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.f4523Eb = new Status(dataHolder.getStatusCode());
    }

    public Status getStatus() {
        return this.f4523Eb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "path";
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public DataEvent mo11099f(int i, int i2) {
        return new C2786h(this.f763JG, i, i2);
    }
}
