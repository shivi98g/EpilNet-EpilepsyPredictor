package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1381ck;
import java.lang.Thread;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

@C1507ey
/* renamed from: com.google.android.gms.internal.ga */
public class C1579ga implements C1381ck.C1383b {

    /* renamed from: vX */
    private static final C1579ga f3483vX = new C1579ga();

    /* renamed from: vY */
    public static final String f3484vY = f3483vX.f3492vZ;
    private Context mContext;

    /* renamed from: mH */
    private final Object f3485mH = new Object();

    /* renamed from: nE */
    private C1287am f3486nE = null;

    /* renamed from: nF */
    private C1286al f3487nF = null;

    /* renamed from: nG */
    private C1506ex f3488nG = null;

    /* renamed from: qJ */
    private C1608gs f3489qJ;

    /* renamed from: uV */
    private boolean f3490uV = true;

    /* renamed from: uW */
    private boolean f3491uW = true;

    /* renamed from: vZ */
    public final String f3492vZ = C1591gi.m4666dx();

    /* renamed from: wa */
    private final C1580gb f3493wa = new C1580gb(this.f3492vZ);

    /* renamed from: wb */
    private C1832ld f3494wb;

    /* renamed from: wc */
    private BigInteger f3495wc = BigInteger.ONE;

    /* renamed from: wd */
    private final HashSet<C1576fz> f3496wd = new HashSet<>();

    /* renamed from: we */
    private final HashMap<String, C1582gd> f3497we = new HashMap<>();

    /* renamed from: wf */
    private boolean f3498wf = false;

    /* renamed from: wg */
    private boolean f3499wg = false;

    /* renamed from: wh */
    private C1288an f3500wh = null;

    /* renamed from: wi */
    private LinkedList<Thread> f3501wi = new LinkedList<>();

    /* renamed from: wj */
    private boolean f3502wj = false;

    /* renamed from: wk */
    private Bundle f3503wk = C1331bn.m4033by();

    /* renamed from: wl */
    private String f3504wl;

    private C1579ga() {
    }

    /* renamed from: a */
    public static Bundle m4587a(Context context, C1581gc gcVar, String str) {
        return f3483vX.mo15356b(context, gcVar, str);
    }

    /* renamed from: a */
    public static void m4588a(Context context, C1608gs gsVar) {
        f3483vX.mo15357b(context, gsVar);
    }

    /* renamed from: a */
    public static void m4589a(Context context, boolean z) {
        f3483vX.mo15358b(context, z);
    }

    /* renamed from: b */
    public static void m4590b(HashSet<C1576fz> hashSet) {
        f3483vX.mo15359c(hashSet);
    }

    /* renamed from: bN */
    public static Bundle m4591bN() {
        return f3483vX.mo15368dp();
    }

    /* renamed from: c */
    public static String m4592c(int i, String str) {
        return f3483vX.mo15360d(i, str);
    }

    /* renamed from: dc */
    public static C1579ga m4593dc() {
        return f3483vX;
    }

    /* renamed from: df */
    public static String m4594df() {
        return f3483vX.mo15363dg();
    }

    /* renamed from: dh */
    public static C1580gb m4595dh() {
        return f3483vX.mo15364di();
    }

    /* renamed from: dj */
    public static boolean m4596dj() {
        return f3483vX.mo15365dk();
    }

    /* renamed from: dl */
    public static boolean m4597dl() {
        return f3483vX.mo15366dm();
    }

    /* renamed from: dn */
    public static String m4598dn() {
        return f3483vX.mo15367do();
    }

    /* renamed from: e */
    public static void m4599e(Throwable th) {
        f3483vX.mo15369f(th);
    }

    /* renamed from: a */
    public void mo15018a(Bundle bundle) {
        synchronized (this.f3485mH) {
            this.f3502wj = true;
            this.f3503wk = bundle;
            while (!this.f3501wi.isEmpty()) {
                C1506ex.m4406a(this.mContext, this.f3501wi.remove(0), this.f3489qJ);
            }
        }
    }

    /* renamed from: a */
    public void mo15353a(C1576fz fzVar) {
        synchronized (this.f3485mH) {
            this.f3496wd.add(fzVar);
        }
    }

    /* renamed from: a */
    public void mo15354a(String str, C1582gd gdVar) {
        synchronized (this.f3485mH) {
            this.f3497we.put(str, gdVar);
        }
    }

    /* renamed from: a */
    public void mo15355a(Thread thread) {
        synchronized (this.f3485mH) {
            if (this.f3502wj) {
                C1506ex.m4406a(this.mContext, thread, this.f3489qJ);
            } else {
                this.f3501wi.add(thread);
            }
        }
    }

