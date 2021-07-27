package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.i */
class C2599i extends C2588dg {

    /* renamed from: ID */
    private static final String f4464ID = C1259a.ARBITRARY_PIXEL.toString();
    private static final String URL = C1308b.URL.toString();
    private static final String aqf = C1308b.ADDITIONAL_PARAMS.toString();
    private static final String aqg = C1308b.UNREPEATABLE.toString();
    static final String aqh = ("gtm_" + f4464ID + "_unrepeatable");
    private static final Set<String> aqi = new HashSet();
    private final C2601a aqj;
    private final Context mContext;

    /* renamed from: com.google.android.gms.tagmanager.i$a */
    public interface C2601a {
        /* renamed from: pf */
        C2481aq mo18849pf();
    }

    public C2599i(final Context context) {
        this(context, new C2601a() {
            /* renamed from: pf */
            public C2481aq mo18849pf() {
                return C2635y.m7708X(context);
            }
        });
    }

    C2599i(Context context, C2601a aVar) {
        super(f4464ID, URL);
        this.aqj = aVar;
        this.mContext = context;
    }

    /* renamed from: cl */
    private synchronized boolean m7591cl(String str) {
        if (mo18848cn(str)) {
            return true;
        }
        if (!mo18847cm(str)) {
            return false;
        }
        aqi.add(str);
        return true;
    }

    /* renamed from: D */
    public void mo18830D(Map<String, C1408d.C1409a> map) {
        StringBuilder sb;
        String str;
        String j = map.get(aqg) != null ? C2590di.m7533j(map.get(aqg)) : null;
        if (j == null || !m7591cl(j)) {
            Uri.Builder buildUpon = Uri.parse(C2590di.m7533j(map.get(URL))).buildUpon();
            C1408d.C1409a aVar = map.get(aqf);
            if (aVar != null) {
                Object o = C2590di.m7538o(aVar);
                if (!(o instanceof List)) {
                    sb = new StringBuilder();
                    str = "ArbitraryPixel: additional params not a list: not sending partial hit: ";
                } else {
                    for (Object next : (List) o) {
                        if (!(next instanceof Map)) {
                            sb = new StringBuilder();
                            str = "ArbitraryPixel: additional params contains non-map: not sending partial hit: ";
                        } else {
                            for (Map.Entry entry : ((Map) next).entrySet()) {
                                buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                            }
                        }
                    }
                }
                sb.append(str);
                sb.append(buildUpon.build().toString());
                C2504bh.m7243T(sb.toString());
                return;
            }
            String uri = buildUpon.build().toString();
            this.aqj.mo18849pf().mo18654cB(uri);
            C2504bh.m7245V("ArbitraryPixel: url = " + uri);
            if (j != null) {
                synchronized (C2599i.class) {
                    aqi.add(j);
                    C2577cz.m7494a(this.mContext, aqh, j, "true");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cm */
    public boolean mo18847cm(String str) {
        return this.mContext.getSharedPreferences(aqh, 0).contains(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cn */
    public boolean mo18848cn(String str) {
        return aqi.contains(str);
    }
}
