package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@C1507ey
/* renamed from: com.google.android.gms.internal.bg */
public final class C1323bg {
    public static final String DEVICE_ID_EMULATOR = C1606gq.m4696R("emulator");

    /* renamed from: d */
    private final Date f2619d;

    /* renamed from: f */
    private final Set<String> f2620f;

    /* renamed from: h */
    private final Location f2621h;

    /* renamed from: oA */
    private final String f2622oA;

    /* renamed from: oB */
    private final SearchAdRequest f2623oB;

    /* renamed from: oC */
    private final int f2624oC;

    /* renamed from: oD */
    private final Set<String> f2625oD;

    /* renamed from: ov */
    private final String f2626ov;

    /* renamed from: ow */
    private final int f2627ow;

    /* renamed from: ox */
    private final boolean f2628ox;

    /* renamed from: oy */
    private final Bundle f2629oy;

    /* renamed from: oz */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f2630oz;

    /* renamed from: com.google.android.gms.internal.bg$a */
    public static final class C1324a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Date f2631d;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Location f2632h;
        /* access modifiers changed from: private */

        /* renamed from: oA */
        public String f2633oA;
        /* access modifiers changed from: private */

        /* renamed from: oC */
        public int f2634oC = -1;
        /* access modifiers changed from: private */

        /* renamed from: oE */
        public final HashSet<String> f2635oE = new HashSet<>();
        /* access modifiers changed from: private */

        /* renamed from: oF */
        public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f2636oF = new HashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: oG */
        public final HashSet<String> f2637oG = new HashSet<>();
        /* access modifiers changed from: private */

        /* renamed from: ov */
        public String f2638ov;
        /* access modifiers changed from: private */

        /* renamed from: ow */
        public int f2639ow = -1;
        /* access modifiers changed from: private */

        /* renamed from: ox */
        public boolean f2640ox = false;
        /* access modifiers changed from: private */

        /* renamed from: oy */
        public final Bundle f2641oy = new Bundle();

        /* renamed from: a */
        public void mo14876a(Location location) {
            this.f2632h = location;
        }

        @Deprecated
        /* renamed from: a */
        public void mo14877a(NetworkExtras networkExtras) {
            if (networkExtras instanceof AdMobExtras) {
                mo14878a(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
            } else {
                this.f2636oF.put(networkExtras.getClass(), networkExtras);
            }
        }

        /* renamed from: a */
        public void mo14878a(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f2641oy.putBundle(cls.getName(), bundle);
        }

        /* renamed from: a */
        public void mo14879a(Date date) {
            this.f2631d = date;
        }

        /* renamed from: b */
        public void mo14880b(Class<? extends CustomEvent> cls, Bundle bundle) {
            if (this.f2641oy.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
                this.f2641oy.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            this.f2641oy.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
        }

        /* renamed from: h */
        public void mo14881h(int i) {
            this.f2639ow = i;
        }

        /* renamed from: i */
        public void mo14882i(boolean z) {
            this.f2640ox = z;
        }

        /* renamed from: j */
        public void mo14883j(boolean z) {
            this.f2634oC = z ? 1 : 0;
        }

        /* renamed from: r */
        public void mo14884r(String str) {
            this.f2635oE.add(str);
        }

        /* renamed from: s */
        public void mo14885s(String str) {
            this.f2637oG.add(str);
        }

        /* renamed from: t */
        public void mo14886t(String str) {
            this.f2638ov = str;
        }

        /* renamed from: u */
        public void mo14887u(String str) {
            this.f2633oA = str;
        }
    }

    public C1323bg(C1324a aVar) {
        this(aVar, (SearchAdRequest) null);
    }

    public C1323bg(C1324a aVar, SearchAdRequest searchAdRequest) {
        this.f2619d = aVar.f2631d;
        this.f2626ov = aVar.f2638ov;
        this.f2627ow = aVar.f2639ow;
        this.f2620f = Collections.unmodifiableSet(aVar.f2635oE);
        this.f2621h = aVar.f2632h;
        this.f2628ox = aVar.f2640ox;
        this.f2629oy = aVar.f2641oy;
        this.f2630oz = Collections.unmodifiableMap(aVar.f2636oF);
        this.f2622oA = aVar.f2633oA;
        this.f2623oB = searchAdRequest;
        this.f2624oC = aVar.f2634oC;
        this.f2625oD = Collections.unmodifiableSet(aVar.f2637oG);
    }

    /* renamed from: bi */
    public SearchAdRequest mo14861bi() {
        return this.f2623oB;
    }

    /* renamed from: bj */
    public Map<Class<? extends NetworkExtras>, NetworkExtras> mo14862bj() {
        return this.f2630oz;
    }

    /* renamed from: bk */
    public Bundle mo14863bk() {
        return this.f2629oy;
    }

    /* renamed from: bl */
    public int mo14864bl() {
        return this.f2624oC;
    }

    public Date getBirthday() {
        return this.f2619d;
    }

    public String getContentUrl() {
        return this.f2626ov;
    }

    public Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f2629oy.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getClass().getName());
        }
        return null;
    }

    public int getGender() {
        return this.f2627ow;
    }

    public Set<String> getKeywords() {
        return this.f2620f;
    }

    public Location getLocation() {
        return this.f2621h;
    }

    public boolean getManualImpressionsEnabled() {
        return this.f2628ox;
    }

    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (NetworkExtras) this.f2630oz.get(cls);
    }

    public Bundle getNetworkExtrasBundle(Class<? extends MediationAdapter> cls) {
        return this.f2629oy.getBundle(cls.getName());
    }

    public String getPublisherProvidedId() {
        return this.f2622oA;
    }

    public boolean isTestDevice(Context context) {
        return this.f2625oD.contains(C1606gq.m4704v(context));
    }
}
