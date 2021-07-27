package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl implements Achievements {

    /* renamed from: com.google.android.gms.games.internal.api.AchievementsImpl$10 */
    class C108810 extends LoadImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f1981ZW;

        /* renamed from: ZY */
        final /* synthetic */ String f1982ZY;

        /* renamed from: ZZ */
        final /* synthetic */ String f1983ZZ;

        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13452b((BaseImplementation.C0670b<Achievements.LoadAchievementsResult>) this, this.f1982ZY, this.f1983ZZ, this.f1981ZW);
        }
    }

    private static abstract class LoadImpl extends Games.BaseGamesApiMethodImpl<Achievements.LoadAchievementsResult> {
        private LoadImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: I */
        public Achievements.LoadAchievementsResult mo10544c(final Status status) {
            return new Achievements.LoadAchievementsResult() {
                public AchievementBuffer getAchievements() {
                    return new AchievementBuffer(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class UpdateImpl extends Games.BaseGamesApiMethodImpl<Achievements.UpdateAchievementResult> {
        /* access modifiers changed from: private */

        /* renamed from: CE */
        public final String f1993CE;

        public UpdateImpl(String str, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.f1993CE = str;
        }

        /* renamed from: J */
        public Achievements.UpdateAchievementResult mo10544c(final Status status) {
            return new Achievements.UpdateAchievementResult() {
                public String getAchievementId() {
                    return UpdateImpl.this.f1993CE;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    public Intent getAchievementsIntent(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13516lm();
    }

    public void increment(GoogleApiClient googleApiClient, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        googleApiClient.mo10940b(new UpdateImpl(str, googleApiClient) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13411a((BaseImplementation.C0670b<Achievements.UpdateAchievementResult>) null, str2, i2);
            }
        });
    }

    public PendingResult<Achievements.UpdateAchievementResult> incrementImmediate(GoogleApiClient googleApiClient, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        return googleApiClient.mo10940b(new UpdateImpl(str, googleApiClient) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13411a((BaseImplementation.C0670b<Achievements.UpdateAchievementResult>) this, str2, i2);
            }
        });
    }

    public PendingResult<Achievements.LoadAchievementsResult> load(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.mo10938a(new LoadImpl(googleApiClient) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13470c((BaseImplementation.C0670b<Achievements.LoadAchievementsResult>) this, z);
            }
        });
    }

    public void reveal(GoogleApiClient googleApiClient, final String str) {
        googleApiClient.mo10940b(new UpdateImpl(googleApiClient, str) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13410a((BaseImplementation.C0670b<Achievements.UpdateAchievementResult>) null, str);
            }
        });
    }

    public PendingResult<Achievements.UpdateAchievementResult> revealImmediate(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new UpdateImpl(googleApiClient, str) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13410a((BaseImplementation.C0670b<Achievements.UpdateAchievementResult>) this, str);
            }
        });
    }

    public void setSteps(GoogleApiClient googleApiClient, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        googleApiClient.mo10940b(new UpdateImpl(str, googleApiClient) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13446b((BaseImplementation.C0670b<Achievements.UpdateAchievementResult>) null, str2, i2);
            }
        });
    }

    public PendingResult<Achievements.UpdateAchievementResult> setStepsImmediate(GoogleApiClient googleApiClient, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        return googleApiClient.mo10940b(new UpdateImpl(str, googleApiClient) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13446b((BaseImplementation.C0670b<Achievements.UpdateAchievementResult>) this, str2, i2);
            }
        });
    }

    public void unlock(GoogleApiClient googleApiClient, final String str) {
        googleApiClient.mo10940b(new UpdateImpl(googleApiClient, str) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13445b((BaseImplementation.C0670b<Achievements.UpdateAchievementResult>) null, str);
            }
        });
    }

    public PendingResult<Achievements.UpdateAchievementResult> unlockImmediate(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new UpdateImpl(googleApiClient, str) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13445b((BaseImplementation.C0670b<Achievements.UpdateAchievementResult>) this, str);
            }
        });
    }
}
