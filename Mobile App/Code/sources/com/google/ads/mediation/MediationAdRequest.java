package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public final class MediationAdRequest {

    /* renamed from: d */
    private final Date f51d;

    /* renamed from: e */
    private final AdRequest.Gender f52e;

    /* renamed from: f */
    private final Set<String> f53f;

    /* renamed from: g */
    private final boolean f54g;

    /* renamed from: h */
    private final Location f55h;

    public MediationAdRequest(Date date, AdRequest.Gender gender, Set<String> set, boolean z, Location location) {
        this.f51d = date;
        this.f52e = gender;
        this.f53f = set;
        this.f54g = z;
        this.f55h = location;
    }

    public Integer getAgeInYears() {
        if (this.f51d == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.f51d);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        return (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
    }

    public Date getBirthday() {
        return this.f51d;
    }

    public AdRequest.Gender getGender() {
        return this.f52e;
    }

    public Set<String> getKeywords() {
        return this.f53f;
    }

    public Location getLocation() {
        return this.f55h;
    }

    public boolean isTesting() {
        return this.f54g;
    }
}
