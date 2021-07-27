package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;

/* renamed from: com.google.android.gms.tagmanager.df */
class C2586df {
    private Context mContext;

    /* renamed from: yO */
    private Tracker f4455yO;

    /* renamed from: yQ */
    private GoogleAnalytics f4456yQ;

    /* renamed from: com.google.android.gms.tagmanager.df$a */
    static class C2587a implements Logger {
        C2587a() {
        }

        /* renamed from: fP */
        private static int m7515fP(int i) {
            switch (i) {
                case 2:
                    return 0;
                case 3:
                case 4:
                    return 1;
                case 5:
                    return 2;
                default:
                    return 3;
            }
        }

        public void error(Exception exc) {
            C2504bh.m7247b("", exc);
        }

        public void error(String str) {
            C2504bh.m7243T(str);
        }

        public int getLogLevel() {
            return m7515fP(C2504bh.getLogLevel());
        }

        public void info(String str) {
            C2504bh.m7244U(str);
        }

        public void setLogLevel(int i) {
            C2504bh.m7246W("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        public void verbose(String str) {
            C2504bh.m7245V(str);
        }

        public void warn(String str) {
            C2504bh.m7246W(str);
        }
    }

    C2586df(Context context) {
        this.mContext = context;
    }

    /* renamed from: cX */
    private synchronized void m7513cX(String str) {
        if (this.f4456yQ == null) {
            this.f4456yQ = GoogleAnalytics.getInstance(this.mContext);
            this.f4456yQ.setLogger(new C2587a());
            this.f4455yO = this.f4456yQ.newTracker(str);
        }
    }

    /* renamed from: cW */
    public Tracker mo18829cW(String str) {
        m7513cX(str);
        return this.f4455yO;
    }
}
