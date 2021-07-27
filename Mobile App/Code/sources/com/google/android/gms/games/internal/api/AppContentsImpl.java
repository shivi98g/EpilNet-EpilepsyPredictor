package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AppContentsImpl implements AppContents {

    /* renamed from: com.google.android.gms.games.internal.api.AppContentsImpl$1 */
    class C11021 extends LoadsImpl {

        /* renamed from: ZW */
        final /* synthetic */ boolean f1996ZW;
        final /* synthetic */ int aaf;
        final /* synthetic */ String aag;
        final /* synthetic */ String[] aah;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13404a((BaseImplementation.C0670b<AppContents.LoadAppContentResult>) this, this.aaf, this.aag, this.aah, this.f1996ZW);
        }
    }

    private static abstract class LoadsImpl extends Games.BaseGamesApiMethodImpl<AppContents.LoadAppContentResult> {
        /* renamed from: N */
        public AppContents.LoadAppContentResult mo10544c(final Status status) {
            return new AppContents.LoadAppContentResult() {
                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }
}
