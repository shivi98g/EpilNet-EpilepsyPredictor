package com.google.android.gms.internal;

import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.C2432e;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.pc */
public final class C2076pc implements People {

    /* renamed from: com.google.android.gms.internal.pc$a */
    private static abstract class C2082a extends Plus.C2407a<People.LoadPeopleResult> {
        private C2082a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: aC */
        public People.LoadPeopleResult mo10544c(final Status status) {
            return new People.LoadPeopleResult() {
                public String getNextPageToken() {
                    return null;
                }

                public PersonBuffer getPersonBuffer() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }
    }

    public Person getCurrentPerson(GoogleApiClient googleApiClient) {
        return Plus.m6946a(googleApiClient, Plus.f4368DQ).getCurrentPerson();
    }

    public PendingResult<People.LoadPeopleResult> load(GoogleApiClient googleApiClient, final Collection<String> collection) {
        return googleApiClient.mo10938a(new C2082a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                eVar.mo18459a((BaseImplementation.C0670b<People.LoadPeopleResult>) this, (Collection<String>) collection);
            }
        });
    }

    public PendingResult<People.LoadPeopleResult> load(GoogleApiClient googleApiClient, final String... strArr) {
        return googleApiClient.mo10938a(new C2082a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                eVar.mo18463d(this, strArr);
            }
        });
    }

    public PendingResult<People.LoadPeopleResult> loadConnected(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C2082a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                eVar.mo18467k(this);
            }
        });
    }

    public PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient googleApiClient, final int i, final String str) {
        return googleApiClient.mo10938a(new C2082a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                mo10910a(eVar.mo18456a((BaseImplementation.C0670b<People.LoadPeopleResult>) this, i, str));
            }
        });
    }

    public PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10938a(new C2082a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                mo10910a(eVar.mo18469q(this, str));
            }
        });
    }
}
