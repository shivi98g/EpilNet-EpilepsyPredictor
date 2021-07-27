package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.C0992k;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.fitness.request.o */
public class C1052o implements SafeParcelable {
    public static final Parcelable.Creator<C1052o> CREATOR = new C1053p();

    /* renamed from: CK */
    private final int f1580CK;

    /* renamed from: TM */
    private final DataType f1581TM;

    /* renamed from: TN */
    private final DataSource f1582TN;

    /* renamed from: UQ */
    private final long f1583UQ;

    /* renamed from: UR */
    private final int f1584UR;

    /* renamed from: VW */
    private C0992k f1585VW;

    /* renamed from: VX */
    int f1586VX;

    /* renamed from: VY */
    int f1587VY;

    /* renamed from: VZ */
    private final long f1588VZ;

    /* renamed from: Wa */
    private final long f1589Wa;

    /* renamed from: Wb */
    private final List<LocationRequest> f1590Wb;

    /* renamed from: Wc */
    private final long f1591Wc;

    /* renamed from: Wd */
    private final List f1592Wd;
    private final PendingIntent mPendingIntent;

    C1052o(int i, DataSource dataSource, DataType dataType, IBinder iBinder, int i2, int i3, long j, long j2, PendingIntent pendingIntent, long j3, int i4, List<LocationRequest> list, long j4) {
        this.f1580CK = i;
        this.f1582TN = dataSource;
        this.f1581TM = dataType;
        this.f1585VW = iBinder == null ? null : C0992k.C0993a.m1744aq(iBinder);
        this.f1583UQ = j == 0 ? (long) i2 : j;
        this.f1589Wa = j3;
        this.f1588VZ = j2 == 0 ? (long) i3 : j2;
        this.f1590Wb = list;
        this.mPendingIntent = pendingIntent;
        this.f1584UR = i4;
        this.f1592Wd = Collections.emptyList();
        this.f1591Wc = j4;
    }

    private C1052o(DataSource dataSource, DataType dataType, C0992k kVar, PendingIntent pendingIntent, long j, long j2, long j3, int i, List list, List list2, long j4) {
        this.f1580CK = 4;
        this.f1582TN = dataSource;
        this.f1581TM = dataType;
        this.f1585VW = kVar;
        this.mPendingIntent = pendingIntent;
        this.f1583UQ = j;
        this.f1589Wa = j2;
        this.f1588VZ = j3;
        this.f1584UR = i;
        this.f1590Wb = list;
        this.f1592Wd = list2;
        this.f1591Wc = j4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1052o(com.google.android.gms.fitness.request.SensorRequest r17, com.google.android.gms.fitness.data.C0992k r18, android.app.PendingIntent r19) {
        /*
            r16 = this;
            r0 = r17
            com.google.android.gms.fitness.data.DataSource r1 = r17.getDataSource()
            com.google.android.gms.fitness.data.DataType r2 = r17.getDataType()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r5 = r0.getSamplingRate(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r7 = r0.getFastestRate(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r9 = r0.getMaxDeliveryLatency(r3)
            int r11 = r17.getAccuracyMode()
            java.util.List r13 = java.util.Collections.emptyList()
            long r14 = r17.mo12610kh()
            r12 = 0
            r0 = r16
            r3 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.request.C1052o.<init>(com.google.android.gms.fitness.request.SensorRequest, com.google.android.gms.fitness.data.k, android.app.PendingIntent):void");
    }

    /* renamed from: a */
    private boolean m1923a(C1052o oVar) {
        return C1781jv.equal(this.f1582TN, oVar.f1582TN) && C1781jv.equal(this.f1581TM, oVar.f1581TM) && this.f1583UQ == oVar.f1583UQ && this.f1589Wa == oVar.f1589Wa && this.f1588VZ == oVar.f1588VZ && this.f1584UR == oVar.f1584UR && C1781jv.equal(this.f1590Wb, oVar.f1590Wb);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C1052o) && m1923a((C1052o) obj);
        }
        return true;
    }

    public int getAccuracyMode() {
        return this.f1584UR;
    }

    public DataSource getDataSource() {
        return this.f1582TN;
    }

    public DataType getDataType() {
        return this.f1581TM;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1580CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1582TN, this.f1581TM, this.f1585VW, Long.valueOf(this.f1583UQ), Long.valueOf(this.f1589Wa), Long.valueOf(this.f1588VZ), Integer.valueOf(this.f1584UR), this.f1590Wb);
    }

    /* renamed from: jI */
    public long mo12804jI() {
        return this.f1583UQ;
    }

    /* renamed from: kb */
    public PendingIntent mo12805kb() {
        return this.mPendingIntent;
    }

    /* renamed from: kc */
    public long mo12806kc() {
        return this.f1589Wa;
    }

    /* renamed from: kd */
    public long mo12807kd() {
        return this.f1588VZ;
    }

    /* renamed from: ke */
    public List<LocationRequest> mo12808ke() {
        return this.f1590Wb;
    }

    /* renamed from: kf */
    public long mo12809kf() {
        return this.f1591Wc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kg */
    public IBinder mo12810kg() {
        if (this.f1585VW == null) {
            return null;
        }
        return this.f1585VW.asBinder();
    }

    public String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", new Object[]{this.f1581TM, this.f1582TN, Long.valueOf(this.f1583UQ), Long.valueOf(this.f1589Wa), Long.valueOf(this.f1588VZ)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1053p.m1931a(this, parcel, i);
    }
}
