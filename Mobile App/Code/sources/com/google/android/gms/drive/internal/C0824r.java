package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.C0741c;
import com.google.android.gms.drive.events.C0742d;
import com.google.android.gms.drive.events.DriveEventService;
import com.google.android.gms.drive.internal.C0754ae;
import com.google.android.gms.drive.internal.C0807p;
import com.google.android.gms.drive.internal.C0822q;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C1772js;
import com.google.android.gms.internal.C1775jt;
import com.google.android.gms.internal.C1785jx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.drive.internal.r */
public class C0824r extends C1750jl<C0754ae> {

    /* renamed from: DZ */
    private final String f1063DZ;

    /* renamed from: JK */
    private final String f1064JK;

    /* renamed from: PK */
    private final Bundle f1065PK;

    /* renamed from: PL */
    private final boolean f1066PL;

    /* renamed from: PM */
    private DriveId f1067PM;

    /* renamed from: PN */
    private DriveId f1068PN;

    /* renamed from: PO */
    final GoogleApiClient.ConnectionCallbacks f1069PO;

    /* renamed from: PP */
    final Map<DriveId, Map<C0741c, C0748aa>> f1070PP = new HashMap();

    public C0824r(Context context, Looper looper, C1744jg jgVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String[] strArr, Bundle bundle) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f1063DZ = (String) C1785jx.m5359b(jgVar.mo15787hm(), (Object) "Must call Api.ClientBuilder.setAccountName()");
        this.f1064JK = jgVar.mo15791hq();
        this.f1069PO = connectionCallbacks;
        this.f1065PK = bundle;
        Intent intent = new Intent(DriveEventService.ACTION_HANDLE_EVENT);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        switch (queryIntentServices.size()) {
            case 0:
                this.f1066PL = false;
                return;
            case 1:
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (!serviceInfo.exported) {
                    throw new IllegalStateException("Drive event service " + serviceInfo.name + " must be exported in AndroidManifest.xml");
                }
                this.f1066PL = true;
                return;
            default:
                throw new IllegalStateException("AndroidManifest.xml can only define one service that handles the " + intent.getAction() + " action");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public C0754ae mo11721l(IBinder iBinder) {
        return C0754ae.C0755a.m921X(iBinder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PendingResult<Status> mo11708a(GoogleApiClient googleApiClient, final DriveId driveId, final int i) {
        C1785jx.m5361b(C0742d.m841a(i, driveId), (Object) "id");
        C1785jx.m5355a(isConnected(), "Client must be connected");
        if (this.f1066PL) {
            return googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    rVar.mo11717iG().mo11486a(new AddEventListenerRequest(driveId, i), (C0760ag) null, (String) null, (C0757af) new C0791bg(this));
                }
            });
        }
        throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PendingResult<Status> mo11709a(GoogleApiClient googleApiClient, DriveId driveId, int i, C0741c cVar) {
        C1785jx.m5361b(C0742d.m841a(i, driveId), (Object) "id");
        C1785jx.m5359b(cVar, (Object) "listener");
        C1785jx.m5355a(isConnected(), "Client must be connected");
        synchronized (this.f1070PP) {
            Map map = this.f1070PP.get(driveId);
            if (map == null) {
                map = new HashMap();
                this.f1070PP.put(driveId, map);
            }
            C0748aa aaVar = (C0748aa) map.get(cVar);
            if (aaVar == null) {
                aaVar = new C0748aa(getLooper(), getContext(), i, cVar);
                map.put(cVar, aaVar);
            } else if (aaVar.mo11468bx(i)) {
                C0807p.C0821j jVar = new C0807p.C0821j(googleApiClient, Status.f663Kw);
                return jVar;
            }
            final C0748aa aaVar2 = aaVar;
            aaVar2.mo11467bw(i);
            final DriveId driveId2 = driveId;
            final int i2 = i;
            BaseImplementation.C0669a b = googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    rVar.mo11717iG().mo11486a(new AddEventListenerRequest(driveId2, i2), (C0760ag) aaVar2, (String) null, (C0757af) new C0791bg(this));
                }
            });
            return b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11710a(int i, IBinder iBinder, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f1067PM = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.f1068PN = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.mo11710a(i, iBinder, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        String packageName = getContext().getPackageName();
        C1785jx.m5364i(eVar);
        C1785jx.m5364i(packageName);
        C1785jx.m5364i(mo15819hv());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.f1064JK)) {
            bundle.putString("proxy_package_name", this.f1064JK);
        }
        bundle.putAll(this.f1065PK);
        jtVar.mo15897a((C1772js) eVar, (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, packageName, mo15819hv(), this.f1063DZ, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PendingResult<Status> mo11712b(GoogleApiClient googleApiClient, final DriveId driveId, final int i) {
        C1785jx.m5361b(C0742d.m841a(i, driveId), (Object) "id");
        C1785jx.m5355a(isConnected(), "Client must be connected");
        return googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11503a(new RemoveEventListenerRequest(driveId, i), (C0760ag) null, (String) null, (C0757af) new C0791bg(this));
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PendingResult<Status> mo11713b(GoogleApiClient googleApiClient, DriveId driveId, int i, C0741c cVar) {
        C1785jx.m5361b(C0742d.m841a(i, driveId), (Object) "id");
        C1785jx.m5355a(isConnected(), "Client must be connected");
        C1785jx.m5359b(cVar, (Object) "listener");
        synchronized (this.f1070PP) {
            Map map = this.f1070PP.get(driveId);
            if (map == null) {
                C0807p.C0821j jVar = new C0807p.C0821j(googleApiClient, Status.f663Kw);
                return jVar;
            }
            final C0748aa aaVar = (C0748aa) map.remove(cVar);
            if (aaVar == null) {
                C0807p.C0821j jVar2 = new C0807p.C0821j(googleApiClient, Status.f663Kw);
                return jVar2;
            }
            if (map.isEmpty()) {
                this.f1070PP.remove(driveId);
            }
            final DriveId driveId2 = driveId;
            final int i2 = i;
            BaseImplementation.C0669a b = googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo10540a(C0824r rVar) throws RemoteException {
                    rVar.mo11717iG().mo11503a(new RemoveEventListenerRequest(driveId2, i2), (C0760ag) aaVar, (String) null, (C0757af) new C0791bg(this));
                }
            });
            return b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    /* access modifiers changed from: package-private */
    public PendingResult<Status> cancelPendingActions(GoogleApiClient googleApiClient, final List<String> list) {
        C1785jx.m5354L(list != null);
        C1785jx.m5354L(true ^ list.isEmpty());
        C1785jx.m5355a(isConnected(), "Client must be connected");
        return googleApiClient.mo10940b(new C0822q.C0823a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C0824r rVar) throws RemoteException {
                rVar.mo11717iG().mo11488a(new CancelPendingActionsRequest(list), (C0757af) new C0791bg(this));
            }
        });
    }

    public void disconnect() {
        if (isConnected()) {
            try {
                ((C0754ae) mo15820hw()).mo11496a(new DisconnectRequest());
            } catch (RemoteException e) {
            }
        }
        super.disconnect();
        this.f1070PP.clear();
    }

    /* renamed from: iG */
    public C0754ae mo11717iG() throws DeadObjectException {
        return (C0754ae) mo15820hw();
    }

    /* renamed from: iH */
    public DriveId mo11718iH() {
        return this.f1067PM;
    }

    /* renamed from: iI */
    public DriveId mo11719iI() {
        return this.f1068PN;
    }

    /* renamed from: iJ */
    public boolean mo11720iJ() {
        return this.f1066PL;
    }
}
