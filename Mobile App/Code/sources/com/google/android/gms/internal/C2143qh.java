package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1750jl;
import com.google.android.gms.internal.C2125qc;
import com.google.android.gms.internal.C2134qf;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.WalletConstants;

/* renamed from: com.google.android.gms.internal.qh */
public class C2143qh extends C1750jl<C2125qc> {

    /* renamed from: DZ */
    private final String f4218DZ;
    private final int avV;
    private final int mTheme;
    /* access modifiers changed from: private */

    /* renamed from: nB */
    public final Activity f4219nB;

    /* renamed from: com.google.android.gms.internal.qh$a */
    private static class C2145a extends C2134qf.C2135a {
        private C2145a() {
        }

        /* renamed from: a */
        public void mo16968a(int i, FullWallet fullWallet, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo16969a(int i, MaskedWallet maskedWallet, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo16970a(int i, boolean z, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo16971a(Status status, C2116py pyVar, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo16972i(int i, Bundle bundle) {
        }
    }

    /* renamed from: com.google.android.gms.internal.qh$b */
    final class C2146b extends C2145a {

        /* renamed from: My */
        private final int f4220My;

        public C2146b(int i) {
            super();
            this.f4220My = i;
        }

        /* renamed from: a */
        public void mo16968a(int i, FullWallet fullWallet, Bundle bundle) {
            int i2;
            String str;
            String str2;
            ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(C2143qh.this.f4219nB, this.f4220My);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    str = "WalletClientImpl";
                    str2 = "Exception starting pending intent";
                    Log.w(str, str2, e);
                }
            } else {
                Intent intent = new Intent();
                if (connectionResult.isSuccess()) {
                    i2 = -1;
                    intent.putExtra(WalletConstants.EXTRA_FULL_WALLET, fullWallet);
                } else {
                    int i3 = i == 408 ? 0 : 1;
                    intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
                    i2 = i3;
                }
                PendingIntent createPendingResult = C2143qh.this.f4219nB.createPendingResult(this.f4220My, intent, 1073741824);
                if (createPendingResult == null) {
                    Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
                    return;
                }
                try {
                    createPendingResult.send(i2);
                } catch (PendingIntent.CanceledException e2) {
                    e = e2;
                    str = "WalletClientImpl";
                    str2 = "Exception setting pending result";
                    Log.w(str, str2, e);
                }
            }
        }

        /* renamed from: a */
        public void mo16969a(int i, MaskedWallet maskedWallet, Bundle bundle) {
            int i2;
            String str;
            String str2;
            ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(C2143qh.this.f4219nB, this.f4220My);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    str = "WalletClientImpl";
                    str2 = "Exception starting pending intent";
                    Log.w(str, str2, e);
                }
            } else {
                Intent intent = new Intent();
                if (connectionResult.isSuccess()) {
                    i2 = -1;
                    intent.putExtra(WalletConstants.EXTRA_MASKED_WALLET, maskedWallet);
                } else {
                    int i3 = i == 408 ? 0 : 1;
                    intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
                    i2 = i3;
                }
                PendingIntent createPendingResult = C2143qh.this.f4219nB.createPendingResult(this.f4220My, intent, 1073741824);
                if (createPendingResult == null) {
                    Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
                    return;
                }
                try {
                    createPendingResult.send(i2);
                } catch (PendingIntent.CanceledException e2) {
                    e = e2;
                    str = "WalletClientImpl";
                    str2 = "Exception setting pending result";
                    Log.w(str, str2, e);
                }
            }
        }

        /* renamed from: a */
        public void mo16970a(int i, boolean z, Bundle bundle) {
            Intent intent = new Intent();
            intent.putExtra(WalletConstants.EXTRA_IS_USER_PREAUTHORIZED, z);
            PendingIntent createPendingResult = C2143qh.this.f4219nB.createPendingResult(this.f4220My, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
                return;
            }
            try {
                createPendingResult.send(-1);
            } catch (PendingIntent.CanceledException e) {
                Log.w("WalletClientImpl", "Exception setting pending result", e);
            }
        }

        /* renamed from: i */
        public void mo16972i(int i, Bundle bundle) {
            String str;
            String str2;
            C1785jx.m5359b(bundle, (Object) "Bundle should not be null");
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(C2143qh.this.f4219nB, this.f4220My);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    str = "WalletClientImpl";
                    str2 = "Exception starting pending intent";
                    Log.w(str, str2, e);
                }
            } else {
                Log.e("WalletClientImpl", "Create Wallet Objects confirmation UI will not be shown connection result: " + connectionResult);
                Intent intent = new Intent();
                intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, WalletConstants.ERROR_CODE_UNKNOWN);
                PendingIntent createPendingResult = C2143qh.this.f4219nB.createPendingResult(this.f4220My, intent, 1073741824);
                if (createPendingResult == null) {
                    Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
                    return;
                }
                try {
                    createPendingResult.send(1);
                } catch (PendingIntent.CanceledException e2) {
                    e = e2;
                    str = "WalletClientImpl";
                    str2 = "Exception setting pending result";
                    Log.w(str, str2, e);
                }
            }
        }
    }

    public C2143qh(Activity activity, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, String str, int i2) {
        super(activity, looper, connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.f4219nB = activity;
        this.avV = i;
        this.f4218DZ = str;
        this.mTheme = i2;
    }

    /* renamed from: a */
    public static Bundle m6293a(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putString("androidPackageName", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    /* renamed from: rf */
    private Bundle m6295rf() {
        return m6293a(this.avV, this.f4219nB.getPackageName(), this.f4218DZ, this.mTheme);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11711a(C1775jt jtVar, C1750jl.C1755e eVar) throws RemoteException {
        jtVar.mo15918k(eVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName());
    }

    /* renamed from: a */
    public void mo16986a(FullWalletRequest fullWalletRequest, int i) {
        C2146b bVar = new C2146b(i);
        try {
            ((C2125qc) mo15820hw()).mo16952a(fullWalletRequest, m6295rf(), (C2134qf) bVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", e);
            bVar.mo16968a(8, (FullWallet) null, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public void mo16987a(MaskedWalletRequest maskedWalletRequest, int i) {
        Bundle rf = m6295rf();
        C2146b bVar = new C2146b(i);
        try {
            ((C2125qc) mo15820hw()).mo16954a(maskedWalletRequest, rf, (C2134qf) bVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", e);
            bVar.mo16969a(8, (MaskedWallet) null, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public void mo16988a(NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        try {
            ((C2125qc) mo15820hw()).mo16955a(notifyTransactionStatusRequest, m6295rf());
        } catch (RemoteException e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bK */
    public String mo11714bK() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public String mo11715bL() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bV */
    public C2125qc mo11721l(IBinder iBinder) {
        return C2125qc.C2126a.m6255bR(iBinder);
    }

    /* renamed from: d */
    public void mo16990d(String str, String str2, int i) {
        Bundle rf = m6295rf();
        C2146b bVar = new C2146b(i);
        try {
            ((C2125qc) mo15820hw()).mo16957a(str, str2, rf, bVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", e);
            bVar.mo16969a(8, (MaskedWallet) null, Bundle.EMPTY);
        }
    }

    /* renamed from: gk */
    public void mo16991gk(int i) {
        Bundle rf = m6295rf();
        C2146b bVar = new C2146b(i);
        try {
            ((C2125qc) mo15820hw()).mo16950a(rf, (C2134qf) bVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", e);
            bVar.mo16970a(8, false, Bundle.EMPTY);
        }
    }
}
