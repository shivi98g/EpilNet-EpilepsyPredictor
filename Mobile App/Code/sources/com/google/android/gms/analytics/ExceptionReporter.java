package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders;
import java.lang.Thread;
import java.util.ArrayList;

public class ExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Context mContext;

    /* renamed from: yN */
    private final Thread.UncaughtExceptionHandler f136yN;

    /* renamed from: yO */
    private final Tracker f137yO;

    /* renamed from: yP */
    private ExceptionParser f138yP;

    /* renamed from: yQ */
    private GoogleAnalytics f139yQ;

    public ExceptionReporter(Tracker tracker, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (tracker == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (context == null) {
            throw new NullPointerException("context cannot be null");
        } else {
            this.f136yN = uncaughtExceptionHandler;
            this.f137yO = tracker;
            this.f138yP = new StandardExceptionParser(context, new ArrayList());
            this.mContext = context.getApplicationContext();
            StringBuilder sb = new StringBuilder();
            sb.append("ExceptionReporter created, original handler is ");
            sb.append(uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName());
            C0550ae.m105V(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: es */
    public GoogleAnalytics mo10213es() {
        if (this.f139yQ == null) {
            this.f139yQ = GoogleAnalytics.getInstance(this.mContext);
        }
        return this.f139yQ;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: et */
    public Thread.UncaughtExceptionHandler mo10214et() {
        return this.f136yN;
    }

    public ExceptionParser getExceptionParser() {
        return this.f138yP;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.f138yP = exceptionParser;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.f138yP != null) {
            str = this.f138yP.getDescription(thread != null ? thread.getName() : null, th);
        }
        C0550ae.m105V("Tracking Exception: " + str);
        this.f137yO.send(new HitBuilders.ExceptionBuilder().setDescription(str).setFatal(true).build());
        GoogleAnalytics es = mo10213es();
        es.dispatchLocalHits();
        es.mo10221dY();
        if (this.f136yN != null) {
            C0550ae.m105V("Passing exception to original handler.");
            this.f136yN.uncaughtException(thread, th);
        }
    }
}
