package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.drive.DriveFile;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.gu */
public class C1610gu extends WebView implements DownloadListener {

    /* renamed from: mH */
    private final Object f3558mH = new Object();

    /* renamed from: mR */
    private final WindowManager f3559mR;

    /* renamed from: qI */
    private C1306ay f3560qI;

    /* renamed from: qJ */
    private final C1608gs f3561qJ;

    /* renamed from: tl */
    private final C1788k f3562tl;

    /* renamed from: wW */
    private final C1612gv f3563wW;

    /* renamed from: wX */
    private final C1611a f3564wX;

    /* renamed from: wY */
    private C1445dp f3565wY;

    /* renamed from: wZ */
    private boolean f3566wZ;

    /* renamed from: xa */
    private boolean f3567xa;

    /* renamed from: xb */
    private boolean f3568xb;

    /* renamed from: xc */
    private boolean f3569xc;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.gu$a */
    protected static class C1611a extends MutableContextWrapper {

        /* renamed from: mO */
        private Context f3570mO;

        /* renamed from: xd */
        private Activity f3571xd;

        public C1611a(Context context) {
            super(context);
            setBaseContext(context);
        }

        /* renamed from: dI */
        public Context mo15441dI() {
            return this.f3571xd;
        }

        public void setBaseContext(Context context) {
            this.f3570mO = context.getApplicationContext();
            this.f3571xd = context instanceof Activity ? (Activity) context : null;
            super.setBaseContext(this.f3570mO);
        }

        public void startActivity(Intent intent) {
            if (this.f3571xd != null) {
                this.f3571xd.startActivity(intent);
                return;
            }
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            this.f3570mO.startActivity(intent);
        }
    }

    protected C1610gu(C1611a aVar, C1306ay ayVar, boolean z, boolean z2, C1788k kVar, C1608gs gsVar) {
        super(aVar);
        WebChromeClient gwVar;
        this.f3564wX = aVar;
        this.f3560qI = ayVar;
        this.f3566wZ = z;
        this.f3562tl = kVar;
        this.f3561qJ = gsVar;
        this.f3559mR = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        C1591gi.m4646a((Context) aVar, gsVar.f3554wS, settings);
        if (Build.VERSION.SDK_INT >= 17) {
            C1604go.m4694a(getContext(), settings);
        } else if (Build.VERSION.SDK_INT >= 11) {
            C1599gm.m4681a(getContext(), settings);
        }
        setDownloadListener(this);
        this.f3563wW = Build.VERSION.SDK_INT >= 11 ? new C1623gx(this, z2) : new C1612gv(this, z2);
        setWebViewClient(this.f3563wW);
        if (Build.VERSION.SDK_INT >= 14) {
            new C1624gy(this);
        } else {
            gwVar = Build.VERSION.SDK_INT >= 11 ? new C1615gw(this) : gwVar;
            m4719dJ();
        }
        setWebChromeClient(gwVar);
        m4719dJ();
    }

    /* renamed from: a */
    public static C1610gu m4718a(Context context, C1306ay ayVar, boolean z, boolean z2, C1788k kVar, C1608gs gsVar) {
        return new C1610gu(new C1611a(context), ayVar, z, z2, kVar, gsVar);
    }

