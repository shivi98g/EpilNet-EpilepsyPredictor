package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataTypeCreateRequest implements SafeParcelable {
    public static final Parcelable.Creator<DataTypeCreateRequest> CREATOR = new C1042i();

    /* renamed from: CK */
    private final int f1498CK;

    /* renamed from: Uv */
    private final List<Field> f1499Uv;
    private final String mName;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: Uv */
        public List<Field> f1500Uv = new ArrayList();
        /* access modifiers changed from: private */
        public String mName;

        public Builder addField(Field field) {
            if (!this.f1500Uv.contains(field)) {
                this.f1500Uv.add(field);
            }
            return this;
        }

        public Builder addField(String str, int i) {
            C1785jx.m5361b(str != null || !str.isEmpty(), (Object) "Invalid name specified");
            return addField(new Field(str, i));
        }

        public DataTypeCreateRequest build() {
            C1785jx.m5355a(this.mName != null, "Must set the name");
            C1785jx.m5355a(!this.f1500Uv.isEmpty(), "Must specify the data fields");
            return new DataTypeCreateRequest(this);
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }
    }

    DataTypeCreateRequest(int i, String str, List<Field> list) {
        this.f1498CK = i;
        this.mName = str;
        this.f1499Uv = Collections.unmodifiableList(list);
    }

    private DataTypeCreateRequest(Builder builder) {
        this.f1498CK = 1;
        this.mName = builder.mName;
        this.f1499Uv = Collections.unmodifiableList(builder.f1500Uv);
    }

    /* renamed from: a */
    private boolean m1811a(DataTypeCreateRequest dataTypeCreateRequest) {
        return C1781jv.equal(this.mName, dataTypeCreateRequest.mName) && C1781jv.equal(this.f1499Uv, dataTypeCreateRequest.f1499Uv);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataTypeCreateRequest) && m1811a((DataTypeCreateRequest) obj);
        }
        return true;
    }

    public List<Field> getFields() {
        return this.f1499Uv;
    }

    public String getName() {
        return this.mName;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f1498CK;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.mName, this.f1499Uv);
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("name", this.mName).mo15935a("fields", this.f1499Uv).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1042i.m1909a(this, parcel, i);
    }
}
