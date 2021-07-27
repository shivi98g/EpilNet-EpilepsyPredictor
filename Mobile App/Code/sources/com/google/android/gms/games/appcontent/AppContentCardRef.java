package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardRef extends MultiDataBufferRef implements AppContentCard {
    AppContentCardRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 0, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentCardEntity.m2115a(this, obj);
    }

    public List<AppContentAction> getActions() {
        return AppContentUtils.m2195a(this.f790JG, this.f1768XX, "card_actions", this.f791KZ);
    }

    public String getDescription() {
        return getString("card_description");
    }

    public Uri getIconImageUri() {
        return mo11081aR("card_icon_image_uri");
    }

    public String getTitle() {
        return getString("card_title");
    }

    public String getType() {
        return getString("card_type");
    }

    public int hashCode() {
        return AppContentCardEntity.m2114a(this);
    }

    /* renamed from: kH */
    public List<AppContentCondition> mo13200kH() {
        return AppContentUtils.m2198c(this.f790JG, this.f1768XX, "card_conditions", this.f791KZ);
    }

    /* renamed from: kI */
    public String mo13201kI() {
        return getString("card_content_description");
    }

    /* renamed from: kL */
    public Uri mo13202kL() {
        return mo11081aR("card_image_uri");
    }

    /* renamed from: kN */
    public List<AppContentAnnotation> mo13203kN() {
        return AppContentUtils.m2197b(this.f790JG, this.f1768XX, "card_annotations", this.f791KZ);
    }

    /* renamed from: kO */
    public int mo13204kO() {
        return getInteger("card_current_steps");
    }

    /* renamed from: kP */
    public Bundle mo13205kP() {
        return AppContentUtils.m2199d(this.f790JG, this.f1768XX, "card_data", this.f791KZ);
    }

    /* renamed from: kQ */
    public String mo13206kQ() {
        return getString("card_subtitle");
    }

    /* renamed from: kR */
    public int mo13207kR() {
        return getInteger("card_total_steps");
    }

    /* renamed from: kS */
    public AppContentCard freeze() {
        return new AppContentCardEntity(this);
    }

    public String toString() {
        return AppContentCardEntity.m2116b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentCardEntity) freeze()).writeToParcel(parcel, i);
    }
}
