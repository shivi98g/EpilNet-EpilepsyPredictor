package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.C0992k;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.internal.C1781jv;
import java.util.concurrent.TimeUnit;

public class FitnessSensorServiceRequest implements SafeParcelable {
    public static final Parcelable.Creator<FitnessSensorServiceRequest> CREATOR = new C1077a();
    public static final int UNSPECIFIED = -1;

    /* renamed from: CK */
    private final int f1630CK;

    /* renamed from: TN */
    private final DataSource f1631TN;

    /* renamed from: VW */
    private final C0992k f1632VW;

    /* renamed from: Wy */
    private final long f1633Wy;

    /* renamed from: Wz */
    private final long f1634Wz;

    FitnessSensorServiceRequest(int i, DataSource dataSource, IBinder iBinder, long j, long j2) {
        this.f1630CK = i;
        this.f1631TN = dataSource;
        this.f1632VW = C0992k.C0993a.m1744aq(iBinder);
        this.f1633Wy = j;
        this.f1634Wz = j2;
    }

    /* renamed from: a */
    private boolean m2014a(FitnessSensorServiceRequest fitnessSensorServiceRequest) {
        return C1781jv.equal(this.f1631TN, fitnessSensorServiceRequest.f1631TN) && this.f1633Wy == fitnessSensorServiceRequest.f1633Wy && this.f1634Wz == fitnessSensorServiceRequest.f1634Wz;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FitnessSensorServiceRequest) && m2014a((FitnessSensorServiceRequest) obj);
        }
        return true;
    }

    public long getBatchInterval(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1634Wz, TimeUnit.MICROSECONDS);
    }

    public DataSource getDataSource() {
        return this.f1631TN;
    }

    public SensorEventDispatcher getDispatcher() {
        return new C1078b(this.f1632VW);
    }

    public long getSamplingRate(TimeUnit timeUnit) {
        if (this.f1633Wy == -1) {
            return -1;
        }
        return timeUnit.convert(this.f1633Wy, TimeUnit.MICROSECONDS);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1630CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1631TN, Long.valueOf(this.f1633Wy), Long.valueOf(this.f1634Wz));
    }

    /* renamed from: jI */
    public long mo12982jI() {
        return this.f1633Wy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kg */
    public IBinder mo12983kg() {
        return this.f1632VW.asBinder();
    }

    /* renamed from: kx */
    public long mo12984kx() {
        return this.f1634Wz;
    }

    public String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", new Object[]{this.f1631TN});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1077a.m2018a(this, parcel, i);
    }
}
