package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.C0866a;

/* renamed from: com.google.android.gms.drive.metadata.internal.b */
public class C0873b extends C0866a<Boolean> {
    public C0873b(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11758a(Bundle bundle, Boolean bool) {
        bundle.putBoolean(getName(), bool.booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Boolean mo11760c(DataHolder dataHolder, int i, int i2) {
        return Boolean.valueOf(dataHolder.mo11051d(getName(), i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Boolean mo11761i(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(getName()));
    }
}
