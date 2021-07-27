package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer {
    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String[] aqQ = "gtm.lifetime".toString().split("\\.");
    private static final Pattern aqR = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap<C2452b, Integer> aqS;
    private final Map<String, Object> aqT;
    private final ReentrantLock aqU;
    private final LinkedList<Map<String, Object>> aqV;
    private final C2453c aqW;
    /* access modifiers changed from: private */
    public final CountDownLatch aqX;

    /* renamed from: com.google.android.gms.tagmanager.DataLayer$a */
    static final class C2451a {

        /* renamed from: KP */
        public final String f4392KP;

        /* renamed from: wF */
        public final Object f4393wF;

        C2451a(String str, Object obj) {
            this.f4392KP = str;
            this.f4393wF = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2451a)) {
                return false;
            }
            C2451a aVar = (C2451a) obj;
            return this.f4392KP.equals(aVar.f4392KP) && this.f4393wF.equals(aVar.f4393wF);
        }

        public int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.f4392KP.hashCode()), Integer.valueOf(this.f4393wF.hashCode())});
        }

        public String toString() {
            return "Key: " + this.f4392KP + " value: " + this.f4393wF.toString();
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.DataLayer$b */
    interface C2452b {
        /* renamed from: C */
        void mo18608C(Map<String, Object> map);
    }

    /* renamed from: com.google.android.gms.tagmanager.DataLayer$c */
    interface C2453c {

        /* renamed from: com.google.android.gms.tagmanager.DataLayer$c$a */
        public interface C2454a {
            /* renamed from: h */
            void mo18604h(List<C2451a> list);
        }

        /* renamed from: a */
        void mo18601a(C2454a aVar);

        /* renamed from: a */
        void mo18602a(List<C2451a> list, long j);

        /* renamed from: cz */
        void mo18603cz(String str);
    }

    DataLayer() {
        this(new C2453c() {
            /* renamed from: a */
            public void mo18601a(C2453c.C2454a aVar) {
                aVar.mo18604h(new ArrayList());
            }

            /* renamed from: a */
            public void mo18602a(List<C2451a> list, long j) {
            }

            /* renamed from: cz */
            public void mo18603cz(String str) {
            }
        });
    }

    DataLayer(C2453c cVar) {
        this.aqW = cVar;
        this.aqS = new ConcurrentHashMap<>();
        this.aqT = new HashMap();
        this.aqU = new ReentrantLock();
        this.aqV = new LinkedList<>();
        this.aqX = new CountDownLatch(1);
        m7121pv();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m7110E(Map<String, Object> map) {
        this.aqU.lock();
        try {
            this.aqV.offer(map);
            if (this.aqU.getHoldCount() == 1) {
                m7122pw();
            }
            m7111F(map);
        } finally {
            this.aqU.unlock();
        }
    }

    /* renamed from: F */
    private void m7111F(Map<String, Object> map) {
        Long G = m7112G(map);
        if (G != null) {
            List<C2451a> I = m7114I(map);
            I.remove("gtm.lifetime");
            this.aqW.mo18602a(I, G.longValue());
        }
    }

    /* renamed from: G */
    private Long m7112G(Map<String, Object> map) {
        Object H = m7113H(map);
        if (H == null) {
            return null;
        }
        return m7120cy(H.toString());
    }

    /* renamed from: H */
    private Object m7113H(Map<String, Object> map) {
        String[] strArr = aqQ;
        int length = strArr.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            String str = strArr[i];
            if (!(obj instanceof Map)) {
                return null;
            }
            i++;
            obj = ((Map) obj).get(str);
        }
        return obj;
    }

    /* renamed from: I */
    private List<C2451a> m7114I(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        m7119a(map, "", arrayList);
        return arrayList;
    }

    /* renamed from: J */
    private void m7115J(Map<String, Object> map) {
        synchronized (this.aqT) {
            for (String next : map.keySet()) {
                mo18592a(mo18594c(next, map.get(next)), this.aqT);
            }
        }
        m7116K(map);
    }

    /* renamed from: K */
    private void m7116K(Map<String, Object> map) {
        for (C2452b C : this.aqS.keySet()) {
            C.mo18608C(map);
        }
    }

    /* renamed from: a */
    private void m7119a(Map<String, Object> map, String str, Collection<C2451a> collection) {
        for (Map.Entry next : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.length() == 0 ? "" : ".");
            sb.append((String) next.getKey());
            String sb2 = sb.toString();
            if (next.getValue() instanceof Map) {
                m7119a((Map) next.getValue(), sb2, collection);
            } else if (!sb2.equals("gtm.lifetime")) {
                collection.add(new C2451a(sb2, next.getValue()));
            }
        }
    }

    /* renamed from: cy */
    static Long m7120cy(String str) {
        long j;
        long j2;
        long j3;
        Matcher matcher = aqR.matcher(str);
        if (!matcher.matches()) {
            C2504bh.m7244U("unknown _lifetime: " + str);
            return null;
        }
        try {
            j = Long.parseLong(matcher.group(1));
        } catch (NumberFormatException e) {
            C2504bh.m7246W("illegal number in _lifetime value: " + str);
            j = 0;
        }
        if (j <= 0) {
            C2504bh.m7244U("non-positive _lifetime: " + str);
            return null;
        }
        String group = matcher.group(2);
        if (group.length() == 0) {
            return Long.valueOf(j);
        }
        char charAt = group.charAt(0);
        if (charAt != 'd') {
            if (charAt == 'h') {
                j3 = j * 1000 * 60;
            } else if (charAt == 'm') {
                j3 = j * 1000;
            } else if (charAt != 's') {
                C2504bh.m7246W("unknown units in _lifetime: " + str);
                return null;
            } else {
                j2 = j * 1000;
            }
            j2 = j3 * 60;
        } else {
            j2 = j * 1000 * 60 * 60 * 24;
        }
        return Long.valueOf(j2);
    }

    public static List<Object> listOf(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object add : objArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static Map<String, Object> mapOf(Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            if (!(objArr[i] instanceof String)) {
                throw new IllegalArgumentException("key is not a string: " + objArr[i]);
            }
            hashMap.put(objArr[i], objArr[i + 1]);
        }
        return hashMap;
    }

    /* renamed from: pv */
    private void m7121pv() {
        this.aqW.mo18601a(new C2453c.C2454a() {
            /* renamed from: h */
            public void mo18604h(List<C2451a> list) {
                for (C2451a next : list) {
                    DataLayer.this.m7110E(DataLayer.this.mo18594c(next.f4392KP, next.f4393wF));
                }
                DataLayer.this.aqX.countDown();
            }
        });
    }

    /* renamed from: pw */
    private void m7122pw() {
        int i = 0;
        do {
            Map poll = this.aqV.poll();
            if (poll != null) {
                m7115J(poll);
                i++;
            } else {
                return;
            }
        } while (i <= 500);
        this.aqV.clear();
        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18591a(C2452b bVar) {
        this.aqS.put(bVar, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18592a(Map<String, Object> map, Map<String, Object> map2) {
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj instanceof List) {
                if (!(map2.get(next) instanceof List)) {
                    map2.put(next, new ArrayList());
                }
                mo18593b((List) obj, (List) map2.get(next));
            } else if (obj instanceof Map) {
                if (!(map2.get(next) instanceof Map)) {
                    map2.put(next, new HashMap());
                }
                mo18592a((Map<String, Object>) (Map) obj, (Map<String, Object>) (Map) map2.get(next));
            } else {
                map2.put(next, obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18593b(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add((Object) null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                mo18593b((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                mo18592a((Map<String, Object>) (Map) obj, (Map<String, Object>) (Map) list2.get(i));
            } else if (obj != OBJECT_NOT_PRESENT) {
                list2.set(i, obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Map<String, Object> mo18594c(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        HashMap hashMap2 = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap3 = new HashMap();
            hashMap2.put(split[i], hashMap3);
            i++;
            hashMap2 = hashMap3;
        }
        hashMap2.put(split[split.length - 1], obj);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cx */
    public void mo18595cx(String str) {
        push(str, (Object) null);
        this.aqW.mo18603cz(str);
    }

    public Object get(String str) {
        synchronized (this.aqT) {
            Object obj = this.aqT;
            for (String str2 : str.split("\\.")) {
                if (!(obj instanceof Map)) {
                    return null;
                }
                obj = ((Map) obj).get(str2);
                if (obj == null) {
                    return null;
                }
            }
            return obj;
        }
    }

    public void push(String str, Object obj) {
        push(mo18594c(str, obj));
    }

    public void push(Map<String, Object> map) {
        try {
            this.aqX.await();
        } catch (InterruptedException e) {
            C2504bh.m7246W("DataLayer.push: unexpected InterruptedException");
        }
        m7110E(map);
    }

    public void pushEvent(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("event", str);
        push(hashMap);
    }

    public String toString() {
        String sb;
        synchronized (this.aqT) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry next : this.aqT.entrySet()) {
                sb2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{next.getKey(), next.getValue()}));
            }
            sb = sb2.toString();
        }
        return sb;
    }
}
