package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.hf */
public class C1637hf implements SafeParcelable {
    public static final C1638hg CREATOR = new C1638hg();

    /* renamed from: CK */
    final int f3620CK;

    /* renamed from: CS */
    final String f3621CS;

    /* renamed from: CT */
    final String f3622CT;

    /* renamed from: CU */
    final String f3623CU;

    C1637hf(int i, String str, String str2, String str3) {
        this.f3620CK = i;
        this.f3621CS = str;
        this.f3622CT = str2;
        this.f3623CU = str3;
    }

    public C1637hf(String str, String str2, String str3) {
        this(1, str, str2, str3);
    }

    public int describeContents() {
        C1638hg hgVar = CREATOR;
        return 0;
    }

    public String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[]{this.f3621CS, this.f3622CT, this.f3623CU});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1638hg hgVar = CREATOR;
        C1638hg.m4797a(this, parcel, i);
    }
}
