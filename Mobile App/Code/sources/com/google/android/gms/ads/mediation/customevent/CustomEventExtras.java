package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

@Deprecated
public final class CustomEventExtras implements NetworkExtras {

    /* renamed from: xy */
    private final HashMap<String, Object> f103xy = new HashMap<>();

    public Object getExtra(String str) {
        return this.f103xy.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.f103xy.put(str, obj);
    }
}
