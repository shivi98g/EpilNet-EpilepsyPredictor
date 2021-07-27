package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p003v7.widget.ActivityChooserView;
import android.text.TextUtils;
import com.google.android.gms.analytics.C0605y;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1832ld;
import com.google.android.gms.internal.C1834lf;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Tracker {

    /* renamed from: Ce */
    private final TrackerHandler f158Ce;

    /* renamed from: Cf */
    private final Map<String, String> f159Cf;

    /* renamed from: Cg */
    private C0554ah f160Cg;

    /* renamed from: Ch */
    private final C0575k f161Ch;

    /* renamed from: Ci */
    private final C0555ai f162Ci;

    /* renamed from: Cj */
    private final C0570g f163Cj;

    /* renamed from: Ck */
    private boolean f164Ck;
    /* access modifiers changed from: private */

    /* renamed from: Cl */
    public C0544a f165Cl;
    /* access modifiers changed from: private */

    /* renamed from: Cm */
    public C0560am f166Cm;

    /* renamed from: Cn */
    private ExceptionReporter f167Cn;
    private Context mContext;

    /* renamed from: rd */
    private final Map<String, String> f168rd;

    /* renamed from: com.google.android.gms.analytics.Tracker$a */
    private class C0544a implements GoogleAnalytics.C0542a {

        /* renamed from: Co */
        private boolean f169Co = false;

        /* renamed from: Cp */
        private int f170Cp = 0;

        /* renamed from: Cq */
        private long f171Cq = -1;

        /* renamed from: Cr */
        private boolean f172Cr = false;

        /* renamed from: Cs */
        private long f173Cs;

        /* renamed from: wb */
        private C1832ld f175wb = C1834lf.m5525if();

        public C0544a() {
        }

        /* renamed from: fq */
        private void m70fq() {
            GoogleAnalytics eY = GoogleAnalytics.m54eY();
            if (eY == null) {
                C0550ae.m103T("GoogleAnalytics isn't initialized for the Tracker!");
            } else if (this.f171Cq >= 0 || this.f169Co) {
                eY.mo10218a((GoogleAnalytics.C0542a) Tracker.this.f165Cl);
            } else {
                eY.mo10220b(Tracker.this.f165Cl);
            }
        }

        public void enableAutoActivityTracking(boolean z) {
            this.f169Co = z;
            m70fq();
        }

        /* renamed from: fn */
        public long mo10330fn() {
            return this.f171Cq;
        }

        /* renamed from: fo */
        public boolean mo10331fo() {
            return this.f169Co;
        }

        /* renamed from: fp */
        public boolean mo10332fp() {
            boolean z = this.f172Cr;
            this.f172Cr = false;
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: fr */
        public boolean mo10333fr() {
            return this.f175wb.elapsedRealtime() >= this.f173Cs + Math.max(1000, this.f171Cq);
        }

        /* renamed from: i */
        public void mo10238i(Activity activity) {
            C0605y.m324eK().mo10499a(C0605y.C0606a.EASY_TRACKER_ACTIVITY_START);
            if (this.f170Cp == 0 && mo10333fr()) {
                this.f172Cr = true;
            }
            this.f170Cp++;
            if (this.f169Co) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Tracker.this.setCampaignParamsOnNextHit(intent.getData());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                C0605y.m324eK().mo10498D(true);
                Tracker.this.set("&cd", Tracker.this.f166Cm != null ? Tracker.this.f166Cm.mo10401k(activity) : activity.getClass().getCanonicalName());
                Tracker.this.send(hashMap);
                C0605y.m324eK().mo10498D(false);
            }
        }

        /* renamed from: j */
        public void mo10239j(Activity activity) {
            C0605y.m324eK().mo10499a(C0605y.C0606a.EASY_TRACKER_ACTIVITY_STOP);
            this.f170Cp--;
            this.f170Cp = Math.max(0, this.f170Cp);
            if (this.f170Cp == 0) {
                this.f173Cs = this.f175wb.elapsedRealtime();
            }
        }

        public void setSessionTimeout(long j) {
            this.f171Cq = j;
            m70fq();
        }
    }

    Tracker(String str, TrackerHandler trackerHandler, Context context) {
        this(str, trackerHandler, C0575k.m224el(), C0555ai.m132fl(), C0570g.m195dZ(), new C0549ad("tracking"), context);
    }

    Tracker(String str, TrackerHandler trackerHandler, C0575k kVar, C0555ai aiVar, C0570g gVar, C0554ah ahVar, Context context) {
        this.f168rd = new HashMap();
        this.f159Cf = new HashMap();
        this.f158Ce = trackerHandler;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        if (str != null) {
            this.f168rd.put("&tid", str);
        }
        this.f168rd.put("useSecure", "1");
        this.f161Ch = kVar;
        this.f162Ci = aiVar;
        this.f163Cj = gVar;
        this.f168rd.put("&a", Integer.toString(new Random().nextInt(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) + 1));
        this.f160Cg = ahVar;
        this.f165Cl = new C0544a();
        enableAdvertisingIdCollection(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10299a(C0560am amVar) {
        C0550ae.m105V("Loading Tracker config values.");
        this.f166Cm = amVar;
        if (this.f166Cm.mo10393ft()) {
            String fu = this.f166Cm.mo10394fu();
            set("&tid", fu);
            C0550ae.m105V("[Tracker] trackingId loaded: " + fu);
        }
        if (this.f166Cm.mo10395fv()) {
            String d = Double.toString(this.f166Cm.mo10396fw());
            set("&sf", d);
            C0550ae.m105V("[Tracker] sample frequency loaded: " + d);
        }
        if (this.f166Cm.mo10397fx()) {
            setSessionTimeout((long) this.f166Cm.getSessionTimeout());
            C0550ae.m105V("[Tracker] session timeout loaded: " + mo10303fn());
        }
        if (this.f166Cm.mo10398fy()) {
            enableAutoActivityTracking(this.f166Cm.mo10399fz());
            C0550ae.m105V("[Tracker] auto activity tracking loaded: " + mo10304fo());
        }
        if (this.f166Cm.mo10390fA()) {
            if (this.f166Cm.mo10391fB()) {
                set("&aip", "1");
                C0550ae.m105V("[Tracker] anonymize ip loaded: true");
            }
            C0550ae.m105V("[Tracker] anonymize ip loaded: false");
        }
        enableExceptionReporting(this.f166Cm.mo10392fC());
    }

    public void enableAdvertisingIdCollection(boolean z) {
        if (!z) {
            this.f168rd.put("&ate", (Object) null);
            this.f168rd.put("&adid", (Object) null);
            return;
        }
        if (this.f168rd.containsKey("&ate")) {
            this.f168rd.remove("&ate");
        }
        if (this.f168rd.containsKey("&adid")) {
            this.f168rd.remove("&adid");
        }
    }

    public void enableAutoActivityTracking(boolean z) {
        this.f165Cl.enableAutoActivityTracking(z);
    }

    public void enableExceptionReporting(boolean z) {
        String str;
        if (this.f164Ck != z) {
            this.f164Ck = z;
            if (z) {
                this.f167Cn = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), this.mContext);
                Thread.setDefaultUncaughtExceptionHandler(this.f167Cn);
                str = "Uncaught exceptions will be reported to Google Analytics.";
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this.f167Cn != null ? this.f167Cn.mo10214et() : null);
                str = "Uncaught exceptions will not be reported to Google Analytics.";
            }
            C0550ae.m105V(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fn */
    public long mo10303fn() {
        return this.f165Cl.mo10330fn();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fo */
    public boolean mo10304fo() {
        return this.f165Cl.mo10331fo();
    }

    public String get(String str) {
        C0605y.m324eK().mo10499a(C0605y.C0606a.GET);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f168rd.containsKey(str)) {
            return this.f168rd.get(str);
        }
        if (str.equals("&ul")) {
            return C0561an.m162a(Locale.getDefault());
        }
        if (this.f161Ch != null && this.f161Ch.mo10470ac(str)) {
            return this.f161Ch.getValue(str);
        }
        if (this.f162Ci != null && this.f162Ci.mo10372ac(str)) {
            return this.f162Ci.getValue(str);
        }
        if (this.f163Cj == null || !this.f163Cj.mo10452ac(str)) {
            return null;
        }
        return this.f163Cj.getValue(str);
    }

    public void send(Map<String, String> map) {
        C0605y.m324eK().mo10499a(C0605y.C0606a.SEND);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f168rd);
        if (map != null) {
            hashMap.putAll(map);
        }
        for (String next : this.f159Cf.keySet()) {
            if (!hashMap.containsKey(next)) {
                hashMap.put(next, this.f159Cf.get(next));
            }
        }
        this.f159Cf.clear();
        if (TextUtils.isEmpty((CharSequence) hashMap.get("&tid"))) {
            C0550ae.m106W(String.format("Missing tracking id (%s) parameter.", new Object[]{"&tid"}));
        }
        String str = (String) hashMap.get("&t");
        if (TextUtils.isEmpty(str)) {
            C0550ae.m106W(String.format("Missing hit type (%s) parameter.", new Object[]{"&t"}));
            str = "";
        }
        if (this.f165Cl.mo10332fp()) {
            hashMap.put("&sc", "start");
        }
        String lowerCase = str.toLowerCase();
        if ("screenview".equals(lowerCase) || "pageview".equals(lowerCase) || "appview".equals(lowerCase) || TextUtils.isEmpty(lowerCase)) {
            int parseInt = Integer.parseInt(this.f168rd.get("&a")) + 1;
            if (parseInt >= Integer.MAX_VALUE) {
                parseInt = 1;
            }
            this.f168rd.put("&a", Integer.toString(parseInt));
        }
        if (lowerCase.equals("transaction") || lowerCase.equals("item") || this.f160Cg.mo10353fe()) {
            this.f158Ce.mo10237u(hashMap);
        } else {
            C0550ae.m106W("Too many hits sent too quickly, rate limiting invoked.");
        }
    }

    public void set(String str, String str2) {
        C1785jx.m5359b(str, (Object) "Key should be non-null");
        C0605y.m324eK().mo10499a(C0605y.C0606a.SET);
        this.f168rd.put(str, str2);
    }

    public void setAnonymizeIp(boolean z) {
        set("&aip", C0561an.m160E(z));
    }

    public void setAppId(String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(String str) {
        set("&aiid", str);
    }

    public void setAppName(String str) {
        set("&an", str);
    }

    public void setAppVersion(String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(Uri uri) {
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("referrer");
            if (!TextUtils.isEmpty(queryParameter)) {
                Uri parse = Uri.parse("http://hostname/?" + queryParameter);
                String queryParameter2 = parse.getQueryParameter("utm_id");
                if (queryParameter2 != null) {
                    this.f159Cf.put("&ci", queryParameter2);
                }
                String queryParameter3 = parse.getQueryParameter("utm_campaign");
                if (queryParameter3 != null) {
                    this.f159Cf.put("&cn", queryParameter3);
                }
                String queryParameter4 = parse.getQueryParameter("utm_content");
                if (queryParameter4 != null) {
                    this.f159Cf.put("&cc", queryParameter4);
                }
                String queryParameter5 = parse.getQueryParameter("utm_medium");
                if (queryParameter5 != null) {
                    this.f159Cf.put("&cm", queryParameter5);
                }
                String queryParameter6 = parse.getQueryParameter("utm_source");
                if (queryParameter6 != null) {
                    this.f159Cf.put("&cs", queryParameter6);
                }
                String queryParameter7 = parse.getQueryParameter("utm_term");
                if (queryParameter7 != null) {
                    this.f159Cf.put("&ck", queryParameter7);
                }
                String queryParameter8 = parse.getQueryParameter("dclid");
                if (queryParameter8 != null) {
                    this.f159Cf.put("&dclid", queryParameter8);
                }
                String queryParameter9 = parse.getQueryParameter("gclid");
                if (queryParameter9 != null) {
                    this.f159Cf.put("&gclid", queryParameter9);
                }
            }
        }
    }

    public void setClientId(String str) {
        set("&cid", str);
    }

    public void setEncoding(String str) {
        set("&de", str);
    }

    public void setHostname(String str) {
        set("&dh", str);
    }

    public void setLanguage(String str) {
        set("&ul", str);
    }

    public void setLocation(String str) {
        set("&dl", str);
    }

    public void setPage(String str) {
        set("&dp", str);
    }

    public void setReferrer(String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d) {
        set("&sf", Double.toHexString(d));
    }

    public void setScreenColors(String str) {
        set("&sd", str);
    }

    public void setScreenName(String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            set("&sr", i + "x" + i2);
            return;
        }
        C0550ae.m106W("Invalid width or height. The values should be non-negative.");
    }

    public void setSessionTimeout(long j) {
        this.f165Cl.setSessionTimeout(1000 * j);
    }

    public void setTitle(String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z) {
        set("useSecure", C0561an.m160E(z));
    }

    public void setViewportSize(String str) {
        set("&vp", str);
    }
}
