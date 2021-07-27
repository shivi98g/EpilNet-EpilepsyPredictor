package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import java.util.List;

public final class RawDataSet implements SafeParcelable {
    public static final Parcelable.Creator<RawDataSet> CREATOR = new C1000o();

    /* renamed from: CK */
    final int f1408CK;

    /* renamed from: UJ */
    final int f1409UJ;

    /* renamed from: UL */
    final int f1410UL;

    /* renamed from: UM */
    final List<RawDataPoint> f1411UM;

    /* renamed from: Uc */
    final boolean f1412Uc;

    RawDataSet(int i, int i2, int i3, List<RawDataPoint> list, boolean z) {
        this.f1408CK = i;
        this.f1409UJ = i2;
        this.f1410UL = i3;
        this.f1411UM = list;
        this.f1412Uc = z;
    }

    public RawDataSet(DataSet dataSet, List<DataSource> list, List<DataType> list2) {
        this.f1408CK = 2;
        this.f1411UM = dataSet.mo12289f(list);
        this.f1412Uc = dataSet.mo12295jn();
        this.f1409UJ = C1005t.m1771a(dataSet.getDataSource(), list);
        this.f1410UL = C1005t.m1771a(dataSet.getDataType(), list2);
    }

    /* renamed from: a */
    private boolean m1687a(RawDataSet rawDataSet) {
        return this.f1409UJ == rawDataSet.f1409UJ && this.f1410UL == rawDataSet.f1410UL && this.f1412Uc == rawDataSet.f1412Uc && C1781jv.equal(this.f1411UM, rawDataSet.f1411UM);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RawDataSet) && m1687a((RawDataSet) obj);
        }
        return true;
    }

    public int hashCode() {
        return C1781jv.hashCode(Integer.valueOf(this.f1409UJ), Integer.valueOf(this.f1410UL));
    }

    public String toString() {
        return String.format("RawDataSet{%s@[%s, %s]}", new Object[]{Integer.valueOf(this.f1409UJ), Integer.valueOf(this.f1410UL), this.f1411UM});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1000o.m1757a(this, parcel, i);
    }
}