    /* renamed from: dJ */
    private void m4719dJ() {
        synchronized (this.f3558mH) {
            if (!this.f3566wZ) {
                if (!this.f3560qI.f2398oq) {
                    if (Build.VERSION.SDK_INT < 18) {
                        C1607gr.m4705S("Disabling hardware acceleration on an AdView.");
                        m4720dK();
                    } else {
                        C1607gr.m4705S("Enabling hardware acceleration on an AdView.");
                        m4721dL();
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 14) {
                C1607gr.m4705S("Disabling hardware acceleration on an overlay.");
                m4720dK();
            } else {
                C1607gr.m4705S("Enabling hardware acceleration on an overlay.");
                m4721dL();
            }
        }
    }

    /* renamed from: dK */
    private void m4720dK() {
        synchronized (this.f3558mH) {
            if (!this.f3567xa && Build.VERSION.SDK_INT >= 11) {
                C1599gm.m4685i(this);
            }
            this.f3567xa = true;
        }
    }

    /* renamed from: dL */
    private void m4721dL() {
        synchronized (this.f3558mH) {
            if (this.f3567xa && Build.VERSION.SDK_INT >= 11) {
                C1599gm.m4686j(this);
            }
            this.f3567xa = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo15414X(String str) {
        synchronized (this.f3558mH) {
            if (!isDestroyed()) {
                loadUrl(str);
            } else {
                C1607gr.m4709W("The webview is destroyed. Ignoring action.");
            }
        }
    }

    /* renamed from: a */
    public void mo15415a(Context context, C1306ay ayVar) {
        synchronized (this.f3558mH) {
            this.f3564wX.setBaseContext(context);
            this.f3565wY = null;
            this.f3560qI = ayVar;
            this.f3566wZ = false;
            this.f3569xc = false;
            C1591gi.m4657b(this);
            loadUrl("about:blank");
            this.f3563wW.reset();
            setOnTouchListener((View.OnTouchListener) null);
            setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    public void mo15416a(C1306ay ayVar) {
        synchronized (this.f3558mH) {
            this.f3560qI = ayVar;
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo15417a(C1445dp dpVar) {
        synchronized (this.f3558mH) {
            this.f3565wY = dpVar;
        }
    }

    /* renamed from: a */
    public void mo15418a(String str, Map<String, ?> map) {
        try {
            mo15421b(str, C1591gi.m4672t(map));
        } catch (JSONException e) {
            C1607gr.m4709W("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public void mo15419a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:" + str + "(");
        sb.append(jSONObject2);
        sb.append(");");
        mo15414X(sb.toString());
    }

    /* renamed from: ac */
    public C1306ay mo15420ac() {
        C1306ay ayVar;
        synchronized (this.f3558mH) {
            ayVar = this.f3560qI;
        }
        return ayVar;
    }

    /* renamed from: b */
    public void mo15421b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:AFMA_ReceiveMessage('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        C1607gr.m4708V("Dispatching AFMA event: " + sb);
        mo15414X(sb.toString());
    }

    /* renamed from: cb */
    public void mo15422cb() {
        if (mo15426dD().mo15456dN()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = this.f3559mR.getDefaultDisplay();
            defaultDisplay.getMetrics(displayMetrics);
            int s = C1591gi.m4671s(getContext());
            float f = 160.0f / ((float) displayMetrics.densityDpi);
            int round = Math.round(((float) displayMetrics.widthPixels) * f);
            try {
                mo15421b("onScreenInfoChanged", new JSONObject().put("width", round).put("height", Math.round(((float) (displayMetrics.heightPixels - s)) * f)).put("density", (double) displayMetrics.density).put("rotation", defaultDisplay.getRotation()));
            } catch (JSONException e) {
                C1607gr.m4711b("Error occured while obtaining screen information.", e);
            }
        }
    }

    /* renamed from: ci */
    public void mo15423ci() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f3561qJ.f3554wS);
        mo15418a("onshow", (Map<String, ?>) hashMap);
    }

    /* renamed from: cj */
    public void mo15424cj() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f3561qJ.f3554wS);
        mo15418a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: dC */
    public C1445dp mo15425dC() {
        C1445dp dpVar;
        synchronized (this.f3558mH) {
            dpVar = this.f3565wY;
        }
        return dpVar;
    }

    /* renamed from: dD */
    public C1612gv mo15426dD() {
        return this.f3563wW;
    }

    /* renamed from: dE */
    public boolean mo15427dE() {
        return this.f3569xc;
    }

    /* renamed from: dF */
    public C1788k mo15428dF() {
        return this.f3562tl;
    }

    /* renamed from: dG */
    public C1608gs mo15429dG() {
        return this.f3561qJ;
    }

    /* renamed from: dH */
    public boolean mo15430dH() {
        boolean z;
        synchronized (this.f3558mH) {
            z = this.f3566wZ;
        }
        return z;
    }

    /* renamed from: dI */
    public Context mo15431dI() {
        return this.f3564wX.mo15441dI();
    }

    public void destroy() {
        synchronized (this.f3558mH) {
            if (this.f3565wY != null) {
                this.f3565wY.close();
            }
            this.f3568xb = true;
            super.destroy();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3558mH
            monitor-enter(r0)
            boolean r1 = r2.isDestroyed()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = "The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.C1607gr.m4709W(r1)     // Catch:{ all -> 0x001b }
            if (r4 == 0) goto L_0x0014
            r1 = 0
            r4.onReceiveValue(r1)     // Catch:{ all -> 0x001b }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0016:
            super.evaluateJavascript(r3, r4)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1610gu.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.f3558mH) {
            z = this.f3568xb;
        }
        return z;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C1607gr.m4705S("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f3558mH
            monitor-enter(r0)
            boolean r1 = r8.isInEditMode()     // Catch:{ all -> 0x00bd }
            if (r1 != 0) goto L_0x00b8
            boolean r1 = r8.f3566wZ     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x000f
            goto L_0x00b8
        L_0x000f:
            int r1 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x00bd }
            int r2 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x00bd }
            int r3 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x00bd }
            int r4 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x00bd }
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r6) goto L_0x002d
            if (r1 != r5) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r1 = r7
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            if (r3 == r6) goto L_0x0032
            if (r3 != r5) goto L_0x0033
        L_0x0032:
            r7 = r4
        L_0x0033:
            com.google.android.gms.internal.ay r3 = r8.f3560qI     // Catch:{ all -> 0x00bd }
            int r3 = r3.widthPixels     // Catch:{ all -> 0x00bd }
            r5 = 8
            r6 = 0
            if (r3 > r1) goto L_0x0058
            com.google.android.gms.internal.ay r1 = r8.f3560qI     // Catch:{ all -> 0x00bd }
            int r1 = r1.heightPixels     // Catch:{ all -> 0x00bd }
            if (r1 <= r7) goto L_0x0043
            goto L_0x0058
        L_0x0043:
            int r1 = r8.getVisibility()     // Catch:{ all -> 0x00bd }
            if (r1 == r5) goto L_0x004c
            r8.setVisibility(r6)     // Catch:{ all -> 0x00bd }
        L_0x004c:
            com.google.android.gms.internal.ay r1 = r8.f3560qI     // Catch:{ all -> 0x00bd }
            int r1 = r1.widthPixels     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ay r2 = r8.f3560qI     // Catch:{ all -> 0x00bd }
            int r2 = r2.heightPixels     // Catch:{ all -> 0x00bd }
            r8.setMeasuredDimension(r1, r2)     // Catch:{ all -> 0x00bd }
            goto L_0x00b6
        L_0x0058:
            com.google.android.gms.internal.gu$a r1 = r8.f3564wX     // Catch:{ all -> 0x00bd }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x00bd }
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch:{ all -> 0x00bd }
            float r1 = r1.density     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r3.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r3.append(r7)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ay r7 = r8.f3560qI     // Catch:{ all -> 0x00bd }
            int r7 = r7.widthPixels     // Catch:{ all -> 0x00bd }
            float r7 = (float) r7     // Catch:{ all -> 0x00bd }
            float r7 = r7 / r1
            int r7 = (int) r7     // Catch:{ all -> 0x00bd }
            r3.append(r7)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = "x"
            r3.append(r7)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.ay r7 = r8.f3560qI     // Catch:{ all -> 0x00bd }
            int r7 = r7.heightPixels     // Catch:{ all -> 0x00bd }
            float r7 = (float) r7     // Catch:{ all -> 0x00bd }
            float r7 = r7 / r1
            int r7 = (int) r7     // Catch:{ all -> 0x00bd }
            r3.append(r7)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = " dp, but only has "
            r3.append(r7)     // Catch:{ all -> 0x00bd }
            float r2 = (float) r2     // Catch:{ all -> 0x00bd }
            float r2 = r2 / r1
            int r2 = (int) r2     // Catch:{ all -> 0x00bd }
            r3.append(r2)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "x"
            r3.append(r2)     // Catch:{ all -> 0x00bd }
            float r2 = (float) r4     // Catch:{ all -> 0x00bd }
            float r2 = r2 / r1
            int r1 = (int) r2     // Catch:{ all -> 0x00bd }
            r3.append(r1)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = " dp."
            r3.append(r1)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.C1607gr.m4709W(r1)     // Catch:{ all -> 0x00bd }
            int r1 = r8.getVisibility()     // Catch:{ all -> 0x00bd }
            if (r1 == r5) goto L_0x00b3
            r1 = 4
            r8.setVisibility(r1)     // Catch:{ all -> 0x00bd }
        L_0x00b3:
            r8.setMeasuredDimension(r6, r6)     // Catch:{ all -> 0x00bd }
        L_0x00b6:
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return
        L_0x00b8:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x00bd }
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return
        L_0x00bd:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1610gu.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3562tl != null) {
            this.f3562tl.mo15945a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: q */
    public void mo15438q(boolean z) {
        synchronized (this.f3558mH) {
            if (this.f3565wY != null) {
                this.f3565wY.mo15137q(z);
            } else {
                this.f3569xc = z;
            }
        }
    }

    public void setContext(Context context) {
        this.f3564wX.setBaseContext(context);
    }

    /* renamed from: z */
    public void mo15440z(boolean z) {
        synchronized (this.f3558mH) {
            this.f3566wZ = z;
            m4719dJ();
        }
    }
}
