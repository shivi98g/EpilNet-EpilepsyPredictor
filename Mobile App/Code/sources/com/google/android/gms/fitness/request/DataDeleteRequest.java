package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest implements SafeParcelable {
    public static final Parcelable.Creator<DataDeleteRequest> CREATOR = new C1035d();

    /* renamed from: CK */
    private final int f1451CK;

    /* renamed from: LW */
    private final long f1452LW;

    /* renamed from: TO */
    private final long f1453TO;

    /* renamed from: TY */
    private final List<DataType> f1454TY;

    /* renamed from: VH */
    private final List<DataSource> f1455VH;

    /* renamed from: VI */
    private final List<Session> f1456VI;

    /* renamed from: VJ */
    private final boolean f1457VJ;

    /* renamed from: VK */
    private final boolean f1458VK;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: LW */
        public long f1459LW;
        /* access modifiers changed from: private */

        /* renamed from: TO */
        public long f1460TO;
        /* access modifiers changed from: private */

        /* renamed from: TY */
        public List<DataType> f1461TY = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: VH */
        public List<DataSource> f1462VH = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: VI */
        public List<Session> f1463VI = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: VJ */
        public boolean f1464VJ = false;
        /* access modifiers changed from: private */

        /* renamed from: VK */
        public boolean f1465VK = false;

        /* renamed from: jT */
        private void m1787jT() {
            if (!this.f1463VI.isEmpty()) {
                for (Session next : this.f1463VI) {
                    C1785jx.m5356a(next.getStartTime(TimeUnit.MILLISECONDS) >= this.f1459LW && next.getEndTime(TimeUnit.MILLISECONDS) <= this.f1460TO, "Session %s is outside the time interval [%d, %d]", next, Long.valueOf(this.f1459LW), Long.valueOf(this.f1460TO));
                }
            }
        }

        public Builder addDataSource(DataSource dataSource) {
            boolean z = true;
            C1785jx.m5361b(!this.f1464VJ, (Object) "All data is already marked for deletion");
            if (dataSource == null) {
                z = false;
            }
            C1785jx.m5361b(z, (Object) "Must specify a valid data source");
            if (!this.f1462VH.contains(dataSource)) {
                this.f1462VH.add(dataSource);
            }
            return this;
        }

        public Builder addDataType(DataType dataType) {
            boolean z = true;
            C1785jx.m5361b(!this.f1464VJ, (Object) "All data is already marked for deletion");
            if (dataType == null) {
                z = false;
            }
            C1785jx.m5361b(z, (Object) "Must specify a valid data type");
            if (!this.f1461TY.contains(dataType)) {
                this.f1461TY.add(dataType);
            }
            return this;
        }

        public Builder addSession(Session session) {
            C1785jx.m5361b(!this.f1465VK, (Object) "All sessions already marked for deletion");
            boolean z = false;
            C1785jx.m5361b(session != null, (Object) "Must specify a valid session");
            if (session.getEndTime(TimeUnit.MILLISECONDS) > 0) {
                z = true;
            }
            C1785jx.m5361b(z, (Object) "Must specify a session that has already ended");
            this.f1463VI.add(session);
            return this;
        }

        public DataDeleteRequest build() {
            boolean z = false;
            C1785jx.m5355a(this.f1459LW > 0 && this.f1460TO > this.f1459LW, "Must specify a valid time interval");
            boolean z2 = this.f1464VJ || !this.f1462VH.isEmpty() || !this.f1461TY.isEmpty();
            boolean z3 = this.f1465VK || !this.f1463VI.isEmpty();
            if (z2 || z3) {
                z = true;
            }
            C1785jx.m5355a(z, "No data or session marked for deletion");
            m1787jT();
            return new DataDeleteRequest(this);
        }

        public Builder deleteAllData() {
            C1785jx.m5362b(this.f1461TY.isEmpty() && this.f1462VH.isEmpty(), "Specific data source/type already specified for deletion. DataSources: %s DataTypes: %s", this.f1462VH, this.f1461TY);
            this.f1464VJ = true;
            return this;
        }

        public Builder deleteAllSessions() {
            C1785jx.m5362b(this.f1463VI.isEmpty(), "Specific sessions already added for deletion: %s", this.f1463VI);
            this.f1465VK = true;
            return this;
        }

        public Builder setTimeInterval(long j, long j2, TimeUnit timeUnit) {
            C1785jx.m5362b(j > 0, "Invalid start time :%d", Long.valueOf(j));
            C1785jx.m5362b(j2 > j, "Invalid end time :%d", Long.valueOf(j2));
            this.f1459LW = timeUnit.toMillis(j);
            this.f1460TO = timeUnit.toMillis(j2);
            return this;
        }
    }

    DataDeleteRequest(int i, long j, long j2, List<DataSource> list, List<DataType> list2, List<Session> list3, boolean z, boolean z2) {
        this.f1451CK = i;
        this.f1452LW = j;
        this.f1453TO = j2;
        this.f1455VH = Collections.unmodifiableList(list);
        this.f1454TY = Collections.unmodifiableList(list2);
        this.f1456VI = list3;
        this.f1457VJ = z;
        this.f1458VK = z2;
    }

    private DataDeleteRequest(Builder builder) {
        this.f1451CK = 1;
        this.f1452LW = builder.f1459LW;
        this.f1453TO = builder.f1460TO;
        this.f1455VH = Collections.unmodifiableList(builder.f1462VH);
        this.f1454TY = Collections.unmodifiableList(builder.f1461TY);
        this.f1456VI = Collections.unmodifiableList(builder.f1463VI);
        this.f1457VJ = builder.f1464VJ;
        this.f1458VK = builder.f1465VK;
    }

    /* renamed from: a */
    private boolean m1775a(DataDeleteRequest dataDeleteRequest) {
        return this.f1452LW == dataDeleteRequest.f1452LW && this.f1453TO == dataDeleteRequest.f1453TO && C1781jv.equal(this.f1455VH, dataDeleteRequest.f1455VH) && C1781jv.equal(this.f1454TY, dataDeleteRequest.f1454TY) && C1781jv.equal(this.f1456VI, dataDeleteRequest.f1456VI) && this.f1457VJ == dataDeleteRequest.f1457VJ && this.f1458VK == dataDeleteRequest.f1458VK;
    }

    public boolean deleteAllData() {
        return this.f1457VJ;
    }

    public boolean deleteAllSessions() {
        return this.f1458VK;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataDeleteRequest) && m1775a((DataDeleteRequest) obj);
        }
        return true;
    }

    public List<DataSource> getDataSources() {
        return this.f1455VH;
    }

    public List<DataType> getDataTypes() {
        return this.f1454TY;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1453TO, TimeUnit.MILLISECONDS);
    }

    public List<Session> getSessions() {
        return this.f1456VI;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1452LW, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1451CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(Long.valueOf(this.f1452LW), Long.valueOf(this.f1453TO));
    }

    /* renamed from: jR */
    public boolean mo12531jR() {
        return this.f1457VJ;
    }

    /* renamed from: jS */
    public boolean mo12532jS() {
        return this.f1458VK;
    }

    /* renamed from: jo */
    public long mo12533jo() {
        return this.f1452LW;
    }

    /* renamed from: jp */
    public long mo12534jp() {
        return this.f1453TO;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("startTimeMillis", Long.valueOf(this.f1452LW)).mo15935a("endTimeMillis", Long.valueOf(this.f1453TO)).mo15935a("dataSources", this.f1455VH).mo15935a("dateTypes", this.f1454TY).mo15935a("sessions", this.f1456VI).mo15935a("deleteAllData", Boolean.valueOf(this.f1457VJ)).mo15935a("deleteAllSessions", Boolean.valueOf(this.f1458VK)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1035d.m1892a(this, parcel, i);
    }
}
