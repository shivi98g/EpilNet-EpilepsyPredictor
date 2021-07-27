package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.common.api.b */
public abstract class C0674b implements Releasable, Result {

    /* renamed from: Eb */
    protected final Status f671Eb;

    /* renamed from: JG */
    protected final DataHolder f672JG;

    protected C0674b(DataHolder dataHolder) {
        this.f671Eb = new Status(dataHolder.getStatusCode());
        this.f672JG = dataHolder;
    }

    public Status getStatus() {
        return this.f671Eb;
    }

    public void release() {
        if (this.f672JG != null) {
            this.f672JG.close();
        }
    }
}
