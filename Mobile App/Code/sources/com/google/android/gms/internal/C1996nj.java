package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.C2203b;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.nj */
public class C1996nj {

    /* renamed from: Ee */
    private final C2007np<C1993ni> f4141Ee;
    private ContentProviderClient agS = null;
    private boolean agT = false;
    private HashMap<LocationListener, C1998b> agU = new HashMap<>();
    private final Context mContext;

    /* renamed from: com.google.android.gms.internal.nj$a */
    private static class C1997a extends Handler {
        private final LocationListener agV;

        public C1997a(LocationListener locationListener) {
            this.agV = locationListener;
        }

        public C1997a(LocationListener locationListener, Looper looper) {
            super(looper);
            this.agV = locationListener;
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                return;
            }
            this.agV.onLocationChanged(new Location((Location) message.obj));
        }
    }

    /* renamed from: com.google.android.gms.internal.nj$b */
    private static class C1998b extends C2203b.C2204a {
        private Handler agW;

        C1998b(LocationListener locationListener, Looper looper) {
            this.agW = looper == null ? new C1997a(locationListener) : new C1997a(locationListener, looper);
        }

        public void onLocationChanged(Location location) {
            if (this.agW == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = location;
            this.agW.sendMessage(obtain);
        }

        public void release() {
            this.agW = null;
        }
    }

    public C1996nj(Context context, C2007np<C1993ni> npVar) {
        this.mContext = context;
        this.f4141Ee = npVar;
    }

    /* renamed from: a */
    private C1998b m5919a(LocationListener locationListener, Looper looper) {
        C1998b bVar;
        if (looper == null) {
            C1785jx.m5359b(Looper.myLooper(), (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        }
        synchronized (this.agU) {
            bVar = this.agU.get(locationListener);
            if (bVar == null) {
                bVar = new C1998b(locationListener, looper);
            }
            this.agU.put(locationListener, bVar);
        }
        return bVar;
    }

    /* renamed from: S */
    public void mo16321S(boolean z) throws RemoteException {
        this.f4141Ee.mo16236dS();
        this.f4141Ee.mo16237hw().mo16282S(z);
        this.agT = z;
    }

    /* renamed from: a */
    public void mo16322a(LocationListener locationListener) throws RemoteException {
        this.f4141Ee.mo16236dS();
        C1785jx.m5359b(locationListener, (Object) "Invalid null listener");
        synchronized (this.agU) {
            C1998b remove = this.agU.remove(locationListener);
            if (this.agS != null && this.agU.isEmpty()) {
                this.agS.release();
                this.agS = null;
            }
            if (remove != null) {
                remove.release();
                this.f4141Ee.mo16237hw().mo16301a((C2203b) remove);
            }
        }
    }

    /* renamed from: a */
    public void mo16323a(LocationRequest locationRequest, LocationListener locationListener, Looper looper) throws RemoteException {
        this.f4141Ee.mo16236dS();
        this.f4141Ee.mo16237hw().mo16299a(locationRequest, (C2203b) m5919a(locationListener, looper));
    }

    /* renamed from: b */
    public void mo16324b(Location location) throws RemoteException {
        this.f4141Ee.mo16236dS();
        this.f4141Ee.mo16237hw().mo16311b(location);
    }

    /* renamed from: b */
    public void mo16325b(LocationRequest locationRequest, PendingIntent pendingIntent) throws RemoteException {
        this.f4141Ee.mo16236dS();
        this.f4141Ee.mo16237hw().mo16298a(locationRequest, pendingIntent);
    }

    /* renamed from: c */
    public void mo16326c(PendingIntent pendingIntent) throws RemoteException {
        this.f4141Ee.mo16236dS();
        this.f4141Ee.mo16237hw().mo16310b(pendingIntent);
    }

    /* renamed from: nl */
    public Location mo16327nl() {
        this.f4141Ee.mo16236dS();
        try {
            return this.f4141Ee.mo16237hw().mo16314bZ(this.mContext.getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: nm */
    public void mo16328nm() {
        if (this.agT) {
            try {
                mo16321S(false);
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public void removeAllListeners() {
        try {
            synchronized (this.agU) {
                for (C1998b next : this.agU.values()) {
                    if (next != null) {
                        this.f4141Ee.mo16237hw().mo16301a((C2203b) next);
                    }
                }
                this.agU.clear();
            }
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
