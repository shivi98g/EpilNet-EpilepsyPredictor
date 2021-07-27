package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1709iq;
import com.google.android.gms.internal.C1712ir;
import com.google.android.gms.internal.C1750jl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.im */
public final class C1697im extends C1750jl<C1709iq> {
    /* access modifiers changed from: private */

    /* renamed from: HB */
    public static final Object f3757HB = new Object();
    /* access modifiers changed from: private */

    /* renamed from: HC */
    public static final Object f3758HC = new Object();
    /* access modifiers changed from: private */

    /* renamed from: Hh */
    public static final C1714is f3759Hh = new C1714is("CastClientImpl");
    /* access modifiers changed from: private */

    /* renamed from: FD */
    public final Cast.Listener f3760FD;

    /* renamed from: Gp */
    private double f3761Gp;

    /* renamed from: Gq */
    private boolean f3762Gq;
    /* access modifiers changed from: private */

    /* renamed from: HA */
    public BaseImplementation.C0670b<Status> f3763HA;
    /* access modifiers changed from: private */

    /* renamed from: Hi */
    public ApplicationMetadata f3764Hi;
    /* access modifiers changed from: private */

    /* renamed from: Hj */
    public final CastDevice f3765Hj;
    /* access modifiers changed from: private */

    /* renamed from: Hk */
    public final Map<String, Cast.MessageReceivedCallback> f3766Hk = new HashMap();

    /* renamed from: Hl */
    private final long f3767Hl;

    /* renamed from: Hm */
    private C1701c f3768Hm;

    /* renamed from: Hn */
    private String f3769Hn;

    /* renamed from: Ho */
    private boolean f3770Ho;

    /* renamed from: Hp */
    private boolean f3771Hp;

    /* renamed from: Hq */
    private boolean f3772Hq;

    /* renamed from: Hr */
    private int f3773Hr;

    /* renamed from: Hs */
    private int f3774Hs;

    /* renamed from: Ht */
    private final AtomicLong f3775Ht = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: Hu */
    public String f3776Hu;
    /* access modifiers changed from: private */

    /* renamed from: Hv */
    public String f3777Hv;

    /* renamed from: Hw */
    private Bundle f3778Hw;
    /* access modifiers changed from: private */

    /* renamed from: Hx */
    public final Map<Long, BaseImplementation.C0670b<Status>> f3779Hx = new HashMap();

    /* renamed from: Hy */
    private final C1700b f3780Hy;
    /* access modifiers changed from: private */

    /* renamed from: Hz */
    public BaseImplementation.C0670b<Cast.ApplicationConnectionResult> f3781Hz;
    /* access modifiers changed from: private */
    public final Handler mHandler;

    /* renamed from: com.google.android.gms.internal.im$a */
    private static final class C1699a implements Cast.ApplicationConnectionResult {

        /* renamed from: Eb */
        private final Status f3782Eb;

        /* renamed from: HD */
        private final ApplicationMetadata f3783HD;

        /* renamed from: HE */
        private final String f3784HE;

        /* renamed from: HF */
        private final boolean f3785HF;

        /* renamed from: vZ */
        private final String f3786vZ;

        public C1699a(Status status) {
            this(status, (ApplicationMetadata) null, (String) null, (String) null, false);
        }

        public C1699a(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            this.f3782Eb = status;
            this.f3783HD = applicationMetadata;
            this.f3784HE = str;
            this.f3786vZ = str2;
            this.f3785HF = z;
        }

        public ApplicationMetadata getApplicationMetadata() {
            return this.f3783HD;
        }

        public String getApplicationStatus() {
            return this.f3784HE;
        }

        public String getSessionId() {
            return this.f3786vZ;
        }

        public Status getStatus() {
            return this.f3782Eb;
        }

        public boolean getWasLaunched() {
            return this.f3785HF;
        }
    }

    /* renamed from: com.google.android.gms.internal.im$b */
    private class C1700b implements GoogleApiClient.OnConnectionFailedListener {
        private C1700b() {
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            C1697im.this.m4988ga();
        }
    }

