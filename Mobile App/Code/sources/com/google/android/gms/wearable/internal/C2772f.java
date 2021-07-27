package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.wearable.internal.f */
public final class C2772f implements DataApi {

    /* renamed from: com.google.android.gms.wearable.internal.f$a */
    private static final class C2781a extends C2770d<Status> {
        private DataApi.DataListener axC;
        private IntentFilter[] axD;

        private C2781a(GoogleApiClient googleApiClient, DataApi.DataListener dataListener, IntentFilter[] intentFilterArr) {
            super(googleApiClient);
            this.axC = dataListener;
            this.axD = intentFilterArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10540a(C2766ba baVar) throws RemoteException {
            baVar.mo19554a((BaseImplementation.C0670b<Status>) this, this.axC, this.axD);
            this.axC = null;
            this.axD = null;
        }

        /* renamed from: b */
        public Status mo10544c(Status status) {
            this.axC = null;
            this.axD = null;
            return status;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.f$b */
    public static class C2782b implements DataApi.DataItemResult {

        /* renamed from: Eb */
        private final Status f4554Eb;
        private final DataItem axE;

        public C2782b(Status status, DataItem dataItem) {
            this.f4554Eb = status;
            this.axE = dataItem;
        }

        public DataItem getDataItem() {
            return this.axE;
        }

        public Status getStatus() {
            return this.f4554Eb;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.f$c */
    public static class C2783c implements DataApi.DeleteDataItemsResult {

        /* renamed from: Eb */
        private final Status f4555Eb;
        private final int axF;

        public C2783c(Status status, int i) {
            this.f4555Eb = status;
            this.axF = i;
        }

        public int getNumDeleted() {
            return this.axF;
        }

        public Status getStatus() {
            return this.f4555Eb;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.f$d */
    public static class C2784d implements DataApi.GetFdForAssetResult {

        /* renamed from: Eb */
        private final Status f4556Eb;

        /* renamed from: ZO */
        private volatile InputStream f4557ZO;
        private volatile ParcelFileDescriptor axG;
        private volatile boolean mClosed = false;

        public C2784d(Status status, ParcelFileDescriptor parcelFileDescriptor) {
            this.f4556Eb = status;
            this.axG = parcelFileDescriptor;
        }

        public ParcelFileDescriptor getFd() {
            if (!this.mClosed) {
                return this.axG;
            }
            throw new IllegalStateException("Cannot access the file descriptor after release().");
        }

        public InputStream getInputStream() {
            if (this.mClosed) {
                throw new IllegalStateException("Cannot access the input stream after release().");
            } else if (this.axG == null) {
                return null;
            } else {
                if (this.f4557ZO == null) {
                    this.f4557ZO = new ParcelFileDescriptor.AutoCloseInputStream(this.axG);
                }
                return this.f4557ZO;
            }
        }

        public Status getStatus() {
            return this.f4556Eb;
        }

        public void release() {
            if (this.axG != null) {
                if (this.mClosed) {
                    throw new IllegalStateException("releasing an already released result.");
                }
                try {
                    if (this.f4557ZO != null) {
                        this.f4557ZO.close();
                    } else {
                        this.axG.close();
                    }
                    this.mClosed = true;
                    this.axG = null;
                    this.f4557ZO = null;
                } catch (IOException e) {
                }
            }
        }
    }

    /* renamed from: a */
    private PendingResult<Status> m8130a(GoogleApiClient googleApiClient, DataApi.DataListener dataListener, IntentFilter[] intentFilterArr) {
        return googleApiClient.mo10938a(new C2781a(googleApiClient, dataListener, intentFilterArr));
    }

    /* renamed from: a */
    private void m8131a(Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("asset is null");
        } else if (asset.getDigest() == null) {
            throw new IllegalArgumentException("invalid asset");
        } else if (asset.getData() != null) {
            throw new IllegalArgumentException("invalid asset");
        }
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, DataApi.DataListener dataListener) {
        return m8130a(googleApiClient, dataListener, (IntentFilter[]) null);
    }

    public PendingResult<DataApi.DeleteDataItemsResult> deleteDataItems(GoogleApiClient googleApiClient, final Uri uri) {
        return googleApiClient.mo10938a(new C2770d<DataApi.DeleteDataItemsResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19563c(this, uri);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aG */
            public DataApi.DeleteDataItemsResult mo10544c(Status status) {
                return new C2783c(status, 0);
            }
        });
    }

    public PendingResult<DataApi.DataItemResult> getDataItem(GoogleApiClient googleApiClient, final Uri uri) {
        return googleApiClient.mo10938a(new C2770d<DataApi.DataItemResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19551a((BaseImplementation.C0670b<DataApi.DataItemResult>) this, uri);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aE */
            public DataApi.DataItemResult mo10544c(Status status) {
                return new C2782b(status, (DataItem) null);
            }
        });
    }

    public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient) {
        return googleApiClient.mo10938a(new C2770d<DataItemBuffer>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19565n(this);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aF */
            public DataItemBuffer mo10544c(Status status) {
                return new DataItemBuffer(DataHolder.m625av(status.getStatusCode()));
            }
        });
    }

    public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient, final Uri uri) {
        return googleApiClient.mo10938a(new C2770d<DataItemBuffer>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19561b((BaseImplementation.C0670b<DataItemBuffer>) this, uri);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aF */
            public DataItemBuffer mo10544c(Status status) {
                return new DataItemBuffer(DataHolder.m625av(status.getStatusCode()));
            }
        });
    }

    public PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient googleApiClient, final Asset asset) {
        m8131a(asset);
        return googleApiClient.mo10938a(new C2770d<DataApi.GetFdForAssetResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19552a((BaseImplementation.C0670b<DataApi.GetFdForAssetResult>) this, asset);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aH */
            public DataApi.GetFdForAssetResult mo10544c(Status status) {
                return new C2784d(status, (ParcelFileDescriptor) null);
            }
        });
    }

    public PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient googleApiClient, final DataItemAsset dataItemAsset) {
        return googleApiClient.mo10938a(new C2770d<DataApi.GetFdForAssetResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19555a((BaseImplementation.C0670b<DataApi.GetFdForAssetResult>) this, dataItemAsset);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aH */
            public DataApi.GetFdForAssetResult mo10544c(Status status) {
                return new C2784d(status, (ParcelFileDescriptor) null);
            }
        });
    }

    public PendingResult<DataApi.DataItemResult> putDataItem(GoogleApiClient googleApiClient, final PutDataRequest putDataRequest) {
        return googleApiClient.mo10938a(new C2770d<DataApi.DataItemResult>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19559a((BaseImplementation.C0670b<DataApi.DataItemResult>) this, putDataRequest);
            }

            /* renamed from: aE */
            public DataApi.DataItemResult mo10544c(Status status) {
                return new C2782b(status, (DataItem) null);
            }
        });
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, final DataApi.DataListener dataListener) {
        return googleApiClient.mo10938a(new C2770d<Status>(googleApiClient) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10540a(C2766ba baVar) throws RemoteException {
                baVar.mo19553a((BaseImplementation.C0670b<Status>) this, dataListener);
            }

            /* renamed from: b */
            public Status mo10544c(Status status) {
                return status;
            }
        });
    }
}
