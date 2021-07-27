package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1541ff;

@C1507ey
/* renamed from: com.google.android.gms.internal.fe */
public final class C1539fe {

    /* renamed from: com.google.android.gms.internal.fe$a */
    public interface C1540a {
        /* renamed from: a */
        void mo15262a(C1548fj fjVar);
    }

    /* renamed from: a */
    public static C1584gf m4468a(Context context, C1545fh fhVar, C1540a aVar) {
        return fhVar.f3304lO.f3557wV ? m4469b(context, fhVar, aVar) : m4470c(context, fhVar, aVar);
    }

    /* renamed from: b */
    private static C1584gf m4469b(Context context, C1545fh fhVar, C1540a aVar) {
        C1607gr.m4705S("Fetching ad response from local ad request service.");
        C1541ff.C1542a aVar2 = new C1541ff.C1542a(context, fhVar, aVar);
        aVar2.start();
        return aVar2;
    }

    /* renamed from: c */
    private static C1584gf m4470c(Context context, C1545fh fhVar, C1540a aVar) {
        C1607gr.m4705S("Fetching ad response from remote ad request service.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
            return new C1541ff.C1543b(context, fhVar, aVar);
        }
        C1607gr.m4709W("Failed to connect to remote ad request service.");
        return null;
    }
}
