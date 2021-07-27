package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;

public class FilterHolder implements SafeParcelable {
    public static final Parcelable.Creator<FilterHolder> CREATOR = new C0892d();

    /* renamed from: CK */
    final int f1180CK;

    /* renamed from: Sl */
    final ComparisonFilter<?> f1181Sl;

    /* renamed from: Sm */
    final FieldOnlyFilter f1182Sm;

    /* renamed from: Sn */
    final LogicalFilter f1183Sn;

    /* renamed from: So */
    final NotFilter f1184So;

    /* renamed from: Sp */
    final InFilter<?> f1185Sp;

    /* renamed from: Sq */
    final MatchAllFilter f1186Sq;

    /* renamed from: Sr */
    final HasFilter f1187Sr;

    /* renamed from: Ss */
    private final Filter f1188Ss;

    FilterHolder(int i, ComparisonFilter<?> comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter<?> inFilter, MatchAllFilter matchAllFilter, HasFilter<?> hasFilter) {
        Filter filter;
        this.f1180CK = i;
        this.f1181Sl = comparisonFilter;
        this.f1182Sm = fieldOnlyFilter;
        this.f1183Sn = logicalFilter;
        this.f1184So = notFilter;
        this.f1185Sp = inFilter;
        this.f1186Sq = matchAllFilter;
        this.f1187Sr = hasFilter;
        if (this.f1181Sl != null) {
            filter = this.f1181Sl;
        } else if (this.f1182Sm != null) {
            filter = this.f1182Sm;
        } else if (this.f1183Sn != null) {
            filter = this.f1183Sn;
        } else if (this.f1184So != null) {
            filter = this.f1184So;
        } else if (this.f1185Sp != null) {
            filter = this.f1185Sp;
        } else if (this.f1186Sq != null) {
            filter = this.f1186Sq;
        } else if (this.f1187Sr != null) {
            filter = this.f1187Sr;
        } else {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
        this.f1188Ss = filter;
    }

    public FilterHolder(Filter filter) {
        this.f1180CK = 2;
        HasFilter hasFilter = null;
        this.f1181Sl = filter instanceof ComparisonFilter ? (ComparisonFilter) filter : null;
        this.f1182Sm = filter instanceof FieldOnlyFilter ? (FieldOnlyFilter) filter : null;
        this.f1183Sn = filter instanceof LogicalFilter ? (LogicalFilter) filter : null;
        this.f1184So = filter instanceof NotFilter ? (NotFilter) filter : null;
        this.f1185Sp = filter instanceof InFilter ? (InFilter) filter : null;
        this.f1186Sq = filter instanceof MatchAllFilter ? (MatchAllFilter) filter : null;
        this.f1187Sr = filter instanceof HasFilter ? (HasFilter) filter : hasFilter;
        if (this.f1181Sl == null && this.f1182Sm == null && this.f1183Sn == null && this.f1184So == null && this.f1185Sp == null && this.f1186Sq == null && this.f1187Sr == null) {
            throw new IllegalArgumentException("Invalid filter type or null filter.");
        }
        this.f1188Ss = filter;
    }

    public int describeContents() {
        return 0;
    }

    public Filter getFilter() {
        return this.f1188Ss;
    }

    public String toString() {
        return String.format("FilterHolder[%s]", new Object[]{this.f1188Ss});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0892d.m1365a(this, parcel, i);
    }
}
