package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.fitness.request.j */
public class C1043j implements SafeParcelable {
    public static final Parcelable.Creator<C1043j> CREATOR = new C1044k();

    /* renamed from: CK */
    private final int f1575CK;
    private final String mName;

    C1043j(int i, String str) {
        this.f1575CK = i;
        this.mName = str;
    }

    public C1043j(String str) {
        this.f1575CK = 1;
        this.mName = str;
    }

    /* renamed from: a */
    private boolean m1912a(C1043j jVar) {
        return C1781jv.equal(this.mName, jVar.mName);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1043j) && m1912a((C1043j) obj);
        }
        return true;
    }

    public String getName() {
        return this.mName;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1575CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.mName);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("name", this.mName).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1044k.m1913a(this, parcel, i);
    }
}
