package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionEntity implements SafeParcelable, AppContentAction {
    public static final AppContentActionEntityCreator CREATOR = new AppContentActionEntityCreator();

    /* renamed from: CK */
    private final int f1723CK;

    /* renamed from: XJ */
    private final ArrayList<AppContentConditionEntity> f1724XJ;

    /* renamed from: XK */
    private final String f1725XK;

    /* renamed from: XL */
    private final String f1726XL;

    /* renamed from: XM */
    private final String f1727XM;
    private final Bundle mExtras;

    /* renamed from: vc */
    private final String f1728vc;

    AppContentActionEntity(int i, ArrayList<AppContentConditionEntity> arrayList, String str, Bundle bundle, String str2, String str3, String str4) {
        this.f1723CK = i;
        this.f1724XJ = arrayList;
        this.f1725XK = str;
        this.mExtras = bundle;
        this.f1726XL = str2;
        this.f1727XM = str3;
        this.f1728vc = str4;
    }

    public AppContentActionEntity(AppContentAction appContentAction) {
        this.f1723CK = 1;
        this.f1725XK = appContentAction.mo13159kI();
        this.mExtras = appContentAction.getExtras();
        this.f1726XL = appContentAction.getLabel();
        this.f1727XM = appContentAction.mo13160kJ();
        this.f1728vc = appContentAction.getType();
        List<AppContentCondition> kH = appContentAction.mo13158kH();
        int size = kH.size();
        this.f1724XJ = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f1724XJ.add((AppContentConditionEntity) kH.get(i).freeze());
        }
    }

    /* renamed from: a */
    static int m2081a(AppContentAction appContentAction) {
        return C1781jv.hashCode(appContentAction.mo13158kH(), appContentAction.mo13159kI(), appContentAction.getExtras(), appContentAction.getLabel(), appContentAction.mo13160kJ(), appContentAction.getType());
    }

    /* renamed from: a */
    static boolean m2082a(AppContentAction appContentAction, Object obj) {
        if (!(obj instanceof AppContentAction)) {
            return false;
        }
        if (appContentAction == obj) {
            return true;
        }
        AppContentAction appContentAction2 = (AppContentAction) obj;
        return C1781jv.equal(appContentAction2.mo13158kH(), appContentAction.mo13158kH()) && C1781jv.equal(appContentAction2.mo13159kI(), appContentAction.mo13159kI()) && C1781jv.equal(appContentAction2.getExtras(), appContentAction.getExtras()) && C1781jv.equal(appContentAction2.getLabel(), appContentAction.getLabel()) && C1781jv.equal(appContentAction2.mo13160kJ(), appContentAction.mo13160kJ()) && C1781jv.equal(appContentAction2.getType(), appContentAction.getType());
    }

    /* renamed from: b */
    static String m2083b(AppContentAction appContentAction) {
        return C1781jv.m5348h(appContentAction).mo15935a("Conditions", appContentAction.mo13158kH()).mo15935a("ContentDescription", appContentAction.mo13159kI()).mo15935a("Extras", appContentAction.getExtras()).mo15935a("Label", appContentAction.getLabel()).mo15935a("LabelStyle", appContentAction.mo13160kJ()).mo15935a("Type", appContentAction.getType()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2082a(this, obj);
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getLabel() {
        return this.f1726XL;
    }

    public String getType() {
        return this.f1728vc;
    }

    public int getVersionCode() {
        return this.f1723CK;
    }

    public int hashCode() {
        return m2081a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: kH */
    public List<AppContentCondition> mo13158kH() {
        return new ArrayList(this.f1724XJ);
    }

    /* renamed from: kI */
    public String mo13159kI() {
        return this.f1725XK;
    }

    /* renamed from: kJ */
    public String mo13160kJ() {
        return this.f1727XM;
    }

    /* renamed from: kK */
    public AppContentAction freeze() {
        return this;
    }

    public String toString() {
        return m2083b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppContentActionEntityCreator.m2088a(this, parcel, i);
    }
}
