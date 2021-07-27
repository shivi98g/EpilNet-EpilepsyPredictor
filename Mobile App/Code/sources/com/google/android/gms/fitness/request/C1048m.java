package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;

/* renamed from: com.google.android.gms.fitness.request.m */
public class C1048m implements SafeParcelable {
    public static final Parcelable.Creator<C1048m> CREATOR = new C1051n();

    /* renamed from: CK */
    private final int f1577CK;

    /* renamed from: TM */
    private final DataType f1578TM;

    /* renamed from: com.google.android.gms.fitness.request.m$a */
    public static class C1050a {
        /* access modifiers changed from: private */

        /* renamed from: TM */
        public DataType f1579TM;

        /* renamed from: c */
        public C1050a mo12791c(DataType dataType) {
            this.f1579TM = dataType;
            return this;
        }

        /* renamed from: ka */
        public C1048m mo12792ka() {
            return new C1048m(this);
        }
    }

    C1048m(int i, DataType dataType) {
        this.f1577CK = i;
        this.f1578TM = dataType;
    }

    private C1048m(C1050a aVar) {
        this.f1577CK = 1;
        this.f1578TM = aVar.f1579TM;
    }

    public int describeContents() {
        return 0;
    }

    public DataType getDataType() {
        return this.f1578TM;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1577CK;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1051n.m1920a(this, parcel, i);
    }
}
