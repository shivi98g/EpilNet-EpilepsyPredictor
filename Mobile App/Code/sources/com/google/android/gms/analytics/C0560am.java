package com.google.android.gms.analytics;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.am */
class C0560am implements C0578m {

    /* renamed from: CA */
    int f224CA = -1;

    /* renamed from: CB */
    Map<String, String> f225CB = new HashMap();

    /* renamed from: Cv */
    String f226Cv;

    /* renamed from: Cw */
    double f227Cw = -1.0d;

    /* renamed from: Cx */
    int f228Cx = -1;

    /* renamed from: Cy */
    int f229Cy = -1;

    /* renamed from: Cz */
    int f230Cz = -1;

    C0560am() {
    }

    /* renamed from: am */
    public String mo10389am(String str) {
        String str2 = this.f225CB.get(str);
        return str2 != null ? str2 : str;
    }

    /* renamed from: fA */
    public boolean mo10390fA() {
        return this.f230Cz != -1;
    }

    /* renamed from: fB */
    public boolean mo10391fB() {
        return this.f230Cz == 1;
    }

    /* renamed from: fC */
    public boolean mo10392fC() {
        return this.f224CA == 1;
    }

    /* renamed from: ft */
    public boolean mo10393ft() {
        return this.f226Cv != null;
    }

    /* renamed from: fu */
    public String mo10394fu() {
        return this.f226Cv;
    }

    /* renamed from: fv */
    public boolean mo10395fv() {
        return this.f227Cw >= 0.0d;
    }

    /* renamed from: fw */
    public double mo10396fw() {
        return this.f227Cw;
    }

    /* renamed from: fx */
    public boolean mo10397fx() {
        return this.f228Cx >= 0;
    }

    /* renamed from: fy */
    public boolean mo10398fy() {
        return this.f229Cy != -1;
    }

    /* renamed from: fz */
    public boolean mo10399fz() {
        return this.f229Cy == 1;
    }

    public int getSessionTimeout() {
        return this.f228Cx;
    }

    /* renamed from: k */
    public String mo10401k(Activity activity) {
        return mo10389am(activity.getClass().getCanonicalName());
    }
}
