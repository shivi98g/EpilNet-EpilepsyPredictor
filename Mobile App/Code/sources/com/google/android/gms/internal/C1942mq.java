package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mq */
public class C1942mq implements SafeParcelable {
    public static final Parcelable.Creator<C1942mq> CREATOR = new C1943mr();

    /* renamed from: CK */
    private final int f4123CK;

    /* renamed from: TY */
    private final List<DataType> f4124TY;

    C1942mq(int i, List<DataType> list) {
        this.f4123CK = i;
        this.f4124TY = list;
    }

    public int describeContents() {
        return 0;
    }

    public List<DataType> getDataTypes() {
        return Collections.unmodifiableList(this.f4124TY);
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4123CK;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("dataTypes", this.f4124TY).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1943mr.m5734a(this, parcel, i);
    }
}
