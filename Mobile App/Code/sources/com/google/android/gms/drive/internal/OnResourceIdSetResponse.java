package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class OnResourceIdSetResponse implements SafeParcelable {
    public static final Parcelable.Creator<OnResourceIdSetResponse> CREATOR = new C0779av();

    /* renamed from: CK */
    private final int f995CK;

    /* renamed from: Po */
    private final List<String> f996Po;

    OnResourceIdSetResponse(int i, List<String> list) {
        this.f995CK = i;
        this.f996Po = list;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f995CK;
    }

    /* renamed from: iF */
    public List<String> mo11439iF() {
        return this.f996Po;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0779av.m1032a(this, parcel, i);
    }
}
