package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C1954mw;

public final class Address {
    public static final Api<AddressOptions> API = new Api<>(f2174DR, f2173DQ, new Scope[0]);

    /* renamed from: DQ */
    static final Api.C0668c<C1954mw> f2173DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C1954mw, AddressOptions> f2174DR = new Api.C0667b<C1954mw, AddressOptions>() {
        /* renamed from: a */
        public C1954mw mo10533a(Context context, Looper looper, C1744jg jgVar, AddressOptions addressOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            C1785jx.m5361b(context instanceof Activity, (Object) "An Activity must be used for Address APIs");
            if (addressOptions == null) {
                addressOptions = new AddressOptions();
            }
            return new C1954mw((Activity) context, looper, connectionCallbacks, onConnectionFailedListener, jgVar.getAccountName(), addressOptions.theme);
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };

    public static final class AddressOptions implements Api.ApiOptions.HasOptions {
        public final int theme;

        public AddressOptions() {
            this.theme = 0;
        }

        public AddressOptions(int i) {
            this.theme = i;
        }
    }

    /* renamed from: com.google.android.gms.identity.intents.Address$a */
    private static abstract class C1254a extends BaseImplementation.C0669a<Status, C1954mw> {
        public C1254a(GoogleApiClient googleApiClient) {
            super(Address.f2173DQ, googleApiClient);
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    public static void requestUserAddress(GoogleApiClient googleApiClient, final UserAddressRequest userAddressRequest, final int i) {
        googleApiClient.mo10938a(new C1254a(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1954mw mwVar) throws RemoteException {
                mwVar.mo16215a(userAddressRequest, i);
                mo10914b(Status.f663Kw);
            }
        });
    }
}
