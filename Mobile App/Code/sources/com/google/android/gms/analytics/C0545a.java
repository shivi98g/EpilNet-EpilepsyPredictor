package com.google.android.gms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.analytics.a */
class C0545a implements C0583q {

    /* renamed from: xO */
    private static Object f176xO = new Object();

    /* renamed from: xP */
    private static C0545a f177xP;
    private Context mContext;

    /* renamed from: xQ */
    private AdvertisingIdClient.Info f178xQ;

    /* renamed from: xR */
    private long f179xR;

    /* renamed from: xS */
    private String f180xS;

    /* renamed from: xT */
    private boolean f181xT = false;

    /* renamed from: xU */
    private Object f182xU = new Object();

    C0545a(Context context) {
        this.mContext = context.getApplicationContext();
    }

    /* renamed from: a */
    private boolean m78a(AdvertisingIdClient.Info info, AdvertisingIdClient.Info info2) {
        String str = null;
        String id = info2 == null ? null : info2.getId();
        if (TextUtils.isEmpty(id)) {
            return true;
        }
        C0575k.m227y(this.mContext);
        C0575k el = C0575k.m224el();
        String value = el.getValue("&cid");
        synchronized (this.f182xU) {
            if (!this.f181xT) {
                this.f180xS = m82x(this.mContext);
                this.f181xT = true;
            } else if (TextUtils.isEmpty(this.f180xS)) {
                if (info != null) {
                    str = info.getId();
                }
                if (str == null) {
                    boolean ab = m80ab(id + value);
                    return ab;
                }
                this.f180xS = m79aa(str + value);
            }
            String aa = m79aa(id + value);
            if (TextUtils.isEmpty(aa)) {
                return false;
            }
            if (aa.equals(this.f180xS)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.f180xS)) {
                C0550ae.m105V("Resetting the client id because Advertising Id changed.");
                value = el.mo10471em();
                C0550ae.m105V("New client Id: " + value);
            }
            boolean ab2 = m80ab(id + value);
            return ab2;
        }
    }

    /* renamed from: aa */
    static String m79aa(String str) {
        MessageDigest ap = C0561an.m167ap("MD5");
        if (ap == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, ap.digest(str.getBytes()))});
    }

    /* renamed from: ab */
    private boolean m80ab(String str) {
        String str2;
        try {
            String aa = m79aa(str);
            C0550ae.m105V("Storing hashed adid.");
            FileOutputStream openFileOutput = this.mContext.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(aa.getBytes());
            openFileOutput.close();
            this.f180xS = aa;
            return true;
        } catch (FileNotFoundException e) {
            str2 = "Error creating hash file.";
            C0550ae.m103T(str2);
            return false;
        } catch (IOException e2) {
            str2 = "Error writing to hash file.";
            C0550ae.m103T(str2);
            return false;
        }
    }

    /* renamed from: w */
    public static C0583q m81w(Context context) {
        if (f177xP == null) {
            synchronized (f176xO) {
                if (f177xP == null) {
                    f177xP = new C0545a(context);
                }
            }
        }
        return f177xP;
    }

    /* renamed from: x */
    static String m82x(Context context) {
        String str = null;
        try {
            FileInputStream openFileInput = context.openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                C0550ae.m106W("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                context.deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                C0550ae.m104U("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                } catch (FileNotFoundException e) {
                } catch (IOException e2) {
                    str = str2;
                    C0550ae.m106W("Error reading Hash file, deleting it.");
                    context.deleteFile("gaClientIdData");
                    return str;
                }
                return str2;
            }
        } catch (FileNotFoundException e3) {
            return null;
        } catch (IOException e4) {
            C0550ae.m106W("Error reading Hash file, deleting it.");
            context.deleteFile("gaClientIdData");
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dP */
    public AdvertisingIdClient.Info mo10335dP() {
        String str;
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.mContext);
        } catch (IllegalStateException e) {
            str = "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.";
            C0550ae.m106W(str);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            str = "GooglePlayServicesRepairableException getting Ad Id Info";
            C0550ae.m106W(str);
            return null;
        } catch (IOException e3) {
            str = "IOException getting Ad Id Info";
            C0550ae.m106W(str);
            return null;
        } catch (GooglePlayServicesNotAvailableException e4) {
            str = "GooglePlayServicesNotAvailableException getting Ad Id Info";
            C0550ae.m106W(str);
            return null;
        } catch (Throwable th) {
            str = "Unknown exception. Could not get the ad Id.";
            C0550ae.m106W(str);
            return null;
        }
    }

    public String getValue(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f179xR > 1000) {
            AdvertisingIdClient.Info dP = mo10335dP();
            if (!m78a(this.f178xQ, dP)) {
                dP = new AdvertisingIdClient.Info("", false);
            }
            this.f178xQ = dP;
            this.f179xR = currentTimeMillis;
        }
        if (this.f178xQ == null) {
            return null;
        }
        if ("&adid".equals(str)) {
            return this.f178xQ.getId();
        }
        if ("&ate".equals(str)) {
            return this.f178xQ.isLimitAdTrackingEnabled() ? "0" : "1";
        }
        return null;
    }
}
