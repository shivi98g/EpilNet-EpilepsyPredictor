package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.p000v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.C1460dx;
import com.google.android.gms.internal.C1612gv;

@C1507ey
/* renamed from: com.google.android.gms.internal.dp */
public class C1445dp extends C1460dx.C1461a {

    /* renamed from: rL */
    private static final int f2941rL = Color.argb(0, 0, 0, 0);

    /* renamed from: mo */
    private C1610gu f2942mo;

    /* renamed from: nB */
    private final Activity f2943nB;

    /* renamed from: rM */
    private C1451dr f2944rM;

    /* renamed from: rN */
    private C1453dt f2945rN;

    /* renamed from: rO */
    private C1449c f2946rO;

    /* renamed from: rP */
    private C1456du f2947rP;

    /* renamed from: rQ */
    private boolean f2948rQ;

    /* renamed from: rR */
    private boolean f2949rR = false;

    /* renamed from: rS */
    private FrameLayout f2950rS;

    /* renamed from: rT */
    private WebChromeClient.CustomViewCallback f2951rT;

    /* renamed from: rU */
    private boolean f2952rU = false;

    /* renamed from: rV */
    private boolean f2953rV = false;

    /* renamed from: rW */
    private boolean f2954rW = false;

    /* renamed from: rX */
    private RelativeLayout f2955rX;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.dp$a */
    private static final class C1447a extends Exception {
        public C1447a(String str) {
            super(str);
        }
    }

    @C1507ey
    /* renamed from: com.google.android.gms.internal.dp$b */
    private static final class C1448b extends RelativeLayout {

        /* renamed from: lJ */
        private final C1596gl f2957lJ;

        public C1448b(Context context, String str) {
            super(context);
            this.f2957lJ = new C1596gl(context, str);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f2957lJ.mo15401c(motionEvent);
            return false;
        }
    }

    @C1507ey
    /* renamed from: com.google.android.gms.internal.dp$c */
    private static final class C1449c {
        public final int index;

        /* renamed from: rZ */
        public final ViewGroup.LayoutParams f2958rZ;

        /* renamed from: sa */
        public final ViewGroup f2959sa;

        public C1449c(C1610gu guVar) throws C1447a {
            this.f2958rZ = guVar.getLayoutParams();
            ViewParent parent = guVar.getParent();
            if (parent instanceof ViewGroup) {
                this.f2959sa = (ViewGroup) parent;
                this.index = this.f2959sa.indexOfChild(guVar);
                this.f2959sa.removeView(guVar);
                guVar.mo15440z(true);
                return;
            }
            throw new C1447a("Could not get the parent of the WebView for an overlay.");
        }
    }

    public C1445dp(Activity activity) {
        this.f2943nB = activity;
    }

    /* renamed from: a */
    private static RelativeLayout.LayoutParams m4287a(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    /* renamed from: a */
    public static void m4288a(Context context, C1451dr drVar) {
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", drVar.f2960lO.f3557wV);
        C1451dr.m4306a(intent, drVar);
        if (!C1840ll.m5545in()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(DriveFile.MODE_READ_ONLY);
        }
        context.startActivity(intent);
    }

    /* renamed from: X */
    public void mo15117X() {
        this.f2948rQ = true;
    }

    /* renamed from: a */
    public void mo15118a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f2950rS = new FrameLayout(this.f2943nB);
        this.f2950rS.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f2950rS.addView(view, -1, -1);
        this.f2943nB.setContentView(this.f2950rS);
        mo15117X();
        this.f2951rT = customViewCallback;
        this.f2949rR = true;
    }

    /* renamed from: b */
    public void mo15119b(int i, int i2, int i3, int i4) {
        if (this.f2945rN != null) {
            this.f2945rN.setLayoutParams(m4287a(i, i2, i3, i4));
        }
    }

    /* renamed from: c */
    public void mo15120c(int i, int i2, int i3, int i4) {
        if (this.f2945rN == null) {
            this.f2945rN = new C1453dt(this.f2943nB, this.f2942mo);
            this.f2955rX.addView(this.f2945rN, 0, m4287a(i, i2, i3, i4));
            this.f2942mo.mo15426dD().mo15444A(false);
        }
    }

