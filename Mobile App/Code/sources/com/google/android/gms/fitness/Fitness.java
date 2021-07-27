package com.google.android.gms.fitness;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1863lu;
import com.google.android.gms.internal.C1867lv;
import com.google.android.gms.internal.C1894mf;
import com.google.android.gms.internal.C1896mh;
import com.google.android.gms.internal.C1904mi;
import com.google.android.gms.internal.C1909mj;
import com.google.android.gms.internal.C1914mk;
import com.google.android.gms.internal.C1915ml;
import com.google.android.gms.internal.C1920mm;
import com.google.android.gms.internal.C1929mn;
import com.google.android.gms.internal.C1938mo;
import java.util.concurrent.TimeUnit;

public class Fitness {
    public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
    public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
    public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>(f1321DR, f1320DQ, new Scope[0]);
    public static final BleApi BleApi = m1624jj();
    public static final ConfigApi ConfigApi = new C1904mi();

    /* renamed from: DQ */
    public static final Api.C0668c<C1863lu> f1320DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C1863lu, Api.ApiOptions.NoOptions> f1321DR = new Api.C0667b<C1863lu, Api.ApiOptions.NoOptions>() {
        /* renamed from: d */
        public C1863lu mo10533a(Context context, Looper looper, C1744jg jgVar, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C1867lv(context, looper, connectionCallbacks, onConnectionFailedListener, jgVar.mo15787hm(), C0976a.m1631e(jgVar.mo15789ho()));
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };
    public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
    public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
    public static final HistoryApi HistoryApi = new C1909mj();
    public static final RecordingApi RecordingApi = new C1915ml();
    public static final Scope SCOPE_ACTIVITY_READ = new Scope(Scopes.FITNESS_ACTIVITY_READ);
    public static final Scope SCOPE_ACTIVITY_READ_WRITE = new Scope(Scopes.FITNESS_ACTIVITY_READ_WRITE);
    public static final Scope SCOPE_BODY_READ = new Scope(Scopes.FITNESS_BODY_READ);
    public static final Scope SCOPE_BODY_READ_WRITE = new Scope(Scopes.FITNESS_BODY_READ_WRITE);
    public static final Scope SCOPE_LOCATION_READ = new Scope(Scopes.FITNESS_LOCATION_READ);
    public static final Scope SCOPE_LOCATION_READ_WRITE = new Scope(Scopes.FITNESS_LOCATION_READ_WRITE);
    public static final SensorsApi SensorsApi = new C1920mm();
    public static final SessionsApi SessionsApi = new C1929mn();

    /* renamed from: TK */
    public static final C1894mf f1322TK = new C1914mk();

    private Fitness() {
    }

    public static long getEndTime(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(EXTRA_END_TIME, -1);
        if (longExtra == -1) {
            return -1;
        }
        return timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }

    public static long getStartTime(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(EXTRA_START_TIME, -1);
        if (longExtra == -1) {
            return -1;
        }
        return timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }

    /* renamed from: jj */
    private static BleApi m1624jj() {
        return Build.VERSION.SDK_INT >= 18 ? new C1896mh() : new C1938mo();
    }
}