    /* renamed from: com.google.android.gms.internal.im$c */
    private class C1701c extends C1712ir.C1713a {

        /* renamed from: HH */
        private final AtomicBoolean f3789HH;

        private C1701c() {
            this.f3789HH = new AtomicBoolean(false);
        }

        /* renamed from: ah */
        private boolean m5015ah(int i) {
            synchronized (C1697im.f3758HC) {
                if (C1697im.this.f3763HA == null) {
                    return false;
                }
                C1697im.this.f3763HA.mo10914b(new Status(i));
                BaseImplementation.C0670b unused = C1697im.this.f3763HA = null;
                return true;
            }
        }

        /* renamed from: c */
        private void m5016c(long j, int i) {
            BaseImplementation.C0670b bVar;
            synchronized (C1697im.this.f3779Hx) {
                bVar = (BaseImplementation.C0670b) C1697im.this.f3779Hx.remove(Long.valueOf(j));
            }
            if (bVar != null) {
                bVar.mo10914b(new Status(i));
            }
        }

        /* renamed from: a */
        public void mo15664a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            if (!this.f3789HH.get()) {
                ApplicationMetadata unused = C1697im.this.f3764Hi = applicationMetadata;
                String unused2 = C1697im.this.f3776Hu = applicationMetadata.getApplicationId();
                String unused3 = C1697im.this.f3777Hv = str2;
                synchronized (C1697im.f3757HB) {
                    if (C1697im.this.f3781Hz != null) {
                        C1697im.this.f3781Hz.mo10914b(new C1699a(new Status(0), applicationMetadata, str, str2, z));
                        BaseImplementation.C0670b unused4 = C1697im.this.f3781Hz = null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo15665a(String str, double d, boolean z) {
            C1697im.f3759Hh.mo15717b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        /* renamed from: a */
        public void mo15666a(String str, long j) {
            if (!this.f3789HH.get()) {
                m5016c(j, 0);
            }
        }

        /* renamed from: a */
        public void mo15667a(String str, long j, int i) {
            if (!this.f3789HH.get()) {
                m5016c(j, i);
            }
        }

        /* renamed from: ad */
        public void mo15668ad(int i) {
            if (mo15675gg()) {
                C1697im.f3759Hh.mo15717b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
                if (i != 0) {
                    C1697im.this.mo15815aD(2);
                }
            }
        }

        /* renamed from: ae */
        public void mo15669ae(int i) {
            if (!this.f3789HH.get()) {
                synchronized (C1697im.f3757HB) {
                    if (C1697im.this.f3781Hz != null) {
                        C1697im.this.f3781Hz.mo10914b(new C1699a(new Status(i)));
                        BaseImplementation.C0670b unused = C1697im.this.f3781Hz = null;
                    }
                }
            }
        }

        /* renamed from: af */
        public void mo15670af(int i) {
            if (!this.f3789HH.get()) {
                m5015ah(i);
            }
        }

        /* renamed from: ag */
        public void mo15671ag(int i) {
            if (!this.f3789HH.get()) {
                m5015ah(i);
            }
        }

        /* renamed from: b */
        public void mo15672b(final C1694ij ijVar) {
            if (!this.f3789HH.get()) {
                C1697im.f3759Hh.mo15717b("onApplicationStatusChanged", new Object[0]);
                C1697im.this.mHandler.post(new Runnable() {
                    public void run() {
                        C1697im.this.m4973a(ijVar);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo15673b(final C1707io ioVar) {
            if (!this.f3789HH.get()) {
                C1697im.f3759Hh.mo15717b("onDeviceStatusChanged", new Object[0]);
                C1697im.this.mHandler.post(new Runnable() {
                    public void run() {
                        C1697im.this.m4976a(ioVar);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo15674b(String str, byte[] bArr) {
            if (!this.f3789HH.get()) {
                C1697im.f3759Hh.mo15717b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
            }
        }

        /* renamed from: gg */
        public boolean mo15675gg() {
            if (this.f3789HH.getAndSet(true)) {
                return false;
            }
            C1697im.this.m4986fW();
            return true;
        }

        /* renamed from: gh */
        public boolean mo15676gh() {
            return this.f3789HH.get();
        }

        /* renamed from: j */
        public void mo15677j(final String str, final String str2) {
            if (!this.f3789HH.get()) {
                C1697im.f3759Hh.mo15717b("Receive (type=text, ns=%s) %s", str, str2);
                C1697im.this.mHandler.post(new Runnable() {
                    public void run() {
                        Cast.MessageReceivedCallback messageReceivedCallback;
                        synchronized (C1697im.this.f3766Hk) {
                            messageReceivedCallback = (Cast.MessageReceivedCallback) C1697im.this.f3766Hk.get(str);
                        }
                        if (messageReceivedCallback != null) {
                            messageReceivedCallback.onMessageReceived(C1697im.this.f3765Hj, str, str2);
                            return;
                        }
                        C1697im.f3759Hh.mo15717b("Discarded message for unknown namespace '%s'", str);
                    }
                });
            }
        }

        public void onApplicationDisconnected(final int i) {
            if (!this.f3789HH.get()) {
                String unused = C1697im.this.f3776Hu = null;
                String unused2 = C1697im.this.f3777Hv = null;
                m5015ah(i);
                if (C1697im.this.f3760FD != null) {
                    C1697im.this.mHandler.post(new Runnable() {
                        public void run() {
                            if (C1697im.this.f3760FD != null) {
                                C1697im.this.f3760FD.onApplicationDisconnected(i);
                            }
                        }
                    });
                }
            }
        }
    }

    public C1697im(Context context, Looper looper, CastDevice castDevice, long j, Cast.Listener listener, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, (String[]) null);
        this.f3765Hj = castDevice;
        this.f3760FD = listener;
        this.f3767Hl = j;
        this.mHandler = new Handler(looper);
        m4986fW();
        this.f3780Hy = new C1700b();
        registerConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener) this.f3780Hy);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4973a(C1694ij ijVar) {
        boolean z;
        String fT = ijVar.mo15633fT();
        if (!C1706in.m5031a(fT, this.f3769Hn)) {
            this.f3769Hn = fT;
            z = true;
        } else {
            z = false;
        }
        f3759Hh.mo15717b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f3770Ho));
        if (this.f3760FD != null && (z || this.f3770Ho)) {
            this.f3760FD.onApplicationStatusChanged();
        }
        this.f3770Ho = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4976a(C1707io ioVar) {
        boolean z;
        boolean z2;
        boolean z3;
        ApplicationMetadata applicationMetadata = ioVar.getApplicationMetadata();
        if (!C1706in.m5031a(applicationMetadata, this.f3764Hi)) {
            this.f3764Hi = applicationMetadata;
            this.f3760FD.onApplicationMetadataChanged(this.f3764Hi);
        }
        double fZ = ioVar.mo15685fZ();
        if (fZ == Double.NaN || fZ == this.f3761Gp) {
            z = false;
        } else {
            this.f3761Gp = fZ;
            z = true;
        }
        boolean gi = ioVar.mo15688gi();
        if (gi != this.f3762Gq) {
            this.f3762Gq = gi;
            z = true;
        }
        f3759Hh.mo15717b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f3771Hp));
        if (this.f3760FD != null && (z || this.f3771Hp)) {
            this.f3760FD.onVolumeChanged();
        }
        int gj = ioVar.mo15689gj();
        if (gj != this.f3773Hr) {
            this.f3773Hr = gj;
            z2 = true;
        } else {
            z2 = false;
        }
        f3759Hh.mo15717b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.f3771Hp));
        if (this.f3760FD != null && (z2 || this.f3771Hp)) {
            this.f3760FD.mo10645X(this.f3773Hr);
        }
        int gk = ioVar.mo15690gk();
        if (gk != this.f3774Hs) {
            this.f3774Hs = gk;
            z3 = true;
        } else {
            z3 = false;
        }
        f3759Hh.mo15717b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.f3771Hp));
        if (this.f3760FD != null && (z3 || this.f3771Hp)) {
            this.f3760FD.mo10646Y(this.f3774Hs);
        }
        this.f3771Hp = false;
    }

    /* renamed from: c */
    private void m4980c(BaseImplementation.C0670b<Cast.ApplicationConnectionResult> bVar) {
        synchronized (f3757HB) {
            if (this.f3781Hz != null) {
                this.f3781Hz.mo10914b(new C1699a(new Status(2002)));
            }
            this.f3781Hz = bVar;
        }
    }

    /* renamed from: e */
    private void m4984e(BaseImplementation.C0670b<Status> bVar) {
        synchronized (f3758HC) {
            if (this.f3763HA != null) {
                bVar.mo10914b(new Status(2001));
            } else {
                this.f3763HA = bVar;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: fW */
    public void m4986fW() {
        this.f3772Hq = false;
        this.f3773Hr = -1;
        this.f3774Hs = -1;
        this.f3764Hi = null;
        this.f3769Hn = null;
        this.f3761Gp = 0.0d;
        this.f3762Gq = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: ga */
    public void m4988ga() {
        f3759Hh.mo15717b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f3766Hk) {
            this.f3766Hk.clear();
        }
    }

    /* renamed from: gb */
    private void m4989gb() throws IllegalStateException {
        if (!this.f3772Hq || this.f3768Hm == null || this.f3768Hm.mo15676gh()) {
            throw new IllegalStateException("Not connected to a device");
        }
    }

    /* renamed from: I */
    public void mo15648I(boolean z) throws IllegalStateException, RemoteException {
        ((C1709iq) mo15820hw()).mo15701a(z, this.f3761Gp, this.f3762Gq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C1709iq mo11721l(IBinder iBinder) {
        return C1709iq.C1710a.m5056M(iBinder);
    }

    /* renamed from: a */
    public void mo15650a(double d) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        ((C1709iq) mo15820hw()).mo15697a(d, this.f3761Gp, this.f3762Gq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11710a(int i, IBinder iBinder, Bundle bundle) {
        f3759Hh.mo15717b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 1001) {
            this.f3772Hq = true;
            this.f3770Ho = true;
            this.f3771Hp = true;
        } else {
            this.f3772Hq = false;
        }
        if (i == 1001) {
            this.f3778Hw = new Bundle();
            this.f3778Hw.putBoolean(Cast.EXTRA_APP_NO_LONGER_RUNNING, true);
            i = 0;
        }
        super.mo11710a(i, iBinder, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        Bundle bundle = new Bundle();
        f3759Hh.mo15717b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", this.f3776Hu, this.f3777Hv);
        this.f3765Hj.putInBundle(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f3767Hl);
        if (this.f3776Hu != null) {
            bundle.putString("last_application_id", this.f3776Hu);
            if (this.f3777Hv != null) {
                bundle.putString("last_session_id", this.f3777Hv);
            }
        }
        this.f3768Hm = new C1701c();
        jtVar.mo15890a((C1772js) eVar, (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f3768Hm.asBinder(), bundle);
    }

    /* renamed from: a */
    public void mo15651a(String str, Cast.MessageReceivedCallback messageReceivedCallback) throws IllegalArgumentException, IllegalStateException, RemoteException {
        C1706in.m5032aF(str);
        mo15656aE(str);
        if (messageReceivedCallback != null) {
            synchronized (this.f3766Hk) {
                this.f3766Hk.put(str, messageReceivedCallback);
            }
            ((C1709iq) mo15820hw()).mo15703aI(str);
        }
    }

    /* renamed from: a */
    public void mo15652a(String str, LaunchOptions launchOptions, BaseImplementation.C0670b<Cast.ApplicationConnectionResult> bVar) throws IllegalStateException, RemoteException {
        m4980c(bVar);
        ((C1709iq) mo15820hw()).mo15698a(str, launchOptions);
    }

    /* renamed from: a */
    public void mo15653a(String str, BaseImplementation.C0670b<Status> bVar) throws IllegalStateException, RemoteException {
        m4984e(bVar);
        ((C1709iq) mo15820hw()).mo15702aH(str);
    }

    /* renamed from: a */
    public void mo15654a(String str, String str2, BaseImplementation.C0670b<Status> bVar) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() > 65536) {
            throw new IllegalArgumentException("Message exceeds maximum size");
        } else {
            C1706in.m5032aF(str);
            m4989gb();
            long incrementAndGet = this.f3775Ht.incrementAndGet();
            try {
                this.f3779Hx.put(Long.valueOf(incrementAndGet), bVar);
                ((C1709iq) mo15820hw()).mo15699a(str, str2, incrementAndGet);
            } catch (Throwable th) {
                this.f3779Hx.remove(Long.valueOf(incrementAndGet));
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo15655a(String str, boolean z, BaseImplementation.C0670b<Cast.ApplicationConnectionResult> bVar) throws IllegalStateException, RemoteException {
        m4980c(bVar);
        ((C1709iq) mo15820hw()).mo15707g(str, z);
    }

    /* renamed from: aE */
    public void mo15656aE(String str) throws IllegalArgumentException, RemoteException {
        Cast.MessageReceivedCallback remove;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.f3766Hk) {
            remove = this.f3766Hk.remove(str);
        }
        if (remove != null) {
            try {
                ((C1709iq) mo15820hw()).mo15704aJ(str);
            } catch (IllegalStateException e) {
                f3759Hh.mo15715a(e, "Error unregistering namespace (%s): %s", str, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public void mo15657b(String str, String str2, BaseImplementation.C0670b<Cast.ApplicationConnectionResult> bVar) throws IllegalStateException, RemoteException {
        m4980c(bVar);
        ((C1709iq) mo15820hw()).mo15709k(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* renamed from: d */
    public void mo15658d(BaseImplementation.C0670b<Status> bVar) throws IllegalStateException, RemoteException {
        m4984e(bVar);
        ((C1709iq) mo15820hw()).mo15708gl();
    }

    public void disconnect() {
        f3759Hh.mo15717b("disconnect(); ServiceListener=%s, isConnected=%b", this.f3768Hm, Boolean.valueOf(isConnected()));
        C1701c cVar = this.f3768Hm;
        this.f3768Hm = null;
        if (cVar == null || !cVar.mo15675gg()) {
            f3759Hh.mo15717b("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        m4988ga();
        try {
            if (isConnected() || isConnecting()) {
                ((C1709iq) mo15820hw()).disconnect();
            }
        } catch (RemoteException e) {
            f3759Hh.mo15715a(e, "Error while disconnecting the controller interface: %s", e.getMessage());
        } catch (Throwable th) {
            super.disconnect();
            throw th;
        }
        super.disconnect();
    }

    /* renamed from: fX */
    public Bundle mo11002fX() {
        if (this.f3778Hw == null) {
            return super.mo11002fX();
        }
        Bundle bundle = this.f3778Hw;
        this.f3778Hw = null;
        return bundle;
    }

    /* renamed from: fY */
    public void mo15659fY() throws IllegalStateException, RemoteException {
        ((C1709iq) mo15820hw()).mo15706fY();
    }

    /* renamed from: fZ */
    public double mo15660fZ() throws IllegalStateException {
        m4989gb();
        return this.f3761Gp;
    }

    public ApplicationMetadata getApplicationMetadata() throws IllegalStateException {
        m4989gb();
        return this.f3764Hi;
    }

    public String getApplicationStatus() throws IllegalStateException {
        m4989gb();
        return this.f3769Hn;
    }

    public boolean isMute() throws IllegalStateException {
        m4989gb();
        return this.f3762Gq;
    }
}
