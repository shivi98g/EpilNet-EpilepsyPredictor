package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.C0724c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1862lt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataPoint implements SafeParcelable {
    public static final Parcelable.Creator<DataPoint> CREATOR = new C0986e();

    /* renamed from: CK */
    private final int f1344CK;

    /* renamed from: TN */
    private final DataSource f1345TN;

    /* renamed from: Ud */
    private long f1346Ud;

    /* renamed from: Ue */
    private long f1347Ue;

    /* renamed from: Uf */
    private final Value[] f1348Uf;

    /* renamed from: Ug */
    private DataSource f1349Ug;

    /* renamed from: Uh */
    private long f1350Uh;

    /* renamed from: Ui */
    private long f1351Ui;

    DataPoint(int i, DataSource dataSource, long j, long j2, Value[] valueArr, DataSource dataSource2, long j3, long j4) {
        this.f1344CK = i;
        this.f1345TN = dataSource;
        this.f1349Ug = dataSource2;
        this.f1346Ud = j;
        this.f1347Ue = j2;
        this.f1348Uf = valueArr;
        this.f1350Uh = j3;
        this.f1351Ui = j4;
    }

    private DataPoint(DataSource dataSource) {
        this.f1344CK = 4;
        this.f1345TN = (DataSource) C1785jx.m5359b(dataSource, (Object) "Data source cannot be null");
        List<Field> fields = dataSource.getDataType().getFields();
        this.f1348Uf = new Value[fields.size()];
        int i = 0;
        for (Field format : fields) {
            this.f1348Uf[i] = new Value(format.getFormat());
            i++;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    DataPoint(java.util.List<com.google.android.gms.fitness.data.DataSource> r17, com.google.android.gms.fitness.data.RawDataPoint r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.f1401UJ
            com.google.android.gms.fitness.data.DataSource r5 = m1642c(r0, r2)
            long r6 = r1.f1403Ud
            long r8 = r1.f1404Ue
            com.google.android.gms.fitness.data.Value[] r10 = r1.f1405Uf
            int r2 = r1.f1402UK
            com.google.android.gms.fitness.data.DataSource r11 = m1642c(r0, r2)
            long r12 = r1.f1406Uh
            long r14 = r1.f1407Ui
            r4 = 4
            r3 = r16
            r3.<init>(r4, r5, r6, r8, r10, r11, r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.data.DataPoint.<init>(java.util.List, com.google.android.gms.fitness.data.RawDataPoint):void");
    }

    /* renamed from: a */
    private boolean m1641a(DataPoint dataPoint) {
        return C1781jv.equal(this.f1345TN, dataPoint.f1345TN) && this.f1346Ud == dataPoint.f1346Ud && this.f1347Ue == dataPoint.f1347Ue && Arrays.equals(this.f1348Uf, dataPoint.f1348Uf) && C1781jv.equal(this.f1349Ug, dataPoint.f1349Ug);
    }

    /* renamed from: c */
    private static DataSource m1642c(List<DataSource> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: cL */
    private void m1643cL(int i) {
        List<Field> fields = getDataType().getFields();
        int size = fields.size();
        C1785jx.m5362b(i == size, "Attempting to insert %s values, but needed %s: %s", Integer.valueOf(i), Integer.valueOf(size), fields);
    }

    public static DataPoint create(DataSource dataSource) {
        return new DataPoint(dataSource);
    }

    public static DataPoint extract(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (DataPoint) C0724c.m778a(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
    }

    /* renamed from: jq */
    private boolean m1644jq() {
        return getDataType() == DataType.TYPE_LOCATION_SAMPLE;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DataPoint) && m1641a((DataPoint) obj);
        }
        return true;
    }

    public DataSource getDataSource() {
        return this.f1345TN;
    }

    public DataType getDataType() {
        return this.f1345TN.getDataType();
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1346Ud, TimeUnit.NANOSECONDS);
    }

    public DataSource getOriginalDataSource() {
        return this.f1349Ug;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1347Ue, TimeUnit.NANOSECONDS);
    }

    public long getTimestamp(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1346Ud, TimeUnit.NANOSECONDS);
    }

    public long getTimestampNanos() {
        return this.f1346Ud;
    }

    public Value getValue(Field field) {
        return this.f1348Uf[getDataType().indexOf(field)];
    }

    public int getVersionCode() {
        return this.f1344CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1345TN, Long.valueOf(this.f1346Ud), Long.valueOf(this.f1347Ue));
    }

    /* renamed from: jr */
    public Value[] mo12272jr() {
        return this.f1348Uf;
    }

    /* renamed from: js */
    public long mo12273js() {
        return this.f1350Uh;
    }

    /* renamed from: jt */
    public long mo12274jt() {
        return this.f1351Ui;
    }

    /* renamed from: ju */
    public long mo12275ju() {
        return this.f1347Ue;
    }

    public DataPoint setFloatValues(float... fArr) {
        m1643cL(fArr.length);
        for (int i = 0; i < fArr.length; i++) {
            this.f1348Uf[i].setFloat(fArr[i]);
        }
        return this;
    }

    public DataPoint setIntValues(int... iArr) {
        m1643cL(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            this.f1348Uf[i].setInt(iArr[i]);
        }
        return this;
    }

    public DataPoint setTimeInterval(long j, long j2, TimeUnit timeUnit) {
        this.f1347Ue = timeUnit.toNanos(j);
        this.f1346Ud = timeUnit.toNanos(j2);
        return this;
    }

    public DataPoint setTimestamp(long j, TimeUnit timeUnit) {
        this.f1346Ud = timeUnit.toNanos(j);
        if (m1644jq() && C1862lt.m5558a(timeUnit)) {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            this.f1346Ud = C1862lt.m5557a(this.f1346Ud, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public String toString() {
        return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", new Object[]{Arrays.toString(this.f1348Uf), Long.valueOf(this.f1347Ue), Long.valueOf(this.f1346Ud), Long.valueOf(this.f1350Uh), Long.valueOf(this.f1351Ui), this.f1345TN, this.f1349Ug});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0986e.m1725a(this, parcel, i);
    }
}
