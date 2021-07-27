package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1895mg;

/* renamed from: com.google.android.gms.fitness.data.a */
public final class C0982a implements SafeParcelable {
    public static final Parcelable.Creator<C0982a> CREATOR = new C0983b();

    /* renamed from: TT */
    public static final C0982a f1439TT = new C0982a(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, String.valueOf(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE), (String) null);

    /* renamed from: CK */
    private final int f1440CK;

    /* renamed from: CS */
    private final String f1441CS;

    /* renamed from: TU */
    private final String f1442TU;

    /* renamed from: TV */
    private final String f1443TV;

    C0982a(int i, String str, String str2, String str3) {
        this.f1440CK = i;
        this.f1441CS = (String) C1785jx.m5364i(str);
        this.f1442TU = "";
        this.f1443TV = str3;
    }

    public C0982a(String str, String str2, String str3) {
        this(1, str, "", str3);
    }

    /* renamed from: a */
    private boolean m1713a(C0982a aVar) {
        return this.f1441CS.equals(aVar.f1441CS) && C1781jv.equal(this.f1442TU, aVar.f1442TU) && C1781jv.equal(this.f1443TV, aVar.f1443TV);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0982a) && m1713a((C0982a) obj);
        }
        return true;
    }

    public String getPackageName() {
        return this.f1441CS;
    }

    public String getVersion() {
        return this.f1442TU;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1440CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1441CS, this.f1442TU, this.f1443TV);
    }

    /* renamed from: jk */
    public String mo12436jk() {
        return this.f1443TV;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jl */
    public C0982a mo12437jl() {
        return new C0982a(C1895mg.m5643bw(this.f1441CS), C1895mg.m5643bw(this.f1442TU), C1895mg.m5643bw(this.f1443TV));
    }

    public String toString() {
        return String.format("Application{%s:%s:%s}", new Object[]{this.f1441CS, this.f1442TU, this.f1443TV});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0983b.m1716a(this, parcel, i);
    }
}
