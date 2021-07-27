package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.C0687d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;

public final class QuestsImpl implements Quests {

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl$5 */
    class C11995 extends LoadsImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2070ZW;

        /* renamed from: ZZ */
        final /* synthetic */ String f2071ZZ;
        final /* synthetic */ int aaA;
        final /* synthetic */ int[] abn;
        final /* synthetic */ String abp;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13425a((BaseImplementation.C0670b<Quests.LoadQuestsResult>) this, this.f2071ZZ, this.abp, this.abn, this.aaA, this.f2070ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.QuestsImpl$6 */
    class C12006 extends LoadsImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2072ZW;

        /* renamed from: ZZ */
        final /* synthetic */ String f2073ZZ;
        final /* synthetic */ String[] abo;
        final /* synthetic */ String abp;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13424a((BaseImplementation.C0670b<Quests.LoadQuestsResult>) this, this.f2073ZZ, this.abp, this.f2072ZW, this.abo);
        }
    }

    private static abstract class AcceptImpl extends Games.BaseGamesApiMethodImpl<Quests.AcceptQuestResult> {
        private AcceptImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: ah */
        public Quests.AcceptQuestResult mo10544c(final Status status) {
            return new Quests.AcceptQuestResult() {
                public Quest getQuest() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class ClaimImpl extends Games.BaseGamesApiMethodImpl<Quests.ClaimMilestoneResult> {
        private ClaimImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: ai */
        public Quests.ClaimMilestoneResult mo10544c(final Status status) {
            return new Quests.ClaimMilestoneResult() {
                public Milestone getMilestone() {
                    return null;
                }

                public Quest getQuest() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class LoadsImpl extends Games.BaseGamesApiMethodImpl<Quests.LoadQuestsResult> {
        private LoadsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: aj */
        public Quests.LoadQuestsResult mo10544c(final Status status) {
            return new Quests.LoadQuestsResult() {
                public QuestBuffer getQuests() {
                    return new QuestBuffer(DataHolder.m625av(status.getStatusCode()));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public PendingResult<Quests.AcceptQuestResult> accept(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new AcceptImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13499h((BaseImplementation.C0670b<Quests.AcceptQuestResult>) this, str);
            }
        });
    }

    public PendingResult<Quests.ClaimMilestoneResult> claim(GoogleApiClient googleApiClient, final String str, final String str2) {
        return googleApiClient.mo10940b(new ClaimImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13449b((BaseImplementation.C0670b<Quests.ClaimMilestoneResult>) this, str, str2);
            }
        });
    }

    public Intent getQuestIntent(GoogleApiClient googleApiClient, String str) {
        return Games.m2046d(googleApiClient).mo13460bE(str);
    }

    public Intent getQuestsIntent(GoogleApiClient googleApiClient, int[] iArr) {
        return Games.m2046d(googleApiClient).mo13442b(iArr);
    }

    public PendingResult<Quests.LoadQuestsResult> load(GoogleApiClient googleApiClient, int[] iArr, int i, boolean z) {
        final int[] iArr2 = iArr;
        final int i2 = i;
        final boolean z2 = z;
        return googleApiClient.mo10938a(new LoadsImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13434a((BaseImplementation.C0670b<Quests.LoadQuestsResult>) this, iArr2, i2, z2);
            }
        });
    }

    public PendingResult<Quests.LoadQuestsResult> loadByIds(GoogleApiClient googleApiClient, final boolean z, final String... strArr) {
        return googleApiClient.mo10938a(new LoadsImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13455b((BaseImplementation.C0670b<Quests.LoadQuestsResult>) this, z, strArr);
            }
        });
    }

    public void registerQuestUpdateListener(GoogleApiClient googleApiClient, QuestUpdateListener questUpdateListener) {
        Games.m2046d(googleApiClient).mo13472c((C0687d<QuestUpdateListener>) googleApiClient.mo10945d(questUpdateListener));
    }

    public void showStateChangedPopup(GoogleApiClient googleApiClient, String str) {
        Games.m2046d(googleApiClient).mo13461bF(str);
    }

    public void unregisterQuestUpdateListener(GoogleApiClient googleApiClient) {
        Games.m2046d(googleApiClient).mo13521lr();
    }
}
