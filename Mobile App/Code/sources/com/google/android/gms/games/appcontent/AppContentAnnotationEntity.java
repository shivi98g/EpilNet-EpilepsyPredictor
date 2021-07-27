package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

public final class AppContentAnnotationEntity implements SafeParcelable, AppContentAnnotation {
    public static final AppContentAnnotationEntityCreator CREATOR = new AppContentAnnotationEntityCreator();

    /* renamed from: CK */
    private final int f1729CK;

    /* renamed from: OH */
    private final String f1730OH;

    /* renamed from: UO */
    private final String f1731UO;

    /* renamed from: XN */
    private final Uri f1732XN;

    /* renamed from: vc */
    private final String f1733vc;

    AppContentAnnotationEntity(int i, String str, Uri uri, String str2, String str3) {
        this.f1729CK = i;
        this.f1731UO = str;
        this.f1732XN = uri;
        this.f1730OH = str2;
        this.f1733vc = str3;
    }

    public AppContentAnnotationEntity(AppContentAnnotation appContentAnnotation) {
        this.f1729CK = 1;
        this.f1731UO = appContentAnnotation.getDescription();
        this.f1732XN = appContentAnnotation.mo13179kL();
        this.f1730OH = appContentAnnotation.getTitle();
        this.f1733vc = appContentAnnotation.getType();
    }

    /* renamed from: a */
    static int m2096a(AppContentAnnotation appContentAnnotation) {
        return C1781jv.hashCode(appContentAnnotation.getDescription(), appContentAnnotation.mo13179kL(), appContentAnnotation.getTitle(), appContentAnnotation.getType());
    }

    /* renamed from: a */
    static boolean m2097a(AppContentAnnotation appContentAnnotation, Object obj) {
        if (!(obj instanceof AppContentAnnotation)) {
            return false;
        }
        if (appContentAnnotation == obj) {
            return true;
        }
        AppContentAnnotation appContentAnnotation2 = (AppContentAnnotation) obj;
        return C1781jv.equal(appContentAnnotation2.getDescription(), appContentAnnotation.getDescription()) && C1781jv.equal(appContentAnnotation2.mo13179kL(), appContentAnnotation.mo13179kL()) && C1781jv.equal(appContentAnnotation2.getTitle(), appContentAnnotation.getTitle()) && C1781jv.equal(appContentAnnotation2.getType(), appContentAnnotation.getType());
    }

    /* renamed from: b */
    static String m2098b(AppContentAnnotation appContentAnnotation) {
        return C1781jv.m5348h(appContentAnnotation).mo15935a("Description", appContentAnnotation.getDescription()).mo15935a("ImageUri", appContentAnnotation.mo13179kL()).mo15935a("Title", appContentAnnotation.getTitle()).mo15935a("Type", appContentAnnotation.getType()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2097a(this, obj);
    }

    public String getDescription() {
        return this.f1731UO;
    }

    public String getTitle() {
        return this.f1730OH;
    }

    public String getType() {
        return this.f1733vc;
    }

    public int getVersionCode() {
        return this.f1729CK;
    }

    public int hashCode() {
        return m2096a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: kL */
    public Uri mo13179kL() {
        return this.f1732XN;
    }

    /* renamed from: kM */
    public AppContentAnnotation freeze() {
        return this;
    }

    public String toString() {
        return m2098b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppContentAnnotationEntityCreator.m2101a(this, parcel, i);
    }
}
