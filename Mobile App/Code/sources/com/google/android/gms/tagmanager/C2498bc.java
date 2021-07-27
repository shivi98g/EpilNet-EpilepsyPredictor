package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.C1259a;
import com.google.android.gms.internal.C1408d;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.bc */
class C2498bc extends C2474aj {

    /* renamed from: ID */
    private static final String f4416ID = C1259a.LANGUAGE.toString();

    public C2498bc() {
        super(f4416ID, new String[0]);
    }

    /* renamed from: B */
    public C1408d.C1409a mo18635B(Map<String, C1408d.C1409a> map) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return C2590di.m7548rb();
        }
        String language = locale.getLanguage();
        return language == null ? C2590di.m7548rb() : C2590di.m7551u(language.toLowerCase());
    }

    /* renamed from: pe */
    public boolean mo18636pe() {
        return false;
    }
}
