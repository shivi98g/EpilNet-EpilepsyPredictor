package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

/* renamed from: com.google.android.gms.internal.ms */
public class C1944ms implements SafeParcelable {
    public static final Parcelable.Creator<C1944ms> CREATOR = new C1945mt();

    /* renamed from: CK */
    private final int f4125CK;

    /* renamed from: TN */
    private final DataSource f4126TN;

    C1944ms(int i, DataSource dataSource) {
        this.f4125CK = i;
        this.f4126TN = dataSource;
    }

    public int describeContents() {
        return 0;
    }

    public DataSource getDataSource() {
        return this.f4126TN;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4125CK;
    }

    public String toString() {
        return String.format("ApplicationUnregistrationRequest{%s}", new Object[]{this.f4126TN});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1945mt.m5737a(this, parcel, i);
    }
}
