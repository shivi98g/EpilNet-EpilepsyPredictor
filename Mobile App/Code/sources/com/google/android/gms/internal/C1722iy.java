package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.iy */
public abstract class C1722iy<T> {

    /* renamed from: KO */
    private static C1726a f3839KO = null;

    /* renamed from: mH */
    private static final Object f3840mH = new Object();

    /* renamed from: KP */
    protected final String f3841KP;

    /* renamed from: KQ */
    protected final T f3842KQ;

    /* renamed from: KR */
    private T f3843KR = null;

    /* renamed from: com.google.android.gms.internal.iy$a */
    private interface C1726a {
    }

    /* renamed from: com.google.android.gms.internal.iy$b */
    private static class C1727b implements C1726a {
        private final ContentResolver mContentResolver;

        public C1727b(ContentResolver contentResolver) {
            this.mContentResolver = contentResolver;
        }
    }

    protected C1722iy(String str, T t) {
        this.f3841KP = str;
        this.f3842KQ = t;
    }

    /* renamed from: H */
    public static void m5129H(Context context) {
        synchronized (f3840mH) {
            if (f3839KO == null) {
                f3839KO = new C1727b(context.getContentResolver());
            }
        }
    }

    /* renamed from: a */
    public static C1722iy<Integer> m5130a(String str, Integer num) {
        return new C1722iy<Integer>(str, num) {
        };
    }

    /* renamed from: h */
    public static C1722iy<Boolean> m5131h(String str, boolean z) {
        return new C1722iy<Boolean>(str, Boolean.valueOf(z)) {
        };
    }

    /* renamed from: l */
    public static C1722iy<String> m5132l(String str, String str2) {
        return new C1722iy<String>(str, str2) {
        };
    }

    public String getKey() {
        return this.f3841KP;
    }
}
