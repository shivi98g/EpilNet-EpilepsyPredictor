package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1785jx;
import java.util.ArrayList;

public final class Games {
    public static final Api<GamesOptions> API = new Api<>(f1662DR, f1661DQ, SCOPE_GAMES);
    public static final Achievements Achievements = new AchievementsImpl();

    /* renamed from: DQ */
    static final Api.C0668c<GamesClientImpl> f1661DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<GamesClientImpl, GamesOptions> f1662DR = new Api.C0667b<GamesClientImpl, GamesOptions>() {
        /* renamed from: a */
        public GamesClientImpl mo10533a(Context context, Looper looper, C1744jg jgVar, GamesOptions gamesOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new GamesClientImpl(context, looper, jgVar.mo15791hq(), jgVar.mo15787hm(), connectionCallbacks, onConnectionFailedListener, jgVar.mo15790hp(), jgVar.mo15788hn(), jgVar.mo15792hr(), gamesOptions == null ? new GamesOptions() : gamesOptions);
        }

        public int getPriority() {
            return 1;
        }
    };
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final Events Events = new EventsImpl();
    public static final GamesMetadata GamesMetadata = new GamesMetadataImpl();
    public static final Invitations Invitations = new InvitationsImpl();
    public static final Leaderboards Leaderboards = new LeaderboardsImpl();
    public static final Notifications Notifications = new NotificationsImpl();
    public static final Players Players = new PlayersImpl();
    public static final Quests Quests = new QuestsImpl();
    public static final RealTimeMultiplayer RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    public static final Requests Requests = new RequestsImpl();
    public static final Scope SCOPE_GAMES = new Scope(Scopes.GAMES);
    public static final Snapshots Snapshots = new SnapshotsImpl();
    public static final TurnBasedMultiplayer TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();

    /* renamed from: WV */
    public static final Scope f1663WV = new Scope("https://www.googleapis.com/auth/games.firstparty");

    /* renamed from: WW */
    public static final Api<GamesOptions> f1664WW = new Api<>(f1662DR, f1661DQ, f1663WV);

    /* renamed from: WX */
    public static final AppContents f1665WX = new AppContentsImpl();

    /* renamed from: WY */
    public static final Multiplayer f1666WY = new MultiplayerImpl();

    /* renamed from: WZ */
    public static final Acls f1667WZ = new AclsImpl();

    public static abstract class BaseGamesApiMethodImpl<R extends Result> extends BaseImplementation.C0669a<R, GamesClientImpl> {
        public BaseGamesApiMethodImpl(GoogleApiClient googleApiClient) {
            super(Games.f1661DQ, googleApiClient);
        }
    }

    public static final class GamesOptions implements Api.ApiOptions.Optional {

        /* renamed from: Xa */
        public final boolean f1668Xa;

        /* renamed from: Xb */
        public final boolean f1669Xb;

        /* renamed from: Xc */
        public final int f1670Xc;

        /* renamed from: Xd */
        public final boolean f1671Xd;

        /* renamed from: Xe */
        public final int f1672Xe;

        /* renamed from: Xf */
        public final String f1673Xf;

        /* renamed from: Xg */
        public final ArrayList<String> f1674Xg;

        public static final class Builder {

            /* renamed from: Xa */
            boolean f1675Xa;

            /* renamed from: Xb */
            boolean f1676Xb;

            /* renamed from: Xc */
            int f1677Xc;

            /* renamed from: Xd */
            boolean f1678Xd;

            /* renamed from: Xe */
            int f1679Xe;

            /* renamed from: Xf */
            String f1680Xf;

            /* renamed from: Xg */
            ArrayList<String> f1681Xg;

            private Builder() {
                this.f1675Xa = false;
                this.f1676Xb = true;
                this.f1677Xc = 17;
                this.f1678Xd = false;
                this.f1679Xe = 4368;
                this.f1680Xf = null;
                this.f1681Xg = new ArrayList<>();
            }

            public GamesOptions build() {
                return new GamesOptions(this);
            }

            public Builder setSdkVariant(int i) {
                this.f1679Xe = i;
                return this;
            }

            public Builder setShowConnectingPopup(boolean z) {
                this.f1676Xb = z;
                this.f1677Xc = 17;
                return this;
            }

            public Builder setShowConnectingPopup(boolean z, int i) {
                this.f1676Xb = z;
                this.f1677Xc = i;
                return this;
            }
        }

        private GamesOptions() {
            this.f1668Xa = false;
            this.f1669Xb = true;
            this.f1670Xc = 17;
            this.f1671Xd = false;
            this.f1672Xe = 4368;
            this.f1673Xf = null;
            this.f1674Xg = new ArrayList<>();
        }

        private GamesOptions(Builder builder) {
            this.f1668Xa = builder.f1675Xa;
            this.f1669Xb = builder.f1676Xb;
            this.f1670Xc = builder.f1677Xc;
            this.f1671Xd = builder.f1678Xd;
            this.f1672Xe = builder.f1679Xe;
            this.f1673Xf = builder.f1680Xf;
            this.f1674Xg = builder.f1681Xg;
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    private static abstract class SignOutImpl extends BaseGamesApiMethodImpl<Status> {
        private SignOutImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    private Games() {
    }

    /* renamed from: d */
    public static GamesClientImpl m2046d(GoogleApiClient googleApiClient) {
        C1785jx.m5361b(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        C1785jx.m5355a(googleApiClient.isConnected(), "GoogleApiClient must be connected.");
        return m2047e(googleApiClient);
    }

    /* renamed from: e */
    public static GamesClientImpl m2047e(GoogleApiClient googleApiClient) {
        GamesClientImpl gamesClientImpl = (GamesClientImpl) googleApiClient.mo10937a(f1661DQ);
        C1785jx.m5355a(gamesClientImpl != null, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return gamesClientImpl;
    }

    public static String getAppId(GoogleApiClient googleApiClient) {
        return m2046d(googleApiClient).mo13526lw();
    }

    public static String getCurrentAccountName(GoogleApiClient googleApiClient) {
        return m2046d(googleApiClient).mo13511lh();
    }

    public static int getSdkVariant(GoogleApiClient googleApiClient) {
        return m2046d(googleApiClient).mo13525lv();
    }

    public static Intent getSettingsIntent(GoogleApiClient googleApiClient) {
        return m2046d(googleApiClient).mo13524lu();
    }

    public static void setGravityForPopups(GoogleApiClient googleApiClient, int i) {
        m2046d(googleApiClient).mo13483dS(i);
    }

    public static void setViewForPopups(GoogleApiClient googleApiClient, View view) {
        C1785jx.m5364i(view);
        m2046d(googleApiClient).mo13504k(view);
    }

    public static PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10940b(new SignOutImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13443b((BaseImplementation.C0670b<Status>) this);
            }
        });
    }
}
