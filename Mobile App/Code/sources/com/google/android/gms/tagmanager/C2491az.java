package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1308b;
import java.io.UnsupportedEncodingException;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.az */
class C2491az extends C2474aj {

    /* renamed from: ID */
    private static final String f4414ID = C1259a.JOINER.toString();
    private static final String arJ = C1308b.ITEM_SEPARATOR.toString();
    private static final String arK = C1308b.KEY_VALUE_SEPARATOR.toString();
    private static final String arL = C1308b.ESCAPE.toString();
    private static final String arp = C1308b.ARG0.toString();

    /* renamed from: com.google.android.gms.tagmanager.az$a */
    private enum C2493a {
        NONE,
        URL,
        BACKSLASH
    }

    public C2491az() {
        super(f4414ID, arp);
    }

    /* renamed from: a */
    private String m7223a(String str, C2493a aVar, Set<Character> set) {
        switch (aVar) {
            case URL:
                try {
                    return C2594dm.m7581dg(str);
                } catch (UnsupportedEncodingException e) {
                    C2504bh.m7247b("Joiner: unsupported encoding", e);
                    return str;
                }
            case BACKSLASH:
                String replace = str.replace("\\", "\\\\");
                for (Character ch : set) {
                    String ch2 = ch.toString();
                    replace = replace.replace(ch2, "\\" + ch2);
                }
                return replace;
            default:
                return str;
        }
    }

    /* renamed from: a */
    private void m7224a(StringBuilder sb, String str, C2493a aVar, Set<Character> set) {
        sb.append(m7223a(str, aVar, set));
    }

    /* renamed from: a */
    private void m7225a(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.C1408d.C1409a mo18635B(java.util.Map<java.lang.String, com.google.android.gms.internal.C1408d.C1409a> r10) {
        /*
            r9 = this;
            java.lang.String r0 = arp
            java.lang.Object r0 = r10.get(r0)
            com.google.android.gms.internal.d$a r0 = (com.google.android.gms.internal.C1408d.C1409a) r0
            if (r0 != 0) goto L_0x000f
            com.google.android.gms.internal.d$a r10 = com.google.android.gms.tagmanager.C2590di.m7548rb()
            return r10
        L_0x000f:
            java.lang.String r1 = arJ
            java.lang.Object r1 = r10.get(r1)
            com.google.android.gms.internal.d$a r1 = (com.google.android.gms.internal.C1408d.C1409a) r1
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = com.google.android.gms.tagmanager.C2590di.m7533j(r1)
            goto L_0x0020
        L_0x001e:
            java.lang.String r1 = ""
        L_0x0020:
            java.lang.String r2 = arK
            java.lang.Object r2 = r10.get(r2)
            com.google.android.gms.internal.d$a r2 = (com.google.android.gms.internal.C1408d.C1409a) r2
            if (r2 == 0) goto L_0x002f
            java.lang.String r2 = com.google.android.gms.tagmanager.C2590di.m7533j(r2)
            goto L_0x0031
        L_0x002f:
            java.lang.String r2 = "="
        L_0x0031:
            com.google.android.gms.tagmanager.az$a r3 = com.google.android.gms.tagmanager.C2491az.C2493a.NONE
            java.lang.String r4 = arL
            java.lang.Object r10 = r10.get(r4)
            com.google.android.gms.internal.d$a r10 = (com.google.android.gms.internal.C1408d.C1409a) r10
            r4 = 0
            if (r10 == 0) goto L_0x0085
            java.lang.String r10 = com.google.android.gms.tagmanager.C2590di.m7533j(r10)
            java.lang.String r3 = "url"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.tagmanager.az$a r3 = com.google.android.gms.tagmanager.C2491az.C2493a.URL
            goto L_0x0085
        L_0x004d:
            java.lang.String r3 = "backslash"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x006c
            com.google.android.gms.tagmanager.az$a r3 = com.google.android.gms.tagmanager.C2491az.C2493a.BACKSLASH
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r9.m7225a(r4, r1)
            r9.m7225a(r4, r2)
            r10 = 92
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r4.remove(r10)
            goto L_0x0085
        L_0x006c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Joiner: unsupported escape type: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.google.android.gms.tagmanager.C2504bh.m7243T(r10)
            com.google.android.gms.internal.d$a r10 = com.google.android.gms.tagmanager.C2590di.m7548rb()
            return r10
        L_0x0085:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r5 = r0.type
            r6 = 0
            switch(r5) {
                case 2: goto L_0x00be;
                case 3: goto L_0x0098;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.String r0 = com.google.android.gms.tagmanager.C2590di.m7533j(r0)
            r9.m7224a(r10, r0, r3, r4)
            goto L_0x00d8
        L_0x0098:
            com.google.android.gms.internal.d$a[] r5 = r0.f2861gx
            int r5 = r5.length
            if (r6 >= r5) goto L_0x00d8
            if (r6 <= 0) goto L_0x00a2
            r10.append(r1)
        L_0x00a2:
            com.google.android.gms.internal.d$a[] r5 = r0.f2861gx
            r5 = r5[r6]
            java.lang.String r5 = com.google.android.gms.tagmanager.C2590di.m7533j(r5)
            com.google.android.gms.internal.d$a[] r7 = r0.f2862gy
            r7 = r7[r6]
            java.lang.String r7 = com.google.android.gms.tagmanager.C2590di.m7533j(r7)
            r9.m7224a(r10, r5, r3, r4)
            r10.append(r2)
            r9.m7224a(r10, r7, r3, r4)
            int r6 = r6 + 1
            goto L_0x0098
        L_0x00be:
            com.google.android.gms.internal.d$a[] r0 = r0.f2860gw
            int r2 = r0.length
            r5 = 1
            r7 = r5
            r5 = r6
        L_0x00c4:
            if (r5 >= r2) goto L_0x00d8
            r8 = r0[r5]
            if (r7 != 0) goto L_0x00cd
            r10.append(r1)
        L_0x00cd:
            java.lang.String r7 = com.google.android.gms.tagmanager.C2590di.m7533j(r8)
            r9.m7224a(r10, r7, r3, r4)
            int r5 = r5 + 1
            r7 = r6
            goto L_0x00c4
        L_0x00d8:
            java.lang.String r10 = r10.toString()
            com.google.android.gms.internal.d$a r10 = com.google.android.gms.tagmanager.C2590di.m7551u(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C2491az.mo18635B(java.util.Map):com.google.android.gms.internal.d$a");
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return true;
    }
}
