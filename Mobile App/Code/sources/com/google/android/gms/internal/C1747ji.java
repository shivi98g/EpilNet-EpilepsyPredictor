package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.ji */
public abstract class C1747ji implements SafeParcelable {

    /* renamed from: MA */
    private static ClassLoader f3889MA = null;

    /* renamed from: MB */
    private static Integer f3890MB = null;

    /* renamed from: Mz */
    private static final Object f3891Mz = new Object();

    /* renamed from: MC */
    private boolean f3892MC = false;

    /* renamed from: a */
    private static boolean m5168a(Class<?> cls) {
        try {
            return SafeParcelable.NULL.equals(cls.getField("NULL").get((Object) null));
        } catch (NoSuchFieldException e) {
            return false;
        } catch (IllegalAccessException e2) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aW */
    public static boolean m5169aW(String str) {
        ClassLoader hs = m5170hs();
        if (hs == null) {
            return true;
        }
        try {
            return m5168a(hs.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: hs */
    protected static ClassLoader m5170hs() {
        ClassLoader classLoader;
        synchronized (f3891Mz) {
            classLoader = f3889MA;
        }
        return classLoader;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ht */
    public static Integer m5171ht() {
        Integer num;
        synchronized (f3891Mz) {
            num = f3890MB;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hu */
    public boolean mo15802hu() {
        return this.f3892MC;
    }
}
