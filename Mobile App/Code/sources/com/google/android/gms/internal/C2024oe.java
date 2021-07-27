package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.oe */
public final class C2024oe implements SafeParcelable {
    public static final C2025of CREATOR = new C2025of();
    public static final C2024oe akb = m6004A("test_type", 1);
    public static final C2024oe akc = m6004A("labeled_place", 6);
    public static final Set<C2024oe> akd = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C2024oe[]{akb, akc})));

    /* renamed from: CK */
    final int f4160CK;
    final int ake;

    /* renamed from: vc */
    final String f4161vc;

    C2024oe(int i, String str, int i2) {
        C1785jx.m5363bb(str);
        this.f4160CK = i;
        this.f4161vc = str;
        this.ake = i2;
    }

    /* renamed from: A */
    private static C2024oe m6004A(String str, int i) {
        return new C2024oe(0, str, i);
    }

    public int describeContents() {
        C2025of ofVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2024oe)) {
            return false;
        }
        C2024oe oeVar = (C2024oe) obj;
        return this.f4161vc.equals(oeVar.f4161vc) && this.ake == oeVar.ake;
    }

    public int hashCode() {
        return this.f4161vc.hashCode();
    }

    public String toString() {
        return this.f4161vc;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2025of ofVar = CREATOR;
        C2025of.m6005a(this, parcel, i);
    }
}
