package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawBucket implements SafeParcelable {
    public static final Parcelable.Creator<RawBucket> CREATOR = new C0998m();

    /* renamed from: CK */
    final int f1392CK;

    /* renamed from: LW */
    final long f1393LW;

    /* renamed from: TO */
    final long f1394TO;

    /* renamed from: TQ */
    final Session f1395TQ;

    /* renamed from: UI */
    final int f1396UI;

    /* renamed from: Ua */
    final List<RawDataSet> f1397Ua;

    /* renamed from: Ub */
    final int f1398Ub;

    /* renamed from: Uc */
    final boolean f1399Uc;

    RawBucket(int i, long j, long j2, Session session, int i2, List<RawDataSet> list, int i3, boolean z) {
        this.f1392CK = i;
        this.f1393LW = j;
        this.f1394TO = j2;
        this.f1395TQ = session;
        this.f1396UI = i2;
        this.f1397Ua = list;
        this.f1398Ub = i3;
        this.f1399Uc = z;
    }

    public RawBucket(Bucket bucket, List<DataSource> list, List<DataType> list2) {
        this.f1392CK = 2;
        this.f1393LW = bucket.getStartTime(TimeUnit.MILLISECONDS);
        this.f1394TO = bucket.getEndTime(TimeUnit.MILLISECONDS);
        this.f1395TQ = bucket.getSession();
        this.f1396UI = bucket.mo12254jm();
        this.f1398Ub = bucket.getBucketType();
        this.f1399Uc = bucket.mo12255jn();
        List<DataSet> dataSets = bucket.getDataSets();
        this.f1397Ua = new ArrayList(dataSets.size());
        for (DataSet rawDataSet : dataSets) {
            this.f1397Ua.add(new RawDataSet(rawDataSet, list, list2));
        }
    }

    /* renamed from: a */
    private boolean m1685a(RawBucket rawBucket) {
        return this.f1393LW == rawBucket.f1393LW && this.f1394TO == rawBucket.f1394TO && this.f1396UI == rawBucket.f1396UI && C1781jv.equal(this.f1397Ua, rawBucket.f1397Ua) && this.f1398Ub == rawBucket.f1398Ub && this.f1399Uc == rawBucket.f1399Uc;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RawBucket) && m1685a((RawBucket) obj);
        }
        return true;
    }

    public int hashCode() {
        return C1781jv.hashCode(Long.valueOf(this.f1393LW), Long.valueOf(this.f1394TO), Integer.valueOf(this.f1398Ub));
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("startTime", Long.valueOf(this.f1393LW)).mo15935a("endTime", Long.valueOf(this.f1394TO)).mo15935a("activity", Integer.valueOf(this.f1396UI)).mo15935a("dataSets", this.f1397Ua).mo15935a("bucketType", Integer.valueOf(this.f1398Ub)).mo15935a("serverHasMoreData", Boolean.valueOf(this.f1399Uc)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0998m.m1751a(this, parcel, i);
    }
}
