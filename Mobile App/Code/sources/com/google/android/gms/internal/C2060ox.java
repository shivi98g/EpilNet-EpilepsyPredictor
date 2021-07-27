package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C2049oq;
import com.google.android.gms.internal.C2053os;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ox */
public class C2060ox extends C1750jl<C2049oq> {

    /* renamed from: CS */
    private final String f4169CS;
    private final C2057ou anm;
    private final C2053os ann = new C2053os();
    private boolean ano = true;

    /* renamed from: mH */
    private final Object f4170mH = new Object();

    public C2060ox(Context context, C2057ou ouVar) {
        super(context, ouVar, ouVar, new String[0]);
        this.f4169CS = context.getPackageName();
        this.anm = (C2057ou) C1785jx.m5364i(ouVar);
        this.anm.mo16522a(this);
    }

    /* renamed from: c */
    private void m6071c(C2058ov ovVar, C2052or orVar) {
        this.ann.mo16511a(ovVar, orVar);
    }

    /* renamed from: d */
    private void m6072d(C2058ov ovVar, C2052or orVar) {
        String str;
        String str2;
        try {
            m6073or();
            ((C2049oq) mo15820hw()).mo16503a(this.f4169CS, ovVar, orVar);
        } catch (RemoteException e) {
            str2 = "PlayLoggerImpl";
            str = "Couldn't send log event.  Will try caching.";
            Log.e(str2, str);
            m6071c(ovVar, orVar);
        } catch (IllegalStateException e2) {
            str2 = "PlayLoggerImpl";
            str = "Service was disconnected.  Will try caching.";
            Log.e(str2, str);
            m6071c(ovVar, orVar);
        }
    }

    /* renamed from: or */
    private void m6073or() {
        C2052or orVar;
        C1742je.m5152K(!this.ano);
        if (!this.ann.isEmpty()) {
            C2058ov ovVar = null;
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<C2053os.C2055a> it = this.ann.mo16516op().iterator();
                while (it.hasNext()) {
                    C2053os.C2055a next = it.next();
                    if (next.and != null) {
                        ((C2049oq) mo15820hw()).mo16505a(this.f4169CS, next.anb, C2166qw.m6480f(next.and));
                    } else {
                        if (next.anb.equals(ovVar)) {
                            orVar = next.anc;
                        } else {
                            if (!arrayList.isEmpty()) {
                                ((C2049oq) mo15820hw()).mo16504a(this.f4169CS, ovVar, (List<C2052or>) arrayList);
                                arrayList.clear();
                            }
                            ovVar = next.anb;
                            orVar = next.anc;
                        }
                        arrayList.add(orVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((C2049oq) mo15820hw()).mo16504a(this.f4169CS, ovVar, (List<C2052or>) arrayList);
                }
                this.ann.clear();
            } catch (RemoteException e) {
                Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo16532U(boolean z) {
        synchronized (this.f4170mH) {
            boolean z2 = this.ano;
            this.ano = z;
            if (z2 && !this.ano) {
                m6073or();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15909f(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), new Bundle());
    }

    /* renamed from: b */
    public void mo16533b(C2058ov ovVar, C2052or orVar) {
        synchronized (this.f4170mH) {
            if (this.ano) {
                m6071c(ovVar, orVar);
            } else {
                m6072d(ovVar, orVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bJ */
    public C2049oq mo11721l(IBinder iBinder) {
        return C2049oq.C2050a.m6055bI(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.playlog.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4170mH
            monitor-enter(r0)
            boolean r1 = r3.isConnecting()     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x001b
            boolean r1 = r3.isConnected()     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0010
            goto L_0x001b
        L_0x0010:
            com.google.android.gms.internal.ou r1 = r3.anm     // Catch:{ all -> 0x001d }
            r2 = 1
            r1.mo16521T(r2)     // Catch:{ all -> 0x001d }
            r3.connect()     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C2060ox.start():void");
    }

    public void stop() {
        synchronized (this.f4170mH) {
            this.anm.mo16521T(false);
            disconnect();
        }
    }
}
