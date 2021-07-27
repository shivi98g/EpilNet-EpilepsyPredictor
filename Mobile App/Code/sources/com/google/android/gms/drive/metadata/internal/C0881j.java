package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.C0866a;
import java.util.Collection;

/* renamed from: com.google.android.gms.drive.metadata.internal.j */
public abstract class C0881j<T extends Parcelable> extends C0866a<T> {
    public C0881j(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11758a(Bundle bundle, T t) {
        bundle.putParcelable(getName(), t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public T mo11761i(Bundle bundle) {
        return bundle.getParcelable(getName());
    }
}
