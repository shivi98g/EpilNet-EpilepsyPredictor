package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C0708g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.C2793o;

public class DataItemBuffer extends C0708g<DataItem> implements Result {

    /* renamed from: Eb */
    private final Status f4524Eb;

    public DataItemBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.f4524Eb = new Status(dataHolder.getStatusCode());
    }

    public Status getStatus() {
        return this.f4524Eb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ha */
    public String mo11100ha() {
        return "path";
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public DataItem mo11099f(int i, int i2) {
        return new C2793o(this.f763JG, i, i2);
    }
}
