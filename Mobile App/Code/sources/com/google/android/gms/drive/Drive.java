package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.internal.C0807p;
import com.google.android.gms.drive.internal.C0824r;
import com.google.android.gms.drive.internal.C0839u;
import com.google.android.gms.drive.internal.C0850x;
import com.google.android.gms.drive.internal.C0865z;
import com.google.android.gms.internal.C1744jg;
import java.util.List;

public final class Drive {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>(new C0728a<Api.ApiOptions.NoOptions>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bundle mo11169a(Api.ApiOptions.NoOptions noOptions) {
            return new Bundle();
        }
    }, f842DQ, new Scope[0]);

    /* renamed from: DQ */
    public static final Api.C0668c<C0824r> f842DQ = new Api.C0668c<>();
    public static final DriveApi DriveApi = new C0807p();
    public static final DrivePreferencesApi DrivePreferencesApi = new C0850x();

    /* renamed from: Oo */
    public static final Scope f843Oo = new Scope("https://www.googleapis.com/auth/drive");

    /* renamed from: Op */
    public static final Scope f844Op = new Scope("https://www.googleapis.com/auth/drive.apps");

    /* renamed from: Oq */
    public static final Api<C0729b> f845Oq = new Api<>(new C0728a<C0729b>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bundle mo11169a(C0729b bVar) {
            return bVar == null ? new Bundle() : bVar.mo11172iq();
        }
    }, f842DQ, new Scope[0]);

    /* renamed from: Or */
    public static final C0732b f846Or = new C0839u();

    /* renamed from: Os */
    public static final C0735e f847Os = new C0865z();
    public static final Scope SCOPE_APPFOLDER = new Scope(Scopes.DRIVE_APPFOLDER);
    public static final Scope SCOPE_FILE = new Scope(Scopes.DRIVE_FILE);

    /* renamed from: com.google.android.gms.drive.Drive$a */
    public static abstract class C0728a<O extends Api.ApiOptions> implements Api.C0667b<C0824r, O> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Bundle mo11169a(O o);

        /* renamed from: a */
        public C0824r mo10533a(Context context, Looper looper, C1744jg jgVar, O o, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            List<String> ho = jgVar.mo15789ho();
            return new C0824r(context, looper, jgVar, connectionCallbacks, onConnectionFailedListener, (String[]) ho.toArray(new String[ho.size()]), mo11169a(o));
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    }

    /* renamed from: com.google.android.gms.drive.Drive$b */
    public static class C0729b implements Api.ApiOptions.Optional {

        /* renamed from: DJ */
        private final Bundle f848DJ;

        private C0729b() {
            this(new Bundle());
        }

        private C0729b(Bundle bundle) {
            this.f848DJ = bundle;
        }

        /* renamed from: iq */
        public Bundle mo11172iq() {
            return this.f848DJ;
        }
    }

    private Drive() {
    }
}
