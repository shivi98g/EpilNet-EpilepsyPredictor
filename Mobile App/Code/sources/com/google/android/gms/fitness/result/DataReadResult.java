package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataReadResult implements Result, SafeParcelable {
    public static final Parcelable.Creator<DataReadResult> CREATOR = new C1069b();

    /* renamed from: CK */
    private final int f1605CK;

    /* renamed from: Eb */
    private final Status f1606Eb;

    /* renamed from: Ua */
    private final List<DataSet> f1607Ua;

    /* renamed from: Uk */
    private final List<DataSource> f1608Uk;

    /* renamed from: Wr */
    private final List<Bucket> f1609Wr;

    /* renamed from: Ws */
    private int f1610Ws;

    /* renamed from: Wt */
    private final List<DataType> f1611Wt;

    DataReadResult(int i, List<RawDataSet> list, Status status, List<RawBucket> list2, int i2, List<DataSource> list3, List<DataType> list4) {
        this.f1605CK = i;
        this.f1606Eb = status;
        this.f1610Ws = i2;
        this.f1608Uk = list3;
        this.f1611Wt = list4;
        this.f1607Ua = new ArrayList(list.size());
        for (RawDataSet dataSet : list) {
            this.f1607Ua.add(new DataSet(dataSet, list3, list4));
        }
        this.f1609Wr = new ArrayList(list2.size());
        for (RawBucket bucket : list2) {
            this.f1609Wr.add(new Bucket(bucket, list3, list4));
        }
    }

    public DataReadResult(List<DataSet> list, List<Bucket> list2, Status status) {
        this.f1605CK = 5;
        this.f1607Ua = list;
        this.f1606Eb = status;
        this.f1609Wr = list2;
        this.f1610Ws = 1;
        this.f1608Uk = new ArrayList();
        this.f1611Wt = new ArrayList();
    }

    /* renamed from: a */
    public static DataReadResult m1968a(Status status, DataReadRequest dataReadRequest) {
        ArrayList arrayList = new ArrayList();
        for (DataSource create : dataReadRequest.getDataSources()) {
            arrayList.add(DataSet.create(create));
        }
        for (DataType dataType : dataReadRequest.getDataTypes()) {
            arrayList.add(DataSet.create(new DataSource.Builder().setDataType(dataType).setType(1).setName("Default").build()));
        }
        return new DataReadResult(arrayList, Collections.emptyList(), status);
    }

    /* renamed from: a */
    private void m1969a(Bucket bucket, List<Bucket> list) {
        for (Bucket next : list) {
            if (next.mo12242b(bucket)) {
                for (DataSet a : bucket.getDataSets()) {
                    m1970a(a, next.getDataSets());
                }
                return;
            }
        }
        this.f1609Wr.add(bucket);
    }

    /* renamed from: a */
    private void m1970a(DataSet dataSet, List<DataSet> list) {
        for (DataSet next : list) {
            if (next.getDataSource().equals(dataSet.getDataSource())) {
                next.mo12282a((Iterable<DataPoint>) dataSet.getDataPoints());
                return;
            }
        }
        list.add(dataSet);
    }

    /* renamed from: c */
    private boolean m1971c(DataReadResult dataReadResult) {
        return this.f1606Eb.equals(dataReadResult.f1606Eb) && C1781jv.equal(this.f1607Ua, dataReadResult.f1607Ua) && C1781jv.equal(this.f1609Wr, dataReadResult.f1609Wr);
    }

    /* renamed from: b */
    public void mo12882b(DataReadResult dataReadResult) {
        for (DataSet a : dataReadResult.getDataSets()) {
            m1970a(a, this.f1607Ua);
        }
        for (Bucket a2 : dataReadResult.getBuckets()) {
            m1969a(a2, this.f1609Wr);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DataReadResult) && m1971c((DataReadResult) obj);
        }
        return true;
    }

    public List<Bucket> getBuckets() {
        return this.f1609Wr;
    }

    public DataSet getDataSet(DataSource dataSource) {
        for (DataSet next : this.f1607Ua) {
            if (dataSource.equals(next.getDataSource())) {
                return next;
            }
        }
        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", new Object[]{dataSource.getStreamIdentifier()}));
    }

    public DataSet getDataSet(DataType dataType) {
        for (DataSet next : this.f1607Ua) {
            if (dataType.equals(next.getDataType())) {
                return next;
            }
        }
        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", new Object[]{dataType.getName()}));
    }

    public List<DataSet> getDataSets() {
        return this.f1607Ua;
    }

    public Status getStatus() {
        return this.f1606Eb;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1605CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1606Eb, this.f1607Ua, this.f1609Wr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jw */
    public List<DataSource> mo12891jw() {
        return this.f1608Uk;
    }

    /* renamed from: kr */
    public int mo12892kr() {
        return this.f1610Ws;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ks */
    public List<RawBucket> mo12893ks() {
        ArrayList arrayList = new ArrayList(this.f1609Wr.size());
        for (Bucket rawBucket : this.f1609Wr) {
            arrayList.add(new RawBucket(rawBucket, this.f1608Uk, this.f1611Wt));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kt */
    public List<RawDataSet> mo12894kt() {
        ArrayList arrayList = new ArrayList(this.f1607Ua.size());
        for (DataSet rawDataSet : this.f1607Ua) {
            arrayList.add(new RawDataSet(rawDataSet, this.f1608Uk, this.f1611Wt));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ku */
    public List<DataType> mo12895ku() {
        return this.f1611Wt;
    }

    public String toString() {
        Object obj;
        Object obj2;
        C1781jv.C1783a a = C1781jv.m5348h(this).mo15935a(NotificationCompat.CATEGORY_STATUS, this.f1606Eb);
        if (this.f1607Ua.size() > 5) {
            obj = this.f1607Ua.size() + " data sets";
        } else {
            obj = this.f1607Ua;
        }
        C1781jv.C1783a a2 = a.mo15935a("dataSets", obj);
        if (this.f1609Wr.size() > 5) {
            obj2 = this.f1609Wr.size() + " buckets";
        } else {
            obj2 = this.f1609Wr;
        }
        return a2.mo15935a("buckets", obj2).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1069b.m1992a(this, parcel, i);
    }
}
