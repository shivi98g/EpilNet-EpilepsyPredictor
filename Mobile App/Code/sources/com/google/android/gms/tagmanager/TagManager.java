package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.tagmanager.DataLayer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager {
    private static TagManager atW;
    private final DataLayer aqn;
    private final C2622r asD;
    private final C2460a atT;
    private final C2572cx atU;
    private final ConcurrentMap<C2608n, Boolean> atV;
    private final Context mContext;

    /* renamed from: com.google.android.gms.tagmanager.TagManager$a */
    interface C2460a {
        /* renamed from: a */
        C2611o mo18625a(Context context, TagManager tagManager, Looper looper, String str, int i, C2622r rVar);
    }

    TagManager(Context context, C2460a aVar, DataLayer dataLayer, C2572cx cxVar) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.mContext = context.getApplicationContext();
        this.atU = cxVar;
        this.atT = aVar;
        this.atV = new ConcurrentHashMap();
        this.aqn = dataLayer;
        this.aqn.mo18591a((DataLayer.C2452b) new DataLayer.C2452b() {
            /* renamed from: C */
            public void mo18608C(Map<String, Object> map) {
                Object obj = map.get("event");
                if (obj != null) {
                    TagManager.this.m7140cV(obj.toString());
                }
            }
        });
        this.aqn.mo18591a((DataLayer.C2452b) new C2579d(this.mContext));
        this.asD = new C2622r();
        m7141qP();
    }

    /* access modifiers changed from: private */
    /* renamed from: cV */
    public void m7140cV(String str) {
        for (C2608n cr : this.atV.keySet()) {
            cr.mo18853cr(str);
        }
    }

    public static TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            if (atW == null) {
                if (context == null) {
                    C2504bh.m7243T("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                atW = new TagManager(context, new C2460a() {
                    /* renamed from: a */
                    public C2611o mo18625a(Context context, TagManager tagManager, Looper looper, String str, int i, C2622r rVar) {
                        return new C2611o(context, tagManager, looper, str, i, rVar);
                    }
                }, new DataLayer(new C2627v(context)), C2573cy.m7487qN());
            }
            tagManager = atW;
        }
        return tagManager;
    }

    /* renamed from: qP */
    private void m7141qP() {
        if (Build.VERSION.SDK_INT >= 14) {
            this.mContext.registerComponentCallbacks(new ComponentCallbacks2() {
                public void onConfigurationChanged(Configuration configuration) {
                }

                public void onLowMemory() {
                }

                public void onTrimMemory(int i) {
                    if (i == 20) {
                        TagManager.this.dispatch();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18613a(C2608n nVar) {
        this.atV.put(nVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo18614b(C2608n nVar) {
        return this.atV.remove(nVar) != null;
    }

    public void dispatch() {
        this.atU.dispatch();
    }

    public DataLayer getDataLayer() {
        return this.aqn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean mo18617i(Uri uri) {
        boolean z;
        C2531ce qa = C2531ce.m7333qa();
        if (qa.mo18727i(uri)) {
            String containerId = qa.getContainerId();
            switch (qa.mo18728qb()) {
                case NONE:
                    for (C2608n nVar : this.atV.keySet()) {
                        if (nVar.getContainerId().equals(containerId)) {
                            nVar.mo18854ct((String) null);
                            nVar.refresh();
                        }
                    }
                    break;
                case CONTAINER:
                case CONTAINER_DEBUG:
                    for (C2608n nVar2 : this.atV.keySet()) {
                        if (nVar2.getContainerId().equals(containerId)) {
                            nVar2.mo18854ct(qa.mo18729qc());
                        } else if (nVar2.mo18856pl() != null) {
                            nVar2.mo18854ct((String) null);
                        }
                        nVar2.refresh();
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, int i) {
        C2611o a = this.atT.mo18625a(this.mContext, this, (Looper) null, str, i, this.asD);
        a.mo18866po();
        return a;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, int i, Handler handler) {
        C2611o a = this.atT.mo18625a(this.mContext, this, handler.getLooper(), str, i, this.asD);
        a.mo18866po();
        return a;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, int i) {
        C2611o a = this.atT.mo18625a(this.mContext, this, (Looper) null, str, i, this.asD);
        a.mo18868pq();
        return a;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, int i, Handler handler) {
        C2611o a = this.atT.mo18625a(this.mContext, this, handler.getLooper(), str, i, this.asD);
        a.mo18868pq();
        return a;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, int i) {
        C2611o a = this.atT.mo18625a(this.mContext, this, (Looper) null, str, i, this.asD);
        a.mo18867pp();
        return a;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, int i, Handler handler) {
        C2611o a = this.atT.mo18625a(this.mContext, this, handler.getLooper(), str, i, this.asD);
        a.mo18867pp();
        return a;
    }

    public void setVerboseLoggingEnabled(boolean z) {
        C2504bh.setLogLevel(z ? 2 : 5);
    }
}
