package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C0970e;
import com.google.android.gms.dynamic.C0972g;
import com.google.android.gms.internal.C1314bd;
import com.google.android.gms.internal.C1317be;

@C1507ey
/* renamed from: com.google.android.gms.internal.au */
public final class C1302au extends C0972g<C1317be> {

    /* renamed from: oc */
    private static final C1302au f2384oc = new C1302au();

    private C1302au() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public static C1314bd m3939a(Context context, C1306ay ayVar, String str, C1401cx cxVar) {
        C1314bd b;
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0 && (b = f2384oc.m3940b(context, ayVar, str, cxVar)) != null) {
            return b;
        }
        C1607gr.m4705S("Using AdManager from the client jar.");
        return new C2182u(context, ayVar, str, cxVar, new C1608gs(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, true));
    }

    /* renamed from: b */
    private C1314bd m3940b(Context context, C1306ay ayVar, String str, C1401cx cxVar) {
        try {
            return C1314bd.C1315a.m3968f(((C1317be) mo12191L(context)).mo14855a(C0970e.m1613k(context), ayVar, str, cxVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE));
        } catch (RemoteException | C0972g.C0973a e) {
            C1607gr.m4713d("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1317be mo12192d(IBinder iBinder) {
        return C1317be.C1318a.m3980g(iBinder);
    }
}
