package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.C2047op;

/* renamed from: com.google.android.gms.internal.oo */
public class C2046oo implements C2047op.C2048a {
    private final C2047op amS;
    private boolean amT;

    public C2046oo(Context context, int i) {
        this(context, i, (String) null);
    }

    public C2046oo(Context context, int i, String str) {
        this(context, i, str, (String) null, true);
    }

    public C2046oo(Context context, int i, String str, String str2, boolean z) {
        this.amS = new C2047op(context, i, str, str2, this, z);
        this.amT = true;
    }

    /* renamed from: om */
    private void m6042om() {
        if (!this.amT) {
            throw new IllegalStateException("Cannot reuse one-time logger after sending.");
        }
    }

    /* renamed from: a */
    public void mo16494a(String str, byte[] bArr, String... strArr) {
        m6042om();
        this.amS.mo16500b(str, bArr, strArr);
    }

    /* renamed from: d */
    public void mo16495d(PendingIntent pendingIntent) {
        Log.w("OneTimePlayLogger", "logger connection failed: " + pendingIntent);
    }

    /* renamed from: on */
    public void mo16496on() {
        this.amS.stop();
    }

    /* renamed from: oo */
    public void mo16497oo() {
        Log.w("OneTimePlayLogger", "logger connection failed");
    }

    public void send() {
        m6042om();
        this.amS.start();
        this.amT = false;
    }
}
