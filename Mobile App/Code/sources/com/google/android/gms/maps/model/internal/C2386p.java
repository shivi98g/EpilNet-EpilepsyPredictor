package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.maps.model.internal.p */
public final class C2386p implements SafeParcelable {
    public static final C2387q CREATOR = new C2387q();

    /* renamed from: CK */
    private final int f4365CK;
    private C2353a amN;

    public C2386p() {
        this.f4365CK = 1;
    }

    C2386p(int i, C2353a aVar) {
        this.f4365CK = i;
        this.amN = aVar;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4365CK;
    }

    /* renamed from: ol */
    public C2353a mo18311ol() {
        return this.amN;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2387q.m6904a(this, parcel, i);
    }
}
