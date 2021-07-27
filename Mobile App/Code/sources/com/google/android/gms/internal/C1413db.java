package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@C1507ey
/* renamed from: com.google.android.gms.internal.db */
public final class C1413db implements MediationAdRequest {

    /* renamed from: d */
    private final Date f2865d;

    /* renamed from: f */
    private final Set<String> f2866f;

    /* renamed from: g */
    private final boolean f2867g;

    /* renamed from: h */
    private final Location f2868h;

    /* renamed from: ow */
    private final int f2869ow;

    /* renamed from: qU */
    private final int f2870qU;

    public C1413db(Date date, int i, Set<String> set, Location location, boolean z, int i2) {
        this.f2865d = date;
        this.f2869ow = i;
        this.f2866f = set;
        this.f2868h = location;
        this.f2867g = z;
        this.f2870qU = i2;
    }

    public Date getBirthday() {
        return this.f2865d;
    }

    public int getGender() {
        return this.f2869ow;
    }

    public Set<String> getKeywords() {
        return this.f2866f;
    }

    public Location getLocation() {
        return this.f2868h;
    }

    public boolean isTesting() {
        return this.f2867g;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f2870qU;
    }
}
