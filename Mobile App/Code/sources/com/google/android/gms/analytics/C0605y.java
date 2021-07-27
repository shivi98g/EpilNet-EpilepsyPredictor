package com.google.android.gms.analytics;

import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.analytics.y */
class C0605y {

    /* renamed from: zV */
    private static final C0605y f348zV = new C0605y();

    /* renamed from: zS */
    private SortedSet<C0606a> f349zS = new TreeSet();

    /* renamed from: zT */
    private StringBuilder f350zT = new StringBuilder();

    /* renamed from: zU */
    private boolean f351zU = false;

    /* renamed from: com.google.android.gms.analytics.y$a */
    public enum C0606a {
        MAP_BUILDER_SET,
        MAP_BUILDER_SET_ALL,
        MAP_BUILDER_GET,
        MAP_BUILDER_SET_CAMPAIGN_PARAMS,
        BLANK_04,
        BLANK_05,
        BLANK_06,
        BLANK_07,
        BLANK_08,
        GET,
        SET,
        SEND,
        BLANK_12,
        BLANK_13,
        BLANK_14,
        BLANK_15,
        BLANK_16,
        BLANK_17,
        BLANK_18,
        BLANK_19,
        BLANK_20,
        BLANK_21,
        BLANK_22,
        BLANK_23,
        BLANK_24,
        BLANK_25,
        BLANK_26,
        BLANK_27,
        BLANK_28,
        BLANK_29,
        SET_EXCEPTION_PARSER,
        GET_EXCEPTION_PARSER,
        CONSTRUCT_TRANSACTION,
        CONSTRUCT_EXCEPTION,
        CONSTRUCT_RAW_EXCEPTION,
        CONSTRUCT_TIMING,
        CONSTRUCT_SOCIAL,
        BLANK_37,
        BLANK_38,
        GET_TRACKER,
        GET_DEFAULT_TRACKER,
        SET_DEFAULT_TRACKER,
        SET_APP_OPT_OUT,
        GET_APP_OPT_OUT,
        DISPATCH,
        SET_DISPATCH_PERIOD,
        BLANK_46,
        REPORT_UNCAUGHT_EXCEPTIONS,
        SET_AUTO_ACTIVITY_TRACKING,
        SET_SESSION_TIMEOUT,
        CONSTRUCT_EVENT,
        CONSTRUCT_ITEM,
        BLANK_52,
        BLANK_53,
        SET_DRY_RUN,
        GET_DRY_RUN,
        SET_LOGGER,
        SET_FORCE_LOCAL_DISPATCH,
        GET_TRACKER_NAME,
        CLOSE_TRACKER,
        EASY_TRACKER_ACTIVITY_START,
        EASY_TRACKER_ACTIVITY_STOP,
        CONSTRUCT_APP_VIEW
    }

    private C0605y() {
    }

    /* renamed from: eK */
    public static C0605y m324eK() {
        return f348zV;
    }

    /* renamed from: D */
    public synchronized void mo10498D(boolean z) {
        this.f351zU = z;
    }

    /* renamed from: a */
    public synchronized void mo10499a(C0606a aVar) {
        if (!this.f351zU) {
            this.f349zS.add(aVar);
            this.f350zT.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(aVar.ordinal()));
        }
    }

    /* renamed from: eL */
    public synchronized String mo10500eL() {
        StringBuilder sb;
        sb = new StringBuilder();
        int i = 0;
        int i2 = 6;
        while (this.f349zS.size() > 0) {
            C0606a first = this.f349zS.first();
            this.f349zS.remove(first);
            int ordinal = first.ordinal();
            while (ordinal >= i2) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i));
                i2 += 6;
                i = 0;
            }
            i += 1 << (first.ordinal() % 6);
        }
        if (i > 0 || sb.length() == 0) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i));
        }
        this.f349zS.clear();
        return sb.toString();
    }

    /* renamed from: eM */
    public synchronized String mo10501eM() {
        String sb;
        if (this.f350zT.length() > 0) {
            this.f350zT.insert(0, ".");
        }
        sb = this.f350zT.toString();
        this.f350zT = new StringBuilder();
        return sb;
    }
}
