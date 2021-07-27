package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.nu */
public final class C2012nu implements SafeParcelable {
    public static final C2013nv CREATOR = new C2013nv();

    /* renamed from: CK */
    final int f4150CK;
    final List<C2020oa> ahn;
    private final Set<C2020oa> aho;
    private final String ahr;
    private final boolean ahs;
    final List<C2024oe> aht;
    final List<String> ahu;
    private final Set<C2024oe> ahv;
    private final Set<String> ahw;

    C2012nu(int i, List<C2020oa> list, String str, boolean z, List<C2024oe> list2, List<String> list3) {
        this.f4150CK = i;
        this.ahn = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.ahr = str == null ? "" : str;
        this.ahs = z;
        this.aht = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.ahu = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.aho = m5977g(this.ahn);
        this.ahv = m5977g(this.aht);
        this.ahw = m5977g(this.ahu);
    }

    /* renamed from: g */
    private static <E> Set<E> m5977g(List<E> list) {
        return list.isEmpty() ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet(list));
    }

    public int describeContents() {
        C2013nv nvVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012nu)) {
            return false;
        }
        C2012nu nuVar = (C2012nu) obj;
        return this.aho.equals(nuVar.aho) && this.ahs == nuVar.ahs && this.ahv.equals(nuVar.ahv) && this.ahw.equals(nuVar.ahw);
    }

    public int hashCode() {
        return C1781jv.hashCode(this.aho, Boolean.valueOf(this.ahs), this.ahv, this.ahw);
    }

    @Deprecated
    /* renamed from: nu */
    public String mo16401nu() {
        return this.ahr;
    }

    /* renamed from: nv */
    public boolean mo16402nv() {
        return this.ahs;
    }

    public String toString() {
        return C1781jv.m5348h(this).mo15935a("types", this.aho).mo15935a("placeIds", this.ahw).mo15935a("requireOpenNow", Boolean.valueOf(this.ahs)).mo15935a("requestedUserDataTypes", this.ahv).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2013nv nvVar = CREATOR;
        C2013nv.m5980a(this, parcel, i);
    }
}
