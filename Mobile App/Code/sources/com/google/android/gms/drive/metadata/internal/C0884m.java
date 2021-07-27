package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.android.gms.drive.metadata.internal.m */
public class C0884m extends C0881j<UserMetadata> {
    public C0884m(String str, int i) {
        super(str, m1317bp(str), Collections.emptyList(), i);
    }

    /* renamed from: bo */
    private String m1316bo(String str) {
        return m1318q(getName(), str);
    }

    /* renamed from: bp */
    private static Collection<String> m1317bp(String str) {
        return Arrays.asList(new String[]{m1318q(str, "permissionId"), m1318q(str, "displayName"), m1318q(str, "picture"), m1318q(str, "isAuthenticatedUser"), m1318q(str, "emailAddress")});
    }

    /* renamed from: q */
    private static String m1318q(String str, String str2) {
        return str + "." + str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo11759b(DataHolder dataHolder, int i, int i2) {
        return !dataHolder.mo11065h(m1316bo("permissionId"), i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public UserMetadata mo11760c(DataHolder dataHolder, int i, int i2) {
        String c = dataHolder.mo11049c(m1316bo("permissionId"), i, i2);
        if (c == null) {
            return null;
        }
        String c2 = dataHolder.mo11049c(m1316bo("displayName"), i, i2);
        String c3 = dataHolder.mo11049c(m1316bo("picture"), i, i2);
        Boolean valueOf = Boolean.valueOf(dataHolder.mo11051d(m1316bo("isAuthenticatedUser"), i, i2));
        return new UserMetadata(c, c2, c3, valueOf.booleanValue(), dataHolder.mo11049c(m1316bo("emailAddress"), i, i2));
    }
}
