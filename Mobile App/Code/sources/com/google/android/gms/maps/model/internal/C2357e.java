package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.maps.model.internal.e */
public final class C2357e implements SafeParcelable {
    public static final C2358f CREATOR = new C2358f();

    /* renamed from: CK */
    private final int f4355CK;
    private C2353a amM;

    public C2357e() {
        this.f4355CK = 1;
    }

    C2357e(int i, C2353a aVar) {
        this.f4355CK = i;
        this.amM = aVar;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f4355CK;
    }

    /* renamed from: oj */
    public C2353a mo18168oj() {
        return this.amM;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2358f.m6853a(this, parcel, i);
    }
}
