package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0972g;
import com.google.android.gms.internal.C1488eo;
import com.google.android.gms.internal.C1491ep;

@C1507ey
/* renamed from: com.google.android.gms.internal.et */
public final class C1501et extends C0972g<C1491ep> {

    /* renamed from: td */
    private static final C1501et f3040td = new C1501et();

    /* renamed from: com.google.android.gms.internal.et$a */
    private static final class C1502a extends Exception {
        public C1502a(String str) {
            super(str);
        }
    }

    private C1501et() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    /* renamed from: c */
    private static boolean m4400c(Activity activity) throws C1502a {
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar")) {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
        }
        throw new C1502a("InAppPurchaseManager requires the useClientJar flag in intent extras.");
    }

    /* renamed from: e */
    public static C1488eo m4401e(Activity activity) {
        try {
            if (!m4400c(activity)) {
                return f3040td.m4402f(activity);
            }
            C1607gr.m4705S("Using AdOverlay from the client jar.");
            return new C1473ee(activity);
        } catch (C1502a e) {
            C1607gr.m4709W(e.getMessage());
            return null;
        }
    }

    /* renamed from: f */
    private C1488eo m4402f(Activity activity) {
        try {
            return C1488eo.C1489a.m4391w(((C1491ep) mo12191L(activity)).mo15241c(C0970e.m1613k(activity)));
        } catch (RemoteException | C0972g.C0973a e) {
            C1607gr.m4713d("Could not create remote InAppPurchaseManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C1491ep mo12192d(IBinder iBinder) {
        return C1491ep.C1492a.m4393x(iBinder);
    }
}
