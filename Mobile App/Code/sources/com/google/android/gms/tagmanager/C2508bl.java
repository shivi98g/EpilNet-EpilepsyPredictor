package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.bl */
class C2508bl extends C2474aj {

    /* renamed from: ID */
    private static final String f4427ID = C1259a.MOBILE_ADWORDS_UNIQUE_ID.toString();
    private final Context mContext;

    public C2508bl(Context context) {
        super(f4427ID, new String[0]);
        this.mContext = context;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String Y = mo18684Y(this.mContext);
        return Y == null ? C2590di.m7548rb() : C2590di.m7551u(Y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public String mo18684Y(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
