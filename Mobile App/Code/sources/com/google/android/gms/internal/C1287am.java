package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

@C1507ey
/* renamed from: com.google.android.gms.internal.am */
public class C1287am implements Application.ActivityLifecycleCallbacks {
    private Context mContext;

    /* renamed from: mH */
    private final Object f2349mH = new Object();

    /* renamed from: nB */
    private Activity f2350nB;

    public C1287am(Application application, Activity activity) {
        application.registerActivityLifecycleCallbacks(this);
        setActivity(activity);
        this.mContext = application.getApplicationContext();
    }

    private void setActivity(Activity activity) {
        synchronized (this.f2349mH) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f2350nB = activity;
            }
        }
    }

    public Activity getActivity() {
        return this.f2350nB;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityDestroyed(android.app.Activity r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2349mH
            monitor-enter(r0)
            android.app.Activity r1 = r2.f2350nB     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            android.app.Activity r1 = r2.f2350nB     // Catch:{ all -> 0x0016 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0014
            r1 = 0
            r2.f2350nB = r1     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1287am.onActivityDestroyed(android.app.Activity):void");
    }

    public void onActivityPaused(Activity activity) {
        setActivity(activity);
    }

    public void onActivityResumed(Activity activity) {
        setActivity(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
