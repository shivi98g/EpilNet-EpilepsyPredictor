package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CheckResourceIdsExistRequest implements SafeParcelable {
    public static final Parcelable.Creator<CheckResourceIdsExistRequest> CREATOR = new C0796e();

    /* renamed from: CK */
    private final int f921CK;

    /* renamed from: Po */
    private final List<String> f922Po;

    CheckResourceIdsExistRequest(int i, List<String> list) {
        this.f921CK = i;
        this.f922Po = list;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.f921CK;
    }

    /* renamed from: iF */
    public List<String> mo11380iF() {
        return this.f922Po;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0796e.m1091a(this, parcel, i);
    }
}
