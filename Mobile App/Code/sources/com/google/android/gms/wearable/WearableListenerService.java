package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.internal.C2714ae;
import com.google.android.gms.wearable.internal.C2731ai;
import com.google.android.gms.wearable.internal.C2740al;

public abstract class WearableListenerService extends Service implements DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    /* access modifiers changed from: private */

    /* renamed from: CS */
    public String f4528CS;

    /* renamed from: Nk */
    private IBinder f4529Nk;

    /* renamed from: Pj */
    private volatile int f4530Pj = -1;
    /* access modifiers changed from: private */
    public Handler axn;
    /* access modifiers changed from: private */
    public Object axo = new Object();
    /* access modifiers changed from: private */
    public boolean axp;

    /* renamed from: com.google.android.gms.wearable.WearableListenerService$a */
    private class C2696a extends C2714ae.C2715a {
        private C2696a() {
        }

        /* renamed from: a */
        public void mo19388a(final C2731ai aiVar) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onMessageReceived: " + aiVar);
            }
            WearableListenerService.this.m7902rl();
            synchronized (WearableListenerService.this.axo) {
                if (!WearableListenerService.this.axp) {
                    WearableListenerService.this.axn.post(new Runnable() {
                        public void run() {
                            WearableListenerService.this.onMessageReceived(aiVar);
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void mo19389a(final C2740al alVar) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onPeerConnected: " + WearableListenerService.this.f4528CS + ": " + alVar);
            }
            WearableListenerService.this.m7902rl();
            synchronized (WearableListenerService.this.axo) {
                if (!WearableListenerService.this.axp) {
                    WearableListenerService.this.axn.post(new Runnable() {
                        public void run() {
                            WearableListenerService.this.onPeerConnected(alVar);
                        }
                    });
                }
            }
        }

        /* renamed from: aa */
        public void mo19390aa(final DataHolder dataHolder) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onDataItemChanged: " + WearableListenerService.this.f4528CS + ": " + dataHolder);
            }
            WearableListenerService.this.m7902rl();
            synchronized (WearableListenerService.this.axo) {
                if (WearableListenerService.this.axp) {
                    dataHolder.close();
                } else {
                    WearableListenerService.this.axn.post(new Runnable() {
                        public void run() {
                            DataEventBuffer dataEventBuffer = new DataEventBuffer(dataHolder);
                            try {
                                WearableListenerService.this.onDataChanged(dataEventBuffer);
                            } finally {
                                dataEventBuffer.release();
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: b */
        public void mo19391b(final C2740al alVar) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onPeerDisconnected: " + WearableListenerService.this.f4528CS + ": " + alVar);
            }
            WearableListenerService.this.m7902rl();
            synchronized (WearableListenerService.this.axo) {
                if (!WearableListenerService.this.axp) {
                    WearableListenerService.this.axn.post(new Runnable() {
                        public void run() {
                            WearableListenerService.this.onPeerDisconnected(alVar);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: bh */
    private boolean m7898bh(int i) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null) {
            for (String equals : packagesForUid) {
                if (GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: rl */
    public void m7902rl() throws SecurityException {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f4530Pj) {
            if (!GooglePlayServicesUtil.m489b(getPackageManager(), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE) || !m7898bh(callingUid)) {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
            this.f4530Pj = callingUid;
        }
    }

    public final IBinder onBind(Intent intent) {
        if (BIND_LISTENER_INTENT_ACTION.equals(intent.getAction())) {
            return this.f4529Nk;
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: " + getPackageName());
        }
        this.f4528CS = getPackageName();
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.axn = new Handler(handlerThread.getLooper());
        this.f4529Nk = new C2696a();
    }

    public void onDataChanged(DataEventBuffer dataEventBuffer) {
    }

    public void onDestroy() {
        synchronized (this.axo) {
            this.axp = true;
            this.axn.getLooper().quit();
        }
        super.onDestroy();
    }

    public void onMessageReceived(MessageEvent messageEvent) {
    }

    public void onPeerConnected(Node node) {
    }

    public void onPeerDisconnected(Node node) {
    }
}
