package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.C0869d;
import java.util.Date;

/* renamed from: com.google.android.gms.drive.metadata.internal.d */
public class C0875d extends C0869d<Date> {
    public C0875d(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11758a(Bundle bundle, Date date) {
        bundle.putLong(getName(), date.getTime());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Date mo11760c(DataHolder dataHolder, int i, int i2) {
        return new Date(dataHolder.mo11044a(getName(), i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Date mo11761i(Bundle bundle) {
        return new Date(bundle.getLong(getName()));
    }
}
