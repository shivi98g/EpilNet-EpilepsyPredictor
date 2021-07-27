package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.drive.internal.C0760ag;
import com.google.android.gms.drive.internal.C0849w;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class DriveEventService extends Service implements ChangeListener, CompletionListener {
    public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    /* access modifiers changed from: private */

    /* renamed from: Pg */
    public CountDownLatch f904Pg;

    /* renamed from: Ph */
    C0737a f905Ph;

    /* renamed from: Pi */
    boolean f906Pi;

    /* renamed from: Pj */
    int f907Pj;
    private final String mName;

    /* renamed from: com.google.android.gms.drive.events.DriveEventService$a */
    final class C0737a extends Handler {
        C0737a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Message m832b(OnEventResponse onEventResponse) {
            return obtainMessage(1, onEventResponse);
        }

        /* access modifiers changed from: private */
        /* renamed from: iE */
        public Message m833iE() {
            return obtainMessage(2);
        }

        public void handleMessage(Message message) {
            C0849w.m1207m("DriveEventService", "handleMessage message type:" + message.what);
            switch (message.what) {
                case 1:
                    DriveEventService.this.m826a((OnEventResponse) message.obj);
                    return;
                case 2:
                    getLooper().quit();
                    return;
                default:
                    C0849w.m1208o("DriveEventService", "Unexpected message type:" + message.what);
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.drive.events.DriveEventService$b */
    final class C0738b extends C0760ag.C0761a {
        C0738b() {
        }

        /* renamed from: c */
        public void mo11348c(OnEventResponse onEventResponse) throws RemoteException {
            synchronized (DriveEventService.this) {
                C0849w.m1207m("DriveEventService", "onEvent: " + onEventResponse);
                DriveEventService.this.m829iD();
                if (DriveEventService.this.f905Ph != null) {
                    DriveEventService.this.f905Ph.sendMessage(DriveEventService.this.f905Ph.m832b(onEventResponse));
                } else {
                    C0849w.m1209p("DriveEventService", "Receiving event before initialize is completed.");
                }
            }
        }
    }

    protected DriveEventService() {
        this("DriveEventService");
    }

    protected DriveEventService(String str) {
        this.f906Pi = false;
        this.f907Pj = -1;
        this.mName = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m826a(OnEventResponse onEventResponse) {
        DriveEvent iQ = onEventResponse.mo11425iQ();
        C0849w.m1207m("DriveEventService", "handleEventMessage: " + iQ);
        try {
            switch (iQ.getType()) {
                case 1:
                    onChange((ChangeEvent) iQ);
                    return;
                case 2:
                    onCompletion((CompletionEvent) iQ);
                    return;
                default:
                    String str = this.mName;
                    C0849w.m1208o(str, "Unhandled event: " + iQ);
                    return;
            }
        } catch (Exception e) {
            String str2 = this.mName;
            C0849w.m1205a(str2, e, "Error handling event: " + iQ);
        }
    }

    /* renamed from: bh */
    private boolean m828bh(int i) {
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
    /* renamed from: iD */
    public void m829iD() throws SecurityException {
        int callingUid = getCallingUid();
        if (callingUid != this.f907Pj) {
            if (!GooglePlayServicesUtil.m489b(getPackageManager(), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE) || !m828bh(callingUid)) {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
            this.f907Pj = callingUid;
        }
    }

    /* access modifiers changed from: protected */
    public int getCallingUid() {
        return Binder.getCallingUid();
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (!ACTION_HANDLE_EVENT.equals(intent.getAction())) {
            return null;
        }
        if (this.f905Ph == null && !this.f906Pi) {
            this.f906Pi = true;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f904Pg = new CountDownLatch(1);
            new Thread() {
                public void run() {
                    try {
                        Looper.prepare();
                        DriveEventService.this.f905Ph = new C0737a();
                        DriveEventService.this.f906Pi = false;
                        countDownLatch.countDown();
                        C0849w.m1207m("DriveEventService", "Bound and starting loop");
                        Looper.loop();
                        C0849w.m1207m("DriveEventService", "Finished loop");
                    } finally {
                        if (DriveEventService.this.f904Pg != null) {
                            DriveEventService.this.f904Pg.countDown();
                        }
                    }
                }
            }.start();
            try {
                if (!countDownLatch.await(5000, TimeUnit.MILLISECONDS)) {
                    C0849w.m1209p("DriveEventService", "Failed to synchronously initialize event handler.");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Unable to start event handler", e);
            }
        }
        return new C0738b().asBinder();
    }

    public void onChange(ChangeEvent changeEvent) {
        String str = this.mName;
        C0849w.m1208o(str, "Unhandled change event: " + changeEvent);
    }

    public void onCompletion(CompletionEvent completionEvent) {
        String str = this.mName;
        C0849w.m1208o(str, "Unhandled completion event: " + completionEvent);
    }

    public synchronized void onDestroy() {
        C0849w.m1207m("DriveEventService", "onDestroy");
        if (this.f905Ph != null) {
            this.f905Ph.sendMessage(this.f905Ph.m833iE());
            this.f905Ph = null;
            try {
                if (!this.f904Pg.await(5000, TimeUnit.MILLISECONDS)) {
                    C0849w.m1208o("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
                }
            } catch (InterruptedException e) {
            }
            this.f904Pg = null;
        }
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        return true;
    }
}
