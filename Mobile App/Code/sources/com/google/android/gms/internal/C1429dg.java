package com.google.android.gms.internal;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.C0534a;
import java.util.Date;
import java.util.HashSet;

@C1507ey
/* renamed from: com.google.android.gms.internal.dg */
public final class C1429dg {

    /* renamed from: com.google.android.gms.internal.dg$1 */
    static /* synthetic */ class C14301 {

        /* renamed from: rb */
        static final /* synthetic */ int[] f2889rb = new int[AdRequest.Gender.values().length];

        static {
            f2890rc = new int[AdRequest.ErrorCode.values().length];
            try {
                f2890rc[AdRequest.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2890rc[AdRequest.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f2890rc[AdRequest.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f2890rc[AdRequest.ErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f2889rb[AdRequest.Gender.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f2889rb[AdRequest.Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f2889rb[AdRequest.Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* renamed from: a */
    public static int m4245a(AdRequest.ErrorCode errorCode) {
        switch (errorCode) {
            case INVALID_REQUEST:
                return 1;
            case NETWORK_ERROR:
                return 2;
            case NO_FILL:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static AdSize m4246b(C1306ay ayVar) {
        AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
        for (int i = 0; i < adSizeArr.length; i++) {
            if (adSizeArr[i].getWidth() == ayVar.width && adSizeArr[i].getHeight() == ayVar.height) {
                return adSizeArr[i];
            }
        }
        return new AdSize(C0534a.m22a(ayVar.width, ayVar.height, ayVar.f2397op));
    }

    /* renamed from: d */
    public static MediationAdRequest m4247d(C1303av avVar) {
        return new MediationAdRequest(new Date(avVar.f2385od), m4248l(avVar.f2386oe), avVar.f2387of != null ? new HashSet(avVar.f2387of) : null, avVar.f2388og, avVar.f2393ol);
    }

    /* renamed from: l */
    public static AdRequest.Gender m4248l(int i) {
        switch (i) {
            case 1:
                return AdRequest.Gender.MALE;
            case 2:
                return AdRequest.Gender.FEMALE;
            default:
                return AdRequest.Gender.UNKNOWN;
        }
    }
}
