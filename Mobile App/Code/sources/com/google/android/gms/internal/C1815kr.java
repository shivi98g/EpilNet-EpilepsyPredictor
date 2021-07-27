package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.kr */
public abstract class C1815kr {

    /* renamed from: com.google.android.gms.internal.kr$a */
    public static class C1816a<I, O> implements SafeParcelable {
        public static final C1819kt CREATOR = new C1819kt();

        /* renamed from: CK */
        private final int f3979CK;

        /* renamed from: NL */
        protected final int f3980NL;

        /* renamed from: NM */
        protected final boolean f3981NM;

        /* renamed from: NN */
        protected final int f3982NN;

        /* renamed from: NO */
        protected final boolean f3983NO;

        /* renamed from: NP */
        protected final String f3984NP;

        /* renamed from: NQ */
        protected final int f3985NQ;

        /* renamed from: NR */
        protected final Class<? extends C1815kr> f3986NR;

        /* renamed from: NS */
        protected final String f3987NS;

        /* renamed from: NT */
        private C1821kv f3988NT;
        /* access modifiers changed from: private */

        /* renamed from: NU */
        public C1817b<I, O> f3989NU;

        C1816a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, C1809km kmVar) {
            this.f3979CK = i;
            this.f3980NL = i2;
            this.f3981NM = z;
            this.f3982NN = i3;
            this.f3983NO = z2;
            this.f3984NP = str;
            this.f3985NQ = i4;
            C1817b<?, ?> bVar = null;
            if (str2 == null) {
                this.f3986NR = null;
                this.f3987NS = null;
            } else {
                this.f3986NR = C1826ky.class;
                this.f3987NS = str2;
            }
            this.f3989NU = kmVar != null ? kmVar.mo15976hG() : bVar;
        }

        protected C1816a(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends C1815kr> cls, C1817b<I, O> bVar) {
            this.f3979CK = 1;
            this.f3980NL = i;
            this.f3981NM = z;
            this.f3982NN = i2;
            this.f3983NO = z2;
            this.f3984NP = str;
            this.f3985NQ = i3;
            this.f3986NR = cls;
            this.f3987NS = cls == null ? null : cls.getCanonicalName();
            this.f3989NU = bVar;
        }

        /* renamed from: a */
        public static C1816a m5438a(String str, int i, C1817b<?, ?> bVar, boolean z) {
            return new C1816a(bVar.mo15988hI(), z, bVar.mo15989hJ(), false, str, i, (Class<? extends C1815kr>) null, bVar);
        }

        /* renamed from: a */
        public static <T extends C1815kr> C1816a<T, T> m5439a(String str, int i, Class<T> cls) {
            return new C1816a(11, false, 11, false, str, i, cls, (C1817b) null);
        }

        /* renamed from: b */
        public static <T extends C1815kr> C1816a<ArrayList<T>, ArrayList<T>> m5440b(String str, int i, Class<T> cls) {
            return new C1816a(11, true, 11, true, str, i, cls, (C1817b) null);
        }

        /* renamed from: i */
        public static C1816a<Integer, Integer> m5442i(String str, int i) {
            return new C1816a(0, false, 0, false, str, i, (Class<? extends C1815kr>) null, (C1817b) null);
        }

        /* renamed from: j */
        public static C1816a<Double, Double> m5443j(String str, int i) {
            return new C1816a(4, false, 4, false, str, i, (Class<? extends C1815kr>) null, (C1817b) null);
        }

        /* renamed from: k */
        public static C1816a<Boolean, Boolean> m5444k(String str, int i) {
            return new C1816a(6, false, 6, false, str, i, (Class<? extends C1815kr>) null, (C1817b) null);
        }

        /* renamed from: l */
        public static C1816a<String, String> m5445l(String str, int i) {
            return new C1816a(7, false, 7, false, str, i, (Class<? extends C1815kr>) null, (C1817b) null);
        }

        /* renamed from: m */
        public static C1816a<ArrayList<String>, ArrayList<String>> m5446m(String str, int i) {
            return new C1816a(7, true, 7, true, str, i, (Class<? extends C1815kr>) null, (C1817b) null);
        }

        /* renamed from: a */
        public void mo16012a(C1821kv kvVar) {
            this.f3988NT = kvVar;
        }

        public I convertBack(O o) {
            return this.f3989NU.convertBack(o);
        }

        public int describeContents() {
            C1819kt ktVar = CREATOR;
            return 0;
        }

        public int getVersionCode() {
            return this.f3979CK;
        }

        /* renamed from: hI */
        public int mo16016hI() {
            return this.f3980NL;
        }

        /* renamed from: hJ */
        public int mo16017hJ() {
            return this.f3982NN;
        }

        /* renamed from: hN */
        public C1816a<I, O> mo16018hN() {
            return new C1816a(this.f3979CK, this.f3980NL, this.f3981NM, this.f3982NN, this.f3983NO, this.f3984NP, this.f3985NQ, this.f3987NS, mo16026hV());
        }

        /* renamed from: hO */
        public boolean mo16019hO() {
            return this.f3981NM;
        }

        /* renamed from: hP */
        public boolean mo16020hP() {
            return this.f3983NO;
        }

        /* renamed from: hQ */
        public String mo16021hQ() {
            return this.f3984NP;
        }

        /* renamed from: hR */
        public int mo16022hR() {
            return this.f3985NQ;
        }

