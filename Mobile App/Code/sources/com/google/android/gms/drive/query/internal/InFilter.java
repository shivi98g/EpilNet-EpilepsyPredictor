package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.C0867b;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;

public class InFilter<T> extends AbstractFilter {
    public static final C0896h CREATOR = new C0896h();

    /* renamed from: CK */
    final int f1192CK;

    /* renamed from: Si */
    final MetadataBundle f1193Si;

    /* renamed from: St */
    private final C0867b<T> f1194St;

    InFilter(int i, MetadataBundle metadataBundle) {
        this.f1192CK = i;
        this.f1193Si = metadataBundle;
        this.f1194St = (C0867b) C0893e.m1368b(metadataBundle);
    }

    public InFilter(SearchableCollectionMetadataField<T> searchableCollectionMetadataField, T t) {
        this(1, MetadataBundle.m1253a(searchableCollectionMetadataField, Collections.singleton(t)));
    }

    /* renamed from: a */
    public <F> F mo11821a(C0894f<F> fVar) {
        return fVar.mo11850b(this.f1194St, getValue());
    }

    public int describeContents() {
        return 0;
    }

    public T getValue() {
        return ((Collection) this.f1193Si.mo11778a(this.f1194St)).iterator().next();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0896h.m1379a(this, parcel, i);
    }
}
