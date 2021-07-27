package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0724c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1895mg;

public class DataSource implements SafeParcelable {
    public static final Parcelable.Creator<DataSource> CREATOR = new C0988g();
    public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;

    /* renamed from: CK */
    private final int f1358CK;

    /* renamed from: Gt */
    private final int f1359Gt;

    /* renamed from: TM */
    private final DataType f1360TM;

    /* renamed from: Ul */
    private final Device f1361Ul;

    /* renamed from: Um */
    private final C0982a f1362Um;

    /* renamed from: Un */
    private final String f1363Un;

    /* renamed from: Uo */
    private final boolean f1364Uo;

    /* renamed from: Up */
    private final String f1365Up;
    private final String mName;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: Gt */
        public int f1366Gt = -1;
        /* access modifiers changed from: private */

        /* renamed from: TM */
        public DataType f1367TM;
        /* access modifiers changed from: private */

        /* renamed from: Ul */
        public Device f1368Ul;
        /* access modifiers changed from: private */

        /* renamed from: Um */
        public C0982a f1369Um;
        /* access modifiers changed from: private */

        /* renamed from: Un */
        public String f1370Un = "";
        /* access modifiers changed from: private */

        /* renamed from: Uo */
        public boolean f1371Uo = false;
        /* access modifiers changed from: private */
        public String mName;

        public DataSource build() {
            boolean z = false;
            C1785jx.m5355a(this.f1367TM != null, "Must set data type");
            if (this.f1366Gt >= 0) {
                z = true;
            }
            C1785jx.m5355a(z, "Must set data source type");
            return new DataSource(this);
        }

        public Builder setAppPackageName(Context context) {
            return setAppPackageName(context.getPackageName());
        }

        public Builder setAppPackageName(String str) {
            this.f1369Um = new C0982a(str, (String) null, (String) null);
            return this;
        }

        public Builder setDataType(DataType dataType) {
            this.f1367TM = dataType;
            return this;
        }

        public Builder setDevice(Device device) {
            this.f1368Ul = device;
            return this;
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }

        public Builder setObfuscated(boolean z) {
            this.f1371Uo = z;
            return this;
        }

        public Builder setStreamName(String str) {
            C1785jx.m5361b(str != null, (Object) "Must specify a valid stream name");
            this.f1370Un = str;
            return this;
        }

        public Builder setType(int i) {
            this.f1366Gt = i;
            return this;
        }
    }

    DataSource(int i, DataType dataType, String str, int i2, Device device, C0982a aVar, String str2, boolean z) {
        this.f1358CK = i;
        this.f1360TM = dataType;
        this.f1359Gt = i2;
        this.mName = str;
        this.f1361Ul = device;
        this.f1362Um = aVar;
        this.f1363Un = str2;
        this.f1364Uo = z;
        this.f1365Up = m1658jy();
    }

    private DataSource(Builder builder) {
        this.f1358CK = 3;
        this.f1360TM = builder.f1367TM;
        this.f1359Gt = builder.f1366Gt;
        this.mName = builder.mName;
        this.f1361Ul = builder.f1368Ul;
        this.f1362Um = builder.f1369Um;
        this.f1363Un = builder.f1370Un;
        this.f1364Uo = builder.f1371Uo;
        this.f1365Up = m1658jy();
    }

    /* renamed from: a */
    private boolean m1657a(DataSource dataSource) {
        return this.f1365Up.equals(dataSource.f1365Up);
    }

    public static DataSource extract(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (DataSource) C0724c.m778a(intent, EXTRA_DATA_SOURCE, CREATOR);
    }

    private String getTypeString() {
        switch (this.f1359Gt) {
            case 0:
                return "raw";
            case 1:
                return "derived";
            default:
                throw new IllegalArgumentException("invalid type value");
        }
    }

    /* renamed from: jy */
    private String m1658jy() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTypeString());
        sb.append(":");
        sb.append(this.f1360TM.getName());
        if (this.f1362Um != null) {
            sb.append(":");
            sb.append(this.f1362Um.getPackageName());
        }
        if (this.f1361Ul != null) {
            sb.append(":");
            sb.append(this.f1361Ul.getStreamIdentifier());
        }
        if (this.f1363Un != null) {
            sb.append(":");
            sb.append(this.f1363Un);
        }
        return sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DataSource) && m1657a((DataSource) obj);
        }
        return true;
    }

    public String getAppPackageName() {
        if (this.f1362Um == null) {
            return null;
        }
        return this.f1362Um.getPackageName();
    }

    public DataType getDataType() {
        return this.f1360TM;
    }

    public Device getDevice() {
        return this.f1361Ul;
    }

    public String getName() {
        return this.mName;
    }

    public String getStreamIdentifier() {
        return this.f1365Up;
    }

    public String getStreamName() {
        return this.f1363Un;
    }

    public int getType() {
        return this.f1359Gt;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1358CK;
    }

    public int hashCode() {
        return this.f1365Up.hashCode();
    }

    /* renamed from: jA */
    public DataSource mo12311jA() {
        C0982a aVar = null;
        Device jE = this.f1361Ul == null ? null : this.f1361Ul.mo12347jE();
        if (this.f1362Um != null) {
            aVar = this.f1362Um.mo12437jl();
        }
        return new DataSource(3, this.f1360TM, this.mName, this.f1359Gt, jE, aVar, C1895mg.m5643bw(this.f1363Un), this.f1364Uo);
    }

    /* renamed from: jx */
    public C0982a mo12312jx() {
        return this.f1362Um;
    }

    /* renamed from: jz */
    public boolean mo12313jz() {
        return this.f1364Uo;
    }

    public String toDebugString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1359Gt == 0 ? "r" : "d");
        sb.append(":");
        sb.append(this.f1360TM.mo12333jB());
        if (this.f1362Um == null) {
            str = "";
        } else if (this.f1362Um.equals(C0982a.f1439TT)) {
            str = ":gms";
        } else {
            str = ":" + this.f1362Um.getPackageName();
        }
        sb.append(str);
        if (this.f1361Ul != null) {
            str2 = ":" + this.f1361Ul.getModel() + ":" + this.f1361Ul.getUid();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f1363Un != null) {
            str3 = ":" + this.f1363Un;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSource{");
        sb.append(getTypeString());
        if (this.mName != null) {
            sb.append(":");
            sb.append(this.mName);
        }
        if (this.f1362Um != null) {
            sb.append(":");
            sb.append(this.f1362Um);
        }
        if (this.f1361Ul != null) {
            sb.append(":");
            sb.append(this.f1361Ul);
        }
        if (this.f1363Un != null) {
            sb.append(":");
            sb.append(this.f1363Un);
        }
        sb.append(":");
        sb.append(this.f1360TM);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0988g.m1731a(C1895mg.m5644c(this), parcel, i);
    }
}
