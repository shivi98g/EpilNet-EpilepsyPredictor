package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl implements Events {

    private static abstract class LoadImpl extends Games.BaseGamesApiMethodImpl<Events.LoadEventsResult> {
        private LoadImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: O */
        public Events.LoadEventsResult mo10544c(final Status status) {
            return new Events.LoadEventsResult() {
                public EventBuffer getEvents() {
                    return new EventBuffer(DataHolder.m625av(14));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class UpdateImpl extends Games.BaseGamesApiMethodImpl<Result> {
        private UpdateImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: c */
        public Result mo10544c(final Status status) {
            return new Result() {
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    public void increment(GoogleApiClient googleApiClient, final String str, final int i) {
        GamesClientImpl e = Games.m2047e(googleApiClient);
        if (e.isConnected()) {
            e.mo13534o(str, i);
        } else {
            googleApiClient.mo10940b(new UpdateImpl(googleApiClient) {
                /* renamed from: a */
                public void mo10540a(GamesClientImpl gamesClientImpl) {
                    gamesClientImpl.mo13534o(str, i);
                }
            });
        }
    }

    public PendingResult<Events.LoadEventsResult> load(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.mo10938a(new LoadImpl(googleApiClient) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13481d((BaseImplementation.C0670b<Events.LoadEventsResult>) this, z);
            }
        });
    }

    public PendingResult<Events.LoadEventsResult> loadByIds(GoogleApiClient googleApiClient, final boolean z, final String... strArr) {
        return googleApiClient.mo10938a(new LoadImpl(googleApiClient) {
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13433a((BaseImplementation.C0670b<Events.LoadEventsResult>) this, z, strArr);
            }
        });
    }
}
