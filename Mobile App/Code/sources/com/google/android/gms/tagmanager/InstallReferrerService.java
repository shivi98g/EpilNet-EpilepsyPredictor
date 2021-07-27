package com.google.android.gms.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.CampaignTrackingService;

public final class InstallReferrerService extends IntentService {
    CampaignTrackingService arF;
    Context arG;

    public InstallReferrerService() {
        super("InstallReferrerService");
    }

    public InstallReferrerService(String str) {
        super(str);
    }

    /* renamed from: a */
    private void m7137a(Context context, Intent intent) {
        if (this.arF == null) {
            this.arF = new CampaignTrackingService();
        }
        this.arF.processIntent(context, intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        Context applicationContext = this.arG != null ? this.arG : getApplicationContext();
        C2490ay.m7218d(applicationContext, stringExtra);
        m7137a(applicationContext, intent);
    }
}
