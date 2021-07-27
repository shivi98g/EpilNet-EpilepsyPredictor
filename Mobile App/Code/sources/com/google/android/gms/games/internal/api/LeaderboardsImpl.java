package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

public final class LeaderboardsImpl implements Leaderboards {

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl$10 */
    class C113710 extends LoadScoresImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2025ZW;

        /* renamed from: ZZ */
        final /* synthetic */ String f2026ZZ;
        final /* synthetic */ String aaF;
        final /* synthetic */ int aaG;
        final /* synthetic */ int aaH;
        final /* synthetic */ int aaI;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13420a((BaseImplementation.C0670b<Leaderboards.LoadScoresResult>) this, this.f2026ZZ, this.aaF, this.aaG, this.aaH, this.aaI, this.f2025ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl$11 */
    class C113811 extends LoadScoresImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2027ZW;

        /* renamed from: ZZ */
        final /* synthetic */ String f2028ZZ;
        final /* synthetic */ String aaF;
        final /* synthetic */ int aaG;
        final /* synthetic */ int aaH;
        final /* synthetic */ int aaI;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13450b(this, this.f2028ZZ, this.aaF, this.aaG, this.aaH, this.aaI, this.f2027ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl$8 */
    class C11458 extends LoadMetadataImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2032ZW;

        /* renamed from: ZZ */
        final /* synthetic */ String f2033ZZ;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13480d((BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult>) this, this.f2033ZZ, this.f2032ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.LeaderboardsImpl$9 */
    class C11469 extends LoadMetadataImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2034ZW;

        /* renamed from: ZZ */
        final /* synthetic */ String f2035ZZ;
        final /* synthetic */ String aaF;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13423a((BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult>) this, this.f2035ZZ, this.aaF, this.f2034ZW);
        }
    }

    private static abstract class LoadMetadataImpl extends Games.BaseGamesApiMethodImpl<Leaderboards.LeaderboardMetadataResult> {
        private LoadMetadataImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: U */
        public Leaderboards.LeaderboardMetadataResult mo10544c(final Status status) {
            return new Leaderboards.LeaderboardMetadataResult() {
                public LeaderboardBuffer getLeaderboards() {
                    return new LeaderboardBuffer(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class LoadPlayerScoreImpl extends Games.BaseGamesApiMethodImpl<Leaderboards.LoadPlayerScoreResult> {
        private LoadPlayerScoreImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: V */
        public Leaderboards.LoadPlayerScoreResult mo10544c(final Status status) {
            return new Leaderboards.LoadPlayerScoreResult() {
                public LeaderboardScore getScore() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadScoresImpl extends Games.BaseGamesApiMethodImpl<Leaderboards.LoadScoresResult> {
        private LoadScoresImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: W */
        public Leaderboards.LoadScoresResult mo10544c(final Status status) {
            return new Leaderboards.LoadScoresResult() {
                public Leaderboard getLeaderboard() {
                    return null;
                }

                public LeaderboardScoreBuffer getScores() {
                    return new LeaderboardScoreBuffer(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    protected static abstract class SubmitScoreImpl extends Games.BaseGamesApiMethodImpl<Leaderboards.SubmitScoreResult> {
        protected SubmitScoreImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: X */
        public Leaderboards.SubmitScoreResult mo10544c(final Status status) {
            return new Leaderboards.SubmitScoreResult() {
                public ScoreSubmissionData getScoreData() {
                    return new ScoreSubmissionData(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public Intent getAllLeaderboardsIntent(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13515ll();
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleApiClient, String str) {
        return getLeaderboardIntent(googleApiClient, str, -1);
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleApiClient, String str, int i) {
        return Games.m2046d(googleApiClient).mo13531n(str, i);
    }

    public PendingResult<Leaderboards.LoadPlayerScoreResult> loadCurrentPlayerLeaderboardScore(GoogleApiClient googleApiClient, String str, int i, int i2) {
        final String str2 = str;
        final int i3 = i;
        final int i4 = i2;
        return googleApiClient.mo10938a(new LoadPlayerScoreImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13418a((BaseImplementation.C0670b<Leaderboards.LoadPlayerScoreResult>) this, (String) null, str2, i3, i4);
            }
        });
    }

    public PendingResult<Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient googleApiClient, final String str, final boolean z) {
        return googleApiClient.mo10938a(new LoadMetadataImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13453b((BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult>) this, str, z);
            }
        });
    }

    public PendingResult<Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.mo10938a(new LoadMetadataImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13454b((BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult>) this, z);
            }
        });
    }

    public PendingResult<Leaderboards.LoadScoresResult> loadMoreScores(GoogleApiClient googleApiClient, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        final LeaderboardScoreBuffer leaderboardScoreBuffer2 = leaderboardScoreBuffer;
        final int i3 = i;
        final int i4 = i2;
        return googleApiClient.mo10938a(new LoadScoresImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13407a((BaseImplementation.C0670b<Leaderboards.LoadScoresResult>) this, leaderboardScoreBuffer2, i3, i4);
            }
        });
    }

    public PendingResult<Leaderboards.LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3) {
        return loadPlayerCenteredScores(googleApiClient, str, i, i2, i3, false);
    }

    public PendingResult<Leaderboards.LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3, boolean z) {
        final String str2 = str;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final boolean z2 = z;
        return googleApiClient.mo10938a(new LoadScoresImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13447b((BaseImplementation.C0670b<Leaderboards.LoadScoresResult>) this, str2, i4, i5, i6, z2);
            }
        });
    }

    public PendingResult<Leaderboards.LoadScoresResult> loadTopScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3) {
        return loadTopScores(googleApiClient, str, i, i2, i3, false);
    }

    public PendingResult<Leaderboards.LoadScoresResult> loadTopScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3, boolean z) {
        final String str2 = str;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final boolean z2 = z;
        return googleApiClient.mo10938a(new LoadScoresImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13412a((BaseImplementation.C0670b<Leaderboards.LoadScoresResult>) this, str2, i4, i5, i6, z2);
            }
        });
    }

    public void submitScore(GoogleApiClient googleApiClient, String str, long j) {
        submitScore(googleApiClient, str, j, (String) null);
    }

    public void submitScore(GoogleApiClient googleApiClient, String str, long j, String str2) {
        Games.m2046d(googleApiClient).mo13416a((BaseImplementation.C0670b<Leaderboards.SubmitScoreResult>) null, str, j, str2);
    }

    public PendingResult<Leaderboards.SubmitScoreResult> submitScoreImmediate(GoogleApiClient googleApiClient, String str, long j) {
        return submitScoreImmediate(googleApiClient, str, j, (String) null);
    }

    public PendingResult<Leaderboards.SubmitScoreResult> submitScoreImmediate(GoogleApiClient googleApiClient, String str, long j, String str2) {
        final String str3 = str;
        final long j2 = j;
        final String str4 = str2;
        return googleApiClient.mo10940b(new SubmitScoreImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13416a((BaseImplementation.C0670b<Leaderboards.SubmitScoreResult>) this, str3, j2, str4);
            }
        });
    }
}
