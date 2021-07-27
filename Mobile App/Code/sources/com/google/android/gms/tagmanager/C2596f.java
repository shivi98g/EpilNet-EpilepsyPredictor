package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.f */
class C2596f extends C2474aj {

    /* renamed from: ID */
    private static final String f4461ID = C1259a.APP_ID.toString();
    private final Context mContext;

    public C2596f(Context context) {
        super(f4461ID, new String[0]);
        this.mContext = context;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        return C2590di.m7551u(this.mContext.getPackageName());
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
