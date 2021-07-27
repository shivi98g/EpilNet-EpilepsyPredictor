package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentConditionRef extends MultiDataBufferRef implements AppContentCondition {
    AppContentConditionRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 4, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentConditionEntity.m2143a(this, obj);
    }

    public int hashCode() {
        return AppContentConditionEntity.m2142a(this);
    }

    /* renamed from: kT */
    public String mo13223kT() {
        return getString("condition_default_value");
    }

    /* renamed from: kU */
    public String mo13224kU() {
        return getString("condition_expected_value");
    }

    /* renamed from: kV */
    public String mo13225kV() {
        return getString("condition_predicate");
    }

    /* renamed from: kW */
    public Bundle mo13226kW() {
        return AppContentUtils.m2199d(this.f790JG, this.f1768XX, "condition_predicate_parameters", this.f791KZ);
    }

    /* renamed from: kX */
    public AppContentCondition freeze() {
        return new AppContentConditionEntity(this);
    }

    public String toString() {
        return AppContentConditionEntity.m2144b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentConditionEntity) freeze()).writeToParcel(parcel, i);
    }
}
