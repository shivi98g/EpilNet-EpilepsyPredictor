package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.Future;

@C1507ey
/* renamed from: com.google.android.gms.internal.fs */
public final class C1566fs {
    /* access modifiers changed from: private */

    /* renamed from: mH */
    public final Object f3384mH = new Object();

    /* renamed from: mo */
    C1610gu f3385mo;
    /* access modifiers changed from: private */

    /* renamed from: uE */
    public String f3386uE;
    /* access modifiers changed from: private */

    /* renamed from: uF */
    public C1594gj<C1570fu> f3387uF = new C1594gj<>();

    /* renamed from: uG */
    public final C1374cd f3388uG = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            synchronized (C1566fs.this.f3384mH) {
                if (!C1566fs.this.f3387uF.isDone()) {
                    C1570fu fuVar = new C1570fu(1, map);
                    C1607gr.m4709W("Invalid " + fuVar.getType() + " request error: " + fuVar.mo15328cT());
                    C1566fs.this.f3387uF.mo15389a(fuVar);
                }
            }
        }
    };

    /* renamed from: uH */
    public final C1374cd f3389uH = new C1374cd() {
        /* renamed from: a */
        public void mo14738a(C1610gu guVar, Map<String, String> map) {
            synchronized (C1566fs.this.f3384mH) {
                if (!C1566fs.this.f3387uF.isDone()) {
                    C1570fu fuVar = new C1570fu(-2, map);
                    String url = fuVar.getUrl();
                    if (url == null) {
                        C1607gr.m4709W("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (url.contains("%40mediation_adapters%40")) {
                        String replaceAll = url.replaceAll("%40mediation_adapters%40", C1583ge.m4628a(guVar.getContext(), map.get("check_adapters"), C1566fs.this.f3386uE));
                        fuVar.setUrl(replaceAll);
                        C1607gr.m4708V("Ad request URL modified to " + replaceAll);
                    }
                    C1566fs.this.f3387uF.mo15389a(fuVar);
                }
            }
        }
    };

    public C1566fs(String str) {
        this.f3386uE = str;
    }

    /* renamed from: b */
    public void mo15322b(C1610gu guVar) {
        C1785jx.m5357aU("setAdWebView must be called on the main thread.");
        this.f3385mo = guVar;
    }

    /* renamed from: cR */
    public Future<C1570fu> mo15323cR() {
        return this.f3387uF;
    }

    /* renamed from: cS */
    public void mo15324cS() {
        C1785jx.m5357aU("destroyAdWebView must be called on the main thread.");
        if (this.f3385mo != null) {
            this.f3385mo.destroy();
            this.f3385mo = null;
        }
    }
}
