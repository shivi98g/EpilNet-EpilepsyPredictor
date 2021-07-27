package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1744jg;
import com.google.android.gms.internal.C1785jx;
import com.google.android.gms.internal.C2113pv;
import com.google.android.gms.internal.C2137qg;
import com.google.android.gms.internal.C2143qh;
import com.google.android.gms.internal.C2148qj;
import com.google.android.gms.internal.C2149qk;
import com.google.android.gms.wallet.wobs.C2693r;
import java.util.Locale;

public final class Wallet {
    public static final Api<WalletOptions> API = new Api<>(f4501DR, f4500DQ, new Scope[0]);
    /* access modifiers changed from: private */

    /* renamed from: DQ */
    public static final Api.C0668c<C2143qh> f4500DQ = new Api.C0668c<>();

    /* renamed from: DR */
    private static final Api.C0667b<C2143qh, WalletOptions> f4501DR = new Api.C0667b<C2143qh, WalletOptions>() {
        /* renamed from: a */
        public C2143qh mo10533a(Context context, Looper looper, C1744jg jgVar, WalletOptions walletOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            Context context2 = context;
            C1785jx.m5361b(context2 instanceof Activity, (Object) "An Activity must be used for Wallet APIs");
            Activity activity = (Activity) context2;
            WalletOptions walletOptions2 = walletOptions != null ? walletOptions : new WalletOptions();
            return new C2143qh(activity, looper, connectionCallbacks, onConnectionFailedListener, walletOptions2.environment, jgVar.getAccountName(), walletOptions2.theme);
        }

        public int getPriority() {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    };
    public static final Payments Payments = new C2137qg();
    public static final C2693r avT = new C2149qk();
    public static final C2113pv avU = new C2148qj();

    public static final class WalletOptions implements Api.ApiOptions.HasOptions {
        public final int environment;
        public final int theme;

        public static final class Builder {
            /* access modifiers changed from: private */
            public int avV = 0;
            /* access modifiers changed from: private */
            public int mTheme = 0;

            public WalletOptions build() {
                return new WalletOptions(this);
            }

            public Builder setEnvironment(int i) {
                if (i == 0 || i == 2 || i == 1) {
                    this.avV = i;
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i)}));
            }

            public Builder setTheme(int i) {
                if (i == 0 || i == 1) {
                    this.mTheme = i;
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[]{Integer.valueOf(i)}));
            }
        }

        private WalletOptions() {
            this(new Builder());
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.avV;
            this.theme = builder.mTheme;
        }
    }

    /* renamed from: com.google.android.gms.wallet.Wallet$a */
    public static abstract class C2644a<R extends Result> extends BaseImplementation.C0669a<R, C2143qh> {
        public C2644a(GoogleApiClient googleApiClient) {
            super(Wallet.f4500DQ, googleApiClient);
        }
    }

    /* renamed from: com.google.android.gms.wallet.Wallet$b */
    public static abstract class C2645b extends C2644a<Status> {
        public C2645b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Status mo10544c(Status status) {
            return status;
        }
    }

    private Wallet() {
    }

    @Deprecated
    public static void changeMaskedWallet(GoogleApiClient googleApiClient, String str, String str2, int i) {
        Payments.changeMaskedWallet(googleApiClient, str, str2, i);
    }

    @Deprecated
    public static void checkForPreAuthorization(GoogleApiClient googleApiClient, int i) {
        Payments.checkForPreAuthorization(googleApiClient, i);
    }

    @Deprecated
    public static void loadFullWallet(GoogleApiClient googleApiClient, FullWalletRequest fullWalletRequest, int i) {
        Payments.loadFullWallet(googleApiClient, fullWalletRequest, i);
    }

    @Deprecated
    public static void loadMaskedWallet(GoogleApiClient googleApiClient, MaskedWalletRequest maskedWalletRequest, int i) {
        Payments.loadMaskedWallet(googleApiClient, maskedWalletRequest, i);
    }

    @Deprecated
    public static void notifyTransactionStatus(GoogleApiClient googleApiClient, NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        Payments.notifyTransactionStatus(googleApiClient, notifyTransactionStatusRequest);
    }
}
