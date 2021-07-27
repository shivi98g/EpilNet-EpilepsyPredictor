package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class RequestType {
    private RequestType() {
    }

    /* renamed from: dZ */
    public static String m3546dZ(int i) {
        switch (i) {
            case 1:
                return "GIFT";
            case 2:
                return "WISH";
            default:
                GamesLog.m2570p("RequestType", "Unknown request type: " + i);
                return "UNKNOWN_TYPE";
        }
    }
}
