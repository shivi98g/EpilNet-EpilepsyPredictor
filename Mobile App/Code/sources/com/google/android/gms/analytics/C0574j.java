package com.google.android.gms.analytics;

import com.google.android.gms.wallet.WalletConstants;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.analytics.j */
public class C0574j implements C0581o {

    /* renamed from: yo */
    private final Set<Integer> f271yo = new HashSet();

    C0574j() {
        this.f271yo.add(302);
        this.f271yo.add(Integer.valueOf(WalletConstants.ERROR_CODE_INVALID_PARAMETERS));
        this.f271yo.add(502);
    }

    /* renamed from: eb */
    public int mo10460eb() {
        return 2036;
    }

    /* renamed from: ec */
    public int mo10461ec() {
        return 8192;
    }

    /* renamed from: ed */
    public int mo10462ed() {
        return 8192;
    }

    /* renamed from: ee */
    public int mo10463ee() {
        return 20;
    }

    /* renamed from: ef */
    public long mo10464ef() {
        return 3600;
    }

    /* renamed from: eg */
    public String mo10465eg() {
        return "/collect";
    }

    /* renamed from: eh */
    public String mo10466eh() {
        return "/batch";
    }

    /* renamed from: ei */
    public C0573i mo10467ei() {
        return C0573i.BATCH_BY_SESSION;
    }

    /* renamed from: ej */
    public C0577l mo10468ej() {
        return C0577l.GZIP;
    }

    /* renamed from: ek */
    public Set<Integer> mo10469ek() {
        return this.f271yo;
    }
}
