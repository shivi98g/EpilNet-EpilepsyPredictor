package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.C0866a;

/* renamed from: com.google.android.gms.drive.metadata.internal.g */
public class C0878g extends C0866a<Long> {
    public C0878g(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11758a(Bundle bundle, Long l) {
        bundle.putLong(getName(), l.longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Long mo11760c(DataHolder dataHolder, int i, int i2) {
        return Long.valueOf(dataHolder.mo11044a(getName(), i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Long mo11761i(Bundle bundle) {
        return Long.valueOf(bundle.getLong(getName()));
    }
}
