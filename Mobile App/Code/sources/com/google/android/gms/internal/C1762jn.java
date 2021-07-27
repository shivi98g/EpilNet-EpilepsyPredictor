package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1750jl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.jn */
public final class C1762jn implements Handler.Callback {

    /* renamed from: Nd */
    private static final Object f3927Nd = new Object();

    /* renamed from: Ne */
    private static C1762jn f3928Ne;
    /* access modifiers changed from: private */

    /* renamed from: Nf */
    public final HashMap<String, C1763a> f3929Nf = new HashMap<>();
    private final Handler mHandler;
    /* access modifiers changed from: private */

    /* renamed from: mO */
    public final Context f3930mO;

    /* renamed from: com.google.android.gms.internal.jn$a */
    final class C1763a {

        /* renamed from: Ng */
        private final String f3931Ng;

        /* renamed from: Nh */
        private final C1764a f3932Nh = new C1764a();
        /* access modifiers changed from: private */

        /* renamed from: Ni */
        public final HashSet<C1750jl<?>.f> f3933Ni = new HashSet<>();

        /* renamed from: Nj */
        private boolean f3934Nj;
        /* access modifiers changed from: private */

        /* renamed from: Nk */
        public IBinder f3935Nk;
        /* access modifiers changed from: private */

        /* renamed from: Nl */
        public ComponentName f3936Nl;
        /* access modifiers changed from: private */
        public int mState = 2;

        /* renamed from: com.google.android.gms.internal.jn$a$a */
        public class C1764a implements ServiceConnection {
            public C1764a() {
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (C1762jn.this.f3929Nf) {
                    IBinder unused = C1763a.this.f3935Nk = iBinder;
                    ComponentName unused2 = C1763a.this.f3936Nl = componentName;
                    Iterator it = C1763a.this.f3933Ni.iterator();
                    while (it.hasNext()) {
                        ((C1750jl.C1756f) it.next()).onServiceConnected(componentName, iBinder);
                    }
                    int unused3 = C1763a.this.mState = 1;
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                synchronized (C1762jn.this.f3929Nf) {
                    IBinder unused = C1763a.this.f3935Nk = null;
                    ComponentName unused2 = C1763a.this.f3936Nl = componentName;
                    Iterator it = C1763a.this.f3933Ni.iterator();
                    while (it.hasNext()) {
                        ((C1750jl.C1756f) it.next()).onServiceDisconnected(componentName);
                    }
                    int unused3 = C1763a.this.mState = 2;
                }
            }
        }

        public C1763a(String str) {
            this.f3931Ng = str;
        }

        /* renamed from: a */
        public void mo15857a(C1750jl<?>.f fVar) {
            this.f3933Ni.add(fVar);
        }

        /* renamed from: b */
        public void mo15858b(C1750jl<?>.f fVar) {
            this.f3933Ni.remove(fVar);
        }

        /* renamed from: c */
        public boolean mo15859c(C1750jl<?>.f fVar) {
            return this.f3933Ni.contains(fVar);
        }

        public IBinder getBinder() {
            return this.f3935Nk;
        }

        public ComponentName getComponentName() {
            return this.f3936Nl;
        }

        public int getState() {
            return this.mState;
        }

        /* renamed from: hA */
        public void mo15863hA() {
            this.f3934Nj = C1762jn.this.f3930mO.bindService(new Intent(this.f3931Ng).setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE), this.f3932Nh, 129);
            if (this.f3934Nj) {
                this.mState = 3;
            } else {
                C1762jn.this.f3930mO.unbindService(this.f3932Nh);
            }
        }

        /* renamed from: hB */
        public void mo15864hB() {
            C1762jn.this.f3930mO.unbindService(this.f3932Nh);
            this.f3934Nj = false;
            this.mState = 2;
        }

        /* renamed from: hC */
        public String mo15865hC() {
            return this.f3931Ng;
        }

        /* renamed from: hD */
        public boolean mo15866hD() {
            return this.f3933Ni.isEmpty();
        }

        public boolean isBound() {
            return this.f3934Nj;
        }
    }

    private C1762jn(Context context) {
        this.mHandler = new Handler(context.getMainLooper(), this);
        this.f3930mO = context.getApplicationContext();
    }

    /* renamed from: J */
    public static C1762jn m5224J(Context context) {
        synchronized (f3927Nd) {
            if (f3928Ne == null) {
                f3928Ne = new C1762jn(context.getApplicationContext());
            }
        }
        return f3928Ne;
    }

    /* renamed from: a */
    public boolean mo15854a(String str, C1750jl<?>.f fVar) {
        boolean isBound;
        synchronized (this.f3929Nf) {
            C1763a aVar = this.f3929Nf.get(str);
            if (aVar != null) {
                this.mHandler.removeMessages(0, aVar);
                if (!aVar.mo15859c(fVar)) {
                    aVar.mo15857a(fVar);
                    switch (aVar.getState()) {
                        case 1:
                            fVar.onServiceConnected(aVar.getComponentName(), aVar.getBinder());
                            break;
                        case 2:
                            aVar.mo15863hA();
                            break;
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
                }
            } else {
                aVar = new C1763a(str);
                aVar.mo15857a(fVar);
                aVar.mo15863hA();
                this.f3929Nf.put(str, aVar);
            }
            isBound = aVar.isBound();
        }
        return isBound;
    }

    /* renamed from: b */
    public void mo15855b(String str, C1750jl<?>.f fVar) {
        synchronized (this.f3929Nf) {
            C1763a aVar = this.f3929Nf.get(str);
            if (aVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            } else if (!aVar.mo15859c(fVar)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            } else {
                aVar.mo15858b(fVar);
                if (aVar.mo15866hD()) {
                    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, aVar), 5000);
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C1763a aVar = (C1763a) message.obj;
        synchronized (this.f3929Nf) {
            if (aVar.mo15866hD()) {
                aVar.mo15864hB();
                this.f3929Nf.remove(aVar.mo15865hC());
            }
        }
        return true;
    }
}
