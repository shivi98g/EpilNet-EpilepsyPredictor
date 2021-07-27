package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public final class AppContentTupleEntity implements SafeParcelable, AppContentTuple {
    public static final AppContentTupleEntityCreator CREATOR = new AppContentTupleEntityCreator();

    /* renamed from: CK */
    private final int f1762CK;
    private final String mName;
    private final String mValue;

    AppContentTupleEntity(int i, String str, String str2) {
        this.f1762CK = i;
        this.mName = str;
        this.mValue = str2;
    }

    public AppContentTupleEntity(AppContentTuple appContentTuple) {
        this.f1762CK = 1;
        this.mName = appContentTuple.getName();
        this.mValue = appContentTuple.getValue();
    }

    /* renamed from: a */
    static int m2187a(AppContentTuple appContentTuple) {
        return C1781jv.hashCode(appContentTuple.getName(), appContentTuple.getValue());
    }

    /* renamed from: a */
    static boolean m2188a(AppContentTuple appContentTuple, Object obj) {
        if (!(obj instanceof AppContentTuple)) {
            return false;
        }
        if (appContentTuple == obj) {
            return true;
        }
        AppContentTuple appContentTuple2 = (AppContentTuple) obj;
        return C1781jv.equal(appContentTuple2.getName(), appContentTuple.getName()) && C1781jv.equal(appContentTuple2.getValue(), appContentTuple.getValue());
    }

    /* renamed from: b */
    static String m2189b(AppContentTuple appContentTuple) {
        return C1781jv.m5348h(appContentTuple).mo15935a("Name", appContentTuple.getName()).mo15935a("Value", appContentTuple.getValue()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2188a(this, obj);
    }

    public String getName() {
        return this.mName;
    }

    public String getValue() {
        return this.mValue;
    }

    public int getVersionCode() {
        return this.f1762CK;
    }

    public int hashCode() {
        return m2187a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: ld */
    public AppContentTuple freeze() {
        return this;
    }

    public String toString() {
        return m2189b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppContentTupleEntityCreator.m2191a(this, parcel, i);
    }
}
