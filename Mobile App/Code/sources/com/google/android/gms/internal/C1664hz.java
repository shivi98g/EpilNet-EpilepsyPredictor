package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: com.google.android.gms.internal.hz */
public final class C1664hz implements AppIndexApi, C1654ht {

    /* renamed from: com.google.android.gms.internal.hz$a */
    private static final class C1666a implements AppIndexApi.ActionResult {

        /* renamed from: DE */
        private C1664hz f3669DE;

        /* renamed from: DF */
        private PendingResult<Status> f3670DF;

        /* renamed from: DG */
        private Action f3671DG;

        /* renamed from: DH */
        private String f3672DH;

        C1666a(C1664hz hzVar, PendingResult<Status> pendingResult, Action action, String str) {
            this.f3669DE = hzVar;
            this.f3670DF = pendingResult;
            this.f3671DG = action;
            this.f3672DH = str;
        }

        public PendingResult<Status> end(GoogleApiClient googleApiClient) {
            String packageName = ((C1662hx) googleApiClient.mo10937a(C1632hc.f3608CG)).getContext().getPackageName();
            C1652hr a = C1663hy.m4867a(this.f3671DG, this.f3672DH, System.currentTimeMillis(), packageName, 3);
            return this.f3669DE.mo15587a(googleApiClient, a);
        }

        public PendingResult<Status> getPendingResult() {
            return this.f3670DF;
        }
    }

    /* renamed from: com.google.android.gms.internal.hz$b */
    private static abstract class C1667b<T extends Result> extends BaseImplementation.C0669a<T, C1662hx> {
        public C1667b(GoogleApiClient googleApiClient) {
            super(C1632hc.f3608CG, googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo15588a(C1655hu huVar) throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo10540a(C1662hx hxVar) throws RemoteException {
            mo15588a(hxVar.mo15586fH());
        }
    }

    /* renamed from: com.google.android.gms.internal.hz$c */
    private static abstract class C1668c<T extends Result> extends C1667b<Status> {
        C1668c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.hz$d */
    private static final class C1669d extends C1661hw<Status> {
        public C1669d(BaseImplementation.C0670b<Status> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo15578a(Status status) {
            this.f3665DA.mo10914b(status);
        }
    }

    /* renamed from: a */
    public static Intent m4870a(String str, Uri uri) {
        m4871b(str, uri);
        List<String> pathSegments = uri.getPathSegments();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(pathSegments.get(0));
        if (pathSegments.size() > 1) {
            builder.authority(pathSegments.get(1));
            for (int i = 2; i < pathSegments.size(); i++) {
                builder.appendPath(pathSegments.get(i));
            }
        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return new Intent("android.intent.action.VIEW", builder.build());
    }

    /* renamed from: b */
    private static void m4871b(String str, Uri uri) {
        if (!"android-app".equals(uri.getScheme())) {
            throw new IllegalArgumentException("AppIndex: The URI scheme must be 'android-app' and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: " + uri);
        }
        String host = uri.getHost();
        if (str == null || str.equals(host)) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.isEmpty() || pathSegments.get(0).isEmpty()) {
                throw new IllegalArgumentException("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/[host_path]). Provided URI: " + uri);
            }
            return;
        }
        throw new IllegalArgumentException("AppIndex: The URI host must match the package name and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: " + uri);
    }

    /* renamed from: c */
    public static void m4872c(List<AppIndexApi.AppIndexingLink> list) {
        if (list != null) {
            for (AppIndexApi.AppIndexingLink appIndexingLink : list) {
                m4871b((String) null, appIndexingLink.appIndexingUrl);
            }
        }
    }

    /* renamed from: a */
    public PendingResult<Status> mo15587a(GoogleApiClient googleApiClient, final C1652hr... hrVarArr) {
        final String packageName = ((C1662hx) googleApiClient.mo10937a(C1632hc.f3608CG)).getContext().getPackageName();
        return googleApiClient.mo10938a(new C1668c<Status>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo15588a(C1655hu huVar) throws RemoteException {
                huVar.mo15573a(new C1669d(this), packageName, hrVarArr);
            }
        });
    }

    public AppIndexApi.ActionResult action(GoogleApiClient googleApiClient, Action action) {
        String packageName = ((C1662hx) googleApiClient.mo10937a(C1632hc.f3608CG)).getContext().getPackageName();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(currentTimeMillis);
        return new C1666a(this, mo15587a(googleApiClient, C1663hy.m4867a(action, valueOf, currentTimeMillis, packageName, 0)), action, valueOf);
    }

    public PendingResult<Status> view(GoogleApiClient googleApiClient, Activity activity, Intent intent, String str, Uri uri, List<AppIndexApi.AppIndexingLink> list) {
        String packageName = ((C1662hx) googleApiClient.mo10937a(C1632hc.f3608CG)).getContext().getPackageName();
        m4872c(list);
        return mo15587a(googleApiClient, new C1652hr(packageName, intent, str, uri, (String) null, list));
    }

    public PendingResult<Status> view(GoogleApiClient googleApiClient, Activity activity, Uri uri, String str, Uri uri2, List<AppIndexApi.AppIndexingLink> list) {
        String packageName = ((C1662hx) googleApiClient.mo10937a(C1632hc.f3608CG)).getContext().getPackageName();
        m4871b(packageName, uri);
        return view(googleApiClient, activity, m4870a(packageName, uri), str, uri2, list);
    }

    public PendingResult<Status> viewEnd(GoogleApiClient googleApiClient, Activity activity, Intent intent) {
        return mo15587a(googleApiClient, new C1652hr(C1652hr.m4826a(((C1662hx) googleApiClient.mo10937a(C1632hc.f3608CG)).getContext().getPackageName(), intent), System.currentTimeMillis(), 3));
    }

    public PendingResult<Status> viewEnd(GoogleApiClient googleApiClient, Activity activity, Uri uri) {
        return viewEnd(googleApiClient, activity, m4870a(((C1662hx) googleApiClient.mo10937a(C1632hc.f3608CG)).getContext().getPackageName(), uri));
    }
}
