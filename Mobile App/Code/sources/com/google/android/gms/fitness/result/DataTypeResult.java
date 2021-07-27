package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.C1781jv;

public class DataTypeResult implements Result, SafeParcelable {
    public static final Parcelable.Creator<DataTypeResult> CREATOR = new C1071d();

    /* renamed from: CK */
    private final int f1615CK;

    /* renamed from: Eb */
    private final Status f1616Eb;

    /* renamed from: TM */
    private final DataType f1617TM;

    DataTypeResult(int i, Status status, DataType dataType) {
        this.f1615CK = i;
        this.f1616Eb = status;
        this.f1617TM = dataType;
    }

    public DataTypeResult(Status status, DataType dataType) {
        this.f1615CK = 2;
        this.f1616Eb = status;
        this.f1617TM = dataType;
    }

    /* renamed from: E */
    public static DataTypeResult m1980E(Status status) {
        return new DataTypeResult(status, (DataType) null);
    }

    /* renamed from: b */
    private boolean m1981b(DataTypeResult dataTypeResult) {
        return this.f1616Eb.equals(dataTypeResult.f1616Eb) && C1781jv.equal(this.f1617TM, dataTypeResult.f1617TM);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DataTypeResult) && m1981b((DataTypeResult) obj);
        }
        return true;
    }

    public DataType getDataType() {
        return this.f1617TM;
    }

    public Status getStatus() {
        return this.f1616Eb;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1615CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1616Eb, this.f1617TM);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a(NotificationCompat.CATEGORY_STATUS, this.f1616Eb).mo15935a("dataType", this.f1617TM).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1071d.m1998a(this, parcel, i);
    }
}
