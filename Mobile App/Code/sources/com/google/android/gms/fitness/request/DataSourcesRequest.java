package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1829la;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataSourcesRequest implements SafeParcelable {
    public static final Parcelable.Creator<DataSourcesRequest> CREATOR = new C1041h();

    /* renamed from: CK */
    private final int f1491CK;

    /* renamed from: TY */
    private final List<DataType> f1492TY;

    /* renamed from: VS */
    private final List<Integer> f1493VS;

    /* renamed from: VT */
    private final boolean f1494VT;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: VT */
        public boolean f1495VT = false;
        /* access modifiers changed from: private */

        /* renamed from: VU */
        public DataType[] f1496VU = new DataType[0];
        /* access modifiers changed from: private */

        /* renamed from: VV */
        public int[] f1497VV = {0, 1};

        public DataSourcesRequest build() {
            boolean z = false;
            C1785jx.m5355a(this.f1496VU.length > 0, "Must add at least one data type");
            if (this.f1497VV.length > 0) {
                z = true;
            }
            C1785jx.m5355a(z, "Must add at least one data source type");
            return new DataSourcesRequest(this);
        }

        public Builder setDataSourceTypes(int... iArr) {
            this.f1497VV = iArr;
            return this;
        }

        public Builder setDataTypes(DataType... dataTypeArr) {
            this.f1496VU = dataTypeArr;
            return this;
        }
    }

    DataSourcesRequest(int i, List<DataType> list, List<Integer> list2, boolean z) {
        this.f1491CK = i;
        this.f1492TY = list;
        this.f1493VS = list2;
        this.f1494VT = z;
    }

    private DataSourcesRequest(Builder builder) {
        this.f1491CK = 2;
        this.f1492TY = C1829la.m5515b(builder.f1496VU);
        this.f1493VS = Arrays.asList(C1829la.m5514a(builder.f1497VV));
        this.f1494VT = builder.f1495VT;
    }

    public int describeContents() {
        return 0;
    }

    public List<DataType> getDataTypes() {
        return Collections.unmodifiableList(this.f1492TY);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1491CK;
    }

    /* renamed from: jY */
    public boolean mo12582jY() {
        return this.f1494VT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jZ */
    public List<Integer> mo12583jZ() {
        return this.f1493VS;
    }

    public String toString() {
        C1781jv.C1783a a = C1781jv.m5348h(this).mo15935a("dataTypes", this.f1492TY).mo15935a("sourceTypes", this.f1493VS);
        if (this.f1494VT) {
            a.mo15935a("includeDbOnlySources", "true");
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1041h.m1906a(this, parcel, i);
    }
}
