package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.an */
public class C1288an extends Thread {

    /* renamed from: mH */
    private final Object f2351mH;
    private boolean mStarted = false;

    /* renamed from: nC */
    private boolean f2352nC = false;

    /* renamed from: nD */
    private boolean f2353nD = false;

    /* renamed from: nE */
    private final C1287am f2354nE;

    /* renamed from: nF */
    private final C1286al f2355nF;

    /* renamed from: nG */
    private final C1506ex f2356nG;

    /* renamed from: nH */
    private final int f2357nH;

    /* renamed from: nI */
    private final int f2358nI;

    /* renamed from: nJ */
    private final int f2359nJ;

    /* renamed from: np */
    private final int f2360np;

    /* renamed from: nr */
    private final int f2361nr;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.an$a */
    class C1292a {

        /* renamed from: nQ */
        final int f2370nQ;

        /* renamed from: nR */
        final int f2371nR;

        C1292a(int i, int i2) {
            this.f2370nQ = i;
            this.f2371nR = i2;
        }
    }

    public C1288an(C1287am amVar, C1286al alVar, Bundle bundle, C1506ex exVar) {
        this.f2354nE = amVar;
        this.f2355nF = alVar;
        this.f2356nG = exVar;
        this.f2351mH = new Object();
        this.f2360np = bundle.getInt(C1331bn.f2691pq.getKey());
        this.f2358nI = bundle.getInt(C1331bn.f2692pr.getKey());
        this.f2361nr = bundle.getInt(C1331bn.f2693ps.getKey());
        this.f2359nJ = bundle.getInt(C1331bn.f2694pt.getKey());
        this.f2357nH = bundle.getInt(C1331bn.f2695pu.getKey(), 10);
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    private void m3908a(Activity activity) {
        if (activity != null) {
            View view = null;
            if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                view = activity.getWindow().getDecorView().findViewById(16908290);
            }
            if (view != null) {
                mo14788g(view);
            }
        }
    }

    /* renamed from: a */
    private boolean m3909a(final WebView webView, final C1285ak akVar) {
        if (!C1840ll.m5544im()) {
            return false;
        }
        akVar.mo14759aW();
        webView.post(new Runnable() {

            /* renamed from: nM */
            ValueCallback<String> f2365nM = new ValueCallback<String>() {
                /* renamed from: k */
                public void onReceiveValue(String str) {
                    C1288an.this.mo14783a(akVar, webView, str);
                }
            };

            public void run() {
                if (webView.getSettings().getJavaScriptEnabled()) {
                    webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f2365nM);
                }
            }
        });
        return true;
    }

    /* renamed from: bb */
    private boolean m3910bb() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context context = this.f2354nE.getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (activityManager == null || keyguardManager == null || powerManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (Process.myPid() == next.pid) {
                    return next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1292a mo14782a(View view, C1285ak akVar) {
        if (view == null) {
            return new C1292a(0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            akVar.mo14767i(((TextView) view).getText().toString());
            return new C1292a(1, 0);
        } else if ((view instanceof WebView) && !(view instanceof C1610gu)) {
            akVar.mo14759aW();
            return m3909a((WebView) view, akVar) ? new C1292a(0, 1) : new C1292a(0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new C1292a(0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                C1292a a = mo14782a(viewGroup.getChildAt(i3), akVar);
                i += a.f2370nQ;
                i2 += a.f2371nR;
            }
            return new C1292a(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14783a(C1285ak akVar, WebView webView, String str) {
        akVar.mo14758aV();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!TextUtils.isEmpty(webView.getTitle())) {
                    akVar.mo14765h(webView.getTitle() + "\n" + optString);
                } else {
                    akVar.mo14765h(optString);
                }
            }
            if (akVar.mo14755aS()) {
                this.f2355nF.mo14771b(akVar);
            }
        } catch (JSONException e) {
            C1607gr.m4705S("Json string may be malformed.");
        } catch (Throwable th) {
            C1607gr.m4710a("Failed to get webview content.", th);
            this.f2356nG.mo15256b(th);
        }
    }

    /* renamed from: ba */
    public void mo14784ba() {
        synchronized (this.f2351mH) {
            if (this.mStarted) {
                C1607gr.m4705S("Content hash thread already started, quiting...");
                return;
            }
            this.mStarted = true;
            start();
        }
    }

    /* renamed from: bc */
    public C1285ak mo14785bc() {
        return this.f2355nF.mo14770aZ();
    }

    /* renamed from: bd */
    public void mo14786bd() {
        synchronized (this.f2351mH) {
            this.f2352nC = true;
            C1607gr.m4705S("ContentFetchThread: paused, mPause = " + this.f2352nC);
        }
    }

    /* renamed from: be */
    public boolean mo14787be() {
        return this.f2352nC;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo14788g(final View view) {
        if (view == null) {
            return false;
        }
        view.post(new Runnable() {
            public void run() {
                C1288an.this.mo14789h(view);
            }
        });
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14789h(View view) {
        try {
            C1285ak akVar = new C1285ak(this.f2360np, this.f2358nI, this.f2361nr, this.f2359nJ);
            C1292a a = mo14782a(view, akVar);
            akVar.mo14760aX();
            if (a.f2370nQ != 0 || a.f2371nR != 0) {
                if (a.f2371nR != 0 || akVar.mo14761aY() != 0) {
                    if (a.f2371nR != 0 || !this.f2355nF.mo14769a(akVar)) {
                        this.f2355nF.mo14772c(akVar);
                    }
                }
            }
        } catch (Exception e) {
            C1607gr.m4711b("Exception in fetchContentOnUIThread", e);
            this.f2356nG.mo15256b(e);
        }
    }

    public void run() {
        while (!this.f2353nD) {
            try {
                if (m3910bb()) {
                    Activity activity = this.f2354nE.getActivity();
                    if (activity == null) {
                        C1607gr.m4705S("ContentFetchThread: no activity");
                    } else {
                        m3908a(activity);
                    }
                } else {
                    C1607gr.m4705S("ContentFetchTask: sleeping");
                    mo14786bd();
                }
                Thread.sleep((long) (this.f2357nH * 1000));
            } catch (Throwable th) {
                C1607gr.m4711b("Error in ContentFetchTask", th);
                this.f2356nG.mo15256b(th);
            }
            synchronized (this.f2351mH) {
                while (this.f2352nC) {
                    try {
                        C1607gr.m4705S("ContentFetchTask: waiting");
                        this.f2351mH.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public void wakeup() {
        synchronized (this.f2351mH) {
            this.f2352nC = false;
            this.f2351mH.notifyAll();
            C1607gr.m4705S("ContentFetchThread: wakeup");
        }
    }
}
