package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.C1351c;
import com.google.android.gms.tagmanager.C2502bg;
import com.google.android.gms.tagmanager.C2531ce;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.tagmanager.co */
class C2542co implements Runnable {
    private volatile String aqI;
    private final String aqm;
    private final C2510bn asA;
    private final String asB;
    private C2502bg<C1351c.C1361j> asC;
    private volatile C2622r asD;
    private volatile String asE;
    private final Context mContext;

    C2542co(Context context, String str, C2510bn bnVar, C2622r rVar) {
        this.mContext = context;
        this.asA = bnVar;
        this.aqm = str;
        this.asD = rVar;
        this.asB = "/r?id=" + str;
        this.aqI = this.asB;
        this.asE = null;
    }

    public C2542co(Context context, String str, C2622r rVar) {
        this(context, str, new C2510bn(), rVar);
    }

    /* renamed from: qd */
    private boolean m7356qd() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        C2504bh.m7245V("...no network connectivity");
        return false;
    }

    /* renamed from: qe */
    private void m7357qe() {
        if (!m7356qd()) {
            this.asC.mo18671a(C2502bg.C2503a.NOT_AVAILABLE);
            return;
        }
        C2504bh.m7245V("Start loading resource from network ...");
        String qf = mo18733qf();
        C2509bm pO = this.asA.mo18685pO();
        try {
            InputStream cF = pO.mo18663cF(qf);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C2551cr.m7388b(cF, byteArrayOutputStream);
                C1351c.C1361j b = C1351c.C1361j.m4145b(byteArrayOutputStream.toByteArray());
                C2504bh.m7245V("Successfully loaded supplemented resource: " + b);
                if (b.f2783gs == null && b.f2782gr.length == 0) {
                    C2504bh.m7245V("No change for container: " + this.aqm);
                }
                this.asC.mo18672l(b);
                pO.close();
                C2504bh.m7245V("Load resource from network finished.");
            } catch (IOException e) {
                C2504bh.m7248d("Error when parsing downloaded resources from url: " + qf + " " + e.getMessage(), e);
                this.asC.mo18671a(C2502bg.C2503a.SERVER_ERROR);
                pO.close();
            } catch (Throwable th) {
                pO.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            C2504bh.m7246W("No data is retrieved from the given url: " + qf + ". Make sure container_id: " + this.aqm + " is correct.");
            this.asC.mo18671a(C2502bg.C2503a.SERVER_ERROR);
            pO.close();
        } catch (IOException e3) {
            C2504bh.m7248d("Error when loading resources from url: " + qf + " " + e3.getMessage(), e3);
            this.asC.mo18671a(C2502bg.C2503a.IO_ERROR);
            pO.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18730a(C2502bg<C1351c.C1361j> bgVar) {
        this.asC = bgVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cL */
    public void mo18731cL(String str) {
        C2504bh.m7242S("Setting previous container version: " + str);
        this.asE = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cw */
    public void mo18732cw(String str) {
        if (str == null) {
            str = this.asB;
        } else {
            C2504bh.m7242S("Setting CTFE URL path: " + str);
        }
        this.aqI = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qf */
    public String mo18733qf() {
        String str = this.asD.mo18872pu() + this.aqI + "&v=a65833898";
        if (this.asE != null && !this.asE.trim().equals("")) {
            str = str + "&pv=" + this.asE;
        }
        if (!C2531ce.m7333qa().mo18728qb().equals(C2531ce.C2532a.CONTAINER_DEBUG)) {
            return str;
        }
        return str + "&gtm_debug=x";
    }

    public void run() {
        if (this.asC == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        this.asC.mo18673ps();
        m7357qe();
    }
}
