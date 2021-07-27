package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.internal.C1343bv;
import com.google.android.gms.internal.C1574fy;
import com.google.android.gms.internal.C1600gn;
import com.google.android.gms.plus.PlusShare;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1507ey
/* renamed from: com.google.android.gms.internal.fn */
public class C1555fn implements Callable<C1574fy> {
    private final Context mContext;

    /* renamed from: mH */
    private final Object f3358mH = new Object();

    /* renamed from: pM */
    private final C2182u f3359pM;

    /* renamed from: tB */
    private final C1574fy.C1575a f3360tB;

    /* renamed from: tq */
    private int f3361tq;

    /* renamed from: ul */
    private final C1600gn f3362ul;

    /* renamed from: um */
    private final C1278ai f3363um;

    /* renamed from: un */
    private boolean f3364un;

    /* renamed from: uo */
    private List<String> f3365uo;

    /* renamed from: com.google.android.gms.internal.fn$a */
    public interface C1558a<T extends C1343bv.C1344a> {
        /* renamed from: a */
        T mo15317a(C1555fn fnVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException;
    }

    public C1555fn(Context context, C2182u uVar, C1278ai aiVar, C1600gn gnVar, C1574fy.C1575a aVar) {
        this.mContext = context;
        this.f3359pM = uVar;
        this.f3362ul = gnVar;
        this.f3363um = aiVar;
        this.f3360tB = aVar;
        this.f3364un = false;
        this.f3361tq = -2;
        this.f3365uo = null;
    }

