package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.C1744jg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Api<O extends ApiOptions> {

    /* renamed from: Jm */
    private final C0667b<?, O> f623Jm;

    /* renamed from: Jn */
    private final C0668c<?> f624Jn;

    /* renamed from: Jo */
    private final ArrayList<Scope> f625Jo;

    public interface ApiOptions {

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    /* renamed from: com.google.android.gms.common.api.Api$a */
    public interface C0666a {
        void connect();

        void disconnect();

        boolean isConnected();
    }

    /* renamed from: com.google.android.gms.common.api.Api$b */
    public interface C0667b<T extends C0666a, O> {
        /* renamed from: a */
        T mo10533a(Context context, Looper looper, C1744jg jgVar, O o, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);

        int getPriority();
    }

    /* renamed from: com.google.android.gms.common.api.Api$c */
    public static final class C0668c<C extends C0666a> {
    }

    public <C extends C0666a> Api(C0667b<C, O> bVar, C0668c<C> cVar, Scope... scopeArr) {
        this.f623Jm = bVar;
        this.f624Jn = cVar;
        this.f625Jo = new ArrayList<>(Arrays.asList(scopeArr));
    }

    /* renamed from: gx */
    public C0667b<?, O> mo10903gx() {
        return this.f623Jm;
    }

    /* renamed from: gy */
    public List<Scope> mo10904gy() {
        return this.f625Jo;
    }

    /* renamed from: gz */
    public C0668c<?> mo10905gz() {
        return this.f624Jn;
    }
}
