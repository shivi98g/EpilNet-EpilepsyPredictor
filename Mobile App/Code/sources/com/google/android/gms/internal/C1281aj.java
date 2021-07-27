package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.internal.C1276ah;
import com.google.android.gms.internal.C1612gv;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.aj */
public class C1281aj implements C1276ah {
    /* access modifiers changed from: private */

    /* renamed from: mo */
    public final C1610gu f2327mo;

    public C1281aj(Context context, C1608gs gsVar) {
        this.f2327mo = C1610gu.m4718a(context, new C1306ay(), false, false, (C1788k) null, gsVar);
    }

    private void runOnUiThread(Runnable runnable) {
        if (C1606gq.m4703dB()) {
            runnable.run();
        } else {
            C1606gq.f3553wR.post(runnable);
        }
    }

    /* renamed from: a */
    public void mo14739a(final C1276ah.C1277a aVar) {
        this.f2327mo.mo15426dD().mo15447a((C1612gv.C1614a) new C1612gv.C1614a() {
            /* renamed from: a */
            public void mo14753a(C1610gu guVar) {
                aVar.mo14734aR();
            }
        });
    }

    /* renamed from: a */
    public void mo14740a(C2181t tVar, C1452ds dsVar, C1363cb cbVar, C1457dv dvVar, boolean z, C1375ce ceVar) {
        this.f2327mo.mo15426dD().mo15449a(tVar, dsVar, cbVar, dvVar, z, ceVar, new C2189v(false));
    }

    /* renamed from: a */
    public void mo14741a(String str, C1374cd cdVar) {
        this.f2327mo.mo15426dD().mo15450a(str, cdVar);
    }

    /* renamed from: a */
    public void mo14742a(final String str, final JSONObject jSONObject) {
        runOnUiThread(new Runnable() {
            public void run() {
                C1281aj.this.f2327mo.mo15419a(str, jSONObject);
            }
        });
    }

    public void destroy() {
        this.f2327mo.destroy();
    }

    /* renamed from: f */
    public void mo14744f(final String str) {
        runOnUiThread(new Runnable() {
            public void run() {
                C1281aj.this.f2327mo.loadUrl(str);
            }
        });
    }

    /* renamed from: g */
    public void mo14745g(String str) {
        this.f2327mo.mo15426dD().mo15450a(str, (C1374cd) null);
    }

    public void pause() {
        C1591gi.m4652a((WebView) this.f2327mo);
    }

    public void resume() {
        C1591gi.m4657b(this.f2327mo);
    }
}
