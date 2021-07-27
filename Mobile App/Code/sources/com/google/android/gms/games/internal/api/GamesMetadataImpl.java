package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class GamesMetadataImpl implements GamesMetadata {

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$10 */
    class C111010 extends LoadExtendedGamesImpl {
        final /* synthetic */ String aaq;
        final /* synthetic */ int aar;
        final /* synthetic */ boolean aas;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13414a((BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult>) this, this.aaq, this.aar, false, true, false, this.aas);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$11 */
    class C111111 extends LoadExtendedGamesImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2002ZW;

        /* renamed from: ZY */
        final /* synthetic */ String f2003ZY;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13466c(this, this.f2003ZY, this.aar, false, this.f2002ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$12 */
    class C111212 extends LoadExtendedGamesImpl {

        /* renamed from: ZY */
        final /* synthetic */ String f2004ZY;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13466c(this, this.f2004ZY, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$13 */
    class C111313 extends LoadExtendedGamesImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2005ZW;

        /* renamed from: ZY */
        final /* synthetic */ String f2006ZY;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13478d(this, this.f2006ZY, this.aar, false, this.f2005ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$14 */
    class C111414 extends LoadExtendedGamesImpl {

        /* renamed from: ZY */
        final /* synthetic */ String f2007ZY;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13478d(this, this.f2007ZY, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$15 */
    class C111515 extends LoadExtendedGamesImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2008ZW;
        final /* synthetic */ String aaq;
        final /* synthetic */ int aar;
        final /* synthetic */ boolean aas;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13414a((BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult>) this, this.aaq, this.aar, true, false, this.f2008ZW, this.aas);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$16 */
    class C111616 extends LoadExtendedGamesImpl {
        final /* synthetic */ String aaq;
        final /* synthetic */ int aar;
        final /* synthetic */ boolean aas;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13414a((BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult>) this, this.aaq, this.aar, true, true, false, this.aas);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$17 */
    class C111717 extends LoadExtendedGamesImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2009ZW;
        final /* synthetic */ int aar;
        final /* synthetic */ String aat;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13487e(this, this.aat, this.aar, false, this.f2009ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$18 */
    class C111818 extends LoadExtendedGamesImpl {
        final /* synthetic */ int aar;
        final /* synthetic */ String aat;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13487e(this, this.aat, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$19 */
    class C111919 extends LoadGameSearchSuggestionsImpl {
        final /* synthetic */ String aat;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13506l(this, this.aat);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$2 */
    class C11202 extends LoadExtendedGamesImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2010ZZ;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13503j(this, this.f2010ZZ);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$3 */
    class C11213 extends LoadGameInstancesImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2011ZZ;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13505k(this, this.f2011ZZ);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$4 */
    class C11224 extends LoadExtendedGamesImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2012ZW;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13448b(this, (String) null, this.aar, false, this.f2012ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$5 */
    class C11235 extends LoadExtendedGamesImpl {
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13448b(this, (String) null, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$6 */
    class C11246 extends LoadExtendedGamesImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2013ZW;

        /* renamed from: ZY */
        final /* synthetic */ String f2014ZY;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13448b(this, this.f2014ZY, this.aar, false, this.f2013ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$7 */
    class C11257 extends LoadExtendedGamesImpl {

        /* renamed from: ZY */
        final /* synthetic */ String f2015ZY;
        final /* synthetic */ int aar;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13448b(this, this.f2015ZY, this.aar, true, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$8 */
    class C11268 extends LoadExtendedGamesImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2016ZW;
        final /* synthetic */ int aar;
        final /* synthetic */ int aau;
        final /* synthetic */ boolean aav;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13403a((BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult>) this, this.aar, this.aau, this.aav, this.f2016ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.GamesMetadataImpl$9 */
    class C11279 extends LoadExtendedGamesImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2017ZW;
        final /* synthetic */ String aaq;
        final /* synthetic */ int aar;
        final /* synthetic */ boolean aas;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13414a((BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult>) this, this.aaq, this.aar, false, false, this.f2017ZW, this.aas);
        }
    }

    private static abstract class LoadExtendedGamesImpl extends Games.BaseGamesApiMethodImpl<GamesMetadata.LoadExtendedGamesResult> {
        /* renamed from: P */
        public GamesMetadata.LoadExtendedGamesResult mo10544c(final Status status) {
            return new GamesMetadata.LoadExtendedGamesResult() {
                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class LoadGameInstancesImpl extends Games.BaseGamesApiMethodImpl<GamesMetadata.LoadGameInstancesResult> {
        /* renamed from: Q */
        public GamesMetadata.LoadGameInstancesResult mo10544c(final Status status) {
            return new GamesMetadata.LoadGameInstancesResult() {
                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class LoadGameSearchSuggestionsImpl extends Games.BaseGamesApiMethodImpl<GamesMetadata.LoadGameSearchSuggestionsResult> {
        /* renamed from: R */
        public GamesMetadata.LoadGameSearchSuggestionsResult mo10544c(final Status status) {
            return new GamesMetadata.LoadGameSearchSuggestionsResult() {
                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class LoadGamesImpl extends Games.BaseGamesApiMethodImpl<GamesMetadata.LoadGamesResult> {
        private LoadGamesImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: S */
        public GamesMetadata.LoadGamesResult mo10544c(final Status status) {
            return new GamesMetadata.LoadGamesResult() {
                public GameBuffer getGames() {
                    return new GameBuffer(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public Game getCurrentGame(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13514lk();
    }

    public PendingResult<GamesMetadata.LoadGamesResult> loadGame(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new LoadGamesImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13490f(this);
            }
        });
    }
}
