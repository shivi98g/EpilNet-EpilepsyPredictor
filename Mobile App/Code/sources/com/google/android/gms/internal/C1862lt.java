package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.lt */
public class C1862lt {

    /* renamed from: TS */
    private static final List<TimeUnit> f4048TS = Arrays.asList(new TimeUnit[]{TimeUnit.NANOSECONDS, TimeUnit.MICROSECONDS, TimeUnit.MILLISECONDS, TimeUnit.SECONDS, TimeUnit.MINUTES, TimeUnit.HOURS, TimeUnit.DAYS});

    /* renamed from: a */
    public static long m5557a(long j, TimeUnit timeUnit, TimeUnit timeUnit2) {
        return timeUnit.convert(timeUnit2.convert(j, timeUnit), timeUnit2);
    }

    /* renamed from: a */
    public static boolean m5558a(TimeUnit timeUnit) {
        return m5559a(timeUnit, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private static boolean m5559a(TimeUnit timeUnit, TimeUnit timeUnit2) {
        return f4048TS.indexOf(timeUnit) < f4048TS.indexOf(timeUnit2);
    }
}
