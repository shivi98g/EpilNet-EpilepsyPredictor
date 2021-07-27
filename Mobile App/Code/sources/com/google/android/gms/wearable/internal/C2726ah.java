package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

/* renamed from: com.google.android.gms.wearable.internal.ah */
public final class C2726ah implements MessageApi {

    /* renamed from: com.google.android.gms.wearable.internal.ah$a */
    private static final class C2729a extends C2770d<Status> {
        private IntentFilter[] axD;
        private MessageApi.MessageListener axV;

        private C2729a(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, IntentFilter[] intentFilterArr) {
            super(googleApiClient);
            this.axV = messageListener;
            this.axD = intentFilterArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(C2766ba baVar) throws RemoteException {
            baVar.mo19557a((BaseImplementation.C0670b<Status>) this, this.axV, this.axD);
            this.axV = null;
            this.axD = null;
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            this.axV = null;
            this.axD = null;
            return status;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.ah$b */
    public static class C2730b implements MessageApi.SendMessageResult {

        /* renamed from: Eb */
        private final Status f4541Eb;

        /* renamed from: ve */
        private final int f4542ve;

        public C2730b(Status status, int i) {
            this.f4541Eb = status;
            this.f4542ve = i;
        }

        public int getRequestId() {
            return this.f4542ve;
        }

        public Status getStatus() {
            return this.f4541Eb;
        }
    }

    /* renamed from: a */
    private PendingResult<Status> m8032a(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, IntentFilter[] intentFilterArr) {
        return googleApiClient.mo10938a(new C2729a(googleApiClient, messageListener, intentFilterArr));
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        return m8032a(googleApiClient, messageListener, (IntentFilter[]) null);
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, final MessageApi.MessageListener messageListener) {
        return googleApiClient.mo10938a(new C2770d<Status>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19556a((BaseImplementation.C0670b<Status>) this, messageListener);
            }

            /* renamed from: b */
            public Status mo10544c(Status status) {
                return status;
            }
        });
    }

    public PendingResult<MessageApi.SendMessageResult> sendMessage(GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
        final String str3 = str;
        final String str4 = str2;
        final byte[] bArr2 = bArr;
        return googleApiClient.mo10938a(new C2770d<MessageApi.SendMessageResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19560a(this, str3, str4, bArr2);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aI */
            public MessageApi.SendMessageResult mo10544c(Status status) {
                return new C2730b(status, -1);
            }
        });
    }
}
