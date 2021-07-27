package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1308b;
import com.google.android.gms.internal.C1408d;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.cd */
abstract class C2530cd extends C2474aj {
    private static final String arp = C1308b.ARG0.toString();
    private static final String ask = C1308b.ARG1.toString();

    public C2530cd(String str) {
        super(str, arp, ask);
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        boolean z;
        Iterator<C1408d.C1409a> it = map.values().iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (it.next() == C2590di.m7548rb()) {
                    break;
                }
            } else {
                C1408d.C1409a aVar = map.get(arp);
                C1408d.C1409a aVar2 = map.get(ask);
                if (aVar != null && aVar2 != null) {
                    z = mo18709a(aVar, aVar2, map);
                }
            }
        }
        return C2590di.m7551u(Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18709a(C1408d.C1409a aVar, C1408d.C1409a aVar2, Map<String, C1408d.C1409a> map);

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
