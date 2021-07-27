package com.google.android.gms.analytics;

/* renamed from: com.google.android.gms.analytics.ae */
public class C0550ae {

    /* renamed from: BL */
    private static GoogleAnalytics f200BL;

    /* renamed from: BM */
    private static volatile boolean f201BM = false;

    /* renamed from: BN */
    private static Logger f202BN;

    private C0550ae() {
    }

    /* renamed from: T */
    public static void m103T(String str) {
        Logger logger = getLogger();
        if (logger != null) {
            logger.error(str);
        }
    }

    /* renamed from: U */
    public static void m104U(String str) {
        Logger logger = getLogger();
        if (logger != null) {
            logger.info(str);
        }
    }

    /* renamed from: V */
    public static void m105V(String str) {
        Logger logger = getLogger();
        if (logger != null) {
            logger.verbose(str);
        }
    }

    /* renamed from: W */
    public static void m106W(String str) {
        Logger logger = getLogger();
        if (logger != null) {
            logger.warn(str);
        }
    }

    /* renamed from: ff */
    public static boolean m107ff() {
        return getLogger() != null && getLogger().getLogLevel() == 0;
    }

    static Logger getLogger() {
        synchronized (C0550ae.class) {
            if (f201BM) {
                if (f202BN == null) {
                    f202BN = new C0582p();
                }
                Logger logger = f202BN;
                return logger;
            }
            if (f200BL == null) {
                f200BL = GoogleAnalytics.m54eY();
            }
            if (f200BL == null) {
                return null;
            }
            Logger logger2 = f200BL.getLogger();
            return logger2;
        }
    }
}
