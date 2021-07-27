package com.google.android.gms.fitness;

import com.google.android.gms.common.Scopes;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.fitness.a */
public final class C0976a {
    /* renamed from: bt */
    public static String m1630bt(String str) {
        return str.equals(Scopes.FITNESS_ACTIVITY_READ) ? Scopes.FITNESS_ACTIVITY_READ_WRITE : str.equals(Scopes.FITNESS_LOCATION_READ) ? Scopes.FITNESS_LOCATION_READ_WRITE : str.equals(Scopes.FITNESS_BODY_READ) ? Scopes.FITNESS_BODY_READ_WRITE : str;
    }

    /* renamed from: e */
    public static String[] m1631e(List<String> list) {
        HashSet hashSet = new HashSet(list.size());
        for (String next : list) {
            String bt = m1630bt(next);
            if (bt.equals(next) || !list.contains(bt)) {
                hashSet.add(next);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }
}
