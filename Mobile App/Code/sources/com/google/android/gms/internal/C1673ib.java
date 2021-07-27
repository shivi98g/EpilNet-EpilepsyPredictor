package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.AppStateManager;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.C0674b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C1684id;
import com.google.android.gms.internal.C1750jl;

/* renamed from: com.google.android.gms.internal.ib */
public final class C1673ib extends C1750jl<C1684id> {

    /* renamed from: DZ */
    private final String f3687DZ;

    /* renamed from: com.google.android.gms.internal.ib$a */
    private static final class C1674a extends C1672ia {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<AppStateManager.StateDeletedResult> f3688Ea;

        public C1674a(BaseImplementation.C0670b<AppStateManager.StateDeletedResult> bVar) {
            this.f3688Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Result holder must not be null");
        }

        /* renamed from: e */
        public void mo15594e(int i, int i2) {
            this.f3688Ea.mo10914b(new C1675b(new Status(i), i2));
        }
    }

    /* renamed from: com.google.android.gms.internal.ib$b */
    private static final class C1675b implements AppStateManager.StateDeletedResult {

        /* renamed from: Eb */
        private final Status f3689Eb;

        /* renamed from: Ec */
        private final int f3690Ec;

        public C1675b(Status status, int i) {
            this.f3689Eb = status;
            this.f3690Ec = i;
        }

        public int getStateKey() {
            return this.f3690Ec;
        }

        public Status getStatus() {
            return this.f3689Eb;
        }
    }

    /* renamed from: com.google.android.gms.internal.ib$c */
    private static final class C1676c extends C1672ia {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<AppStateManager.StateListResult> f3691Ea;

        public C1676c(BaseImplementation.C0670b<AppStateManager.StateListResult> bVar) {
            this.f3691Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Result holder must not be null");
        }

        /* renamed from: a */
        public void mo15593a(DataHolder dataHolder) {
            this.f3691Ea.mo10914b(new C1677d(dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.ib$d */
    private static final class C1677d extends C0674b implements AppStateManager.StateListResult {

        /* renamed from: Ed */
        private final AppStateBuffer f3692Ed;

        public C1677d(DataHolder dataHolder) {
            super(dataHolder);
            this.f3692Ed = new AppStateBuffer(dataHolder);
        }

        public AppStateBuffer getStateBuffer() {
            return this.f3692Ed;
        }
    }

    /* renamed from: com.google.android.gms.internal.ib$e */
    private static final class C1678e extends C1672ia {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<AppStateManager.StateResult> f3693Ea;

        public C1678e(BaseImplementation.C0670b<AppStateManager.StateResult> bVar) {
            this.f3693Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Result holder must not be null");
        }

        /* renamed from: a */
        public void mo15592a(int i, DataHolder dataHolder) {
            this.f3693Ea.mo10914b(new C1679f(i, dataHolder));
        }
    }

    /* renamed from: com.google.android.gms.internal.ib$f */
    private static final class C1679f extends C0674b implements AppStateManager.StateConflictResult, AppStateManager.StateLoadedResult, AppStateManager.StateResult {

        /* renamed from: Ec */
        private final int f3694Ec;

        /* renamed from: Ed */
        private final AppStateBuffer f3695Ed;

        public C1679f(int i, DataHolder dataHolder) {
            super(dataHolder);
            this.f3694Ec = i;
            this.f3695Ed = new AppStateBuffer(dataHolder);
        }

        /* renamed from: fN */
        private boolean m4918fN() {
            return this.f671Eb.getStatusCode() == 2000;
        }

        public AppStateManager.StateConflictResult getConflictResult() {
            if (m4918fN()) {
                return this;
            }
            return null;
        }

        public AppStateManager.StateLoadedResult getLoadedResult() {
            if (m4918fN()) {
                return null;
            }
            return this;
        }

        public byte[] getLocalData() {
            if (this.f3695Ed.getCount() == 0) {
                return null;
            }
            return this.f3695Ed.get(0).getLocalData();
        }

        public String getResolvedVersion() {
            if (this.f3695Ed.getCount() == 0) {
                return null;
            }
            return this.f3695Ed.get(0).getConflictVersion();
        }

        public byte[] getServerData() {
            if (this.f3695Ed.getCount() == 0) {
                return null;
            }
            return this.f3695Ed.get(0).getConflictData();
        }

        public int getStateKey() {
            return this.f3694Ec;
        }

        public void release() {
            this.f3695Ed.release();
        }
    }

    /* renamed from: com.google.android.gms.internal.ib$g */
    private static final class C1680g extends C1672ia {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Status> f3696Ea;

        public C1680g(BaseImplementation.C0670b<Status> bVar) {
            this.f3696Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: fK */
        public void mo15595fK() {
            this.f3696Ea.mo10914b(new Status(0));
        }
    }

    public C1673ib(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, String[] strArr) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f3687DZ = (String) C1785jx.m5364i(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public C1684id mo11721l(IBinder iBinder) {
        return C1684id.C1685a.m4940J(iBinder);
    }

    /* renamed from: a */
    public void mo15597a(BaseImplementation.C0670b<AppStateManager.StateListResult> bVar) {
        try {
            ((C1684id) mo15820hw()).mo15608a(new C1676c(bVar));
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo15598a(BaseImplementation.C0670b<AppStateManager.StateDeletedResult> bVar, int i) {
        try {
            ((C1684id) mo15820hw()).mo15613b(new C1674a(bVar), i);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo15599a(BaseImplementation.C0670b<AppStateManager.StateResult> bVar, int i, String str, byte[] bArr) {
        try {
            ((C1684id) mo15820hw()).mo15610a(new C1678e(bVar), i, str, bArr);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo15600a(BaseImplementation.C0670b<AppStateManager.StateResult> bVar, int i, byte[] bArr) {
        C1678e eVar;
        if (bVar == null) {
            eVar = null;
        } else {
            try {
                eVar = new C1678e(bVar);
            } catch (RemoteException e) {
                Log.w("AppStateClient", "service died");
                return;
            }
        }
        ((C1684id) mo15820hw()).mo15611a(eVar, i, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15893a((C1772js) eVar, (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f3687DZ, mo15819hv());
    }

    /* renamed from: b */
    public void mo15601b(BaseImplementation.C0670b<Status> bVar) {
        try {
            ((C1684id) mo15820hw()).mo15612b(new C1680g(bVar));
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* renamed from: b */
    public void mo15602b(BaseImplementation.C0670b<AppStateManager.StateResult> bVar, int i) {
        try {
            ((C1684id) mo15820hw()).mo15609a(new C1678e(bVar), i);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.appstate.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13473c(String... strArr) {
        boolean z = false;
        for (String equals : strArr) {
            if (equals.equals(Scopes.APP_STATE)) {
                z = true;
            }
        }
        C1785jx.m5355a(z, String.format("App State APIs requires %s to function.", new Object[]{Scopes.APP_STATE}));
    }

    /* renamed from: fL */
    public int mo15603fL() {
        try {
            return ((C1684id) mo15820hw()).mo15615fL();
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
            return 2;
        }
    }

    /* renamed from: fM */
    public int mo15604fM() {
        try {
            return ((C1684id) mo15820hw()).mo15616fM();
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
            return 2;
        }
    }
}
