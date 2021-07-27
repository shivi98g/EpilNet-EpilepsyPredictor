package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.C0675c;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.C1769jr;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class BaseImplementation {

    public static abstract class AbstractPendingResult<R extends Result> implements C0670b<R>, PendingResult<R> {

        /* renamed from: Jp */
        private final Object f626Jp = new Object();

        /* renamed from: Jq */
        private final ArrayList<PendingResult.C0672a> f627Jq = new ArrayList<>();

        /* renamed from: Jr */
        private ResultCallback<R> f628Jr;

        /* renamed from: Js */
        private volatile R f629Js;

        /* renamed from: Jt */
        private volatile boolean f630Jt;

        /* renamed from: Ju */
        private boolean f631Ju;

        /* renamed from: Jv */
        private boolean f632Jv;

        /* renamed from: Jw */
        private C1769jr f633Jw;
        protected final CallbackHandler<R> mHandler;

        /* renamed from: mr */
        private final CountDownLatch f634mr = new CountDownLatch(1);

        protected AbstractPendingResult(Looper looper) {
            this.mHandler = new CallbackHandler<>(looper);
        }

        protected AbstractPendingResult(CallbackHandler<R> callbackHandler) {
            this.mHandler = callbackHandler;
        }

        /* renamed from: c */
        private void m505c(R r) {
            this.f629Js = r;
            this.f633Jw = null;
            this.f634mr.countDown();
            Status status = this.f629Js.getStatus();
            if (this.f628Jr != null) {
                this.mHandler.removeTimeoutMessages();
                if (!this.f631Ju) {
                    this.mHandler.sendResultCallback(this.f628Jr, m506gA());
                }
            }
            Iterator<PendingResult.C0672a> it = this.f627Jq.iterator();
            while (it.hasNext()) {
                it.next().mo10933m(status);
            }
            this.f627Jq.clear();
        }

        /* renamed from: gA */
        private R m506gA() {
            R r;
            synchronized (this.f626Jp) {
                C1785jx.m5355a(!this.f630Jt, "Result has already been consumed.");
                C1785jx.m5355a(isReady(), "Result is not ready.");
                r = this.f629Js;
                mo10916gB();
            }
            return r;
        }

        /* renamed from: gC */
        private void m507gC() {
            synchronized (this.f626Jp) {
                if (!isReady()) {
                    mo10914b(mo10544c(Status.f664Kx));
                    this.f632Jv = true;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: gD */
        public void m508gD() {
            synchronized (this.f626Jp) {
                if (!isReady()) {
                    mo10914b(mo10544c(Status.f666Kz));
                    this.f632Jv = true;
                }
            }
        }

        /* renamed from: a */
        public final void mo10909a(PendingResult.C0672a aVar) {
            C1785jx.m5355a(!this.f630Jt, "Result has already been consumed.");
            synchronized (this.f626Jp) {
                if (isReady()) {
                    aVar.mo10933m(this.f629Js.getStatus());
                } else {
                    this.f627Jq.add(aVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo10910a(C1769jr jrVar) {
            synchronized (this.f626Jp) {
                this.f633Jw = jrVar;
            }
        }

        public final R await() {
            C1785jx.m5355a(Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread");
            C1785jx.m5355a(!this.f630Jt, "Result has already been consumed");
            try {
                this.f634mr.await();
            } catch (InterruptedException e) {
                m507gC();
            }
            C1785jx.m5355a(isReady(), "Result is not ready.");
            return m506gA();
        }

        public final R await(long j, TimeUnit timeUnit) {
            C1785jx.m5355a(j <= 0 || Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread when time is greater than zero.");
            C1785jx.m5355a(!this.f630Jt, "Result has already been consumed.");
            try {
                if (!this.f634mr.await(j, timeUnit)) {
                    m508gD();
                }
            } catch (InterruptedException e) {
                m507gC();
            }
            C1785jx.m5355a(isReady(), "Result is not ready.");
            return m506gA();
        }

        /* renamed from: b */
        public final void mo10914b(R r) {
            synchronized (this.f626Jp) {
                if (!this.f632Jv) {
                    if (!this.f631Ju) {
                        C1785jx.m5355a(!isReady(), "Results have already been set");
                        C1785jx.m5355a(!this.f630Jt, "Result has already been consumed");
                        m505c(r);
                        return;
                    }
                }
                BaseImplementation.m503a(r);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract R mo10544c(Status status);

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void cancel() {
            /*
                r2 = this;
                java.lang.Object r0 = r2.f626Jp
                monitor-enter(r0)
                boolean r1 = r2.f631Ju     // Catch:{ all -> 0x002f }
                if (r1 != 0) goto L_0x002d
                boolean r1 = r2.f630Jt     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x000c
                goto L_0x002d
            L_0x000c:
                com.google.android.gms.internal.jr r1 = r2.f633Jw     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x0017
                com.google.android.gms.internal.jr r1 = r2.f633Jw     // Catch:{ RemoteException -> 0x0016 }
                r1.cancel()     // Catch:{ RemoteException -> 0x0016 }
                goto L_0x0017
            L_0x0016:
                r1 = move-exception
            L_0x0017:
                R r1 = r2.f629Js     // Catch:{ all -> 0x002f }
                com.google.android.gms.common.api.BaseImplementation.m503a(r1)     // Catch:{ all -> 0x002f }
                r1 = 0
                r2.f628Jr = r1     // Catch:{ all -> 0x002f }
                r1 = 1
                r2.f631Ju = r1     // Catch:{ all -> 0x002f }
                com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f662KA     // Catch:{ all -> 0x002f }
                com.google.android.gms.common.api.Result r1 = r2.mo10544c((com.google.android.gms.common.api.Status) r1)     // Catch:{ all -> 0x002f }
                r2.m505c(r1)     // Catch:{ all -> 0x002f }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return
            L_0x002d:
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return
            L_0x002f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult.cancel():void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: gB */
        public void mo10916gB() {
            this.f630Jt = true;
            this.f629Js = null;
            this.f628Jr = null;
        }

        public boolean isCanceled() {
            boolean z;
            synchronized (this.f626Jp) {
                z = this.f631Ju;
            }
            return z;
        }

        public final boolean isReady() {
            return this.f634mr.getCount() == 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<R> r4) {
            /*
                r3 = this;
                boolean r0 = r3.f630Jt
                r0 = r0 ^ 1
                java.lang.String r1 = "Result has already been consumed."
                com.google.android.gms.internal.C1785jx.m5355a(r0, r1)
                java.lang.Object r0 = r3.f626Jp
                monitor-enter(r0)
                boolean r1 = r3.isCanceled()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0014
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return
            L_0x0014:
                boolean r1 = r3.isReady()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0024
                com.google.android.gms.common.api.BaseImplementation$CallbackHandler<R> r1 = r3.mHandler     // Catch:{ all -> 0x0028 }
                com.google.android.gms.common.api.Result r2 = r3.m506gA()     // Catch:{ all -> 0x0028 }
                r1.sendResultCallback(r4, r2)     // Catch:{ all -> 0x0028 }
                goto L_0x0026
            L_0x0024:
                r3.f628Jr = r4     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<R> r5, long r6, java.util.concurrent.TimeUnit r8) {
            /*
                r4 = this;
                boolean r0 = r4.f630Jt
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Result has already been consumed."
                com.google.android.gms.internal.C1785jx.m5355a(r0, r2)
                com.google.android.gms.common.api.BaseImplementation$CallbackHandler<R> r0 = r4.mHandler
                if (r0 == 0) goto L_0x000e
                goto L_0x000f
            L_0x000e:
                r1 = 0
            L_0x000f:
                java.lang.String r0 = "CallbackHandler has not been set before calling setResultCallback."
                com.google.android.gms.internal.C1785jx.m5355a(r1, r0)
                java.lang.Object r0 = r4.f626Jp
                monitor-enter(r0)
                boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x003c }
                if (r1 == 0) goto L_0x001f
                monitor-exit(r0)     // Catch:{ all -> 0x003c }
                return
            L_0x001f:
                boolean r1 = r4.isReady()     // Catch:{ all -> 0x003c }
                if (r1 == 0) goto L_0x002f
                com.google.android.gms.common.api.BaseImplementation$CallbackHandler<R> r1 = r4.mHandler     // Catch:{ all -> 0x003c }
                com.google.android.gms.common.api.Result r2 = r4.m506gA()     // Catch:{ all -> 0x003c }
                r1.sendResultCallback(r5, r2)     // Catch:{ all -> 0x003c }
                goto L_0x003a
            L_0x002f:
                r4.f628Jr = r5     // Catch:{ all -> 0x003c }
                com.google.android.gms.common.api.BaseImplementation$CallbackHandler<R> r1 = r4.mHandler     // Catch:{ all -> 0x003c }
                long r2 = r8.toMillis(r6)     // Catch:{ all -> 0x003c }
                r1.sendTimeoutResultCallback(r4, r2)     // Catch:{ all -> 0x003c }
            L_0x003a:
                monitor-exit(r0)     // Catch:{ all -> 0x003c }
                return
            L_0x003c:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003c }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback, long, java.util.concurrent.TimeUnit):void");
        }
    }

    public static class CallbackHandler<R extends Result> extends Handler {
        public static final int CALLBACK_ON_COMPLETE = 1;
        public static final int CALLBACK_ON_TIMEOUT = 2;

        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        /* access modifiers changed from: protected */
        public void deliverResultCallback(ResultCallback<R> resultCallback, R r) {
            try {
                resultCallback.onResult(r);
            } catch (RuntimeException e) {
                BaseImplementation.m503a(r);
                throw e;
            }
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    deliverResultCallback((ResultCallback) pair.first, (Result) pair.second);
                    return;
                case 2:
                    ((AbstractPendingResult) message.obj).m508gD();
                    return;
                default:
                    Log.wtf("GoogleApi", "Don't know how to handle this message.");
                    return;
            }
        }

        public void removeTimeoutMessages() {
            removeMessages(2);
        }

        public void sendResultCallback(ResultCallback<R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void sendTimeoutResultCallback(AbstractPendingResult<R> abstractPendingResult, long j) {
            sendMessageDelayed(obtainMessage(2, abstractPendingResult), j);
        }
    }

    /* renamed from: com.google.android.gms.common.api.BaseImplementation$a */
    public static abstract class C0669a<R extends Result, A extends Api.C0666a> extends AbstractPendingResult<R> implements C0675c.C0686d<A> {

        /* renamed from: Jn */
        private final Api.C0668c<A> f635Jn;

        /* renamed from: Jx */
        private final GoogleApiClient f636Jx;

        /* renamed from: Jy */
        private C0675c.C0684b f637Jy;

        protected C0669a(Api.C0668c<A> cVar, GoogleApiClient googleApiClient) {
            super(googleApiClient.getLooper());
            this.f635Jn = (Api.C0668c) C1785jx.m5364i(cVar);
            this.f636Jx = googleApiClient;
        }

        /* renamed from: a */
        private void m515a(RemoteException remoteException) {
            mo10931l(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo10540a(A a) throws RemoteException;

        /* renamed from: a */
        public void mo10926a(C0675c.C0684b bVar) {
            this.f637Jy = bVar;
        }

        /* renamed from: b */
        public final void mo10927b(A a) throws DeadObjectException {
            try {
                mo10540a(a);
            } catch (DeadObjectException e) {
                m515a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m515a(e2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: gB */
        public void mo10916gB() {
            super.mo10916gB();
            if (this.f637Jy != null) {
                this.f637Jy.mo11001b(this);
                this.f637Jy = null;
            }
        }

        /* renamed from: gE */
        public final C0669a mo10928gE() {
            C1785jx.m5359b(this.f636Jx, (Object) "GoogleApiClient was not set.");
            this.f636Jx.mo10940b(this);
            return this;
        }

        /* renamed from: gF */
        public int mo10929gF() {
            return 0;
        }

        /* renamed from: gz */
        public final Api.C0668c<A> mo10930gz() {
            return this.f635Jn;
        }

        /* renamed from: l */
        public final void mo10931l(Status status) {
            C1785jx.m5361b(!status.isSuccess(), (Object) "Failed result must not be success");
            mo10914b(mo10544c(status));
        }
    }

    /* renamed from: com.google.android.gms.common.api.BaseImplementation$b */
    public interface C0670b<R> {
        /* renamed from: b */
        void mo10914b(R r);
    }

    /* renamed from: a */
    static void m503a(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                Log.w("GoogleApi", "Unable to release " + result, e);
            }
        }
    }
}
