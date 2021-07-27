package com.google.android.gms.appstate;

import android.content.Context;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.C1673ib;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1785jx;

@Deprecated
public final class AppStateManager {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>(f420DR, f419DQ, SCOPE_APP_STATE);

    /* renamed from: DQ */
    static final Api.C0668c<C1673ib> f419DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C1673ib, Api.ApiOptions.NoOptions> f420DR = new Api.C0667b<C1673ib, Api.ApiOptions.NoOptions>() {
        /* renamed from: b */
        public C1673ib mo10533a(Context context, Looper looper, C1744jg jgVar, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C1673ib(context, looper, connectionCallbacks, onConnectionFailedListener, jgVar.mo15787hm(), (String[]) jgVar.mo15789ho().toArray(new String[0]));
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };
    public static final Scope SCOPE_APP_STATE = new Scope(Scopes.APP_STATE);

    public interface StateConflictResult extends Releasable, Result {
        byte[] getLocalData();

        String getResolvedVersion();

        byte[] getServerData();

        int getStateKey();
    }

    public interface StateDeletedResult extends Result {
        int getStateKey();
    }

    public interface StateListResult extends Result {
        AppStateBuffer getStateBuffer();
    }

    public interface StateLoadedResult extends Releasable, Result {
        byte[] getLocalData();

        int getStateKey();
    }

    public interface StateResult extends Releasable, Result {
        StateConflictResult getConflictResult();

        StateLoadedResult getLoadedResult();
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$a */
    public static abstract class C0620a<R extends Result> extends BaseImplementation.C0669a<R, C1673ib> {
        public C0620a(GoogleApiClient googleApiClient) {
            super(AppStateManager.f419DQ, googleApiClient);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$b */
    private static abstract class C0621b extends C0620a<StateDeletedResult> {
        C0621b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$c */
    private static abstract class C0622c extends C0620a<StateListResult> {
        public C0622c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: g */
        public StateListResult mo10544c(final Status status) {
            return new StateListResult() {
                public AppStateBuffer getStateBuffer() {
                    return new AppStateBuffer((DataHolder) null);
                }

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$d */
    private static abstract class C0624d extends C0620a<Status> {
        public C0624d(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.appstate.AppStateManager$e */
    private static abstract class C0625e extends C0620a<StateResult> {
        public C0625e(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: h */
        public StateResult mo10544c(Status status) {
            return AppStateManager.m338d(status);
        }
    }

    private AppStateManager() {
    }

    /* renamed from: a */
    public static C1673ib m337a(GoogleApiClient googleApiClient) {
        boolean z = false;
        C1785jx.m5361b(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        C1785jx.m5355a(googleApiClient.isConnected(), "GoogleApiClient must be connected.");
        C1673ib ibVar = (C1673ib) googleApiClient.mo10937a(f419DQ);
        if (ibVar != null) {
            z = true;
        }
        C1785jx.m5355a(z, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return ibVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static StateResult m338d(final Status status) {
        return new StateResult() {
            public StateConflictResult getConflictResult() {
                return null;
            }

            public StateLoadedResult getLoadedResult() {
                return null;
            }

            public Status getStatus() {
                return status;
            }

            public void release() {
            }
        };
    }

    public static PendingResult<StateDeletedResult> delete(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.mo10940b(new C0621b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1673ib ibVar) {
                ibVar.mo15598a((BaseImplementation.C0670b<StateDeletedResult>) this, i);
            }

            /* renamed from: f */
            public StateDeletedResult mo10544c(final Status status) {
                return new StateDeletedResult() {
                    public int getStateKey() {
                        return i;
                    }

                    public Status getStatus() {
                        return status;
                    }
                };
            }
        });
    }

    public static int getMaxNumKeys(GoogleApiClient googleApiClient) {
        return m337a(googleApiClient).mo15604fM();
    }

    public static int getMaxStateSize(GoogleApiClient googleApiClient) {
        return m337a(googleApiClient).mo15603fL();
    }

    public static PendingResult<StateListResult> list(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C0622c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1673ib ibVar) {
                ibVar.mo15597a(this);
            }
        });
    }

    public static PendingResult<StateResult> load(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.mo10938a(new C0625e(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1673ib ibVar) {
                ibVar.mo15602b(this, i);
            }
        });
    }

    public static PendingResult<StateResult> resolve(GoogleApiClient googleApiClient, final int i, final String str, final byte[] bArr) {
        return googleApiClient.mo10940b(new C0625e(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1673ib ibVar) {
                ibVar.mo15599a(this, i, str, bArr);
            }
        });
    }

    public static PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10940b(new C0624d(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1673ib ibVar) {
                ibVar.mo15601b(this);
            }
        });
    }

    public static void update(GoogleApiClient googleApiClient, final int i, final byte[] bArr) {
        googleApiClient.mo10940b(new C0625e(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1673ib ibVar) {
                ibVar.mo15600a((BaseImplementation.C0670b<StateResult>) null, i, bArr);
            }
        });
    }

    public static PendingResult<StateResult> updateImmediate(GoogleApiClient googleApiClient, final int i, final byte[] bArr) {
        return googleApiClient.mo10940b(new C0625e(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1673ib ibVar) {
                ibVar.mo15600a(this, i, bArr);
            }
        });
    }
}
