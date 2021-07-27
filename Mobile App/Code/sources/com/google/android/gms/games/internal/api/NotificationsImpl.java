package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class NotificationsImpl implements Notifications {

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl$1 */
    class C11511 extends Games.BaseGamesApiMethodImpl<Notifications.GameMuteStatusChangeResult> {
        final /* synthetic */ String aaR;

        /* renamed from: Y */
        public Notifications.GameMuteStatusChangeResult mo10544c(final Status status) {
            return new Notifications.GameMuteStatusChangeResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13488e((BaseImplementation.C0670b<Notifications.GameMuteStatusChangeResult>) this, this.aaR, true);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl$2 */
    class C11532 extends Games.BaseGamesApiMethodImpl<Notifications.GameMuteStatusChangeResult> {
        final /* synthetic */ String aaR;

        /* renamed from: Y */
        public Notifications.GameMuteStatusChangeResult mo10544c(final Status status) {
            return new Notifications.GameMuteStatusChangeResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13488e((BaseImplementation.C0670b<Notifications.GameMuteStatusChangeResult>) this, this.aaR, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl$3 */
    class C11553 extends Games.BaseGamesApiMethodImpl<Notifications.GameMuteStatusLoadResult> {
        final /* synthetic */ String aaR;

        /* renamed from: Z */
        public Notifications.GameMuteStatusLoadResult mo10544c(final Status status) {
            return new Notifications.GameMuteStatusLoadResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13535p((BaseImplementation.C0670b<Notifications.GameMuteStatusLoadResult>) this, this.aaR);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl$4 */
    class C11574 extends ContactSettingLoadImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f2043ZW;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13500h((BaseImplementation.C0670b<Notifications.ContactSettingLoadResult>) this, this.f2043ZW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl$5 */
    class C11585 extends ContactSettingUpdateImpl {
        final /* synthetic */ boolean aaV;
        final /* synthetic */ Bundle aaW;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13432a((BaseImplementation.C0670b<Status>) this, this.aaV, this.aaW);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.NotificationsImpl$6 */
    class C11596 extends InboxCountImpl {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13501i(this);
        }
    }

    private static abstract class ContactSettingLoadImpl extends Games.BaseGamesApiMethodImpl<Notifications.ContactSettingLoadResult> {
        /* renamed from: aa */
        public Notifications.ContactSettingLoadResult mo10544c(final Status status) {
            return new Notifications.ContactSettingLoadResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class ContactSettingUpdateImpl extends Games.BaseGamesApiMethodImpl<Status> {
        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    private static abstract class InboxCountImpl extends Games.BaseGamesApiMethodImpl<Notifications.InboxCountResult> {
        /* renamed from: ab */
        public Notifications.InboxCountResult mo10544c(final Status status) {
            return new Notifications.InboxCountResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    public void clear(GoogleApiClient googleApiClient, int i) {
        Games.m2046d(googleApiClient).mo13484dT(i);
    }

    public void clearAll(GoogleApiClient googleApiClient) {
        clear(googleApiClient, 31);
    }
}
