package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.C0687d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import java.util.List;

public final class TurnBasedMultiplayerImpl implements TurnBasedMultiplayer {

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl$11 */
    class C122811 extends InitiateMatchImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2093ZZ;
        final /* synthetic */ String abU;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13467c((BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult>) this, this.f2093ZZ, this.abU);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl$12 */
    class C122912 extends InitiateMatchImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2094ZZ;
        final /* synthetic */ String abU;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13479d((BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult>) this, this.f2094ZZ, this.abU);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl$13 */
    class C123013 extends LoadMatchesImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2095ZZ;
        final /* synthetic */ int abV;
        final /* synthetic */ int[] abW;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13415a((BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchesResult>) this, this.f2095ZZ, this.abV, this.abW);
        }
    }

    private static abstract class CancelMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.CancelMatchResult> {
        /* access modifiers changed from: private */

        /* renamed from: CE */
        public final String f2096CE;

        public CancelMatchImpl(String str, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.f2096CE = str;
        }

        /* renamed from: as */
        public TurnBasedMultiplayer.CancelMatchResult mo10544c(final Status status) {
            return new TurnBasedMultiplayer.CancelMatchResult() {
                public String getMatchId() {
                    return CancelMatchImpl.this.f2096CE;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class InitiateMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.InitiateMatchResult> {
        private InitiateMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: at */
        public TurnBasedMultiplayer.InitiateMatchResult mo10544c(final Status status) {
            return new TurnBasedMultiplayer.InitiateMatchResult() {
                public TurnBasedMatch getMatch() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LeaveMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.LeaveMatchResult> {
        private LeaveMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: au */
        public TurnBasedMultiplayer.LeaveMatchResult mo10544c(final Status status) {
            return new TurnBasedMultiplayer.LeaveMatchResult() {
                public TurnBasedMatch getMatch() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.LoadMatchResult> {
        private LoadMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: av */
        public TurnBasedMultiplayer.LoadMatchResult mo10544c(final Status status) {
            return new TurnBasedMultiplayer.LoadMatchResult() {
                public TurnBasedMatch getMatch() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadMatchesImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.LoadMatchesResult> {
        private LoadMatchesImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: aw */
        public TurnBasedMultiplayer.LoadMatchesResult mo10544c(final Status status) {
            return new TurnBasedMultiplayer.LoadMatchesResult() {
                public LoadMatchesResponse getMatches() {
                    return new LoadMatchesResponse(new Bundle());
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class UpdateMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.UpdateMatchResult> {
        private UpdateMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: ax */
        public TurnBasedMultiplayer.UpdateMatchResult mo10544c(final Status status) {
            return new TurnBasedMultiplayer.UpdateMatchResult() {
                public TurnBasedMatch getMatch() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    public PendingResult<TurnBasedMultiplayer.InitiateMatchResult> acceptInvitation(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new InitiateMatchImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13476d((BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult>) this, str);
            }
        });
    }

    public PendingResult<TurnBasedMultiplayer.CancelMatchResult> cancelMatch(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new CancelMatchImpl(googleApiClient, str) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13491f((BaseImplementation.C0670b<TurnBasedMultiplayer.CancelMatchResult>) this, str);
            }
        });
    }

    public PendingResult<TurnBasedMultiplayer.InitiateMatchResult> createMatch(GoogleApiClient googleApiClient, final TurnBasedMatchConfig turnBasedMatchConfig) {
        return googleApiClient.mo10940b(new InitiateMatchImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13408a((BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult>) this, turnBasedMatchConfig);
            }
        });
    }

    public void declineInvitation(GoogleApiClient googleApiClient, String str) {
        Games.m2046d(googleApiClient).mo13537q(str, 1);
    }

    public void dismissInvitation(GoogleApiClient googleApiClient, String str) {
        Games.m2046d(googleApiClient).mo13536p(str, 1);
    }

    public void dismissMatch(GoogleApiClient googleApiClient, String str) {
        Games.m2046d(googleApiClient).mo13459bA(str);
    }

    public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> finishMatch(GoogleApiClient googleApiClient, String str) {
        return finishMatch(googleApiClient, str, (byte[]) null, (ParticipantResult[]) null);
    }

    public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> finishMatch(GoogleApiClient googleApiClient, String str, byte[] bArr, List<ParticipantResult> list) {
        return finishMatch(googleApiClient, str, bArr, list == null ? null : (ParticipantResult[]) list.toArray(new ParticipantResult[list.size()]));
    }

    public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> finishMatch(GoogleApiClient googleApiClient, String str, byte[] bArr, ParticipantResult... participantResultArr) {
        final String str2 = str;
        final byte[] bArr2 = bArr;
        final ParticipantResult[] participantResultArr2 = participantResultArr;
        return googleApiClient.mo10940b(new UpdateMatchImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13429a((BaseImplementation.C0670b<TurnBasedMultiplayer.UpdateMatchResult>) this, str2, bArr2, participantResultArr2);
            }
        });
    }

    public Intent getInboxIntent(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13517ln();
    }

    public int getMaxMatchDataSize(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13527lx();
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleApiClient, int i, int i2) {
        return Games.m2046d(googleApiClient).mo13397a(i, i2, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleApiClient, int i, int i2, boolean z) {
        return Games.m2046d(googleApiClient).mo13397a(i, i2, z);
    }

    public PendingResult<TurnBasedMultiplayer.LeaveMatchResult> leaveMatch(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new LeaveMatchImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13485e((BaseImplementation.C0670b<TurnBasedMultiplayer.LeaveMatchResult>) this, str);
            }
        });
    }

    public PendingResult<TurnBasedMultiplayer.LeaveMatchResult> leaveMatchDuringTurn(GoogleApiClient googleApiClient, final String str, final String str2) {
        return googleApiClient.mo10940b(new LeaveMatchImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13417a((BaseImplementation.C0670b<TurnBasedMultiplayer.LeaveMatchResult>) this, str, str2);
            }
        });
    }

    public PendingResult<TurnBasedMultiplayer.LoadMatchResult> loadMatch(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10938a(new LoadMatchImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13496g((BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchResult>) this, str);
            }
        });
    }

    public PendingResult<TurnBasedMultiplayer.LoadMatchesResult> loadMatchesByStatus(GoogleApiClient googleApiClient, final int i, final int[] iArr) {
        return googleApiClient.mo10938a(new LoadMatchesImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13406a((BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchesResult>) this, i, iArr);
            }
        });
    }

    public PendingResult<TurnBasedMultiplayer.LoadMatchesResult> loadMatchesByStatus(GoogleApiClient googleApiClient, int[] iArr) {
        return loadMatchesByStatus(googleApiClient, 0, iArr);
    }

    public void registerMatchUpdateListener(GoogleApiClient googleApiClient, OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener) {
        Games.m2046d(googleApiClient).mo13457b((C0687d<OnTurnBasedMatchUpdateReceivedListener>) googleApiClient.mo10945d(onTurnBasedMatchUpdateReceivedListener));
    }

    public PendingResult<TurnBasedMultiplayer.InitiateMatchResult> rematch(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new InitiateMatchImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13464c((BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult>) this, str);
            }
        });
    }

    public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> takeTurn(GoogleApiClient googleApiClient, String str, byte[] bArr, String str2) {
        return takeTurn(googleApiClient, str, bArr, str2, (ParticipantResult[]) null);
    }

    public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> takeTurn(GoogleApiClient googleApiClient, String str, byte[] bArr, String str2, List<ParticipantResult> list) {
        return takeTurn(googleApiClient, str, bArr, str2, list == null ? null : (ParticipantResult[]) list.toArray(new ParticipantResult[list.size()]));
    }

    public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> takeTurn(GoogleApiClient googleApiClient, String str, byte[] bArr, String str2, ParticipantResult... participantResultArr) {
        final String str3 = str;
        final byte[] bArr2 = bArr;
        final String str4 = str2;
        final ParticipantResult[] participantResultArr2 = participantResultArr;
        return googleApiClient.mo10940b(new UpdateMatchImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13428a((BaseImplementation.C0670b<TurnBasedMultiplayer.UpdateMatchResult>) this, str3, bArr2, str4, participantResultArr2);
            }
        });
    }

    public void unregisterMatchUpdateListener(GoogleApiClient googleApiClient) {
        Games.m2046d(googleApiClient).mo13520lq();
    }
}
