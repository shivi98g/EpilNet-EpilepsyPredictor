package com.google.android.gms.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.gi */
public final class C1591gi {
    /* access modifiers changed from: private */

    /* renamed from: ut */
    public static final Object f3527ut = new Object();

    /* renamed from: wB */
    private static final SimpleDateFormat[] f3528wB = {new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"), new SimpleDateFormat("yyyyMMdd")};
    /* access modifiers changed from: private */

    /* renamed from: wC */
    public static boolean f3529wC = true;
    /* access modifiers changed from: private */

    /* renamed from: wD */
    public static String f3530wD;

    /* renamed from: wE */
    private static boolean f3531wE = false;

    /* renamed from: com.google.android.gms.internal.gi$a */
    private static final class C1593a extends BroadcastReceiver {
        private C1593a() {
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                z = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                z = false;
            } else {
                return;
            }
            boolean unused = C1591gi.f3529wC = z;
        }
    }

    /* renamed from: L */
    public static String m4638L(String str) {
        return Uri.parse(str).buildUpon().query((String) null).build().toString();
    }

    /* renamed from: M */
    public static int m4639M(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            C1607gr.m4709W("Could not parse value:" + e);
            return 0;
        }
    }

    /* renamed from: N */
    public static boolean m4640N(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: O */
    public static long m4641O(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        SimpleDateFormat[] simpleDateFormatArr = f3528wB;
        int length = simpleDateFormatArr.length;
        int i = 0;
        while (i < length) {
            SimpleDateFormat simpleDateFormat = simpleDateFormatArr[i];
            try {
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat.parse(str).getTime();
            } catch (ParseException e) {
                i++;
            }
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m4643a(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        CharBuffer allocate = CharBuffer.allocate(2048);
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return sb.toString();
            }
            allocate.flip();
            sb.append(allocate, 0, read);
        }
    }

    /* renamed from: a */
    private static JSONArray m4644a(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m4653a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    static JSONArray m4645a(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : objArr) {
            m4653a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m4646a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m4658c(context, str));
    }

    /* renamed from: a */
    public static void m4647a(Context context, String str, List<String> list) {
        for (String gpVar : list) {
            new C1605gp(context, str, gpVar).start();
        }
    }

    /* renamed from: a */
    public static void m4648a(Context context, String str, List<String> list, String str2) {
        for (String gpVar : list) {
            new C1605gp(context, str, gpVar, str2).start();
        }
    }

    /* renamed from: a */
    public static void m4649a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        m4651a(context, str, z, httpURLConnection, false);
    }

    /* renamed from: a */
    public static void m4650a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, String str2) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", str2);
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static void m4651a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m4658c(context, str));
        httpURLConnection.setUseCaches(z2);
    }

    /* renamed from: a */
    public static void m4652a(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            C1599gm.m4683a(webView);
        }
    }

    /* renamed from: a */
    private static void m4653a(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            obj = m4660c((Bundle) obj);
        } else if (obj instanceof Map) {
            obj = m4672t((Map<String, ?>) (Map) obj);
        } else if (obj instanceof Collection) {
            obj = m4644a((Collection<?>) (Collection) obj);
        } else if (obj instanceof Object[]) {
            obj = m4645a((Object[]) obj);
        }
        jSONArray.put(obj);
    }

    /* renamed from: a */
    private static void m4654a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Collection collection;
        if (obj instanceof Bundle) {
            obj = m4660c((Bundle) obj);
        } else if (obj instanceof Map) {
            obj = m4672t((Map<String, ?>) (Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                collection = (Collection) obj;
            } else if (obj instanceof Object[]) {
                collection = Arrays.asList((Object[]) obj);
            }
            obj = m4644a((Collection<?>) collection);
        }
        jSONObject.put(str, obj);
    }

    /* renamed from: a */
    public static boolean m4655a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    /* renamed from: a */
    public static boolean m4656a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m4657b(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            C1599gm.m4684b(webView);
        }
    }

    /* renamed from: c */
    public static String m4658c(final Context context, String str) {
        synchronized (f3527ut) {
            if (f3530wD != null) {
                String str2 = f3530wD;
                return str2;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    f3530wD = C1604go.getDefaultUserAgent(context);
                    f3530wD += " (Mobile; " + str + ")";
                    String str3 = f3530wD;
                    return str3;
                } catch (Exception e) {
                }
            }
            if (!C1606gq.m4703dB()) {
                C1606gq.f3553wR.post(new Runnable() {
                    public void run() {
                        synchronized (C1591gi.f3527ut) {
                            String unused = C1591gi.f3530wD = C1591gi.m4670r(context);
                            C1591gi.f3527ut.notifyAll();
                        }
                    }
                });
                while (f3530wD == null) {
                    try {
                        f3527ut.wait();
                    } catch (InterruptedException e2) {
                        f3530wD = m4665dw();
                        C1607gr.m4709W("Interrupted, use default user agent: " + f3530wD);
                    }
                }
            } else {
                try {
                    f3530wD = m4670r(context);
                } catch (Exception e3) {
                    f3530wD = m4665dw();
                }
            }
            f3530wD += " (Mobile; " + str + ")";
            String str4 = f3530wD;
            return str4;
        }
    }

    /* renamed from: c */
    public static Map<String, String> m4659c(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.parseUrl(uri.toString());
        for (UrlQuerySanitizer.ParameterValuePair next : urlQuerySanitizer.getParameterList()) {
            hashMap.put(next.mParameter, next.mValue);
        }
        return hashMap;
    }

    /* renamed from: c */
    private static JSONObject m4660c(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m4654a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static void m4661c(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m4647a(context, str, (List<String>) arrayList);
    }

    /* renamed from: dt */
    public static boolean m4662dt() {
        return f3529wC;
    }

    /* renamed from: du */
    public static int m4663du() {
        return Build.VERSION.SDK_INT >= 9 ? 6 : 0;
    }

    /* renamed from: dv */
    public static int m4664dv() {
        return Build.VERSION.SDK_INT >= 9 ? 7 : 1;
    }

    /* renamed from: dw */
    static String m4665dw() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            stringBuffer.append(" ");
            stringBuffer.append(Build.VERSION.RELEASE);
        }
        stringBuffer.append("; ");
        stringBuffer.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ");
            stringBuffer.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/");
                stringBuffer.append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    /* renamed from: dx */
    public static String m4666dx() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    /* renamed from: p */
    public static boolean m4668p(Context context) {
        String str;
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            str = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
        } else {
            if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                C1607gr.m4709W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"keyboard"}));
                z = false;
            } else {
                z = true;
            }
            if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                C1607gr.m4709W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"keyboardHidden"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                C1607gr.m4709W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"orientation"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                C1607gr.m4709W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"screenLayout"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                C1607gr.m4709W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"uiMode"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                C1607gr.m4709W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"screenSize"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
                return z;
            }
            str = String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"smallestScreenSize"});
        }
        C1607gr.m4709W(str);
        return false;
    }

    /* renamed from: q */
    public static void m4669q(Context context) {
        if (!f3531wE) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new C1593a(), intentFilter);
            f3531wE = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static String m4670r(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }

    /* renamed from: s */
    public static int m4671s(Context context) {
        int i;
        int i2 = 0;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i2 = rect.top;
            i = window.findViewById(16908290).getTop() - i2;
        } else {
            i = 0;
        }
        return i + i2;
    }

    /* renamed from: t */
    public static JSONObject m4672t(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                m4654a(jSONObject, next, (Object) map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: " + e.getMessage());
        }
    }

    /* renamed from: t */
    public static int[] m4673t(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f = 160.0f / ((float) displayMetrics.densityDpi);
        return new int[]{(int) (((float) displayMetrics.widthPixels) * f), (int) (((float) displayMetrics.heightPixels) * f)};
    }
}
