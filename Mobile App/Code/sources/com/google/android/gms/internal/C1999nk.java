package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1990nh;
import com.google.android.gms.location.C2206c;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

/* renamed from: com.google.android.gms.internal.nk */
public class C1999nk extends C1969nc {
    private final C1996nj agX;
    private final C1962mz agY;
    private final C1687ie agZ;

    /* renamed from: com.google.android.gms.internal.nk$a */
    private final class C2000a extends C1750jl<C1993ni>.b<C2206c.C2207a> {

        /* renamed from: Iv */
        private final int f4142Iv;
        private final String[] aha;

        public C2000a(C2206c.C2207a aVar, int i, String[] strArr) {
            super(aVar);
            this.f4142Iv = LocationStatusCodes.m6624eC(i);
            this.aha = strArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo15831g(C2206c.C2207a aVar) {
            if (aVar != null) {
                aVar.mo16270a(this.f4142Iv, this.aha);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: hx */
        public void mo15832hx() {
        }
    }

    /* renamed from: com.google.android.gms.internal.nk$b */
    private static final class C2001b extends C1990nh.C1991a {
        private C2206c.C2207a ahc;
        private C2206c.C2208b ahd;
        private C1999nk ahe;

        public C2001b(C2206c.C2207a aVar, C1999nk nkVar) {
            this.ahc = aVar;
            this.ahd = null;
            this.ahe = nkVar;
        }

        public C2001b(C2206c.C2208b bVar, C1999nk nkVar) {
            this.ahd = bVar;
            this.ahc = null;
            this.ahe = nkVar;
        }

        /* renamed from: a */
        public void mo16276a(int i, PendingIntent pendingIntent) {
            if (this.ahe == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            }
            C1999nk nkVar = this.ahe;
            C1999nk nkVar2 = this.ahe;
            nkVar2.getClass();
            nkVar.mo15814a((C1750jl<T>.b<?>) new C2002c(1, this.ahd, i, pendingIntent));
            this.ahe = null;
            this.ahc = null;
            this.ahd = null;
        }

        /* renamed from: a */
        public void mo16277a(int i, String[] strArr) throws RemoteException {
            if (this.ahe == null) {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            }
            C1999nk nkVar = this.ahe;
            C1999nk nkVar2 = this.ahe;
            nkVar2.getClass();
            nkVar.mo15814a((C1750jl<T>.b<?>) new C2000a(this.ahc, i, strArr));
            this.ahe = null;
            this.ahc = null;
            this.ahd = null;
        }

        /* renamed from: b */
        public void mo16278b(int i, String[] strArr) {
            if (this.ahe == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            }
            C1999nk nkVar = this.ahe;
            C1999nk nkVar2 = this.ahe;
            nkVar2.getClass();
            nkVar.mo15814a((C1750jl<T>.b<?>) new C2002c(2, this.ahd, i, strArr));
            this.ahe = null;
            this.ahc = null;
            this.ahd = null;
        }
    }

    /* renamed from: com.google.android.gms.internal.nk$c */
    private final class C2002c extends C1750jl<C1993ni>.b<C2206c.C2208b> {

        /* renamed from: Iv */
        private final int f4143Iv;
        private final String[] aha;
        private final int ahf;
        private final PendingIntent mPendingIntent;

        public C2002c(int i, C2206c.C2208b bVar, int i2, PendingIntent pendingIntent) {
            super(bVar);
            C1742je.m5152K(i != 1 ? false : true);
            this.ahf = i;
            this.f4143Iv = LocationStatusCodes.m6624eC(i2);
            this.mPendingIntent = pendingIntent;
            this.aha = null;
        }

        public C2002c(int i, C2206c.C2208b bVar, int i2, String[] strArr) {
            super(bVar);
            C1742je.m5152K(i == 2);
            this.ahf = i;
            this.f4143Iv = LocationStatusCodes.m6624eC(i2);
            this.aha = strArr;
            this.mPendingIntent = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo15831g(C2206c.C2208b bVar) {
            if (bVar != null) {
                switch (this.ahf) {
                    case 1:
                        bVar.mo16272a(this.f4143Iv, this.mPendingIntent);
                        return;
                    case 2:
                        bVar.mo16273b(this.f4143Iv, this.aha);
                        return;
                    default:
                        Log.wtf("LocationClientImpl", "Unsupported action: " + this.ahf);
                        return;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: hx */
        public void mo15832hx() {
        }
    }

    public C1999nk(Context context, Looper looper, String str, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str2) {
        this(context, looper, str, connectionCallbacks, onConnectionFailedListener, str2, (String) null);
    }

    public C1999nk(Context context, Looper looper, String str, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str2, String str3) {
        this(context, looper, str, connectionCallbacks, onConnectionFailedListener, str2, str3, (String) null);
    }

    public C1999nk(Context context, Looper looper, String str, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str2, String str3, String str4) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str2);
        this.agX = new C1996nj(context, this.f4137Ee);
        this.agY = C1962mz.m5786a(context, str3, str4, this.f4137Ee);
        this.agZ = C1687ie.m4950a(context, this.f4137Ee);
    }

    /* renamed from: S */
    public void mo16333S(boolean z) throws RemoteException {
        this.agX.mo16321S(z);
    }

    /* renamed from: a */
    public void mo16334a(long j, PendingIntent pendingIntent) throws RemoteException {
        mo15816dS();
        C1785jx.m5364i(pendingIntent);
        C1785jx.m5361b(j >= 0, (Object) "detectionIntervalMillis must be >= 0");
        ((C1993ni) mo15820hw()).mo16283a(j, true, pendingIntent);
    }

    /* renamed from: a */
    public void mo16335a(PendingIntent pendingIntent) throws RemoteException {
        mo15816dS();
        C1785jx.m5364i(pendingIntent);
        ((C1993ni) mo15820hw()).mo16284a(pendingIntent);
    }

    /* renamed from: a */
    public void mo16336a(PendingIntent pendingIntent, C2206c.C2208b bVar) throws RemoteException {
        mo15816dS();
        C1785jx.m5359b(pendingIntent, (Object) "PendingIntent must be specified.");
        C1785jx.m5359b(bVar, (Object) "OnRemoveGeofencesResultListener not provided.");
        ((C1993ni) mo15820hw()).mo16285a(pendingIntent, (C1990nh) bVar == null ? null : new C2001b(bVar, this), getContext().getPackageName());
    }

    /* renamed from: a */
    public void mo16337a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C2206c.C2207a aVar) throws RemoteException {
        mo15816dS();
        C1785jx.m5359b(geofencingRequest, (Object) "geofencingRequest can't be null.");
        C1785jx.m5359b(pendingIntent, (Object) "PendingIntent must be specified.");
        C1785jx.m5359b(aVar, (Object) "OnAddGeofencesResultListener not provided.");
        ((C1993ni) mo15820hw()).mo16297a(geofencingRequest, pendingIntent, (C1990nh) aVar == null ? null : new C2001b(aVar, this));
    }

    /* renamed from: a */
    public void mo16338a(LocationListener locationListener) throws RemoteException {
        this.agX.mo16322a(locationListener);
    }

    /* renamed from: a */
    public void mo16339a(LocationRequest locationRequest, LocationListener locationListener, Looper looper) throws RemoteException {
        synchronized (this.agX) {
            this.agX.mo16323a(locationRequest, locationListener, looper);
        }
    }

    /* renamed from: a */
    public void mo16340a(List<String> list, C2206c.C2208b bVar) throws RemoteException {
        mo15816dS();
        C1785jx.m5361b(list != null && list.size() > 0, (Object) "geofenceRequestIds can't be null nor empty.");
        C1785jx.m5359b(bVar, (Object) "OnRemoveGeofencesResultListener not provided.");
        ((C1993ni) mo15820hw()).mo16309a((String[]) list.toArray(new String[0]), (C1990nh) bVar == null ? null : new C2001b(bVar, this), getContext().getPackageName());
    }

    /* renamed from: b */
    public void mo16341b(Location location) throws RemoteException {
        this.agX.mo16324b(location);
    }

    /* renamed from: b */
    public void mo16342b(LocationRequest locationRequest, PendingIntent pendingIntent) throws RemoteException {
        this.agX.mo16325b(locationRequest, pendingIntent);
    }

    /* renamed from: c */
    public void mo16343c(PendingIntent pendingIntent) throws RemoteException {
        this.agX.mo16326c(pendingIntent);
    }

    public void disconnect() {
        synchronized (this.agX) {
            if (isConnected()) {
                try {
                    this.agX.removeAllListeners();
                    this.agX.mo16328nm();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    /* renamed from: nl */
    public Location mo16344nl() {
        return this.agX.mo16327nl();
    }
}
