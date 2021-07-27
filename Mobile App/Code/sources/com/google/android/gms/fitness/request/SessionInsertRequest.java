package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1862lt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionInsertRequest implements SafeParcelable {
    public static final Parcelable.Creator<SessionInsertRequest> CREATOR = new C1056s();

    /* renamed from: CK */
    private final int f1517CK;

    /* renamed from: TQ */
    private final Session f1518TQ;

    /* renamed from: Ua */
    private final List<DataSet> f1519Ua;

    /* renamed from: Wh */
    private final List<DataPoint> f1520Wh;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: TQ */
        public Session f1521TQ;
        /* access modifiers changed from: private */

        /* renamed from: Ua */
        public List<DataSet> f1522Ua = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: Wh */
        public List<DataPoint> f1523Wh = new ArrayList();

        /* renamed from: Wi */
        private List<DataSource> f1524Wi = new ArrayList();

        /* renamed from: d */
        private void m1829d(DataPoint dataPoint) {
            m1831f(dataPoint);
            m1830e(dataPoint);
        }

        /* renamed from: e */
        private void m1830e(DataPoint dataPoint) {
            DataPoint dataPoint2 = dataPoint;
            long startTime = this.f1521TQ.getStartTime(TimeUnit.NANOSECONDS);
            long endTime = this.f1521TQ.getEndTime(TimeUnit.NANOSECONDS);
            long startTime2 = dataPoint2.getStartTime(TimeUnit.NANOSECONDS);
            long endTime2 = dataPoint2.getEndTime(TimeUnit.NANOSECONDS);
            if (startTime2 != 0 && endTime2 != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (endTime2 > endTime) {
                    endTime2 = C1862lt.m5557a(endTime2, TimeUnit.NANOSECONDS, timeUnit);
                }
                C1785jx.m5356a(startTime2 >= startTime && endTime2 <= endTime, "Data point %s has start and end times outside session interval [%d, %d]", dataPoint2, Long.valueOf(startTime), Long.valueOf(endTime));
                if (endTime2 != dataPoint2.getEndTime(TimeUnit.NANOSECONDS)) {
                    Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[]{Long.valueOf(dataPoint2.getEndTime(TimeUnit.NANOSECONDS)), Long.valueOf(endTime2), timeUnit}));
                    dataPoint2.setTimeInterval(startTime2, endTime2, TimeUnit.NANOSECONDS);
                }
            }
        }

        /* renamed from: f */
        private void m1831f(DataPoint dataPoint) {
            long startTime = this.f1521TQ.getStartTime(TimeUnit.NANOSECONDS);
            long endTime = this.f1521TQ.getEndTime(TimeUnit.NANOSECONDS);
            long timestamp = dataPoint.getTimestamp(TimeUnit.NANOSECONDS);
            if (timestamp != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (timestamp < startTime || timestamp > endTime) {
                    timestamp = C1862lt.m5557a(timestamp, TimeUnit.NANOSECONDS, timeUnit);
                }
                C1785jx.m5356a(timestamp >= startTime && timestamp <= endTime, "Data point %s has time stamp outside session interval [%d, %d]", dataPoint, Long.valueOf(startTime), Long.valueOf(endTime));
                if (dataPoint.getTimestamp(TimeUnit.NANOSECONDS) != timestamp) {
                    Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[]{Long.valueOf(dataPoint.getTimestamp(TimeUnit.NANOSECONDS)), Long.valueOf(timestamp), timeUnit}));
                    dataPoint.setTimestamp(timestamp, TimeUnit.NANOSECONDS);
                }
            }
        }

        /* renamed from: ki */
        private void m1832ki() {
            for (DataSet dataPoints : this.f1522Ua) {
                for (DataPoint d : dataPoints.getDataPoints()) {
                    m1829d(d);
                }
            }
            for (DataPoint d2 : this.f1523Wh) {
                m1829d(d2);
            }
        }

        public Builder addAggregateDataPoint(DataPoint dataPoint) {
            C1785jx.m5361b(dataPoint != null, (Object) "Must specify a valid aggregate data point.");
            long startTime = dataPoint.getStartTime(TimeUnit.NANOSECONDS);
            C1785jx.m5362b(startTime > 0 && dataPoint.getEndTime(TimeUnit.NANOSECONDS) > startTime, "Aggregate data point should have valid start and end times: %s", dataPoint);
            DataSource dataSource = dataPoint.getDataSource();
            C1785jx.m5356a(!this.f1524Wi.contains(dataSource), "Data set/Aggregate data point for this data source %s is already added.", dataSource);
            this.f1524Wi.add(dataSource);
            this.f1523Wh.add(dataPoint);
            return this;
        }

        public Builder addDataSet(DataSet dataSet) {
            C1785jx.m5361b(dataSet != null, (Object) "Must specify a valid data set.");
            DataSource dataSource = dataSet.getDataSource();
            C1785jx.m5356a(!this.f1524Wi.contains(dataSource), "Data set for this data source %s is already added.", dataSource);
            C1785jx.m5361b(!dataSet.getDataPoints().isEmpty(), (Object) "No data points specified in the input data set.");
            this.f1524Wi.add(dataSource);
            this.f1522Ua.add(dataSet);
            return this;
        }

        public SessionInsertRequest build() {
            boolean z = false;
            C1785jx.m5355a(this.f1521TQ != null, "Must specify a valid session.");
            if (this.f1521TQ.getEndTime(TimeUnit.MILLISECONDS) != 0) {
                z = true;
            }
            C1785jx.m5355a(z, "Must specify a valid end time, cannot insert a continuing session.");
            m1832ki();
            return new SessionInsertRequest(this);
        }

        public Builder setSession(Session session) {
            this.f1521TQ = session;
            return this;
        }
    }

    SessionInsertRequest(int i, Session session, List<DataSet> list, List<DataPoint> list2) {
        this.f1517CK = i;
        this.f1518TQ = session;
        this.f1519Ua = Collections.unmodifiableList(list);
        this.f1520Wh = Collections.unmodifiableList(list2);
    }

    private SessionInsertRequest(Builder builder) {
        this.f1517CK = 1;
        this.f1518TQ = builder.f1521TQ;
        this.f1519Ua = Collections.unmodifiableList(builder.f1522Ua);
        this.f1520Wh = Collections.unmodifiableList(builder.f1523Wh);
    }

    /* renamed from: a */
    private boolean m1825a(SessionInsertRequest sessionInsertRequest) {
        return C1781jv.equal(this.f1518TQ, sessionInsertRequest.f1518TQ) && C1781jv.equal(this.f1519Ua, sessionInsertRequest.f1519Ua) && C1781jv.equal(this.f1520Wh, sessionInsertRequest.f1520Wh);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof SessionInsertRequest) && m1825a((SessionInsertRequest) obj);
        }
        return true;
    }

    public List<DataPoint> getAggregateDataPoints() {
        return this.f1520Wh;
    }

    public List<DataSet> getDataSets() {
        return this.f1519Ua;
    }

    public Session getSession() {
        return this.f1518TQ;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1517CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1518TQ, this.f1519Ua, this.f1520Wh);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("session", this.f1518TQ).mo15935a("dataSets", this.f1519Ua).mo15935a("aggregateDataPoints", this.f1520Wh).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1056s.m1939a(this, parcel, i);
    }
}