    /* renamed from: a */
    private C1343bv.C1344a m4498a(C1276ah ahVar, C1558a aVar, JSONObject jSONObject) throws ExecutionException, InterruptedException, JSONException {
        if (mo15310cO()) {
            return null;
        }
        String[] b = m4500b(jSONObject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        this.f3365uo = b == null ? null : Arrays.asList(b);
        C1343bv.C1344a a = aVar.mo15317a(this, jSONObject);
        if (a == null) {
            C1607gr.m4706T("Failed to retrieve ad assets.");
            return null;
        }
        a.mo14948a(new C1343bv(this.f3359pM, ahVar, jSONObject));
        return a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private C1574fy m4499a(C1343bv.C1344a aVar) {
        int i;
        synchronized (this.f3358mH) {
            try {
                int i2 = this.f3361tq;
                if (aVar == null && this.f3361tq == -2) {
                    i2 = 0;
                }
                i = i2;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        C1343bv.C1344a aVar2 = i != -2 ? null : aVar;
        return new C1574fy(this.f3360tB.f3467vJ.f3308tL, (C1610gu) null, this.f3360tB.f3468vK.f3331qw, i, this.f3360tB.f3468vK.f3332qx, this.f3365uo, this.f3360tB.f3468vK.orientation, this.f3360tB.f3468vK.f3330qA, this.f3360tB.f3467vJ.f3311tO, false, (C1392cq) null, (C1405cz) null, (String) null, (C1393cr) null, (C1395ct) null, 0, this.f3360tB.f3462lS, this.f3360tB.f3468vK.f3336tV, this.f3360tB.f3465vG, this.f3360tB.f3466vH, this.f3360tB.f3468vK.f3342ub, this.f3360tB.f3463vD, aVar2);
    }

    /* renamed from: b */
    private String[] m4500b(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    /* renamed from: c */
    private JSONObject m4501c(final C1276ah ahVar) throws TimeoutException, JSONException {
        if (mo15310cO()) {
            return null;
        }
        final C1594gj gjVar = new C1594gj();
        ahVar.mo14741a("/nativeAdPreProcess", (C1374cd) new C1374cd() {
            /* renamed from: a */
            public void mo14738a(C1610gu guVar, Map<String, String> map) {
                ahVar.mo14745g("/nativeAdPreProcess");
                try {
                    String str = map.get("success");
                    if (!TextUtils.isEmpty(str)) {
                        gjVar.mo15389a(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
                        return;
                    }
                } catch (JSONException e) {
                    C1607gr.m4711b("Malformed native JSON response.", e);
                }
                C1555fn.this.mo15312t(0);
                C1785jx.m5355a(C1555fn.this.mo15310cO(), "Unable to set the ad state error!");
                gjVar.mo15389a(null);
            }
        });
        ahVar.mo14742a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(this.f3360tB.f3468vK.f3335tU));
        return (JSONObject) gjVar.get();
    }

    /* renamed from: cN */
    private C1276ah m4502cN() throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        if (mo15310cO()) {
            return null;
        }
        C1276ah ahVar = this.f3363um.mo14749a(this.mContext, this.f3360tB.f3467vJ.f3304lO, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html").get();
        ahVar.mo14740a(this.f3359pM, this.f3359pM, this.f3359pM, this.f3359pM, false, this.f3359pM);
        return ahVar;
    }

    /* renamed from: a */
    public Future<Drawable> mo15306a(JSONObject jSONObject, String str, final boolean z) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        String string = z ? jSONObject2.getString(PlusShare.KEY_CALL_TO_ACTION_URL) : jSONObject2.optString(PlusShare.KEY_CALL_TO_ACTION_URL);
        if (!TextUtils.isEmpty(string)) {
            return this.f3362ul.mo15404a(string, new C1600gn.C1603a<Drawable>() {
                /* renamed from: a */
                public Drawable mo15314b(InputStream inputStream) {
                    byte[] bArr;
                    try {
                        bArr = C1836lh.m5532d(inputStream);
                    } catch (IOException e) {
                        bArr = null;
                    }
                    if (bArr == null) {
                        C1555fn.this.mo15307a(2, z);
                        return null;
                    }
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (decodeByteArray != null) {
                        return new BitmapDrawable(Resources.getSystem(), decodeByteArray);
                    }
                    C1555fn.this.mo15307a(2, z);
                    return null;
                }

                /* renamed from: cP */
                public Drawable mo15316cQ() {
                    C1555fn.this.mo15307a(2, z);
                    return null;
                }
            });
        }
        mo15307a(0, z);
        return new C1595gk(null);
    }

    /* renamed from: a */
    public void mo15307a(int i, boolean z) {
        if (z) {
            mo15312t(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1558a mo15308b(JSONObject jSONObject) throws JSONException {
        if (mo15310cO()) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        if ("2".equals(string)) {
            return new C1559fo();
        }
        if ("1".equals(string)) {
            return new C1560fp();
        }
        mo15312t(0);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* renamed from: cM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.C1574fy call() {
        /*
            r3 = this;
            com.google.android.gms.internal.ah r0 = r3.m4502cN()     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x0020, JSONException -> 0x0019, TimeoutException -> 0x0015 }
            org.json.JSONObject r1 = r3.m4501c(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x0020, JSONException -> 0x0019, TimeoutException -> 0x0015 }
            com.google.android.gms.internal.fn$a r2 = r3.mo15308b(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x0020, JSONException -> 0x0019, TimeoutException -> 0x0015 }
            com.google.android.gms.internal.bv$a r0 = r3.m4498a((com.google.android.gms.internal.C1276ah) r0, (com.google.android.gms.internal.C1555fn.C1558a) r2, (org.json.JSONObject) r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x0020, JSONException -> 0x0019, TimeoutException -> 0x0015 }
            com.google.android.gms.internal.fy r0 = r3.m4499a(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException -> 0x0020, JSONException -> 0x0019, TimeoutException -> 0x0015 }
            return r0
        L_0x0015:
            r0 = move-exception
            java.lang.String r1 = "Timeout when loading native ad."
            goto L_0x001c
        L_0x0019:
            r0 = move-exception
            java.lang.String r1 = "Malformed native JSON response."
        L_0x001c:
            com.google.android.gms.internal.C1607gr.m4713d(r1, r0)
            goto L_0x0021
        L_0x0020:
            r0 = move-exception
        L_0x0021:
            boolean r0 = r3.f3364un
            if (r0 != 0) goto L_0x0029
            r0 = 0
            r3.mo15312t(r0)
        L_0x0029:
            r0 = 0
            com.google.android.gms.internal.fy r0 = r3.m4499a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1555fn.call():com.google.android.gms.internal.fy");
    }

    /* renamed from: cO */
    public boolean mo15310cO() {
        boolean z;
        synchronized (this.f3358mH) {
            z = this.f3364un;
        }
        return z;
    }

    /* renamed from: t */
    public void mo15312t(int i) {
        synchronized (this.f3358mH) {
            this.f3364un = true;
            this.f3361tq = i;
        }
    }
}
