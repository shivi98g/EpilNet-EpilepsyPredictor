package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet;

/* renamed from: com.google.android.gms.internal.qg */
public class C2137qg implements Payments {
    public void changeMaskedWallet(GoogleApiClient googleApiClient, String str, String str2, int i) {
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        googleApiClient.mo10938a(new Wallet.C2645b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2143qh qhVar) {
                qhVar.mo16990d(str3, str4, i2);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleApiClient, final int i) {
        googleApiClient.mo10938a(new Wallet.C2645b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2143qh qhVar) {
                qhVar.mo16991gk(i);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleApiClient, final FullWalletRequest fullWalletRequest, final int i) {
        googleApiClient.mo10938a(new Wallet.C2645b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2143qh qhVar) {
                qhVar.mo16986a(fullWalletRequest, i);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleApiClient, final MaskedWalletRequest maskedWalletRequest, final int i) {
        googleApiClient.mo10938a(new Wallet.C2645b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2143qh qhVar) {
                qhVar.mo16987a(maskedWalletRequest, i);
                mo10914b(Status.f663Kw);
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleApiClient, final NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        googleApiClient.mo10938a(new Wallet.C2645b(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2143qh qhVar) {
                qhVar.mo16988a(notifyTransactionStatusRequest);
                mo10914b(Status.f663Kw);
            }
        });
    }
}
