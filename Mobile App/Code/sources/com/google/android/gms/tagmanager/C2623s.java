package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.s */
class C2623s extends C2474aj {

    /* renamed from: ID */
    private static final String f4475ID = C1259a.FUNCTION_CALL.toString();
    private static final String aqO = C1308b.FUNCTION_CALL_NAME.toString();
    private static final String aqf = C1308b.ADDITIONAL_PARAMS.toString();
    private final C2624a aqP;

    /* renamed from: com.google.android.gms.tagmanager.s$a */
    public interface C2624a {
        /* renamed from: b */
        Object mo18586b(String str, Map<String, Object> map);
    }

    public C2623s(C2624a aVar) {
        super(f4475ID, aqO);
        this.aqP = aVar;
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        String str;
        String j = C2590di.m7533j(map.get(aqO));
        HashMap hashMap = new HashMap();
        C1408d.C1409a aVar = map.get(aqf);
        if (aVar != null) {
            Object o = C2590di.m7538o(aVar);
            if (!(o instanceof Map)) {
                str = "FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.";
                C2504bh.m7246W(str);
                return C2590di.m7548rb();
            }
            for (Map.Entry entry : ((Map) o).entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue());
            }
        }
        try {
            return C2590di.m7551u(this.aqP.mo18586b(j, hashMap));
        } catch (Exception e) {
            str = "Custom macro/tag " + j + " threw exception " + e.getMessage();
        }
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return false;
    }
}
