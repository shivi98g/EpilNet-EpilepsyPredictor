package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.C2432e;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

/* renamed from: com.google.android.gms.internal.pb */
public final class C2067pb implements Moments {

    /* renamed from: com.google.android.gms.internal.pb$a */
    private static abstract class C2072a extends Plus.C2407a<Moments.LoadMomentsResult> {
        private C2072a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: aB */
        public Moments.LoadMomentsResult mo10544c(final Status status) {
            return new Moments.LoadMomentsResult() {
                public MomentBuffer getMomentBuffer() {
                    return null;
                }

                public String getNextPageToken() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }

                public String getUpdated() {
                    return null;
                }

                public void release() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.pb$b */
    private static abstract class C2074b extends Plus.C2407a<Status> {
        private C2074b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.pb$c */
    private static abstract class C2075c extends Plus.C2407a<Status> {
        private C2075c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    public PendingResult<Moments.LoadMomentsResult> load(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C2072a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                eVar.mo18466j(this);
            }
        });
    }

    public PendingResult<Moments.LoadMomentsResult> load(GoogleApiClient googleApiClient, int i, String str, Uri uri, String str2, String str3) {
        final int i2 = i;
        final String str4 = str;
        final Uri uri2 = uri;
        final String str5 = str2;
        final String str6 = str3;
        return googleApiClient.mo10938a(new C2072a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                eVar.mo18457a(this, i2, str4, uri2, str5, str6);
            }
        });
    }

    public PendingResult<Status> remove(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new C2074b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                eVar.removeMoment(str);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public PendingResult<Status> write(GoogleApiClient googleApiClient, final Moment moment) {
        return googleApiClient.mo10940b(new C2075c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2432e eVar) {
                eVar.mo18458a((BaseImplementation.C0670b<Status>) this, moment);
            }
        });
    }
}
