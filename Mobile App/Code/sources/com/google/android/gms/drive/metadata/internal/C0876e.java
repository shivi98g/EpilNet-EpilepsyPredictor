package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.C1842ln;
import com.google.android.gms.internal.C1853lp;
import com.google.android.gms.internal.C1860lr;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.drive.metadata.internal.e */
public final class C0876e {

    /* renamed from: Rh */
    private static Map<String, MetadataField<?>> f1153Rh = new HashMap();

    static {
        m1277b(C1842ln.f4023Rj);
        m1277b(C1842ln.f4016RJ);
        m1277b(C1842ln.f4007RA);
        m1277b(C1842ln.f4014RH);
        m1277b(C1842ln.f4017RK);
        m1277b(C1842ln.f4034Ru);
        m1277b(C1842ln.f4035Rv);
        m1277b(C1842ln.f4032Rs);
        m1277b(C1842ln.f4037Rx);
        m1277b(C1842ln.f4012RF);
        m1277b(C1842ln.f4024Rk);
        m1277b(C1842ln.f4009RC);
        m1277b(C1842ln.f4026Rm);
        m1277b(C1842ln.f4033Rt);
        m1277b(C1842ln.f4027Rn);
        m1277b(C1842ln.f4028Ro);
        m1277b(C1842ln.f4029Rp);
        m1277b(C1842ln.f4039Rz);
        m1277b(C1842ln.f4036Rw);
        m1277b(C1842ln.f4008RB);
        m1277b(C1842ln.f4010RD);
        m1277b(C1842ln.f4011RE);
        m1277b(C1842ln.f4013RG);
        m1277b(C1842ln.f4018RL);
        m1277b(C1842ln.f4019RM);
        m1277b(C1842ln.f4031Rr);
        m1277b(C1842ln.f4030Rq);
        m1277b(C1842ln.f4015RI);
        m1277b(C1842ln.f4038Ry);
        m1277b(C1842ln.f4025Rl);
        m1277b(C1842ln.f4020RN);
        m1277b(C1842ln.f4021RO);
        m1277b(C1842ln.f4022RP);
        m1277b(C1853lp.f4040RQ);
        m1277b(C1853lp.f4042RS);
        m1277b(C1853lp.f4043RT);
        m1277b(C1853lp.f4044RU);
        m1277b(C1853lp.f4041RR);
        m1277b(C1860lr.f4046RW);
        m1277b(C1860lr.f4047RX);
    }

    /* renamed from: b */
    private static void m1277b(MetadataField<?> metadataField) {
        if (f1153Rh.containsKey(metadataField.getName())) {
            throw new IllegalArgumentException("Duplicate field name registered: " + metadataField.getName());
        }
        f1153Rh.put(metadataField.getName(), metadataField);
    }

    /* renamed from: bm */
    public static MetadataField<?> m1278bm(String str) {
        return f1153Rh.get(str);
    }

    /* renamed from: iY */
    public static Collection<MetadataField<?>> m1279iY() {
        return Collections.unmodifiableCollection(f1153Rh.values());
    }
}
