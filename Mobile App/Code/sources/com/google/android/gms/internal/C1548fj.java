package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@C1507ey
/* renamed from: com.google.android.gms.internal.fj */
public final class C1548fj implements SafeParcelable {
    public static final C1549fk CREATOR = new C1549fk();
    public final int errorCode;
    public final int orientation;

    /* renamed from: qA */
    public final long f3330qA;

    /* renamed from: qw */
    public final List<String> f3331qw;

    /* renamed from: qx */
    public final List<String> f3332qx;

    /* renamed from: sg */
    public final String f3333sg;

    /* renamed from: tT */
    public final boolean f3334tT;

    /* renamed from: tU */
    public final String f3335tU;

    /* renamed from: tV */
    public final long f3336tV;

    /* renamed from: tW */
    public final boolean f3337tW;

    /* renamed from: tX */
    public final long f3338tX;

    /* renamed from: tY */
    public final List<String> f3339tY;

    /* renamed from: tZ */
    public final String f3340tZ;

    /* renamed from: ua */
    public final long f3341ua;

    /* renamed from: ub */
    public final String f3342ub;

    /* renamed from: uc */
    public final boolean f3343uc;

    /* renamed from: ud */
    public final String f3344ud;

    /* renamed from: ue */
    public final String f3345ue;

    /* renamed from: uf */
    public final boolean f3346uf;

    /* renamed from: ug */
    public final boolean f3347ug;

    /* renamed from: uh */
    public final boolean f3348uh;
    public final int versionCode;

    public C1548fj(int i) {
        this(10, (String) null, (String) null, (List<String>) null, i, (List<String>) null, -1, false, -1, (List<String>) null, -1, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, false);
    }

    public C1548fj(int i, long j) {
        this(10, (String) null, (String) null, (List<String>) null, i, (List<String>) null, -1, false, -1, (List<String>) null, j, -1, (String) null, -1, (String) null, false, (String) null, (String) null, false, false, false, false);
    }

    C1548fj(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.versionCode = i;
        this.f3333sg = str;
        this.f3335tU = str2;
        List<String> list4 = null;
        this.f3331qw = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.f3332qx = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f3336tV = j;
        this.f3337tW = z;
        this.f3338tX = j2;
        this.f3339tY = list3 != null ? Collections.unmodifiableList(list3) : list4;
        this.f3330qA = j3;
        this.orientation = i3;
        this.f3340tZ = str3;
        this.f3341ua = j4;
        this.f3342ub = str4;
        this.f3343uc = z2;
        this.f3344ud = str5;
        this.f3345ue = str6;
        this.f3346uf = z3;
        this.f3347ug = z4;
        this.f3334tT = z5;
        this.f3348uh = z6;
    }

    public C1548fj(String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(10, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, false, (String) null, str5, z2, z3, z4, z5);
    }

    public C1548fj(String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6) {
        this(10, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1549fk.m4489a(this, parcel, i);
    }
}