    /* renamed from: ce */
    public C1453dt mo15121ce() {
        return this.f2945rN;
    }

    /* renamed from: cf */
    public void mo15122cf() {
        if (this.f2944rM != null && this.f2949rR) {
            setRequestedOrientation(this.f2944rM.orientation);
        }
        if (this.f2950rS != null) {
            this.f2943nB.setContentView(this.f2955rX);
            mo15117X();
            this.f2950rS.removeAllViews();
            this.f2950rS = null;
        }
        if (this.f2951rT != null) {
            this.f2951rT.onCustomViewHidden();
            this.f2951rT = null;
        }
        this.f2949rR = false;
    }

    /* renamed from: cg */
    public void mo15123cg() {
        this.f2955rX.removeView(this.f2947rP);
        mo15136p(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ch */
    public void mo15124ch() {
        if (this.f2943nB.isFinishing() && !this.f2953rV) {
            this.f2953rV = true;
            if (this.f2943nB.isFinishing()) {
                if (this.f2942mo != null) {
                    mo15126cj();
                    this.f2955rX.removeView(this.f2942mo);
                    if (this.f2946rO != null) {
                        this.f2942mo.mo15440z(false);
                        this.f2946rO.f2959sa.addView(this.f2942mo, this.f2946rO.index, this.f2946rO.f2958rZ);
                    }
                }
                if (this.f2944rM != null && this.f2944rM.f2964sd != null) {
                    this.f2944rM.f2964sd.mo15153ag();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ci */
    public void mo15125ci() {
        this.f2942mo.mo15423ci();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cj */
    public void mo15126cj() {
        this.f2942mo.mo15424cj();
    }

    public void close() {
        this.f2943nB.finish();
    }

    public void onCreate(Bundle bundle) {
        Activity activity;
        this.f2952rU = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f2944rM = C1451dr.m4307b(this.f2943nB.getIntent());
            if (this.f2944rM == null) {
                throw new C1447a("Could not get info for ad overlay.");
            }
            if (this.f2944rM.f2974sn != null) {
                this.f2954rW = this.f2944rM.f2974sn.f4274mi;
            } else {
                this.f2954rW = false;
            }
            if (bundle == null) {
                if (this.f2944rM.f2964sd != null) {
                    this.f2944rM.f2964sd.mo15154ah();
                }
                if (!(this.f2944rM.f2971sk == 1 || this.f2944rM.f2963sc == null)) {
                    this.f2944rM.f2963sc.onAdClicked();
                }
            }
            switch (this.f2944rM.f2971sk) {
                case 1:
                    break;
                case 2:
                    this.f2946rO = new C1449c(this.f2944rM.f2965se);
                    break;
                case 3:
                    mo15138r(true);
                    return;
                case 4:
                    if (this.f2952rU) {
                        activity = this.f2943nB;
                    } else if (!C1442dm.m4283a(this.f2943nB, this.f2944rM.f2962sb, this.f2944rM.f2970sj)) {
                        activity = this.f2943nB;
                    } else {
                        return;
                    }
                    activity.finish();
                    return;
                default:
                    throw new C1447a("Could not determine ad overlay type.");
            }
            mo15138r(false);
        } catch (C1447a e) {
            C1607gr.m4709W(e.getMessage());
            this.f2943nB.finish();
        }
    }

    public void onDestroy() {
        if (this.f2945rN != null) {
            this.f2945rN.destroy();
        }
        if (this.f2942mo != null) {
            this.f2955rX.removeView(this.f2942mo);
        }
        mo15124ch();
    }

    public void onPause() {
        if (this.f2945rN != null) {
            this.f2945rN.pause();
        }
        mo15122cf();
        if (this.f2942mo != null && (!this.f2943nB.isFinishing() || this.f2946rO == null)) {
            C1591gi.m4652a((WebView) this.f2942mo);
        }
        mo15124ch();
    }

    public void onRestart() {
    }

    public void onResume() {
        if (this.f2944rM != null && this.f2944rM.f2971sk == 4) {
            if (this.f2952rU) {
                this.f2943nB.finish();
            } else {
                this.f2952rU = true;
            }
        }
        if (this.f2942mo != null) {
            C1591gi.m4657b(this.f2942mo);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2952rU);
    }

    public void onStart() {
    }

    public void onStop() {
        mo15124ch();
    }

    /* renamed from: p */
    public void mo15136p(boolean z) {
        this.f2947rP = new C1456du(this.f2943nB, z ? 50 : 32);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f2947rP.mo15171q(this.f2944rM.f2968sh);
        this.f2955rX.addView(this.f2947rP, layoutParams);
    }

    /* renamed from: q */
    public void mo15137q(boolean z) {
        if (this.f2947rP != null) {
            this.f2947rP.mo15171q(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo15138r(boolean z) throws C1447a {
        RelativeLayout relativeLayout;
        int i;
        if (!this.f2948rQ) {
            this.f2943nB.requestWindowFeature(1);
        }
        Window window = this.f2943nB.getWindow();
        if (!this.f2954rW || this.f2944rM.f2974sn.f4275ms) {
            window.setFlags(1024, 1024);
        }
        setRequestedOrientation(this.f2944rM.orientation);
        if (Build.VERSION.SDK_INT >= 11) {
            C1607gr.m4705S("Enabling hardware acceleration on the AdActivity window.");
            C1599gm.m4682a(window);
        }
        this.f2955rX = new C1448b(this.f2943nB, this.f2944rM.f2973sm);
        if (!this.f2954rW) {
            relativeLayout = this.f2955rX;
            i = ViewCompat.MEASURED_STATE_MASK;
        } else {
            relativeLayout = this.f2955rX;
            i = f2941rL;
        }
        relativeLayout.setBackgroundColor(i);
        this.f2943nB.setContentView(this.f2955rX);
        mo15117X();
        boolean dN = this.f2944rM.f2965se.mo15426dD().mo15456dN();
        if (z) {
            this.f2942mo = C1610gu.m4718a(this.f2943nB, this.f2944rM.f2965se.mo15420ac(), true, dN, (C1788k) null, this.f2944rM.f2960lO);
            this.f2942mo.mo15426dD().mo15449a((C2181t) null, (C1452ds) null, this.f2944rM.f2966sf, this.f2944rM.f2970sj, true, this.f2944rM.f2972sl, this.f2944rM.f2965se.mo15426dD().mo15455dM());
            this.f2942mo.mo15426dD().mo15447a((C1612gv.C1614a) new C1612gv.C1614a() {
                /* renamed from: a */
                public void mo14753a(C1610gu guVar) {
                    guVar.mo15423ci();
                }
            });
            if (this.f2944rM.f2961rH != null) {
                this.f2942mo.loadUrl(this.f2944rM.f2961rH);
            } else if (this.f2944rM.f2969si != null) {
                this.f2942mo.loadDataWithBaseURL(this.f2944rM.f2967sg, this.f2944rM.f2969si, "text/html", "UTF-8", (String) null);
            } else {
                throw new C1447a("No URL or HTML to display in ad overlay.");
            }
        } else {
            this.f2942mo = this.f2944rM.f2965se;
            this.f2942mo.setContext(this.f2943nB);
        }
        this.f2942mo.mo15417a(this);
        ViewParent parent = this.f2942mo.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f2942mo);
        }
        if (this.f2954rW) {
            this.f2942mo.setBackgroundColor(f2941rL);
        }
        this.f2955rX.addView(this.f2942mo, -1, -1);
        if (!z) {
            mo15125ci();
        }
        mo15136p(dN);
        if (this.f2942mo.mo15427dE()) {
            mo15137q(true);
        }
    }

    public void setRequestedOrientation(int i) {
        this.f2943nB.setRequestedOrientation(i);
    }
}
