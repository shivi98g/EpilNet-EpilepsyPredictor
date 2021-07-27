package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.ax */
class C2489ax extends C2474aj {

    /* renamed from: ID */
    private static final String f4412ID = C1259a.INSTALL_REFERRER.toString();
    private static final String aqd = C1308b.COMPONENT.toString();

    /* renamed from: lM */
    private final Context f4413lM;

    public C2489ax(Context context) {
        super(f4412ID, new String[0]);
        this.f4413lM = context;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String e = C2490ay.m7219e(this.f4413lM, map.get(aqd) != null ? C2590di.m7533j(map.get(aqd)) : null);
        return e != null ? C2590di.m7551u(e) : C2590di.m7548rb();
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
