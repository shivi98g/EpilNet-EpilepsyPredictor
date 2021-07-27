package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SortOrder implements SafeParcelable {
    public static final Parcelable.Creator<SortOrder> CREATOR = new C0887b();

    /* renamed from: CK */
    final int f1165CK;

    /* renamed from: Sf */
    final List<FieldWithSortOrder> f1166Sf;

    /* renamed from: Sg */
    final boolean f1167Sg;

    public static class Builder {

        /* renamed from: Sf */
        private final List<FieldWithSortOrder> f1168Sf = new ArrayList();

        /* renamed from: Sg */
        private boolean f1169Sg = false;

        public Builder addSortAscending(SortableMetadataField sortableMetadataField) {
            this.f1168Sf.add(new FieldWithSortOrder(sortableMetadataField.getName(), true));
            return this;
        }

        public Builder addSortDescending(SortableMetadataField sortableMetadataField) {
            this.f1168Sf.add(new FieldWithSortOrder(sortableMetadataField.getName(), false));
            return this;
        }

        public SortOrder build() {
            return new SortOrder((List) this.f1168Sf, this.f1169Sg);
        }
    }

    SortOrder(int i, List<FieldWithSortOrder> list, boolean z) {
        this.f1165CK = i;
        this.f1166Sf = list;
        this.f1167Sg = z;
    }

    private SortOrder(List<FieldWithSortOrder> list, boolean z) {
        this(1, list, z);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[]{TextUtils.join(",", this.f1166Sf), Boolean.valueOf(this.f1167Sg)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0887b.m1332a(this, parcel, i);
    }
}
