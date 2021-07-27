package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* renamed from: com.google.android.gms.wearable.internal.aw */
public class C2751aw implements SafeParcelable {
    public static final Parcelable.Creator<C2751aw> CREATOR = new C2752ax();
    public final long ayc;
    public final List<C2742an> aye;
    public final int statusCode;
    public final int versionCode;

    C2751aw(int i, int i2, long j, List<C2742an> list) {
        this.versionCode = i;
        this.statusCode = i2;
        this.ayc = j;
        this.aye = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2752ax.m8081a(this, parcel, i);
    }
}
