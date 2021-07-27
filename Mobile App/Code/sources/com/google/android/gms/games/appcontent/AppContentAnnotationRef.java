package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentAnnotationRef extends MultiDataBufferRef implements AppContentAnnotation {
    AppContentAnnotationRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 2, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return AppContentAnnotationEntity.m2097a(this, obj);
    }

    public String getDescription() {
        return getString("annotation_description");
    }

    public String getTitle() {
        return getString("annotation_title");
    }

    public String getType() {
        return getString("annotation_type");
    }

    public int hashCode() {
        return AppContentAnnotationEntity.m2096a(this);
    }

    /* renamed from: kL */
    public Uri mo13179kL() {
        return mo11081aR("annotation_image_uri");
    }

    /* renamed from: kM */
    public AppContentAnnotation freeze() {
        return new AppContentAnnotationEntity(this);
    }

    public String toString() {
        return AppContentAnnotationEntity.m2098b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentAnnotationEntity) freeze()).writeToParcel(parcel, i);
    }
}
