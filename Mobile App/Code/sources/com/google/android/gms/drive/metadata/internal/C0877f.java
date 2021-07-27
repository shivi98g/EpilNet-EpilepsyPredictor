package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.C0866a;

/* renamed from: com.google.android.gms.drive.metadata.internal.f */
public class C0877f extends C0866a<Integer> {
    public C0877f(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11758a(Bundle bundle, Integer num) {
        bundle.putInt(getName(), num.intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Integer mo11760c(DataHolder dataHolder, int i, int i2) {
        return Integer.valueOf(dataHolder.mo11048b(getName(), i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Integer mo11761i(Bundle bundle) {
        return Integer.valueOf(bundle.getInt(getName()));
    }
}
