package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@C1507ey
/* renamed from: com.google.android.gms.internal.av */
public final class C1303av implements SafeParcelable {
    public static final C1304aw CREATOR = new C1304aw();
    public final Bundle extras;

    /* renamed from: od */
    public final long f2385od;

    /* renamed from: oe */
    public final int f2386oe;

    /* renamed from: of */
    public final List<String> f2387of;

    /* renamed from: og */
    public final boolean f2388og;

    /* renamed from: oh */
    public final int f2389oh;

    /* renamed from: oi */
    public final boolean f2390oi;

    /* renamed from: oj */
    public final String f2391oj;

    /* renamed from: ok */
    public final C1327bj f2392ok;

    /* renamed from: ol */
    public final Location f2393ol;

    /* renamed from: om */
    public final String f2394om;

    /* renamed from: on */
    public final Bundle f2395on;
    public final int versionCode;

    public C1303av(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, C1327bj bjVar, Location location, String str2, Bundle bundle2) {
        this.versionCode = i;
        this.f2385od = j;
        this.extras = bundle;
        this.f2386oe = i2;
        this.f2387of = list;
        this.f2388og = z;
        this.f2389oh = i3;
        this.f2390oi = z2;
        this.f2391oj = str;
        this.f2392ok = bjVar;
        this.f2393ol = location;
        this.f2394om = str2;
        this.f2395on = bundle2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1304aw.m3943a(this, parcel, i);
    }
}
