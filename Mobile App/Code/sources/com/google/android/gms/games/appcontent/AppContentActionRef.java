package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionRef extends MultiDataBufferRef implements AppContentAction {
    AppContentActionRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 1, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentActionEntity.m2082a(this, obj);
    }

    public Bundle getExtras() {
        return AppContentUtils.m2199d(this.f790JG, this.f1768XX, "action_data", this.f791KZ);
    }

    public String getLabel() {
        return getString("action_label");
    }

    public String getType() {
        return getString("action_type");
    }

    public int hashCode() {
        return AppContentActionEntity.m2081a(this);
    }

    /* renamed from: kH */
    public List<AppContentCondition> mo13158kH() {
        return AppContentUtils.m2198c(this.f790JG, this.f1768XX, "action_conditions", this.f791KZ);
    }

    /* renamed from: kI */
    public String mo13159kI() {
        return getString("action_content_description");
    }

    /* renamed from: kJ */
    public String mo13160kJ() {
        return getString("action_label_style");
    }

    /* renamed from: kK */
    public AppContentAction freeze() {
        return new AppContentActionEntity(this);
    }

    public String toString() {
        return AppContentActionEntity.m2083b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentActionEntity) freeze()).writeToParcel(parcel, i);
    }
}
