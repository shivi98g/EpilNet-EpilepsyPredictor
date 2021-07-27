package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bucket implements SafeParcelable {
    public static final Parcelable.Creator<Bucket> CREATOR = new C0985d();
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;

    /* renamed from: CK */
    private final int f1336CK;

    /* renamed from: LW */
    private final long f1337LW;

    /* renamed from: TO */
    private final long f1338TO;

    /* renamed from: TQ */
    private final Session f1339TQ;

    /* renamed from: TZ */
    private final int f1340TZ;

    /* renamed from: Ua */
    private final List<DataSet> f1341Ua;

    /* renamed from: Ub */
    private final int f1342Ub;

    /* renamed from: Uc */
    private boolean f1343Uc;

    Bucket(int i, long j, long j2, Session session, int i2, List<DataSet> list, int i3, boolean z) {
        this.f1343Uc = false;
        this.f1336CK = i;
        this.f1337LW = j;
        this.f1338TO = j2;
        this.f1339TQ = session;
        this.f1340TZ = i2;
        this.f1341Ua = list;
        this.f1342Ub = i3;
        this.f1343Uc = z;
    }

    public Bucket(RawBucket rawBucket, List<DataSource> list, List<DataType> list2) {
        this(2, rawBucket.f1393LW, rawBucket.f1394TO, rawBucket.f1395TQ, rawBucket.f1396UI, m1633a(rawBucket.f1397Ua, list, list2), rawBucket.f1398Ub, rawBucket.f1399Uc);
    }

    /* renamed from: a */
    private static List<DataSet> m1633a(List<RawDataSet> list, List<DataSource> list2, List<DataType> list3) {
        ArrayList arrayList = new ArrayList(list.size());
        for (RawDataSet dataSet : list) {
            arrayList.add(new DataSet(dataSet, list2, list3));
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m1634a(Bucket bucket) {
        return this.f1337LW == bucket.f1337LW && this.f1338TO == bucket.f1338TO && this.f1340TZ == bucket.f1340TZ && C1781jv.equal(this.f1341Ua, bucket.f1341Ua) && this.f1342Ub == bucket.f1342Ub && this.f1343Uc == bucket.f1343Uc;
    }

    /* renamed from: cJ */
    public static String m1635cJ(int i) {
        switch (i) {
            case 0:
                return "unknown";
            case 1:
                return "time";
            case 2:
                return "session";
            case 3:
                return "type";
            case 4:
                return "segment";
            default:
                return "bug";
        }
    }

    /* renamed from: b */
    public boolean mo12242b(Bucket bucket) {
        return this.f1337LW == bucket.f1337LW && this.f1338TO == bucket.f1338TO && this.f1340TZ == bucket.f1340TZ && this.f1342Ub == bucket.f1342Ub;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Bucket) && m1634a((Bucket) obj);
        }
        return true;
    }

    public String getActivity() {
        return FitnessActivities.getName(this.f1340TZ);
    }

    public int getBucketType() {
        return this.f1342Ub;
    }

    public DataSet getDataSet(DataType dataType) {
        for (DataSet next : this.f1341Ua) {
            if (next.getDataType().equals(dataType)) {
                return next;
            }
        }
        return null;
    }

    public List<DataSet> getDataSets() {
        return this.f1341Ua;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1338TO, TimeUnit.MILLISECONDS);
    }

    public Session getSession() {
        return this.f1339TQ;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1337LW, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1336CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Long.valueOf(this.f1337LW), Long.valueOf(this.f1338TO), Integer.valueOf(this.f1340TZ), Integer.valueOf(this.f1342Ub));
    }

    /* renamed from: jm */
    public int mo12254jm() {
        return this.f1340TZ;
    }

    /* renamed from: jn */
    public boolean mo12255jn() {
        if (this.f1343Uc) {
            return true;
        }
        for (DataSet jn : this.f1341Ua) {
            if (jn.mo12295jn()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: jo */
    public long mo12256jo() {
        return this.f1337LW;
    }

    /* renamed from: jp */
    public long mo12257jp() {
        return this.f1338TO;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("startTime", Long.valueOf(this.f1337LW)).mo15935a("endTime", Long.valueOf(this.f1338TO)).mo15935a("activity", Integer.valueOf(this.f1340TZ)).mo15935a("dataSets", this.f1341Ua).mo15935a("bucketType", m1635cJ(this.f1342Ub)).mo15935a("serverHasMoreData", Boolean.valueOf(this.f1343Uc)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0985d.m1722a(this, parcel, i);
    }
}
