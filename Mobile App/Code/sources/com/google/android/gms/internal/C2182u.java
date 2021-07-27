package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ViewSwitcher;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C0967d;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.internal.C1314bd;
import com.google.android.gms.internal.C1343bv;
import com.google.android.gms.internal.C1508ez;
import com.google.android.gms.internal.C1531fc;
import com.google.android.gms.internal.C1545fh;
import com.google.android.gms.internal.C1574fy;
import com.google.android.gms.internal.C2189v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@C1507ey
/* renamed from: com.google.android.gms.internal.u */
public class C2182u extends C1314bd.C1315a implements C1363cb, C1375ce, C1377cg, C1394cs, C1452ds, C1457dv, C1479ej, C1508ez.C1509a, C1531fc.C1532a, C1581gc, C2181t, C2192w {

    /* renamed from: lA */
    private final C1402cy f4224lA;
    /* access modifiers changed from: private */

    /* renamed from: lB */
    public final C2188b f4225lB;

    /* renamed from: lC */
    private final C1261ab f4226lC;

    /* renamed from: lD */
    private final C1266ae f4227lD;

    /* renamed from: lE */
    private boolean f4228lE;

    /* renamed from: lF */
    private final ComponentCallbacks f4229lF;

    /* renamed from: lz */
    private C1303av f4230lz;

    @C1507ey
    /* renamed from: com.google.android.gms.internal.u$a */
    private static final class C2187a extends ViewSwitcher {
        /* access modifiers changed from: private */

        /* renamed from: lJ */
        public final C1596gl f4238lJ;

        public C2187a(Context context) {
            super(context);
            this.f4238lJ = new C1596gl(context);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f4238lJ.mo15401c(motionEvent);
            return false;
        }
    }

    @C1507ey
    /* renamed from: com.google.android.gms.internal.u$b */
    static class C2188b {

        /* renamed from: lK */
        public final C2187a f4239lK;

        /* renamed from: lL */
        public final String f4240lL;

        /* renamed from: lM */
        public final Context f4241lM;

        /* renamed from: lN */
        public final C1788k f4242lN;

        /* renamed from: lO */
        public final C1608gs f4243lO;

        /* renamed from: lP */
        public C1311bc f4244lP;

        /* renamed from: lQ */
        public C1584gf f4245lQ;

        /* renamed from: lR */
        public C1584gf f4246lR;

        /* renamed from: lS */
        public C1306ay f4247lS;

        /* renamed from: lT */
        public C1574fy f4248lT;

        /* renamed from: lU */
        public C1574fy.C1575a f4249lU;

        /* renamed from: lV */
        public C1576fz f4250lV;

        /* renamed from: lW */
        public C1320bf f4251lW;

        /* renamed from: lX */
        public C1497er f4252lX;

        /* renamed from: lY */
        public C1485en f4253lY;

        /* renamed from: lZ */
        public C1349by f4254lZ;

        /* renamed from: ma */
        public C1350bz f4255ma;

        /* renamed from: mb */
        public C1337br f4256mb;

        /* renamed from: mc */
        public List<String> f4257mc;

        /* renamed from: md */
        public C1480ek f4258md;

        /* renamed from: me */
        public C1582gd f4259me = null;

        /* renamed from: mf */
        public View f4260mf = null;

        /* renamed from: mg */
        public int f4261mg = 0;

        /* renamed from: mh */
        public boolean f4262mh = false;

        /* renamed from: mi */
        public boolean f4263mi = false;

        /* renamed from: mj */
        private HashSet<C1576fz> f4264mj = null;

        public C2188b(Context context, C1306ay ayVar, String str, C1608gs gsVar) {
            if (ayVar.f2398oq) {
                this.f4239lK = null;
            } else {
                this.f4239lK = new C2187a(context);
                this.f4239lK.setMinimumWidth(ayVar.widthPixels);
                this.f4239lK.setMinimumHeight(ayVar.heightPixels);
                this.f4239lK.setVisibility(4);
            }
            this.f4247lS = ayVar;
            this.f4240lL = str;
            this.f4241lM = context;
            this.f4243lO = gsVar;
            this.f4242lN = new C1788k(new C2193x(this));
        }

        /* renamed from: a */
        public void mo17146a(HashSet<C1576fz> hashSet) {
            this.f4264mj = hashSet;
        }

        /* renamed from: ay */
        public HashSet<C1576fz> mo17147ay() {
            return this.f4264mj;
        }
    }

    public C2182u(Context context, C1306ay ayVar, String str, C1402cy cyVar, C1608gs gsVar) {
        this(new C2188b(context, ayVar, str, gsVar), cyVar, (C1261ab) null);
    }

