package com.google.android.gms.drive.metadata;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

/* renamed from: com.google.android.gms.drive.metadata.b */
public abstract class C0867b<T> extends C0866a<Collection<T>> {
    protected C0867b(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Collection<T> mo11760c(DataHolder dataHolder, int i, int i2) {
        throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
    }
}