    /* renamed from: b */
    public Bundle mo15356b(Context context, C1581gc gcVar, String str) {
        Bundle bundle;
        synchronized (this.f3485mH) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f3493wa.mo15372b(context, str));
            Bundle bundle2 = new Bundle();
            for (String next : this.f3497we.keySet()) {
                bundle2.putBundle(next, this.f3497we.get(next).toBundle());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator<C1576fz> it = this.f3496wd.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toBundle());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            gcVar.mo15377a(this.f3496wd);
            this.f3496wd.clear();
        }
        return bundle;
    }

    /* renamed from: b */
    public void mo15357b(Context context, C1608gs gsVar) {
        synchronized (this.f3485mH) {
            if (!this.f3499wg) {
                this.mContext = context.getApplicationContext();
                this.f3489qJ = gsVar;
                this.f3490uV = C1586gg.m4635o(context);
                C1722iy.m5129H(context);
                C1381ck.m4171a(context, this);
                mo15355a(Thread.currentThread());
                this.f3504wl = C1591gi.m4658c(context, gsVar.f3554wS);
                this.f3494wb = new C1834lf();
                this.f3499wg = true;
            }
        }
    }

    /* renamed from: b */
    public void mo15358b(Context context, boolean z) {
        synchronized (this.f3485mH) {
            if (z != this.f3490uV) {
                this.f3490uV = z;
                C1586gg.m4633a(context, z);
            }
        }
    }

    /* renamed from: c */
    public void mo15359c(HashSet<C1576fz> hashSet) {
        synchronized (this.f3485mH) {
            this.f3496wd.addAll(hashSet);
        }
    }

    /* renamed from: d */
    public String mo15360d(int i, String str) {
        Resources resources = this.f3489qJ.f3557wV ? this.mContext.getResources() : GooglePlayServicesUtil.getRemoteResource(this.mContext);
        return resources == null ? str : resources.getString(i);
    }

    /* renamed from: dd */
    public C1832ld mo15361dd() {
        C1832ld ldVar;
        synchronized (this.f3485mH) {
            ldVar = this.f3494wb;
        }
        return ldVar;
    }

    /* renamed from: de */
    public boolean mo15362de() {
        boolean z;
        synchronized (this.f3485mH) {
            z = this.f3491uW;
        }
        return z;
    }

    /* renamed from: dg */
    public String mo15363dg() {
        String bigInteger;
        synchronized (this.f3485mH) {
            bigInteger = this.f3495wc.toString();
            this.f3495wc = this.f3495wc.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    /* renamed from: di */
    public C1580gb mo15364di() {
        C1580gb gbVar;
        synchronized (this.f3485mH) {
            gbVar = this.f3493wa;
        }
        return gbVar;
    }

    /* renamed from: dk */
    public boolean mo15365dk() {
        boolean z;
        synchronized (this.f3485mH) {
            z = this.f3498wf;
            this.f3498wf = true;
        }
        return z;
    }

    /* renamed from: dm */
    public boolean mo15366dm() {
        boolean z;
        synchronized (this.f3485mH) {
            z = this.f3490uV;
        }
        return z;
    }

    /* renamed from: do */
    public String mo15367do() {
        String str;
        synchronized (this.f3485mH) {
            str = this.f3504wl;
        }
        return str;
    }

    /* renamed from: dp */
    public Bundle mo15368dp() {
        Bundle bundle;
        synchronized (this.f3485mH) {
            bundle = this.f3503wk;
        }
        return bundle;
    }

    /* renamed from: f */
    public void mo15369f(Throwable th) {
        if (this.f3499wg) {
            new C1506ex(this.mContext, this.f3489qJ, (Thread.UncaughtExceptionHandler) null, (Thread.UncaughtExceptionHandler) null).mo15256b(th);
        }
    }

    /* renamed from: l */
    public C1288an mo15370l(Context context) {
        if (!m4591bN().getBoolean(C1331bn.f2690pp.getKey(), false) || !C1840ll.m5541ij() || mo15362de()) {
            return null;
        }
        synchronized (this.f3485mH) {
            if (this.f3486nE == null) {
                if (!(context instanceof Activity)) {
                    return null;
                }
                this.f3486nE = new C1287am((Application) context.getApplicationContext(), (Activity) context);
            }
            if (this.f3487nF == null) {
                this.f3487nF = new C1286al();
            }
            if (this.f3500wh == null) {
                this.f3500wh = new C1288an(this.f3486nE, this.f3487nF, this.f3503wk, new C1506ex(this.mContext, this.f3489qJ, (Thread.UncaughtExceptionHandler) null, (Thread.UncaughtExceptionHandler) null));
            }
            this.f3500wh.mo14784ba();
            C1288an anVar = this.f3500wh;
            return anVar;
        }
    }

    /* renamed from: x */
    public void mo15371x(boolean z) {
        synchronized (this.f3485mH) {
            this.f3491uW = z;
        }
    }
}
