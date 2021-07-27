package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.C0705d;
import com.google.android.gms.common.data.DataHolder;

public final class AppContentTupleRef extends C0705d implements AppContentTuple {
    AppContentTupleRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentTupleEntity.m2188a(this, obj);
    }

    public String getName() {
        return getString("tuple_name");
    }

    public String getValue() {
        return getString("tuple_value");
    }

    public int hashCode() {
        return AppContentTupleEntity.m2187a(this);
    }

    /* renamed from: ld */
    public AppContentTuple freeze() {
        return new AppContentTupleEntity(this);
    }

    public String toString() {
        return AppContentTupleEntity.m2189b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentTupleEntity) freeze()).writeToParcel(parcel, i);
    }
}
