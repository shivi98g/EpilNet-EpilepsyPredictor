package com.google.android.gms.games.internal.constants;

public final class LeaderboardCollection {
    private LeaderboardCollection() {
    }

    /* renamed from: dZ */
    public static String m3544dZ(int i) {
        switch (i) {
            case 0:
                return "PUBLIC";
            case 1:
                return "SOCIAL";
            default:
                throw new IllegalArgumentException("Unknown leaderboard collection: " + i);
        }
    }
}
