package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.C1785jx;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.drive.metadata.a */
public abstract class C0866a<T> implements MetadataField<T> {

    /* renamed from: QY */
    private final String f1141QY;

    /* renamed from: QZ */
    private final Set<String> f1142QZ;

    /* renamed from: Ra */
    private final Set<String> f1143Ra;

    /* renamed from: Rb */
    private final int f1144Rb;

    protected C0866a(String str, int i) {
        this.f1141QY = (String) C1785jx.m5359b(str, (Object) "fieldName");
        this.f1142QZ = Collections.singleton(str);
        this.f1143Ra = Collections.emptySet();
        this.f1144Rb = i;
    }

    protected C0866a(String str, Collection<String> collection, Collection<String> collection2, int i) {
        this.f1141QY = (String) C1785jx.m5359b(str, (Object) "fieldName");
        this.f1142QZ = Collections.unmodifiableSet(new HashSet(collection));
        this.f1143Ra = Collections.unmodifiableSet(new HashSet(collection2));
        this.f1144Rb = i;
    }

    /* renamed from: a */
    public final T mo11753a(DataHolder dataHolder, int i, int i2) {
        if (mo11759b(dataHolder, i, i2)) {
            return mo11760c(dataHolder, i, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11758a(Bundle bundle, T t);

    /* renamed from: a */
    public final void mo11754a(DataHolder dataHolder, MetadataBundle metadataBundle, int i, int i2) {
        C1785jx.m5359b(dataHolder, (Object) "dataHolder");
        C1785jx.m5359b(metadataBundle, (Object) "bundle");
        metadataBundle.mo11779b(this, mo11753a(dataHolder, i, i2));
    }

    /* renamed from: a */
    public final void mo11755a(T t, Bundle bundle) {
        C1785jx.m5359b(bundle, (Object) "bundle");
        if (t == null) {
            bundle.putString(getName(), (String) null);
        } else {
            mo11758a(bundle, t);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo11759b(DataHolder dataHolder, int i, int i2) {
        for (String h : this.f1142QZ) {
            if (dataHolder.mo11065h(h, i, i2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo11760c(DataHolder dataHolder, int i, int i2);

    public final String getName() {
        return this.f1141QY;
    }

    /* renamed from: h */
    public final T mo11757h(Bundle bundle) {
        C1785jx.m5359b(bundle, (Object) "bundle");
        if (bundle.get(getName()) != null) {
            return mo11761i(bundle);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract T mo11761i(Bundle bundle);

    public String toString() {
        return this.f1141QY;
    }
}
