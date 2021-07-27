package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl implements Players {

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$10 */
    class C116310 extends LoadPlayersImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2047ZZ;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13421a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, "nearby", this.f2047ZZ, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$11 */
    class C116411 extends LoadPlayersImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2048ZW;

        /* renamed from: ZZ */
        final /* synthetic */ String f2049ZZ;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13421a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, "played_with", this.f2049ZZ, this.aar, false, this.f2048ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$12 */
    class C116512 extends LoadPlayersImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2050ZZ;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13421a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, "played_with", this.f2050ZZ, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$13 */
    class C116613 extends LoadPlayersImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2051ZW;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13444b((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, this.aar, false, this.f2051ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$14 */
    class C116714 extends LoadPlayersImpl {
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13444b((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$15 */
    class C116815 extends LoadPlayersImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2052ZW;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13463c((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, this.aar, false, this.f2052ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$16 */
    class C116916 extends LoadPlayersImpl {
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13463c((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$17 */
    class C117017 extends LoadPlayersImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2053ZW;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13475d(this, this.aar, false, this.f2053ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$18 */
    class C117118 extends LoadPlayersImpl {
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13475d(this, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$19 */
    class C117219 extends LoadPlayersImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2054ZW;
        final /* synthetic */ int aar;
        final /* synthetic */ String aat;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13493f(this, this.aat, this.aar, false, this.f2054ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$20 */
    class C117420 extends LoadPlayersImpl {
        final /* synthetic */ int aar;
        final /* synthetic */ String aat;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13493f(this, this.aat, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$21 */
    class C117521 extends LoadPlayersImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2057ZW;
        final /* synthetic */ String aaR;
        final /* synthetic */ int aar;
        final /* synthetic */ String aba;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13451b((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, this.aba, this.aaR, this.aar, false, this.f2057ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$22 */
    class C117622 extends LoadPlayersImpl {
        final /* synthetic */ String aaR;
        final /* synthetic */ int aar;
        final /* synthetic */ String aba;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13451b((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, this.aba, this.aaR, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$23 */
    class C117723 extends LoadOwnerCoverPhotoUrisImpl {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13495g(this);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$24 */
    class C117824 extends LoadXpForGameCategoriesResultImpl {
        final /* synthetic */ String abb;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13530m(this, this.abb);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$25 */
    class C117925 extends LoadXpStreamResultImpl {
        final /* synthetic */ String abb;
        final /* synthetic */ int abc;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13465c((BaseImplementation.C0670b<Players.LoadXpStreamResult>) this, this.abb, this.abc);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$26 */
    class C118026 extends LoadXpStreamResultImpl {
        final /* synthetic */ String abb;
        final /* synthetic */ int abc;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13477d((BaseImplementation.C0670b<Players.LoadXpStreamResult>) this, this.abb, this.abc);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$27 */
    class C118127 extends LoadProfileSettingsResultImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2058ZW;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13494f((BaseImplementation.C0670b<Players.LoadProfileSettingsResult>) this, this.f2058ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$28 */
    class C118228 extends UpdateProfileSettingsResultImpl {
        final /* synthetic */ boolean abd;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13497g((BaseImplementation.C0670b<Status>) this, this.abd);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$3 */
    class C11833 extends LoadPlayersImpl {
        final /* synthetic */ String[] abe;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13435a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, this.abe);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.PlayersImpl$9 */
    class C11899 extends LoadPlayersImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2062ZZ;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13421a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, "nearby", this.f2062ZZ, this.aar, false, false);
        }
    }

    private static abstract class LoadOwnerCoverPhotoUrisImpl extends Games.BaseGamesApiMethodImpl<Players.LoadOwnerCoverPhotoUrisResult> {
        /* renamed from: ac */
        public Players.LoadOwnerCoverPhotoUrisResult mo10544c(final Status status) {
            return new Players.LoadOwnerCoverPhotoUrisResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadPlayersImpl extends Games.BaseGamesApiMethodImpl<Players.LoadPlayersResult> {
        private LoadPlayersImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: ad */
        public Players.LoadPlayersResult mo10544c(final Status status) {
            return new Players.LoadPlayersResult() {
                public PlayerBuffer getPlayers() {
                    return new PlayerBuffer(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class LoadProfileSettingsResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadProfileSettingsResult> {
        /* access modifiers changed from: protected */
        /* renamed from: ae */
        public Players.LoadProfileSettingsResult mo10544c(final Status status) {
            return new Players.LoadProfileSettingsResult() {
                public Status getStatus() {
                    return status;
                }

                public boolean isProfileVisible() {
                    return true;
                }

                public boolean isVisibilityExplicitlySet() {
                    return false;
                }
            };
        }
    }

    private static abstract class LoadXpForGameCategoriesResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadXpForGameCategoriesResult> {
        /* renamed from: af */
        public Players.LoadXpForGameCategoriesResult mo10544c(final Status status) {
            return new Players.LoadXpForGameCategoriesResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadXpStreamResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadXpStreamResult> {
        /* renamed from: ag */
        public Players.LoadXpStreamResult mo10544c(final Status status) {
            return new Players.LoadXpStreamResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class UpdateProfileSettingsResultImpl extends Games.BaseGamesApiMethodImpl<Status> {
        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    public Player getCurrentPlayer(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13513lj();
    }

    public String getCurrentPlayerId(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13512li();
    }

    public Intent getPlayerSearchIntent(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13523lt();
    }

    public PendingResult<Players.LoadPlayersResult> loadConnectedPlayers(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.mo10938a(new LoadPlayersImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13431a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, z);
            }
        });
    }

    public PendingResult<Players.LoadPlayersResult> loadInvitablePlayers(GoogleApiClient googleApiClient, final int i, final boolean z) {
        return googleApiClient.mo10938a(new LoadPlayersImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13405a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, i, false, z);
            }
        });
    }

    public PendingResult<Players.LoadPlayersResult> loadMoreInvitablePlayers(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.mo10938a(new LoadPlayersImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13405a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, i, true, false);
            }
        });
    }

    public PendingResult<Players.LoadPlayersResult> loadMoreRecentlyPlayedWithPlayers(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.mo10938a(new LoadPlayersImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13413a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, "played_with", i, true, false);
            }
        });
    }

    public PendingResult<Players.LoadPlayersResult> loadPlayer(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10938a(new LoadPlayersImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13427a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, str, false);
            }
        });
    }

    public PendingResult<Players.LoadPlayersResult> loadPlayer(GoogleApiClient googleApiClient, final String str, final boolean z) {
        return googleApiClient.mo10938a(new LoadPlayersImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13427a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, str, z);
            }
        });
    }

    public PendingResult<Players.LoadPlayersResult> loadRecentlyPlayedWithPlayers(GoogleApiClient googleApiClient, final int i, final boolean z) {
        return googleApiClient.mo10938a(new LoadPlayersImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13413a((BaseImplementation.C0670b<Players.LoadPlayersResult>) this, "played_with", i, false, z);
            }
        });
    }
}
