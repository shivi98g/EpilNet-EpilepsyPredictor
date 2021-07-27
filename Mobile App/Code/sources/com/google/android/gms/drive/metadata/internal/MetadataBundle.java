package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.C0702a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.C0849w;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1842ln;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class MetadataBundle implements SafeParcelable {
    public static final Parcelable.Creator<MetadataBundle> CREATOR = new C0879h();

    /* renamed from: CK */
    final int f1151CK;

    /* renamed from: Ri */
    final Bundle f1152Ri;

    MetadataBundle(int i, Bundle bundle) {
        this.f1151CK = i;
        this.f1152Ri = (Bundle) C1785jx.m5364i(bundle);
        this.f1152Ri.setClassLoader(getClass().getClassLoader());
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : this.f1152Ri.keySet()) {
            if (C0876e.m1278bm(str) == null) {
                arrayList.add(str);
                C0849w.m1208o("MetadataBundle", "Ignored unknown metadata field in bundle: " + str);
            }
        }
        for (String remove : arrayList) {
            this.f1152Ri.remove(remove);
        }
    }

    private MetadataBundle(Bundle bundle) {
        this(1, bundle);
    }

    /* renamed from: a */
    public static <T> MetadataBundle m1253a(MetadataField<T> metadataField, T t) {
        MetadataBundle iZ = m1255iZ();
        iZ.mo11779b(metadataField, t);
        return iZ;
    }

    /* renamed from: a */
    public static MetadataBundle m1254a(MetadataBundle metadataBundle) {
        return new MetadataBundle(new Bundle(metadataBundle.f1152Ri));
    }

    /* renamed from: iZ */
    public static MetadataBundle m1255iZ() {
        return new MetadataBundle(new Bundle());
    }

    /* renamed from: a */
    public <T> T mo11778a(MetadataField<T> metadataField) {
        return metadataField.mo11757h(this.f1152Ri);
    }

    /* renamed from: b */
    public <T> void mo11779b(MetadataField<T> metadataField, T t) {
        if (C0876e.m1278bm(metadataField.getName()) == null) {
            throw new IllegalArgumentException("Unregistered field: " + metadataField.getName());
        }
        metadataField.mo11755a(t, this.f1152Ri);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataBundle)) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> keySet = this.f1152Ri.keySet();
        if (!keySet.equals(metadataBundle.f1152Ri.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!C1781jv.equal(this.f1152Ri.get(str), metadataBundle.f1152Ri.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (String str : this.f1152Ri.keySet()) {
            i = (i * 31) + this.f1152Ri.get(str).hashCode();
        }
        return i;
    }

    /* renamed from: ja */
    public Set<MetadataField<?>> mo11783ja() {
        HashSet hashSet = new HashSet();
        for (String bm : this.f1152Ri.keySet()) {
            hashSet.add(C0876e.m1278bm(bm));
        }
        return hashSet;
    }

    public void setContext(Context context) {
        C0702a aVar = (C0702a) mo11778a(C1842ln.f4015RI);
        if (aVar != null) {
            aVar.mo11068a(context.getCacheDir());
        }
    }

    public String toString() {
        return "MetadataBundle [values=" + this.f1152Ri + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0879h.m1292a(this, parcel, i);
    }
}
