package com.google.android.gms.internal;

import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.fitness.data.DataSource;

/* renamed from: com.google.android.gms.internal.mg */
public class C1895mg {

    /* renamed from: UV */
    private static final ThreadLocal<String> f4060UV = new ThreadLocal<>();

    /* renamed from: bw */
    public static String m5643bw(String str) {
        return m5646r(str, f4060UV.get());
    }

    /* renamed from: c */
    public static DataSource m5644c(DataSource dataSource) {
        if (!dataSource.mo12313jz()) {
            return dataSource;
        }
        return (m5645jN() || f4060UV.get().equals(dataSource.getAppPackageName())) ? dataSource : dataSource.mo12311jA();
    }

    /* renamed from: jN */
    public static boolean m5645jN() {
        String str = f4060UV.get();
        return str == null || str.startsWith(GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE);
    }

    /* renamed from: r */
    private static String m5646r(String str, String str2) {
        if (str == null || str2 == null) {
            return str;
        }
        byte[] bArr = new byte[(str.length() + str2.length())];
        System.arraycopy(str.getBytes(), 0, bArr, 0, str.length());
        System.arraycopy(str2.getBytes(), 0, bArr, str.length(), str2.length());
        return Integer.toHexString(C1839lk.m5536a(bArr, 0, bArr.length, 0));
    }
}
