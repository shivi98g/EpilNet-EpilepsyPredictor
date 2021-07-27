package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.internal.C1781jv;
import com.google.android.gms.internal.C1785jx;
import java.util.HashMap;

public final class ScoreSubmissionData {
    private static final String[] adl = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};

    /* renamed from: Iv */
    private int f2121Iv;

    /* renamed from: Xh */
    private String f2122Xh;
    private HashMap<Integer, Result> adR = new HashMap<>();
    private String adn;

    public static final class Result {
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public Result(long j, String str, String str2, boolean z) {
            this.rawScore = j;
            this.formattedScore = str;
            this.scoreTag = str2;
            this.newBest = z;
        }

        public String toString() {
            return C1781jv.m5348h(this).mo15935a("RawScore", Long.valueOf(this.rawScore)).mo15935a("FormattedScore", this.formattedScore).mo15935a("ScoreTag", this.scoreTag).mo15935a("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    public ScoreSubmissionData(DataHolder dataHolder) {
        this.f2121Iv = dataHolder.getStatusCode();
        int count = dataHolder.getCount();
        C1785jx.m5354L(count == 3);
        for (int i = 0; i < count; i++) {
            int au = dataHolder.mo11047au(i);
            if (i == 0) {
                this.adn = dataHolder.mo11049c("leaderboardId", i, au);
                this.f2122Xh = dataHolder.mo11049c("playerId", i, au);
            }
            if (dataHolder.mo11051d("hasResult", i, au)) {
                m3698a(new Result(dataHolder.mo11044a("rawScore", i, au), dataHolder.mo11049c("formattedScore", i, au), dataHolder.mo11049c("scoreTag", i, au), dataHolder.mo11051d("newBest", i, au)), dataHolder.mo11048b("timeSpan", i, au));
            }
        }
    }

    /* renamed from: a */
    private void m3698a(Result result, int i) {
        this.adR.put(Integer.valueOf(i), result);
    }

    public String getLeaderboardId() {
        return this.adn;
    }

    public String getPlayerId() {
        return this.f2122Xh;
    }

    public Result getScoreResult(int i) {
        return this.adR.get(Integer.valueOf(i));
    }

    public String toString() {
        C1781jv.C1783a a = C1781jv.m5348h(this).mo15935a("PlayerId", this.f2122Xh).mo15935a("StatusCode", Integer.valueOf(this.f2121Iv));
        for (int i = 0; i < 3; i++) {
            Result result = this.adR.get(Integer.valueOf(i));
            a.mo15935a("TimesSpan", TimeSpan.m3547dZ(i));
            a.mo15935a("Result", result == null ? "null" : result.toString());
        }
        return a.toString();
    }
}
