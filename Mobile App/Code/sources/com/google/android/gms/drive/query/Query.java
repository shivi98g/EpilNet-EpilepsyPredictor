package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Query implements SafeParcelable {
    public static final Parcelable.Creator<Query> CREATOR = new C0886a();

    /* renamed from: CK */
    final int f1154CK;

    /* renamed from: RY */
    final LogicalFilter f1155RY;

    /* renamed from: RZ */
    final String f1156RZ;

    /* renamed from: Sa */
    final SortOrder f1157Sa;

    /* renamed from: Sb */
    final List<String> f1158Sb;

    public static class Builder {

        /* renamed from: RZ */
        private String f1159RZ;

        /* renamed from: Sa */
        private SortOrder f1160Sa;

        /* renamed from: Sb */
        private List<String> f1161Sb;

        /* renamed from: Sc */
        private final List<Filter> f1162Sc = new ArrayList();

        public Builder() {
        }

        public Builder(Query query) {
            this.f1162Sc.add(query.getFilter());
            this.f1159RZ = query.getPageToken();
            this.f1160Sa = query.getSortOrder();
            this.f1161Sb = query.mo11826jb();
        }

        public Builder addFilter(Filter filter) {
            if (!(filter instanceof MatchAllFilter)) {
                this.f1162Sc.add(filter);
            }
            return this;
        }

        public Query build() {
            return new Query(new LogicalFilter(Operator.f1203SB, this.f1162Sc), this.f1159RZ, this.f1160Sa, this.f1161Sb);
        }

        public Builder setPageToken(String str) {
            this.f1159RZ = str;
            return this;
        }

        public Builder setSortOrder(SortOrder sortOrder) {
            this.f1160Sa = sortOrder;
            return this;
        }
    }

    Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list) {
        this.f1154CK = i;
        this.f1155RY = logicalFilter;
        this.f1156RZ = str;
        this.f1157Sa = sortOrder;
        this.f1158Sb = list;
    }

    Query(LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list) {
        this(1, logicalFilter, str, sortOrder, list);
    }

    public int describeContents() {
        return 0;
    }

    public Filter getFilter() {
        return this.f1155RY;
    }

    public String getPageToken() {
        return this.f1156RZ;
    }

    public SortOrder getSortOrder() {
        return this.f1157Sa;
    }

    /* renamed from: jb */
    public List<String> mo11826jb() {
        return this.f1158Sb;
    }

    public String toString() {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s]", new Object[]{this.f1155RY, this.f1157Sa, this.f1156RZ});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0886a.m1329a(this, parcel, i);
    }
}
