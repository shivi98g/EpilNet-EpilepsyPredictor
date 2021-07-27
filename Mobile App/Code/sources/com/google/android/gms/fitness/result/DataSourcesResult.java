package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSourcesResult implements Result, SafeParcelable {
    public static final Parcelable.Creator<DataSourcesResult> CREATOR = new C1070c();

    /* renamed from: CK */
    private final int f1612CK;

    /* renamed from: Eb */
    private final Status f1613Eb;

    /* renamed from: VH */
    private final List<DataSource> f1614VH;

    DataSourcesResult(int i, List<DataSource> list, Status status) {
        this.f1612CK = i;
        this.f1614VH = Collections.unmodifiableList(list);
        this.f1613Eb = status;
    }

    public DataSourcesResult(List<DataSource> list, Status status) {
        this.f1612CK = 3;
        this.f1614VH = Collections.unmodifiableList(list);
        this.f1613Eb = status;
    }

    /* renamed from: D */
    public static DataSourcesResult m1978D(Status status) {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    /* renamed from: b */
    private boolean m1979b(DataSourcesResult dataSourcesResult) {
        return this.f1613Eb.equals(dataSourcesResult.f1613Eb) && C1781jv.equal(this.f1614VH, dataSourcesResult.f1614VH);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DataSourcesResult) && m1979b((DataSourcesResult) obj);
        }
        return true;
    }

    public List<DataSource> getDataSources() {
        return this.f1614VH;
    }

    public List<DataSource> getDataSources(DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (DataSource next : this.f1614VH) {
            if (next.getDataType().equals(dataType)) {
                arrayList.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Status getStatus() {
        return this.f1613Eb;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1612CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1613Eb, this.f1614VH);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a(NotificationCompat.CATEGORY_STATUS, this.f1613Eb).mo15935a("dataSets", this.f1614VH).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1070c.m1995a(this, parcel, i);
    }
}
