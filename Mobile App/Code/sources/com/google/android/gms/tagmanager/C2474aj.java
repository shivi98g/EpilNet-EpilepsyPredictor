package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1408d;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.aj */
abstract class C2474aj {
    private final Set<String> art;
    private final String aru;

    public C2474aj(String str, String... strArr) {
        this.aru = str;
        this.art = new HashSet(strArr.length);
        for (String add : strArr) {
            this.art.add(add);
        }
    }

    /* renamed from: B */
    public abstract C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo18646a(Set<String> set) {
        return set.containsAll(this.art);
    }

    /* renamed from: pI */
    public String mo18647pI() {
        return this.aru;
    }

    /* renamed from: pJ */
    public Set<String> mo18648pJ() {
        return this.art;
    }

    /* renamed from: pe */
    public abstract boolean mo18636pe();
}
