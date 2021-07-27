package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest {
    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;

    /* renamed from: TM */
    private final DataType f1501TM;

    /* renamed from: TN */
    private final DataSource f1502TN;

    /* renamed from: UQ */
    private final long f1503UQ;

    /* renamed from: UR */
    private final int f1504UR;

    /* renamed from: VZ */
    private final long f1505VZ;

    /* renamed from: Wa */
    private final long f1506Wa;

    /* renamed from: We */
    private final LocationRequest f1507We;

    /* renamed from: Wf */
    private final long f1508Wf;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: TM */
        public DataType f1509TM;
        /* access modifiers changed from: private */

        /* renamed from: TN */
        public DataSource f1510TN;
        /* access modifiers changed from: private */

        /* renamed from: UQ */
        public long f1511UQ = -1;
        /* access modifiers changed from: private */

        /* renamed from: UR */
        public int f1512UR = 2;
        /* access modifiers changed from: private */

        /* renamed from: VZ */
        public long f1513VZ = 0;
        /* access modifiers changed from: private */

        /* renamed from: Wa */
        public long f1514Wa = 0;
        /* access modifiers changed from: private */

        /* renamed from: Wf */
        public long f1515Wf = Long.MAX_VALUE;

        /* renamed from: Wg */
        private boolean f1516Wg = false;

        public SensorRequest build() {
            boolean z = true;
            C1785jx.m5355a((this.f1510TN == null && this.f1509TM == null) ? false : true, "Must call setDataSource() or setDataType()");
            if (!(this.f1509TM == null || this.f1510TN == null || this.f1509TM.equals(this.f1510TN.getDataType()))) {
                z = false;
            }
            C1785jx.m5355a(z, "Specified data type is incompatible with specified data source");
            return new SensorRequest(this);
        }

        public Builder setAccuracyMode(int i) {
            this.f1512UR = SensorRequest.m1816dl(i);
            return this;
        }

        public Builder setDataSource(DataSource dataSource) {
            this.f1510TN = dataSource;
            return this;
        }

        public Builder setDataType(DataType dataType) {
            this.f1509TM = dataType;
            return this;
        }

        public Builder setFastestRate(int i, TimeUnit timeUnit) {
            C1785jx.m5361b(i >= 0, (Object) "Cannot use a negative interval");
            this.f1516Wg = true;
            this.f1514Wa = timeUnit.toMicros((long) i);
            return this;
        }

        public Builder setMaxDeliveryLatency(int i, TimeUnit timeUnit) {
            C1785jx.m5361b(i >= 0, (Object) "Cannot use a negative delivery interval");
            this.f1513VZ = timeUnit.toMicros((long) i);
            return this;
        }

        public Builder setSamplingRate(long j, TimeUnit timeUnit) {
            C1785jx.m5361b(j >= 0, (Object) "Cannot use a negative sampling interval");
            this.f1511UQ = timeUnit.toMicros(j);
            if (!this.f1516Wg) {
                this.f1514Wa = this.f1511UQ / 2;
            }
            return this;
        }

        public Builder setTimeout(long j, TimeUnit timeUnit) {
            boolean z = false;
            C1785jx.m5362b(j > 0, "Invalid time out value specified: %d", Long.valueOf(j));
            if (timeUnit != null) {
                z = true;
            }
            C1785jx.m5361b(z, (Object) "Invalid time unit specified");
            this.f1515Wf = timeUnit.toMicros(j);
            return this;
        }
    }

    private SensorRequest(DataSource dataSource, LocationRequest locationRequest) {
        this.f1507We = locationRequest;
        this.f1503UQ = TimeUnit.MILLISECONDS.toMicros(locationRequest.getInterval());
        this.f1506Wa = TimeUnit.MILLISECONDS.toMicros(locationRequest.getFastestInterval());
        this.f1505VZ = this.f1503UQ;
        this.f1501TM = dataSource.getDataType();
        this.f1504UR = m1814a(locationRequest);
        this.f1502TN = dataSource;
        long expirationTime = locationRequest.getExpirationTime();
        if (expirationTime == Long.MAX_VALUE) {
            this.f1508Wf = Long.MAX_VALUE;
        } else {
            this.f1508Wf = TimeUnit.MILLISECONDS.toMicros(expirationTime - SystemClock.elapsedRealtime());
        }
    }

    private SensorRequest(Builder builder) {
        this.f1502TN = builder.f1510TN;
        this.f1501TM = builder.f1509TM;
        this.f1503UQ = builder.f1511UQ;
        this.f1506Wa = builder.f1514Wa;
        this.f1505VZ = builder.f1513VZ;
        this.f1504UR = builder.f1512UR;
        this.f1507We = null;
        this.f1508Wf = builder.f1515Wf;
    }

    /* renamed from: a */
    private static int m1814a(LocationRequest locationRequest) {
        int priority = locationRequest.getPriority();
        if (priority != 100) {
            return priority != 104 ? 2 : 1;
        }
        return 3;
    }

    /* renamed from: a */
    private boolean m1815a(SensorRequest sensorRequest) {
        return C1781jv.equal(this.f1502TN, sensorRequest.f1502TN) && C1781jv.equal(this.f1501TM, sensorRequest.f1501TM) && this.f1503UQ == sensorRequest.f1503UQ && this.f1506Wa == sensorRequest.f1506Wa && this.f1505VZ == sensorRequest.f1505VZ && this.f1504UR == sensorRequest.f1504UR && C1781jv.equal(this.f1507We, sensorRequest.f1507We) && this.f1508Wf == sensorRequest.f1508Wf;
    }

    /* renamed from: dl */
    public static int m1816dl(int i) {
        if (i == 1 || i == 3) {
            return i;
        }
        return 2;
    }

    public static SensorRequest fromLocationRequest(DataSource dataSource, LocationRequest locationRequest) {
        return new SensorRequest(dataSource, locationRequest);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SensorRequest) && m1815a((SensorRequest) obj);
        }
        return true;
    }

    public int getAccuracyMode() {
        return this.f1504UR;
    }

    public DataSource getDataSource() {
        return this.f1502TN;
    }

    public DataType getDataType() {
        return this.f1501TM;
    }

    public long getFastestRate(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1506Wa, TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1505VZ, TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1503UQ, TimeUnit.MICROSECONDS);
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1502TN, this.f1501TM, Long.valueOf(this.f1503UQ), Long.valueOf(this.f1506Wa), Long.valueOf(this.f1505VZ), Integer.valueOf(this.f1504UR), this.f1507We, Long.valueOf(this.f1508Wf));
    }

    /* renamed from: kh */
    public long mo12610kh() {
        return this.f1508Wf;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("dataSource", this.f1502TN).mo15935a("dataType", this.f1501TM).mo15935a("samplingRateMicros", Long.valueOf(this.f1503UQ)).mo15935a("deliveryLatencyMicros", Long.valueOf(this.f1505VZ)).mo15935a("timeOutMicros", Long.valueOf(this.f1508Wf)).toString();
    }
}
