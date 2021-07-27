package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionEntity implements SafeParcelable, AppContentSection {
    public static final AppContentSectionEntityCreator CREATOR = new AppContentSectionEntityCreator();

    /* renamed from: CK */
    private final int f1753CK;

    /* renamed from: OH */
    private final String f1754OH;

    /* renamed from: XK */
    private final String f1755XK;

    /* renamed from: XQ */
    private final Bundle f1756XQ;

    /* renamed from: XR */
    private final String f1757XR;

    /* renamed from: XY */
    private final Uri f1758XY;

    /* renamed from: XZ */
    private final ArrayList<AppContentCardEntity> f1759XZ;
    private final ArrayList<AppContentActionEntity> mActions;

    /* renamed from: vc */
    private final String f1760vc;

    AppContentSectionEntity(int i, ArrayList<AppContentActionEntity> arrayList, Uri uri, ArrayList<AppContentCardEntity> arrayList2, String str, Bundle bundle, String str2, String str3, String str4) {
        this.f1753CK = i;
        this.mActions = arrayList;
        this.f1758XY = uri;
        this.f1759XZ = arrayList2;
        this.f1755XK = str;
        this.f1756XQ = bundle;
        this.f1757XR = str2;
        this.f1754OH = str3;
        this.f1760vc = str4;
    }

    public AppContentSectionEntity(AppContentSection appContentSection) {
        this.f1753CK = 1;
        this.f1758XY = appContentSection.mo13248kY();
        this.f1755XK = appContentSection.mo13245kI();
        this.f1756XQ = appContentSection.mo13246kP();
        this.f1757XR = appContentSection.mo13247kQ();
        this.f1754OH = appContentSection.getTitle();
        this.f1760vc = appContentSection.getType();
        List<AppContentAction> actions = appContentSection.getActions();
        int size = actions.size();
        this.mActions = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.mActions.add((AppContentActionEntity) actions.get(i).freeze());
        }
        List<AppContentCard> kZ = appContentSection.mo13249kZ();
        int size2 = kZ.size();
        this.f1759XZ = new ArrayList<>(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.f1759XZ.add((AppContentCardEntity) kZ.get(i2).freeze());
        }
    }

    /* renamed from: a */
    static int m2167a(AppContentSection appContentSection) {
        return C1781jv.hashCode(appContentSection.getActions(), appContentSection.mo13248kY(), appContentSection.mo13249kZ(), appContentSection.mo13245kI(), appContentSection.mo13246kP(), appContentSection.mo13247kQ(), appContentSection.getTitle(), appContentSection.getType());
    }

    /* renamed from: a */
    static boolean m2168a(AppContentSection appContentSection, Object obj) {
        if (!(obj instanceof AppContentSection)) {
            return false;
        }
        if (appContentSection == obj) {
            return true;
        }
        AppContentSection appContentSection2 = (AppContentSection) obj;
        return C1781jv.equal(appContentSection2.getActions(), appContentSection.getActions()) && C1781jv.equal(appContentSection2.mo13248kY(), appContentSection.mo13248kY()) && C1781jv.equal(appContentSection2.mo13249kZ(), appContentSection.mo13249kZ()) && C1781jv.equal(appContentSection2.mo13245kI(), appContentSection.mo13245kI()) && C1781jv.equal(appContentSection2.mo13246kP(), appContentSection.mo13246kP()) && C1781jv.equal(appContentSection2.mo13247kQ(), appContentSection.mo13247kQ()) && C1781jv.equal(appContentSection2.getTitle(), appContentSection.getTitle()) && C1781jv.equal(appContentSection2.getType(), appContentSection.getType());
    }

    /* renamed from: b */
    static String m2169b(AppContentSection appContentSection) {
        return C1781jv.m5348h(appContentSection).mo15935a("Actions", appContentSection.getActions()).mo15935a("BackgroundImageUri", appContentSection.mo13248kY()).mo15935a("Cards", appContentSection.mo13249kZ()).mo15935a("ContentDescription", appContentSection.mo13245kI()).mo15935a("ExtraData", appContentSection.mo13246kP()).mo15935a("Subtitle", appContentSection.mo13247kQ()).mo15935a("Title", appContentSection.getTitle()).mo15935a("Type", appContentSection.getType()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2168a(this, obj);
    }

    public List<AppContentAction> getActions() {
        return new ArrayList(this.mActions);
    }

    public String getTitle() {
        return this.f1754OH;
    }

    public String getType() {
        return this.f1760vc;
    }

    public int getVersionCode() {
        return this.f1753CK;
    }

    public int hashCode() {
        return m2167a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: kI */
    public String mo13245kI() {
        return this.f1755XK;
    }

    /* renamed from: kP */
    public Bundle mo13246kP() {
        return this.f1756XQ;
    }

    /* renamed from: kQ */
    public String mo13247kQ() {
        return this.f1757XR;
    }

    /* renamed from: kY */
    public Uri mo13248kY() {
        return this.f1758XY;
    }

    /* renamed from: kZ */
    public List<AppContentCard> mo13249kZ() {
        return new ArrayList(this.f1759XZ);
    }

    /* renamed from: la */
    public AppContentSection freeze() {
        return this;
    }

    public String toString() {
        return m2169b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppContentSectionEntityCreator.m2176a(this, parcel, i);
    }
}
