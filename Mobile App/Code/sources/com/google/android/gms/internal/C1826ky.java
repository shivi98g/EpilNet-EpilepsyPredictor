package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0721a;
import com.google.android.gms.common.internal.safeparcel.C0723b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C1815kr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ky */
public class C1826ky extends C1815kr implements SafeParcelable {
    public static final C1827kz CREATOR = new C1827kz();

    /* renamed from: CK */
    private final int f3997CK;

    /* renamed from: NT */
    private final C1821kv f3998NT;

    /* renamed from: Oa */
    private final Parcel f3999Oa;

    /* renamed from: Ob */
    private final int f4000Ob;

    /* renamed from: Oc */
    private int f4001Oc;

    /* renamed from: Od */
    private int f4002Od;
    private final String mClassName;

    C1826ky(int i, Parcel parcel, C1821kv kvVar) {
        this.f3997CK = i;
        this.f3999Oa = (Parcel) C1785jx.m5364i(parcel);
        this.f4000Ob = 2;
        this.f3998NT = kvVar;
        this.mClassName = this.f3998NT == null ? null : this.f3998NT.mo16046ia();
        this.f4001Oc = 2;
    }

    private C1826ky(SafeParcelable safeParcelable, C1821kv kvVar, String str) {
        this.f3997CK = 1;
        this.f3999Oa = Parcel.obtain();
        safeParcelable.writeToParcel(this.f3999Oa, 0);
        this.f4000Ob = 1;
        this.f3998NT = (C1821kv) C1785jx.m5364i(kvVar);
        this.mClassName = (String) C1785jx.m5364i(str);
        this.f4001Oc = 2;
    }

    /* renamed from: a */
    public static <T extends C1815kr & SafeParcelable> C1826ky m5486a(T t) {
        String canonicalName = t.getClass().getCanonicalName();
        return new C1826ky((SafeParcelable) t, m5492b((C1815kr) t), canonicalName);
    }

