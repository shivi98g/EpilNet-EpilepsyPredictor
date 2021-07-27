package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawDataPoint implements SafeParcelable {
    public static final Parcelable.Creator<RawDataPoint> CREATOR = new C0999n();

    /* renamed from: CK */
    final int f1400CK;

    /* renamed from: UJ */
    final int f1401UJ;

    /* renamed from: UK */
    final int f1402UK;

    /* renamed from: Ud */
    final long f1403Ud;

    /* renamed from: Ue */
    final long f1404Ue;

    /* renamed from: Uf */
    final Value[] f1405Uf;

    /* renamed from: Uh */
    final long f1406Uh;

    /* renamed from: Ui */
    final long f1407Ui;

    RawDataPoint(int i, long j, long j2, Value[] valueArr, int i2, int i3, long j3, long j4) {
        this.f1400CK = i;
        this.f1403Ud = j;
        this.f1404Ue = j2;
        this.f1401UJ = i2;
        this.f1402UK = i3;
        this.f1406Uh = j3;
        this.f1407Ui = j4;
        this.f1405Uf = valueArr;
    }

    RawDataPoint(DataPoint dataPoint, List<DataSource> list) {
        this.f1400CK = 4;
        this.f1403Ud = dataPoint.getTimestamp(TimeUnit.NANOSECONDS);
        this.f1404Ue = dataPoint.getStartTime(TimeUnit.NANOSECONDS);
        this.f1405Uf = dataPoint.mo12272jr();
        this.f1401UJ = C1005t.m1771a(dataPoint.getDataSource(), list);
        this.f1402UK = C1005t.m1771a(dataPoint.getOriginalDataSource(), list);
        this.f1406Uh = dataPoint.mo12273js();
        this.f1407Ui = dataPoint.mo12274jt();
    }

    /* renamed from: a */
    private boolean m1686a(RawDataPoint rawDataPoint) {
        return this.f1403Ud == rawDataPoint.f1403Ud && this.f1404Ue == rawDataPoint.f1404Ue && Arrays.equals(this.f1405Uf, rawDataPoint.f1405Uf) && this.f1401UJ == rawDataPoint.f1401UJ && this.f1402UK == rawDataPoint.f1402UK && this.f1406Uh == rawDataPoint.f1406Uh;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RawDataPoint) && m1686a((RawDataPoint) obj);
        }
        return true;
    }

    public int hashCode() {
        return C1781jv.hashCode(Long.valueOf(this.f1403Ud), Long.valueOf(this.f1404Ue));
    }

    public String toString() {
        return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", new Object[]{Arrays.toString(this.f1405Uf), Long.valueOf(this.f1404Ue), Long.valueOf(this.f1403Ud), Integer.valueOf(this.f1401UJ), Integer.valueOf(this.f1402UK)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0999n.m1754a(this, parcel, i);
    }
}
