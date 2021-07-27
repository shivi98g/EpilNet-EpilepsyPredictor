package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.fitness.request.e */
public class C1036e implements SafeParcelable {
    public static final Parcelable.Creator<C1036e> CREATOR = new C1039f();

    /* renamed from: CK */
    private final int f1572CK;

    /* renamed from: UP */
    private final DataSet f1573UP;

    /* renamed from: com.google.android.gms.fitness.request.e$a */
    public static class C1038a {
        /* access modifiers changed from: private */

        /* renamed from: UP */
        public DataSet f1574UP;

        /* renamed from: b */
        public C1038a mo12755b(DataSet dataSet) {
            this.f1574UP = dataSet;
            return this;
        }

        /* renamed from: jU */
        public C1036e mo12756jU() {
            boolean z = false;
            C1785jx.m5355a(this.f1574UP != null, "Must set the data set");
            C1785jx.m5355a(!this.f1574UP.getDataPoints().isEmpty(), "Cannot use an empty data set");
            if (this.f1574UP.getDataSource().mo12312jx() != null) {
                z = true;
            }
            C1785jx.m5355a(z, "Must set the app package name for the data source");
            return new C1036e(this);
        }
    }

    C1036e(int i, DataSet dataSet) {
        this.f1572CK = i;
        this.f1573UP = dataSet;
    }

    private C1036e(C1038a aVar) {
        this.f1572CK = 1;
        this.f1573UP = aVar.f1574UP;
    }

    /* renamed from: a */
    private boolean m1895a(C1036e eVar) {
        return C1781jv.equal(this.f1573UP, eVar.f1573UP);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1036e) && m1895a((C1036e) obj);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1572CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.f1573UP);
    }

    /* renamed from: jH */
    public DataSet mo12752jH() {
        return this.f1573UP;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("dataSet", this.f1573UP).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1039f.m1900a(this, parcel, i);
    }
}
