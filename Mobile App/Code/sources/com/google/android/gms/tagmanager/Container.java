package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.C1351c;
import com.google.android.gms.tagmanager.C2531ce;
import com.google.android.gms.tagmanager.C2551cr;
import com.google.android.gms.tagmanager.C2623s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Container {
    private final String aqm;
    private final DataLayer aqn;
    private C2561ct aqo;
    private Map<String, FunctionCallMacroCallback> aqp = new HashMap();
    private Map<String, FunctionCallTagCallback> aqq = new HashMap();
    private volatile long aqr;
    private volatile String aqs = "";
    private final Context mContext;

    public interface FunctionCallMacroCallback {
        Object getValue(String str, Map<String, Object> map);
    }

    public interface FunctionCallTagCallback {
        void execute(String str, Map<String, Object> map);
    }

    /* renamed from: com.google.android.gms.tagmanager.Container$a */
    private class C2447a implements C2623s.C2624a {
        private C2447a() {
        }

        /* renamed from: b */
        public Object mo18586b(String str, Map<String, Object> map) {
            FunctionCallMacroCallback cp = Container.this.mo18567cp(str);
            if (cp == null) {
                return null;
            }
            return cp.getValue(str, map);
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.Container$b */
    private class C2448b implements C2623s.C2624a {
        private C2448b() {
        }

        /* renamed from: b */
        public Object mo18586b(String str, Map<String, Object> map) {
            FunctionCallTagCallback cq = Container.this.mo18568cq(str);
            if (cq != null) {
                cq.execute(str, map);
            }
            return C2590di.m7547ra();
        }
    }

    Container(Context context, DataLayer dataLayer, String str, long j, C1351c.C1361j jVar) {
        this.mContext = context;
        this.aqn = dataLayer;
        this.aqm = str;
        this.aqr = j;
        m7098a(jVar.f2783gs);
        if (jVar.f2782gr != null) {
            m7101a(jVar.f2782gr);
        }
    }

    Container(Context context, DataLayer dataLayer, String str, long j, C2551cr.C2555c cVar) {
        this.mContext = context;
        this.aqn = dataLayer;
        this.aqm = str;
        this.aqr = j;
        m7099a(cVar);
    }

    /* renamed from: a */
    private void m7098a(C1351c.C1357f fVar) {
        if (fVar == null) {
            throw new NullPointerException();
        }
        try {
            m7099a(C2551cr.m7387b(fVar));
        } catch (C2551cr.C2559g e) {
            C2504bh.m7243T("Not loading resource: " + fVar + " because it is invalid: " + e.toString());
        }
    }

    /* renamed from: a */
    private void m7099a(C2551cr.C2555c cVar) {
        this.aqs = cVar.getVersion();
        C2551cr.C2555c cVar2 = cVar;
        m7100a(new C2561ct(this.mContext, cVar2, this.aqn, new C2447a(), new C2448b(), mo18570cs(this.aqs)));
    }

    /* renamed from: a */
    private synchronized void m7100a(C2561ct ctVar) {
        this.aqo = ctVar;
    }

    /* renamed from: a */
    private void m7101a(C1351c.C1360i[] iVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C1351c.C1360i add : iVarArr) {
            arrayList.add(add);
        }
        m7102pk().mo18797l(arrayList);
    }

    /* renamed from: pk */
    private synchronized C2561ct m7102pk() {
        return this.aqo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cp */
    public FunctionCallMacroCallback mo18567cp(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.aqp) {
            functionCallMacroCallback = this.aqp.get(str);
        }
        return functionCallMacroCallback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cq */
    public FunctionCallTagCallback mo18568cq(String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.aqq) {
            functionCallTagCallback = this.aqq.get(str);
        }
        return functionCallTagCallback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cr */
    public void mo18569cr(String str) {
        m7102pk().mo18796cr(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cs */
    public C2471ag mo18570cs(String str) {
        C2531ce.m7333qa().mo18728qb().equals(C2531ce.C2532a.CONTAINER_DEBUG);
        return new C2514br();
    }

    public boolean getBoolean(String str) {
        String str2;
        C2561ct pk = m7102pk();
        if (pk == null) {
            str2 = "getBoolean called for closed container.";
        } else {
            try {
                return C2590di.m7537n(pk.mo18794cT(str).getObject()).booleanValue();
            } catch (Exception e) {
                str2 = "Calling getBoolean() threw an exception: " + e.getMessage() + " Returning default value.";
            }
        }
        C2504bh.m7243T(str2);
        return C2590di.m7544qY().booleanValue();
    }

    public String getContainerId() {
        return this.aqm;
    }

    public double getDouble(String str) {
        String str2;
        C2561ct pk = m7102pk();
        if (pk == null) {
            str2 = "getDouble called for closed container.";
        } else {
            try {
                return C2590di.m7536m(pk.mo18794cT(str).getObject()).doubleValue();
            } catch (Exception e) {
                str2 = "Calling getDouble() threw an exception: " + e.getMessage() + " Returning default value.";
            }
        }
        C2504bh.m7243T(str2);
        return C2590di.m7543qX().doubleValue();
    }

    public long getLastRefreshTime() {
        return this.aqr;
    }

    public long getLong(String str) {
        String str2;
        C2561ct pk = m7102pk();
        if (pk == null) {
            str2 = "getLong called for closed container.";
        } else {
            try {
                return C2590di.m7535l(pk.mo18794cT(str).getObject()).longValue();
            } catch (Exception e) {
                str2 = "Calling getLong() threw an exception: " + e.getMessage() + " Returning default value.";
            }
        }
        C2504bh.m7243T(str2);
        return C2590di.m7542qW().longValue();
    }

    public String getString(String str) {
        String str2;
        C2561ct pk = m7102pk();
        if (pk == null) {
            str2 = "getString called for closed container.";
        } else {
            try {
                return C2590di.m7533j(pk.mo18794cT(str).getObject());
            } catch (Exception e) {
                str2 = "Calling getString() threw an exception: " + e.getMessage() + " Returning default value.";
            }
        }
        C2504bh.m7243T(str2);
        return C2590di.m7547ra();
    }

    public boolean isDefault() {
        return getLastRefreshTime() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pj */
    public String mo18578pj() {
        return this.aqs;
    }

    public void registerFunctionCallMacroCallback(String str, FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback == null) {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (this.aqp) {
            this.aqp.put(str, functionCallMacroCallback);
        }
    }

    public void registerFunctionCallTagCallback(String str, FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback == null) {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized (this.aqq) {
            this.aqq.put(str, functionCallTagCallback);
        }
    }

    /* access modifiers changed from: package-private */
    public void release() {
        this.aqo = null;
    }

    public void unregisterFunctionCallMacroCallback(String str) {
        synchronized (this.aqp) {
            this.aqp.remove(str);
        }
    }

    public void unregisterFunctionCallTagCallback(String str) {
        synchronized (this.aqq) {
            this.aqq.remove(str);
        }
    }
}
