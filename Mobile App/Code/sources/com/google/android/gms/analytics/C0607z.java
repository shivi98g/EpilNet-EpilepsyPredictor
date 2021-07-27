package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.C0579n;

/* renamed from: com.google.android.gms.analytics.z */
class C0607z extends C0579n<C0546aa> {

    /* renamed from: com.google.android.gms.analytics.z$a */
    private static class C0608a implements C0579n.C0580a<C0546aa> {

        /* renamed from: Bi */
        private final C0546aa f416Bi = new C0546aa();

        /* renamed from: c */
        public void mo10383c(String str, int i) {
            if ("ga_dispatchPeriod".equals(str)) {
                this.f416Bi.f184Bk = i;
                return;
            }
            C0550ae.m106W("int configuration name not recognized:  " + str);
        }

        /* renamed from: e */
        public void mo10384e(String str, String str2) {
        }

        /* renamed from: e */
        public void mo10385e(String str, boolean z) {
            if ("ga_dryRun".equals(str)) {
                this.f416Bi.f185Bl = z ? 1 : 0;
                return;
            }
            C0550ae.m106W("bool configuration name not recognized:  " + str);
        }

        /* renamed from: eN */
        public C0546aa mo10386er() {
            return this.f416Bi;
        }

        /* renamed from: f */
        public void mo10387f(String str, String str2) {
            if ("ga_appName".equals(str)) {
                this.f416Bi.f186ya = str2;
            } else if ("ga_appVersion".equals(str)) {
                this.f416Bi.f187yb = str2;
            } else if ("ga_logLevel".equals(str)) {
                this.f416Bi.f183Bj = str2;
            } else {
                C0550ae.m106W("string configuration name not recognized:  " + str);
            }
        }
    }

    public C0607z(Context context) {
        super(context, new C0608a());
    }
}
