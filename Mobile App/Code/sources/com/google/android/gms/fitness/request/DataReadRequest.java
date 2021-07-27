package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataReadRequest implements SafeParcelable {
    public static final Parcelable.Creator<DataReadRequest> CREATOR = new C1040g();
    public static final int NO_LIMIT = 0;

    /* renamed from: CK */
    private final int f1466CK;

    /* renamed from: LW */
    private final long f1467LW;

    /* renamed from: TO */
    private final long f1468TO;

    /* renamed from: TY */
    private final List<DataType> f1469TY;

    /* renamed from: Ub */
    private final int f1470Ub;

    /* renamed from: VH */
    private final List<DataSource> f1471VH;

    /* renamed from: VL */
    private final List<DataType> f1472VL;

    /* renamed from: VM */
    private final List<DataSource> f1473VM;

    /* renamed from: VN */
    private final long f1474VN;

    /* renamed from: VO */
    private final DataSource f1475VO;

    /* renamed from: VP */
    private final int f1476VP;

    /* renamed from: VQ */
    private final boolean f1477VQ;

    /* renamed from: VR */
    private final boolean f1478VR;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: LW */
        public long f1479LW;
        /* access modifiers changed from: private */

        /* renamed from: TO */
        public long f1480TO;
        /* access modifiers changed from: private */

        /* renamed from: TY */
        public List<DataType> f1481TY = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: Ub */
        public int f1482Ub = 0;
        /* access modifiers changed from: private */

        /* renamed from: VH */
        public List<DataSource> f1483VH = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: VL */
        public List<DataType> f1484VL = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: VM */
        public List<DataSource> f1485VM = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: VN */
        public long f1486VN = 0;
        /* access modifiers changed from: private */

        /* renamed from: VO */
        public DataSource f1487VO;
        /* access modifiers changed from: private */

        /* renamed from: VP */
        public int f1488VP = 0;
        /* access modifiers changed from: private */

        /* renamed from: VQ */
        public boolean f1489VQ = false;
        /* access modifiers changed from: private */

        /* renamed from: VR */
        public boolean f1490VR = false;

        public Builder aggregate(DataSource dataSource, DataType dataType) {
            C1785jx.m5359b(dataSource, (Object) "Attempting to add a null data source");
            C1785jx.m5355a(!this.f1483VH.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            DataType dataType2 = dataSource.getDataType();
            C1785jx.m5362b(DataType.AGGREGATE_INPUT_TYPES.contains(dataType2), "Unsupported input data type specified for aggregation: %s", dataType2);
            C1785jx.m5362b(DataType.getAggregatesForInput(dataType2).contains(dataType), "Invalid output aggregate data type specified: %s -> %s", dataType2, dataType);
            if (!this.f1485VM.contains(dataSource)) {
                this.f1485VM.add(dataSource);
            }
            return this;
        }

        public Builder aggregate(DataType dataType, DataType dataType2) {
            C1785jx.m5359b(dataType, (Object) "Attempting to use a null data type");
            C1785jx.m5355a(!this.f1481TY.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            C1785jx.m5362b(DataType.AGGREGATE_INPUT_TYPES.contains(dataType), "Unsupported input data type specified for aggregation: %s", dataType);
            C1785jx.m5362b(DataType.getAggregatesForInput(dataType).contains(dataType2), "Invalid output aggregate data type specified: %s -> %s", dataType, dataType2);
            if (!this.f1484VL.contains(dataType)) {
                this.f1484VL.add(dataType);
            }
            return this;
        }

        public Builder bucketByActivitySegment(int i, TimeUnit timeUnit) {
            C1785jx.m5362b(this.f1482Ub == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f1482Ub));
            C1785jx.m5362b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.f1482Ub = 4;
            this.f1486VN = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketByActivitySegment(int i, TimeUnit timeUnit, DataSource dataSource) {
            C1785jx.m5362b(this.f1482Ub == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f1482Ub));
            C1785jx.m5362b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            C1785jx.m5361b(dataSource != null, (Object) "Invalid activity data source specified");
            C1785jx.m5362b(dataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.f1487VO = dataSource;
            this.f1482Ub = 4;
            this.f1486VN = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketByActivityType(int i, TimeUnit timeUnit) {
            C1785jx.m5362b(this.f1482Ub == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f1482Ub));
            C1785jx.m5362b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.f1482Ub = 3;
            this.f1486VN = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketByActivityType(int i, TimeUnit timeUnit, DataSource dataSource) {
            C1785jx.m5362b(this.f1482Ub == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f1482Ub));
            C1785jx.m5362b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            C1785jx.m5361b(dataSource != null, (Object) "Invalid activity data source specified");
            C1785jx.m5362b(dataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.f1487VO = dataSource;
            this.f1482Ub = 3;
            this.f1486VN = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketBySession(int i, TimeUnit timeUnit) {
            C1785jx.m5362b(this.f1482Ub == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f1482Ub));
            C1785jx.m5362b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.f1482Ub = 2;
            this.f1486VN = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketByTime(int i, TimeUnit timeUnit) {
            C1785jx.m5362b(this.f1482Ub == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.f1482Ub));
            C1785jx.m5362b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.f1482Ub = 1;
            this.f1486VN = timeUnit.toMillis((long) i);
            return this;
        }

        public DataReadRequest build() {
            boolean z = true;
            C1785jx.m5355a(!this.f1483VH.isEmpty() || !this.f1481TY.isEmpty() || !this.f1485VM.isEmpty() || !this.f1484VL.isEmpty(), "Must add at least one data source (aggregated or detailed)");
            C1785jx.m5356a(this.f1479LW > 0, "Invalid start time: %s", Long.valueOf(this.f1479LW));
            C1785jx.m5356a(this.f1480TO > 0 && this.f1480TO > this.f1479LW, "Invalid end time: %s", Long.valueOf(this.f1480TO));
            boolean z2 = this.f1485VM.isEmpty() && this.f1484VL.isEmpty();
            if ((!z2 || this.f1482Ub != 0) && (z2 || this.f1482Ub == 0)) {
                z = false;
            }
            C1785jx.m5355a(z, "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest(this);
        }

        public Builder enableServerQueries() {
            this.f1490VR = true;
            return this;
        }

        public Builder read(DataSource dataSource) {
            C1785jx.m5359b(dataSource, (Object) "Attempting to add a null data source");
            C1785jx.m5361b(!this.f1485VM.contains(dataSource), (Object) "Cannot add the same data source as aggregated and detailed");
            if (!this.f1483VH.contains(dataSource)) {
                this.f1483VH.add(dataSource);
            }
            return this;
        }

        public Builder read(DataType dataType) {
            C1785jx.m5359b(dataType, (Object) "Attempting to use a null data type");
            C1785jx.m5355a(!this.f1484VL.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            if (!this.f1481TY.contains(dataType)) {
                this.f1481TY.add(dataType);
            }
            return this;
        }

        public Builder setLimit(int i) {
            C1785jx.m5362b(i > 0, "Invalid limit %d is specified", Integer.valueOf(i));
            this.f1488VP = i;
            return this;
        }

        public Builder setTimeRange(long j, long j2, TimeUnit timeUnit) {
            this.f1479LW = timeUnit.toMillis(j);
            this.f1480TO = timeUnit.toMillis(j2);
            return this;
        }
    }

    DataReadRequest(int i, List<DataType> list, List<DataSource> list2, long j, long j2, List<DataType> list3, List<DataSource> list4, int i2, long j3, DataSource dataSource, int i3, boolean z, boolean z2) {
        this.f1466CK = i;
        this.f1469TY = Collections.unmodifiableList(list);
        this.f1471VH = Collections.unmodifiableList(list2);
        this.f1467LW = j;
        this.f1468TO = j2;
        this.f1472VL = Collections.unmodifiableList(list3);
        this.f1473VM = Collections.unmodifiableList(list4);
        this.f1470Ub = i2;
        this.f1474VN = j3;
        this.f1475VO = dataSource;
        this.f1476VP = i3;
        this.f1477VQ = z;
        this.f1478VR = z2;
    }

    private DataReadRequest(Builder builder) {
        this.f1466CK = 2;
        this.f1469TY = Collections.unmodifiableList(builder.f1481TY);
        this.f1471VH = Collections.unmodifiableList(builder.f1483VH);
        this.f1467LW = builder.f1479LW;
        this.f1468TO = builder.f1480TO;
        this.f1472VL = Collections.unmodifiableList(builder.f1484VL);
        this.f1473VM = Collections.unmodifiableList(builder.f1485VM);
        this.f1470Ub = builder.f1482Ub;
        this.f1474VN = builder.f1486VN;
        this.f1475VO = builder.f1487VO;
        this.f1476VP = builder.f1488VP;
        this.f1477VQ = builder.f1489VQ;
        this.f1478VR = builder.f1490VR;
    }

    /* renamed from: a */
    private boolean m1788a(DataReadRequest dataReadRequest) {
        return this.f1469TY.equals(dataReadRequest.f1469TY) && this.f1471VH.equals(dataReadRequest.f1471VH) && this.f1467LW == dataReadRequest.f1467LW && this.f1468TO == dataReadRequest.f1468TO && this.f1470Ub == dataReadRequest.f1470Ub && this.f1473VM.equals(dataReadRequest.f1473VM) && this.f1472VL.equals(dataReadRequest.f1472VL) && C1781jv.equal(this.f1475VO, dataReadRequest.f1475VO) && this.f1474VN == dataReadRequest.f1474VN && this.f1478VR == dataReadRequest.f1478VR;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DataReadRequest) && m1788a((DataReadRequest) obj);
        }
        return true;
    }

    public DataSource getActivityDataSource() {
        return this.f1475VO;
    }

    public List<DataSource> getAggregatedDataSources() {
        return this.f1473VM;
    }

    public List<DataType> getAggregatedDataTypes() {
        return this.f1472VL;
    }

    public long getBucketDuration(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1474VN, TimeUnit.MILLISECONDS);
    }

    public int getBucketType() {
        return this.f1470Ub;
    }

    public List<DataSource> getDataSources() {
        return this.f1471VH;
    }

    public List<DataType> getDataTypes() {
        return this.f1469TY;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1468TO, TimeUnit.MILLISECONDS);
    }

    public int getLimit() {
        return this.f1476VP;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1467LW, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1466CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f1470Ub), Long.valueOf(this.f1467LW), Long.valueOf(this.f1468TO));
    }

    /* renamed from: jV */
    public boolean mo12558jV() {
        return this.f1478VR;
    }

    /* renamed from: jW */
    public boolean mo12559jW() {
        return this.f1477VQ;
    }

    /* renamed from: jX */
    public long mo12560jX() {
        return this.f1474VN;
    }

    /* renamed from: jo */
    public long mo12561jo() {
        return this.f1467LW;
    }

    /* renamed from: jp */
    public long mo12562jp() {
        return this.f1468TO;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataReadRequest{");
        if (!this.f1469TY.isEmpty()) {
            for (DataType jB : this.f1469TY) {
                sb.append(jB.mo12333jB());
                sb.append(" ");
            }
        }
        if (!this.f1471VH.isEmpty()) {
            for (DataSource debugString : this.f1471VH) {
                sb.append(debugString.toDebugString());
                sb.append(" ");
            }
        }
        if (this.f1470Ub != 0) {
            sb.append("bucket by ");
            sb.append(Bucket.m1635cJ(this.f1470Ub));
            if (this.f1474VN > 0) {
                sb.append(" >");
                sb.append(this.f1474VN);
                sb.append("ms");
            }
            sb.append(": ");
        }
        if (!this.f1472VL.isEmpty()) {
            for (DataType jB2 : this.f1472VL) {
                sb.append(jB2.mo12333jB());
                sb.append(" ");
            }
        }
        if (!this.f1473VM.isEmpty()) {
            for (DataSource debugString2 : this.f1473VM) {
                sb.append(debugString2.toDebugString());
                sb.append(" ");
            }
        }
        sb.append(String.format("(%tF %tT - %tF %tT)", new Object[]{Long.valueOf(this.f1467LW), Long.valueOf(this.f1467LW), Long.valueOf(this.f1468TO), Long.valueOf(this.f1468TO)}));
        if (this.f1475VO != null) {
            sb.append("activities: ");
            sb.append(this.f1475VO.toDebugString());
        }
        if (this.f1478VR) {
            sb.append(" +server");
        }
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1040g.m1903a(this, parcel, i);
    }
}
