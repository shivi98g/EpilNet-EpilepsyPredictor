package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1815kr;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.kv */
public class C1821kv implements SafeParcelable {
    public static final C1824kw CREATOR = new C1824kw();

    /* renamed from: CK */
    private final int f3990CK;

    /* renamed from: NV */
    private final HashMap<String, HashMap<String, C1815kr.C1816a<?, ?>>> f3991NV;

    /* renamed from: NW */
    private final ArrayList<C1822a> f3992NW;

    /* renamed from: NX */
    private final String f3993NX;

    /* renamed from: com.google.android.gms.internal.kv$a */
    public static class C1822a implements SafeParcelable {
        public static final C1825kx CREATOR = new C1825kx();

        /* renamed from: NY */
        final ArrayList<C1823b> f3994NY;
        final String className;
        final int versionCode;

        C1822a(int i, String str, ArrayList<C1823b> arrayList) {
            this.versionCode = i;
            this.className = str;
            this.f3994NY = arrayList;
        }

        C1822a(String str, HashMap<String, C1815kr.C1816a<?, ?>> hashMap) {
            this.versionCode = 1;
            this.className = str;
            this.f3994NY = m5478a(hashMap);
        }

        /* renamed from: a */
        private static ArrayList<C1823b> m5478a(HashMap<String, C1815kr.C1816a<?, ?>> hashMap) {
            if (hashMap == null) {
                return null;
            }
            ArrayList<C1823b> arrayList = new ArrayList<>();
            for (String next : hashMap.keySet()) {
                arrayList.add(new C1823b(next, hashMap.get(next)));
            }
            return arrayList;
        }

        public int describeContents() {
            C1825kx kxVar = CREATOR;
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ib */
        public HashMap<String, C1815kr.C1816a<?, ?>> mo16050ib() {
            HashMap<String, C1815kr.C1816a<?, ?>> hashMap = new HashMap<>();
            int size = this.f3994NY.size();
            for (int i = 0; i < size; i++) {
                C1823b bVar = this.f3994NY.get(i);
                hashMap.put(bVar.f3996fv, bVar.f3995NZ);
            }
            return hashMap;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1825kx kxVar = CREATOR;
            C1825kx.m5483a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.kv$b */
    public static class C1823b implements SafeParcelable {
        public static final C1820ku CREATOR = new C1820ku();

        /* renamed from: NZ */
        final C1815kr.C1816a<?, ?> f3995NZ;

        /* renamed from: fv */
        final String f3996fv;
        final int versionCode;

        C1823b(int i, String str, C1815kr.C1816a<?, ?> aVar) {
            this.versionCode = i;
            this.f3996fv = str;
            this.f3995NZ = aVar;
        }

        C1823b(String str, C1815kr.C1816a<?, ?> aVar) {
            this.versionCode = 1;
            this.f3996fv = str;
            this.f3995NZ = aVar;
        }

        public int describeContents() {
            C1820ku kuVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1820ku kuVar = CREATOR;
            C1820ku.m5467a(this, parcel, i);
        }
    }

    C1821kv(int i, ArrayList<C1822a> arrayList, String str) {
        this.f3990CK = i;
        this.f3992NW = null;
        this.f3991NV = m5470c(arrayList);
        this.f3993NX = (String) C1785jx.m5364i(str);
        mo16043hX();
    }

    public C1821kv(Class<? extends C1815kr> cls) {
        this.f3990CK = 1;
        this.f3992NW = null;
        this.f3991NV = new HashMap<>();
        this.f3993NX = cls.getCanonicalName();
    }

    /* renamed from: c */
    private static HashMap<String, HashMap<String, C1815kr.C1816a<?, ?>>> m5470c(ArrayList<C1822a> arrayList) {
        HashMap<String, HashMap<String, C1815kr.C1816a<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1822a aVar = arrayList.get(i);
            hashMap.put(aVar.className, aVar.mo16050ib());
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo16038a(Class<? extends C1815kr> cls, HashMap<String, C1815kr.C1816a<?, ?>> hashMap) {
        this.f3991NV.put(cls.getCanonicalName(), hashMap);
    }

    /* renamed from: b */
    public boolean mo16039b(Class<? extends C1815kr> cls) {
        return this.f3991NV.containsKey(cls.getCanonicalName());
    }

    /* renamed from: bg */
    public HashMap<String, C1815kr.C1816a<?, ?>> mo16040bg(String str) {
        return this.f3991NV.get(str);
    }

    public int describeContents() {
        C1824kw kwVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getVersionCode() {
        return this.f3990CK;
    }

    /* renamed from: hX */
    public void mo16043hX() {
        for (String str : this.f3991NV.keySet()) {
            HashMap hashMap = this.f3991NV.get(str);
            for (String str2 : hashMap.keySet()) {
                ((C1815kr.C1816a) hashMap.get(str2)).mo16012a(this);
            }
        }
    }

    /* renamed from: hY */
    public void mo16044hY() {
        for (String next : this.f3991NV.keySet()) {
            HashMap hashMap = this.f3991NV.get(next);
            HashMap hashMap2 = new HashMap();
            for (String str : hashMap.keySet()) {
                hashMap2.put(str, ((C1815kr.C1816a) hashMap.get(str)).mo16018hN());
            }
            this.f3991NV.put(next, hashMap2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: hZ */
    public ArrayList<C1822a> mo16045hZ() {
        ArrayList<C1822a> arrayList = new ArrayList<>();
        for (String next : this.f3991NV.keySet()) {
            arrayList.add(new C1822a(next, this.f3991NV.get(next)));
        }
        return arrayList;
    }

    /* renamed from: ia */
    public String mo16046ia() {
        return this.f3993NX;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f3991NV.keySet()) {
            sb.append(next);
            sb.append(":\n");
            HashMap hashMap = this.f3991NV.get(next);
            for (String str : hashMap.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1824kw kwVar = CREATOR;
        C1824kw.m5480a(this, parcel, i);
    }
}
