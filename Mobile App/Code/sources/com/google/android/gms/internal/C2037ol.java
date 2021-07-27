package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C2031oj;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi;

/* renamed from: com.google.android.gms.internal.ol */
public class C2037ol implements PanoramaApi {

    /* renamed from: com.google.android.gms.internal.ol$a */
    private static abstract class C2041a extends C2043c<PanoramaApi.PanoramaResult> {
        public C2041a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ay */
        public PanoramaApi.PanoramaResult mo10544c(Status status) {
            return new C2045on(status, (Intent) null);
        }
    }

    /* renamed from: com.google.android.gms.internal.ol$b */
    private static final class C2042b extends C2031oj.C2032a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<PanoramaApi.PanoramaResult> f4166Ea;

        public C2042b(BaseImplementation.C0670b<PanoramaApi.PanoramaResult> bVar) {
            this.f4166Ea = bVar;
        }

        /* renamed from: a */
        public void mo16480a(int i, Bundle bundle, int i2, Intent intent) {
            this.f4166Ea.mo10914b(new C2045on(new Status(i, (String) null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null), intent));
        }
    }

    /* renamed from: com.google.android.gms.internal.ol$c */
    private static abstract class C2043c<R extends Result> extends BaseImplementation.C0669a<R, C2044om> {
        protected C2043c(GoogleApiClient googleApiClient) {
            super(Panorama.f4366DQ, googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo16489a(Context context, C2034ok okVar) throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo10540a(C2044om omVar) throws RemoteException {
            mo16489a(omVar.getContext(), (C2034ok) omVar.mo15820hw());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m6024a(Context context, Uri uri) {
        context.revokeUriPermission(uri, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m6025a(final Context context, C2034ok okVar, final C2031oj ojVar, final Uri uri, Bundle bundle) throws RemoteException {
        context.grantUriPermission(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, uri, 1);
        try {
            okVar.mo16484a(new C2031oj.C2032a() {
                /* renamed from: a */
                public void mo16480a(int i, Bundle bundle, int i2, Intent intent) throws RemoteException {
                    C2037ol.m6024a(context, uri);
                    ojVar.mo16480a(i, bundle, i2, intent);
                }
            }, uri, bundle, true);
        } catch (RemoteException e) {
            m6024a(context, uri);
            throw e;
        } catch (RuntimeException e2) {
            m6024a(context, uri);
            throw e2;
        }
    }

    public PendingResult<PanoramaApi.PanoramaResult> loadPanoramaInfo(GoogleApiClient googleApiClient, final Uri uri) {
        return googleApiClient.mo10938a(new C2041a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo16489a(Context context, C2034ok okVar) throws RemoteException {
                okVar.mo16484a(new C2042b(this), uri, (Bundle) null, false);
            }
        });
    }

    public PendingResult<PanoramaApi.PanoramaResult> loadPanoramaInfoAndGrantAccess(GoogleApiClient googleApiClient, final Uri uri) {
        return googleApiClient.mo10938a(new C2041a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo16489a(Context context, C2034ok okVar) throws RemoteException {
                C2037ol.m6025a(context, okVar, new C2042b(this), uri, (Bundle) null);
            }
        });
    }
}
