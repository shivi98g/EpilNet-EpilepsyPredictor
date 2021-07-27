package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.C1021ad;
import com.google.android.gms.fitness.request.C1027ah;
import com.google.android.gms.fitness.request.C1033b;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
import com.google.android.gms.internal.C1863lu;
import com.google.android.gms.internal.C1939mp;

/* renamed from: com.google.android.gms.internal.mh */
public class C1896mh implements BleApi {

    /* renamed from: com.google.android.gms.internal.mh$a */
    private static class C1903a extends C1939mp.C1940a {

        /* renamed from: Ea */
        private final BaseImplementation.C0670b<BleDevicesResult> f4072Ea;

        private C1903a(BaseImplementation.C0670b<BleDevicesResult> bVar) {
            this.f4072Ea = bVar;
        }

        /* renamed from: a */
        public void mo16141a(BleDevicesResult bleDevicesResult) {
            this.f4072Ea.mo10914b(bleDevicesResult);
        }
    }

    public PendingResult<Status> claimBleDevice(GoogleApiClient googleApiClient, final BleDevice bleDevice) {
        return googleApiClient.mo10940b(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16105a(new C1033b(bleDevice), (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<Status> claimBleDevice(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16105a(new C1033b(str), (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<BleDevicesResult> listClaimedBleDevices(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C1863lu.C1864a<BleDevicesResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16115a((C1939mp) new C1903a(this), luVar.getContext().getPackageName());
            }

            /* access modifiers changed from: protected */
            /* renamed from: v */
            public BleDevicesResult mo10544c(Status status) {
                return BleDevicesResult.m1966C(status);
            }
        });
    }

    public PendingResult<Status> startBleScan(GoogleApiClient googleApiClient, final StartBleScanRequest startBleScanRequest) {
        return googleApiClient.mo10938a(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16099a(startBleScanRequest, (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }

    public PendingResult<Status> stopBleScan(GoogleApiClient googleApiClient, final BleScanCallback bleScanCallback) {
        return googleApiClient.mo10938a(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                C1863lu.C1865b bVar = new C1863lu.C1865b(this);
                String packageName = luVar.getContext().getPackageName();
                luVar.mo16077jM().mo16101a(new C1021ad(bleScanCallback), (C1890md) bVar, packageName);
            }
        });
    }

    public PendingResult<Status> unclaimBleDevice(GoogleApiClient googleApiClient, BleDevice bleDevice) {
        return unclaimBleDevice(googleApiClient, bleDevice.getAddress());
    }

    public PendingResult<Status> unclaimBleDevice(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.mo10940b(new C1863lu.C1866c(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C1863lu luVar) throws RemoteException {
                luVar.mo16077jM().mo16103a(new C1027ah(str), (C1890md) new C1863lu.C1865b(this), luVar.getContext().getPackageName());
            }
        });
    }
}
