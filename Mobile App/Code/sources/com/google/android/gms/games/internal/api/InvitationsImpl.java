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
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

public final class InvitationsImpl implements Invitations {

    /* renamed from: com.google.android.gms.games.internal.api.InvitationsImpl$2 */
    class C11332 extends LoadInvitationsImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2022ZZ;
        final /* synthetic */ int aaA;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13486e((BaseImplementation.C0670b<Invitations.LoadInvitationsResult>) this, this.f2022ZZ, this.aaA);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.InvitationsImpl$3 */
    class C11343 extends LoadInvitationsImpl {
        final /* synthetic */ String aaC;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13532n((BaseImplementation.C0670b<Invitations.LoadInvitationsResult>) this, this.aaC);
        }
    }

    private static abstract class LoadInvitationsImpl extends Games.BaseGamesApiMethodImpl<Invitations.LoadInvitationsResult> {
        private LoadInvitationsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: T */
        public Invitations.LoadInvitationsResult mo10544c(final Status status) {
            return new Invitations.LoadInvitationsResult() {
                public InvitationBuffer getInvitations() {
                    return new InvitationBuffer(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public Intent getInvitationInboxIntent(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13518lo();
    }

    public PendingResult<Invitations.LoadInvitationsResult> loadInvitations(GoogleApiClient googleApiClient) {
        return loadInvitations(googleApiClient, 0);
    }

    public PendingResult<Invitations.LoadInvitationsResult> loadInvitations(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.mo10938a(new LoadInvitationsImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13462c((BaseImplementation.C0670b<Invitations.LoadInvitationsResult>) this, i);
            }
        });
    }

    public void registerInvitationListener(GoogleApiClient googleApiClient, OnInvitationReceivedListener onInvitationReceivedListener) {
        Games.m2046d(googleApiClient).mo13436a((C0687d<OnInvitationReceivedListener>) googleApiClient.mo10945d(onInvitationReceivedListener));
    }

    public void unregisterInvitationListener(GoogleApiClient googleApiClient) {
        Games.m2046d(googleApiClient).mo13519lp();
    }
}
