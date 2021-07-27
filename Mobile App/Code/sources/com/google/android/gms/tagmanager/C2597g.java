package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.g */
class C2597g extends C2474aj {

    /* renamed from: ID */
    private static final String f4462ID = C1259a.APP_NAME.toString();
    private final Context mContext;

    public C2597g(Context context) {
        super(f4462ID, new String[0]);
        this.mContext = context;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        try {
            PackageManager packageManager = this.mContext.getPackageManager();
            return C2590di.m7551u(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.mContext.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException e) {
            C2504bh.m7247b("App name is not found.", e);
            return C2590di.m7548rb();
        }
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