    /* renamed from: a */
    private static void m5487a(C1821kv kvVar, C1815kr krVar) {
        Class<?> cls = krVar.getClass();
        if (!kvVar.mo16039b(cls)) {
            HashMap<String, C1815kr.C1816a<?, ?>> hK = krVar.mo16008hK();
            kvVar.mo16038a(cls, krVar.mo16008hK());
            for (String str : hK.keySet()) {
                C1815kr.C1816a aVar = hK.get(str);
                Class<? extends C1815kr> hS = aVar.mo16023hS();
                if (hS != null) {
                    try {
                        m5487a(kvVar, (C1815kr) hS.newInstance());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException("Could not instantiate an object of type " + aVar.mo16023hS().getCanonicalName(), e);
                    } catch (IllegalAccessException e2) {
                        throw new IllegalStateException("Could not access object of type " + aVar.mo16023hS().getCanonicalName(), e2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m5488a(StringBuilder sb, int i, Object obj) {
        String str;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                str = C1837li.m5533bh(obj.toString());
                break;
            case 8:
                sb.append("\"");
                str = C1830lb.m5518d((byte[]) obj);
                break;
            case 9:
                sb.append("\"");
                str = C1830lb.m5519e((byte[]) obj);
                break;
            case 10:
                C1838lj.m5535a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
        sb.append(str);
        sb.append("\"");
    }

    /* renamed from: a */
    private void m5489a(StringBuilder sb, C1815kr.C1816a<?, ?> aVar, Parcel parcel, int i) {
        Object obj;
        switch (aVar.mo16017hJ()) {
            case 0:
                obj = Integer.valueOf(C0721a.m728g(parcel, i));
                break;
            case 1:
                obj = C0721a.m732k(parcel, i);
                break;
            case 2:
                obj = Long.valueOf(C0721a.m730i(parcel, i));
                break;
            case 3:
                obj = Float.valueOf(C0721a.m733l(parcel, i));
                break;
            case 4:
                obj = Double.valueOf(C0721a.m734m(parcel, i));
                break;
            case 5:
                obj = C0721a.m735n(parcel, i);
                break;
            case 6:
                obj = Boolean.valueOf(C0721a.m724c(parcel, i));
                break;
            case 7:
                obj = C0721a.m736o(parcel, i);
                break;
            case 8:
            case 9:
                obj = C0721a.m739r(parcel, i);
                break;
            case 10:
                obj = m5497g(C0721a.m738q(parcel, i));
                break;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + aVar.mo16017hJ());
        }
        m5495b(sb, aVar, (Object) mo16001a(aVar, obj));
    }

    /* renamed from: a */
    private void m5490a(StringBuilder sb, String str, C1815kr.C1816a<?, ?> aVar, Parcel parcel, int i) {
        sb.append("\"");
        sb.append(str);
        sb.append("\":");
        if (aVar.mo16025hU()) {
            m5489a(sb, aVar, parcel, i);
        } else {
            m5494b(sb, aVar, parcel, i);
        }
    }

    /* renamed from: a */
    private void m5491a(StringBuilder sb, HashMap<String, C1815kr.C1816a<?, ?>> hashMap, Parcel parcel) {
        HashMap<Integer, Map.Entry<String, C1815kr.C1816a<?, ?>>> b = m5493b(hashMap);
        sb.append('{');
        int G = C0721a.m714G(parcel);
        boolean z = false;
        while (parcel.dataPosition() < G) {
            int F = C0721a.m713F(parcel);
            Map.Entry entry = b.get(Integer.valueOf(C0721a.m720aH(F)));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                m5490a(sb, (String) entry.getKey(), (C1815kr.C1816a) entry.getValue(), parcel, F);
                z = true;
            }
        }
        if (parcel.dataPosition() != G) {
            throw new C0721a.C0722a("Overread allowed size end=" + G, parcel);
        }
        sb.append('}');
    }

    /* renamed from: b */
    private static C1821kv m5492b(C1815kr krVar) {
        C1821kv kvVar = new C1821kv(krVar.getClass());
        m5487a(kvVar, krVar);
        kvVar.mo16044hY();
        kvVar.mo16043hX();
        return kvVar;
    }

    /* renamed from: b */
    private static HashMap<Integer, Map.Entry<String, C1815kr.C1816a<?, ?>>> m5493b(HashMap<String, C1815kr.C1816a<?, ?>> hashMap) {
        HashMap<Integer, Map.Entry<String, C1815kr.C1816a<?, ?>>> hashMap2 = new HashMap<>();
        for (Map.Entry next : hashMap.entrySet()) {
            hashMap2.put(Integer.valueOf(((C1815kr.C1816a) next.getValue()).mo16022hR()), next);
        }
        return hashMap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        com.google.android.gms.internal.C1829la.m5511a(r5, (T[]) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        r6 = "]";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        r5.append(r6);
        r6 = "\"";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0150, code lost:
        r5.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0153, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5494b(java.lang.StringBuilder r5, com.google.android.gms.internal.C1815kr.C1816a<?, ?> r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            boolean r0 = r6.mo16020hP()
            r1 = 0
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "["
            r5.append(r0)
            int r0 = r6.mo16017hJ()
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0070;
                case 2: goto L_0x0068;
                case 3: goto L_0x0060;
                case 4: goto L_0x0058;
                case 5: goto L_0x0053;
                case 6: goto L_0x004b;
                case 7: goto L_0x0043;
                case 8: goto L_0x003b;
                case 9: goto L_0x003b;
                case 10: goto L_0x003b;
                case 11: goto L_0x001b;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unknown field type out."
            r5.<init>(r6)
            throw r5
        L_0x001b:
            android.os.Parcel[] r7 = com.google.android.gms.common.internal.safeparcel.C0721a.m712E(r7, r8)
            int r8 = r7.length
            r0 = r1
        L_0x0021:
            if (r0 >= r8) goto L_0x007f
            if (r0 <= 0) goto L_0x002a
            java.lang.String r2 = ","
            r5.append(r2)
        L_0x002a:
            r2 = r7[r0]
            r2.setDataPosition(r1)
            java.util.HashMap r2 = r6.mo16027hW()
            r3 = r7[r0]
            r4.m5491a((java.lang.StringBuilder) r5, (java.util.HashMap<java.lang.String, com.google.android.gms.internal.C1815kr.C1816a<?, ?>>) r2, (android.os.Parcel) r3)
            int r0 = r0 + 1
            goto L_0x0021
        L_0x003b:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r5.<init>(r6)
            throw r5
        L_0x0043:
            java.lang.String[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m708A(r7, r8)
            com.google.android.gms.internal.C1829la.m5512a((java.lang.StringBuilder) r5, (java.lang.String[]) r6)
            goto L_0x007f
        L_0x004b:
            boolean[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m741t(r7, r8)
            com.google.android.gms.internal.C1829la.m5513a((java.lang.StringBuilder) r5, (boolean[]) r6)
            goto L_0x007f
        L_0x0053:
            java.math.BigDecimal[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m747z(r7, r8)
            goto L_0x0074
        L_0x0058:
            double[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m746y(r7, r8)
            com.google.android.gms.internal.C1829la.m5507a((java.lang.StringBuilder) r5, (double[]) r6)
            goto L_0x007f
        L_0x0060:
            float[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m745x(r7, r8)
            com.google.android.gms.internal.C1829la.m5508a((java.lang.StringBuilder) r5, (float[]) r6)
            goto L_0x007f
        L_0x0068:
            long[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m743v(r7, r8)
            com.google.android.gms.internal.C1829la.m5510a((java.lang.StringBuilder) r5, (long[]) r6)
            goto L_0x007f
        L_0x0070:
            java.math.BigInteger[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m744w(r7, r8)
        L_0x0074:
            com.google.android.gms.internal.C1829la.m5511a((java.lang.StringBuilder) r5, (T[]) r6)
            goto L_0x007f
        L_0x0078:
            int[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m742u(r7, r8)
            com.google.android.gms.internal.C1829la.m5509a((java.lang.StringBuilder) r5, (int[]) r6)
        L_0x007f:
            java.lang.String r6 = "]"
            goto L_0x0123
        L_0x0083:
            int r0 = r6.mo16017hJ()
            switch(r0) {
                case 0: goto L_0x0154;
                case 1: goto L_0x014c;
                case 2: goto L_0x0144;
                case 3: goto L_0x013c;
                case 4: goto L_0x0134;
                case 5: goto L_0x012f;
                case 6: goto L_0x0127;
                case 7: goto L_0x0111;
                case 8: goto L_0x0103;
                case 9: goto L_0x00f5;
                case 10: goto L_0x00a1;
                case 11: goto L_0x0092;
                default: goto L_0x008a;
            }
        L_0x008a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unknown field type out"
            r5.<init>(r6)
            throw r5
        L_0x0092:
            android.os.Parcel r7 = com.google.android.gms.common.internal.safeparcel.C0721a.m711D(r7, r8)
            r7.setDataPosition(r1)
            java.util.HashMap r6 = r6.mo16027hW()
            r4.m5491a((java.lang.StringBuilder) r5, (java.util.HashMap<java.lang.String, com.google.android.gms.internal.C1815kr.C1816a<?, ?>>) r6, (android.os.Parcel) r7)
            return
        L_0x00a1:
            android.os.Bundle r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m738q(r7, r8)
            java.util.Set r7 = r6.keySet()
            r7.size()
            java.lang.String r8 = "{"
            r5.append(r8)
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x00b6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r8 != 0) goto L_0x00c9
            java.lang.String r8 = ","
            r5.append(r8)
        L_0x00c9:
            java.lang.String r8 = "\""
            r5.append(r8)
            r5.append(r0)
            java.lang.String r8 = "\""
            r5.append(r8)
            java.lang.String r8 = ":"
            r5.append(r8)
            java.lang.String r8 = "\""
            r5.append(r8)
            java.lang.String r8 = r6.getString(r0)
            java.lang.String r8 = com.google.android.gms.internal.C1837li.m5533bh(r8)
            r5.append(r8)
            java.lang.String r8 = "\""
            r5.append(r8)
            r8 = r1
            goto L_0x00b6
        L_0x00f2:
            java.lang.String r6 = "}"
            goto L_0x0123
        L_0x00f5:
            byte[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m739r(r7, r8)
            java.lang.String r7 = "\""
            r5.append(r7)
            java.lang.String r6 = com.google.android.gms.internal.C1830lb.m5519e(r6)
            goto L_0x011e
        L_0x0103:
            byte[] r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m739r(r7, r8)
            java.lang.String r7 = "\""
            r5.append(r7)
            java.lang.String r6 = com.google.android.gms.internal.C1830lb.m5518d(r6)
            goto L_0x011e
        L_0x0111:
            java.lang.String r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m736o(r7, r8)
            java.lang.String r7 = "\""
            r5.append(r7)
            java.lang.String r6 = com.google.android.gms.internal.C1837li.m5533bh(r6)
        L_0x011e:
            r5.append(r6)
            java.lang.String r6 = "\""
        L_0x0123:
            r5.append(r6)
            return
        L_0x0127:
            boolean r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m724c(r7, r8)
            r5.append(r6)
            return
        L_0x012f:
            java.math.BigDecimal r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m735n(r7, r8)
            goto L_0x0150
        L_0x0134:
            double r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m734m(r7, r8)
            r5.append(r6)
            return
        L_0x013c:
            float r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m733l(r7, r8)
            r5.append(r6)
            return
        L_0x0144:
            long r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m730i(r7, r8)
            r5.append(r6)
            return
        L_0x014c:
            java.math.BigInteger r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m732k(r7, r8)
        L_0x0150:
            r5.append(r6)
            return
        L_0x0154:
            int r6 = com.google.android.gms.common.internal.safeparcel.C0721a.m728g(r7, r8)
            r5.append(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.C1826ky.m5494b(java.lang.StringBuilder, com.google.android.gms.internal.kr$a, android.os.Parcel, int):void");
    }

    /* renamed from: b */
    private void m5495b(StringBuilder sb, C1815kr.C1816a<?, ?> aVar, Object obj) {
        if (aVar.mo16019hO()) {
            m5496b(sb, aVar, (ArrayList<?>) (ArrayList) obj);
        } else {
            m5488a(sb, aVar.mo16016hI(), obj);
        }
    }

    /* renamed from: b */
    private void m5496b(StringBuilder sb, C1815kr.C1816a<?, ?> aVar, ArrayList<?> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            m5488a(sb, aVar.mo16016hI(), (Object) arrayList.get(i));
        }
        sb.append("]");
    }

    /* renamed from: g */
    public static HashMap<String, String> m5497g(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public Object mo16004bc(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: bd */
    public boolean mo16005bd(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents() {
        C1827kz kzVar = CREATOR;
        return 0;
    }

    public int getVersionCode() {
        return this.f3997CK;
    }

    /* renamed from: hK */
    public HashMap<String, C1815kr.C1816a<?, ?>> mo16008hK() {
        if (this.f3998NT == null) {
            return null;
        }
        return this.f3998NT.mo16040bg(this.mClassName);
    }

    /* renamed from: ic */
    public Parcel mo16064ic() {
        switch (this.f4001Oc) {
            case 0:
                this.f4002Od = C0723b.m750H(this.f3999Oa);
                break;
            case 1:
                break;
        }
        C0723b.m751H(this.f3999Oa, this.f4002Od);
        this.f4001Oc = 2;
        return this.f3999Oa;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: id */
    public C1821kv mo16065id() {
        switch (this.f4000Ob) {
            case 0:
                return null;
            case 1:
                return this.f3998NT;
            case 2:
                return this.f3998NT;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.f4000Ob);
        }
    }

    public String toString() {
        C1785jx.m5359b(this.f3998NT, (Object) "Cannot convert to JSON on client side.");
        Parcel ic = mo16064ic();
        ic.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m5491a(sb, this.f3998NT.mo16040bg(this.mClassName), ic);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1827kz kzVar = CREATOR;
        C1827kz.m5503a(this, parcel, i);
    }
}
