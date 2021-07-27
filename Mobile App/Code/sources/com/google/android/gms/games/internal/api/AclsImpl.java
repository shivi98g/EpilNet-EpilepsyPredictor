package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.game.Acls;

public final class AclsImpl implements Acls {

    /* renamed from: com.google.android.gms.games.internal.api.AclsImpl$2 */
    class C11002 extends LoadNotifyAclImpl {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13498h(this);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.AclsImpl$3 */
    class C11013 extends UpdateNotifyAclImpl {
        final /* synthetic */ String aae;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13533o((BaseImplementation.C0670b<Status>) this, this.aae);
        }
    }

    private static abstract class LoadNotifyAclImpl extends Games.BaseGamesApiMethodImpl<Acls.LoadAclResult> {
        /* renamed from: M */
        public Acls.LoadAclResult mo10544c(Status status) {
            return AclsImpl.m3243K(status);
        }
    }

    private static abstract class UpdateNotifyAclImpl extends Games.BaseGamesApiMethodImpl<Status> {
        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static Acls.LoadAclResult m3243K(final Status status) {
        return new Acls.LoadAclResult() {
            public Status getStatus() {
                return status;
            }

            public void release() {
            }
        };
    }
}
