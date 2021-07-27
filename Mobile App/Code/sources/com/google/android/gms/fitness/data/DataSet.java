package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataSet implements SafeParcelable {
    public static final Parcelable.Creator<DataSet> CREATOR = new C0987f();

    /* renamed from: CK */
    private final int f1352CK;

    /* renamed from: TM */
    private final DataType f1353TM;

    /* renamed from: TN */
    private final DataSource f1354TN;

    /* renamed from: Uc */
    private boolean f1355Uc;

    /* renamed from: Uj */
    private final List<DataPoint> f1356Uj;

    /* renamed from: Uk */
    private final List<DataSource> f1357Uk;

    DataSet(int i, DataSource dataSource, DataType dataType, List<RawDataPoint> list, List<DataSource> list2, boolean z) {
        this.f1355Uc = false;
        this.f1352CK = i;
        this.f1354TN = dataSource;
        this.f1353TM = dataType;
        this.f1355Uc = z;
        this.f1356Uj = new ArrayList(list.size());
        this.f1357Uk = i >= 2 ? list2 : Collections.singletonList(dataSource);
        for (RawDataPoint dataPoint : list) {
            this.f1356Uj.add(new DataPoint(this.f1357Uk, dataPoint));
        }
    }

    private DataSet(DataSource dataSource, DataType dataType) {
        this.f1355Uc = false;
        this.f1352CK = 3;
        this.f1354TN = (DataSource) C1785jx.m5364i(dataSource);
        this.f1353TM = (DataType) C1785jx.m5364i(dataType);
        this.f1356Uj = new ArrayList();
        this.f1357Uk = new ArrayList();
        this.f1357Uk.add(this.f1354TN);
    }

    public DataSet(RawDataSet rawDataSet, List<DataSource> list, List<DataType> list2) {
        this(3, (DataSource) m1650d(list, rawDataSet.f1409UJ), (DataType) m1650d(list2, rawDataSet.f1410UL), rawDataSet.f1411UM, list, rawDataSet.f1412Uc);
    }

    /* renamed from: a */
    private boolean m1649a(DataSet dataSet) {
        return C1781jv.equal(this.f1353TM, dataSet.f1353TM) && C1781jv.equal(this.f1354TN, dataSet.f1354TN) && C1781jv.equal(this.f1356Uj, dataSet.f1356Uj) && this.f1355Uc == dataSet.f1355Uc;
    }

    public static DataSet create(DataSource dataSource) {
        C1785jx.m5359b(dataSource, (Object) "DataSource should be specified");
        return new DataSet(dataSource, dataSource.getDataType());
    }

    /* renamed from: d */
    private static <T> T m1650d(List<T> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: a */
    public void mo12282a(Iterable<DataPoint> iterable) {
        for (DataPoint b : iterable) {
            mo12285b(b);
        }
    }

    public void add(DataPoint dataPoint) {
        DataSource dataSource = dataPoint.getDataSource();
        C1785jx.m5362b(dataSource.getStreamIdentifier().equals(this.f1354TN.getStreamIdentifier()), "Conflicting data sources found %s vs %s", dataSource, this.f1354TN);
        C1785jx.m5362b(dataPoint.getDataType().getName().equals(this.f1353TM.getName()), "Conflicting data types found %s vs %s", dataPoint.getDataType(), this.f1353TM);
        C1785jx.m5362b(dataPoint.getTimestamp(TimeUnit.NANOSECONDS) > 0, "Data point does not have the timestamp set: %s", dataPoint);
        C1785jx.m5362b(dataPoint.getStartTime(TimeUnit.NANOSECONDS) <= dataPoint.getEndTime(TimeUnit.NANOSECONDS), "Data point with start time greater than end time found: %s", dataPoint);
        mo12285b(dataPoint);
    }

    public void addAll(Iterable<DataPoint> iterable) {
        for (DataPoint add : iterable) {
            add(add);
        }
    }

    /* renamed from: b */
    public void mo12285b(DataPoint dataPoint) {
        this.f1356Uj.add(dataPoint);
        DataSource originalDataSource = dataPoint.getOriginalDataSource();
        if (originalDataSource != null && !this.f1357Uk.contains(originalDataSource)) {
            this.f1357Uk.add(originalDataSource);
        }
    }

    public DataPoint createDataPoint() {
        return DataPoint.create(this.f1354TN);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataSet) && m1649a((DataSet) obj);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public List<RawDataPoint> mo12289f(List<DataSource> list) {
        ArrayList arrayList = new ArrayList(this.f1356Uj.size());
        for (DataPoint rawDataPoint : this.f1356Uj) {
            arrayList.add(new RawDataPoint(rawDataPoint, list));
        }
        return arrayList;
    }

    public List<DataPoint> getDataPoints() {
        return Collections.unmodifiableList(this.f1356Uj);
    }

    public DataSource getDataSource() {
        return this.f1354TN;
    }

    public DataType getDataType() {
        return this.f1353TM;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1352CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1353TM, this.f1354TN);
    }

    /* renamed from: jn */
    public boolean mo12295jn() {
        return this.f1355Uc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jv */
    public List<RawDataPoint> mo12296jv() {
        return mo12289f(this.f1357Uk);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jw */
    public List<DataSource> mo12297jw() {
        return this.f1357Uk;
    }

    public String toString() {
        List<RawDataPoint> jv = mo12296jv();
        Object[] objArr = new Object[2];
        objArr[0] = this.f1354TN.toDebugString();
        Object obj = jv;
        if (this.f1356Uj.size() >= 10) {
            obj = String.format("%d data points, first 5: %s", new Object[]{Integer.valueOf(this.f1356Uj.size()), jv.subList(0, 5)});
        }
        objArr[1] = obj;
        return String.format("DataSet{%s %s}", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0987f.m1728a(this, parcel, i);
    }
}
