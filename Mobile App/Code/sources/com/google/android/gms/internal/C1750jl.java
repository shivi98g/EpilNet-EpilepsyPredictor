package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C1759jm;
import com.google.android.gms.internal.C1772js;
import com.google.android.gms.internal.C1775jt;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.jl */
public abstract class C1750jl<T extends IInterface> implements Api.C0666a, C1759jm.C1761b {

    /* renamed from: MP */
    public static final String[] f3899MP = {"service_esmobile", "service_googleme"};

    /* renamed from: JF */
    private final Looper f3900JF;
    /* access modifiers changed from: private */

    /* renamed from: JS */
    public final C1759jm f3901JS;

    /* renamed from: MJ */
    private T f3902MJ;
    /* access modifiers changed from: private */

    /* renamed from: MK */
    public final ArrayList<C1750jl<T>.b<?>> f3903MK;
    /* access modifiers changed from: private */

    /* renamed from: ML */
    public C1750jl<T>.f f3904ML;

    /* renamed from: MM */
    private int f3905MM;

    /* renamed from: MN */
    private final String[] f3906MN;

    /* renamed from: MO */
    boolean f3907MO;
    /* access modifiers changed from: private */
    public final Context mContext;

    /* renamed from: mH */
    private final Object f3908mH;
    final Handler mHandler;

