package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.C1351c;
import com.google.android.gms.internal.C2111pu;
import com.google.android.gms.internal.C2165qv;
import com.google.android.gms.internal.C2166qw;
import com.google.android.gms.tagmanager.C2502bg;
import com.google.android.gms.tagmanager.C2531ce;
import com.google.android.gms.tagmanager.C2551cr;
import com.google.android.gms.tagmanager.C2611o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* renamed from: com.google.android.gms.tagmanager.cq */
class C2548cq implements C2611o.C2619f {
    private final String aqm;
    private C2502bg<C2111pu.C2112a> asC;
    private final ExecutorService asJ = Executors.newSingleThreadExecutor();
    private final Context mContext;

    C2548cq(Context context, String str) {
        this.mContext = context;
        this.aqm = str;
    }

    /* renamed from: a */
    private C2551cr.C2555c m7373a(ByteArrayOutputStream byteArrayOutputStream) {
        try {
            return C2495ba.m7230cI(byteArrayOutputStream.toString("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            C2504bh.m7242S("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        } catch (JSONException e2) {
            C2504bh.m7246W("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
    }

    /* renamed from: d */
    private void m7374d(C2111pu.C2112a aVar) throws IllegalArgumentException {
        if (aVar.f4209gs == null && aVar.auC == null) {
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        }
    }

    /* renamed from: k */
    private C2551cr.C2555c m7375k(byte[] bArr) {
        try {
            C2551cr.C2555c b = C2551cr.m7387b(C1351c.C1357f.m4122a(bArr));
            if (b != null) {
                C2504bh.m7245V("The container was successfully loaded from the resource (using binary file)");
            }
            return b;
        } catch (C2165qv e) {
            C2504bh.m7243T("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        } catch (C2551cr.C2559g e2) {
            C2504bh.m7246W("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
    }

    /* renamed from: a */
    public void mo18740a(C2502bg<C2111pu.C2112a> bgVar) {
        this.asC = bgVar;
    }

    /* renamed from: b */
    public void mo18741b(final C2111pu.C2112a aVar) {
        this.asJ.execute(new Runnable() {
            public void run() {
                C2548cq.this.mo18742c(aVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo18742c(C2111pu.C2112a aVar) {
        File qj = mo18746qj();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(qj);
            try {
                fileOutputStream.write(C2166qw.m6480f(aVar));
                try {
                    fileOutputStream.close();
                    return true;
                } catch (IOException e) {
                    C2504bh.m7246W("error closing stream for writing resource to disk");
                    return true;
                }
            } catch (IOException e2) {
                C2504bh.m7246W("Error writing resource to disk. Removing resource from disk.");
                qj.delete();
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException e3) {
                    C2504bh.m7246W("error closing stream for writing resource to disk");
                    return false;
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                    C2504bh.m7246W("error closing stream for writing resource to disk");
                }
                throw th;
            }
        } catch (FileNotFoundException e5) {
            C2504bh.m7243T("Error opening resource file for writing");
            return false;
        }
    }

    /* renamed from: fH */
    public C2551cr.C2555c mo18743fH(int i) {
        StringBuilder sb;
        try {
            InputStream openRawResource = this.mContext.getResources().openRawResource(i);
            C2504bh.m7245V("Attempting to load a container from the resource ID " + i + " (" + this.mContext.getResources().getResourceName(i) + ")");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C2551cr.m7388b(openRawResource, byteArrayOutputStream);
                C2551cr.C2555c a = m7373a(byteArrayOutputStream);
                if (a == null) {
                    return m7375k(byteArrayOutputStream.toByteArray());
                }
                C2504bh.m7245V("The container was successfully loaded from the resource (using JSON file format)");
                return a;
            } catch (IOException e) {
                sb = new StringBuilder();
                sb.append("Error reading the default container with resource ID ");
                sb.append(i);
                sb.append(" (");
                sb.append(this.mContext.getResources().getResourceName(i));
                sb.append(")");
                C2504bh.m7246W(sb.toString());
                return null;
            }
        } catch (Resources.NotFoundException e2) {
            sb = new StringBuilder();
            sb.append("Failed to load the container. No default container resource found with the resource ID ");
            sb.append(i);
            C2504bh.m7246W(sb.toString());
            return null;
        }
    }

    /* renamed from: pt */
    public void mo18744pt() {
        this.asJ.execute(new Runnable() {
            public void run() {
                C2548cq.this.mo18745qi();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qi */
    public void mo18745qi() {
        if (this.asC == null) {
            throw new IllegalStateException("Callback must be set before execute");
        }
        this.asC.mo18673ps();
        C2504bh.m7245V("Attempting to load resource from disk");
        if ((C2531ce.m7333qa().mo18728qb() == C2531ce.C2532a.CONTAINER || C2531ce.m7333qa().mo18728qb() == C2531ce.C2532a.CONTAINER_DEBUG) && this.aqm.equals(C2531ce.m7333qa().getContainerId())) {
            this.asC.mo18671a(C2502bg.C2503a.NOT_AVAILABLE);
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(mo18746qj());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C2551cr.m7388b(fileInputStream, byteArrayOutputStream);
                C2111pu.C2112a l = C2111pu.C2112a.m6208l(byteArrayOutputStream.toByteArray());
                m7374d(l);
                this.asC.mo18672l(l);
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    C2504bh.m7246W("Error closing stream for reading resource from disk");
                }
            } catch (IOException e2) {
                this.asC.mo18671a(C2502bg.C2503a.IO_ERROR);
                C2504bh.m7246W("Failed to read the resource from disk");
                fileInputStream.close();
            } catch (IllegalArgumentException e3) {
                this.asC.mo18671a(C2502bg.C2503a.IO_ERROR);
                C2504bh.m7246W("Failed to read the resource from disk. The resource is inconsistent");
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    C2504bh.m7246W("Error closing stream for reading resource from disk");
                }
                throw th;
            }
            C2504bh.m7245V("The Disk resource was successfully read.");
        } catch (FileNotFoundException e5) {
            C2504bh.m7242S("Failed to find the resource in the disk");
            this.asC.mo18671a(C2502bg.C2503a.NOT_AVAILABLE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qj */
    public File mo18746qj() {
        return new File(this.mContext.getDir("google_tagmanager", 0), "resource_" + this.aqm);
    }

    public synchronized void release() {
        this.asJ.shutdown();
    }
}
