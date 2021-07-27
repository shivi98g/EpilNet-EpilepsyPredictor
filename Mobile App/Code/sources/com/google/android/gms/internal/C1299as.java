package com.google.android.gms.internal;

import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.as */
public class C1299as {

    /* renamed from: com.google.android.gms.internal.as$a */
    public static class C1300a {

        /* renamed from: oa */
        final String f2382oa;
        final long value;

        C1300a(long j, String str) {
            this.value = j;
            this.f2382oa = str;
        }

        public boolean equals(Object obj) {
            return obj != null && (obj instanceof C1300a) && ((C1300a) obj).value == this.value;
        }

        public int hashCode() {
            return (int) this.value;
        }
    }

    /* renamed from: a */
    static long m3933a(int i, int i2, long j, long j2, long j3) {
        return ((((((j + 1073807359) - ((j2 * ((((long) i) + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * j3) % 1073807359) + ((((long) i2) + 2147483647L) % 1073807359)) % 1073807359;
    }

    /* renamed from: a */
    static long m3934a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? m3934a((j * j) % 1073807359, i / 2) : j * (m3934a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    /* renamed from: a */
    static String m3935a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            C1607gr.m4706T("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                stringBuffer.append(strArr[i]);
                stringBuffer.append(' ');
                i++;
            } else {
                stringBuffer.append(strArr[i4]);
                return stringBuffer.toString();
            }
        }
    }

    /* renamed from: a */
    static void m3936a(int i, long j, String str, PriorityQueue<C1300a> priorityQueue) {
        C1300a aVar = new C1300a(j, str);
        if ((priorityQueue.size() != i || priorityQueue.peek().value <= aVar.value) && !priorityQueue.contains(aVar)) {
            priorityQueue.add(aVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: a */
    public static void m3937a(String[] strArr, int i, int i2, PriorityQueue<C1300a> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i;
        int i4 = i2;
        PriorityQueue<C1300a> priorityQueue2 = priorityQueue;
        long b = m3938b(strArr2, 0, i4);
        m3936a(i3, b, m3935a(strArr2, 0, i4), priorityQueue2);
        long a = m3934a(16785407, i4 - 1);
        long j = b;
        for (int i5 = 1; i5 < (strArr2.length - i4) + 1; i5++) {
            j = m3933a(C1297aq.m3928o(strArr2[i5 - 1]), C1297aq.m3928o(strArr2[(i5 + i4) - 1]), j, a, 16785407);
            m3936a(i3, j, m3935a(strArr2, i5, i4), priorityQueue2);
        }
    }

    /* renamed from: b */
    private static long m3938b(String[] strArr, int i, int i2) {
        long o = (((long) C1297aq.m3928o(strArr[i])) + 2147483647L) % 1073807359;
        for (int i3 = i + 1; i3 < i + i2; i3++) {
            o = (((o * 16785407) % 1073807359) + ((((long) C1297aq.m3928o(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return o;
    }
}
