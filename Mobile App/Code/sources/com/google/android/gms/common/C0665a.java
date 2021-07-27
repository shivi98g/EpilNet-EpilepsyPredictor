package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.common.a */
public class C0665a implements ServiceConnection {

    /* renamed from: Is */
    boolean f621Is = false;

    /* renamed from: It */
    private final BlockingQueue<IBinder> f622It = new LinkedBlockingQueue();

    /* renamed from: gs */
    public IBinder mo10900gs() throws InterruptedException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        } else if (this.f621Is) {
            throw new IllegalStateException();
        } else {
            this.f621Is = true;
            return this.f622It.take();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f622It.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
