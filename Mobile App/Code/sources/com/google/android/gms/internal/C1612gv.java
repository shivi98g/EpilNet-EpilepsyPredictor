package com.google.android.gms.internal;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;

@C1507ey
/* renamed from: com.google.android.gms.internal.gv */
public class C1612gv extends WebViewClient {

    /* renamed from: mH */
    private final Object f3572mH;

    /* renamed from: mo */
    protected final C1610gu f3573mo;

    /* renamed from: pP */
    private C1363cb f3574pP;

    /* renamed from: qa */
    private C1377cg f3575qa;

    /* renamed from: qc */
    private C1375ce f3576qc;

    /* renamed from: qd */
    private C2189v f3577qd;

    /* renamed from: tu */
    private C1614a f3578tu;

    /* renamed from: xe */
    private final HashMap<String, C1374cd> f3579xe;

    /* renamed from: xf */
    private C2181t f3580xf;

    /* renamed from: xg */
    private C1452ds f3581xg;

    /* renamed from: xh */
    private boolean f3582xh;

    /* renamed from: xi */
    private boolean f3583xi;

    /* renamed from: xj */
    private C1457dv f3584xj;

    /* renamed from: xk */
    private final C1441dl f3585xk;

    /* renamed from: com.google.android.gms.internal.gv$a */
    public interface C1614a {
        /* renamed from: a */
        void mo14753a(C1610gu guVar);
    }

    public C1612gv(C1610gu guVar, boolean z) {
        this(guVar, z, new C1441dl(guVar, guVar.getContext(), new C1329bl(guVar.getContext())));
    }

    C1612gv(C1610gu guVar, boolean z, C1441dl dlVar) {
        this.f3579xe = new HashMap<>();
        this.f3572mH = new Object();
        this.f3582xh = false;
        this.f3573mo = guVar;
        this.f3583xi = z;
        this.f3585xk = dlVar;
    }

