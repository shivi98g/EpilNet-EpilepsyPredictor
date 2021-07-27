package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.support.p000v4.app.NotificationCompat;
import com.google.android.gms.internal.C1482em;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@C1507ey
/* renamed from: com.google.android.gms.internal.ed */
public final class C1472ed extends C1482em.C1483a {
    private Context mContext;

    /* renamed from: mG */
    private String f3006mG;

    /* renamed from: sM */
    private String f3007sM;

    /* renamed from: sN */
    private ArrayList<String> f3008sN;

    public C1472ed(String str, ArrayList<String> arrayList, Context context, String str2) {
        this.f3007sM = str;
        this.f3008sN = arrayList;
        this.f3006mG = str2;
        this.mContext = context;
    }

    /* renamed from: cz */
    private void m4363cz() {
        try {
            this.mContext.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}).invoke((Object) null, new Object[]{this.mContext, this.f3007sM, "", true});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            C1607gr.m4709W("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Exception e2) {
            C1607gr.m4713d("Fail to report a conversion.", e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15202a(String str, HashMap<String, String> hashMap) {
        String packageName = this.mContext.getPackageName();
        String str2 = "";
        try {
            str2 = this.mContext.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C1607gr.m4713d("Error to retrieve app version", e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - C1579ga.m4595dh().mo15376dq();
        for (String next : hashMap.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{next}), String.format("$1%s$2", new Object[]{hashMap.get(next)}));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sessionid"}), String.format("$1%s$2", new Object[]{C1579ga.f3484vY})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appid"}), String.format("$1%s$2", new Object[]{packageName})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"osversion"}), String.format("$1%s$2", new Object[]{String.valueOf(Build.VERSION.SDK_INT)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sdkversion"}), String.format("$1%s$2", new Object[]{this.f3006mG})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appversion"}), String.format("$1%s$2", new Object[]{str2})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"timestamp"}), String.format("$1%s$2", new Object[]{String.valueOf(elapsedRealtime)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"[^@]+"}), String.format("$1%s$2", new Object[]{""})).replaceAll("@@", "@");
    }

    public String getProductId() {
        return this.f3007sM;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo15204p(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        return i == 4 ? 3 : 0;
    }

    public void recordPlayBillingResolution(int i) {
        if (i == 0) {
            m4363cz();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("google_play_status", String.valueOf(i));
        hashMap.put("sku", this.f3007sM);
        hashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(mo15204p(i)));
        Iterator<String> it = this.f3008sN.iterator();
        while (it.hasNext()) {
            new C1605gp(this.mContext, this.f3006mG, mo15202a(it.next(), hashMap)).start();
        }
    }

    public void recordResolution(int i) {
        if (i == 1) {
            m4363cz();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(i));
        hashMap.put("sku", this.f3007sM);
        Iterator<String> it = this.f3008sN.iterator();
        while (it.hasNext()) {
            new C1605gp(this.mContext, this.f3006mG, mo15202a(it.next(), hashMap)).start();
        }
    }
}
