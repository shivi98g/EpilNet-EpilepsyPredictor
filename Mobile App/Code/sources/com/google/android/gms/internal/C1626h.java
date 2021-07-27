package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.h */
public abstract class C1626h implements C1578g {

    /* renamed from: kw */
    protected MotionEvent f3601kw;

    /* renamed from: kx */
    protected DisplayMetrics f3602kx;

    /* renamed from: ky */
    protected C1880m f3603ky;

    /* renamed from: kz */
    private C1963n f3604kz;

    protected C1626h(Context context, C1880m mVar, C1963n nVar) {
        this.f3603ky = mVar;
        this.f3604kz = nVar;
        try {
            this.f3602kx = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f3602kx = new DisplayMetrics();
            this.f3602kx.density = 1.0f;
        }
    }

    /* renamed from: a */
    private String m4768a(Context context, String str, boolean z) {
        byte[] u;
        try {
            synchronized (this) {
                m4769t();
                if (z) {
                    mo15494c(context);
                } else {
                    mo15493b(context);
                }
                u = m4770u();
            }
            return u.length == 0 ? Integer.toString(5) : mo15489a(u, str);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            return Integer.toString(7);
        } catch (IOException e2) {
            return Integer.toString(3);
        }
    }

    /* renamed from: t */
    private void m4769t() {
        this.f3604kz.reset();
    }

    /* renamed from: u */
    private byte[] m4770u() throws IOException {
        return this.f3604kz.mo16226D();
    }

    /* renamed from: a */
    public String mo15349a(Context context) {
        return m4768a(context, (String) null, false);
    }

    /* renamed from: a */
    public String mo15350a(Context context, String str) {
        return m4768a(context, str, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo15489a(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException {
        ByteBuffer put;
        if (bArr.length > 239) {
            m4769t();
            mo15490a(20, 1);
            bArr = m4770u();
        }
        if (bArr.length < 239) {
            byte[] bArr2 = new byte[(239 - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr);
        }
        byte[] array = put.array();
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(array);
        byte[] array2 = ByteBuffer.allocate(256).put(instance.digest()).put(array).array();
        byte[] bArr3 = new byte[256];
        new C1510f().mo15260a(array2, bArr3);
        if (str != null && str.length() > 0) {
            mo15492a(str, bArr3);
        }
        return this.f3603ky.mo15184a(bArr3, true);
    }

    /* renamed from: a */
    public void mo15351a(int i, int i2, int i3) {
        if (this.f3601kw != null) {
            this.f3601kw.recycle();
        }
        this.f3601kw = MotionEvent.obtain(0, (long) i3, 1, this.f3602kx.density * ((float) i), this.f3602kx.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15490a(int i, long j) throws IOException {
        this.f3604kz.mo16227b(i, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15491a(int i, String str) throws IOException {
        this.f3604kz.mo16228b(i, str);
    }

    /* renamed from: a */
    public void mo15352a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f3601kw != null) {
                this.f3601kw.recycle();
            }
            this.f3601kw = MotionEvent.obtain(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15492a(String str, byte[] bArr) throws UnsupportedEncodingException {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new C2156qn(str.getBytes("UTF-8")).mo17009o(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15493b(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo15494c(Context context);
}
