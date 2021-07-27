package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.C0673a;
import com.google.android.gms.common.api.C0674b;
import com.google.android.gms.common.api.C0687d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C0702a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.OnNearbyPlayerDetectedListener;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.internal.game.ExtendedGameBuffer;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.internal.C1742je;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C1775jt;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1840ll;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GamesClientImpl extends C1750jl<IGamesService> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: DZ */
    private final String f1781DZ;

    /* renamed from: Yk */
    EventIncrementManager f1782Yk = new EventIncrementManager() {
        /* renamed from: lF */
        public EventIncrementCache mo13539lF() {
            return new GameClientEventIncrementCache();
        }
    };

    /* renamed from: Yl */
    private final String f1783Yl;

    /* renamed from: Ym */
    private final Map<String, RealTimeSocket> f1784Ym;

    /* renamed from: Yn */
    private PlayerEntity f1785Yn;

    /* renamed from: Yo */
    private GameEntity f1786Yo;

    /* renamed from: Yp */
    private final PopupManager f1787Yp;

    /* renamed from: Yq */
    private boolean f1788Yq = false;

    /* renamed from: Yr */
    private final Binder f1789Yr;

    /* renamed from: Ys */
    private final long f1790Ys;

    /* renamed from: Yt */
    private final Games.GamesOptions f1791Yt;

    private static abstract class AbstractPeerStatusNotifier extends AbstractRoomStatusNotifier {

        /* renamed from: Yv */
        private final ArrayList<String> f1793Yv = new ArrayList<>();

        AbstractPeerStatusNotifier(DataHolder dataHolder, String[] strArr) {
            super(dataHolder);
            for (String add : strArr) {
                this.f1793Yv.add(add);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13540a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            mo13541a(roomStatusUpdateListener, room, this.f1793Yv);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo13541a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList);
    }

    private static abstract class AbstractRoomNotifier extends C0673a<RoomUpdateListener> {
        AbstractRoomNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10997a(RoomUpdateListener roomUpdateListener, DataHolder dataHolder) {
            mo13543a(roomUpdateListener, GamesClientImpl.m2280R(dataHolder), dataHolder.getStatusCode());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo13543a(RoomUpdateListener roomUpdateListener, Room room, int i);
    }

    private static abstract class AbstractRoomStatusNotifier extends C0673a<RoomStatusUpdateListener> {
        AbstractRoomStatusNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10997a(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder) {
            mo13540a(roomStatusUpdateListener, GamesClientImpl.m2280R(dataHolder));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo13540a(RoomStatusUpdateListener roomStatusUpdateListener, Room room);
    }

    private static final class AcceptQuestResultImpl extends C0674b implements Quests.AcceptQuestResult {

        /* renamed from: Yw */
        private final Quest f1794Yw;

        AcceptQuestResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            QuestBuffer questBuffer = new QuestBuffer(dataHolder);
            try {
                if (questBuffer.getCount() > 0) {
                    this.f1794Yw = new QuestEntity((Quest) questBuffer.get(0));
                } else {
                    this.f1794Yw = null;
                }
            } finally {
                questBuffer.release();
            }
        }

        public Quest getQuest() {
            return this.f1794Yw;
        }
    }

    private static final class AchievementUpdatedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Achievements.UpdateAchievementResult> f1795Ea;

        AchievementUpdatedBinderCallback(BaseImplementation.C0670b<Achievements.UpdateAchievementResult> bVar) {
            this.f1795Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: g */
        public void mo13356g(int i, String str) {
            this.f1795Ea.mo10914b(new UpdateAchievementResultImpl(i, str));
        }
    }

    private static final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Achievements.LoadAchievementsResult> f1796Ea;

        AchievementsLoadedBinderCallback(BaseImplementation.C0670b<Achievements.LoadAchievementsResult> bVar) {
            this.f1796Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: c */
        public void mo13340c(DataHolder dataHolder) {
            this.f1796Ea.mo10914b(new LoadAchievementsResultImpl(dataHolder));
        }
    }

    private static final class AppContentLoadedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Yx */
        private final BaseImplementation.C0670b<AppContents.LoadAppContentResult> f1797Yx;

        public AppContentLoadedBinderCallbacks(BaseImplementation.C0670b<AppContents.LoadAppContentResult> bVar) {
            this.f1797Yx = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: a */
        public void mo13335a(DataHolder[] dataHolderArr) {
            this.f1797Yx.mo10914b(new LoadAppContentsResultImpl(dataHolderArr));
        }
    }

    private static final class CancelMatchResultImpl implements TurnBasedMultiplayer.CancelMatchResult {

        /* renamed from: Eb */
        private final Status f1798Eb;

        /* renamed from: Yy */
        private final String f1799Yy;

        CancelMatchResultImpl(Status status, String str) {
            this.f1798Eb = status;
            this.f1799Yy = str;
        }

        public String getMatchId() {
            return this.f1799Yy;
        }

        public Status getStatus() {
            return this.f1798Eb;
        }
    }

    private static final class ClaimMilestoneResultImpl extends C0674b implements Quests.ClaimMilestoneResult {

        /* renamed from: Yw */
        private final Quest f1800Yw;

        /* renamed from: Yz */
        private final Milestone f1801Yz;

        ClaimMilestoneResultImpl(DataHolder dataHolder, String str) {
            super(dataHolder);
            QuestBuffer questBuffer = new QuestBuffer(dataHolder);
            try {
                if (questBuffer.getCount() > 0) {
                    this.f1800Yw = new QuestEntity((Quest) questBuffer.get(0));
                    List<Milestone> mQ = this.f1800Yw.mo14534mQ();
                    int size = mQ.size();
                    for (int i = 0; i < size; i++) {
                        if (mQ.get(i).getMilestoneId().equals(str)) {
                            this.f1801Yz = mQ.get(i);
                            return;
                        }
                    }
                    this.f1801Yz = null;
                } else {
                    this.f1801Yz = null;
                    this.f1800Yw = null;
                }
                questBuffer.release();
            } finally {
                questBuffer.release();
            }
        }

        public Milestone getMilestone() {
            return this.f1801Yz;
        }

        public Quest getQuest() {
            return this.f1800Yw;
        }
    }

    private static final class CommitSnapshotResultImpl extends C0674b implements Snapshots.CommitSnapshotResult {

        /* renamed from: YA */
        private final SnapshotMetadata f1802YA;

        CommitSnapshotResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
            try {
                if (snapshotMetadataBuffer.getCount() > 0) {
                    this.f1802YA = new SnapshotMetadataEntity(snapshotMetadataBuffer.get(0));
                } else {
                    this.f1802YA = null;
                }
            } finally {
                snapshotMetadataBuffer.release();
            }
        }

        public SnapshotMetadata getSnapshotMetadata() {
            return this.f1802YA;
        }
    }

    private static final class ConnectedToRoomNotifier extends AbstractRoomStatusNotifier {
        ConnectedToRoomNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* renamed from: a */
        public void mo13540a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onConnectedToRoom(room);
        }
    }

    private static final class ContactSettingLoadResultImpl extends C0674b implements Notifications.ContactSettingLoadResult {
        ContactSettingLoadResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Notifications.ContactSettingLoadResult> f1803Ea;

        ContactSettingsLoadedBinderCallback(BaseImplementation.C0670b<Notifications.ContactSettingLoadResult> bVar) {
            this.f1803Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: D */
        public void mo13316D(DataHolder dataHolder) {
            this.f1803Ea.mo10914b(new ContactSettingLoadResultImpl(dataHolder));
        }
    }

    private static final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Status> f1804Ea;

        ContactSettingsUpdatedBinderCallback(BaseImplementation.C0670b<Status> bVar) {
            this.f1804Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: dP */
        public void mo13346dP(int i) {
            this.f1804Ea.mo10914b(new Status(i));
        }
    }

    private static final class DeleteSnapshotResultImpl implements Snapshots.DeleteSnapshotResult {

        /* renamed from: Eb */
        private final Status f1805Eb;

        /* renamed from: YB */
        private final String f1806YB;

        DeleteSnapshotResultImpl(int i, String str) {
            this.f1805Eb = new Status(i);
            this.f1806YB = str;
        }

        public String getSnapshotId() {
            return this.f1806YB;
        }

        public Status getStatus() {
            return this.f1805Eb;
        }
    }

    private static final class DisconnectedFromRoomNotifier extends AbstractRoomStatusNotifier {
        DisconnectedFromRoomNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* renamed from: a */
        public void mo13540a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onDisconnectedFromRoom(room);
        }
    }

    private static final class EventsLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Events.LoadEventsResult> f1807Ea;

        EventsLoadedBinderCallback(BaseImplementation.C0670b<Events.LoadEventsResult> bVar) {
            this.f1807Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: d */
        public void mo13343d(DataHolder dataHolder) {
            this.f1807Ea.mo10914b(new LoadEventResultImpl(dataHolder));
        }
    }

    private static final class ExtendedGamesLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> f1808Ea;

        ExtendedGamesLoadedBinderCallback(BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> bVar) {
            this.f1808Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: j */
        public void mo13362j(DataHolder dataHolder) {
            this.f1808Ea.mo10914b(new LoadExtendedGamesResultImpl(dataHolder));
        }
    }

    private class GameClientEventIncrementCache extends EventIncrementCache {
        public GameClientEventIncrementCache() {
            super(GamesClientImpl.this.getContext().getMainLooper(), 1000);
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo13551r(String str, int i) {
            try {
                if (GamesClientImpl.this.isConnected()) {
                    ((IGamesService) GamesClientImpl.this.mo15820hw()).mo13760o(str, i);
                    return;
                }
                GamesLog.m2570p("GamesClientImpl", "Unable to increment event " + str + " by " + i + " because the games client is no longer connected");
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "service died");
            }
        }
    }

    private static final class GameInstancesLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<GamesMetadata.LoadGameInstancesResult> f1810Ea;

        GameInstancesLoadedBinderCallback(BaseImplementation.C0670b<GamesMetadata.LoadGameInstancesResult> bVar) {
            this.f1810Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: k */
        public void mo13363k(DataHolder dataHolder) {
            this.f1810Ea.mo10914b(new LoadGameInstancesResultImpl(dataHolder));
        }
    }

    private static final class GameMuteStatusChangeResultImpl implements Notifications.GameMuteStatusChangeResult {

        /* renamed from: Eb */
        private final Status f1811Eb;

        /* renamed from: YC */
        private final String f1812YC;

        /* renamed from: YD */
        private final boolean f1813YD;

        public GameMuteStatusChangeResultImpl(int i, String str, boolean z) {
            this.f1811Eb = new Status(i);
            this.f1812YC = str;
            this.f1813YD = z;
        }

        public Status getStatus() {
            return this.f1811Eb;
        }
    }

    private static final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Notifications.GameMuteStatusChangeResult> f1814Ea;

        GameMuteStatusChangedBinderCallback(BaseImplementation.C0670b<Notifications.GameMuteStatusChangeResult> bVar) {
            this.f1814Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: a */
        public void mo13330a(int i, String str, boolean z) {
            this.f1814Ea.mo10914b(new GameMuteStatusChangeResultImpl(i, str, z));
        }
    }

    private static final class GameMuteStatusLoadResultImpl implements Notifications.GameMuteStatusLoadResult {

        /* renamed from: Eb */
        private final Status f1815Eb;

        /* renamed from: YC */
        private final String f1816YC;

        /* renamed from: YD */
        private final boolean f1817YD;

        public GameMuteStatusLoadResultImpl(DataHolder dataHolder) {
            try {
                this.f1815Eb = new Status(dataHolder.getStatusCode());
                if (dataHolder.getCount() > 0) {
                    this.f1816YC = dataHolder.mo11049c("external_game_id", 0, 0);
                    this.f1817YD = dataHolder.mo11051d("muted", 0, 0);
                } else {
                    this.f1816YC = null;
                    this.f1817YD = false;
                }
            } finally {
                dataHolder.close();
            }
        }

        public Status getStatus() {
            return this.f1815Eb;
        }
    }

    private static final class GameMuteStatusLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Notifications.GameMuteStatusLoadResult> f1818Ea;

        GameMuteStatusLoadedBinderCallback(BaseImplementation.C0670b<Notifications.GameMuteStatusLoadResult> bVar) {
            this.f1818Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: B */
        public void mo13314B(DataHolder dataHolder) {
            this.f1818Ea.mo10914b(new GameMuteStatusLoadResultImpl(dataHolder));
        }
    }

    private static final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<GamesMetadata.LoadGameSearchSuggestionsResult> f1819Ea;

        GameSearchSuggestionsLoadedBinderCallback(BaseImplementation.C0670b<GamesMetadata.LoadGameSearchSuggestionsResult> bVar) {
            this.f1819Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: l */
        public void mo13364l(DataHolder dataHolder) {
            this.f1819Ea.mo10914b(new LoadGameSearchSuggestionsResultImpl(dataHolder));
        }
    }

    private static final class GamesLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<GamesMetadata.LoadGamesResult> f1820Ea;

        GamesLoadedBinderCallback(BaseImplementation.C0670b<GamesMetadata.LoadGamesResult> bVar) {
            this.f1820Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: i */
        public void mo13361i(DataHolder dataHolder) {
            this.f1820Ea.mo10914b(new LoadGamesResultImpl(dataHolder));
        }
    }

    private static final class InboxCountResultImpl implements Notifications.InboxCountResult {

        /* renamed from: Eb */
        private final Status f1821Eb;

        /* renamed from: YE */
        private final Bundle f1822YE;

        InboxCountResultImpl(Status status, Bundle bundle) {
            this.f1821Eb = status;
            this.f1822YE = bundle;
        }

        public Status getStatus() {
            return this.f1821Eb;
        }
    }

    private static final class InboxCountsLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Notifications.InboxCountResult> f1823Ea;

        InboxCountsLoadedBinderCallback(BaseImplementation.C0670b<Notifications.InboxCountResult> bVar) {
            this.f1823Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: f */
        public void mo13351f(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f1823Ea.mo10914b(new InboxCountResultImpl(new Status(i), bundle));
        }
    }

    private static final class InitiateMatchResultImpl extends TurnBasedMatchResult implements TurnBasedMultiplayer.InitiateMatchResult {
        InitiateMatchResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class InvitationReceivedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Qe */
        private final C0687d<OnInvitationReceivedListener> f1824Qe;

        InvitationReceivedBinderCallback(C0687d<OnInvitationReceivedListener> dVar) {
            this.f1824Qe = dVar;
        }

        /* renamed from: n */
        public void mo13366n(DataHolder dataHolder) {
            InvitationBuffer invitationBuffer = new InvitationBuffer(dataHolder);
            try {
                Invitation invitation = invitationBuffer.getCount() > 0 ? (Invitation) ((Invitation) invitationBuffer.get(0)).freeze() : null;
                if (invitation != null) {
                    this.f1824Qe.mo11009a(new InvitationReceivedNotifier(invitation));
                }
            } finally {
                invitationBuffer.release();
            }
        }

        public void onInvitationRemoved(String str) {
            this.f1824Qe.mo11009a(new InvitationRemovedNotifier(str));
        }
    }

    private static final class InvitationReceivedNotifier implements C0687d.C0689b<OnInvitationReceivedListener> {

        /* renamed from: YF */
        private final Invitation f1825YF;

        InvitationReceivedNotifier(Invitation invitation) {
            this.f1825YF = invitation;
        }

        /* renamed from: a */
        public void mo10998c(OnInvitationReceivedListener onInvitationReceivedListener) {
            onInvitationReceivedListener.onInvitationReceived(this.f1825YF);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class InvitationRemovedNotifier implements C0687d.C0689b<OnInvitationReceivedListener> {

        /* renamed from: YG */
        private final String f1826YG;

        InvitationRemovedNotifier(String str) {
            this.f1826YG = str;
        }

        /* renamed from: a */
        public void mo10998c(OnInvitationReceivedListener onInvitationReceivedListener) {
            onInvitationReceivedListener.onInvitationRemoved(this.f1826YG);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Invitations.LoadInvitationsResult> f1827Ea;

        InvitationsLoadedBinderCallback(BaseImplementation.C0670b<Invitations.LoadInvitationsResult> bVar) {
            this.f1827Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: m */
        public void mo13365m(DataHolder dataHolder) {
            this.f1827Ea.mo10914b(new LoadInvitationsResultImpl(dataHolder));
        }
    }

    private static final class JoinedRoomNotifier extends AbstractRoomNotifier {
        public JoinedRoomNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* renamed from: a */
        public void mo13543a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onJoinedRoom(i, room);
        }
    }

    private static final class LeaderboardMetadataResultImpl extends C0674b implements Leaderboards.LeaderboardMetadataResult {

        /* renamed from: YH */
        private final LeaderboardBuffer f1828YH;

        LeaderboardMetadataResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1828YH = new LeaderboardBuffer(dataHolder);
        }

        public LeaderboardBuffer getLeaderboards() {
            return this.f1828YH;
        }
    }

    private static final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Leaderboards.LoadScoresResult> f1829Ea;

        LeaderboardScoresLoadedBinderCallback(BaseImplementation.C0670b<Leaderboards.LoadScoresResult> bVar) {
            this.f1829Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: a */
        public void mo13331a(DataHolder dataHolder, DataHolder dataHolder2) {
            this.f1829Ea.mo10914b(new LoadScoresResultImpl(dataHolder, dataHolder2));
        }
    }

    private static final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult> f1830Ea;

        LeaderboardsLoadedBinderCallback(BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult> bVar) {
            this.f1830Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: e */
        public void mo13349e(DataHolder dataHolder) {
            this.f1830Ea.mo10914b(new LeaderboardMetadataResultImpl(dataHolder));
        }
    }

    private static final class LeaveMatchResultImpl extends TurnBasedMatchResult implements TurnBasedMultiplayer.LeaveMatchResult {
        LeaveMatchResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class LeftRoomNotifier implements C0687d.C0689b<RoomUpdateListener> {

        /* renamed from: Iv */
        private final int f1831Iv;

        /* renamed from: YI */
        private final String f1832YI;

        LeftRoomNotifier(int i, String str) {
            this.f1831Iv = i;
            this.f1832YI = str;
        }

        /* renamed from: a */
        public void mo10998c(RoomUpdateListener roomUpdateListener) {
            roomUpdateListener.onLeftRoom(this.f1831Iv, this.f1832YI);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class LoadAchievementsResultImpl extends C0674b implements Achievements.LoadAchievementsResult {

        /* renamed from: YJ */
        private final AchievementBuffer f1833YJ;

        LoadAchievementsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1833YJ = new AchievementBuffer(dataHolder);
        }

        public AchievementBuffer getAchievements() {
            return this.f1833YJ;
        }
    }

    private static final class LoadAclResultImpl extends C0674b implements Acls.LoadAclResult {
        LoadAclResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class LoadAppContentsResultImpl extends C0674b implements AppContents.LoadAppContentResult {

        /* renamed from: YK */
        private final ArrayList<DataHolder> f1834YK;

        LoadAppContentsResultImpl(DataHolder[] dataHolderArr) {
            super(dataHolderArr[0]);
            this.f1834YK = new ArrayList<>(Arrays.asList(dataHolderArr));
        }
    }

    private static final class LoadEventResultImpl extends C0674b implements Events.LoadEventsResult {

        /* renamed from: YL */
        private final EventBuffer f1835YL;

        LoadEventResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1835YL = new EventBuffer(dataHolder);
        }

        public EventBuffer getEvents() {
            return this.f1835YL;
        }
    }

    private static final class LoadExtendedGamesResultImpl extends C0674b implements GamesMetadata.LoadExtendedGamesResult {

        /* renamed from: YM */
        private final ExtendedGameBuffer f1836YM;

        LoadExtendedGamesResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1836YM = new ExtendedGameBuffer(dataHolder);
        }
    }

    private static final class LoadGameInstancesResultImpl extends C0674b implements GamesMetadata.LoadGameInstancesResult {

        /* renamed from: YN */
        private final GameInstanceBuffer f1837YN;

        LoadGameInstancesResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1837YN = new GameInstanceBuffer(dataHolder);
        }
    }

    private static final class LoadGameSearchSuggestionsResultImpl extends C0674b implements GamesMetadata.LoadGameSearchSuggestionsResult {

        /* renamed from: YO */
        private final GameSearchSuggestionBuffer f1838YO;

        LoadGameSearchSuggestionsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1838YO = new GameSearchSuggestionBuffer(dataHolder);
        }
    }

    private static final class LoadGamesResultImpl extends C0674b implements GamesMetadata.LoadGamesResult {

        /* renamed from: YP */
        private final GameBuffer f1839YP;

        LoadGamesResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1839YP = new GameBuffer(dataHolder);
        }

        public GameBuffer getGames() {
            return this.f1839YP;
        }
    }

    private static final class LoadInvitationsResultImpl extends C0674b implements Invitations.LoadInvitationsResult {

        /* renamed from: YQ */
        private final InvitationBuffer f1840YQ;

        LoadInvitationsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1840YQ = new InvitationBuffer(dataHolder);
        }

        public InvitationBuffer getInvitations() {
            return this.f1840YQ;
        }
    }

    private static final class LoadMatchResultImpl extends TurnBasedMatchResult implements TurnBasedMultiplayer.LoadMatchResult {
        LoadMatchResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class LoadMatchesResultImpl implements TurnBasedMultiplayer.LoadMatchesResult {

        /* renamed from: Eb */
        private final Status f1841Eb;

        /* renamed from: YR */
        private final LoadMatchesResponse f1842YR;

        LoadMatchesResultImpl(Status status, Bundle bundle) {
            this.f1841Eb = status;
            this.f1842YR = new LoadMatchesResponse(bundle);
        }

        public LoadMatchesResponse getMatches() {
            return this.f1842YR;
        }

        public Status getStatus() {
            return this.f1841Eb;
        }

        public void release() {
            this.f1842YR.release();
        }
    }

    private static final class LoadOwnerCoverPhotoUrisResultImpl implements Players.LoadOwnerCoverPhotoUrisResult {

        /* renamed from: DJ */
        private final Bundle f1843DJ;

        /* renamed from: Eb */
        private final Status f1844Eb;

        LoadOwnerCoverPhotoUrisResultImpl(int i, Bundle bundle) {
            this.f1844Eb = new Status(i);
            this.f1843DJ = bundle;
        }

        public Status getStatus() {
            return this.f1844Eb;
        }
    }

    private static final class LoadPlayerScoreResultImpl extends C0674b implements Leaderboards.LoadPlayerScoreResult {

        /* renamed from: YS */
        private final LeaderboardScoreEntity f1845YS;

        LoadPlayerScoreResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            LeaderboardScoreBuffer leaderboardScoreBuffer = new LeaderboardScoreBuffer(dataHolder);
            try {
                if (leaderboardScoreBuffer.getCount() > 0) {
                    this.f1845YS = (LeaderboardScoreEntity) leaderboardScoreBuffer.get(0).freeze();
                } else {
                    this.f1845YS = null;
                }
            } finally {
                leaderboardScoreBuffer.release();
            }
        }

        public LeaderboardScore getScore() {
            return this.f1845YS;
        }
    }

    private static final class LoadPlayersResultImpl extends C0674b implements Players.LoadPlayersResult {

        /* renamed from: YT */
        private final PlayerBuffer f1846YT;

        LoadPlayersResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1846YT = new PlayerBuffer(dataHolder);
        }

        public PlayerBuffer getPlayers() {
            return this.f1846YT;
        }
    }

    private static final class LoadProfileSettingsResultImpl extends C0674b implements Players.LoadProfileSettingsResult {

        /* renamed from: YU */
        private final boolean f1847YU;

        /* renamed from: Yh */
        private final boolean f1848Yh;

        LoadProfileSettingsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            try {
                if (dataHolder.getCount() > 0) {
                    int au = dataHolder.mo11047au(0);
                    this.f1848Yh = dataHolder.mo11051d("profile_visible", 0, au);
                    this.f1847YU = dataHolder.mo11051d("profile_visibility_explicitly_set", 0, au);
                } else {
                    this.f1848Yh = true;
                    this.f1847YU = false;
                }
            } finally {
                dataHolder.close();
            }
        }

        public Status getStatus() {
            return this.f671Eb;
        }

        public boolean isProfileVisible() {
            return this.f1848Yh;
        }

        public boolean isVisibilityExplicitlySet() {
            return this.f1847YU;
        }
    }

    private static final class LoadQuestsResultImpl extends C0674b implements Quests.LoadQuestsResult {

        /* renamed from: JG */
        private final DataHolder f1849JG;

        LoadQuestsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1849JG = dataHolder;
        }

        public QuestBuffer getQuests() {
            return new QuestBuffer(this.f1849JG);
        }
    }

    private static final class LoadRequestSummariesResultImpl extends C0674b implements Requests.LoadRequestSummariesResult {
        LoadRequestSummariesResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class LoadRequestsResultImpl implements Requests.LoadRequestsResult {

        /* renamed from: Eb */
        private final Status f1850Eb;

        /* renamed from: YV */
        private final Bundle f1851YV;

        LoadRequestsResultImpl(Status status, Bundle bundle) {
            this.f1850Eb = status;
            this.f1851YV = bundle;
        }

        public GameRequestBuffer getRequests(int i) {
            String dZ = RequestType.m3546dZ(i);
            if (!this.f1851YV.containsKey(dZ)) {
                return null;
            }
            return new GameRequestBuffer((DataHolder) this.f1851YV.get(dZ));
        }

        public Status getStatus() {
            return this.f1850Eb;
        }

        public void release() {
            for (String parcelable : this.f1851YV.keySet()) {
                DataHolder dataHolder = (DataHolder) this.f1851YV.getParcelable(parcelable);
                if (dataHolder != null) {
                    dataHolder.close();
                }
            }
        }
    }

    private static final class LoadScoresResultImpl extends C0674b implements Leaderboards.LoadScoresResult {

        /* renamed from: YW */
        private final LeaderboardEntity f1852YW;

        /* renamed from: YX */
        private final LeaderboardScoreBuffer f1853YX;

        /* JADX INFO: finally extract failed */
        LoadScoresResultImpl(DataHolder dataHolder, DataHolder dataHolder2) {
            super(dataHolder2);
            LeaderboardBuffer leaderboardBuffer = new LeaderboardBuffer(dataHolder);
            try {
                if (leaderboardBuffer.getCount() > 0) {
                    this.f1852YW = (LeaderboardEntity) ((Leaderboard) leaderboardBuffer.get(0)).freeze();
                } else {
                    this.f1852YW = null;
                }
                leaderboardBuffer.release();
                this.f1853YX = new LeaderboardScoreBuffer(dataHolder2);
            } catch (Throwable th) {
                leaderboardBuffer.release();
                throw th;
            }
        }

        public Leaderboard getLeaderboard() {
            return this.f1852YW;
        }

        public LeaderboardScoreBuffer getScores() {
            return this.f1853YX;
        }
    }

    private static final class LoadSnapshotsResultImpl extends C0674b implements Snapshots.LoadSnapshotsResult {
        LoadSnapshotsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }

        public SnapshotMetadataBuffer getSnapshots() {
            return new SnapshotMetadataBuffer(this.f672JG);
        }
    }

    private static final class LoadXpForGameCategoriesResultImpl implements Players.LoadXpForGameCategoriesResult {

        /* renamed from: Eb */
        private final Status f1854Eb;

        /* renamed from: YY */
        private final List<String> f1855YY;

        /* renamed from: YZ */
        private final Bundle f1856YZ;

        LoadXpForGameCategoriesResultImpl(Status status, Bundle bundle) {
            this.f1854Eb = status;
            this.f1855YY = bundle.getStringArrayList("game_category_list");
            this.f1856YZ = bundle;
        }

        public Status getStatus() {
            return this.f1854Eb;
        }
    }

    private static final class LoadXpStreamResultImpl extends C0674b implements Players.LoadXpStreamResult {

        /* renamed from: Za */
        private final ExperienceEventBuffer f1857Za;

        LoadXpStreamResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1857Za = new ExperienceEventBuffer(dataHolder);
        }
    }

    private static final class MatchRemovedNotifier implements C0687d.C0689b<OnTurnBasedMatchUpdateReceivedListener> {

        /* renamed from: Zb */
        private final String f1858Zb;

        MatchRemovedNotifier(String str) {
            this.f1858Zb = str;
        }

        /* renamed from: a */
        public void mo10998c(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener) {
            onTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchRemoved(this.f1858Zb);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Qe */
        private final C0687d<OnTurnBasedMatchUpdateReceivedListener> f1859Qe;

        MatchUpdateReceivedBinderCallback(C0687d<OnTurnBasedMatchUpdateReceivedListener> dVar) {
            this.f1859Qe = dVar;
        }

        public void onTurnBasedMatchRemoved(String str) {
            this.f1859Qe.mo11009a(new MatchRemovedNotifier(str));
        }

        /* renamed from: t */
        public void mo13379t(DataHolder dataHolder) {
            TurnBasedMatchBuffer turnBasedMatchBuffer = new TurnBasedMatchBuffer(dataHolder);
            try {
                TurnBasedMatch turnBasedMatch = turnBasedMatchBuffer.getCount() > 0 ? (TurnBasedMatch) ((TurnBasedMatch) turnBasedMatchBuffer.get(0)).freeze() : null;
                if (turnBasedMatch != null) {
                    this.f1859Qe.mo11009a(new MatchUpdateReceivedNotifier(turnBasedMatch));
                }
            } finally {
                turnBasedMatchBuffer.release();
            }
        }
    }

    private static final class MatchUpdateReceivedNotifier implements C0687d.C0689b<OnTurnBasedMatchUpdateReceivedListener> {

        /* renamed from: Zc */
        private final TurnBasedMatch f1860Zc;

        MatchUpdateReceivedNotifier(TurnBasedMatch turnBasedMatch) {
            this.f1860Zc = turnBasedMatch;
        }

        /* renamed from: a */
        public void mo10998c(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener) {
            onTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchReceived(this.f1860Zc);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class MessageReceivedNotifier implements C0687d.C0689b<RealTimeMessageReceivedListener> {

        /* renamed from: Zd */
        private final RealTimeMessage f1861Zd;

        MessageReceivedNotifier(RealTimeMessage realTimeMessage) {
            this.f1861Zd = realTimeMessage;
        }

        /* renamed from: a */
        public void mo10998c(RealTimeMessageReceivedListener realTimeMessageReceivedListener) {
            realTimeMessageReceivedListener.onRealTimeMessageReceived(this.f1861Zd);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class NearbyPlayerDetectedNotifier implements C0687d.C0689b<OnNearbyPlayerDetectedListener> {

        /* renamed from: Ze */
        private final Player f1862Ze;

        /* renamed from: a */
        public void mo10998c(OnNearbyPlayerDetectedListener onNearbyPlayerDetectedListener) {
            onNearbyPlayerDetectedListener.mo13045a(this.f1862Ze);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Acls.LoadAclResult> f1863Ea;

        NotifyAclLoadedBinderCallback(BaseImplementation.C0670b<Acls.LoadAclResult> bVar) {
            this.f1863Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: C */
        public void mo13315C(DataHolder dataHolder) {
            this.f1863Ea.mo10914b(new LoadAclResultImpl(dataHolder));
        }
    }

    private static final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Status> f1864Ea;

        NotifyAclUpdatedBinderCallback(BaseImplementation.C0670b<Status> bVar) {
            this.f1864Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: dO */
        public void mo13345dO(int i) {
            this.f1864Ea.mo10914b(new Status(i));
        }
    }

    private static final class OpenSnapshotResultImpl extends C0674b implements Snapshots.OpenSnapshotResult {

        /* renamed from: Zf */
        private final Snapshot f1865Zf;

        /* renamed from: Zg */
        private final String f1866Zg;

        /* renamed from: Zh */
        private final Snapshot f1867Zh;

        /* renamed from: Zi */
        private final Contents f1868Zi;

        /* renamed from: Zj */
        private final SnapshotContents f1869Zj;

        OpenSnapshotResultImpl(DataHolder dataHolder, Contents contents) {
            this(dataHolder, (String) null, contents, (Contents) null, (Contents) null);
        }

        /* JADX INFO: finally extract failed */
        OpenSnapshotResultImpl(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            super(dataHolder);
            SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
            try {
                SnapshotEntity snapshotEntity = null;
                if (snapshotMetadataBuffer.getCount() == 0) {
                    this.f1865Zf = null;
                } else {
                    boolean z = true;
                    if (snapshotMetadataBuffer.getCount() == 1) {
                        if (dataHolder.getStatusCode() == 4004) {
                            z = false;
                        }
                        C1742je.m5152K(z);
                        this.f1865Zf = new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(contents));
                    } else {
                        this.f1865Zf = new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(contents));
                        snapshotEntity = new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer.get(1)), new SnapshotContentsEntity(contents2));
                    }
                }
                this.f1867Zh = snapshotEntity;
                snapshotMetadataBuffer.release();
                this.f1866Zg = str;
                this.f1868Zi = contents3;
                this.f1869Zj = new SnapshotContentsEntity(contents3);
            } catch (Throwable th) {
                snapshotMetadataBuffer.release();
                throw th;
            }
        }

        public String getConflictId() {
            return this.f1866Zg;
        }

        public Snapshot getConflictingSnapshot() {
            return this.f1867Zh;
        }

        public SnapshotContents getResolutionSnapshotContents() {
            return this.f1869Zj;
        }

        public Snapshot getSnapshot() {
            return this.f1865Zf;
        }
    }

    private static final class OwnerCoverPhotoUrisLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Players.LoadOwnerCoverPhotoUrisResult> f1870Ea;

        OwnerCoverPhotoUrisLoadedBinderCallback(BaseImplementation.C0670b<Players.LoadOwnerCoverPhotoUrisResult> bVar) {
            this.f1870Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: d */
        public void mo13342d(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f1870Ea.mo10914b(new LoadOwnerCoverPhotoUrisResultImpl(i, bundle));
        }
    }

    private static final class P2PConnectedNotifier implements C0687d.C0689b<RoomStatusUpdateListener> {

        /* renamed from: Zk */
        private final String f1871Zk;

        P2PConnectedNotifier(String str) {
            this.f1871Zk = str;
        }

        /* renamed from: a */
        public void mo10998c(RoomStatusUpdateListener roomStatusUpdateListener) {
            roomStatusUpdateListener.onP2PConnected(this.f1871Zk);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class P2PDisconnectedNotifier implements C0687d.C0689b<RoomStatusUpdateListener> {

        /* renamed from: Zk */
        private final String f1872Zk;

        P2PDisconnectedNotifier(String str) {
            this.f1872Zk = str;
        }

        /* renamed from: a */
        public void mo10998c(RoomStatusUpdateListener roomStatusUpdateListener) {
            roomStatusUpdateListener.onP2PDisconnected(this.f1872Zk);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class PeerConnectedNotifier extends AbstractPeerStatusNotifier {
        PeerConnectedNotifier(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13541a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeersConnected(room, arrayList);
        }
    }

    private static final class PeerDeclinedNotifier extends AbstractPeerStatusNotifier {
        PeerDeclinedNotifier(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13541a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerDeclined(room, arrayList);
        }
    }

    private static final class PeerDisconnectedNotifier extends AbstractPeerStatusNotifier {
        PeerDisconnectedNotifier(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13541a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeersDisconnected(room, arrayList);
        }
    }

    private static final class PeerInvitedToRoomNotifier extends AbstractPeerStatusNotifier {
        PeerInvitedToRoomNotifier(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13541a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerInvitedToRoom(room, arrayList);
        }
    }

    private static final class PeerJoinedRoomNotifier extends AbstractPeerStatusNotifier {
        PeerJoinedRoomNotifier(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13541a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerJoined(room, arrayList);
        }
    }

    private static final class PeerLeftRoomNotifier extends AbstractPeerStatusNotifier {
        PeerLeftRoomNotifier(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13541a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerLeft(room, arrayList);
        }
    }

    private static final class PlayerLeaderboardScoreLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Leaderboards.LoadPlayerScoreResult> f1873Ea;

        PlayerLeaderboardScoreLoadedBinderCallback(BaseImplementation.C0670b<Leaderboards.LoadPlayerScoreResult> bVar) {
            this.f1873Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: E */
        public void mo13317E(DataHolder dataHolder) {
            this.f1873Ea.mo10914b(new LoadPlayerScoreResultImpl(dataHolder));
        }
    }

    private static final class PlayerXpForGameCategoriesLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Players.LoadXpForGameCategoriesResult> f1874Ea;

        PlayerXpForGameCategoriesLoadedBinderCallback(BaseImplementation.C0670b<Players.LoadXpForGameCategoriesResult> bVar) {
            this.f1874Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: e */
        public void mo13348e(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f1874Ea.mo10914b(new LoadXpForGameCategoriesResultImpl(new Status(i), bundle));
        }
    }

    static final class PlayerXpStreamLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Players.LoadXpStreamResult> f1875Ea;

        PlayerXpStreamLoadedBinderCallback(BaseImplementation.C0670b<Players.LoadXpStreamResult> bVar) {
            this.f1875Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: P */
        public void mo13328P(DataHolder dataHolder) {
            this.f1875Ea.mo10914b(new LoadXpStreamResultImpl(dataHolder));
        }
    }

    private static final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Players.LoadPlayersResult> f1876Ea;

        PlayersLoadedBinderCallback(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar) {
            this.f1876Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: g */
        public void mo13357g(DataHolder dataHolder) {
            this.f1876Ea.mo10914b(new LoadPlayersResultImpl(dataHolder));
        }

        /* renamed from: h */
        public void mo13359h(DataHolder dataHolder) {
            this.f1876Ea.mo10914b(new LoadPlayersResultImpl(dataHolder));
        }
    }

    static final class ProfileSettingsLoadedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Players.LoadProfileSettingsResult> f1877Ea;

        ProfileSettingsLoadedBinderCallback(BaseImplementation.C0670b<Players.LoadProfileSettingsResult> bVar) {
            this.f1877Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: Q */
        public void mo13329Q(DataHolder dataHolder) {
            this.f1877Ea.mo10914b(new LoadProfileSettingsResultImpl(dataHolder));
        }
    }

    private static final class ProfileSettingsUpdatedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Status> f1878Ea;

        ProfileSettingsUpdatedBinderCallback(BaseImplementation.C0670b<Status> bVar) {
            this.f1878Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: dQ */
        public void mo13347dQ(int i) {
            this.f1878Ea.mo10914b(new Status(i));
        }
    }

    private static final class QuestAcceptedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Zl */
        private final BaseImplementation.C0670b<Quests.AcceptQuestResult> f1879Zl;

        public QuestAcceptedBinderCallbacks(BaseImplementation.C0670b<Quests.AcceptQuestResult> bVar) {
            this.f1879Zl = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: L */
        public void mo13324L(DataHolder dataHolder) {
            this.f1879Zl.mo10914b(new AcceptQuestResultImpl(dataHolder));
        }
    }

    private static final class QuestCompletedNotifier implements C0687d.C0689b<QuestUpdateListener> {

        /* renamed from: Yw */
        private final Quest f1880Yw;

        QuestCompletedNotifier(Quest quest) {
            this.f1880Yw = quest;
        }

        /* renamed from: a */
        public void mo10998c(QuestUpdateListener questUpdateListener) {
            questUpdateListener.onQuestCompleted(this.f1880Yw);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class QuestMilestoneClaimBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Zm */
        private final BaseImplementation.C0670b<Quests.ClaimMilestoneResult> f1881Zm;

        /* renamed from: Zn */
        private final String f1882Zn;

        public QuestMilestoneClaimBinderCallbacks(BaseImplementation.C0670b<Quests.ClaimMilestoneResult> bVar, String str) {
            this.f1881Zm = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
            this.f1882Zn = (String) C1785jx.m5359b(str, (Object) "MilestoneId must not be null");
        }

        /* renamed from: K */
        public void mo13323K(DataHolder dataHolder) {
            this.f1881Zm.mo10914b(new ClaimMilestoneResultImpl(dataHolder, this.f1882Zn));
        }
    }

    private static final class QuestUpdateBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Qe */
        private final C0687d<QuestUpdateListener> f1883Qe;

        QuestUpdateBinderCallback(C0687d<QuestUpdateListener> dVar) {
            this.f1883Qe = dVar;
        }

        /* renamed from: T */
        private Quest m2516T(DataHolder dataHolder) {
            QuestBuffer questBuffer = new QuestBuffer(dataHolder);
            try {
                return questBuffer.getCount() > 0 ? (Quest) ((Quest) questBuffer.get(0)).freeze() : null;
            } finally {
                questBuffer.release();
            }
        }

        /* renamed from: M */
        public void mo13325M(DataHolder dataHolder) {
            Quest T = m2516T(dataHolder);
            if (T != null) {
                this.f1883Qe.mo11009a(new QuestCompletedNotifier(T));
            }
        }
    }

    private static final class QuestsLoadedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Zo */
        private final BaseImplementation.C0670b<Quests.LoadQuestsResult> f1884Zo;

        public QuestsLoadedBinderCallbacks(BaseImplementation.C0670b<Quests.LoadQuestsResult> bVar) {
            this.f1884Zo = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: O */
        public void mo13327O(DataHolder dataHolder) {
            this.f1884Zo.mo10914b(new LoadQuestsResultImpl(dataHolder));
        }
    }

    private static final class RealTimeMessageSentNotifier implements C0687d.C0689b<RealTimeMultiplayer.ReliableMessageSentCallback> {

        /* renamed from: Iv */
        private final int f1885Iv;

        /* renamed from: Zp */
        private final String f1886Zp;

        /* renamed from: Zq */
        private final int f1887Zq;

        RealTimeMessageSentNotifier(int i, int i2, String str) {
            this.f1885Iv = i;
            this.f1887Zq = i2;
            this.f1886Zp = str;
        }

        /* renamed from: a */
        public void mo10998c(RealTimeMultiplayer.ReliableMessageSentCallback reliableMessageSentCallback) {
            if (reliableMessageSentCallback != null) {
                reliableMessageSentCallback.onRealTimeMessageSent(this.f1885Iv, this.f1887Zq, this.f1886Zp);
            }
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class RealTimeReliableMessageBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Zr */
        final C0687d<RealTimeMultiplayer.ReliableMessageSentCallback> f1888Zr;

        public RealTimeReliableMessageBinderCallbacks(C0687d<RealTimeMultiplayer.ReliableMessageSentCallback> dVar) {
            this.f1888Zr = dVar;
        }

        /* renamed from: b */
        public void mo13336b(int i, int i2, String str) {
            if (this.f1888Zr != null) {
                this.f1888Zr.mo11009a(new RealTimeMessageSentNotifier(i, i2, str));
            }
        }
    }

    private static final class RequestReceivedBinderCallback extends AbstractGamesCallbacks {

        /* renamed from: Qe */
        private final C0687d<OnRequestReceivedListener> f1889Qe;

        RequestReceivedBinderCallback(C0687d<OnRequestReceivedListener> dVar) {
            this.f1889Qe = dVar;
        }

        /* renamed from: o */
        public void mo13367o(DataHolder dataHolder) {
            GameRequestBuffer gameRequestBuffer = new GameRequestBuffer(dataHolder);
            try {
                GameRequest gameRequest = gameRequestBuffer.getCount() > 0 ? (GameRequest) ((GameRequest) gameRequestBuffer.get(0)).freeze() : null;
                if (gameRequest != null) {
                    this.f1889Qe.mo11009a(new RequestReceivedNotifier(gameRequest));
                }
            } finally {
                gameRequestBuffer.release();
            }
        }

        public void onRequestRemoved(String str) {
            this.f1889Qe.mo11009a(new RequestRemovedNotifier(str));
        }
    }

    private static final class RequestReceivedNotifier implements C0687d.C0689b<OnRequestReceivedListener> {

        /* renamed from: Zs */
        private final GameRequest f1890Zs;

        RequestReceivedNotifier(GameRequest gameRequest) {
            this.f1890Zs = gameRequest;
        }

        /* renamed from: a */
        public void mo10998c(OnRequestReceivedListener onRequestReceivedListener) {
            onRequestReceivedListener.onRequestReceived(this.f1890Zs);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class RequestRemovedNotifier implements C0687d.C0689b<OnRequestReceivedListener> {

        /* renamed from: Zt */
        private final String f1891Zt;

        RequestRemovedNotifier(String str) {
            this.f1891Zt = str;
        }

        /* renamed from: a */
        public void mo10998c(OnRequestReceivedListener onRequestReceivedListener) {
            onRequestReceivedListener.onRequestRemoved(this.f1891Zt);
        }

        /* renamed from: gG */
        public void mo10999gG() {
        }
    }

    private static final class RequestSentBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Zu */
        private final BaseImplementation.C0670b<Requests.SendRequestResult> f1892Zu;

        public RequestSentBinderCallbacks(BaseImplementation.C0670b<Requests.SendRequestResult> bVar) {
            this.f1892Zu = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: G */
        public void mo13319G(DataHolder dataHolder) {
            this.f1892Zu.mo10914b(new SendRequestResultImpl(dataHolder));
        }
    }

    private static final class RequestSummariesLoadedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Zv */
        private final BaseImplementation.C0670b<Requests.LoadRequestSummariesResult> f1893Zv;

        public RequestSummariesLoadedBinderCallbacks(BaseImplementation.C0670b<Requests.LoadRequestSummariesResult> bVar) {
            this.f1893Zv = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: H */
        public void mo13320H(DataHolder dataHolder) {
            this.f1893Zv.mo10914b(new LoadRequestSummariesResultImpl(dataHolder));
        }
    }

    private static final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Zw */
        private final BaseImplementation.C0670b<Requests.LoadRequestsResult> f1894Zw;

        public RequestsLoadedBinderCallbacks(BaseImplementation.C0670b<Requests.LoadRequestsResult> bVar) {
            this.f1894Zw = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: c */
        public void mo13339c(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f1894Zw.mo10914b(new LoadRequestsResultImpl(new Status(i), bundle));
        }
    }

    private static final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Zx */
        private final BaseImplementation.C0670b<Requests.UpdateRequestsResult> f1895Zx;

        public RequestsUpdatedBinderCallbacks(BaseImplementation.C0670b<Requests.UpdateRequestsResult> bVar) {
            this.f1895Zx = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: F */
        public void mo13318F(DataHolder dataHolder) {
            this.f1895Zx.mo10914b(new UpdateRequestsResultImpl(dataHolder));
        }
    }

    private static final class RoomAutoMatchingNotifier extends AbstractRoomStatusNotifier {
        RoomAutoMatchingNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* renamed from: a */
        public void mo13540a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onRoomAutoMatching(room);
        }
    }

    private static final class RoomBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZA */
        private final C0687d<RealTimeMessageReceivedListener> f1896ZA;

        /* renamed from: Zy */
        private final C0687d<? extends RoomUpdateListener> f1897Zy;

        /* renamed from: Zz */
        private final C0687d<? extends RoomStatusUpdateListener> f1898Zz;

        public RoomBinderCallbacks(C0687d<RoomUpdateListener> dVar) {
            this.f1897Zy = (C0687d) C1785jx.m5359b(dVar, (Object) "Callbacks must not be null");
            this.f1898Zz = null;
            this.f1896ZA = null;
        }

        public RoomBinderCallbacks(C0687d<? extends RoomUpdateListener> dVar, C0687d<? extends RoomStatusUpdateListener> dVar2, C0687d<RealTimeMessageReceivedListener> dVar3) {
            this.f1897Zy = (C0687d) C1785jx.m5359b(dVar, (Object) "Callbacks must not be null");
            this.f1898Zz = dVar2;
            this.f1896ZA = dVar3;
        }

        /* renamed from: A */
        public void mo13313A(DataHolder dataHolder) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new DisconnectedFromRoomNotifier(dataHolder));
            }
        }

        /* renamed from: a */
        public void mo13334a(DataHolder dataHolder, String[] strArr) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new PeerInvitedToRoomNotifier(dataHolder, strArr));
            }
        }

        /* renamed from: b */
        public void mo13338b(DataHolder dataHolder, String[] strArr) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new PeerJoinedRoomNotifier(dataHolder, strArr));
            }
        }

        /* renamed from: c */
        public void mo13341c(DataHolder dataHolder, String[] strArr) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new PeerLeftRoomNotifier(dataHolder, strArr));
            }
        }

        /* renamed from: d */
        public void mo13344d(DataHolder dataHolder, String[] strArr) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new PeerDeclinedNotifier(dataHolder, strArr));
            }
        }

        /* renamed from: e */
        public void mo13350e(DataHolder dataHolder, String[] strArr) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new PeerConnectedNotifier(dataHolder, strArr));
            }
        }

        /* renamed from: f */
        public void mo13354f(DataHolder dataHolder, String[] strArr) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new PeerDisconnectedNotifier(dataHolder, strArr));
            }
        }

        public void onLeftRoom(int i, String str) {
            this.f1897Zy.mo11009a(new LeftRoomNotifier(i, str));
        }

        public void onP2PConnected(String str) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new P2PConnectedNotifier(str));
            }
        }

        public void onP2PDisconnected(String str) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new P2PDisconnectedNotifier(str));
            }
        }

        public void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) {
            if (this.f1896ZA != null) {
                this.f1896ZA.mo11009a(new MessageReceivedNotifier(realTimeMessage));
            }
        }

        /* renamed from: u */
        public void mo13380u(DataHolder dataHolder) {
            this.f1897Zy.mo11009a(new RoomCreatedNotifier(dataHolder));
        }

        /* renamed from: v */
        public void mo13381v(DataHolder dataHolder) {
            this.f1897Zy.mo11009a(new JoinedRoomNotifier(dataHolder));
        }

        /* renamed from: w */
        public void mo13382w(DataHolder dataHolder) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new RoomConnectingNotifier(dataHolder));
            }
        }

        /* renamed from: x */
        public void mo13383x(DataHolder dataHolder) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new RoomAutoMatchingNotifier(dataHolder));
            }
        }

        /* renamed from: y */
        public void mo13384y(DataHolder dataHolder) {
            this.f1897Zy.mo11009a(new RoomConnectedNotifier(dataHolder));
        }

        /* renamed from: z */
        public void mo13385z(DataHolder dataHolder) {
            if (this.f1898Zz != null) {
                this.f1898Zz.mo11009a(new ConnectedToRoomNotifier(dataHolder));
            }
        }
    }

    private static final class RoomConnectedNotifier extends AbstractRoomNotifier {
        RoomConnectedNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* renamed from: a */
        public void mo13543a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onRoomConnected(i, room);
        }
    }

    private static final class RoomConnectingNotifier extends AbstractRoomStatusNotifier {
        RoomConnectingNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* renamed from: a */
        public void mo13540a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onRoomConnecting(room);
        }
    }

    private static final class RoomCreatedNotifier extends AbstractRoomNotifier {
        public RoomCreatedNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        /* renamed from: a */
        public void mo13543a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onRoomCreated(i, room);
        }
    }

    private static final class SendRequestResultImpl extends C0674b implements Requests.SendRequestResult {

        /* renamed from: Zs */
        private final GameRequest f1899Zs;

        SendRequestResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            GameRequestBuffer gameRequestBuffer = new GameRequestBuffer(dataHolder);
            try {
                if (gameRequestBuffer.getCount() > 0) {
                    this.f1899Zs = (GameRequest) ((GameRequest) gameRequestBuffer.get(0)).freeze();
                } else {
                    this.f1899Zs = null;
                }
            } finally {
                gameRequestBuffer.release();
            }
        }
    }

    private static final class SignOutCompleteBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Status> f1900Ea;

        public SignOutCompleteBinderCallbacks(BaseImplementation.C0670b<Status> bVar) {
            this.f1900Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: fK */
        public void mo13355fK() {
            this.f1900Ea.mo10914b(new Status(0));
        }
    }

    private static final class SnapshotCommittedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZB */
        private final BaseImplementation.C0670b<Snapshots.CommitSnapshotResult> f1901ZB;

        public SnapshotCommittedBinderCallbacks(BaseImplementation.C0670b<Snapshots.CommitSnapshotResult> bVar) {
            this.f1901ZB = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: J */
        public void mo13322J(DataHolder dataHolder) {
            this.f1901ZB.mo10914b(new CommitSnapshotResultImpl(dataHolder));
        }
    }

    static final class SnapshotDeletedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Snapshots.DeleteSnapshotResult> f1902Ea;

        public SnapshotDeletedBinderCallbacks(BaseImplementation.C0670b<Snapshots.DeleteSnapshotResult> bVar) {
            this.f1902Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: i */
        public void mo13360i(int i, String str) {
            this.f1902Ea.mo10914b(new DeleteSnapshotResultImpl(i, str));
        }
    }

    private static final class SnapshotOpenedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZC */
        private final BaseImplementation.C0670b<Snapshots.OpenSnapshotResult> f1903ZC;

        public SnapshotOpenedBinderCallbacks(BaseImplementation.C0670b<Snapshots.OpenSnapshotResult> bVar) {
            this.f1903ZC = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: a */
        public void mo13332a(DataHolder dataHolder, Contents contents) {
            this.f1903ZC.mo10914b(new OpenSnapshotResultImpl(dataHolder, contents));
        }

        /* renamed from: a */
        public void mo13333a(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            this.f1903ZC.mo10914b(new OpenSnapshotResultImpl(dataHolder, str, contents, contents2, contents3));
        }
    }

    private static final class SnapshotsLoadedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZD */
        private final BaseImplementation.C0670b<Snapshots.LoadSnapshotsResult> f1904ZD;

        public SnapshotsLoadedBinderCallbacks(BaseImplementation.C0670b<Snapshots.LoadSnapshotsResult> bVar) {
            this.f1904ZD = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: I */
        public void mo13321I(DataHolder dataHolder) {
            this.f1904ZD.mo10914b(new LoadSnapshotsResultImpl(dataHolder));
        }
    }

    private static final class SubmitScoreBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<Leaderboards.SubmitScoreResult> f1905Ea;

        public SubmitScoreBinderCallbacks(BaseImplementation.C0670b<Leaderboards.SubmitScoreResult> bVar) {
            this.f1905Ea = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: f */
        public void mo13353f(DataHolder dataHolder) {
            this.f1905Ea.mo10914b(new SubmitScoreResultImpl(dataHolder));
        }
    }

    private static final class SubmitScoreResultImpl extends C0674b implements Leaderboards.SubmitScoreResult {

        /* renamed from: ZE */
        private final ScoreSubmissionData f1906ZE;

        public SubmitScoreResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.f1906ZE = new ScoreSubmissionData(dataHolder);
            } finally {
                dataHolder.close();
            }
        }

        public ScoreSubmissionData getScoreData() {
            return this.f1906ZE;
        }
    }

    private static final class TurnBasedMatchCanceledBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZF */
        private final BaseImplementation.C0670b<TurnBasedMultiplayer.CancelMatchResult> f1907ZF;

        public TurnBasedMatchCanceledBinderCallbacks(BaseImplementation.C0670b<TurnBasedMultiplayer.CancelMatchResult> bVar) {
            this.f1907ZF = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: h */
        public void mo13358h(int i, String str) {
            this.f1907ZF.mo10914b(new CancelMatchResultImpl(new Status(i), str));
        }
    }

    private static final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZG */
        private final BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult> f1908ZG;

        public TurnBasedMatchInitiatedBinderCallbacks(BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult> bVar) {
            this.f1908ZG = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: q */
        public void mo13376q(DataHolder dataHolder) {
            this.f1908ZG.mo10914b(new InitiateMatchResultImpl(dataHolder));
        }
    }

    private static final class TurnBasedMatchLeftBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZH */
        private final BaseImplementation.C0670b<TurnBasedMultiplayer.LeaveMatchResult> f1909ZH;

        public TurnBasedMatchLeftBinderCallbacks(BaseImplementation.C0670b<TurnBasedMultiplayer.LeaveMatchResult> bVar) {
            this.f1909ZH = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: s */
        public void mo13378s(DataHolder dataHolder) {
            this.f1909ZH.mo10914b(new LeaveMatchResultImpl(dataHolder));
        }
    }

    private static final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZI */
        private final BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchResult> f1910ZI;

        public TurnBasedMatchLoadedBinderCallbacks(BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchResult> bVar) {
            this.f1910ZI = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: p */
        public void mo13375p(DataHolder dataHolder) {
            this.f1910ZI.mo10914b(new LoadMatchResultImpl(dataHolder));
        }
    }

    private static abstract class TurnBasedMatchResult extends C0674b {

        /* renamed from: Zc */
        final TurnBasedMatch f1911Zc;

        TurnBasedMatchResult(DataHolder dataHolder) {
            super(dataHolder);
            TurnBasedMatchBuffer turnBasedMatchBuffer = new TurnBasedMatchBuffer(dataHolder);
            try {
                if (turnBasedMatchBuffer.getCount() > 0) {
                    this.f1911Zc = (TurnBasedMatch) ((TurnBasedMatch) turnBasedMatchBuffer.get(0)).freeze();
                } else {
                    this.f1911Zc = null;
                }
            } finally {
                turnBasedMatchBuffer.release();
            }
        }

        public TurnBasedMatch getMatch() {
            return this.f1911Zc;
        }
    }

    private static final class TurnBasedMatchUpdatedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZJ */
        private final BaseImplementation.C0670b<TurnBasedMultiplayer.UpdateMatchResult> f1912ZJ;

        public TurnBasedMatchUpdatedBinderCallbacks(BaseImplementation.C0670b<TurnBasedMultiplayer.UpdateMatchResult> bVar) {
            this.f1912ZJ = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: r */
        public void mo13377r(DataHolder dataHolder) {
            this.f1912ZJ.mo10914b(new UpdateMatchResultImpl(dataHolder));
        }
    }

    private static final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks {

        /* renamed from: ZK */
        private final BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchesResult> f1913ZK;

        public TurnBasedMatchesLoadedBinderCallbacks(BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchesResult> bVar) {
            this.f1913ZK = (BaseImplementation.C0670b) C1785jx.m5359b(bVar, (Object) "Holder must not be null");
        }

        /* renamed from: b */
        public void mo13337b(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f1913ZK.mo10914b(new LoadMatchesResultImpl(new Status(i), bundle));
        }
    }

    private static final class UpdateAchievementResultImpl implements Achievements.UpdateAchievementResult {

        /* renamed from: Eb */
        private final Status f1914Eb;

        /* renamed from: Xx */
        private final String f1915Xx;

        UpdateAchievementResultImpl(int i, String str) {
            this.f1914Eb = new Status(i);
            this.f1915Xx = str;
        }

        public String getAchievementId() {
            return this.f1915Xx;
        }

        public Status getStatus() {
            return this.f1914Eb;
        }
    }

    private static final class UpdateMatchResultImpl extends TurnBasedMatchResult implements TurnBasedMultiplayer.UpdateMatchResult {
        UpdateMatchResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class UpdateRequestsResultImpl extends C0674b implements Requests.UpdateRequestsResult {

        /* renamed from: ZL */
        private final RequestUpdateOutcomes f1916ZL;

        UpdateRequestsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.f1916ZL = RequestUpdateOutcomes.m3665W(dataHolder);
        }

        public Set<String> getRequestIds() {
            return this.f1916ZL.getRequestIds();
        }

        public int getRequestOutcome(String str) {
            return this.f1916ZL.getRequestOutcome(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GamesClientImpl(Context context, Looper looper, String str, String str2, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String[] strArr, int i, View view, Games.GamesOptions gamesOptions) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f1783Yl = str;
        this.f1781DZ = (String) C1785jx.m5364i(str2);
        this.f1789Yr = new Binder();
        this.f1784Ym = new HashMap();
        this.f1787Yp = PopupManager.m3207a(this, i);
        mo13504k(view);
        this.f1790Ys = (long) hashCode();
        this.f1791Yt = gamesOptions;
        registerConnectionCallbacks((GoogleApiClient.ConnectionCallbacks) this);
        registerConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static Room m2280R(DataHolder dataHolder) {
        RoomBuffer roomBuffer = new RoomBuffer(dataHolder);
        try {
            return roomBuffer.getCount() > 0 ? (Room) ((Room) roomBuffer.get(0)).freeze() : null;
        } finally {
            roomBuffer.release();
        }
    }

    /* renamed from: bB */
    private RealTimeSocket m2282bB(String str) {
        RealTimeSocket bD = C1840ll.m5540ii() ? m2284bD(str) : m2283bC(str);
        if (bD != null) {
            this.f1784Ym.put(str, bD);
        }
        return bD;
    }

    /* renamed from: bC */
    private RealTimeSocket m2283bC(String str) {
        try {
            String bH = ((IGamesService) mo15820hw()).mo13674bH(str);
            if (bH == null) {
                return null;
            }
            LocalSocket localSocket = new LocalSocket();
            localSocket.connect(new LocalSocketAddress(bH));
            return new RealTimeSocketImpl(localSocket, str);
        } catch (RemoteException e) {
            GamesLog.m2570p("GamesClientImpl", "Unable to create socket. Service died.");
            return null;
        } catch (IOException e2) {
            GamesLog.m2570p("GamesClientImpl", "connect() call failed on socket: " + e2.getMessage());
            return null;
        }
    }

    /* renamed from: bD */
    private RealTimeSocket m2284bD(String str) {
        try {
            ParcelFileDescriptor bN = ((IGamesService) mo15820hw()).mo13680bN(str);
            if (bN != null) {
                GamesLog.m2568n("GamesClientImpl", "Created native libjingle socket.");
                return new LibjingleNativeSocket(bN);
            }
            GamesLog.m2570p("GamesClientImpl", "Unable to create socket for " + str);
            return null;
        } catch (RemoteException e) {
            GamesLog.m2570p("GamesClientImpl", "Unable to create socket. Service died.");
            return null;
        }
    }

    /* renamed from: lD */
    private void m2285lD() {
        for (RealTimeSocket close : this.f1784Ym.values()) {
            try {
                close.close();
            } catch (IOException e) {
                GamesLog.m2567c("GamesClientImpl", "IOException:", e);
            }
        }
        this.f1784Ym.clear();
    }

    /* renamed from: lg */
    private void m2286lg() {
        this.f1785Yn = null;
    }

    /* renamed from: a */
    public int mo13395a(C0687d<RealTimeMultiplayer.ReliableMessageSentCallback> dVar, byte[] bArr, String str, String str2) {
        try {
            return ((IGamesService) mo15820hw()).mo13588a((IGamesCallbacks) new RealTimeReliableMessageBinderCallbacks(dVar), bArr, str, str2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: a */
    public int mo13396a(byte[] bArr, String str, String[] strArr) {
        C1785jx.m5359b(strArr, (Object) "Participant IDs must not be null");
        try {
            return ((IGamesService) mo15820hw()).mo13649b(bArr, str, strArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: a */
    public Intent mo13397a(int i, int i2, boolean z) {
        try {
            return ((IGamesService) mo15820hw()).mo13589a(i, i2, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: a */
    public Intent mo13398a(int i, byte[] bArr, int i2, Bitmap bitmap, String str) {
        try {
            Intent a = ((IGamesService) mo15820hw()).mo13590a(i, bArr, i2, str);
            C1785jx.m5359b(bitmap, (Object) "Must provide a non null icon");
            a.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
            return a;
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: a */
    public Intent mo13399a(Room room, int i) {
        try {
            return ((IGamesService) mo15820hw()).mo13594a((RoomEntity) room.freeze(), i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: a */
    public Intent mo13400a(String str, boolean z, boolean z2, int i) {
        try {
            return ((IGamesService) mo15820hw()).mo13595a(str, z, z2, i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11710a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null) {
            this.f1788Yq = bundle.getBoolean("show_welcome_popup");
        }
        super.mo11710a(i, iBinder, bundle);
    }

    /* renamed from: a */
    public void mo13401a(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            try {
                ((IGamesService) mo15820hw()).mo13599a(iBinder, bundle);
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "service died");
            }
        }
    }

    /* renamed from: a */
    public void mo13402a(BaseImplementation.C0670b<Requests.LoadRequestsResult> bVar, int i, int i2, int i3) {
        try {
            ((IGamesService) mo15820hw()).mo13603a((IGamesCallbacks) new RequestsLoadedBinderCallbacks(bVar), i, i2, i3);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13403a(BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> bVar, int i, int i2, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13604a((IGamesCallbacks) new ExtendedGamesLoadedBinderCallback(bVar), i, i2, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13404a(BaseImplementation.C0670b<AppContents.LoadAppContentResult> bVar, int i, String str, String[] strArr, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13606a((IGamesCallbacks) new AppContentLoadedBinderCallbacks(bVar), i, str, strArr, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13405a(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13607a((IGamesCallbacks) new PlayersLoadedBinderCallback(bVar), i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13406a(BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchesResult> bVar, int i, int[] iArr) {
        try {
            ((IGamesService) mo15820hw()).mo13608a((IGamesCallbacks) new TurnBasedMatchesLoadedBinderCallbacks(bVar), i, iArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13407a(BaseImplementation.C0670b<Leaderboards.LoadScoresResult> bVar, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        try {
            ((IGamesService) mo15820hw()).mo13611a((IGamesCallbacks) new LeaderboardScoresLoadedBinderCallback(bVar), leaderboardScoreBuffer.mo14290mH().mo14291mI(), i, i2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13408a(BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult> bVar, TurnBasedMatchConfig turnBasedMatchConfig) {
        try {
            ((IGamesService) mo15820hw()).mo13605a((IGamesCallbacks) new TurnBasedMatchInitiatedBinderCallbacks(bVar), turnBasedMatchConfig.getVariant(), turnBasedMatchConfig.mo14482mO(), turnBasedMatchConfig.getInvitedPlayerIds(), turnBasedMatchConfig.getAutoMatchCriteria());
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13409a(BaseImplementation.C0670b<Snapshots.CommitSnapshotResult> bVar, Snapshot snapshot, SnapshotMetadataChange snapshotMetadataChange) {
        SnapshotContents snapshotContents = snapshot.getSnapshotContents();
        C1785jx.m5355a(!snapshotContents.isClosed(), "Snapshot already closed");
        C0702a mT = snapshotMetadataChange.mo14605mT();
        if (mT != null) {
            mT.mo11068a(getContext().getCacheDir());
        }
        Contents ir = snapshotContents.mo14569ir();
        snapshotContents.close();
        try {
            ((IGamesService) mo15820hw()).mo13625a((IGamesCallbacks) new SnapshotCommittedBinderCallbacks(bVar), snapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity) snapshotMetadataChange, ir);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13410a(BaseImplementation.C0670b<Achievements.UpdateAchievementResult> bVar, String str) {
        AchievementUpdatedBinderCallback achievementUpdatedBinderCallback;
        if (bVar == null) {
            achievementUpdatedBinderCallback = null;
        } else {
            try {
                achievementUpdatedBinderCallback = new AchievementUpdatedBinderCallback(bVar);
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "service died");
                return;
            }
        }
        ((IGamesService) mo15820hw()).mo13624a((IGamesCallbacks) achievementUpdatedBinderCallback, str, this.f1787Yp.mo13856lV(), this.f1787Yp.mo13855lU());
    }

    /* renamed from: a */
    public void mo13411a(BaseImplementation.C0670b<Achievements.UpdateAchievementResult> bVar, String str, int i) {
        AchievementUpdatedBinderCallback achievementUpdatedBinderCallback;
        if (bVar == null) {
            achievementUpdatedBinderCallback = null;
        } else {
            try {
                achievementUpdatedBinderCallback = new AchievementUpdatedBinderCallback(bVar);
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "service died");
                return;
            }
        }
        ((IGamesService) mo15820hw()).mo13617a((IGamesCallbacks) achievementUpdatedBinderCallback, str, i, this.f1787Yp.mo13856lV(), this.f1787Yp.mo13855lU());
    }

    /* renamed from: a */
    public void mo13412a(BaseImplementation.C0670b<Leaderboards.LoadScoresResult> bVar, String str, int i, int i2, int i3, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13616a((IGamesCallbacks) new LeaderboardScoresLoadedBinderCallback(bVar), str, i, i2, i3, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13413a(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, String str, int i, boolean z, boolean z2) {
        if (((str.hashCode() == 156408498 && str.equals("played_with")) ? (char) 0 : 65535) != 0) {
            throw new IllegalArgumentException("Invalid player collection: " + str);
        }
        try {
            ((IGamesService) mo15820hw()).mo13701d(new PlayersLoadedBinderCallback(bVar), str, i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13414a(BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> bVar, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        try {
            ((IGamesService) mo15820hw()).mo13620a((IGamesCallbacks) new ExtendedGamesLoadedBinderCallback(bVar), str, i, z, z2, z3, z4);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13415a(BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchesResult> bVar, String str, int i, int[] iArr) {
        try {
            ((IGamesService) mo15820hw()).mo13621a((IGamesCallbacks) new TurnBasedMatchesLoadedBinderCallbacks(bVar), str, i, iArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13416a(BaseImplementation.C0670b<Leaderboards.SubmitScoreResult> bVar, String str, long j, String str2) {
        SubmitScoreBinderCallbacks submitScoreBinderCallbacks;
        if (bVar == null) {
            submitScoreBinderCallbacks = null;
        } else {
            try {
                submitScoreBinderCallbacks = new SubmitScoreBinderCallbacks(bVar);
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "service died");
                return;
            }
        }
        ((IGamesService) mo15820hw()).mo13623a((IGamesCallbacks) submitScoreBinderCallbacks, str, j, str2);
    }

    /* renamed from: a */
    public void mo13417a(BaseImplementation.C0670b<TurnBasedMultiplayer.LeaveMatchResult> bVar, String str, String str2) {
        try {
            ((IGamesService) mo15820hw()).mo13689c((IGamesCallbacks) new TurnBasedMatchLeftBinderCallbacks(bVar), str, str2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13418a(BaseImplementation.C0670b<Leaderboards.LoadPlayerScoreResult> bVar, String str, String str2, int i, int i2) {
        try {
            ((IGamesService) mo15820hw()).mo13627a((IGamesCallbacks) new PlayerLeaderboardScoreLoadedBinderCallback(bVar), str, str2, i, i2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13419a(BaseImplementation.C0670b<Requests.LoadRequestsResult> bVar, String str, String str2, int i, int i2, int i3) {
        try {
            ((IGamesService) mo15820hw()).mo13628a((IGamesCallbacks) new RequestsLoadedBinderCallbacks(bVar), str, str2, i, i2, i3);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13420a(BaseImplementation.C0670b<Leaderboards.LoadScoresResult> bVar, String str, String str2, int i, int i2, int i3, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13629a((IGamesCallbacks) new LeaderboardScoresLoadedBinderCallback(bVar), str, str2, i, i2, i3, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d A[SYNTHETIC, Splitter:B:19:0x004d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13421a(com.google.android.gms.common.api.BaseImplementation.C0670b<com.google.android.gms.games.Players.LoadPlayersResult> r9, java.lang.String r10, java.lang.String r11, int r12, boolean r13, boolean r14) {
        /*
            r8 = this;
            int r0 = r10.hashCode()
            r1 = -1049482625(0xffffffffc1722a7f, float:-15.135375)
            if (r0 == r1) goto L_0x0028
            r1 = 156408498(0x9529ab2, float:2.5350568E-33)
            if (r0 == r1) goto L_0x001e
            r1 = 782949780(0x2eaadd94, float:7.770065E-11)
            if (r0 == r1) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            java.lang.String r0 = "circled"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            goto L_0x0033
        L_0x001e:
            java.lang.String r0 = "played_with"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "nearby"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 2
            goto L_0x0033
        L_0x0032:
            r0 = -1
        L_0x0033:
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x004d;
                case 2: goto L_0x004d;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid player collection: "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x004d:
            android.os.IInterface r0 = r8.mo15820hw()     // Catch:{ RemoteException -> 0x0062 }
            r1 = r0
            com.google.android.gms.games.internal.IGamesService r1 = (com.google.android.gms.games.internal.IGamesService) r1     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.games.internal.GamesClientImpl$PlayersLoadedBinderCallback r2 = new com.google.android.gms.games.internal.GamesClientImpl$PlayersLoadedBinderCallback     // Catch:{ RemoteException -> 0x0062 }
            r2.<init>(r9)     // Catch:{ RemoteException -> 0x0062 }
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.mo13630a((com.google.android.gms.games.internal.IGamesCallbacks) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (boolean) r6, (boolean) r7)     // Catch:{ RemoteException -> 0x0062 }
            return
        L_0x0062:
            r9 = move-exception
            java.lang.String r9 = "GamesClientImpl"
            java.lang.String r10 = "service died"
            com.google.android.gms.games.internal.GamesLog.m2569o(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.internal.GamesClientImpl.mo13421a(com.google.android.gms.common.api.BaseImplementation$b, java.lang.String, java.lang.String, int, boolean, boolean):void");
    }

    /* renamed from: a */
    public void mo13422a(BaseImplementation.C0670b<Snapshots.OpenSnapshotResult> bVar, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
        C1785jx.m5355a(!snapshotContents.isClosed(), "SnapshotContents already closed");
        C0702a mT = snapshotMetadataChange.mo14605mT();
        if (mT != null) {
            mT.mo11068a(getContext().getCacheDir());
        }
        Contents ir = snapshotContents.mo14569ir();
        snapshotContents.close();
        try {
            ((IGamesService) mo15820hw()).mo13631a((IGamesCallbacks) new SnapshotOpenedBinderCallbacks(bVar), str, str2, (SnapshotMetadataChangeEntity) snapshotMetadataChange, ir);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13423a(BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult> bVar, String str, String str2, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13667b((IGamesCallbacks) new LeaderboardsLoadedBinderCallback(bVar), str, str2, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13424a(BaseImplementation.C0670b<Quests.LoadQuestsResult> bVar, String str, String str2, boolean z, String[] strArr) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13635a((IGamesCallbacks) new QuestsLoadedBinderCallbacks(bVar), str, str2, strArr, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13425a(BaseImplementation.C0670b<Quests.LoadQuestsResult> bVar, String str, String str2, int[] iArr, int i, boolean z) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13633a((IGamesCallbacks) new QuestsLoadedBinderCallbacks(bVar), str, str2, iArr, i, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13426a(BaseImplementation.C0670b<Requests.UpdateRequestsResult> bVar, String str, String str2, String[] strArr) {
        try {
            ((IGamesService) mo15820hw()).mo13634a((IGamesCallbacks) new RequestsUpdatedBinderCallbacks(bVar), str, str2, strArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13427a(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, String str, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13717f((IGamesCallbacks) new PlayersLoadedBinderCallback(bVar), str, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13428a(BaseImplementation.C0670b<TurnBasedMultiplayer.UpdateMatchResult> bVar, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) {
        try {
            ((IGamesService) mo15820hw()).mo13637a((IGamesCallbacks) new TurnBasedMatchUpdatedBinderCallbacks(bVar), str, bArr, str2, participantResultArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13429a(BaseImplementation.C0670b<TurnBasedMultiplayer.UpdateMatchResult> bVar, String str, byte[] bArr, ParticipantResult[] participantResultArr) {
        try {
            ((IGamesService) mo15820hw()).mo13638a((IGamesCallbacks) new TurnBasedMatchUpdatedBinderCallbacks(bVar), str, bArr, participantResultArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13430a(BaseImplementation.C0670b<Requests.SendRequestResult> bVar, String str, String[] strArr, int i, byte[] bArr, int i2) {
        try {
            ((IGamesService) mo15820hw()).mo13640a((IGamesCallbacks) new RequestSentBinderCallbacks(bVar), str, strArr, i, bArr, i2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13431a(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13692c((IGamesCallbacks) new PlayersLoadedBinderCallback(bVar), z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13432a(BaseImplementation.C0670b<Status> bVar, boolean z, Bundle bundle) {
        try {
            ((IGamesService) mo15820hw()).mo13642a((IGamesCallbacks) new ContactSettingsUpdatedBinderCallback(bVar), z, bundle);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13433a(BaseImplementation.C0670b<Events.LoadEventsResult> bVar, boolean z, String... strArr) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13643a((IGamesCallbacks) new EventsLoadedBinderCallback(bVar), z, strArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13434a(BaseImplementation.C0670b<Quests.LoadQuestsResult> bVar, int[] iArr, int i, boolean z) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13645a((IGamesCallbacks) new QuestsLoadedBinderCallbacks(bVar), iArr, i, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13435a(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, String[] strArr) {
        try {
            ((IGamesService) mo15820hw()).mo13693c((IGamesCallbacks) new PlayersLoadedBinderCallback(bVar), strArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13436a(C0687d<OnInvitationReceivedListener> dVar) {
        try {
            ((IGamesService) mo15820hw()).mo13609a((IGamesCallbacks) new InvitationReceivedBinderCallback(dVar), this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13437a(C0687d<RoomUpdateListener> dVar, C0687d<RoomStatusUpdateListener> dVar2, C0687d<RealTimeMessageReceivedListener> dVar3, RoomConfig roomConfig) {
        m2285lD();
        try {
            ((IGamesService) mo15820hw()).mo13612a((IGamesCallbacks) new RoomBinderCallbacks(dVar, dVar2, dVar3), (IBinder) this.f1789Yr, roomConfig.getVariant(), roomConfig.getInvitedPlayerIds(), roomConfig.getAutoMatchCriteria(), roomConfig.isSocketEnabled(), this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13438a(C0687d<RoomUpdateListener> dVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13686c((IGamesCallbacks) new RoomBinderCallbacks(dVar), str);
            m2285lD();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: a */
    public void mo13439a(Snapshot snapshot) {
        SnapshotContents snapshotContents = snapshot.getSnapshotContents();
        C1785jx.m5355a(!snapshotContents.isClosed(), "Snapshot already closed");
        Contents ir = snapshotContents.mo14569ir();
        snapshotContents.close();
        try {
            ((IGamesService) mo15820hw()).mo13600a(ir);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        String locale = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f1791Yt.f1668Xa);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.f1791Yt.f1669Xb);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.f1791Yt.f1670Xc);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.f1791Yt.f1671Xd);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.f1791Yt.f1672Xe);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.f1791Yt.f1673Xf);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.f1791Yt.f1674Xg);
        jtVar.mo15896a(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f1781DZ, mo15819hv(), this.f1783Yl, this.f1787Yp.mo13856lV(), locale, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aC */
    public IGamesService mo11721l(IBinder iBinder) {
        return IGamesService.Stub.m2898aE(iBinder);
    }

    /* renamed from: b */
    public Intent mo13441b(int i, int i2, boolean z) {
        try {
            return ((IGamesService) mo15820hw()).mo13650b(i, i2, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: b */
    public Intent mo13442b(int[] iArr) {
        try {
            return ((IGamesService) mo15820hw()).mo13651b(iArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: b */
    public void mo13443b(BaseImplementation.C0670b<Status> bVar) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13601a((IGamesCallbacks) new SignOutCompleteBinderCallbacks(bVar));
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13444b(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13654b((IGamesCallbacks) new PlayersLoadedBinderCallback(bVar), i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13445b(BaseImplementation.C0670b<Achievements.UpdateAchievementResult> bVar, String str) {
        AchievementUpdatedBinderCallback achievementUpdatedBinderCallback;
        if (bVar == null) {
            achievementUpdatedBinderCallback = null;
        } else {
            try {
                achievementUpdatedBinderCallback = new AchievementUpdatedBinderCallback(bVar);
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "service died");
                return;
            }
        }
        ((IGamesService) mo15820hw()).mo13663b((IGamesCallbacks) achievementUpdatedBinderCallback, str, this.f1787Yp.mo13856lV(), this.f1787Yp.mo13855lU());
    }

    /* renamed from: b */
    public void mo13446b(BaseImplementation.C0670b<Achievements.UpdateAchievementResult> bVar, String str, int i) {
        AchievementUpdatedBinderCallback achievementUpdatedBinderCallback;
        if (bVar == null) {
            achievementUpdatedBinderCallback = null;
        } else {
            try {
                achievementUpdatedBinderCallback = new AchievementUpdatedBinderCallback(bVar);
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "service died");
                return;
            }
        }
        ((IGamesService) mo15820hw()).mo13660b((IGamesCallbacks) achievementUpdatedBinderCallback, str, i, this.f1787Yp.mo13856lV(), this.f1787Yp.mo13855lU());
    }

    /* renamed from: b */
    public void mo13447b(BaseImplementation.C0670b<Leaderboards.LoadScoresResult> bVar, String str, int i, int i2, int i3, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13659b((IGamesCallbacks) new LeaderboardScoresLoadedBinderCallback(bVar), str, i, i2, i3, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13448b(BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> bVar, String str, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13619a((IGamesCallbacks) new ExtendedGamesLoadedBinderCallback(bVar), str, i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13449b(BaseImplementation.C0670b<Quests.ClaimMilestoneResult> bVar, String str, String str2) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13716f((IGamesCallbacks) new QuestMilestoneClaimBinderCallbacks(bVar, str2), str, str2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13450b(BaseImplementation.C0670b<Leaderboards.LoadScoresResult> bVar, String str, String str2, int i, int i2, int i3, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13665b(new LeaderboardScoresLoadedBinderCallback(bVar), str, str2, i, i2, i3, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13451b(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, String str, String str2, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13666b((IGamesCallbacks) new PlayersLoadedBinderCallback(bVar), str, str2, i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13452b(BaseImplementation.C0670b<Achievements.LoadAchievementsResult> bVar, String str, String str2, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13632a((IGamesCallbacks) new AchievementsLoadedBinderCallback(bVar), str, str2, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13453b(BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult> bVar, String str, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13691c((IGamesCallbacks) new LeaderboardsLoadedBinderCallback(bVar), str, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13454b(BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult> bVar, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13669b((IGamesCallbacks) new LeaderboardsLoadedBinderCallback(bVar), z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13455b(BaseImplementation.C0670b<Quests.LoadQuestsResult> bVar, boolean z, String[] strArr) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13647a((IGamesCallbacks) new QuestsLoadedBinderCallbacks(bVar), strArr, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13456b(BaseImplementation.C0670b<Requests.UpdateRequestsResult> bVar, String[] strArr) {
        try {
            ((IGamesService) mo15820hw()).mo13646a((IGamesCallbacks) new RequestsUpdatedBinderCallbacks(bVar), strArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13457b(C0687d<OnTurnBasedMatchUpdateReceivedListener> dVar) {
        try {
            ((IGamesService) mo15820hw()).mo13655b((IGamesCallbacks) new MatchUpdateReceivedBinderCallback(dVar), this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: b */
    public void mo13458b(C0687d<RoomUpdateListener> dVar, C0687d<RoomStatusUpdateListener> dVar2, C0687d<RealTimeMessageReceivedListener> dVar3, RoomConfig roomConfig) {
        m2285lD();
        try {
            ((IGamesService) mo15820hw()).mo13613a((IGamesCallbacks) new RoomBinderCallbacks(dVar, dVar2, dVar3), (IBinder) this.f1789Yr, roomConfig.getInvitationId(), roomConfig.isSocketEnabled(), this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: bA */
    public void mo13459bA(String str) {
        try {
            ((IGamesService) mo15820hw()).mo13678bL(str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: bE */
    public Intent mo13460bE(String str) {
        try {
            return ((IGamesService) mo15820hw()).mo13672bE(str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: bF */
    public void mo13461bF(String str) {
        try {
            ((IGamesService) mo15820hw()).mo13648a(str, this.f1787Yp.mo13856lV(), this.f1787Yp.mo13855lU());
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.games.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    /* renamed from: c */
    public void mo13462c(BaseImplementation.C0670b<Invitations.LoadInvitationsResult> bVar, int i) {
        try {
            ((IGamesService) mo15820hw()).mo13602a((IGamesCallbacks) new InvitationsLoadedBinderCallback(bVar), i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13463c(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13683c((IGamesCallbacks) new PlayersLoadedBinderCallback(bVar), i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13464c(BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13732l(new TurnBasedMatchInitiatedBinderCallbacks(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13465c(BaseImplementation.C0670b<Players.LoadXpStreamResult> bVar, String str, int i) {
        try {
            ((IGamesService) mo15820hw()).mo13658b((IGamesCallbacks) new PlayerXpStreamLoadedBinderCallback(bVar), str, i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13466c(BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> bVar, String str, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13709e(new ExtendedGamesLoadedBinderCallback(bVar), str, i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13467c(BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult> bVar, String str, String str2) {
        try {
            ((IGamesService) mo15820hw()).mo13702d((IGamesCallbacks) new TurnBasedMatchInitiatedBinderCallbacks(bVar), str, str2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13468c(BaseImplementation.C0670b<Snapshots.LoadSnapshotsResult> bVar, String str, String str2, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13690c((IGamesCallbacks) new SnapshotsLoadedBinderCallbacks(bVar), str, str2, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13469c(BaseImplementation.C0670b<Snapshots.OpenSnapshotResult> bVar, String str, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13711e((IGamesCallbacks) new SnapshotOpenedBinderCallbacks(bVar), str, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13470c(BaseImplementation.C0670b<Achievements.LoadAchievementsResult> bVar, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13641a((IGamesCallbacks) new AchievementsLoadedBinderCallback(bVar), z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13471c(BaseImplementation.C0670b<Requests.UpdateRequestsResult> bVar, String[] strArr) {
        try {
            ((IGamesService) mo15820hw()).mo13670b((IGamesCallbacks) new RequestsUpdatedBinderCallbacks(bVar), strArr);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: c */
    public void mo13472c(C0687d<QuestUpdateListener> dVar) {
        try {
            ((IGamesService) mo15820hw()).mo13698d((IGamesCallbacks) new QuestUpdateBinderCallback(dVar), this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13473c(String... strArr) {
        boolean z = false;
        boolean z2 = false;
        for (String str : strArr) {
            if (str.equals(Scopes.GAMES)) {
                z2 = true;
            } else if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
                z = true;
            }
        }
        if (z) {
            C1785jx.m5356a(!z2, "Cannot have both %s and %s!", Scopes.GAMES, "https://www.googleapis.com/auth/games.firstparty");
            return;
        }
        C1785jx.m5356a(z2, "Games APIs requires %s to function.", Scopes.GAMES);
    }

    public void connect() {
        m2286lg();
        super.connect();
    }

    /* renamed from: d */
    public int mo13474d(byte[] bArr, String str) {
        try {
            return ((IGamesService) mo15820hw()).mo13649b(bArr, str, (String[]) null);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: d */
    public void mo13475d(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13707e(new PlayersLoadedBinderCallback(bVar), i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: d */
    public void mo13476d(BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13757m(new TurnBasedMatchInitiatedBinderCallbacks(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: d */
    public void mo13477d(BaseImplementation.C0670b<Players.LoadXpStreamResult> bVar, String str, int i) {
        try {
            ((IGamesService) mo15820hw()).mo13687c((IGamesCallbacks) new PlayerXpStreamLoadedBinderCallback(bVar), str, i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: d */
    public void mo13478d(BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> bVar, String str, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13715f(new ExtendedGamesLoadedBinderCallback(bVar), str, i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: d */
    public void mo13479d(BaseImplementation.C0670b<TurnBasedMultiplayer.InitiateMatchResult> bVar, String str, String str2) {
        try {
            ((IGamesService) mo15820hw()).mo13710e((IGamesCallbacks) new TurnBasedMatchInitiatedBinderCallbacks(bVar), str, str2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: d */
    public void mo13480d(BaseImplementation.C0670b<Leaderboards.LeaderboardMetadataResult> bVar, String str, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13703d((IGamesCallbacks) new LeaderboardsLoadedBinderCallback(bVar), str, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: d */
    public void mo13481d(BaseImplementation.C0670b<Events.LoadEventsResult> bVar, boolean z) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13718f((IGamesCallbacks) new EventsLoadedBinderCallback(bVar), z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: d */
    public void mo13482d(C0687d<OnRequestReceivedListener> dVar) {
        try {
            ((IGamesService) mo15820hw()).mo13684c((IGamesCallbacks) new RequestReceivedBinderCallback(dVar), this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: dS */
    public void mo13483dS(int i) {
        this.f1787Yp.setGravity(i);
    }

    /* renamed from: dT */
    public void mo13484dT(int i) {
        try {
            ((IGamesService) mo15820hw()).mo13705dT(i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    public void disconnect() {
        this.f1788Yq = false;
        if (isConnected()) {
            try {
                IGamesService iGamesService = (IGamesService) mo15820hw();
                iGamesService.mo13736lE();
                this.f1782Yk.flush();
                iGamesService.mo13763q(this.f1790Ys);
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        m2285lD();
        super.disconnect();
    }

    /* renamed from: e */
    public void mo13485e(BaseImplementation.C0670b<TurnBasedMultiplayer.LeaveMatchResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13759o((IGamesCallbacks) new TurnBasedMatchLeftBinderCallbacks(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: e */
    public void mo13486e(BaseImplementation.C0670b<Invitations.LoadInvitationsResult> bVar, String str, int i) {
        try {
            ((IGamesService) mo15820hw()).mo13661b((IGamesCallbacks) new InvitationsLoadedBinderCallback(bVar), str, i, false);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: e */
    public void mo13487e(BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> bVar, String str, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13688c(new ExtendedGamesLoadedBinderCallback(bVar), str, i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: e */
    public void mo13488e(BaseImplementation.C0670b<Notifications.GameMuteStatusChangeResult> bVar, String str, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13636a((IGamesCallbacks) new GameMuteStatusChangedBinderCallback(bVar), str, z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: e */
    public void mo13489e(BaseImplementation.C0670b<Snapshots.LoadSnapshotsResult> bVar, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13704d((IGamesCallbacks) new SnapshotsLoadedBinderCallbacks(bVar), z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: f */
    public void mo13490f(BaseImplementation.C0670b<GamesMetadata.LoadGamesResult> bVar) {
        try {
            ((IGamesService) mo15820hw()).mo13696d(new GamesLoadedBinderCallback(bVar));
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: f */
    public void mo13491f(BaseImplementation.C0670b<TurnBasedMultiplayer.CancelMatchResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13758n(new TurnBasedMatchCanceledBinderCallbacks(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: f */
    public void mo13492f(BaseImplementation.C0670b<Requests.LoadRequestSummariesResult> bVar, String str, int i) {
        try {
            ((IGamesService) mo15820hw()).mo13615a((IGamesCallbacks) new RequestSummariesLoadedBinderCallbacks(bVar), str, i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: f */
    public void mo13493f(BaseImplementation.C0670b<Players.LoadPlayersResult> bVar, String str, int i, boolean z, boolean z2) {
        try {
            ((IGamesService) mo15820hw()).mo13662b((IGamesCallbacks) new PlayersLoadedBinderCallback(bVar), str, i, z, z2);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: f */
    public void mo13494f(BaseImplementation.C0670b<Players.LoadProfileSettingsResult> bVar, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13722g((IGamesCallbacks) new ProfileSettingsLoadedBinderCallback(bVar), z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: fX */
    public Bundle mo11002fX() {
        try {
            Bundle fX = ((IGamesService) mo15820hw()).mo13719fX();
            if (fX != null) {
                fX.setClassLoader(GamesClientImpl.class.getClassLoader());
            }
            return fX;
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: g */
    public void mo13495g(BaseImplementation.C0670b<Players.LoadOwnerCoverPhotoUrisResult> bVar) {
        try {
            ((IGamesService) mo15820hw()).mo13729j(new OwnerCoverPhotoUrisLoadedBinderCallback(bVar));
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: g */
    public void mo13496g(BaseImplementation.C0670b<TurnBasedMultiplayer.LoadMatchResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13761p((IGamesCallbacks) new TurnBasedMatchLoadedBinderCallbacks(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: g */
    public void mo13497g(BaseImplementation.C0670b<Status> bVar, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13726h((IGamesCallbacks) new ProfileSettingsUpdatedBinderCallback(bVar), z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: h */
    public void mo13498h(BaseImplementation.C0670b<Acls.LoadAclResult> bVar) {
        try {
            ((IGamesService) mo15820hw()).mo13725h((IGamesCallbacks) new NotifyAclLoadedBinderCallback(bVar));
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: h */
    public void mo13499h(BaseImplementation.C0670b<Quests.AcceptQuestResult> bVar, String str) {
        try {
            this.f1782Yk.flush();
            ((IGamesService) mo15820hw()).mo13777u((IGamesCallbacks) new QuestAcceptedBinderCallbacks(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: h */
    public void mo13500h(BaseImplementation.C0670b<Notifications.ContactSettingLoadResult> bVar, boolean z) {
        try {
            ((IGamesService) mo15820hw()).mo13712e((IGamesCallbacks) new ContactSettingsLoadedBinderCallback(bVar), z);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: i */
    public void mo13501i(BaseImplementation.C0670b<Notifications.InboxCountResult> bVar) {
        try {
            ((IGamesService) mo15820hw()).mo13772t((IGamesCallbacks) new InboxCountsLoadedBinderCallback(bVar), (String) null);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: i */
    public void mo13502i(BaseImplementation.C0670b<Snapshots.DeleteSnapshotResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13767r(new SnapshotDeletedBinderCallbacks(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: j */
    public void mo13503j(BaseImplementation.C0670b<GamesMetadata.LoadExtendedGamesResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13708e((IGamesCallbacks) new ExtendedGamesLoadedBinderCallback(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: k */
    public void mo13504k(View view) {
        this.f1787Yp.mo13853l(view);
    }

    /* renamed from: k */
    public void mo13505k(BaseImplementation.C0670b<GamesMetadata.LoadGameInstancesResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13714f((IGamesCallbacks) new GameInstancesLoadedBinderCallback(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: l */
    public void mo13506l(BaseImplementation.C0670b<GamesMetadata.LoadGameSearchSuggestionsResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13764q((IGamesCallbacks) new GameSearchSuggestionsLoadedBinderCallback(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: lA */
    public int mo13507lA() {
        try {
            return ((IGamesService) mo15820hw()).mo13733lA();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: lB */
    public int mo13508lB() {
        try {
            return ((IGamesService) mo15820hw()).mo13734lB();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: lC */
    public int mo13509lC() {
        try {
            return ((IGamesService) mo15820hw()).mo13735lC();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: lE */
    public void mo13510lE() {
        if (isConnected()) {
            try {
                ((IGamesService) mo15820hw()).mo13736lE();
            } catch (RemoteException e) {
                GamesLog.m2569o("GamesClientImpl", "service died");
            }
        }
    }

    /* renamed from: lh */
    public String mo13511lh() {
        try {
            return ((IGamesService) mo15820hw()).mo13744lh();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: li */
    public String mo13512li() {
        try {
            return ((IGamesService) mo15820hw()).mo13745li();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: lj */
    public Player mo13513lj() {
        PlayerBuffer playerBuffer;
        mo15816dS();
        synchronized (this) {
            if (this.f1785Yn == null) {
                try {
                    playerBuffer = new PlayerBuffer(((IGamesService) mo15820hw()).mo13737lG());
                    if (playerBuffer.getCount() > 0) {
                        this.f1785Yn = (PlayerEntity) playerBuffer.get(0).freeze();
                    }
                    playerBuffer.release();
                } catch (RemoteException e) {
                    GamesLog.m2569o("GamesClientImpl", "service died");
                } catch (Throwable th) {
                    playerBuffer.release();
                    throw th;
                }
            }
        }
        return this.f1785Yn;
    }

    /* renamed from: lk */
    public Game mo13514lk() {
        GameBuffer gameBuffer;
        mo15816dS();
        synchronized (this) {
            if (this.f1786Yo == null) {
                try {
                    gameBuffer = new GameBuffer(((IGamesService) mo15820hw()).mo13739lI());
                    if (gameBuffer.getCount() > 0) {
                        this.f1786Yo = (GameEntity) gameBuffer.get(0).freeze();
                    }
                    gameBuffer.release();
                } catch (RemoteException e) {
                    GamesLog.m2569o("GamesClientImpl", "service died");
                } catch (Throwable th) {
                    gameBuffer.release();
                    throw th;
                }
            }
        }
        return this.f1786Yo;
    }

    /* renamed from: ll */
    public Intent mo13515ll() {
        try {
            return ((IGamesService) mo15820hw()).mo13746ll();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: lm */
    public Intent mo13516lm() {
        try {
            return ((IGamesService) mo15820hw()).mo13747lm();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: ln */
    public Intent mo13517ln() {
        try {
            return ((IGamesService) mo15820hw()).mo13748ln();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: lo */
    public Intent mo13518lo() {
        try {
            return ((IGamesService) mo15820hw()).mo13749lo();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: lp */
    public void mo13519lp() {
        try {
            ((IGamesService) mo15820hw()).mo13766r(this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: lq */
    public void mo13520lq() {
        try {
            ((IGamesService) mo15820hw()).mo13768s(this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: lr */
    public void mo13521lr() {
        try {
            ((IGamesService) mo15820hw()).mo13776u(this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: ls */
    public void mo13522ls() {
        try {
            ((IGamesService) mo15820hw()).mo13771t(this.f1790Ys);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: lt */
    public Intent mo13523lt() {
        try {
            return ((IGamesService) mo15820hw()).mo13750lt();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: lu */
    public Intent mo13524lu() {
        try {
            return ((IGamesService) mo15820hw()).mo13751lu();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: lv */
    public int mo13525lv() {
        try {
            return ((IGamesService) mo15820hw()).mo13752lv();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return 4368;
        }
    }

    /* renamed from: lw */
    public String mo13526lw() {
        try {
            return ((IGamesService) mo15820hw()).mo13753lw();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: lx */
    public int mo13527lx() {
        try {
            return ((IGamesService) mo15820hw()).mo13754lx();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: ly */
    public Intent mo13528ly() {
        try {
            return ((IGamesService) mo15820hw()).mo13755ly();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: lz */
    public int mo13529lz() {
        try {
            return ((IGamesService) mo15820hw()).mo13756lz();
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return -1;
        }
    }

    /* renamed from: m */
    public void mo13530m(BaseImplementation.C0670b<Players.LoadXpForGameCategoriesResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13769s((IGamesCallbacks) new PlayerXpForGameCategoriesLoadedBinderCallback(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: n */
    public Intent mo13531n(String str, int i) {
        try {
            return ((IGamesService) mo15820hw()).mo13775u(str, i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
            return null;
        }
    }

    /* renamed from: n */
    public void mo13532n(BaseImplementation.C0670b<Invitations.LoadInvitationsResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13731k(new InvitationsLoadedBinderCallback(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: o */
    public void mo13533o(BaseImplementation.C0670b<Status> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13730j(new NotifyAclUpdatedBinderCallback(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: o */
    public void mo13534o(String str, int i) {
        this.f1782Yk.mo14121o(str, i);
    }

    public void onConnected(Bundle bundle) {
        if (this.f1788Yq) {
            this.f1787Yp.mo13854lT();
            this.f1788Yq = false;
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.f1788Yq = false;
    }

    public void onConnectionSuspended(int i) {
    }

    /* renamed from: p */
    public void mo13535p(BaseImplementation.C0670b<Notifications.GameMuteStatusLoadResult> bVar, String str) {
        try {
            ((IGamesService) mo15820hw()).mo13728i(new GameMuteStatusLoadedBinderCallback(bVar), str);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: p */
    public void mo13536p(String str, int i) {
        try {
            ((IGamesService) mo15820hw()).mo13762p(str, i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: q */
    public void mo13537q(String str, int i) {
        try {
            ((IGamesService) mo15820hw()).mo13765q(str, i);
        } catch (RemoteException e) {
            GamesLog.m2569o("GamesClientImpl", "service died");
        }
    }

    /* renamed from: s */
    public RealTimeSocket mo13538s(String str, String str2) {
        if (str2 == null || !ParticipantUtils.m3726bY(str2)) {
            throw new IllegalArgumentException("Bad participant ID");
        }
        RealTimeSocket realTimeSocket = this.f1784Ym.get(str2);
        return (realTimeSocket == null || realTimeSocket.isClosed()) ? m2282bB(str2) : realTimeSocket;
    }
}
