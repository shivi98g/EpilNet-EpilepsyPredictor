package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.C1840ll;
import com.google.android.gms.internal.C1871lx;
import com.google.android.gms.internal.C1890md;
import com.google.android.gms.internal.C1942mq;
import com.google.android.gms.internal.C1944ms;
import com.google.android.gms.internal.C1946mu;
import java.util.List;

public abstract class FitnessSensorService extends Service {
    public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";

    /* renamed from: Ww */
    private C1076a f1628Ww;

    /* renamed from: com.google.android.gms.fitness.service.FitnessSensorService$a */
    private static class C1076a extends C1946mu.C1947a {

        /* renamed from: Wx */
        private final FitnessSensorService f1629Wx;

        private C1076a(FitnessSensorService fitnessSensorService) {
            this.f1629Wx = fitnessSensorService;
        }

        /* renamed from: kw */
        private void m2010kw() throws SecurityException {
            int callingUid = Binder.getCallingUid();
            if (C1840ll.m5544im()) {
                ((AppOpsManager) this.f1629Wx.getSystemService("appops")).checkPackage(callingUid, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
                return;
            }
            String[] packagesForUid = this.f1629Wx.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid != null) {
                int length = packagesForUid.length;
                int i = 0;
                while (i < length) {
                    if (!packagesForUid[i].equals(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE)) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            throw new SecurityException("Unauthorized caller");
        }

        /* renamed from: a */
        public void mo12971a(FitnessSensorServiceRequest fitnessSensorServiceRequest, C1890md mdVar) throws RemoteException {
            m2010kw();
            mdVar.mo16078j(this.f1629Wx.onRegister(fitnessSensorServiceRequest) ? Status.f663Kw : new Status(13));
        }

        /* renamed from: a */
        public void mo12972a(C1942mq mqVar, C1871lx lxVar) throws RemoteException {
            m2010kw();
            lxVar.mo16085a(new DataSourcesResult(this.f1629Wx.onFindDataSources(mqVar.getDataTypes()), Status.f663Kw));
        }

        /* renamed from: a */
        public void mo12973a(C1944ms msVar, C1890md mdVar) throws RemoteException {
            m2010kw();
            mdVar.mo16078j(this.f1629Wx.onUnregister(msVar.getDataSource()) ? Status.f663Kw : new Status(13));
        }
    }

    public final IBinder onBind(Intent intent) {
        if (!SERVICE_INTERFACE.equals(intent.getAction())) {
            return null;
        }
        if (Log.isLoggable("FitnessSensorService", 3)) {
            Log.d("FitnessSensorService", "Intent " + intent + " received by " + getClass().getName());
        }
        return this.f1628Ww.asBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.f1628Ww = new C1076a();
    }

    public abstract List<DataSource> onFindDataSources(List<DataType> list);

    public abstract boolean onRegister(FitnessSensorServiceRequest fitnessSensorServiceRequest);

    public abstract boolean onUnregister(DataSource dataSource);
}
