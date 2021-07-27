package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.nq */
public class C2008nq implements SafeParcelable {
    public static final C2009nr CREATOR = new C2009nr();

    /* renamed from: CK */
    final int f4148CK;
    final boolean ahm;
    final List<C2020oa> ahn;
    private final Set<C2020oa> aho;

    C2008nq(int i, boolean z, List<C2020oa> list) {
        this.f4148CK = i;
        this.ahm = z;
        this.ahn = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.aho = this.ahn.isEmpty() ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet(this.ahn));
    }

    public int describeContents() {
        C2009nr nrVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2008nq)) {
            return false;
        }
        C2008nq nqVar = (C2008nq) obj;
        return this.aho.equals(nqVar.aho) && this.ahm == nqVar.ahm;
    }

    public int hashCode() {
        return C1781jv.hashCode(this.aho, Boolean.valueOf(this.ahm));
    }

    /* renamed from: nr */
    public boolean mo16379nr() {
        return this.ahm;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2009nr nrVar = CREATOR;
        C2009nr.m5968a(this, parcel, i);
    }
}
