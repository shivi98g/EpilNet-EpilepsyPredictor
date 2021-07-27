package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.b */
class C2494b extends C2474aj {

    /* renamed from: ID */
    private static final String f4415ID = C1259a.ADVERTISER_ID.toString();
    private final C2461a aqc;

    public C2494b(Context context) {
        this(C2461a.m7148W(context));
    }

    C2494b(C2461a aVar) {
        super(f4415ID, new String[0]);
        this.aqc = aVar;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String pa = this.aqc.mo18631pa();
        return pa == null ? C2590di.m7548rb() : C2590di.m7551u(pa);
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return false;
    }
}
