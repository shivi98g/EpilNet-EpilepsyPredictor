package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest implements SafeParcelable {
    public static final Parcelable.Creator<SessionReadRequest> CREATOR = new C1057t();

    /* renamed from: CK */
    private final int f1525CK;

    /* renamed from: LW */
    private final long f1526LW;

    /* renamed from: TO */
    private final long f1527TO;

    /* renamed from: TY */
    private final List<DataType> f1528TY;

    /* renamed from: VH */
    private final List<DataSource> f1529VH;

    /* renamed from: VR */
    private final boolean f1530VR;

    /* renamed from: Wj */
    private final String f1531Wj;

    /* renamed from: Wk */
    private boolean f1532Wk;

    /* renamed from: Wl */
    private final List<String> f1533Wl;

    /* renamed from: vZ */
    private final String f1534vZ;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: LW */
        public long f1535LW = 0;
        /* access modifiers changed from: private */

        /* renamed from: TO */
        public long f1536TO = 0;
        /* access modifiers changed from: private */

        /* renamed from: TY */
        public List<DataType> f1537TY = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: VH */
        public List<DataSource> f1538VH = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: VR */
        public boolean f1539VR = false;
        /* access modifiers changed from: private */

        /* renamed from: Wj */
        public String f1540Wj;
        /* access modifiers changed from: private */

        /* renamed from: Wk */
        public boolean f1541Wk = false;
        /* access modifiers changed from: private */

        /* renamed from: Wl */
        public List<String> f1542Wl = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: vZ */
        public String f1543vZ;

        public SessionReadRequest build() {
            C1785jx.m5362b(this.f1535LW > 0, "Invalid start time: %s", Long.valueOf(this.f1535LW));
            C1785jx.m5362b(this.f1536TO > 0 && this.f1536TO > this.f1535LW, "Invalid end time: %s", Long.valueOf(this.f1536TO));
            return new SessionReadRequest(this);
        }

        public Builder enableServerQueries() {
            this.f1539VR = true;
            return this;
        }

        public Builder excludePackage(String str) {
            C1785jx.m5359b(str, (Object) "Attempting to use a null package name");
            if (!this.f1542Wl.contains(str)) {
                this.f1542Wl.add(str);
            }
            return this;
        }

        public Builder read(DataSource dataSource) {
            C1785jx.m5359b(dataSource, (Object) "Attempting to add a null data source");
            if (!this.f1538VH.contains(dataSource)) {
                this.f1538VH.add(dataSource);
            }
            return this;
        }

        public Builder read(DataType dataType) {
            C1785jx.m5359b(dataType, (Object) "Attempting to use a null data type");
            if (!this.f1537TY.contains(dataType)) {
                this.f1537TY.add(dataType);
            }
            return this;
        }

        public Builder readSessionsFromAllApps() {
            this.f1541Wk = true;
            return this;
        }

        public Builder setSessionId(String str) {
            this.f1543vZ = str;
            return this;
        }

        public Builder setSessionName(String str) {
            this.f1540Wj = str;
            return this;
        }

        public Builder setTimeInterval(long j, long j2, TimeUnit timeUnit) {
            this.f1535LW = timeUnit.toMillis(j);
            this.f1536TO = timeUnit.toMillis(j2);
            return this;
        }
    }

    SessionReadRequest(int i, String str, String str2, long j, long j2, List<DataType> list, List<DataSource> list2, boolean z, boolean z2, List<String> list3) {
        this.f1525CK = i;
        this.f1531Wj = str;
        this.f1534vZ = str2;
        this.f1526LW = j;
        this.f1527TO = j2;
        this.f1528TY = Collections.unmodifiableList(list);
        this.f1529VH = Collections.unmodifiableList(list2);
        this.f1532Wk = z;
        this.f1530VR = z2;
        this.f1533Wl = list3;
    }

    private SessionReadRequest(Builder builder) {
        this.f1525CK = 3;
        this.f1531Wj = builder.f1540Wj;
        this.f1534vZ = builder.f1543vZ;
        this.f1526LW = builder.f1535LW;
        this.f1527TO = builder.f1536TO;
        this.f1528TY = Collections.unmodifiableList(builder.f1537TY);
        this.f1529VH = Collections.unmodifiableList(builder.f1538VH);
        this.f1532Wk = builder.f1541Wk;
        this.f1530VR = builder.f1539VR;
        this.f1533Wl = Collections.unmodifiableList(builder.f1542Wl);
    }

    /* renamed from: a */
    private boolean m1833a(SessionReadRequest sessionReadRequest) {
        return C1781jv.equal(this.f1531Wj, sessionReadRequest.f1531Wj) && this.f1534vZ.equals(sessionReadRequest.f1534vZ) && this.f1526LW == sessionReadRequest.f1526LW && this.f1527TO == sessionReadRequest.f1527TO && C1781jv.equal(this.f1528TY, sessionReadRequest.f1528TY) && C1781jv.equal(this.f1529VH, sessionReadRequest.f1529VH) && this.f1532Wk == sessionReadRequest.f1532Wk && this.f1533Wl.equals(sessionReadRequest.f1533Wl) && this.f1530VR == sessionReadRequest.f1530VR;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SessionReadRequest) && m1833a((SessionReadRequest) obj);
        }
        return true;
    }

    public List<DataSource> getDataSources() {
        return this.f1529VH;
    }

    public List<DataType> getDataTypes() {
        return this.f1528TY;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1527TO, TimeUnit.MILLISECONDS);
    }

    public List<String> getExcludedPackages() {
        return this.f1533Wl;
    }

    public String getSessionId() {
        return this.f1534vZ;
    }

    public String getSessionName() {
        return this.f1531Wj;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1526LW, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1525CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1531Wj, this.f1534vZ, Long.valueOf(this.f1526LW), Long.valueOf(this.f1527TO));
    }

    public boolean includeSessionsFromAllApps() {
        return this.f1532Wk;
    }

    /* renamed from: jV */
    public boolean mo12645jV() {
        return this.f1530VR;
    }

    /* renamed from: jo */
    public long mo12646jo() {
        return this.f1526LW;
    }

    /* renamed from: jp */
    public long mo12647jp() {
        return this.f1527TO;
    }

    /* renamed from: kj */
    public boolean mo12648kj() {
        return this.f1532Wk;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("sessionName", this.f1531Wj).mo15935a("sessionId", this.f1534vZ).mo15935a("startTimeMillis", Long.valueOf(this.f1526LW)).mo15935a("endTimeMillis", Long.valueOf(this.f1527TO)).mo15935a("dataTypes", this.f1528TY).mo15935a("dataSources", this.f1529VH).mo15935a("sessionsFromAllApps", Boolean.valueOf(this.f1532Wk)).mo15935a("excludedPackages", this.f1533Wl).mo15935a("useServer", Boolean.valueOf(this.f1530VR)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1057t.m1942a(this, parcel, i);
    }
}