    /* renamed from: com.google.android.gms.internal.jl$a */
    final class C1751a extends Handler {
        public C1751a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1 && !C1750jl.this.isConnecting()) {
                C1752b bVar = (C1752b) message.obj;
                bVar.mo15832hx();
                bVar.unregister();
            } else if (message.what == 3) {
                C1750jl.this.f3901JS.mo15844b(new ConnectionResult(((Integer) message.obj).intValue(), (PendingIntent) null));
            } else if (message.what == 4) {
                C1750jl.this.m5182a(4, null);
                C1750jl.this.f3901JS.mo15843aE(((Integer) message.obj).intValue());
                boolean unused = C1750jl.this.m5184a(4, 1, null);
            } else if (message.what == 2 && !C1750jl.this.isConnected()) {
                C1752b bVar2 = (C1752b) message.obj;
                bVar2.mo15832hx();
                bVar2.unregister();
            } else if (message.what == 2 || message.what == 1) {
                ((C1752b) message.obj).mo15833hy();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.jl$b */
    protected abstract class C1752b<TListener> {

        /* renamed from: MR */
        private boolean f3911MR = false;
        private TListener mListener;

        public C1752b(TListener tlistener) {
            this.mListener = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract void mo15831g(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: hx */
        public abstract void mo15832hx();

        /* renamed from: hy */
        public void mo15833hy() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.mListener;
                if (this.f3911MR) {
                    Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
                }
            }
            if (tlistener != null) {
                try {
                    mo15831g(tlistener);
                } catch (RuntimeException e) {
                    mo15832hx();
                    throw e;
                }
            } else {
                mo15832hx();
            }
            synchronized (this) {
                this.f3911MR = true;
            }
            unregister();
        }

        /* renamed from: hz */
        public void mo15834hz() {
            synchronized (this) {
                this.mListener = null;
            }
        }

        public void unregister() {
            mo15834hz();
            synchronized (C1750jl.this.f3903MK) {
                C1750jl.this.f3903MK.remove(this);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.jl$c */
    public static final class C1753c implements GoogleApiClient.ConnectionCallbacks {

        /* renamed from: MS */
        private final GooglePlayServicesClient.ConnectionCallbacks f3912MS;

        public C1753c(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
            this.f3912MS = connectionCallbacks;
        }

        public boolean equals(Object obj) {
            return obj instanceof C1753c ? this.f3912MS.equals(((C1753c) obj).f3912MS) : this.f3912MS.equals(obj);
        }

        public void onConnected(Bundle bundle) {
            this.f3912MS.onConnected(bundle);
        }

        public void onConnectionSuspended(int i) {
            this.f3912MS.onDisconnected();
        }
    }

    /* renamed from: com.google.android.gms.internal.jl$d */
    public abstract class C1754d<TListener> extends C1750jl<T>.b<TListener> {

        /* renamed from: JG */
        private final DataHolder f3913JG;

        public C1754d(TListener tlistener, DataHolder dataHolder) {
            super(tlistener);
            this.f3913JG = dataHolder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo15837b(TListener tlistener, DataHolder dataHolder);

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo15831g(TListener tlistener) {
            mo15837b(tlistener, this.f3913JG);
        }

        /* access modifiers changed from: protected */
        /* renamed from: hx */
        public void mo15832hx() {
            if (this.f3913JG != null) {
                this.f3913JG.close();
            }
        }

        /* renamed from: hy */
        public /* bridge */ /* synthetic */ void mo15833hy() {
            super.mo15833hy();
        }

        /* renamed from: hz */
        public /* bridge */ /* synthetic */ void mo15834hz() {
            super.mo15834hz();
        }

        public /* bridge */ /* synthetic */ void unregister() {
            super.unregister();
        }
    }

    /* renamed from: com.google.android.gms.internal.jl$e */
    public static final class C1755e extends C1772js.C1773a {

        /* renamed from: MT */
        private C1750jl f3915MT;

        public C1755e(C1750jl jlVar) {
            this.f3915MT = jlVar;
        }

        /* renamed from: b */
        public void mo15838b(int i, IBinder iBinder, Bundle bundle) {
            C1785jx.m5359b("onPostInitComplete can be called only once per call to getServiceFromBroker", (Object) this.f3915MT);
            this.f3915MT.mo11710a(i, iBinder, bundle);
            this.f3915MT = null;
        }
    }

    /* renamed from: com.google.android.gms.internal.jl$f */
    public final class C1756f implements ServiceConnection {
        public C1756f() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1750jl.this.mo15813N(iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1750jl.this.mHandler.sendMessage(C1750jl.this.mHandler.obtainMessage(4, 1));
        }
    }

    /* renamed from: com.google.android.gms.internal.jl$g */
    public static final class C1757g implements GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: MU */
        private final GooglePlayServicesClient.OnConnectionFailedListener f3917MU;

        public C1757g(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.f3917MU = onConnectionFailedListener;
        }

        public boolean equals(Object obj) {
            return obj instanceof C1757g ? this.f3917MU.equals(((C1757g) obj).f3917MU) : this.f3917MU.equals(obj);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.f3917MU.onConnectionFailed(connectionResult);
        }
    }

    /* renamed from: com.google.android.gms.internal.jl$h */
    protected final class C1758h extends C1750jl<T>.b<Boolean> {

        /* renamed from: MV */
        public final Bundle f3919MV;

        /* renamed from: MW */
        public final IBinder f3920MW;
        public final int statusCode;

        public C1758h(int i, IBinder iBinder, Bundle bundle) {
            super(true);
            this.statusCode = i;
            this.f3920MW = iBinder;
            this.f3919MV = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo15831g(Boolean bool) {
            IInterface l;
            if (bool == null) {
                C1750jl.this.m5182a(1, null);
                return;
            }
            int i = this.statusCode;
            if (i == 0) {
                try {
                    if (C1750jl.this.mo11715bL().equals(this.f3920MW.getInterfaceDescriptor()) && (l = C1750jl.this.mo11721l(this.f3920MW)) != null) {
                        C1750jl.this.m5182a(3, l);
                        C1750jl.this.f3901JS.mo15845dU();
                        return;
                    }
                } catch (RemoteException e) {
                }
                C1762jn.m5224J(C1750jl.this.mContext).mo15855b(C1750jl.this.mo11714bK(), C1750jl.this.f3904ML);
                C1756f unused = C1750jl.this.f3904ML = null;
                C1750jl.this.m5182a(1, null);
                C1750jl.this.f3901JS.mo15844b(new ConnectionResult(8, (PendingIntent) null));
            } else if (i != 10) {
                PendingIntent pendingIntent = this.f3919MV != null ? (PendingIntent) this.f3919MV.getParcelable("pendingIntent") : null;
                if (C1750jl.this.f3904ML != null) {
                    C1762jn.m5224J(C1750jl.this.mContext).mo15855b(C1750jl.this.mo11714bK(), C1750jl.this.f3904ML);
                    C1756f unused2 = C1750jl.this.f3904ML = null;
                }
                C1750jl.this.m5182a(1, null);
                C1750jl.this.f3901JS.mo15844b(new ConnectionResult(this.statusCode, pendingIntent));
            } else {
                C1750jl.this.m5182a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: hx */
        public void mo15832hx() {
        }
    }

    protected C1750jl(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String... strArr) {
        this.f3908mH = new Object();
        this.f3903MK = new ArrayList<>();
        this.f3905MM = 1;
        this.f3907MO = false;
        this.mContext = (Context) C1785jx.m5364i(context);
        this.f3900JF = (Looper) C1785jx.m5359b(looper, (Object) "Looper must not be null");
        this.f3901JS = new C1759jm(context, looper, this);
        this.mHandler = new C1751a(looper);
        mo13473c(strArr);
        this.f3906MN = strArr;
        registerConnectionCallbacks((GoogleApiClient.ConnectionCallbacks) C1785jx.m5364i(connectionCallbacks));
        registerConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener) C1785jx.m5364i(onConnectionFailedListener));
    }

    @Deprecated
    protected C1750jl(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String... strArr) {
        this(context, context.getMainLooper(), new C1753c(connectionCallbacks), new C1757g(onConnectionFailedListener), strArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5182a(int i, T t) {
        boolean z = false;
        if ((i == 3) == (t != null)) {
            z = true;
        }
        C1785jx.m5354L(z);
        synchronized (this.f3908mH) {
            this.f3905MM = i;
            this.f3902MJ = t;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m5184a(int i, int i2, T t) {
        synchronized (this.f3908mH) {
            if (this.f3905MM != i) {
                return false;
            }
            m5182a(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void mo15813N(IBinder iBinder) {
        try {
            mo11711a(C1775jt.C1776a.m5301Q(iBinder), new C1755e(this));
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            mo15815aD(1);
        } catch (RemoteException e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11710a(int i, IBinder iBinder, Bundle bundle) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, new C1758h(i, iBinder, bundle)));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo15814a(C1750jl<T>.b<?> bVar) {
        synchronized (this.f3903MK) {
            this.f3903MK.add(bVar);
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11711a(C1775jt jtVar, C1755e eVar) throws RemoteException;

    /* renamed from: aD */
    public void mo15815aD(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public abstract String mo11714bK();

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public abstract String mo11715bL();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13473c(String... strArr) {
    }

    public void connect() {
        Handler handler;
        Handler handler2;
        this.f3907MO = true;
        m5182a(2, (IInterface) null);
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mContext);
        if (isGooglePlayServicesAvailable != 0) {
            m5182a(1, (IInterface) null);
            handler = this.mHandler;
            handler2 = this.mHandler;
        } else {
            if (this.f3904ML != null) {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + mo11714bK());
                C1762jn.m5224J(this.mContext).mo15855b(mo11714bK(), this.f3904ML);
            }
            this.f3904ML = new C1756f();
            if (!C1762jn.m5224J(this.mContext).mo15854a(mo11714bK(), this.f3904ML)) {
                Log.e("GmsClient", "unable to connect to service: " + mo11714bK());
                handler = this.mHandler;
                handler2 = this.mHandler;
                isGooglePlayServicesAvailable = 9;
            } else {
                return;
            }
        }
        handler.sendMessage(handler2.obtainMessage(3, Integer.valueOf(isGooglePlayServicesAvailable)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: dS */
    public final void mo15816dS() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void disconnect() {
        this.f3907MO = false;
        synchronized (this.f3903MK) {
            int size = this.f3903MK.size();
            for (int i = 0; i < size; i++) {
                this.f3903MK.get(i).mo15834hz();
            }
            this.f3903MK.clear();
        }
        m5182a(1, (IInterface) null);
        if (this.f3904ML != null) {
            C1762jn.m5224J(this.mContext).mo15855b(mo11714bK(), this.f3904ML);
            this.f3904ML = null;
        }
    }

    /* renamed from: fX */
    public Bundle mo11002fX() {
        return null;
    }

    /* renamed from: gN */
    public boolean mo11003gN() {
        return this.f3907MO;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.f3900JF;
    }

    /* renamed from: hv */
    public final String[] mo15819hv() {
        return this.f3906MN;
    }

    /* renamed from: hw */
    public final T mo15820hw() throws DeadObjectException {
        T t;
        synchronized (this.f3908mH) {
            if (this.f3905MM == 4) {
                throw new DeadObjectException();
            }
            mo15816dS();
            C1785jx.m5355a(this.f3902MJ != null, "Client is connected but service is null");
            t = this.f3902MJ;
        }
        return t;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.f3908mH) {
            z = this.f3905MM == 3;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.f3908mH) {
            z = this.f3905MM == 2;
        }
        return z;
    }

    @Deprecated
    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.f3901JS.isConnectionCallbacksRegistered(new C1753c(connectionCallbacks));
    }

    @Deprecated
    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f3901JS.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract T mo11721l(IBinder iBinder);

    @Deprecated
    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f3901JS.registerConnectionCallbacks(new C1753c(connectionCallbacks));
    }

    public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f3901JS.registerConnectionCallbacks(connectionCallbacks);
    }

    @Deprecated
    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f3901JS.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f3901JS.registerConnectionFailedListener(onConnectionFailedListener);
    }

    @Deprecated
    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f3901JS.unregisterConnectionCallbacks(new C1753c(connectionCallbacks));
    }

    @Deprecated
    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f3901JS.unregisterConnectionFailedListener(onConnectionFailedListener);
    }
}
