package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.op */
public class C2047op {
    private final C2060ox amU;
    private C2058ov amV;

    /* renamed from: com.google.android.gms.internal.op$a */
    public interface C2048a {
        /* renamed from: d */
        void mo16495d(PendingIntent pendingIntent);

        /* renamed from: on */
        void mo16496on();

        /* renamed from: oo */
        void mo16497oo();
    }

    public C2047op(Context context, int i, String str, String str2, C2048a aVar, boolean z) {
        int i2;
        String packageName = context.getPackageName();
        try {
            i2 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("PlayLogger", "This can't happen.");
            i2 = 0;
        }
        this.amV = new C2058ov(packageName, i2, i, str, str2, z);
        this.amU = new C2060ox(context, new C2057ou(aVar));
    }

    /* renamed from: a */
    public void mo16499a(long j, String str, byte[] bArr, String... strArr) {
        this.amU.mo16533b(this.amV, new C2052or(j, str, bArr, strArr));
    }

    /* renamed from: b */
    public void mo16500b(String str, byte[] bArr, String... strArr) {
        mo16499a(System.currentTimeMillis(), str, bArr, strArr);
    }

    public void start() {
        this.amU.start();
    }

    public void stop() {
        this.amU.stop();
    }
}
