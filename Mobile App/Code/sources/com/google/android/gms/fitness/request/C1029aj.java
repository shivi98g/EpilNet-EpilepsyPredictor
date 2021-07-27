package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.fitness.request.aj */
public class C1029aj implements SafeParcelable {
    public static final Parcelable.Creator<C1029aj> CREATOR = new C1032ak();

    /* renamed from: CK */
    private final int f1564CK;

    /* renamed from: TM */
    private final DataType f1565TM;

    /* renamed from: TN */
    private final DataSource f1566TN;

    /* renamed from: com.google.android.gms.fitness.request.aj$a */
    public static class C1031a {
        /* access modifiers changed from: private */

        /* renamed from: TM */
        public DataType f1567TM;
        /* access modifiers changed from: private */

        /* renamed from: TN */
        public DataSource f1568TN;

        /* renamed from: d */
        public C1031a mo12727d(DataSource dataSource) {
            this.f1568TN = dataSource;
            return this;
        }

        /* renamed from: d */
        public C1031a mo12728d(DataType dataType) {
            this.f1567TM = dataType;
            return this;
        }

        /* renamed from: kq */
        public C1029aj mo12729kq() {
            if (this.f1567TM == null || this.f1568TN == null) {
                return new C1029aj(this);
            }
            throw new IllegalArgumentException("Cannot specify both dataType and dataSource");
        }
    }

    C1029aj(int i, DataType dataType, DataSource dataSource) {
        this.f1564CK = i;
        this.f1565TM = dataType;
        this.f1566TN = dataSource;
    }

    private C1029aj(C1031a aVar) {
        this.f1564CK = 1;
        this.f1565TM = aVar.f1567TM;
        this.f1566TN = aVar.f1568TN;
    }

    /* renamed from: a */
    private boolean m1879a(C1029aj ajVar) {
        return C1781jv.equal(this.f1566TN, ajVar.f1566TN) && C1781jv.equal(this.f1565TM, ajVar.f1565TM);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C1029aj) && m1879a((C1029aj) obj);
        }
        return true;
    }

    public DataSource getDataSource() {
        return this.f1566TN;
    }

    public DataType getDataType() {
        return this.f1565TM;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1564CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1566TN, this.f1565TM);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1032ak.m1885a(this, parcel, i);
    }
}
