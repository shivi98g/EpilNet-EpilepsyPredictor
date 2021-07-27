package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.internal.C1276ah;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.af */
public final class C1267af implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: mH */
    private final Object f2290mH;

    /* renamed from: mK */
    private final WeakReference<C1574fy> f2291mK;

    /* renamed from: mL */
    private WeakReference<ViewTreeObserver> f2292mL;

    /* renamed from: mM */
    private final WeakReference<View> f2293mM;
    /* access modifiers changed from: private */

    /* renamed from: mN */
    public final C1265ad f2294mN;

    /* renamed from: mO */
    private final Context f2295mO;

    /* renamed from: mP */
    private final C1276ah f2296mP;
    /* access modifiers changed from: private */

    /* renamed from: mQ */
    public boolean f2297mQ;

    /* renamed from: mR */
    private final WindowManager f2298mR;

    /* renamed from: mS */
    private final PowerManager f2299mS;

    /* renamed from: mT */
    private final KeyguardManager f2300mT;

    /* renamed from: mU */
    private C1275ag f2301mU;

    /* renamed from: mV */
    private boolean f2302mV;

    /* renamed from: mW */
    private final BlockingQueue<Runnable> f2303mW;

    /* renamed from: mX */
    private long f2304mX;

    /* renamed from: mY */
    private boolean f2305mY;

    /* renamed from: mZ */
    private boolean f2306mZ;

    /* renamed from: my */
    private boolean f2307my;

    /* renamed from: na */
    private BroadcastReceiver f2308na;

    /* renamed from: nb */
    private final HashSet<C1264ac> f2309nb;

    public C1267af(Context context, C1306ay ayVar, C1574fy fyVar, View view, C1608gs gsVar) {
        this(ayVar, fyVar, gsVar, view, (C1276ah) new C1281aj(context, gsVar));
    }

    public C1267af(C1306ay ayVar, C1574fy fyVar, C1608gs gsVar, final View view, C1276ah ahVar) {
        this.f2290mH = new Object();
        this.f2307my = false;
        this.f2302mV = false;
        this.f2303mW = new ArrayBlockingQueue(2);
        this.f2304mX = Long.MIN_VALUE;
        this.f2309nb = new HashSet<>();
        this.f2291mK = new WeakReference<>(fyVar);
        this.f2293mM = new WeakReference<>(view);
        this.f2292mL = new WeakReference<>((Object) null);
        this.f2305mY = true;
        this.f2294mN = new C1265ad(UUID.randomUUID().toString(), gsVar, ayVar.f2397op, fyVar.f3456vD);
        this.f2296mP = ahVar;
        this.f2298mR = (WindowManager) view.getContext().getSystemService("window");
        this.f2299mS = (PowerManager) view.getContext().getApplicationContext().getSystemService("power");
        this.f2300mT = (KeyguardManager) view.getContext().getSystemService("keyguard");
        this.f2295mO = view.getContext().getApplicationContext();
        mo14710a(ahVar);
        this.f2296mP.mo14739a(new C1276ah.C1277a() {
            /* renamed from: aR */
            public void mo14734aR() {
                boolean unused = C1267af.this.f2297mQ = true;
                C1267af.this.mo14723d(view);
                C1267af.this.mo14713aI();
            }
        });
        mo14722b(this.f2296mP);
        try {
            final JSONObject e = mo14725e(view);
            this.f2303mW.add(new Runnable() {
                public void run() {
                    C1267af.this.mo14711a(e);
                }
            });
        } catch (Throwable th) {
        }
        this.f2303mW.add(new Runnable() {
            public void run() {
                C1267af.this.mo14728g(false);
            }
        });
        C1607gr.m4705S("Tracking ad unit: " + this.f2294mN.mo14697aH());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo14706a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14707a(View view, Map<String, String> map) {
        mo14728g(false);
    }

    /* renamed from: a */
    public void mo14708a(C1264ac acVar) {
        this.f2309nb.add(acVar);
    }

    /* renamed from: a */
    public void mo14709a(C1275ag agVar) {
        synchronized (this.f2290mH) {
            this.f2301mU = agVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14710a(C1276ah ahVar) {
        ahVar.mo14744f("https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14711a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONArray.put(jSONObject);
            jSONObject2.put("units", jSONArray);
            this.f2296mP.mo14742a("AFMA_updateActiveView", jSONObject2);
        } catch (Throwable th) {
            C1607gr.m4711b("Skipping active view message.", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14712a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f2294mN.mo14697aH());
    }

    /* access modifiers changed from: protected */
    /* renamed from: aI */
    public void mo14713aI() {
        synchronized (this.f2290mH) {
            if (this.f2308na == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                this.f2308na = new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        C1267af.this.mo14728g(false);
                    }
                };
                this.f2295mO.registerReceiver(this.f2308na, intentFilter);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aJ */
    public void mo14714aJ() {
        synchronized (this.f2290mH) {
            if (this.f2308na != null) {
                this.f2295mO.unregisterReceiver(this.f2308na);
                this.f2308na = null;
            }
        }
    }

    /* renamed from: aK */
    public void mo14715aK() {
        synchronized (this.f2290mH) {
            if (this.f2305mY) {
                this.f2306mZ = true;
                try {
                    mo14711a(mo14721aQ());
                } catch (JSONException e) {
                    C1607gr.m4711b("JSON Failure while processing active view data.", e);
                }
                C1607gr.m4705S("Untracking ad unit: " + this.f2294mN.mo14697aH());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aL */
    public void mo14716aL() {
        if (this.f2301mU != null) {
            this.f2301mU.mo14700a(this);
        }
    }

    /* renamed from: aM */
    public boolean mo14717aM() {
        boolean z;
        synchronized (this.f2290mH) {
            z = this.f2305mY;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r1 = (android.view.ViewTreeObserver) r2.f2292mL.get();
     */
    /* renamed from: aN */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14718aN() {
        /*
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f2293mM
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r2.f2292mL
            java.lang.Object r1 = r1.get()
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 != r1) goto L_0x001a
            return
        L_0x001a:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2.f2292mL = r1
            r0.addOnScrollChangedListener(r2)
            r0.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1267af.mo14718aN():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: aO */
    public void mo14719aO() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f2292mL.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aP */
    public JSONObject mo14720aP() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f2294mN.mo14695aF()).put("activeViewJSON", this.f2294mN.mo14696aG()).put("timestamp", C1579ga.m4593dc().mo15361dd().elapsedRealtime()).put("adFormat", this.f2294mN.mo14694aE()).put("hashCode", this.f2294mN.mo14697aH());
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aQ */
    public JSONObject mo14721aQ() throws JSONException {
        JSONObject aP = mo14720aP();
        aP.put("doneReasonCode", "u");
        return aP;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14722b(C1276ah ahVar) {
        ahVar.mo14741a("/updateActiveView", (C1374cd) new C1374cd() {
            /* renamed from: a */
            public void mo14738a(C1610gu guVar, Map<String, String> map) {
                if (C1267af.this.mo14712a(map)) {
                    C1267af.this.mo14707a((View) guVar, map);
                }
            }
        });
        ahVar.mo14741a("/untrackActiveViewUnit", (C1374cd) new C1374cd() {
            /* renamed from: a */
            public void mo14738a(C1610gu guVar, Map<String, String> map) {
                if (C1267af.this.mo14712a(map)) {
                    C1607gr.m4705S("Received request to untrack: " + C1267af.this.f2294mN.mo14697aH());
                    C1267af.this.destroy();
                }
            }
        });
        ahVar.mo14741a("/visibilityChanged", (C1374cd) new C1374cd() {
            /* renamed from: a */
            public void mo14738a(C1610gu guVar, Map<String, String> map) {
                if (C1267af.this.mo14712a(map) && map.containsKey("isVisible")) {
                    C1267af.this.mo14726f(Boolean.valueOf("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"))).booleanValue());
                }
            }
        });
        ahVar.mo14741a("/viewabilityChanged", C1364cc.f2786pQ);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14723d(View view) {
        ArrayList arrayList = new ArrayList();
        this.f2303mW.drainTo(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* access modifiers changed from: protected */
    public void destroy() {
        synchronized (this.f2290mH) {
            mo14719aO();
            mo14714aJ();
            this.f2305mY = false;
            try {
                this.f2296mP.destroy();
            } catch (Throwable th) {
            }
            mo14716aL();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public JSONObject mo14725e(View view) throws JSONException {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        view.getLocationInWindow(new int[2]);
        JSONObject aP = mo14720aP();
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.f2298mR.getDefaultDisplay().getWidth();
        rect2.bottom = this.f2298mR.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, (Point) null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        aP.put("viewBox", new JSONObject().put("top", mo14706a(rect2.top, displayMetrics)).put("bottom", mo14706a(rect2.bottom, displayMetrics)).put("left", mo14706a(rect2.left, displayMetrics)).put("right", mo14706a(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", mo14706a(rect.top, displayMetrics)).put("bottom", mo14706a(rect.bottom, displayMetrics)).put("left", mo14706a(rect.left, displayMetrics)).put("right", mo14706a(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", mo14706a(rect3.top, displayMetrics)).put("bottom", mo14706a(rect3.bottom, displayMetrics)).put("left", mo14706a(rect3.left, displayMetrics)).put("right", mo14706a(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", mo14706a(rect4.top, displayMetrics)).put("bottom", mo14706a(rect4.bottom, displayMetrics)).put("left", mo14706a(rect4.left, displayMetrics)).put("right", mo14706a(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", mo14706a(rect5.top, displayMetrics)).put("bottom", mo14706a(rect5.bottom, displayMetrics)).put("left", mo14706a(rect5.left, displayMetrics)).put("right", mo14706a(rect5.right, displayMetrics))).put("windowVisibility", view.getWindowVisibility()).put("screenDensity", (double) displayMetrics.density).put("isVisible", mo14727f(view)).put("isStopped", this.f2302mV).put("isPaused", this.f2307my);
        if (C1840ll.m5544im()) {
            aP.put("isAttachedToWindow", view.isAttachedToWindow());
        }
        return aP;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo14726f(boolean z) {
        Iterator<C1264ac> it = this.f2309nb.iterator();
        while (it.hasNext()) {
            it.next().mo14684a(this, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo14727f(View view) {
        return view.getVisibility() == 0 && view.isShown() && this.f2299mS.isScreenOn() && !this.f2300mT.inKeyguardRestrictedInputMode();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[Catch:{ JSONException -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC, Splitter:B:24:0x0046] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14728g(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2290mH
            monitor-enter(r0)
            boolean r1 = r7.f2297mQ     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            boolean r1 = r7.f2305mY     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x000c
            goto L_0x005c
        L_0x000c:
            com.google.android.gms.internal.ga r1 = com.google.android.gms.internal.C1579ga.m4593dc()     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ld r1 = r1.mo15361dd()     // Catch:{ all -> 0x005e }
            long r1 = r1.elapsedRealtime()     // Catch:{ all -> 0x005e }
            if (r8 == 0) goto L_0x0025
            long r3 = r7.f2304mX     // Catch:{ all -> 0x005e }
            r5 = 200(0xc8, double:9.9E-322)
            long r3 = r3 + r5
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0025
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0025:
            r7.f2304mX = r1     // Catch:{ all -> 0x005e }
            java.lang.ref.WeakReference<com.google.android.gms.internal.fy> r8 = r7.f2291mK     // Catch:{ all -> 0x005e }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.fy r8 = (com.google.android.gms.internal.C1574fy) r8     // Catch:{ all -> 0x005e }
            java.lang.ref.WeakReference<android.view.View> r1 = r7.f2293mM     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005e }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x003e
            if (r8 != 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r8 = 0
            goto L_0x003f
        L_0x003e:
            r8 = 1
        L_0x003f:
            if (r8 == 0) goto L_0x0046
            r7.mo14715aK()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0046:
            org.json.JSONObject r8 = r7.mo14725e(r1)     // Catch:{ JSONException -> 0x004e }
            r7.mo14711a((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x004e }
            goto L_0x0054
        L_0x004e:
            r8 = move-exception
            java.lang.String r1 = "Active view update failed."
            com.google.android.gms.internal.C1607gr.m4710a(r1, r8)     // Catch:{ all -> 0x005e }
        L_0x0054:
            r7.mo14718aN()     // Catch:{ all -> 0x005e }
            r7.mo14716aL()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1267af.mo14728g(boolean):void");
    }

    public void onGlobalLayout() {
        mo14728g(false);
    }

    public void onScrollChanged() {
        mo14728g(true);
    }

    public void pause() {
        synchronized (this.f2290mH) {
            this.f2307my = true;
            mo14728g(false);
            this.f2296mP.pause();
        }
    }

    public void resume() {
        synchronized (this.f2290mH) {
            this.f2296mP.resume();
            this.f2307my = false;
            mo14728g(false);
        }
    }

    public void stop() {
        synchronized (this.f2290mH) {
            this.f2302mV = true;
            mo14728g(false);
            this.f2296mP.pause();
        }
    }
}
