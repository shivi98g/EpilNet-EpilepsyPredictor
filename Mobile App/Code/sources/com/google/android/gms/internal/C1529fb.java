package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.C1612gv;

@C1507ey
/* renamed from: com.google.android.gms.internal.fb */
public class C1529fb implements Runnable {
    /* access modifiers changed from: private */

    /* renamed from: li */
    public final int f3267li;
    /* access modifiers changed from: private */

    /* renamed from: lj */
    public final int f3268lj;

    /* renamed from: mo */
    protected final C1610gu f3269mo;
    /* access modifiers changed from: private */

    /* renamed from: tr */
    public final Handler f3270tr;
    /* access modifiers changed from: private */

    /* renamed from: ts */
    public final long f3271ts;
    /* access modifiers changed from: private */

    /* renamed from: tt */
    public long f3272tt;
    /* access modifiers changed from: private */

    /* renamed from: tu */
    public C1612gv.C1614a f3273tu;

    /* renamed from: tv */
    protected boolean f3274tv;

    /* renamed from: tw */
    protected boolean f3275tw;

    /* renamed from: com.google.android.gms.internal.fb$a */
    protected final class C1530a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: tx */
        private final WebView f3276tx;

        /* renamed from: ty */
        private Bitmap f3277ty;

        public C1530a(WebView webView) {
            this.f3276tx = webView;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            C1529fb.m4442c(C1529fb.this);
            if (bool.booleanValue() || C1529fb.this.mo15270cH() || C1529fb.this.f3272tt <= 0) {
                C1529fb.this.f3275tw = bool.booleanValue();
                C1529fb.this.f3273tu.mo14753a(C1529fb.this.f3269mo);
            } else if (C1529fb.this.f3272tt > 0) {
                if (C1607gr.m4714v(2)) {
                    C1607gr.m4705S("Ad not detected, scheduling another run.");
                }
                C1529fb.this.f3270tr.postDelayed(C1529fb.this, C1529fb.this.f3271ts);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public synchronized Boolean doInBackground(Void... voidArr) {
            int width = this.f3277ty.getWidth();
            int height = this.f3277ty.getHeight();
            boolean z = false;
            if (width != 0) {
                if (height != 0) {
                    int i = 0;
                    int i2 = 0;
                    while (i < width) {
                        int i3 = i2;
                        for (int i4 = 0; i4 < height; i4 += 10) {
                            if (this.f3277ty.getPixel(i, i4) != 0) {
                                i3++;
                            }
                        }
                        i += 10;
                        i2 = i3;
                    }
                    if (((double) i2) / (((double) (width * height)) / 100.0d) > 0.1d) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public synchronized void onPreExecute() {
            this.f3277ty = Bitmap.createBitmap(C1529fb.this.f3267li, C1529fb.this.f3268lj, Bitmap.Config.ARGB_8888);
            this.f3276tx.setVisibility(0);
            this.f3276tx.measure(View.MeasureSpec.makeMeasureSpec(C1529fb.this.f3267li, 0), View.MeasureSpec.makeMeasureSpec(C1529fb.this.f3268lj, 0));
            this.f3276tx.layout(0, 0, C1529fb.this.f3267li, C1529fb.this.f3268lj);
            this.f3276tx.draw(new Canvas(this.f3277ty));
            this.f3276tx.invalidate();
        }
    }

    public C1529fb(C1612gv.C1614a aVar, C1610gu guVar, int i, int i2) {
        this(aVar, guVar, i, i2, 200, 50);
    }

    public C1529fb(C1612gv.C1614a aVar, C1610gu guVar, int i, int i2, long j, long j2) {
        this.f3271ts = j;
        this.f3272tt = j2;
        this.f3270tr = new Handler(Looper.getMainLooper());
        this.f3269mo = guVar;
        this.f3273tu = aVar;
        this.f3274tv = false;
        this.f3275tw = false;
        this.f3268lj = i2;
        this.f3267li = i;
    }

    /* renamed from: c */
    static /* synthetic */ long m4442c(C1529fb fbVar) {
        long j = fbVar.f3272tt - 1;
        fbVar.f3272tt = j;
        return j;
    }

    /* renamed from: a */
    public void mo15266a(C1548fj fjVar, C1625gz gzVar) {
        this.f3269mo.setWebViewClient(gzVar);
        this.f3269mo.loadDataWithBaseURL(TextUtils.isEmpty(fjVar.f3333sg) ? null : C1591gi.m4638L(fjVar.f3333sg), fjVar.f3335tU, "text/html", "UTF-8", (String) null);
    }

    /* renamed from: b */
    public void mo15267b(C1548fj fjVar) {
        mo15266a(fjVar, new C1625gz(this, this.f3269mo, fjVar.f3344ud));
    }

    /* renamed from: cF */
    public void mo15268cF() {
        this.f3270tr.postDelayed(this, this.f3271ts);
    }

    /* renamed from: cG */
    public synchronized void mo15269cG() {
        this.f3274tv = true;
    }

    /* renamed from: cH */
    public synchronized boolean mo15270cH() {
        return this.f3274tv;
    }

    /* renamed from: cI */
    public boolean mo15271cI() {
        return this.f3275tw;
    }

    public void run() {
        if (this.f3269mo == null || mo15270cH()) {
            this.f3273tu.mo14753a(this.f3269mo);
        } else {
            new C1530a(this.f3269mo).execute(new Void[0]);
        }
    }
}
