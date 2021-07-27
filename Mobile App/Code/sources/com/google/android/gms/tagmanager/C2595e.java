package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.e */
class C2595e extends C2474aj {

    /* renamed from: ID */
    private static final String f4459ID = C1259a.ADWORDS_CLICK_REFERRER.toString();
    private static final String aqd = C1308b.COMPONENT.toString();
    private static final String aqe = C1308b.CONVERSION_ID.toString();

    /* renamed from: lM */
    private final Context f4460lM;

    public C2595e(Context context) {
        super(f4459ID, aqe);
        this.f4460lM = context;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        C1408d.C1409a aVar = map.get(aqe);
        if (aVar == null) {
            return C2590di.m7548rb();
        }
        String j = C2590di.m7533j(aVar);
        C1408d.C1409a aVar2 = map.get(aqd);
        String f = C2490ay.m7220f(this.f4460lM, j, aVar2 != null ? C2590di.m7533j(aVar2) : null);
        return f != null ? C2590di.m7551u(f) : C2590di.m7548rb();
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
