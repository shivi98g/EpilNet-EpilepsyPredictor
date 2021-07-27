package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class GoogleCloudMessaging {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
    static GoogleCloudMessaging afo;
    private PendingIntent afp;
    final BlockingQueue<Intent> afq = new LinkedBlockingQueue();
    private Handler afr = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            GoogleCloudMessaging.this.afq.add((Intent) message.obj);
        }
    };
    private Messenger afs = new Messenger(this.afr);

    /* renamed from: lM */
    private Context f2172lM;

    /* renamed from: a */
    private void m3807a(String str, String str2, long j, int i, Bundle bundle) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        } else if (str == null) {
            throw new IllegalArgumentException("Missing 'to'");
        } else {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            intent.putExtras(bundle);
            mo14633j(intent);
            intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
            intent.putExtra("google.to", str);
            intent.putExtra("google.message_id", str2);
            intent.putExtra("google.ttl", Long.toString(j));
            intent.putExtra("google.delay", Integer.toString(i));
            this.f2172lM.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
        }
    }

    /* renamed from: e */
    private void m3808e(String... strArr) {
        String f = mo14631f(strArr);
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
        intent.putExtra("google.messenger", this.afs);
        mo14633j(intent);
        intent.putExtra("sender", f);
        this.f2172lM.startService(intent);
    }

    public static synchronized GoogleCloudMessaging getInstance(Context context) {
        GoogleCloudMessaging googleCloudMessaging;
        synchronized (GoogleCloudMessaging.class) {
            if (afo == null) {
                afo = new GoogleCloudMessaging();
                afo.f2172lM = context.getApplicationContext();
            }
            googleCloudMessaging = afo;
        }
        return googleCloudMessaging;
    }

    /* renamed from: mU */
    private void m3809mU() {
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE);
        this.afq.clear();
        intent.putExtra("google.messenger", this.afs);
        mo14633j(intent);
        this.f2172lM.startService(intent);
    }

    public void close() {
        mo14634mV();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo14631f(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(',');
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public String getMessageType(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra != null ? stringExtra : MESSAGE_TYPE_MESSAGE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized void mo14633j(Intent intent) {
        if (this.afp == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.afp = PendingIntent.getBroadcast(this.f2172lM, 0, intent2, 0);
        }
        intent.putExtra("app", this.afp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mV */
    public synchronized void mo14634mV() {
        if (this.afp != null) {
            this.afp.cancel();
            this.afp = null;
        }
    }

    public String register(String... strArr) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        }
        this.afq.clear();
        m3808e(strArr);
        try {
            Intent poll = this.afq.poll(5000, TimeUnit.MILLISECONDS);
            if (poll == null) {
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            }
            String stringExtra = poll.getStringExtra("registration_id");
            if (stringExtra != null) {
                return stringExtra;
            }
            poll.getStringExtra("error");
            String stringExtra2 = poll.getStringExtra("error");
            if (stringExtra2 != null) {
                throw new IOException(stringExtra2);
            }
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void send(String str, String str2, long j, Bundle bundle) throws IOException {
        m3807a(str, str2, j, -1, bundle);
    }

    public void send(String str, String str2, Bundle bundle) throws IOException {
        send(str, str2, -1, bundle);
    }

    public void unregister() throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(ERROR_MAIN_THREAD);
        }
        m3809mU();
        try {
            Intent poll = this.afq.poll(5000, TimeUnit.MILLISECONDS);
            if (poll == null) {
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            } else if (poll.getStringExtra("unregistered") == null) {
                String stringExtra = poll.getStringExtra("error");
                if (stringExtra != null) {
                    throw new IOException(stringExtra);
                }
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            }
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }
}
