package com.google.android.gms.common.api;

import com.google.android.gms.common.api.C0687d;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.common.api.a */
public abstract class C0673a<L> implements C0687d.C0689b<L> {

    /* renamed from: JG */
    private final DataHolder f670JG;

    protected C0673a(DataHolder dataHolder) {
        this.f670JG = dataHolder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10997a(L l, DataHolder dataHolder);

    /* renamed from: c */
    public final void mo10998c(L l) {
        mo10997a(l, this.f670JG);
    }

    /* renamed from: gG */
    public void mo10999gG() {
        if (this.f670JG != null) {
            this.f670JG.close();
        }
    }
}
