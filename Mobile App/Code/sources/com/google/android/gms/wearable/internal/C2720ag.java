package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.internal.C2717af;
import com.google.android.gms.wearable.internal.C2754az;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.ag */
abstract class C2720ag<T> {
    private final HashMap<T, C2768bb> agU = new HashMap<>();

    /* renamed from: com.google.android.gms.wearable.internal.ag$a */
    private static class C2721a<T> extends C2754az.C2755a<Status> {
        private WeakReference<Map<T, C2768bb>> axP;
        private WeakReference<T> axQ;

        C2721a(Map<T, C2768bb> map, T t, BaseImplementation.C0670b<Status> bVar) {
            super(bVar);
            this.axP = new WeakReference<>(map);
            this.axQ = new WeakReference<>(t);
        }

        /* renamed from: a */
        public void mo19424a(Status status) {
            Map map = (Map) this.axP.get();
            Object obj = this.axQ.get();
            if (!(status.getStatus().isSuccess() || map == null || obj == null)) {
                synchronized (map) {
                    C2768bb bbVar = (C2768bb) map.remove(obj);
                    if (bbVar != null) {
                        bbVar.clear();
                    }
                }
            }
            mo19547A(status);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.ag$b */
    static final class C2722b extends C2720ag<DataApi.DataListener> {
        C2722b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2768bb mo19478a(DataApi.DataListener dataListener, IntentFilter[] intentFilterArr) {
            return C2768bb.m8120b(dataListener, intentFilterArr);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.ag$c */
    static final class C2723c extends C2720ag<MessageApi.MessageListener> {
        C2723c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2768bb mo19478a(MessageApi.MessageListener messageListener, IntentFilter[] intentFilterArr) {
            return C2768bb.m8121b(messageListener, intentFilterArr);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.ag$d */
    static final class C2724d extends C2720ag<NodeApi.NodeListener> {
        C2724d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2768bb mo19478a(NodeApi.NodeListener nodeListener, IntentFilter[] intentFilterArr) {
            return C2768bb.m8119a(nodeListener);
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.ag$e */
    private static class C2725e<T> extends C2754az.C2755a<Status> {
        private WeakReference<Map<T, C2768bb>> axP;
        private WeakReference<T> axQ;

        C2725e(Map<T, C2768bb> map, T t, BaseImplementation.C0670b<Status> bVar) {
            super(bVar);
            this.axP = new WeakReference<>(map);
            this.axQ = new WeakReference<>(t);
        }

        /* renamed from: a */
        public void mo19424a(Status status) {
            Map map = (Map) this.axP.get();
            Object obj = this.axQ.get();
            if (!(status.getStatus().getStatusCode() != 4002 || map == null || obj == null)) {
                synchronized (map) {
                    C2768bb bbVar = (C2768bb) map.remove(obj);
                    if (bbVar != null) {
                        bbVar.clear();
                    }
                }
            }
            mo19547A(status);
        }
    }

    C2720ag() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C2768bb mo19478a(T t, IntentFilter[] intentFilterArr);

    /* renamed from: a */
    public void mo19479a(C2766ba baVar, BaseImplementation.C0670b<Status> bVar, T t) throws RemoteException {
        synchronized (this.agU) {
            C2768bb remove = this.agU.remove(t);
            if (remove == null) {
                bVar.mo10914b(new Status(4002));
                return;
            }
            remove.clear();
            ((C2717af) baVar.mo15820hw()).mo19457a((C2711ad) new C2725e(this.agU, t, bVar), new C2746ar(remove));
        }
    }

    /* renamed from: a */
    public void mo19480a(C2766ba baVar, BaseImplementation.C0670b<Status> bVar, T t, IntentFilter[] intentFilterArr) throws RemoteException {
        C2768bb a = mo19478a(t, intentFilterArr);
        synchronized (this.agU) {
            if (this.agU.get(t) != null) {
                bVar.mo10914b(new Status(4001));
                return;
            }
            this.agU.put(t, a);
            try {
                ((C2717af) baVar.mo15820hw()).mo19458a((C2711ad) new C2721a(this.agU, t, bVar), new C2765b(a));
            } catch (RemoteException e) {
                this.agU.remove(t);
                throw e;
            }
        }
    }

    /* renamed from: b */
    public void mo19481b(C2766ba baVar) {
        synchronized (this.agU) {
            C2754az.C2762h hVar = new C2754az.C2762h();
            for (Map.Entry next : this.agU.entrySet()) {
                C2768bb bbVar = (C2768bb) next.getValue();
                if (bbVar != null) {
                    bbVar.clear();
                    if (baVar.isConnected()) {
                        try {
                            ((C2717af) baVar.mo15820hw()).mo19457a((C2711ad) hVar, new C2746ar(bbVar));
                            if (Log.isLoggable("WearableClient", 2)) {
                                Log.d("WearableClient", "disconnect: removed: " + next.getKey() + "/" + bbVar);
                            }
                        } catch (RemoteException e) {
                            Log.w("WearableClient", "disconnect: Didn't remove: " + next.getKey() + "/" + bbVar);
                        }
                    } else {
                        continue;
                    }
                }
            }
            this.agU.clear();
        }
    }

    /* renamed from: ca */
    public void mo19482ca(IBinder iBinder) {
        synchronized (this.agU) {
            C2717af bZ = C2717af.C2718a.m7994bZ(iBinder);
            C2754az.C2762h hVar = new C2754az.C2762h();
            for (Map.Entry next : this.agU.entrySet()) {
                C2768bb bbVar = (C2768bb) next.getValue();
                try {
                    bZ.mo19458a((C2711ad) hVar, new C2765b(bbVar));
                    if (Log.isLoggable("WearableClient", 2)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + next.getKey() + "/" + bbVar);
                    }
                } catch (RemoteException e) {
                    Log.d("WearableClient", "onPostInitHandler: Didn't add: " + next.getKey() + "/" + bbVar);
                }
            }
        }
    }
}
