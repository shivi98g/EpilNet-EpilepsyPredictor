package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.C0579n;

/* renamed from: com.google.android.gms.analytics.al */
class C0558al extends C0579n<C0560am> {

    /* renamed from: com.google.android.gms.analytics.al$a */
    private static class C0559a implements C0579n.C0580a<C0560am> {

        /* renamed from: Cu */
        private final C0560am f223Cu = new C0560am();

        /* renamed from: c */
        public void mo10383c(String str, int i) {
            if ("ga_sessionTimeout".equals(str)) {
                this.f223Cu.f228Cx = i;
                return;
            }
            C0550ae.m106W("int configuration name not recognized:  " + str);
        }

        /* renamed from: e */
        public void mo10384e(String str, String str2) {
            this.f223Cu.f225CB.put(str, str2);
        }

        /* renamed from: e */
        public void mo10385e(String str, boolean z) {
            if ("ga_autoActivityTracking".equals(str)) {
                this.f223Cu.f229Cy = z;
            } else if ("ga_anonymizeIp".equals(str)) {
                this.f223Cu.f230Cz = z;
            } else if ("ga_reportUncaughtExceptions".equals(str)) {
                this.f223Cu.f224CA = z ? 1 : 0;
            } else {
                C0550ae.m106W("bool configuration name not recognized:  " + str);
            }
        }

        /* renamed from: f */
        public void mo10387f(String str, String str2) {
            if ("ga_trackingId".equals(str)) {
                this.f223Cu.f226Cv = str2;
            } else if ("ga_sampleFrequency".equals(str)) {
                try {
                    this.f223Cu.f227Cw = Double.parseDouble(str2);
                } catch (NumberFormatException e) {
                    C0550ae.m103T("Error parsing ga_sampleFrequency value: " + str2);
                }
            } else {
                C0550ae.m106W("string configuration name not recognized:  " + str);
            }
        }

        /* renamed from: fs */
        public C0560am mo10386er() {
            return this.f223Cu;
        }
    }

    public C0558al(Context context) {
        super(context, new C0559a());
    }
}