        /* renamed from: hS */
        public Class<? extends C1815kr> mo16023hS() {
            return this.f3986NR;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: hT */
        public String mo16024hT() {
            if (this.f3987NS == null) {
                return null;
            }
            return this.f3987NS;
        }

        /* renamed from: hU */
        public boolean mo16025hU() {
            return this.f3989NU != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: hV */
        public C1809km mo16026hV() {
            if (this.f3989NU == null) {
                return null;
            }
            return C1809km.m5408a(this.f3989NU);
        }

        /* renamed from: hW */
        public HashMap<String, C1816a<?, ?>> mo16027hW() {
            C1785jx.m5364i(this.f3987NS);
            C1785jx.m5364i(this.f3988NT);
            return this.f3988NT.mo16040bg(this.f3987NS);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Field\n");
            sb.append("            versionCode=");
            sb.append(this.f3979CK);
            sb.append(10);
            sb.append("                 typeIn=");
            sb.append(this.f3980NL);
            sb.append(10);
            sb.append("            typeInArray=");
            sb.append(this.f3981NM);
            sb.append(10);
            sb.append("                typeOut=");
            sb.append(this.f3982NN);
            sb.append(10);
            sb.append("           typeOutArray=");
            sb.append(this.f3983NO);
            sb.append(10);
            sb.append("        outputFieldName=");
            sb.append(this.f3984NP);
            sb.append(10);
            sb.append("      safeParcelFieldId=");
            sb.append(this.f3985NQ);
            sb.append(10);
            sb.append("       concreteTypeName=");
            sb.append(mo16024hT());
            sb.append(10);
            if (mo16023hS() != null) {
                sb.append("     concreteType.class=");
                sb.append(mo16023hS().getCanonicalName());
                sb.append(10);
            }
            sb.append("          converterName=");
            sb.append(this.f3989NU == null ? "null" : this.f3989NU.getClass().getCanonicalName());
            sb.append(10);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1819kt ktVar = CREATOR;
            C1819kt.m5464a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.kr$b */
    public interface C1817b<I, O> {
        I convertBack(O o);

        /* renamed from: hI */
        int mo15988hI();

        /* renamed from: hJ */
        int mo15989hJ();
    }

    /* renamed from: a */
    private void m5426a(StringBuilder sb, C1816a aVar, Object obj) {
        String str;
        if (aVar.mo16016hI() == 11) {
            str = ((C1815kr) aVar.mo16023hS().cast(obj)).toString();
        } else if (aVar.mo16016hI() == 7) {
            sb.append("\"");
            sb.append(C1837li.m5533bh((String) obj));
            str = "\"";
        } else {
            sb.append(obj);
            return;
        }
        sb.append(str);
    }

    /* renamed from: a */
    private void m5427a(StringBuilder sb, C1816a aVar, ArrayList<Object> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m5426a(sb, aVar, obj);
            }
        }
        sb.append("]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <O, I> I mo16001a(C1816a<I, O> aVar, Object obj) {
        return aVar.f3989NU != null ? aVar.convertBack(obj) : obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16002a(C1816a aVar) {
        return aVar.mo16017hJ() == 11 ? aVar.mo16020hP() ? mo16007bf(aVar.mo16021hQ()) : mo16006be(aVar.mo16021hQ()) : mo16005bd(aVar.mo16021hQ());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo16003b(C1816a aVar) {
        String hQ = aVar.mo16021hQ();
        if (aVar.mo16023hS() == null) {
            return mo16004bc(aVar.mo16021hQ());
        }
        C1785jx.m5356a(mo16004bc(aVar.mo16021hQ()) == null, "Concrete field shouldn't be value object: %s", aVar.mo16021hQ());
        HashMap<String, Object> hM = aVar.mo16020hP() ? mo16010hM() : mo16009hL();
        if (hM != null) {
            return hM.get(hQ);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(hQ.charAt(0)) + hQ.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public abstract Object mo16004bc(String str);

    /* access modifiers changed from: protected */
    /* renamed from: bd */
    public abstract boolean mo16005bd(String str);

    /* access modifiers changed from: protected */
    /* renamed from: be */
    public boolean mo16006be(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: bf */
    public boolean mo16007bf(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    /* renamed from: hK */
    public abstract HashMap<String, C1816a<?, ?>> mo16008hK();

    /* renamed from: hL */
    public HashMap<String, Object> mo16009hL() {
        return null;
    }

    /* renamed from: hM */
    public HashMap<String, Object> mo16010hM() {
        return null;
    }

    public String toString() {
        String str;
        String str2;
        HashMap<String, C1816a<?, ?>> hK = mo16008hK();
        StringBuilder sb = new StringBuilder(100);
        for (String next : hK.keySet()) {
            C1816a aVar = hK.get(next);
            if (mo16002a(aVar)) {
                Object a = mo16001a(aVar, mo16003b(aVar));
                sb.append(sb.length() == 0 ? "{" : ",");
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (a == null) {
                    str2 = "null";
                } else {
                    switch (aVar.mo16017hJ()) {
                        case 8:
                            sb.append("\"");
                            str = C1830lb.m5518d((byte[]) a);
                            break;
                        case 9:
                            sb.append("\"");
                            str = C1830lb.m5519e((byte[]) a);
                            break;
                        case 10:
                            C1838lj.m5535a(sb, (HashMap) a);
                            continue;
                        default:
                            if (!aVar.mo16019hO()) {
                                m5426a(sb, aVar, a);
                                break;
                            } else {
                                m5427a(sb, aVar, (ArrayList<Object>) (ArrayList) a);
                                continue;
                            }
                    }
                    sb.append(str);
                    str2 = "\"";
                }
                sb.append(str2);
            }
        }
        sb.append(sb.length() > 0 ? "}" : "{}");
        return sb.toString();
    }
}
