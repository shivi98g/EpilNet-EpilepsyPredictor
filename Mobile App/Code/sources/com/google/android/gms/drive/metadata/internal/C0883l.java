package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.C0866a;

/* renamed from: com.google.android.gms.drive.metadata.internal.l */
public class C0883l extends C0866a<String> {
    public C0883l(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11758a(Bundle bundle, String str) {
        bundle.putString(getName(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo11760c(DataHolder dataHolder, int i, int i2) {
        return dataHolder.mo11049c(getName(), i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo11761i(Bundle bundle) {
        return bundle.getString(getName());
    }
}
