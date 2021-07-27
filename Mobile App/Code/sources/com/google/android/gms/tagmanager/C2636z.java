package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.z */
class C2636z extends C2474aj {

    /* renamed from: ID */
    private static final String f4482ID = C1259a.DEVICE_ID.toString();
    private final Context mContext;

    public C2636z(Context context) {
        super(f4482ID, new String[0]);
        this.mContext = context;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String Y = mo18881Y(this.mContext);
        return Y == null ? C2590di.m7548rb() : C2590di.m7551u(Y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public String mo18881Y(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
