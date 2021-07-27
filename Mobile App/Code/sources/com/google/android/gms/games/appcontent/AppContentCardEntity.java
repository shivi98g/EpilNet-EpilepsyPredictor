package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardEntity implements SafeParcelable, AppContentCard {
    public static final AppContentCardEntityCreator CREATOR = new AppContentCardEntityCreator();

    /* renamed from: CK */
    private final int f1734CK;

    /* renamed from: OH */
    private final String f1735OH;

    /* renamed from: UO */
    private final String f1736UO;

    /* renamed from: WD */
    private final Uri f1737WD;

    /* renamed from: XJ */
    private final ArrayList<AppContentConditionEntity> f1738XJ;

    /* renamed from: XK */
    private final String f1739XK;

    /* renamed from: XN */
    private final Uri f1740XN;

    /* renamed from: XO */
    private final ArrayList<AppContentAnnotationEntity> f1741XO;

    /* renamed from: XP */
    private final int f1742XP;

    /* renamed from: XQ */
    private final Bundle f1743XQ;

    /* renamed from: XR */
    private final String f1744XR;

    /* renamed from: XS */
    private final int f1745XS;
    private final ArrayList<AppContentActionEntity> mActions;

    /* renamed from: vc */
    private final String f1746vc;

    AppContentCardEntity(int i, ArrayList<AppContentActionEntity> arrayList, ArrayList<AppContentAnnotationEntity> arrayList2, ArrayList<AppContentConditionEntity> arrayList3, String str, int i2, String str2, Bundle bundle, Uri uri, Uri uri2, String str3, String str4, int i3, String str5) {
        this.f1734CK = i;
        this.mActions = arrayList;
        this.f1741XO = arrayList2;
        this.f1738XJ = arrayList3;
        this.f1739XK = str;
        this.f1742XP = i2;
        this.f1736UO = str2;
        this.f1743XQ = bundle;
        this.f1737WD = uri;
        this.f1740XN = uri2;
        this.f1744XR = str3;
        this.f1735OH = str4;
        this.f1745XS = i3;
        this.f1746vc = str5;
    }

    public AppContentCardEntity(AppContentCard appContentCard) {
        this.f1734CK = 1;
        this.f1739XK = appContentCard.mo13201kI();
        this.f1742XP = appContentCard.mo13204kO();
        this.f1736UO = appContentCard.getDescription();
        this.f1743XQ = appContentCard.mo13205kP();
        this.f1737WD = appContentCard.getIconImageUri();
        this.f1740XN = appContentCard.mo13202kL();
        this.f1735OH = appContentCard.getTitle();
        this.f1744XR = appContentCard.mo13206kQ();
        this.f1745XS = appContentCard.mo13207kR();
        this.f1746vc = appContentCard.getType();
        List<AppContentAction> actions = appContentCard.getActions();
        int size = actions.size();
        this.mActions = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.mActions.add((AppContentActionEntity) actions.get(i).freeze());
        }
        List<AppContentAnnotation> kN = appContentCard.mo13203kN();
        int size2 = kN.size();
        this.f1741XO = new ArrayList<>(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.f1741XO.add((AppContentAnnotationEntity) kN.get(i2).freeze());
        }
        List<AppContentCondition> kH = appContentCard.mo13200kH();
        int size3 = kH.size();
        this.f1738XJ = new ArrayList<>(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            this.f1738XJ.add((AppContentConditionEntity) kH.get(i3).freeze());
        }
    }

    /* renamed from: a */
    static int m2114a(AppContentCard appContentCard) {
        return C1781jv.hashCode(appContentCard.getActions(), appContentCard.mo13203kN(), appContentCard.mo13200kH(), appContentCard.mo13201kI(), Integer.valueOf(appContentCard.mo13204kO()), appContentCard.getDescription(), appContentCard.mo13205kP(), appContentCard.getIconImageUri(), appContentCard.mo13202kL(), appContentCard.mo13206kQ(), appContentCard.getTitle(), Integer.valueOf(appContentCard.mo13207kR()), appContentCard.getType());
    }

    /* renamed from: a */
    static boolean m2115a(AppContentCard appContentCard, Object obj) {
        if (!(obj instanceof AppContentCard)) {
            return false;
        }
        if (appContentCard == obj) {
            return true;
        }
        AppContentCard appContentCard2 = (AppContentCard) obj;
        return C1781jv.equal(appContentCard2.getActions(), appContentCard.getActions()) && C1781jv.equal(appContentCard2.mo13203kN(), appContentCard.mo13203kN()) && C1781jv.equal(appContentCard2.mo13200kH(), appContentCard.mo13200kH()) && C1781jv.equal(appContentCard2.mo13201kI(), appContentCard.mo13201kI()) && C1781jv.equal(Integer.valueOf(appContentCard2.mo13204kO()), Integer.valueOf(appContentCard.mo13204kO())) && C1781jv.equal(appContentCard2.getDescription(), appContentCard.getDescription()) && C1781jv.equal(appContentCard2.mo13205kP(), appContentCard.mo13205kP()) && C1781jv.equal(appContentCard2.getIconImageUri(), appContentCard.getIconImageUri()) && C1781jv.equal(appContentCard2.mo13202kL(), appContentCard.mo13202kL()) && C1781jv.equal(appContentCard2.mo13206kQ(), appContentCard.mo13206kQ()) && C1781jv.equal(appContentCard2.getTitle(), appContentCard.getTitle()) && C1781jv.equal(Integer.valueOf(appContentCard2.mo13207kR()), Integer.valueOf(appContentCard.mo13207kR())) && C1781jv.equal(appContentCard2.getType(), appContentCard.getType());
    }

    /* renamed from: b */
    static String m2116b(AppContentCard appContentCard) {
        return C1781jv.m5348h(appContentCard).mo15935a("Actions", appContentCard.getActions()).mo15935a("Annotations", appContentCard.mo13203kN()).mo15935a("Conditions", appContentCard.mo13200kH()).mo15935a("ContentDescription", appContentCard.mo13201kI()).mo15935a("CurrentSteps", Integer.valueOf(appContentCard.mo13204kO())).mo15935a("Description", appContentCard.getDescription()).mo15935a("ExtraData", appContentCard.mo13205kP()).mo15935a("IconImageUri", appContentCard.getIconImageUri()).mo15935a("ImageUri", appContentCard.mo13202kL()).mo15935a("Subtitle", appContentCard.mo13206kQ()).mo15935a("Title", appContentCard.getTitle()).mo15935a("TotalSteps", Integer.valueOf(appContentCard.mo13207kR())).mo15935a("Type", appContentCard.getType()).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m2115a(this, obj);
    }

    public List<AppContentAction> getActions() {
        return new ArrayList(this.mActions);
    }

    public String getDescription() {
        return this.f1736UO;
    }

    public Uri getIconImageUri() {
        return this.f1737WD;
    }

    public String getTitle() {
        return this.f1735OH;
    }

    public String getType() {
        return this.f1746vc;
    }

    public int getVersionCode() {
        return this.f1734CK;
    }

    public int hashCode() {
        return m2114a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: kH */
    public List<AppContentCondition> mo13200kH() {
        return new ArrayList(this.f1738XJ);
    }

    /* renamed from: kI */
    public String mo13201kI() {
        return this.f1739XK;
    }

    /* renamed from: kL */
    public Uri mo13202kL() {
        return this.f1740XN;
    }

    /* renamed from: kN */
    public List<AppContentAnnotation> mo13203kN() {
        return new ArrayList(this.f1741XO);
    }

    /* renamed from: kO */
    public int mo13204kO() {
        return this.f1742XP;
    }

    /* renamed from: kP */
    public Bundle mo13205kP() {
        return this.f1743XQ;
    }

    /* renamed from: kQ */
    public String mo13206kQ() {
        return this.f1744XR;
    }

    /* renamed from: kR */
    public int mo13207kR() {
        return this.f1745XS;
    }

    /* renamed from: kS */
    public AppContentCard freeze() {
        return this;
    }

    public String toString() {
        return m2116b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppContentCardEntityCreator.m2126a(this, parcel, i);
    }
}
