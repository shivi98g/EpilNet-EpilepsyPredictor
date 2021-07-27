package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.List;

public class LogicalFilter extends AbstractFilter {
    public static final Parcelable.Creator<LogicalFilter> CREATOR = new C0897i();

    /* renamed from: CK */
    final int f1195CK;

    /* renamed from: Sc */
    private List<Filter> f1196Sc;

    /* renamed from: Sh */
    final Operator f1197Sh;

    /* renamed from: Su */
    final List<FilterHolder> f1198Su;

    LogicalFilter(int i, Operator operator, List<FilterHolder> list) {
        this.f1195CK = i;
        this.f1197Sh = operator;
        this.f1198Su = list;
    }

    public LogicalFilter(Operator operator, Filter filter, Filter... filterArr) {
        this.f1195CK = 1;
        this.f1197Sh = operator;
        this.f1198Su = new ArrayList(filterArr.length + 1);
        this.f1198Su.add(new FilterHolder(filter));
        this.f1196Sc = new ArrayList(filterArr.length + 1);
        this.f1196Sc.add(filter);
        for (Filter filter2 : filterArr) {
            this.f1198Su.add(new FilterHolder(filter2));
            this.f1196Sc.add(filter2);
        }
    }

    public LogicalFilter(Operator operator, Iterable<Filter> iterable) {
        this.f1195CK = 1;
        this.f1197Sh = operator;
        this.f1196Sc = new ArrayList();
        this.f1198Su = new ArrayList();
        for (Filter next : iterable) {
            this.f1196Sc.add(next);
            this.f1198Su.add(new FilterHolder(next));
        }
    }

    /* renamed from: a */
    public <T> T mo11821a(C0894f<T> fVar) {
        ArrayList arrayList = new ArrayList();
        for (FilterHolder filter : this.f1198Su) {
            arrayList.add(filter.getFilter().mo11821a(fVar));
        }
        return fVar.mo11852b(this.f1197Sh, (List<T>) arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0897i.m1382a(this, parcel, i);
    }
}
