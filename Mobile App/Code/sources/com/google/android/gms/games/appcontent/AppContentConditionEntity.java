package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public final class AppContentConditionEntity implements SafeParcelable, AppContentCondition {
    public static final AppContentConditionEntityCreator CREATOR = new AppContentConditionEntityCreator();

    /* renamed from: CK */
    private final int f1747CK;

    /* renamed from: XT */
    private final String f1748XT;

    /* renamed from: XU */
    private final String f1749XU;

    /* renamed from: XV */
    private final String f1750XV;

    /* renamed from: XW */
    private final Bundle f1751XW;

    AppContentConditionEntity(int i, String str, String str2, String str3, Bundle bundle) {
        this.f1747CK = i;
        this.f1748XT = str;
        this.f1749XU = str2;
        this.f1750XV = str3;
        this.f1751XW = bundle;
    }

    public AppContentConditionEntity(AppContentCondition appContentCondition) {
        this.f1747CK = 1;
        this.f1748XT = appContentCondition.mo13223kT();
        this.f1749XU = appContentCondition.mo13223kT();
        this.f1750XV = appContentCondition.mo13225kV();
        this.f1751XW = appContentCondition.mo13226kW();
    }

    /* renamed from: a */
    static int m2142a(AppContentCondition appContentCondition) {
        return C1781jv.hashCode(appContentCondition.mo13223kT(), appContentCondition.mo13224kU(), appContentCondition.mo13225kV(), appContentCondition.mo13226kW());
    }

    /* renamed from: a */
    static boolean m2143a(AppContentCondition appContentCondition, Object obj) {
        if (!(obj instanceof AppContentCondition)) {
            return false;
        }
        if (appContentCondition == obj) {
            return true;
        }
        AppContentCondition appContentCondition2 = (AppContentCondition) obj;
        return C1781jv.equal(appContentCondition2.mo13223kT(), appContentCondition.mo13223kT()) && C1781jv.equal(appContentCondition2.mo13224kU(), appContentCondition.mo13224kU()) && C1781jv.equal(appContentCondition2.mo13225kV(), appContentCondition.mo13225kV()) && C1781jv.equal(appContentCondition2.mo13226kW(), appContentCondition.mo13226kW());
    }

    /* renamed from: b */
    static String m2144b(AppContentCondition appContentCondition) {
        return C1781jv.m5348h(appContentCondition).mo15935a("DefaultValue", appContentCondition.mo13223kT()).mo15935a("ExpectedValue", appContentCondition.mo13224kU()).mo15935a("Predicate", appContentCondition.mo13225kV()).mo15935a("PredicateParameters", appContentCondition.mo13226kW()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2143a(this, obj);
    }

    public int getVersionCode() {
        return this.f1747CK;
    }

    public int hashCode() {
        return m2142a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: kT */
    public String mo13223kT() {
        return this.f1748XT;
    }

    /* renamed from: kU */
    public String mo13224kU() {
        return this.f1749XU;
    }

    /* renamed from: kV */
    public String mo13225kV() {
        return this.f1750XV;
    }

    /* renamed from: kW */
    public Bundle mo13226kW() {
        return this.f1751XW;
    }

    /* renamed from: kX */
    public AppContentCondition freeze() {
        return this;
    }

    public String toString() {
        return m2144b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppContentConditionEntityCreator.m2150a(this, parcel, i);
    }
}
