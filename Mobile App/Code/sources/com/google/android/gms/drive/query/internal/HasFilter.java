package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class HasFilter<T> extends AbstractFilter {
    public static final C0895g CREATOR = new C0895g();

    /* renamed from: CK */
    final int f1189CK;

    /* renamed from: Si */
    final MetadataBundle f1190Si;

    /* renamed from: Sj */
    final MetadataField<T> f1191Sj;

    HasFilter(int i, MetadataBundle metadataBundle) {
        this.f1189CK = i;
        this.f1190Si = metadataBundle;
        this.f1191Sj = C0893e.m1368b(metadataBundle);
    }

    public HasFilter(SearchableMetadataField<T> searchableMetadataField, T t) {
        this(1, MetadataBundle.m1253a(searchableMetadataField, t));
    }

    /* renamed from: a */
    public <F> F mo11821a(C0894f<F> fVar) {
        return fVar.mo11857d(this.f1191Sj, getValue());
    }

    public int describeContents() {
        return 0;
    }

    public T getValue() {
        return this.f1190Si.mo11778a(this.f1191Sj);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0895g.m1376a(this, parcel, i);
    }
}
