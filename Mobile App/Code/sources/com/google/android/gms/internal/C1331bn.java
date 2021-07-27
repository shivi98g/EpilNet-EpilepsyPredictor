package com.google.android.gms.internal;

import android.os.Bundle;

@C1507ey
/* renamed from: com.google.android.gms.internal.bn */
public final class C1331bn {

    /* renamed from: ph */
    public static C1722iy<String> f2682ph = m4032a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");

    /* renamed from: pi */
    public static C1722iy<String> f2683pi;

    /* renamed from: pj */
    public static C1722iy<Boolean> f2684pj = m4034c("gads:sdk_crash_report_enabled", false);

    /* renamed from: pk */
    public static C1722iy<Boolean> f2685pk = m4034c("gads:sdk_crash_report_full_stacktrace", false);

    /* renamed from: pl */
    public static C1722iy<Boolean> f2686pl = m4034c("gads:block_autoclicks", false);

    /* renamed from: pm */
    public static C1722iy<String> f2687pm;

    /* renamed from: pn */
    public static C1722iy<Boolean> f2688pn = m4034c("gads:spam_app_context:enabled", false);

    /* renamed from: po */
    public static C1722iy<String> f2689po;

    /* renamed from: pp */
    public static C1722iy<Boolean> f2690pp = m4034c("gads:enable_content_fetching", false);

    /* renamed from: pq */
    public static C1722iy<Integer> f2691pq = m4031a("gads:content_length_weight", 1);

    /* renamed from: pr */
    public static C1722iy<Integer> f2692pr = m4031a("gads:content_age_weight", 1);

    /* renamed from: ps */
    public static C1722iy<Integer> f2693ps = m4031a("gads:min_content_len", 11);

    /* renamed from: pt */
    public static C1722iy<Integer> f2694pt = m4031a("gads:fingerprint_number", 10);

    /* renamed from: pu */
    public static C1722iy<Integer> f2695pu = m4031a("gads:sleep_sec", 10);

    /* renamed from: pv */
    private static final Bundle f2696pv = new Bundle();

    /* renamed from: pw */
    private static boolean f2697pw;

    static {
        f2697pw = false;
        String str = null;
        f2683pi = m4032a("gads:sdk_core_experiment_id", str);
        f2687pm = m4032a("gads:block_autoclicks_experiment_id", str);
        f2697pw = true;
        f2689po = m4032a("gads:spam_app_context:experiment_id", str);
    }

    /* renamed from: a */
    private static C1722iy<Integer> m4031a(String str, int i) {
        f2696pv.putInt(str, i);
        return C1722iy.m5130a(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    private static C1722iy<String> m4032a(String str, String str2) {
        f2696pv.putString(str, str2);
        return C1722iy.m5132l(str, str2);
    }

    /* renamed from: by */
    public static Bundle m4033by() {
        return f2696pv;
    }

    /* renamed from: c */
    private static C1722iy<Boolean> m4034c(String str, boolean z) {
        f2696pv.putBoolean(str, z);
        return C1722iy.m5131h(str, z);
    }
}
