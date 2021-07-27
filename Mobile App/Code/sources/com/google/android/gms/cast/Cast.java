package com.google.android.gms.cast;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.support.p003v7.widget.ActivityChooserView;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1697im;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1785jx;
import java.io.IOException;

public final class Cast {
    public static final Api<CastOptions> API = new Api<>(f464DR, f463DQ, new Scope[0]);
    public static final CastApi CastApi = new CastApi.C0629a();

    /* renamed from: DQ */
    static final Api.C0668c<C1697im> f463DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C1697im, CastOptions> f464DR = new Api.C0667b<C1697im, CastOptions>() {
        /* renamed from: a */
        public C1697im mo10533a(Context context, Looper looper, C1744jg jgVar, CastOptions castOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            C1785jx.m5359b(castOptions, (Object) "Setting the API options is required.");
            return new C1697im(context, looper, castOptions.f485Fz, (long) castOptions.f484FB, castOptions.f483FA, connectionCallbacks, onConnectionFailedListener);
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 65536;
    public static final int MAX_NAMESPACE_LENGTH = 128;

    public interface ApplicationConnectionResult extends Result {
        ApplicationMetadata getApplicationMetadata();

        String getApplicationStatus();

        String getSessionId();

        boolean getWasLaunched();
    }

    public interface CastApi {

        /* renamed from: com.google.android.gms.cast.Cast$CastApi$a */
        public static final class C0629a implements CastApi {
            public ApplicationMetadata getApplicationMetadata(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).getApplicationMetadata();
            }

            public String getApplicationStatus(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).getApplicationStatus();
            }

            public double getVolume(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).mo15660fZ();
            }

            public boolean isMute(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).isMute();
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient) {
                return googleApiClient.mo10940b(new C0641c(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        try {
                            imVar.mo15657b((String) null, (String) null, this);
                        } catch (IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, final String str) {
                return googleApiClient.mo10940b(new C0641c(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        try {
                            imVar.mo15657b(str, (String) null, this);
                        } catch (IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, final String str, final String str2) {
                return googleApiClient.mo10940b(new C0641c(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        try {
                            imVar.mo15657b(str, str2, this);
                        } catch (IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, final String str) {
                return googleApiClient.mo10940b(new C0641c(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        try {
                            imVar.mo15655a(str, false, (BaseImplementation.C0670b<ApplicationConnectionResult>) this);
                        } catch (IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, final String str, final LaunchOptions launchOptions) {
                return googleApiClient.mo10940b(new C0641c(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        try {
                            imVar.mo15652a(str, launchOptions, (BaseImplementation.C0670b<ApplicationConnectionResult>) this);
                        } catch (IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }

            @Deprecated
            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, boolean z) {
                return launchApplication(googleApiClient, str, new LaunchOptions.Builder().setRelaunchIfRunning(z).build());
            }

            public PendingResult<Status> leaveApplication(GoogleApiClient googleApiClient) {
                return googleApiClient.mo10940b(new C0640b(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        try {
                            imVar.mo15658d((BaseImplementation.C0670b<Status>) this);
                        } catch (IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }

            public void removeMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str) throws IOException, IllegalArgumentException {
                try {
                    ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).mo15656aE(str);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void requestStatus(GoogleApiClient googleApiClient) throws IOException, IllegalStateException {
                try {
                    ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).mo15659fY();
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public PendingResult<Status> sendMessage(GoogleApiClient googleApiClient, final String str, final String str2) {
                return googleApiClient.mo10940b(new C0640b(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        try {
                            imVar.mo15654a(str, str2, (BaseImplementation.C0670b<Status>) this);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }

            public void setMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str, MessageReceivedCallback messageReceivedCallback) throws IOException, IllegalStateException {
                try {
                    ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).mo15651a(str, messageReceivedCallback);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void setMute(GoogleApiClient googleApiClient, boolean z) throws IOException, IllegalStateException {
                try {
                    ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).mo15648I(z);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void setVolume(GoogleApiClient googleApiClient, double d) throws IOException, IllegalArgumentException, IllegalStateException {
                try {
                    ((C1697im) googleApiClient.mo10937a(Cast.f463DQ)).mo15650a(d);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public PendingResult<Status> stopApplication(GoogleApiClient googleApiClient) {
                return googleApiClient.mo10940b(new C0640b(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        try {
                            imVar.mo15653a("", (BaseImplementation.C0670b<Status>) this);
                        } catch (IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }

            public PendingResult<Status> stopApplication(GoogleApiClient googleApiClient, final String str) {
                return googleApiClient.mo10940b(new C0640b(googleApiClient) {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo10540a(C1697im imVar) throws RemoteException {
                        if (TextUtils.isEmpty(str)) {
                            mo10653e(2001, "IllegalArgument: sessionId cannot be null or empty");
                            return;
                        }
                        try {
                            imVar.mo15653a(str, (BaseImplementation.C0670b<Status>) this);
                        } catch (IllegalStateException e) {
                            mo10652W(2001);
                        }
                    }
                });
            }
        }

        ApplicationMetadata getApplicationMetadata(GoogleApiClient googleApiClient) throws IllegalStateException;

        String getApplicationStatus(GoogleApiClient googleApiClient) throws IllegalStateException;

        double getVolume(GoogleApiClient googleApiClient) throws IllegalStateException;

        boolean isMute(GoogleApiClient googleApiClient) throws IllegalStateException;

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient);

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str);

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str, String str2);

        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str);

        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, LaunchOptions launchOptions);

        @Deprecated
        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, boolean z);

        PendingResult<Status> leaveApplication(GoogleApiClient googleApiClient);

        void removeMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str) throws IOException, IllegalArgumentException;

        void requestStatus(GoogleApiClient googleApiClient) throws IOException, IllegalStateException;

        PendingResult<Status> sendMessage(GoogleApiClient googleApiClient, String str, String str2);

        void setMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str, MessageReceivedCallback messageReceivedCallback) throws IOException, IllegalStateException;

        void setMute(GoogleApiClient googleApiClient, boolean z) throws IOException, IllegalStateException;

        void setVolume(GoogleApiClient googleApiClient, double d) throws IOException, IllegalArgumentException, IllegalStateException;

        PendingResult<Status> stopApplication(GoogleApiClient googleApiClient);

        PendingResult<Status> stopApplication(GoogleApiClient googleApiClient, String str);
    }

    public static final class CastOptions implements Api.ApiOptions.HasOptions {

        /* renamed from: FA */
        final Listener f483FA;
        /* access modifiers changed from: private */

        /* renamed from: FB */
        public final int f484FB;

        /* renamed from: Fz */
        final CastDevice f485Fz;

        public static final class Builder {

            /* renamed from: FC */
            CastDevice f486FC;

            /* renamed from: FD */
            Listener f487FD;
            /* access modifiers changed from: private */

            /* renamed from: FE */
            public int f488FE;

            private Builder(CastDevice castDevice, Listener listener) {
                C1785jx.m5359b(castDevice, (Object) "CastDevice parameter cannot be null");
                C1785jx.m5359b(listener, (Object) "CastListener parameter cannot be null");
                this.f486FC = castDevice;
                this.f487FD = listener;
                this.f488FE = 0;
            }

            public CastOptions build() {
                return new CastOptions(this);
            }

            public Builder setVerboseLoggingEnabled(boolean z) {
                this.f488FE = z ? this.f488FE | 1 : this.f488FE & -2;
                return this;
            }
        }

        private CastOptions(Builder builder) {
            this.f485Fz = builder.f486FC;
            this.f483FA = builder.f487FD;
            this.f484FB = builder.f488FE;
        }

        public static Builder builder(CastDevice castDevice, Listener listener) {
            return new Builder(castDevice, listener);
        }
    }

    public static class Listener {
        /* renamed from: X */
        public void mo10645X(int i) {
        }

        /* renamed from: Y */
        public void mo10646Y(int i) {
        }

        public void onApplicationDisconnected(int i) {
        }

        public void onApplicationMetadataChanged(ApplicationMetadata applicationMetadata) {
        }

        public void onApplicationStatusChanged() {
        }

        public void onVolumeChanged() {
        }
    }

    public interface MessageReceivedCallback {
        void onMessageReceived(CastDevice castDevice, String str, String str2);
    }

    /* renamed from: com.google.android.gms.cast.Cast$a */
    protected static abstract class C0639a<R extends Result> extends BaseImplementation.C0669a<R, C1697im> {
        public C0639a(GoogleApiClient googleApiClient) {
            super(Cast.f463DQ, googleApiClient);
        }

        /* renamed from: W */
        public void mo10652W(int i) {
            mo10914b(mo10544c(new Status(i)));
        }

        /* renamed from: e */
        public void mo10653e(int i, String str) {
            mo10914b(mo10544c(new Status(i, str, (PendingIntent) null)));
        }
    }

    /* renamed from: com.google.android.gms.cast.Cast$b */
    private static abstract class C0640b extends C0639a<Status> {
        C0640b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.cast.Cast$c */
    private static abstract class C0641c extends C0639a<ApplicationConnectionResult> {
        public C0641c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: i */
        public ApplicationConnectionResult mo10544c(final Status status) {
            return new ApplicationConnectionResult() {
                public ApplicationMetadata getApplicationMetadata() {
                    return null;
                }

                public String getApplicationStatus() {
                    return null;
                }

                public String getSessionId() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }

                public boolean getWasLaunched() {
                    return false;
                }
            };
        }
    }

    private Cast() {
    }
}
