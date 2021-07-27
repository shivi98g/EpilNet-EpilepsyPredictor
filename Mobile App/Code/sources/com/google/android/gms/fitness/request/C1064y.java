package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;

/* renamed from: com.google.android.gms.fitness.request.y */
public class C1064y implements SafeParcelable {
    public static final Parcelable.Creator<C1064y> CREATOR = new C1067z();

    /* renamed from: CK */
    private final int f1599CK;

    /* renamed from: UN */
    private final String f1600UN;
    private final String mName;

    /* renamed from: com.google.android.gms.fitness.request.y$a */
    public static class C1066a {
        /* access modifiers changed from: private */

        /* renamed from: UN */
        public String f1601UN;
        /* access modifiers changed from: private */
        public String mName;

        /* renamed from: bx */
        public C1066a mo12867bx(String str) {
            this.mName = str;
            return this;
        }

        /* renamed from: by */
        public C1066a mo12868by(String str) {
            this.f1601UN = str;
            return this;
        }

        /* renamed from: kl */
        public C1064y mo12869kl() {
            return new C1064y(this);
        }
    }

    C1064y(int i, String str, String str2) {
        this.f1599CK = i;
        this.mName = str;
        this.f1600UN = str2;
    }

    private C1064y(C1066a aVar) {
        this.f1599CK = 1;
        this.mName = aVar.mName;
        this.f1600UN = aVar.f1601UN;
    }

    /* renamed from: a */
    private boolean m1957a(C1064y yVar) {
        return C1781jv.equal(this.mName, yVar.mName) && C1781jv.equal(this.f1600UN, yVar.f1600UN);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1064y) && m1957a((C1064y) obj);
        }
        return true;
    }

    public String getIdentifier() {
        return this.f1600UN;
    }

    public String getName() {
        return this.mName;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1599CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.mName, this.f1600UN);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("name", this.mName).mo15935a("identifier", this.f1600UN).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1067z.m1963a(this, parcel, i);
    }
}
