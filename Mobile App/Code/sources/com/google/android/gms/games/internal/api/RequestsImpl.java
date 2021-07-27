package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class RequestsImpl implements Requests {

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$4 */
    class C12074 extends SendRequestImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2077ZZ;
        final /* synthetic */ int abA;
        final /* synthetic */ String[] abx;
        final /* synthetic */ int aby;
        final /* synthetic */ byte[] abz;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13430a((BaseImplementation.C0670b<Requests.SendRequestResult>) this, this.f2077ZZ, this.abx, this.aby, this.abz, this.abA);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$5 */
    class C12085 extends SendRequestImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2078ZZ;
        final /* synthetic */ int abA;
        final /* synthetic */ String[] abx;
        final /* synthetic */ int aby;
        final /* synthetic */ byte[] abz;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13430a((BaseImplementation.C0670b<Requests.SendRequestResult>) this, this.f2078ZZ, this.abx, this.aby, this.abz, this.abA);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$6 */
    class C12096 extends UpdateRequestsImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2079ZZ;
        final /* synthetic */ String abp;
        final /* synthetic */ String[] abt;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13426a((BaseImplementation.C0670b<Requests.UpdateRequestsResult>) this, this.f2079ZZ, this.abp, this.abt);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$7 */
    class C12107 extends LoadRequestsImpl {

        /* renamed from: ZZ */
        final /* synthetic */ String f2080ZZ;
        final /* synthetic */ int aaA;
        final /* synthetic */ String abp;
        final /* synthetic */ int abv;
        final /* synthetic */ int abw;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13419a((BaseImplementation.C0670b<Requests.LoadRequestsResult>) this, this.f2080ZZ, this.abp, this.abv, this.abw, this.aaA);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.api.RequestsImpl$8 */
    class C12118 extends LoadRequestSummariesImpl {
        final /* synthetic */ String abp;
        final /* synthetic */ int abw;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(GamesClientImpl gamesClientImpl) {
            gamesClientImpl.mo13492f(this, this.abp, this.abw);
        }
    }

    private static abstract class LoadRequestSummariesImpl extends Games.BaseGamesApiMethodImpl<Requests.LoadRequestSummariesResult> {
        /* renamed from: ak */
        public Requests.LoadRequestSummariesResult mo10544c(final Status status) {
            return new Requests.LoadRequestSummariesResult() {
                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class LoadRequestsImpl extends Games.BaseGamesApiMethodImpl<Requests.LoadRequestsResult> {
        private LoadRequestsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: al */
        public Requests.LoadRequestsResult mo10544c(final Status status) {
            return new Requests.LoadRequestsResult() {
                public GameRequestBuffer getRequests(int i) {
                    return new GameRequestBuffer(DataHolder.m625av(status.getStatusCode()));
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    private static abstract class SendRequestImpl extends Games.BaseGamesApiMethodImpl<Requests.SendRequestResult> {
        /* renamed from: am */
        public Requests.SendRequestResult mo10544c(final Status status) {
            return new Requests.SendRequestResult() {
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    private static abstract class UpdateRequestsImpl extends Games.BaseGamesApiMethodImpl<Requests.UpdateRequestsResult> {
        private UpdateRequestsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: an */
        public Requests.UpdateRequestsResult mo10544c(final Status status) {
            return new Requests.UpdateRequestsResult() {
                public Set<String> getRequestIds() {
                    return null;
                }

                public int getRequestOutcome(String str) {
                    throw new IllegalArgumentException("Unknown request ID " + str);
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public PendingResult<Requests.UpdateRequestsResult> acceptRequest(GoogleApiClient googleApiClient, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return acceptRequests(googleApiClient, arrayList);
    }

    public PendingResult<Requests.UpdateRequestsResult> acceptRequests(GoogleApiClient googleApiClient, List<String> list) {
        final String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        return googleApiClient.mo10940b(new UpdateRequestsImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13456b((BaseImplementation.C0670b<Requests.UpdateRequestsResult>) this, strArr);
            }
        });
    }

    public PendingResult<Requests.UpdateRequestsResult> dismissRequest(GoogleApiClient googleApiClient, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return dismissRequests(googleApiClient, arrayList);
    }

    public PendingResult<Requests.UpdateRequestsResult> dismissRequests(GoogleApiClient googleApiClient, List<String> list) {
        final String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        return googleApiClient.mo10940b(new UpdateRequestsImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13471c((BaseImplementation.C0670b<Requests.UpdateRequestsResult>) this, strArr);
            }
        });
    }

    public ArrayList<GameRequest> getGameRequestsFromBundle(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(Requests.EXTRA_REQUESTS)) {
            return new ArrayList<>();
        }
        ArrayList arrayList = (ArrayList) bundle.get(Requests.EXTRA_REQUESTS);
        ArrayList<GameRequest> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add((GameRequest) arrayList.get(i));
        }
        return arrayList2;
    }

    public ArrayList<GameRequest> getGameRequestsFromInboxResponse(Intent intent) {
        return intent == null ? new ArrayList<>() : getGameRequestsFromBundle(intent.getExtras());
    }

    public Intent getInboxIntent(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13528ly();
    }

    public int getMaxLifetimeDays(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13507lA();
    }

    public int getMaxPayloadSize(GoogleApiClient googleApiClient) {
        return Games.m2046d(googleApiClient).mo13529lz();
    }

    public Intent getSendIntent(GoogleApiClient googleApiClient, int i, byte[] bArr, int i2, Bitmap bitmap, String str) {
        return Games.m2046d(googleApiClient).mo13398a(i, bArr, i2, bitmap, str);
    }

    public PendingResult<Requests.LoadRequestsResult> loadRequests(GoogleApiClient googleApiClient, int i, int i2, int i3) {
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        return googleApiClient.mo10938a(new LoadRequestsImpl(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(GamesClientImpl gamesClientImpl) {
                gamesClientImpl.mo13402a((BaseImplementation.C0670b<Requests.LoadRequestsResult>) this, i4, i5, i6);
            }
        });
    }

    public void registerRequestListener(GoogleApiClient googleApiClient, OnRequestReceivedListener onRequestReceivedListener) {
        Games.m2046d(googleApiClient).mo13482d(googleApiClient.mo10945d(onRequestReceivedListener));
    }

    public void unregisterRequestListener(GoogleApiClient googleApiClient) {
        Games.m2046d(googleApiClient).mo13522ls();
    }
}
