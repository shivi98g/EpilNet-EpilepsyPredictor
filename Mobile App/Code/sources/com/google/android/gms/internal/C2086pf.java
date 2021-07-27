package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.internal.C1815kr;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.pf */
public final class C2086pf extends C1818ks implements Moment {
    public static final C2087pg CREATOR = new C2087pg();
    private static final HashMap<String, C1815kr.C1816a<?, ?>> aom = new HashMap<>();

    /* renamed from: CE */
    String f4182CE;

    /* renamed from: CK */
    final int f4183CK;
    final Set<Integer> aon;
    String apa;
    C2084pd api;
    C2084pd apj;

    /* renamed from: vc */
    String f4184vc;

    static {
        aom.put("id", C1815kr.C1816a.m5445l("id", 2));
        aom.put("result", C1815kr.C1816a.m5439a("result", 4, C2084pd.class));
        aom.put("startDate", C1815kr.C1816a.m5445l("startDate", 5));
        aom.put("target", C1815kr.C1816a.m5439a("target", 6, C2084pd.class));
        aom.put("type", C1815kr.C1816a.m5445l("type", 7));
    }

    public C2086pf() {
        this.f4183CK = 1;
        this.aon = new HashSet();
    }

    C2086pf(Set<Integer> set, int i, String str, C2084pd pdVar, String str2, C2084pd pdVar2, String str3) {
        this.aon = set;
        this.f4183CK = i;
        this.f4182CE = str;
        this.api = pdVar;
        this.apa = str2;
        this.apj = pdVar2;
        this.f4184vc = str3;
    }

    public C2086pf(Set<Integer> set, String str, C2084pd pdVar, String str2, C2084pd pdVar2, String str3) {
        this.aon = set;
        this.f4183CK = 1;
        this.f4182CE = str;
        this.api = pdVar;
        this.apa = str2;
        this.apj = pdVar2;
        this.f4184vc = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16002a(C1815kr.C1816a aVar) {
        return this.aon.contains(Integer.valueOf(aVar.mo16022hR()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo16003b(C1815kr.C1816a aVar) {
        int hR = aVar.mo16022hR();
        if (hR == 2) {
            return this.f4182CE;
        }
        switch (hR) {
            case 4:
                return this.api;
            case 5:
                return this.apa;
            case 6:
                return this.apj;
            case 7:
                return this.f4184vc;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo16022hR());
        }
    }

    public int describeContents() {
        C2087pg pgVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2086pf)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C2086pf pfVar = (C2086pf) obj;
        for (C1815kr.C1816a next : aom.values()) {
            if (mo16002a(next)) {
                if (!pfVar.mo16002a(next) || !mo16003b(next).equals(pfVar.mo16003b(next))) {
                    return false;
                }
            } else if (pfVar.mo16002a(next)) {
                return false;
            }
        }
        return true;
    }

    public String getId() {
        return this.f4182CE;
    }

    public ItemScope getResult() {
        return this.api;
    }

    public String getStartDate() {
        return this.apa;
    }

    public ItemScope getTarget() {
        return this.apj;
    }

    public String getType() {
        return this.f4184vc;
    }

    /* renamed from: hK */
    public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
        return aom;
    }

    public boolean hasId() {
        return this.aon.contains(2);
    }

    public boolean hasResult() {
        return this.aon.contains(4);
    }

    public boolean hasStartDate() {
        return this.aon.contains(5);
    }

    public boolean hasTarget() {
        return this.aon.contains(6);
    }

    public boolean hasType() {
        return this.aon.contains(7);
    }

    public int hashCode() {
        int i = 0;
        for (C1815kr.C1816a next : aom.values()) {
            if (mo16002a(next)) {
                i = i + next.mo16022hR() + mo16003b(next).hashCode();
            }
        }
        return i;
    }

    public boolean isDataValid() {
        return true;
    }

    /* renamed from: oJ */
    public C2086pf freeze() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2087pg pgVar = CREATOR;
        C2087pg.m6126a(this, parcel, i);
    }
}
