package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.analytics.C0605y;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class GoogleAnalytics extends TrackerHandler {

    /* renamed from: Bm */
    private static boolean f140Bm;

    /* renamed from: Bs */
    private static GoogleAnalytics f141Bs;

    /* renamed from: Bn */
    private C0556aj f142Bn;

    /* renamed from: Bo */
    private volatile Boolean f143Bo;

    /* renamed from: Bp */
    private Logger f144Bp;

    /* renamed from: Bq */
    private Set<C0542a> f145Bq;

    /* renamed from: Br */
    private boolean f146Br;
    private Context mContext;

    /* renamed from: yV */
    private C0569f f147yV;

    /* renamed from: ya */
    private String f148ya;

    /* renamed from: yb */
    private String f149yb;

    /* renamed from: yt */
    private boolean f150yt;

    /* renamed from: com.google.android.gms.analytics.GoogleAnalytics$a */
    interface C0542a {
        /* renamed from: i */
        void mo10238i(Activity activity);

        /* renamed from: j */
        void mo10239j(Activity activity);
    }

    /* renamed from: com.google.android.gms.analytics.GoogleAnalytics$b */
    class C0543b implements Application.ActivityLifecycleCallbacks {
        C0543b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            GoogleAnalytics.this.mo10224g(activity);
        }

        public void onActivityStopped(Activity activity) {
            GoogleAnalytics.this.mo10227h(activity);
        }
    }

    protected GoogleAnalytics(Context context) {
        this(context, C0599x.m305A(context), C0588v.m268eu());
    }

    private GoogleAnalytics(Context context, C0569f fVar, C0556aj ajVar) {
        this.f143Bo = false;
        this.f146Br = false;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        this.mContext = context.getApplicationContext();
        this.f147yV = fVar;
        this.f142Bn = ajVar;
        C0570g.m196y(this.mContext);
        C0555ai.m133y(this.mContext);
        C0575k.m227y(this.mContext);
        this.f144Bp = new C0582p();
        this.f145Bq = new HashSet();
        m55eZ();
    }

    /* renamed from: a */
    private Tracker m52a(Tracker tracker) {
        if (this.f148ya != null) {
            tracker.set("&an", this.f148ya);
        }
        if (this.f149yb != null) {
            tracker.set("&av", this.f149yb);
        }
        return tracker;
    }

    /* renamed from: ai */
    private int m53ai(String str) {
        String lowerCase = str.toLowerCase();
        if ("verbose".equals(lowerCase)) {
            return 0;
        }
        if ("info".equals(lowerCase)) {
            return 1;
        }
        if ("warning".equals(lowerCase)) {
            return 2;
        }
        return "error".equals(lowerCase) ? 3 : -1;
    }

    /* renamed from: eY */
    static GoogleAnalytics m54eY() {
        GoogleAnalytics googleAnalytics;
        synchronized (GoogleAnalytics.class) {
            googleAnalytics = f141Bs;
        }
        return googleAnalytics;
    }

    /* renamed from: eZ */
    private void m55eZ() {
        int i;
        C0546aa aaVar;
        if (!f140Bm) {
            ApplicationInfo applicationInfo = null;
            try {
                applicationInfo = this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 129);
            } catch (PackageManager.NameNotFoundException e) {
                C0550ae.m105V("PackageManager doesn't know about package: " + e);
            }
            if (applicationInfo == null) {
                C0550ae.m106W("Couldn't get ApplicationInfo to load gloabl config.");
                return;
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0 && (aaVar = (C0546aa) new C0607z(this.mContext).mo10475x(i)) != null) {
                mo10219a(aaVar);
            }
        }
    }

    public static GoogleAnalytics getInstance(Context context) {
        GoogleAnalytics googleAnalytics;
        synchronized (GoogleAnalytics.class) {
            if (f141Bs == null) {
                f141Bs = new GoogleAnalytics(context);
            }
            googleAnalytics = f141Bs;
        }
        return googleAnalytics;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10218a(C0542a aVar) {
        this.f145Bq.add(aVar);
        if (this.mContext instanceof Application) {
            enableAutoActivityReports((Application) this.mContext);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10219a(C0546aa aaVar) {
        int ai;
        C0550ae.m105V("Loading global config values.");
        if (aaVar.mo10337eO()) {
            this.f148ya = aaVar.mo10338eP();
            C0550ae.m105V("app name loaded: " + this.f148ya);
        }
        if (aaVar.mo10339eQ()) {
            this.f149yb = aaVar.mo10340eR();
            C0550ae.m105V("app version loaded: " + this.f149yb);
        }
        if (aaVar.mo10341eS() && (ai = m53ai(aaVar.mo10342eT())) >= 0) {
            C0550ae.m105V("log level loaded: " + ai);
            getLogger().setLogLevel(ai);
        }
        if (aaVar.mo10343eU()) {
            this.f142Bn.setLocalDispatchPeriod(aaVar.mo10344eV());
        }
        if (aaVar.mo10345eW()) {
            setDryRun(aaVar.mo10346eX());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10220b(C0542a aVar) {
        this.f145Bq.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dY */
    public void mo10221dY() {
        this.f147yV.mo10448dY();
    }

    @Deprecated
    public void dispatchLocalHits() {
        this.f142Bn.dispatchLocalHits();
    }

    public void enableAutoActivityReports(Application application) {
        if (Build.VERSION.SDK_INT >= 14 && !this.f146Br) {
            application.registerActivityLifecycleCallbacks(new C0543b());
            this.f146Br = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo10224g(Activity activity) {
        for (C0542a i : this.f145Bq) {
            i.mo10238i(activity);
        }
    }

    public boolean getAppOptOut() {
        C0605y.m324eK().mo10499a(C0605y.C0606a.GET_APP_OPT_OUT);
        return this.f143Bo.booleanValue();
    }

    public Logger getLogger() {
        return this.f144Bp;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10227h(Activity activity) {
        for (C0542a j : this.f145Bq) {
            j.mo10239j(activity);
        }
    }

    public boolean isDryRunEnabled() {
        C0605y.m324eK().mo10499a(C0605y.C0606a.GET_DRY_RUN);
        return this.f150yt;
    }

    public Tracker newTracker(int i) {
        Tracker a;
        C0560am amVar;
        synchronized (this) {
            C0605y.m324eK().mo10499a(C0605y.C0606a.GET_TRACKER);
            Tracker tracker = new Tracker((String) null, this, this.mContext);
            if (i > 0 && (amVar = (C0560am) new C0558al(this.mContext).mo10475x(i)) != null) {
                tracker.mo10299a(amVar);
            }
            a = m52a(tracker);
        }
        return a;
    }

    public Tracker newTracker(String str) {
        Tracker a;
        synchronized (this) {
            C0605y.m324eK().mo10499a(C0605y.C0606a.GET_TRACKER);
            a = m52a(new Tracker(str, this, this.mContext));
        }
        return a;
    }

    public void reportActivityStart(Activity activity) {
        if (!this.f146Br) {
            mo10224g(activity);
        }
    }

    public void reportActivityStop(Activity activity) {
        if (!this.f146Br) {
            mo10227h(activity);
        }
    }

    public void setAppOptOut(boolean z) {
        C0605y.m324eK().mo10499a(C0605y.C0606a.SET_APP_OPT_OUT);
        this.f143Bo = Boolean.valueOf(z);
        if (this.f143Bo.booleanValue()) {
            this.f147yV.mo10445dQ();
        }
    }

    public void setDryRun(boolean z) {
        C0605y.m324eK().mo10499a(C0605y.C0606a.SET_DRY_RUN);
        this.f150yt = z;
    }

    @Deprecated
    public void setLocalDispatchPeriod(int i) {
        this.f142Bn.setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger) {
        C0605y.m324eK().mo10499a(C0605y.C0606a.SET_LOGGER);
        this.f144Bp = logger;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo10237u(Map<String, String> map) {
        synchronized (this) {
            if (map == null) {
                try {
                    throw new IllegalArgumentException("hit cannot be null");
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                C0561an.m164a(map, "&ul", C0561an.m162a(Locale.getDefault()));
                C0561an.m163a(map, "&sr", (C0583q) C0555ai.m132fl());
                map.put("&_u", C0605y.m324eK().mo10501eM());
                C0605y.m324eK().mo10500eL();
                this.f147yV.mo10451u(map);
            }
        }
    }
}
