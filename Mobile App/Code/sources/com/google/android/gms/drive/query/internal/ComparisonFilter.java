package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ComparisonFilter<T> extends AbstractFilter {
    public static final C0889a CREATOR = new C0889a();

    /* renamed from: CK */
    final int f1170CK;

    /* renamed from: Sh */
    final Operator f1171Sh;

    /* renamed from: Si */
    final MetadataBundle f1172Si;

    /* renamed from: Sj */
    final MetadataField<T> f1173Sj;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadataBundle) {
        this.f1170CK = i;
        this.f1171Sh = operator;
        this.f1172Si = metadataBundle;
        this.f1173Sj = C0893e.m1368b(metadataBundle);
    }

    public ComparisonFilter(Operator operator, SearchableMetadataField<T> searchableMetadataField, T t) {
        this(1, operator, MetadataBundle.m1253a(searchableMetadataField, t));
    }

    /* renamed from: a */
    public <F> F mo11821a(C0894f<F> fVar) {
        return fVar.mo11851b(this.f1171Sh, this.f1173Sj, getValue());
    }

    public int describeContents() {
        return 0;
    }

    public T getValue() {
        return this.f1172Si.mo11778a(this.f1173Sj);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0889a.m1356a(this, parcel, i);
    }
}
