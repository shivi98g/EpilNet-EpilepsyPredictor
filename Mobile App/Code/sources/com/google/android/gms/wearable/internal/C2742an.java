package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.wearable.internal.an */
public class C2742an implements SafeParcelable {
    public static final Parcelable.Creator<C2742an> CREATOR = new C2743ao();
    public final long ayc;
    public final String label;
    public final String packageName;
    public final int versionCode;

    C2742an(int i, String str, String str2, long j) {
        this.versionCode = i;
        this.packageName = str;
        this.label = str2;
        this.ayc = j;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2743ao.m8067a(this, parcel, i);
    }
}
