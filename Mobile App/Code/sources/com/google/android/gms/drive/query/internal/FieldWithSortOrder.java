package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class FieldWithSortOrder implements SafeParcelable {
    public static final C0891c CREATOR = new C0891c();

    /* renamed from: CK */
    final int f1177CK;

    /* renamed from: QY */
    final String f1178QY;

    /* renamed from: Sk */
    final boolean f1179Sk;

    FieldWithSortOrder(int i, String str, boolean z) {
        this.f1177CK = i;
        this.f1178QY = str;
        this.f1179Sk = z;
    }

    public FieldWithSortOrder(String str, boolean z) {
        this(1, str, z);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = this.f1178QY;
        objArr[1] = this.f1179Sk ? "ASC" : "DESC";
        return String.format(locale, "FieldWithSortOrder[%s %s]", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0891c.m1362a(this, parcel, i);
    }
}
