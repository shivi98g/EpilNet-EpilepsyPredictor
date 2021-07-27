package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.realtime.internal.C0943m;

/* renamed from: com.google.android.gms.drive.internal.af */
public interface C0757af extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.af$a */
    public static abstract class C0758a extends Binder implements C0757af {

        /* renamed from: com.google.android.gms.drive.internal.af$a$a */
        private static class C0759a implements C0757af {

            /* renamed from: le */
            private IBinder f1031le;

            C0759a(IBinder iBinder) {
                this.f1031le = iBinder;
            }

            /* renamed from: a */
            public void mo11520a(OnContentsResponse onContentsResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onContentsResponse != null) {
                        obtain.writeInt(1);
                        onContentsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11521a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDeviceUsagePreferenceResponse != null) {
                        obtain.writeInt(1);
                        onDeviceUsagePreferenceResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11522a(OnDownloadProgressResponse onDownloadProgressResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDownloadProgressResponse != null) {
                        obtain.writeInt(1);
                        onDownloadProgressResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11523a(OnDriveIdResponse onDriveIdResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDriveIdResponse != null) {
                        obtain.writeInt(1);
                        onDriveIdResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11524a(OnDrivePreferencesResponse onDrivePreferencesResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDrivePreferencesResponse != null) {
                        obtain.writeInt(1);
                        onDrivePreferencesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11525a(OnListEntriesResponse onListEntriesResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onListEntriesResponse != null) {
                        obtain.writeInt(1);
                        onListEntriesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11526a(OnListParentsResponse onListParentsResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onListParentsResponse != null) {
                        obtain.writeInt(1);
                        onListParentsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11527a(OnLoadRealtimeResponse onLoadRealtimeResponse, C0943m mVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onLoadRealtimeResponse != null) {
                        obtain.writeInt(1);
                        onLoadRealtimeResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
                    this.f1031le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11528a(OnMetadataResponse onMetadataResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onMetadataResponse != null) {
                        obtain.writeInt(1);
                        onMetadataResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11529a(OnResourceIdSetResponse onResourceIdSetResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onResourceIdSetResponse != null) {
                        obtain.writeInt(1);
                        onResourceIdSetResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11530a(OnStorageStatsResponse onStorageStatsResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onStorageStatsResponse != null) {
                        obtain.writeInt(1);
                        onStorageStatsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11531a(OnSyncMoreResponse onSyncMoreResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onSyncMoreResponse != null) {
                        obtain.writeInt(1);
                        onSyncMoreResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1031le;
            }

            /* renamed from: n */
            public void mo11532n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1031le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSuccess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    this.f1031le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0758a() {
            attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        }

        /* renamed from: Y */
        public static C0757af m970Y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0757af)) ? new C0759a(iBinder) : (C0757af) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.drive.internal.OnDownloadProgressResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.drive.internal.OnListEntriesResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.drive.internal.OnDriveIdResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.drive.internal.OnMetadataResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.android.gms.drive.internal.OnContentsResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: com.google.android.gms.common.api.Status} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.google.android.gms.drive.internal.OnListParentsResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: com.google.android.gms.drive.internal.OnSyncMoreResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: com.google.android.gms.drive.internal.OnStorageStatsResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: com.google.android.gms.drive.internal.OnLoadRealtimeResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: com.google.android.gms.drive.internal.OnResourceIdSetResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: com.google.android.gms.drive.internal.OnDrivePreferencesResponse} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v56 */
        /* JADX WARNING: type inference failed for: r0v57 */
        /* JADX WARNING: type inference failed for: r0v58 */
        /* JADX WARNING: type inference failed for: r0v59 */
        /* JADX WARNING: type inference failed for: r0v60 */
        /* JADX WARNING: type inference failed for: r0v61 */
        /* JADX WARNING: type inference failed for: r0v62 */
        /* JADX WARNING: type inference failed for: r0v63 */
        /* JADX WARNING: type inference failed for: r0v64 */
        /* JADX WARNING: type inference failed for: r0v65 */
        /* JADX WARNING: type inference failed for: r0v66 */
        /* JADX WARNING: type inference failed for: r0v67 */
        /* JADX WARNING: type inference failed for: r0v68 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x0173
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x0159;
                    case 2: goto L_0x013f;
                    case 3: goto L_0x0125;
                    case 4: goto L_0x010b;
                    case 5: goto L_0x00f1;
                    case 6: goto L_0x00d9;
                    case 7: goto L_0x00cd;
                    case 8: goto L_0x00b3;
                    case 9: goto L_0x0099;
                    case 10: goto L_0x007f;
                    case 11: goto L_0x005d;
                    case 12: goto L_0x0043;
                    case 13: goto L_0x0029;
                    case 14: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0022
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse> r0 = com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse r0 = (com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse) r0
            L_0x0022:
                r3.mo11521a((com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse) r0)
                r6.writeNoException()
                return r1
            L_0x0029:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x003c
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnDrivePreferencesResponse> r0 = com.google.android.gms.drive.internal.OnDrivePreferencesResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnDrivePreferencesResponse r0 = (com.google.android.gms.drive.internal.OnDrivePreferencesResponse) r0
            L_0x003c:
                r3.mo11524a((com.google.android.gms.drive.internal.OnDrivePreferencesResponse) r0)
                r6.writeNoException()
                return r1
            L_0x0043:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0056
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnResourceIdSetResponse> r0 = com.google.android.gms.drive.internal.OnResourceIdSetResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnResourceIdSetResponse r0 = (com.google.android.gms.drive.internal.OnResourceIdSetResponse) r0
            L_0x0056:
                r3.mo11529a((com.google.android.gms.drive.internal.OnResourceIdSetResponse) r0)
                r6.writeNoException()
                return r1
            L_0x005d:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0070
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnLoadRealtimeResponse> r0 = com.google.android.gms.drive.internal.OnLoadRealtimeResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnLoadRealtimeResponse r0 = (com.google.android.gms.drive.internal.OnLoadRealtimeResponse) r0
            L_0x0070:
                android.os.IBinder r2 = r5.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.m r2 = com.google.android.gms.drive.realtime.internal.C0943m.C0944a.m1517al(r2)
                r3.mo11527a(r0, r2)
                r6.writeNoException()
                return r1
            L_0x007f:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0092
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnStorageStatsResponse> r0 = com.google.android.gms.drive.internal.OnStorageStatsResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnStorageStatsResponse r0 = (com.google.android.gms.drive.internal.OnStorageStatsResponse) r0
            L_0x0092:
                r3.mo11530a((com.google.android.gms.drive.internal.OnStorageStatsResponse) r0)
                r6.writeNoException()
                return r1
            L_0x0099:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00ac
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnSyncMoreResponse> r0 = com.google.android.gms.drive.internal.OnSyncMoreResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnSyncMoreResponse r0 = (com.google.android.gms.drive.internal.OnSyncMoreResponse) r0
            L_0x00ac:
                r3.mo11531a((com.google.android.gms.drive.internal.OnSyncMoreResponse) r0)
                r6.writeNoException()
                return r1
            L_0x00b3:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00c6
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnListParentsResponse> r0 = com.google.android.gms.drive.internal.OnListParentsResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnListParentsResponse r0 = (com.google.android.gms.drive.internal.OnListParentsResponse) r0
            L_0x00c6:
                r3.mo11526a((com.google.android.gms.drive.internal.OnListParentsResponse) r0)
                r6.writeNoException()
                return r1
            L_0x00cd:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r0)
                r3.onSuccess()
                r6.writeNoException()
                return r1
            L_0x00d9:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x00ea
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel((android.os.Parcel) r5)
            L_0x00ea:
                r3.mo11532n(r0)
                r6.writeNoException()
                return r1
            L_0x00f1:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0104
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnContentsResponse> r0 = com.google.android.gms.drive.internal.OnContentsResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnContentsResponse r0 = (com.google.android.gms.drive.internal.OnContentsResponse) r0
            L_0x0104:
                r3.mo11520a((com.google.android.gms.drive.internal.OnContentsResponse) r0)
                r6.writeNoException()
                return r1
            L_0x010b:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x011e
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnMetadataResponse> r0 = com.google.android.gms.drive.internal.OnMetadataResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnMetadataResponse r0 = (com.google.android.gms.drive.internal.OnMetadataResponse) r0
            L_0x011e:
                r3.mo11528a((com.google.android.gms.drive.internal.OnMetadataResponse) r0)
                r6.writeNoException()
                return r1
            L_0x0125:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0138
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnDriveIdResponse> r0 = com.google.android.gms.drive.internal.OnDriveIdResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnDriveIdResponse r0 = (com.google.android.gms.drive.internal.OnDriveIdResponse) r0
            L_0x0138:
                r3.mo11523a((com.google.android.gms.drive.internal.OnDriveIdResponse) r0)
                r6.writeNoException()
                return r1
            L_0x013f:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0152
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnListEntriesResponse> r0 = com.google.android.gms.drive.internal.OnListEntriesResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnListEntriesResponse r0 = (com.google.android.gms.drive.internal.OnListEntriesResponse) r0
            L_0x0152:
                r3.mo11525a((com.google.android.gms.drive.internal.OnListEntriesResponse) r0)
                r6.writeNoException()
                return r1
            L_0x0159:
                java.lang.String r2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x016c
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OnDownloadProgressResponse> r0 = com.google.android.gms.drive.internal.OnDownloadProgressResponse.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.internal.OnDownloadProgressResponse r0 = (com.google.android.gms.drive.internal.OnDownloadProgressResponse) r0
            L_0x016c:
                r3.mo11522a((com.google.android.gms.drive.internal.OnDownloadProgressResponse) r0)
                r6.writeNoException()
                return r1
            L_0x0173:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.internal.C0757af.C0758a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo11520a(OnContentsResponse onContentsResponse) throws RemoteException;

    /* renamed from: a */
    void mo11521a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) throws RemoteException;

    /* renamed from: a */
    void mo11522a(OnDownloadProgressResponse onDownloadProgressResponse) throws RemoteException;

    /* renamed from: a */
    void mo11523a(OnDriveIdResponse onDriveIdResponse) throws RemoteException;

    /* renamed from: a */
    void mo11524a(OnDrivePreferencesResponse onDrivePreferencesResponse) throws RemoteException;

    /* renamed from: a */
    void mo11525a(OnListEntriesResponse onListEntriesResponse) throws RemoteException;

    /* renamed from: a */
    void mo11526a(OnListParentsResponse onListParentsResponse) throws RemoteException;

    /* renamed from: a */
    void mo11527a(OnLoadRealtimeResponse onLoadRealtimeResponse, C0943m mVar) throws RemoteException;

    /* renamed from: a */
    void mo11528a(OnMetadataResponse onMetadataResponse) throws RemoteException;

    /* renamed from: a */
    void mo11529a(OnResourceIdSetResponse onResourceIdSetResponse) throws RemoteException;

    /* renamed from: a */
    void mo11530a(OnStorageStatsResponse onStorageStatsResponse) throws RemoteException;

    /* renamed from: a */
    void mo11531a(OnSyncMoreResponse onSyncMoreResponse) throws RemoteException;

    /* renamed from: n */
    void mo11532n(Status status) throws RemoteException;

    void onSuccess() throws RemoteException;
}
