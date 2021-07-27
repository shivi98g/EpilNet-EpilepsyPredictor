package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.jv */
public final class C1781jv {

    /* renamed from: com.google.android.gms.internal.jv$a */
    public static final class C1783a {

        /* renamed from: Nr */
        private final List<String> f3946Nr;

        /* renamed from: Ns */
        private final Object f3947Ns;

        private C1783a(Object obj) {
            this.f3947Ns = C1785jx.m5364i(obj);
            this.f3946Nr = new ArrayList();
        }

        /* renamed from: a */
        public C1783a mo15935a(String str, Object obj) {
            List<String> list = this.f3946Nr;
            list.add(((String) C1785jx.m5364i(str)) + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3947Ns.getClass().getSimpleName());
            sb.append('{');
            int size = this.f3946Nr.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f3946Nr.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: h */
    public static C1783a m5348h(Object obj) {
        return new C1783a(obj);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
