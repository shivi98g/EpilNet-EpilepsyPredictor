package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.C1785jx;

/* renamed from: com.google.android.gms.common.api.d */
public final class C0687d<L> {

    /* renamed from: Kt */
    private final C0687d<L>.a f714Kt;
    private volatile L mListener;

    /* renamed from: com.google.android.gms.common.api.d$a */
    private final class C0688a extends Handler {
        public C0688a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C1785jx.m5354L(z);
            C0687d.this.mo11010b((C0689b) message.obj);
        }
    }

    /* renamed from: com.google.android.gms.common.api.d$b */
    public interface C0689b<L> {
        /* renamed from: c */
        void mo10998c(L l);

        /* renamed from: gG */
        void mo10999gG();
    }

    C0687d(Looper looper, L l) {
        this.f714Kt = new C0688a(looper);
        this.mListener = C1785jx.m5359b(l, (Object) "Listener must not be null");
    }

    /* renamed from: a */
    public void mo11009a(C0689b<? super L> bVar) {
        C1785jx.m5359b(bVar, (Object) "Notifier must not be null");
        this.f714Kt.sendMessage(this.f714Kt.obtainMessage(1, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11010b(C0689b<? super L> bVar) {
        L l = this.mListener;
        if (l != null) {
            try {
                bVar.mo10998c(l);
                return;
            } catch (Exception e) {
                Log.w("ListenerHolder", "Notifying listener failed", e);
            }
        }
        bVar.mo10999gG();
    }

    public void clear() {
        this.mListener = null;
    }
}