    /* renamed from: d */
    private static boolean m4743d(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    /* renamed from: e */
    private void m4744e(Uri uri) {
        String path = uri.getPath();
        C1374cd cdVar = this.f3579xe.get(path);
        if (cdVar != null) {
            Map<String, String> c = C1591gi.m4659c(uri);
            if (C1607gr.m4714v(2)) {
                C1607gr.m4708V("Received GMSG: " + path);
                for (String next : c.keySet()) {
                    C1607gr.m4708V("  " + next + ": " + c.get(next));
                }
            }
            cdVar.mo14738a(this.f3573mo, c);
            return;
        }
        C1607gr.m4708V("No GMSG handler found for GMSG: " + uri);
    }

    /* renamed from: A */
    public final void mo15444A(boolean z) {
        this.f3582xh = z;
    }

    /* renamed from: a */
    public final void mo15445a(C1444do doVar) {
        boolean dH = this.f3573mo.mo15430dH();
        mo15446a(new C1451dr(doVar, (!dH || this.f3573mo.mo15420ac().f2398oq) ? this.f3580xf : null, dH ? null : this.f3581xg, this.f3584xj, this.f3573mo.mo15429dG()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15446a(C1451dr drVar) {
        C1445dp.m4288a(this.f3573mo.getContext(), drVar);
    }

    /* renamed from: a */
    public final void mo15447a(C1614a aVar) {
        this.f3578tu = aVar;
    }

    /* renamed from: a */
    public void mo15448a(C2181t tVar, C1452ds dsVar, C1363cb cbVar, C1457dv dvVar, boolean z, C1375ce ceVar, C1377cg cgVar, C2189v vVar) {
        C1377cg cgVar2 = cgVar;
        mo15449a(tVar, dsVar, cbVar, dvVar, z, ceVar, vVar);
        mo15450a("/setInterstitialProperties", (C1374cd) new C1376cf(cgVar2));
        this.f3575qa = cgVar2;
    }

    /* renamed from: a */
    public void mo15449a(C2181t tVar, C1452ds dsVar, C1363cb cbVar, C1457dv dvVar, boolean z, C1375ce ceVar, C2189v vVar) {
        if (vVar == null) {
            vVar = new C2189v(false);
        }
        mo15450a("/appEvent", (C1374cd) new C1362ca(cbVar));
        mo15450a("/canOpenURLs", C1364cc.f2787pR);
        mo15450a("/canOpenIntents", C1364cc.f2788pS);
        mo15450a("/click", C1364cc.f2789pT);
        mo15450a("/close", C1364cc.f2790pU);
        mo15450a("/customClose", C1364cc.f2791pV);
        mo15450a("/httpTrack", C1364cc.f2792pW);
        mo15450a("/log", C1364cc.f2793pX);
        mo15450a("/open", (C1374cd) new C1379ci(ceVar, vVar));
        mo15450a("/touch", C1364cc.f2794pY);
        mo15450a("/video", C1364cc.f2795pZ);
        mo15450a("/mraid", (C1374cd) new C1378ch());
        this.f3580xf = tVar;
        this.f3581xg = dsVar;
        this.f3574pP = cbVar;
        this.f3576qc = ceVar;
        this.f3584xj = dvVar;
        this.f3577qd = vVar;
        mo15444A(z);
    }

    /* renamed from: a */
    public final void mo15450a(String str, C1374cd cdVar) {
        this.f3579xe.put(str, cdVar);
    }

    /* renamed from: a */
    public final void mo15451a(boolean z, int i) {
        mo15446a(new C1451dr((!this.f3573mo.mo15430dH() || this.f3573mo.mo15420ac().f2398oq) ? this.f3580xf : null, this.f3581xg, this.f3584xj, this.f3573mo, z, i, this.f3573mo.mo15429dG()));
    }

    /* renamed from: a */
    public final void mo15452a(boolean z, int i, String str) {
        boolean dH = this.f3573mo.mo15430dH();
        mo15446a(new C1451dr((!dH || this.f3573mo.mo15420ac().f2398oq) ? this.f3580xf : null, dH ? null : this.f3581xg, this.f3574pP, this.f3584xj, this.f3573mo, z, i, str, this.f3573mo.mo15429dG(), this.f3576qc));
    }

    /* renamed from: a */
    public final void mo15453a(boolean z, int i, String str, String str2) {
        boolean dH = this.f3573mo.mo15430dH();
        mo15446a(new C1451dr((!dH || this.f3573mo.mo15420ac().f2398oq) ? this.f3580xf : null, dH ? null : this.f3581xg, this.f3574pP, this.f3584xj, this.f3573mo, z, i, str, str2, this.f3573mo.mo15429dG(), this.f3576qc));
    }

    /* renamed from: cg */
    public final void mo15454cg() {
        synchronized (this.f3572mH) {
            this.f3582xh = false;
            this.f3583xi = true;
            final C1445dp dC = this.f3573mo.mo15425dC();
            if (dC != null) {
                if (!C1606gq.m4703dB()) {
                    C1606gq.f3553wR.post(new Runnable() {
                        public void run() {
                            dC.mo15123cg();
                        }
                    });
                } else {
                    dC.mo15123cg();
                }
            }
        }
    }

    /* renamed from: dM */
    public C2189v mo15455dM() {
        return this.f3577qd;
    }

    /* renamed from: dN */
    public boolean mo15456dN() {
        boolean z;
        synchronized (this.f3572mH) {
            z = this.f3583xi;
        }
        return z;
    }

    /* renamed from: dO */
    public void mo15457dO() {
        if (mo15456dN()) {
            this.f3585xk.mo15106bY();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        C1607gr.m4708V("Loading resource: " + str);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m4744e(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (this.f3578tu != null) {
            this.f3578tu.mo14753a(this.f3573mo);
            this.f3578tu = null;
        }
    }

    public final void reset() {
        synchronized (this.f3572mH) {
            this.f3579xe.clear();
            this.f3580xf = null;
            this.f3581xg = null;
            this.f3578tu = null;
            this.f3574pP = null;
            this.f3582xh = false;
            this.f3583xi = false;
            this.f3576qc = null;
            this.f3584xj = null;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C1607gr.m4708V("AdWebView shouldOverrideUrlLoading: " + str);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m4744e(parse);
            return true;
        } else if (this.f3582xh && webView == this.f3573mo && m4743d(parse)) {
            return super.shouldOverrideUrlLoading(webView, str);
        } else {
            if (!this.f3573mo.willNotDraw()) {
                try {
                    C1788k dF = this.f3573mo.mo15428dF();
                    if (dF != null && dF.mo15947b(parse)) {
                        parse = dF.mo15944a(parse, this.f3573mo.getContext());
                    }
                } catch (C1828l e) {
                    C1607gr.m4709W("Unable to append parameter to URL: " + str);
                }
                if (this.f3577qd == null || this.f3577qd.mo17150az()) {
                    mo15445a(new C1444do("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                    return true;
                }
                this.f3577qd.mo17151d(str);
                return true;
            }
            C1607gr.m4709W("AdWebView unable to handle URL: " + str);
            return true;
        }
    }
}