    C2182u(C2188b bVar, C1402cy cyVar, C1261ab abVar) {
        this.f4229lF = new ComponentCallbacks() {
            public void onConfigurationChanged(Configuration configuration) {
                if (C2182u.this.f4225lB != null && C2182u.this.f4225lB.f4248lT != null && C2182u.this.f4225lB.f4248lT.f3448se != null) {
                    C2182u.this.f4225lB.f4248lT.f3448se.mo15422cb();
                }
            }

            public void onLowMemory() {
            }
        };
        this.f4225lB = bVar;
        this.f4224lA = cyVar;
        this.f4226lC = abVar == null ? new C1261ab(this) : abVar;
        this.f4227lD = new C1266ae();
        C1591gi.m4669q(this.f4225lB.f4241lM);
        C1579ga.m4588a(this.f4225lB.f4241lM, this.f4225lB.f4243lO);
        m6537ad();
    }

    /* renamed from: a */
    private C1545fh.C1546a m6533a(C1303av avVar, Bundle bundle) {
        PackageInfo packageInfo;
        Bundle bundle2;
        ApplicationInfo applicationInfo = this.f4225lB.f4241lM.getApplicationInfo();
        int i = 0;
        try {
            packageInfo = this.f4225lB.f4241lM.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        if (this.f4225lB.f4247lS.f2398oq || this.f4225lB.f4239lK.getParent() == null) {
            bundle2 = null;
        } else {
            int[] iArr = new int[2];
            this.f4225lB.f4239lK.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            DisplayMetrics displayMetrics = this.f4225lB.f4241lM.getResources().getDisplayMetrics();
            int width = this.f4225lB.f4239lK.getWidth();
            int height = this.f4225lB.f4239lK.getHeight();
            if (this.f4225lB.f4239lK.isShown() && i2 + width > 0 && i3 + height > 0 && i2 <= displayMetrics.widthPixels && i3 <= displayMetrics.heightPixels) {
                i = 1;
            }
            Bundle bundle3 = new Bundle(5);
            bundle3.putInt("x", i2);
            bundle3.putInt("y", i3);
            bundle3.putInt("width", width);
            bundle3.putInt("height", height);
            bundle3.putInt("visible", i);
            bundle2 = bundle3;
        }
        String df = C1579ga.m4594df();
        this.f4225lB.f4250lV = new C1576fz(df, this.f4225lB.f4240lL);
        C1303av avVar2 = avVar;
        this.f4225lB.f4250lV.mo15339e(avVar2);
        return new C1545fh.C1546a(bundle2, avVar2, this.f4225lB.f4247lS, this.f4225lB.f4240lL, applicationInfo, packageInfo, df, C1579ga.f3484vY, this.f4225lB.f4243lO, C1579ga.m4587a(this.f4225lB.f4241lM, this, df), this.f4225lB.f4257mc, bundle, C1579ga.m4597dl());
    }

    /* renamed from: a */
    private C1610gu m6534a(C2189v vVar) {
        C1610gu guVar;
        if (this.f4225lB.f4247lS.f2398oq) {
            C1610gu a = C1610gu.m4718a(this.f4225lB.f4241lM, this.f4225lB.f4247lS, false, false, this.f4225lB.f4242lN, this.f4225lB.f4243lO);
            a.mo15426dD().mo15448a(this, (C1452ds) null, this, this, true, this, this, vVar);
            return a;
        }
        View nextView = this.f4225lB.f4239lK.getNextView();
        if (nextView instanceof C1610gu) {
            guVar = (C1610gu) nextView;
            guVar.mo15415a(this.f4225lB.f4241lM, this.f4225lB.f4247lS);
        } else {
            if (nextView != null) {
                this.f4225lB.f4239lK.removeView(nextView);
            }
            guVar = C1610gu.m4718a(this.f4225lB.f4241lM, this.f4225lB.f4247lS, false, false, this.f4225lB.f4242lN, this.f4225lB.f4243lO);
            if (this.f4225lB.f4247lS.f2399or == null) {
                m6547c(guVar);
            }
        }
        guVar.mo15426dD().mo15449a(this, this, this, this, false, this, vVar);
        return guVar;
    }

    /* renamed from: a */
    private void m6536a(int i) {
        C1607gr.m4709W("Failed to load ad: " + i);
        if (this.f4225lB.f4244lP != null) {
            try {
                this.f4225lB.f4244lP.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    /* renamed from: ad */
    private void m6537ad() {
        if (Build.VERSION.SDK_INT >= 14 && this.f4225lB != null && this.f4225lB.f4241lM != null) {
            this.f4225lB.f4241lM.registerComponentCallbacks(this.f4229lF);
        }
    }

    /* renamed from: ae */
    private void m6538ae() {
        if (Build.VERSION.SDK_INT >= 14 && this.f4225lB != null && this.f4225lB.f4241lM != null) {
            this.f4225lB.f4241lM.unregisterComponentCallbacks(this.f4229lF);
        }
    }

    /* renamed from: ao */
    private void m6539ao() {
        C1607gr.m4707U("Ad closing.");
        if (this.f4225lB.f4244lP != null) {
            try {
                this.f4225lB.f4244lP.onAdClosed();
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not call AdListener.onAdClosed().", e);
            }
        }
    }

    /* renamed from: ap */
    private void m6540ap() {
        C1607gr.m4707U("Ad leaving application.");
        if (this.f4225lB.f4244lP != null) {
            try {
                this.f4225lB.f4244lP.onAdLeftApplication();
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
    }

    /* renamed from: aq */
    private void m6541aq() {
        C1607gr.m4707U("Ad opening.");
        if (this.f4225lB.f4244lP != null) {
            try {
                this.f4225lB.f4244lP.onAdOpened();
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not call AdListener.onAdOpened().", e);
            }
        }
    }

    /* renamed from: ar */
    private void m6542ar() {
        C1607gr.m4707U("Ad finished loading.");
        if (this.f4225lB.f4244lP != null) {
            try {
                this.f4225lB.f4244lP.onAdLoaded();
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not call AdListener.onAdLoaded().", e);
            }
        }
    }

    /* renamed from: as */
    private void m6543as() {
        try {
            if ((this.f4225lB.f4248lT.f3461vI instanceof C1341bt) && this.f4225lB.f4254lZ != null) {
                this.f4225lB.f4254lZ.mo14973a((C1341bt) this.f4225lB.f4248lT.f3461vI);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }

    /* renamed from: at */
    private void m6544at() {
        try {
            if ((this.f4225lB.f4248lT.f3461vI instanceof C1342bu) && this.f4225lB.f4255ma != null) {
                this.f4225lB.f4255ma.mo14974a((C1342bu) this.f4225lB.f4248lT.f3461vI);
            }
        } catch (RemoteException e) {
            C1607gr.m4713d("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }

    /* renamed from: ax */
    private void m6545ax() {
        if (this.f4225lB.f4248lT != null) {
            if (this.f4225lB.f4261mg == 0) {
                this.f4225lB.f4248lT.f3448se.destroy();
            }
            this.f4225lB.f4248lT = null;
            this.f4225lB.f4263mi = false;
        }
    }

    /* renamed from: b */
    private boolean m6546b(C1574fy fyVar) {
        String str;
        if (fyVar.f3452tW) {
            try {
                View view = (View) C0970e.m1612f(fyVar.f3443qQ.getView());
                View nextView = this.f4225lB.f4239lK.getNextView();
                if (nextView != null) {
                    this.f4225lB.f4239lK.removeView(nextView);
                }
                try {
                    m6547c(view);
                } catch (Throwable th) {
                    th = th;
                    str = "Could not add mediation view to view hierarchy.";
                }
            } catch (RemoteException e) {
                th = e;
                str = "Could not get View from mediation adapter.";
                C1607gr.m4713d(str, th);
                return false;
            }
        } else if (fyVar.f3458vF != null) {
            fyVar.f3448se.mo15416a(fyVar.f3458vF);
            this.f4225lB.f4239lK.removeAllViews();
            this.f4225lB.f4239lK.setMinimumWidth(fyVar.f3458vF.widthPixels);
            this.f4225lB.f4239lK.setMinimumHeight(fyVar.f3458vF.heightPixels);
            m6547c(fyVar.f3448se);
        }
        if (this.f4225lB.f4239lK.getChildCount() > 1) {
            this.f4225lB.f4239lK.showNext();
        }
        if (this.f4225lB.f4248lT != null) {
            View nextView2 = this.f4225lB.f4239lK.getNextView();
            if (nextView2 instanceof C1610gu) {
                ((C1610gu) nextView2).mo15415a(this.f4225lB.f4241lM, this.f4225lB.f4247lS);
            } else if (nextView2 != null) {
                this.f4225lB.f4239lK.removeView(nextView2);
            }
            if (this.f4225lB.f4248lT.f3443qQ != null) {
                try {
                    this.f4225lB.f4248lT.f3443qQ.destroy();
                } catch (RemoteException e2) {
                    C1607gr.m4709W("Could not destroy previous mediation adapter.");
                }
            }
        }
        this.f4225lB.f4239lK.setVisibility(0);
        return true;
    }

    /* renamed from: c */
    private void m6547c(View view) {
        this.f4225lB.f4239lK.addView(view, new ViewGroup.LayoutParams(-2, -2));
    }

    /* renamed from: e */
    private void m6548e(boolean z) {
        if (this.f4225lB.f4248lT == null) {
            C1607gr.m4709W("Ad state was null when trying to ping impression URLs.");
            return;
        }
        C1607gr.m4705S("Pinging Impression URLs.");
        this.f4225lB.f4250lV.mo15336cW();
        if (this.f4225lB.f4248lT.f3447qx != null) {
            C1591gi.m4647a(this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3554wS, this.f4225lB.f4248lT.f3447qx);
        }
        if (!(this.f4225lB.f4248lT.f3457vE == null || this.f4225lB.f4248lT.f3457vE.f2826qx == null)) {
            C1400cw.m4208a(this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3554wS, this.f4225lB.f4248lT, this.f4225lB.f4240lL, z, this.f4225lB.f4248lT.f3457vE.f2826qx);
        }
        if (this.f4225lB.f4248lT.f3442qP != null && this.f4225lB.f4248lT.f3442qP.f2818qs != null) {
            C1400cw.m4208a(this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3554wS, this.f4225lB.f4248lT, this.f4225lB.f4240lL, z, this.f4225lB.f4248lT.f3442qP.f2818qs);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo17132a(C1288an anVar) {
        String str;
        if (anVar == null) {
            return null;
        }
        if (anVar.mo14787be()) {
            anVar.wakeup();
        }
        C1285ak bc = anVar.mo14785bc();
        if (bc != null) {
            str = bc.mo14756aT();
            C1607gr.m4705S("In AdManger: loadAd, " + bc.toString());
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString("fingerprint", str);
        bundle.putInt("v", 1);
        return bundle;
    }

    /* renamed from: a */
    public void mo14835a(C1306ay ayVar) {
        C1785jx.m5357aU("setAdSize must be called on the main UI thread.");
        this.f4225lB.f4247lS = ayVar;
        if (this.f4225lB.f4248lT != null && this.f4225lB.f4261mg == 0) {
            this.f4225lB.f4248lT.f3448se.mo15416a(ayVar);
        }
        if (this.f4225lB.f4239lK.getChildCount() > 1) {
            this.f4225lB.f4239lK.removeView(this.f4225lB.f4239lK.getNextView());
        }
        this.f4225lB.f4239lK.setMinimumWidth(ayVar.widthPixels);
        this.f4225lB.f4239lK.setMinimumHeight(ayVar.heightPixels);
        this.f4225lB.f4239lK.requestLayout();
    }

    /* renamed from: a */
    public void mo14836a(C1311bc bcVar) {
        C1785jx.m5357aU("setAdListener must be called on the main UI thread.");
        this.f4225lB.f4244lP = bcVar;
    }

    /* renamed from: a */
    public void mo14837a(C1320bf bfVar) {
        C1785jx.m5357aU("setAppEventListener must be called on the main UI thread.");
        this.f4225lB.f4251lW = bfVar;
    }

    /* renamed from: a */
    public void mo14838a(C1337br brVar) {
        C1785jx.m5357aU("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f4225lB.f4256mb = brVar;
    }

    /* renamed from: a */
    public void mo14839a(C1485en enVar) {
        C1785jx.m5357aU("setInAppPurchaseListener must be called on the main UI thread.");
        this.f4225lB.f4253lY = enVar;
    }

    /* renamed from: a */
    public void mo14840a(C1497er erVar, String str) {
        C1785jx.m5357aU("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.f4225lB.f4258md = new C1480ek(str);
        this.f4225lB.f4252lX = erVar;
        if (!C1579ga.m4596dj() && erVar != null) {
            new C1470ec(this.f4225lB.f4241lM, this.f4225lB.f4252lX, this.f4225lB.f4258md).start();
        }
    }

    /* renamed from: a */
    public void mo15259a(C1574fy.C1575a aVar) {
        C1610gu guVar;
        String str = null;
        this.f4225lB.f4245lQ = null;
        this.f4225lB.f4249lU = aVar;
        mo17133a((List<String>) null);
        if (!aVar.f3468vK.f3347ug) {
            final C2189v vVar = new C2189v();
            C1610gu a = m6534a(vVar);
            vVar.mo17148a(new C2189v.C2191b(aVar, a));
            a.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    vVar.mo17149av();
                    return false;
                }
            });
            a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    vVar.mo17149av();
                }
            });
            guVar = a;
        } else {
            guVar = null;
        }
        if (aVar.f3462lS != null) {
            this.f4225lB.f4247lS = aVar.f3462lS;
        }
        if (aVar.errorCode != -2) {
            mo15278a(new C1574fy(aVar, guVar, (C1392cq) null, (C1405cz) null, (String) null, (C1395ct) null, (C1343bv.C1344a) null));
            return;
        }
        if (!aVar.f3468vK.f3337tW && aVar.f3468vK.f3346uf) {
            if (aVar.f3468vK.f3333sg != null) {
                str = Uri.parse(aVar.f3468vK.f3333sg).buildUpon().query((String) null).build().toString();
            }
            C1332bo boVar = new C1332bo(this, str, aVar.f3468vK.f3335tU);
            try {
                if (this.f4225lB.f4256mb != null) {
                    this.f4225lB.f4261mg = 1;
                    this.f4225lB.f4256mb.mo14944a(boVar);
                    return;
                }
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not call the onCustomRenderedAdLoadedListener.", e);
            }
        }
        this.f4225lB.f4261mg = 0;
        this.f4225lB.f4246lR = C1531fc.m4455a(this.f4225lB.f4241lM, this, aVar, guVar, this.f4224lA, this);
    }

    /* renamed from: a */
    public void mo15278a(C1574fy fyVar) {
        int i;
        int i2;
        this.f4225lB.f4246lR = null;
        boolean z = fyVar.f3461vI != null;
        if (!(fyVar.errorCode == -2 || fyVar.errorCode == 3)) {
            C1579ga.m4590b(this.f4225lB.mo17147ay());
        }
        if (fyVar.errorCode != -1) {
            if (mo17134a(fyVar, z)) {
                C1607gr.m4705S("Ad refresh scheduled.");
            }
            if (!(fyVar.errorCode != 3 || fyVar.f3457vE == null || fyVar.f3457vE.f2827qy == null)) {
                C1607gr.m4705S("Pinging no fill URLs.");
                C1400cw.m4208a(this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3554wS, fyVar, this.f4225lB.f4240lL, false, fyVar.f3457vE.f2827qy);
            }
            if (fyVar.errorCode != -2) {
                m6536a(fyVar.errorCode);
                return;
            }
            if (!this.f4225lB.f4247lS.f2398oq && !z && this.f4225lB.f4261mg == 0) {
                if (!m6546b(fyVar)) {
                    m6536a(0);
                    return;
                } else if (this.f4225lB.f4239lK != null) {
                    this.f4225lB.f4239lK.f4238lJ.mo15400Q(fyVar.f3455ub);
                }
            }
            if (!(this.f4225lB.f4248lT == null || this.f4225lB.f4248lT.f3445qS == null)) {
                this.f4225lB.f4248lT.f3445qS.mo15035a((C1394cs) null);
            }
            if (fyVar.f3445qS != null) {
                fyVar.f3445qS.mo15035a((C1394cs) this);
            }
            this.f4227lD.mo14702d(this.f4225lB.f4248lT);
            this.f4225lB.f4248lT = fyVar;
            this.f4225lB.f4250lV.mo15340j(fyVar.f3459vG);
            this.f4225lB.f4250lV.mo15341k(fyVar.f3460vH);
            this.f4225lB.f4250lV.mo15343v(this.f4225lB.f4247lS.f2398oq);
            this.f4225lB.f4250lV.mo15344w(fyVar.f3452tW);
            if (!this.f4225lB.f4247lS.f2398oq && !z && this.f4225lB.f4261mg == 0) {
                m6548e(false);
            }
            if (this.f4225lB.f4259me == null) {
                this.f4225lB.f4259me = new C1582gd(this.f4225lB.f4240lL);
            }
            if (fyVar.f3457vE != null) {
                i2 = fyVar.f3457vE.f2821qB;
                i = fyVar.f3457vE.f2822qC;
            } else {
                i2 = 0;
                i = 0;
            }
            this.f4225lB.f4259me.mo15378d(i2, i);
            if (this.f4225lB.f4261mg == 0) {
                if (!this.f4225lB.f4247lS.f2398oq && fyVar.f3448se != null && (fyVar.f3448se.mo15426dD().mo15456dN() || fyVar.f3456vD != null)) {
                    C1267af a = this.f4227lD.mo14699a(this.f4225lB.f4247lS, this.f4225lB.f4248lT);
                    if (fyVar.f3448se.mo15426dD().mo15456dN() && a != null) {
                        a.mo14708a((C1264ac) new C1260aa(fyVar.f3448se));
                    }
                }
                if (this.f4225lB.f4248lT.f3448se != null) {
                    this.f4225lB.f4248lT.f3448se.mo15422cb();
                    this.f4225lB.f4248lT.f3448se.mo15426dD().mo15457dO();
                }
                if (z) {
                    C1343bv.C1344a aVar = fyVar.f3461vI;
                    if ((aVar instanceof C1342bu) && this.f4225lB.f4255ma != null) {
                        m6544at();
                    } else if (!(aVar instanceof C1341bt) || this.f4225lB.f4254lZ == null) {
                        C1607gr.m4709W("No matching listener for retrieved native ad template.");
                        m6536a(0);
                        return;
                    } else {
                        m6543as();
                    }
                }
                m6542ar();
            } else if (this.f4225lB.f4260mf != null && fyVar.f3456vD != null) {
                this.f4227lD.mo14698a(this.f4225lB.f4241lM, this.f4225lB.f4247lS, this.f4225lB.f4248lT, this.f4225lB.f4260mf, this.f4225lB.f4243lO);
            }
        }
    }

    /* renamed from: a */
    public void mo15016a(String str, ArrayList<String> arrayList) {
        C1472ed edVar = new C1472ed(str, arrayList, this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3554wS);
        if (this.f4225lB.f4253lY == null) {
            C1607gr.m4709W("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.f4225lB.f4241lM) != 0) {
                C1607gr.m4709W("Google Play Service unavailable, cannot launch default purchase flow.");
            } else if (this.f4225lB.f4252lX == null) {
                C1607gr.m4709W("PlayStorePurchaseListener is not set.");
            } else if (this.f4225lB.f4258md == null) {
                C1607gr.m4709W("PlayStorePurchaseVerifier is not initialized.");
            } else if (this.f4225lB.f4262mh) {
                C1607gr.m4709W("An in-app purchase request is already in progress, abort");
            } else {
                this.f4225lB.f4262mh = true;
                try {
                    if (!this.f4225lB.f4252lX.isValidPurchase(str)) {
                        this.f4225lB.f4262mh = false;
                    } else {
                        C1473ee.m4366a(this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3557wV, new C1468ea(this.f4225lB.f4241lM, this.f4225lB.f4258md, edVar, this));
                    }
                } catch (RemoteException e) {
                    C1607gr.m4709W("Could not start In-App purchase.");
                    this.f4225lB.f4262mh = false;
                }
            }
        } else {
            try {
                this.f4225lB.f4253lY.mo15234a(edVar);
            } catch (RemoteException e2) {
                C1607gr.m4709W("Could not start In-App purchase.");
            }
        }
    }

    /* renamed from: a */
    public void mo15228a(String str, boolean z, int i, final Intent intent, C1474ef efVar) {
        try {
            if (this.f4225lB.f4252lX != null) {
                this.f4225lB.f4252lX.mo15247a(new C1475eg(this.f4225lB.f4241lM, str, z, i, intent, efVar));
            }
        } catch (RemoteException e) {
            C1607gr.m4709W("Fail to invoke PlayStorePurchaseListener.");
        }
        C1606gq.f3553wR.postDelayed(new Runnable() {
            public void run() {
                if (!(C1478ei.m4378d(intent) != 0 || C2182u.this.f4225lB.f4248lT == null || C2182u.this.f4225lB.f4248lT.f3448se == null || C2182u.this.f4225lB.f4248lT.f3448se.mo15425dC() == null)) {
                    C2182u.this.f4225lB.f4248lT.f3448se.mo15425dC().close();
                }
                C2182u.this.f4225lB.f4262mh = false;
            }
        }, 500);
    }

    /* renamed from: a */
    public void mo15377a(HashSet<C1576fz> hashSet) {
        this.f4225lB.mo17146a(hashSet);
    }

    /* renamed from: a */
    public void mo17133a(List<String> list) {
        C1785jx.m5357aU("setNativeTemplates must be called on the main UI thread.");
        this.f4225lB.f4257mc = list;
    }

    /* renamed from: a */
    public boolean mo14841a(C1303av avVar) {
        C1785jx.m5357aU("loadAd must be called on the main UI thread.");
        if (this.f4225lB.f4245lQ != null || this.f4225lB.f4246lR != null) {
            if (this.f4230lz != null) {
                C1607gr.m4709W("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            this.f4230lz = avVar;
            return false;
        } else if (this.f4225lB.f4247lS.f2398oq && this.f4225lB.f4248lT != null) {
            C1607gr.m4709W("An interstitial is already loading. Aborting.");
            return false;
        } else if (!mo17135au()) {
            return false;
        } else {
            C1607gr.m4707U("Starting ad request.");
            if (!avVar.f2388og) {
                C1607gr.m4707U("Use AdRequest.Builder.addTestDevice(\"" + C1606gq.m4704v(this.f4225lB.f4241lM) + "\") to get test ads on this device.");
            }
            Bundle a = mo17132a(C1579ga.m4593dc().mo15370l(this.f4225lB.f4241lM));
            this.f4226lC.cancel();
            this.f4225lB.f4261mg = 0;
            C1545fh.C1546a a2 = m6533a(avVar, a);
            this.f4225lB.f4245lQ = C1508ez.m4415a(this.f4225lB.f4241lM, a2, this.f4225lB.f4242lN, this);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo17134a(C1574fy fyVar, boolean z) {
        C1303av avVar;
        C1261ab abVar;
        long j;
        boolean z2 = false;
        if (this.f4230lz != null) {
            avVar = this.f4230lz;
            this.f4230lz = null;
        } else {
            avVar = fyVar.f3449tL;
            if (avVar.extras != null) {
                z2 = avVar.extras.getBoolean("_noRefresh", false);
            }
        }
        boolean z3 = z | z2;
        if (this.f4225lB.f4247lS.f2398oq) {
            if (this.f4225lB.f4261mg == 0) {
                C1591gi.m4652a((WebView) fyVar.f3448se);
            }
        } else if (!z3 && this.f4225lB.f4261mg == 0) {
            if (fyVar.f3441qA > 0) {
                abVar = this.f4226lC;
                j = fyVar.f3441qA;
            } else if (fyVar.f3457vE != null && fyVar.f3457vE.f2820qA > 0) {
                abVar = this.f4226lC;
                j = fyVar.f3457vE.f2820qA;
            } else if (!fyVar.f3452tW && fyVar.errorCode == 2) {
                this.f4226lC.mo14687c(avVar);
            }
            abVar.mo14685a(avVar, j);
        }
        return this.f4226lC.mo14686aD();
    }

    /* renamed from: ab */
    public C0967d mo14842ab() {
        C1785jx.m5357aU("getAdFrame must be called on the main UI thread.");
        return C0970e.m1613k(this.f4225lB.f4239lK);
    }

    /* renamed from: ac */
    public C1306ay mo14843ac() {
        C1785jx.m5357aU("getAdSize must be called on the main UI thread.");
        return this.f4225lB.f4247lS;
    }

    /* renamed from: af */
    public void mo15172af() {
        m6540ap();
    }

    /* renamed from: ag */
    public void mo15153ag() {
        this.f4227lD.mo14702d(this.f4225lB.f4248lT);
        if (this.f4225lB.f4247lS.f2398oq) {
            m6545ax();
        }
        this.f4228lE = false;
        m6539ao();
        this.f4225lB.f4250lV.mo15338cY();
    }

    /* renamed from: ah */
    public void mo15154ah() {
        if (this.f4225lB.f4247lS.f2398oq) {
            m6548e(false);
        }
        this.f4228lE = true;
        m6541aq();
    }

    /* renamed from: ai */
    public void mo15030ai() {
        onAdClicked();
    }

    /* renamed from: aj */
    public void mo15031aj() {
        mo15153ag();
    }

    /* renamed from: ak */
    public void mo15032ak() {
        mo15172af();
    }

    /* renamed from: al */
    public void mo15033al() {
        mo15154ah();
    }

    /* renamed from: am */
    public void mo15034am() {
        if (this.f4225lB.f4248lT != null) {
            C1607gr.m4709W("Mediation adapter " + this.f4225lB.f4248lT.f3444qR + " refreshed, but mediation adapters should never refresh.");
        }
        m6548e(true);
        m6542ar();
    }

    /* renamed from: an */
    public void mo14844an() {
        C1785jx.m5357aU("recordManualImpression must be called on the main UI thread.");
        if (this.f4225lB.f4248lT == null) {
            C1607gr.m4709W("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C1607gr.m4705S("Pinging manual tracking URLs.");
        if (this.f4225lB.f4248lT.f3454tY != null) {
            C1591gi.m4647a(this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3554wS, this.f4225lB.f4248lT.f3454tY);
        }
    }

    /* renamed from: au */
    public boolean mo17135au() {
        boolean z;
        if (!C1591gi.m4655a(this.f4225lB.f4241lM.getPackageManager(), this.f4225lB.f4241lM.getPackageName(), "android.permission.INTERNET")) {
            if (!this.f4225lB.f4247lS.f2398oq) {
                C1606gq.m4701a(this.f4225lB.f4239lK, this.f4225lB.f4247lS, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            z = false;
        } else {
            z = true;
        }
        if (!C1591gi.m4668p(this.f4225lB.f4241lM)) {
            if (!this.f4225lB.f4247lS.f2398oq) {
                C1606gq.m4701a(this.f4225lB.f4239lK, this.f4225lB.f4247lS, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            z = false;
        }
        if (!z && !this.f4225lB.f4247lS.f2398oq) {
            this.f4225lB.f4239lK.setVisibility(0);
        }
        return z;
    }

    /* renamed from: av */
    public void mo17136av() {
        if (this.f4225lB.f4248lT == null) {
            C1607gr.m4709W("Ad state was null when trying to ping click URLs.");
            return;
        }
        C1607gr.m4705S("Pinging click URLs.");
        this.f4225lB.f4250lV.mo15337cX();
        if (this.f4225lB.f4248lT.f3446qw != null) {
            C1591gi.m4647a(this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3554wS, this.f4225lB.f4248lT.f3446qw);
        }
        if (this.f4225lB.f4248lT.f3457vE != null && this.f4225lB.f4248lT.f3457vE.f2825qw != null) {
            C1400cw.m4208a(this.f4225lB.f4241lM, this.f4225lB.f4243lO.f3554wS, this.f4225lB.f4248lT, this.f4225lB.f4240lL, false, this.f4225lB.f4248lT.f3457vE.f2825qw);
        }
    }

    /* renamed from: aw */
    public void mo17137aw() {
        m6548e(false);
    }

    /* renamed from: b */
    public void mo17138b(View view) {
        this.f4225lB.f4260mf = view;
        mo15278a(new C1574fy(this.f4225lB.f4249lU, (C1610gu) null, (C1392cq) null, (C1405cz) null, (String) null, (C1395ct) null, (C1343bv.C1344a) null));
    }

    /* renamed from: b */
    public void mo17139b(C1303av avVar) {
        ViewParent parent = this.f4225lB.f4239lK.getParent();
        if (!(parent instanceof View) || !((View) parent).isShown() || !C1591gi.m4662dt() || this.f4228lE) {
            C1607gr.m4707U("Ad is not visible. Not refreshing ad.");
            this.f4226lC.mo14687c(avVar);
            return;
        }
        mo14841a(avVar);
    }

    /* renamed from: d */
    public void mo15017d(boolean z) {
        this.f4225lB.f4263mi = z;
    }

    public void destroy() {
        C1785jx.m5357aU("destroy must be called on the main UI thread.");
        m6538ae();
        this.f4225lB.f4244lP = null;
        this.f4225lB.f4251lW = null;
        this.f4225lB.f4252lX = null;
        this.f4225lB.f4253lY = null;
        this.f4225lB.f4256mb = null;
        this.f4226lC.cancel();
        this.f4227lD.stop();
        stopLoading();
        if (this.f4225lB.f4239lK != null) {
            this.f4225lB.f4239lK.removeAllViews();
        }
        if (!(this.f4225lB.f4248lT == null || this.f4225lB.f4248lT.f3448se == null)) {
            this.f4225lB.f4248lT.f3448se.destroy();
        }
        if (this.f4225lB.f4248lT != null && this.f4225lB.f4248lT.f3443qQ != null) {
            try {
                this.f4225lB.f4248lT.f3443qQ.destroy();
            } catch (RemoteException e) {
                C1607gr.m4709W("Could not destroy mediation adapter.");
            }
        }
    }

    public String getMediationAdapterClassName() {
        if (this.f4225lB.f4248lT != null) {
            return this.f4225lB.f4248lT.f3444qR;
        }
        return null;
    }

    public boolean isReady() {
        C1785jx.m5357aU("isLoaded must be called on the main UI thread.");
        return this.f4225lB.f4245lQ == null && this.f4225lB.f4246lR == null && this.f4225lB.f4248lT != null;
    }

    public void onAdClicked() {
        mo17136av();
    }

    public void onAppEvent(String str, String str2) {
        if (this.f4225lB.f4251lW != null) {
            try {
                this.f4225lB.f4251lW.onAppEvent(str, str2);
            } catch (RemoteException e) {
                C1607gr.m4713d("Could not call the AppEventListener.", e);
            }
        }
    }

    public void pause() {
        C1785jx.m5357aU("pause must be called on the main UI thread.");
        if (this.f4225lB.f4248lT != null && this.f4225lB.f4261mg == 0) {
            C1591gi.m4652a((WebView) this.f4225lB.f4248lT.f3448se);
        }
        if (!(this.f4225lB.f4248lT == null || this.f4225lB.f4248lT.f3443qQ == null)) {
            try {
                this.f4225lB.f4248lT.f3443qQ.pause();
            } catch (RemoteException e) {
                C1607gr.m4709W("Could not pause mediation adapter.");
            }
        }
        this.f4227lD.pause();
        this.f4226lC.pause();
    }

    public void resume() {
        C1785jx.m5357aU("resume must be called on the main UI thread.");
        if (this.f4225lB.f4248lT != null && this.f4225lB.f4261mg == 0) {
            C1591gi.m4657b(this.f4225lB.f4248lT.f3448se);
        }
        if (!(this.f4225lB.f4248lT == null || this.f4225lB.f4248lT.f3443qQ == null)) {
            try {
                this.f4225lB.f4248lT.f3443qQ.resume();
            } catch (RemoteException e) {
                C1607gr.m4709W("Could not resume mediation adapter.");
            }
        }
        this.f4226lC.resume();
        this.f4227lD.resume();
    }

    public void showInterstitial() {
        String str;
        C1785jx.m5357aU("showInterstitial must be called on the main UI thread.");
        if (!this.f4225lB.f4247lS.f2398oq) {
            str = "Cannot call showInterstitial on a banner ad.";
        } else if (this.f4225lB.f4248lT == null) {
            str = "The interstitial has not loaded.";
        } else {
            boolean z = true;
            if (this.f4225lB.f4261mg != 1) {
                if (this.f4225lB.f4248lT.f3448se.mo15430dH()) {
                    str = "The interstitial is already showing.";
                } else {
                    this.f4225lB.f4248lT.f3448se.mo15440z(true);
                    if (this.f4225lB.f4248lT.f3448se.mo15426dD().mo15456dN() || this.f4225lB.f4248lT.f3456vD != null) {
                        C1267af a = this.f4227lD.mo14699a(this.f4225lB.f4247lS, this.f4225lB.f4248lT);
                        if (this.f4225lB.f4248lT.f3448se.mo15426dD().mo15456dN() && a != null) {
                            a.mo14708a((C1264ac) new C1260aa(this.f4225lB.f4248lT.f3448se));
                        }
                    }
                    if (this.f4225lB.f4248lT.f3452tW) {
                        try {
                            this.f4225lB.f4248lT.f3443qQ.showInterstitial();
                            return;
                        } catch (RemoteException e) {
                            C1607gr.m4713d("Could not show interstitial.", e);
                            m6545ax();
                            return;
                        }
                    } else {
                        C2194y yVar = new C2194y(this.f4225lB.f4263mi, false);
                        if (this.f4225lB.f4241lM instanceof Activity) {
                            Window window = ((Activity) this.f4225lB.f4241lM).getWindow();
                            Rect rect = new Rect();
                            Rect rect2 = new Rect();
                            window.getDecorView().getGlobalVisibleRect(rect);
                            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
                            if (!(rect.bottom == 0 || rect2.bottom == 0)) {
                                boolean z2 = this.f4225lB.f4263mi;
                                if (rect.top != rect2.top) {
                                    z = false;
                                }
                                yVar = new C2194y(z2, z);
                            }
                        }
                        C1445dp.m4288a(this.f4225lB.f4241lM, new C1451dr(this, this, this, this.f4225lB.f4248lT.f3448se, this.f4225lB.f4248lT.orientation, this.f4225lB.f4243lO, this.f4225lB.f4248lT.f3455ub, yVar));
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C1607gr.m4709W(str);
    }

    public void stopLoading() {
        C1785jx.m5357aU("stopLoading must be called on the main UI thread.");
        if (this.f4225lB.f4248lT != null && this.f4225lB.f4261mg == 0) {
            this.f4225lB.f4248lT.f3448se.stopLoading();
            this.f4225lB.f4248lT = null;
        }
        if (this.f4225lB.f4245lQ != null) {
            this.f4225lB.f4245lQ.cancel();
        }
        if (this.f4225lB.f4246lR != null) {
            this.f4225lB.f4246lR.cancel();
        }
    }
}
