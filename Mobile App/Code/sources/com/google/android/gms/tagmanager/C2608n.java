package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ContainerHolder;

/* renamed from: com.google.android.gms.tagmanager.n */
class C2608n implements ContainerHolder {

    /* renamed from: Eb */
    private Status f4467Eb;

    /* renamed from: JF */
    private final Looper f4468JF;

    /* renamed from: Pf */
    private boolean f4469Pf;
    private Container aqu;
    private Container aqv;
    private C2610b aqw;
    private C2609a aqx;
    private TagManager aqy;

    /* renamed from: com.google.android.gms.tagmanager.n$a */
    public interface C2609a {
        /* renamed from: ct */
        void mo18857ct(String str);

        /* renamed from: pl */
        String mo18858pl();

        /* renamed from: pn */
        void mo18859pn();
    }

    /* renamed from: com.google.android.gms.tagmanager.n$b */
    private class C2610b extends Handler {
        private final ContainerHolder.ContainerAvailableListener aqz;

        public C2610b(ContainerHolder.ContainerAvailableListener containerAvailableListener, Looper looper) {
            super(looper);
            this.aqz = containerAvailableListener;
        }

        /* renamed from: cu */
        public void mo18860cu(String str) {
            sendMessage(obtainMessage(1, str));
        }

        /* access modifiers changed from: protected */
        /* renamed from: cv */
        public void mo18861cv(String str) {
            this.aqz.onContainerAvailable(C2608n.this, str);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                C2504bh.m7243T("Don't know how to handle this message.");
            } else {
                mo18861cv((String) message.obj);
            }
        }
    }

    public C2608n(Status status) {
        this.f4467Eb = status;
        this.f4468JF = null;
    }

    public C2608n(TagManager tagManager, Looper looper, Container container, C2609a aVar) {
        this.aqy = tagManager;
        this.f4468JF = looper == null ? Looper.getMainLooper() : looper;
        this.aqu = container;
        this.aqx = aVar;
        this.f4467Eb = Status.f663Kw;
        tagManager.mo18613a(this);
    }

    /* renamed from: pm */
    private void m7606pm() {
        if (this.aqw != null) {
            this.aqw.mo18860cu(this.aqv.mo18578pj());
        }
    }

    /* renamed from: a */
    public synchronized void mo18852a(Container container) {
        if (!this.f4469Pf) {
            if (container == null) {
                C2504bh.m7243T("Unexpected null container.");
                return;
            }
            this.aqv = container;
            m7606pm();
        }
    }

    /* renamed from: cr */
    public synchronized void mo18853cr(String str) {
        if (!this.f4469Pf) {
            this.aqu.mo18569cr(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ct */
    public void mo18854ct(String str) {
        if (this.f4469Pf) {
            C2504bh.m7243T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.aqx.mo18857ct(str);
        }
    }

    public synchronized Container getContainer() {
        if (this.f4469Pf) {
            C2504bh.m7243T("ContainerHolder is released.");
            return null;
        }
        if (this.aqv != null) {
            this.aqu = this.aqv;
            this.aqv = null;
        }
        return this.aqu;
    }

    /* access modifiers changed from: package-private */
    public String getContainerId() {
        if (!this.f4469Pf) {
            return this.aqu.getContainerId();
        }
        C2504bh.m7243T("getContainerId called on a released ContainerHolder.");
        return "";
    }

    public Status getStatus() {
        return this.f4467Eb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pl */
    public String mo18856pl() {
        if (!this.f4469Pf) {
            return this.aqx.mo18858pl();
        }
        C2504bh.m7243T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        return "";
    }

    public synchronized void refresh() {
        if (this.f4469Pf) {
            C2504bh.m7243T("Refreshing a released ContainerHolder.");
        } else {
            this.aqx.mo18859pn();
        }
    }

    public synchronized void release() {
        if (this.f4469Pf) {
            C2504bh.m7243T("Releasing a released ContainerHolder.");
            return;
        }
        this.f4469Pf = true;
        this.aqy.mo18614b(this);
        this.aqu.release();
        this.aqu = null;
        this.aqv = null;
        this.aqx = null;
        this.aqw = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setContainerAvailableListener(com.google.android.gms.tagmanager.ContainerHolder.ContainerAvailableListener r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f4469Pf     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "ContainerHolder is released."
            com.google.android.gms.tagmanager.C2504bh.m7243T(r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x000c:
            if (r3 != 0) goto L_0x0012
            r0 = 0
            r2.aqw = r0     // Catch:{ all -> 0x0024 }
            goto L_0x0022
        L_0x0012:
            com.google.android.gms.tagmanager.n$b r0 = new com.google.android.gms.tagmanager.n$b     // Catch:{ all -> 0x0024 }
            android.os.Looper r1 = r2.f4468JF     // Catch:{ all -> 0x0024 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0024 }
            r2.aqw = r0     // Catch:{ all -> 0x0024 }
            com.google.android.gms.tagmanager.Container r0 = r2.aqv     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r2.m7606pm()     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2608n.setContainerAvailableListener(com.google.android.gms.tagmanager.ContainerHolder$ContainerAvailableListener):void");
    }
}
