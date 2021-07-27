package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@C1507ey
/* renamed from: com.google.android.gms.internal.ax */
public class C1305ax {

    /* renamed from: oo */
    public static final C1305ax f2396oo = new C1305ax();

    private C1305ax() {
    }

    /* renamed from: bg */
    public static C1305ax m3946bg() {
        return f2396oo;
    }

    /* renamed from: a */
    public C1303av mo14820a(Context context, C1323bg bgVar) {
        List list;
        Context context2;
        C1323bg bgVar2 = bgVar;
        Date birthday = bgVar.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1;
        String contentUrl = bgVar.getContentUrl();
        int gender = bgVar.getGender();
        Set<String> keywords = bgVar.getKeywords();
        if (!keywords.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean isTestDevice = bgVar2.isTestDevice(context2);
        int bl = bgVar.mo14864bl();
        Location location = bgVar.getLocation();
        Bundle networkExtrasBundle = bgVar2.getNetworkExtrasBundle(AdMobAdapter.class);
        boolean manualImpressionsEnabled = bgVar.getManualImpressionsEnabled();
        String publisherProvidedId = bgVar.getPublisherProvidedId();
        SearchAdRequest bi = bgVar.mo14861bi();
        return new C1303av(4, time, networkExtrasBundle, gender, list, isTestDevice, bl, manualImpressionsEnabled, publisherProvidedId, bi != null ? new C1327bj(bi) : null, location, contentUrl, bgVar.mo14863bk());
    }
}
