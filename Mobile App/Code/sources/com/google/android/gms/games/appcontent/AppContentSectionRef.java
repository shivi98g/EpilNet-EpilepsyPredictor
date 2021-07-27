package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentSectionRef extends MultiDataBufferRef implements AppContentSection {

    /* renamed from: Ya */
    private final int f1761Ya;

    AppContentSectionRef(ArrayList<DataHolder> arrayList, int i, int i2) {
        super(arrayList, 0, i);
        this.f1761Ya = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentSectionEntity.m2168a(this, obj);
    }

    public String getTitle() {
        return getString("section_title");
    }

    public String getType() {
        return getString("section_type");
    }

    public int hashCode() {
        return AppContentSectionEntity.m2167a(this);
    }

    /* renamed from: kI */
    public String mo13245kI() {
        return getString("section_content_description");
    }

    /* renamed from: kP */
    public Bundle mo13246kP() {
        return AppContentUtils.m2199d(this.f790JG, this.f1768XX, "section_data", this.f791KZ);
    }

    /* renamed from: kQ */
    public String mo13247kQ() {
        return getString("section_subtitle");
    }

    /* renamed from: kY */
    public Uri mo13248kY() {
        return mo11081aR("section_background_image_uri");
    }

    /* renamed from: la */
    public AppContentSection freeze() {
        return new AppContentSectionEntity(this);
    }

    /* renamed from: lb */
    public ArrayList<AppContentAction> getActions() {
        return AppContentUtils.m2195a(this.f790JG, this.f1768XX, "section_actions", this.f791KZ);
    }

    /* renamed from: lc */
    public ArrayList<AppContentCard> mo13249kZ() {
        ArrayList<AppContentCard> arrayList = new ArrayList<>(this.f1761Ya);
        for (int i = 0; i < this.f1761Ya; i++) {
            arrayList.add(new AppContentCardRef(this.f1768XX, this.f791KZ + i));
        }
        return arrayList;
    }

    public String toString() {
        return AppContentSectionEntity.m2169b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentSectionEntity) freeze()).writeToParcel(parcel, i);
    }
}
