package com.google.android.gms.plus;

import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.internal.C2432e;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

@Deprecated
public class PlusClient implements GooglePlayServicesClient {
    final C2432e ant;

    @Deprecated
    public interface OnAccessRevokedListener {
        void onAccessRevoked(ConnectionResult connectionResult);
    }

    @Deprecated
    public interface OnMomentsLoadedListener {
        @Deprecated
        void onMomentsLoaded(ConnectionResult connectionResult, MomentBuffer momentBuffer, String str, String str2);
    }

    @Deprecated
    public interface OnPeopleLoadedListener {
        void onPeopleLoaded(ConnectionResult connectionResult, PersonBuffer personBuffer, String str);
    }

    @Deprecated
    public void clearDefaultAccount() {
        this.ant.clearDefaultAccount();
    }

    @Deprecated
    public void connect() {
        this.ant.connect();
    }

    @Deprecated
    public void disconnect() {
        this.ant.disconnect();
    }

    @Deprecated
    public String getAccountName() {
        return this.ant.getAccountName();
    }

    @Deprecated
    public Person getCurrentPerson() {
        return this.ant.getCurrentPerson();
    }

    @Deprecated
    public boolean isConnected() {
        return this.ant.isConnected();
    }

    @Deprecated
    public boolean isConnecting() {
        return this.ant.isConnecting();
    }

    @Deprecated
    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.ant.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    @Deprecated
    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.ant.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    @Deprecated
    public void loadMoments(final OnMomentsLoadedListener onMomentsLoadedListener) {
        this.ant.mo18466j(new BaseImplementation.C0670b<Moments.LoadMomentsResult>() {
            /* renamed from: a */
            public void mo10914b(Moments.LoadMomentsResult loadMomentsResult) {
                onMomentsLoadedListener.onMomentsLoaded(loadMomentsResult.getStatus().mo10982gQ(), loadMomentsResult.getMomentBuffer(), loadMomentsResult.getNextPageToken(), loadMomentsResult.getUpdated());
            }
        });
    }

    @Deprecated
    public void loadMoments(final OnMomentsLoadedListener onMomentsLoadedListener, int i, String str, Uri uri, String str2, String str3) {
        this.ant.mo18457a(new BaseImplementation.C0670b<Moments.LoadMomentsResult>() {
            /* renamed from: a */
            public void mo10914b(Moments.LoadMomentsResult loadMomentsResult) {
                onMomentsLoadedListener.onMomentsLoaded(loadMomentsResult.getStatus().mo10982gQ(), loadMomentsResult.getMomentBuffer(), loadMomentsResult.getNextPageToken(), loadMomentsResult.getUpdated());
            }
        }, i, str, uri, str2, str3);
    }

    @Deprecated
    public void loadPeople(final OnPeopleLoadedListener onPeopleLoadedListener, Collection<String> collection) {
        this.ant.mo18459a((BaseImplementation.C0670b<People.LoadPeopleResult>) new BaseImplementation.C0670b<People.LoadPeopleResult>() {
            /* renamed from: a */
            public void mo10914b(People.LoadPeopleResult loadPeopleResult) {
                onPeopleLoadedListener.onPeopleLoaded(loadPeopleResult.getStatus().mo10982gQ(), loadPeopleResult.getPersonBuffer(), loadPeopleResult.getNextPageToken());
            }
        }, collection);
    }

    @Deprecated
    public void loadPeople(final OnPeopleLoadedListener onPeopleLoadedListener, String... strArr) {
        this.ant.mo18463d(new BaseImplementation.C0670b<People.LoadPeopleResult>() {
            /* renamed from: a */
            public void mo10914b(People.LoadPeopleResult loadPeopleResult) {
                onPeopleLoadedListener.onPeopleLoaded(loadPeopleResult.getStatus().mo10982gQ(), loadPeopleResult.getPersonBuffer(), loadPeopleResult.getNextPageToken());
            }
        }, strArr);
    }

    @Deprecated
    public void loadVisiblePeople(final OnPeopleLoadedListener onPeopleLoadedListener, int i, String str) {
        this.ant.mo18456a((BaseImplementation.C0670b<People.LoadPeopleResult>) new BaseImplementation.C0670b<People.LoadPeopleResult>() {
            /* renamed from: a */
            public void mo10914b(People.LoadPeopleResult loadPeopleResult) {
                onPeopleLoadedListener.onPeopleLoaded(loadPeopleResult.getStatus().mo10982gQ(), loadPeopleResult.getPersonBuffer(), loadPeopleResult.getNextPageToken());
            }
        }, i, str);
    }

    @Deprecated
    public void loadVisiblePeople(final OnPeopleLoadedListener onPeopleLoadedListener, String str) {
        this.ant.mo18469q(new BaseImplementation.C0670b<People.LoadPeopleResult>() {
            /* renamed from: a */
            public void mo10914b(People.LoadPeopleResult loadPeopleResult) {
                onPeopleLoadedListener.onPeopleLoaded(loadPeopleResult.getStatus().mo10982gQ(), loadPeopleResult.getPersonBuffer(), loadPeopleResult.getNextPageToken());
            }
        }, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: os */
    public C2432e mo18371os() {
        return this.ant;
    }

    @Deprecated
    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.ant.registerConnectionCallbacks(connectionCallbacks);
    }

    @Deprecated
    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.ant.registerConnectionFailedListener(onConnectionFailedListener);
    }

    @Deprecated
    public void removeMoment(String str) {
        this.ant.removeMoment(str);
    }

    @Deprecated
    public void revokeAccessAndDisconnect(final OnAccessRevokedListener onAccessRevokedListener) {
        this.ant.mo18468l((BaseImplementation.C0670b<Status>) new BaseImplementation.C0670b<Status>() {
            /* renamed from: az */
            public void mo10914b(Status status) {
                onAccessRevokedListener.onAccessRevoked(status.getStatus().mo10982gQ());
            }
        });
    }

    @Deprecated
    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.ant.unregisterConnectionCallbacks(connectionCallbacks);
    }

    @Deprecated
    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.ant.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    @Deprecated
    public void writeMoment(Moment moment) {
        this.ant.mo18458a((BaseImplementation.C0670b<Status>) null, moment);
    }
}
