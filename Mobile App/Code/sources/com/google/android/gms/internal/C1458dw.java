package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0972g;
import com.google.android.gms.internal.C1460dx;
import com.google.android.gms.internal.C1463dy;

@C1507ey
/* renamed from: com.google.android.gms.internal.dw */
public final class C1458dw extends C0972g<C1463dy> {

    /* renamed from: sy */
    private static final C1458dw f2988sy = new C1458dw();

    /* renamed from: com.google.android.gms.internal.dw$a */
    private static final class C1459a extends Exception {
        public C1459a(String str) {
            super(str);
        }
    }

    private C1458dw() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: b */
    public static C1460dx m4329b(Activity activity) {
        try {
            if (!m4330c(activity)) {
                return f2988sy.m4331d(activity);
            }
            C1607gr.m4705S("Using AdOverlay from the client jar.");
            return new C1445dp(activity);
        } catch (C1459a e) {
            C1607gr.m4709W(e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m4330c(Activity activity) throws C1459a {
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        throw new C1459a("Ad overlay requires the useClientJar flag in intent extras.");
    }

    /* renamed from: d */
    private C1460dx m4331d(Activity activity) {
        try {
            return C1460dx.C1461a.m4335r(((C1463dy) mo12191L(activity)).mo15177b(C0970e.m1613k(activity)));
        } catch (RemoteException | C0972g.C0973a e) {
            C1607gr.m4713d("Could not create remote AdOverlay.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C1463dy mo12192d(IBinder iBinder) {
        return C1463dy.C1464a.m4338s(iBinder);
    }
}
