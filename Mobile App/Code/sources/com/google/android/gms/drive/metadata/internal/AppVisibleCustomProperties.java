package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppVisibleCustomProperties implements SafeParcelable, Iterable<CustomProperty> {
    public static final Parcelable.Creator<AppVisibleCustomProperties> CREATOR = new C0872a();

    /* renamed from: Rd */
    public static final AppVisibleCustomProperties f1145Rd = new C0871a().mo11773iW();

    /* renamed from: CK */
    final int f1146CK;

    /* renamed from: Re */
    final List<CustomProperty> f1147Re;

    /* renamed from: com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$a */
    public static class C0871a {

        /* renamed from: Rf */
        private final Map<CustomPropertyKey, CustomProperty> f1148Rf = new HashMap();

        /* renamed from: a */
        public C0871a mo11772a(CustomPropertyKey customPropertyKey, String str) {
            C1785jx.m5359b(customPropertyKey, (Object) "key");
            this.f1148Rf.put(customPropertyKey, new CustomProperty(customPropertyKey, str));
            return this;
        }

        /* renamed from: iW */
        public AppVisibleCustomProperties mo11773iW() {
            return new AppVisibleCustomProperties((Collection) this.f1148Rf.values());
        }
    }

    AppVisibleCustomProperties(int i, Collection<CustomProperty> collection) {
        this.f1146CK = i;
        C1785jx.m5364i(collection);
        this.f1147Re = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection<CustomProperty> collection) {
        this(1, collection);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: iV */
    public Map<CustomPropertyKey, String> mo11769iV() {
        HashMap hashMap = new HashMap(this.f1147Re.size());
        for (CustomProperty next : this.f1147Re) {
            hashMap.put(next.mo11776iX(), next.getValue());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Iterator<CustomProperty> iterator() {
        return this.f1147Re.iterator();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0872a.m1259a(this, parcel, i);
    }
}
