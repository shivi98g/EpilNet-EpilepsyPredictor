package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class FieldOnlyFilter extends AbstractFilter {
    public static final Parcelable.Creator<FieldOnlyFilter> CREATOR = new C0890b();

    /* renamed from: CK */
    final int f1174CK;

    /* renamed from: Si */
    final MetadataBundle f1175Si;

    /* renamed from: Sj */
    private final MetadataField<?> f1176Sj;

    FieldOnlyFilter(int i, MetadataBundle metadataBundle) {
        this.f1174CK = i;
        this.f1175Si = metadataBundle;
        this.f1176Sj = C0893e.m1368b(metadataBundle);
    }

    public FieldOnlyFilter(SearchableMetadataField<?> searchableMetadataField) {
        this(1, MetadataBundle.m1253a(searchableMetadataField, null));
    }

    /* renamed from: a */
    public <T> T mo11821a(C0894f<T> fVar) {
        return fVar.mo11856d(this.f1176Sj);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0890b.m1359a(this, parcel, i);
    }
}
