package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;

public class Subscription implements SafeParcelable {
    public static final Parcelable.Creator<Subscription> CREATOR = new C1004s();

    /* renamed from: CK */
    private final int f1426CK;

    /* renamed from: TM */
    private final DataType f1427TM;

    /* renamed from: TN */
    private final DataSource f1428TN;

    /* renamed from: UQ */
    private final long f1429UQ;

    /* renamed from: UR */
    private final int f1430UR;

    /* renamed from: com.google.android.gms.fitness.data.Subscription$a */
    public static class C0981a {
        /* access modifiers changed from: private */

        /* renamed from: TM */
        public DataType f1431TM;
        /* access modifiers changed from: private */

        /* renamed from: TN */
        public DataSource f1432TN;
        /* access modifiers changed from: private */

        /* renamed from: UQ */
        public long f1433UQ = -1;
        /* access modifiers changed from: private */

        /* renamed from: UR */
        public int f1434UR = 2;

        /* renamed from: b */
        public C0981a mo12412b(DataSource dataSource) {
            this.f1432TN = dataSource;
            return this;
        }

        /* renamed from: b */
        public C0981a mo12413b(DataType dataType) {
            this.f1431TM = dataType;
            return this;
        }

        /* renamed from: jK */
        public Subscription mo12414jK() {
            boolean z = true;
            C1785jx.m5355a((this.f1432TN == null && this.f1431TM == null) ? false : true, "Must call setDataSource() or setDataType()");
            if (!(this.f1431TM == null || this.f1432TN == null || this.f1431TM.equals(this.f1432TN.getDataType()))) {
                z = false;
            }
            C1785jx.m5355a(z, "Specified data type is incompatible with specified data source");
            return new Subscription(this);
        }
    }

    Subscription(int i, DataSource dataSource, DataType dataType, long j, int i2) {
        this.f1426CK = i;
        this.f1428TN = dataSource;
        this.f1427TM = dataType;
        this.f1429UQ = j;
        this.f1430UR = i2;
    }

    private Subscription(C0981a aVar) {
        this.f1426CK = 1;
        this.f1427TM = aVar.f1431TM;
        this.f1428TN = aVar.f1432TN;
        this.f1429UQ = aVar.f1433UQ;
        this.f1430UR = aVar.f1434UR;
    }

    /* renamed from: a */
    private boolean m1701a(Subscription subscription) {
        return C1781jv.equal(this.f1428TN, subscription.f1428TN) && C1781jv.equal(this.f1427TM, subscription.f1427TM) && this.f1429UQ == subscription.f1429UQ && this.f1430UR == subscription.f1430UR;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Subscription) && m1701a((Subscription) obj);
        }
        return true;
    }

    public int getAccuracyMode() {
        return this.f1430UR;
    }

    public DataSource getDataSource() {
        return this.f1428TN;
    }

    public DataType getDataType() {
        return this.f1427TM;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1426CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1428TN, this.f1428TN, Long.valueOf(this.f1429UQ), Integer.valueOf(this.f1430UR));
    }

    /* renamed from: jI */
    public long mo12407jI() {
        return this.f1429UQ;
    }

    /* renamed from: jJ */
    public DataType mo12408jJ() {
        return this.f1427TM == null ? this.f1428TN.getDataType() : this.f1427TM;
    }

    public String toDebugString() {
        Object[] objArr = new Object[1];
        objArr[0] = this.f1428TN == null ? this.f1427TM.getName() : this.f1428TN.toDebugString();
        return String.format("Subscription{%s}", objArr);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("dataSource", this.f1428TN).mo15935a("dataType", this.f1427TM).mo15935a("samplingIntervalMicros", Long.valueOf(this.f1429UQ)).mo15935a("accuracyMode", Integer.valueOf(this.f1430UR)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1004s.m1768a(this, parcel, i);
    }
}
