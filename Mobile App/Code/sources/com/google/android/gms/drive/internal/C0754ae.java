package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

/* renamed from: com.google.android.gms.drive.internal.ae */
public interface C0754ae extends IInterface {

    /* renamed from: com.google.android.gms.drive.internal.ae$a */
    public static abstract class C0755a extends Binder implements C0754ae {

        /* renamed from: com.google.android.gms.drive.internal.ae$a$a */
        private static class C0756a implements C0754ae {

            /* renamed from: le */
            private IBinder f1030le;

            C0756a(IBinder iBinder) {
                this.f1030le = iBinder;
            }

            /* renamed from: a */
            public IntentSender mo11483a(CreateFileIntentSenderRequest createFileIntentSenderRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        createFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1030le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public IntentSender mo11484a(OpenFileIntentSenderRequest openFileIntentSenderRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        openFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1030le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11485a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (realtimeDocumentSyncRequest != null) {
                        obtain.writeInt(1);
                        realtimeDocumentSyncRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11486a(AddEventListenerRequest addEventListenerRequest, C0760ag agVar, String str, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addEventListenerRequest != null) {
                        obtain.writeInt(1);
                        addEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(agVar != null ? agVar.asBinder() : null);
                    obtain.writeString(str);
                    if (afVar != null) {
                        iBinder = afVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f1030le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11487a(AuthorizeAccessRequest authorizeAccessRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (authorizeAccessRequest != null) {
                        obtain.writeInt(1);
                        authorizeAccessRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11488a(CancelPendingActionsRequest cancelPendingActionsRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (cancelPendingActionsRequest != null) {
                        obtain.writeInt(1);
                        cancelPendingActionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11489a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (checkResourceIdsExistRequest != null) {
                        obtain.writeInt(1);
                        checkResourceIdsExistRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11490a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsAndUpdateMetadataRequest != null) {
                        obtain.writeInt(1);
                        closeContentsAndUpdateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11491a(CloseContentsRequest closeContentsRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsRequest != null) {
                        obtain.writeInt(1);
                        closeContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11492a(CreateContentsRequest createContentsRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createContentsRequest != null) {
                        obtain.writeInt(1);
                        createContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11493a(CreateFileRequest createFileRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileRequest != null) {
                        obtain.writeInt(1);
                        createFileRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11494a(CreateFolderRequest createFolderRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFolderRequest != null) {
                        obtain.writeInt(1);
                        createFolderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11495a(DeleteResourceRequest deleteResourceRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (deleteResourceRequest != null) {
                        obtain.writeInt(1);
                        deleteResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11496a(DisconnectRequest disconnectRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (disconnectRequest != null) {
                        obtain.writeInt(1);
                        disconnectRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1030le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11497a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getDriveIdFromUniqueIdentifierRequest != null) {
                        obtain.writeInt(1);
                        getDriveIdFromUniqueIdentifierRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11498a(GetMetadataRequest getMetadataRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getMetadataRequest != null) {
                        obtain.writeInt(1);
                        getMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11499a(ListParentsRequest listParentsRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (listParentsRequest != null) {
                        obtain.writeInt(1);
                        listParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11500a(LoadRealtimeRequest loadRealtimeRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (loadRealtimeRequest != null) {
                        obtain.writeInt(1);
                        loadRealtimeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11501a(OpenContentsRequest openContentsRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openContentsRequest != null) {
                        obtain.writeInt(1);
                        openContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11502a(QueryRequest queryRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11503a(RemoveEventListenerRequest removeEventListenerRequest, C0760ag agVar, String str, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removeEventListenerRequest != null) {
                        obtain.writeInt(1);
                        removeEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(agVar != null ? agVar.asBinder() : null);
                    obtain.writeString(str);
                    if (afVar != null) {
                        iBinder = afVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f1030le.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11504a(SetDrivePreferencesRequest setDrivePreferencesRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setDrivePreferencesRequest != null) {
                        obtain.writeInt(1);
                        setDrivePreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11505a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setFileUploadPreferencesRequest != null) {
                        obtain.writeInt(1);
                        setFileUploadPreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11506a(SetResourceParentsRequest setResourceParentsRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setResourceParentsRequest != null) {
                        obtain.writeInt(1);
                        setResourceParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11507a(TrashResourceRequest trashResourceRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (trashResourceRequest != null) {
                        obtain.writeInt(1);
                        trashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11508a(UpdateMetadataRequest updateMetadataRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updateMetadataRequest != null) {
                        obtain.writeInt(1);
                        updateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11509a(C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1030le;
            }

            /* renamed from: b */
            public void mo11510b(QueryRequest queryRequest, C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo11511b(C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo11512c(C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo11513d(C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo11514e(C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo11515f(C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo11516g(C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo11517h(C0757af afVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(afVar != null ? afVar.asBinder() : null);
                    this.f1030le.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: X */
        public static C0754ae m921X(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0754ae)) ? new C0756a(iBinder) : (C0754ae) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.gms.drive.internal.GetMetadataRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.gms.drive.internal.QueryRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.google.android.gms.drive.internal.UpdateMetadataRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.drive.internal.CreateContentsRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.google.android.gms.drive.internal.CreateFileRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.drive.internal.CreateFolderRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.google.android.gms.drive.internal.OpenContentsRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.google.android.gms.drive.internal.CloseContentsRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.google.android.gms.drive.internal.OpenFileIntentSenderRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: com.google.android.gms.drive.internal.CreateFileIntentSenderRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: com.google.android.gms.drive.internal.AuthorizeAccessRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: com.google.android.gms.drive.internal.ListParentsRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: com.google.android.gms.drive.internal.AddEventListenerRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: com.google.android.gms.drive.internal.RemoveEventListenerRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: com.google.android.gms.drive.internal.DisconnectRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: com.google.android.gms.drive.internal.TrashResourceRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: com.google.android.gms.drive.internal.QueryRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: com.google.android.gms.drive.internal.DeleteResourceRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: com.google.android.gms.drive.internal.LoadRealtimeRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: com.google.android.gms.drive.internal.SetResourceParentsRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: com.google.android.gms.drive.internal.CheckResourceIdsExistRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: com.google.android.gms.drive.internal.SetDrivePreferencesRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: com.google.android.gms.drive.RealtimeDocumentSyncRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: com.google.android.gms.drive.internal.CancelPendingActionsRequest} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v86 */
        /* JADX WARNING: type inference failed for: r2v87 */
        /* JADX WARNING: type inference failed for: r2v88 */
        /* JADX WARNING: type inference failed for: r2v89 */
        /* JADX WARNING: type inference failed for: r2v90 */
        /* JADX WARNING: type inference failed for: r2v91 */
        /* JADX WARNING: type inference failed for: r2v92 */
        /* JADX WARNING: type inference failed for: r2v93 */
        /* JADX WARNING: type inference failed for: r2v94 */
        /* JADX WARNING: type inference failed for: r2v95 */
        /* JADX WARNING: type inference failed for: r2v96 */
        /* JADX WARNING: type inference failed for: r2v97 */
        /* JADX WARNING: type inference failed for: r2v98 */
        /* JADX WARNING: type inference failed for: r2v99 */
        /* JADX WARNING: type inference failed for: r2v100 */
        /* JADX WARNING: type inference failed for: r2v101 */
        /* JADX WARNING: type inference failed for: r2v102 */
        /* JADX WARNING: type inference failed for: r2v103 */
        /* JADX WARNING: type inference failed for: r2v104 */
        /* JADX WARNING: type inference failed for: r2v105 */
        /* JADX WARNING: type inference failed for: r2v106 */
        /* JADX WARNING: type inference failed for: r2v107 */
        /* JADX WARNING: type inference failed for: r2v108 */
        /* JADX WARNING: type inference failed for: r2v109 */
        /* JADX WARNING: type inference failed for: r2v110 */
        /* JADX WARNING: type inference failed for: r2v111 */
        /* JADX WARNING: type inference failed for: r2v112 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r6 == r0) goto L_0x047c
                r0 = 0
                r2 = 0
                switch(r6) {
                    case 1: goto L_0x0459;
                    case 2: goto L_0x0436;
                    case 3: goto L_0x0413;
                    case 4: goto L_0x03f0;
                    case 5: goto L_0x03cd;
                    case 6: goto L_0x03aa;
                    case 7: goto L_0x0387;
                    case 8: goto L_0x0364;
                    case 9: goto L_0x0350;
                    case 10: goto L_0x0329;
                    case 11: goto L_0x0302;
                    case 12: goto L_0x02df;
                    case 13: goto L_0x02bc;
                    case 14: goto L_0x028d;
                    case 15: goto L_0x025e;
                    case 16: goto L_0x0243;
                    case 17: goto L_0x0220;
                    case 18: goto L_0x01fd;
                    case 19: goto L_0x01da;
                    case 20: goto L_0x01c6;
                    case 21: goto L_0x01b2;
                    case 22: goto L_0x019e;
                    case 23: goto L_0x018a;
                    case 24: goto L_0x0167;
                    default: goto L_0x000b;
                }
            L_0x000b:
                switch(r6) {
                    case 27: goto L_0x0144;
                    case 28: goto L_0x0121;
                    case 29: goto L_0x00fe;
                    case 30: goto L_0x00db;
                    case 31: goto L_0x00c7;
                    case 32: goto L_0x00b3;
                    case 33: goto L_0x0090;
                    case 34: goto L_0x006d;
                    case 35: goto L_0x0059;
                    case 36: goto L_0x0036;
                    case 37: goto L_0x0013;
                    default: goto L_0x000e;
                }
            L_0x000e:
                boolean r0 = super.onTransact(r6, r7, r8, r9)
                return r0
            L_0x0013:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0027
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CancelPendingActionsRequest> r0 = com.google.android.gms.drive.internal.CancelPendingActionsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.CancelPendingActionsRequest r2 = (com.google.android.gms.drive.internal.CancelPendingActionsRequest) r2
            L_0x0027:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11488a((com.google.android.gms.drive.internal.CancelPendingActionsRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0036:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x004a
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest> r0 = com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest r2 = (com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest) r2
            L_0x004a:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11505a((com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0059:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11517h(r0)
                r8.writeNoException()
                return r1
            L_0x006d:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0081
                android.os.Parcelable$Creator<com.google.android.gms.drive.RealtimeDocumentSyncRequest> r0 = com.google.android.gms.drive.RealtimeDocumentSyncRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.RealtimeDocumentSyncRequest r2 = (com.google.android.gms.drive.RealtimeDocumentSyncRequest) r2
            L_0x0081:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11485a((com.google.android.gms.drive.RealtimeDocumentSyncRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0090:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00a4
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.SetDrivePreferencesRequest> r0 = com.google.android.gms.drive.internal.SetDrivePreferencesRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.SetDrivePreferencesRequest r2 = (com.google.android.gms.drive.internal.SetDrivePreferencesRequest) r2
            L_0x00a4:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11504a((com.google.android.gms.drive.internal.SetDrivePreferencesRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x00b3:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11516g(r0)
                r8.writeNoException()
                return r1
            L_0x00c7:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11515f(r0)
                r8.writeNoException()
                return r1
            L_0x00db:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x00ef
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CheckResourceIdsExistRequest> r0 = com.google.android.gms.drive.internal.CheckResourceIdsExistRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.CheckResourceIdsExistRequest r2 = (com.google.android.gms.drive.internal.CheckResourceIdsExistRequest) r2
            L_0x00ef:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11489a((com.google.android.gms.drive.internal.CheckResourceIdsExistRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x00fe:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0112
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest> r0 = com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest r2 = (com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest) r2
            L_0x0112:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11497a((com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0121:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0135
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.SetResourceParentsRequest> r0 = com.google.android.gms.drive.internal.SetResourceParentsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.SetResourceParentsRequest r2 = (com.google.android.gms.drive.internal.SetResourceParentsRequest) r2
            L_0x0135:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11506a((com.google.android.gms.drive.internal.SetResourceParentsRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0144:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0158
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.LoadRealtimeRequest> r0 = com.google.android.gms.drive.internal.LoadRealtimeRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.LoadRealtimeRequest r2 = (com.google.android.gms.drive.internal.LoadRealtimeRequest) r2
            L_0x0158:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11500a((com.google.android.gms.drive.internal.LoadRealtimeRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0167:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x017b
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.DeleteResourceRequest> r0 = com.google.android.gms.drive.internal.DeleteResourceRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.DeleteResourceRequest r2 = (com.google.android.gms.drive.internal.DeleteResourceRequest) r2
            L_0x017b:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11495a((com.google.android.gms.drive.internal.DeleteResourceRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x018a:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11514e(r0)
                r8.writeNoException()
                return r1
            L_0x019e:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11513d(r0)
                r8.writeNoException()
                return r1
            L_0x01b2:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11512c(r0)
                r8.writeNoException()
                return r1
            L_0x01c6:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11511b(r0)
                r8.writeNoException()
                return r1
            L_0x01da:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x01ee
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.QueryRequest> r0 = com.google.android.gms.drive.internal.QueryRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.QueryRequest r2 = (com.google.android.gms.drive.internal.QueryRequest) r2
            L_0x01ee:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11510b(r2, r0)
                r8.writeNoException()
                return r1
            L_0x01fd:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0211
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest> r0 = com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest r2 = (com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest) r2
            L_0x0211:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11490a((com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0220:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0234
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.TrashResourceRequest> r0 = com.google.android.gms.drive.internal.TrashResourceRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.TrashResourceRequest r2 = (com.google.android.gms.drive.internal.TrashResourceRequest) r2
            L_0x0234:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11507a((com.google.android.gms.drive.internal.TrashResourceRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0243:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0257
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.DisconnectRequest> r0 = com.google.android.gms.drive.internal.DisconnectRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.DisconnectRequest r2 = (com.google.android.gms.drive.internal.DisconnectRequest) r2
            L_0x0257:
                r5.mo11496a((com.google.android.gms.drive.internal.DisconnectRequest) r2)
                r8.writeNoException()
                return r1
            L_0x025e:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0272
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.RemoveEventListenerRequest> r0 = com.google.android.gms.drive.internal.RemoveEventListenerRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.RemoveEventListenerRequest r2 = (com.google.android.gms.drive.internal.RemoveEventListenerRequest) r2
            L_0x0272:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.ag r0 = com.google.android.gms.drive.internal.C0760ag.C0761a.m985Z(r0)
                java.lang.String r3 = r7.readString()
                android.os.IBinder r4 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r4 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r4)
                r5.mo11503a((com.google.android.gms.drive.internal.RemoveEventListenerRequest) r2, (com.google.android.gms.drive.internal.C0760ag) r0, (java.lang.String) r3, (com.google.android.gms.drive.internal.C0757af) r4)
                r8.writeNoException()
                return r1
            L_0x028d:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x02a1
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.AddEventListenerRequest> r0 = com.google.android.gms.drive.internal.AddEventListenerRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.AddEventListenerRequest r2 = (com.google.android.gms.drive.internal.AddEventListenerRequest) r2
            L_0x02a1:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.ag r0 = com.google.android.gms.drive.internal.C0760ag.C0761a.m985Z(r0)
                java.lang.String r3 = r7.readString()
                android.os.IBinder r4 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r4 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r4)
                r5.mo11486a((com.google.android.gms.drive.internal.AddEventListenerRequest) r2, (com.google.android.gms.drive.internal.C0760ag) r0, (java.lang.String) r3, (com.google.android.gms.drive.internal.C0757af) r4)
                r8.writeNoException()
                return r1
            L_0x02bc:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x02d0
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.ListParentsRequest> r0 = com.google.android.gms.drive.internal.ListParentsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.ListParentsRequest r2 = (com.google.android.gms.drive.internal.ListParentsRequest) r2
            L_0x02d0:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11499a((com.google.android.gms.drive.internal.ListParentsRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x02df:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x02f3
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.AuthorizeAccessRequest> r0 = com.google.android.gms.drive.internal.AuthorizeAccessRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.AuthorizeAccessRequest r2 = (com.google.android.gms.drive.internal.AuthorizeAccessRequest) r2
            L_0x02f3:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11487a((com.google.android.gms.drive.internal.AuthorizeAccessRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0302:
                java.lang.String r3 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r3)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x0315
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CreateFileIntentSenderRequest> r2 = com.google.android.gms.drive.internal.CreateFileIntentSenderRequest.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r7)
                com.google.android.gms.drive.internal.CreateFileIntentSenderRequest r2 = (com.google.android.gms.drive.internal.CreateFileIntentSenderRequest) r2
            L_0x0315:
                android.content.IntentSender r2 = r5.mo11483a((com.google.android.gms.drive.internal.CreateFileIntentSenderRequest) r2)
                r8.writeNoException()
                if (r2 == 0) goto L_0x0325
                r8.writeInt(r1)
                r2.writeToParcel(r8, r1)
                return r1
            L_0x0325:
                r8.writeInt(r0)
                return r1
            L_0x0329:
                java.lang.String r3 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r3)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x033c
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OpenFileIntentSenderRequest> r2 = com.google.android.gms.drive.internal.OpenFileIntentSenderRequest.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r7)
                com.google.android.gms.drive.internal.OpenFileIntentSenderRequest r2 = (com.google.android.gms.drive.internal.OpenFileIntentSenderRequest) r2
            L_0x033c:
                android.content.IntentSender r2 = r5.mo11484a((com.google.android.gms.drive.internal.OpenFileIntentSenderRequest) r2)
                r8.writeNoException()
                if (r2 == 0) goto L_0x034c
                r8.writeInt(r1)
                r2.writeToParcel(r8, r1)
                return r1
            L_0x034c:
                r8.writeInt(r0)
                return r1
            L_0x0350:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11509a((com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0364:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0378
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CloseContentsRequest> r0 = com.google.android.gms.drive.internal.CloseContentsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.CloseContentsRequest r2 = (com.google.android.gms.drive.internal.CloseContentsRequest) r2
            L_0x0378:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11491a((com.google.android.gms.drive.internal.CloseContentsRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0387:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x039b
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.OpenContentsRequest> r0 = com.google.android.gms.drive.internal.OpenContentsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.OpenContentsRequest r2 = (com.google.android.gms.drive.internal.OpenContentsRequest) r2
            L_0x039b:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11501a((com.google.android.gms.drive.internal.OpenContentsRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x03aa:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x03be
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CreateFolderRequest> r0 = com.google.android.gms.drive.internal.CreateFolderRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.CreateFolderRequest r2 = (com.google.android.gms.drive.internal.CreateFolderRequest) r2
            L_0x03be:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11494a((com.google.android.gms.drive.internal.CreateFolderRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x03cd:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x03e1
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CreateFileRequest> r0 = com.google.android.gms.drive.internal.CreateFileRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.CreateFileRequest r2 = (com.google.android.gms.drive.internal.CreateFileRequest) r2
            L_0x03e1:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11493a((com.google.android.gms.drive.internal.CreateFileRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x03f0:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0404
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.CreateContentsRequest> r0 = com.google.android.gms.drive.internal.CreateContentsRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.CreateContentsRequest r2 = (com.google.android.gms.drive.internal.CreateContentsRequest) r2
            L_0x0404:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11492a((com.google.android.gms.drive.internal.CreateContentsRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0413:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0427
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.UpdateMetadataRequest> r0 = com.google.android.gms.drive.internal.UpdateMetadataRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.UpdateMetadataRequest r2 = (com.google.android.gms.drive.internal.UpdateMetadataRequest) r2
            L_0x0427:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11508a((com.google.android.gms.drive.internal.UpdateMetadataRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0436:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x044a
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.QueryRequest> r0 = com.google.android.gms.drive.internal.QueryRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.QueryRequest r2 = (com.google.android.gms.drive.internal.QueryRequest) r2
            L_0x044a:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11502a((com.google.android.gms.drive.internal.QueryRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x0459:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x046d
                android.os.Parcelable$Creator<com.google.android.gms.drive.internal.GetMetadataRequest> r0 = com.google.android.gms.drive.internal.GetMetadataRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                r2 = r0
                com.google.android.gms.drive.internal.GetMetadataRequest r2 = (com.google.android.gms.drive.internal.GetMetadataRequest) r2
            L_0x046d:
                android.os.IBinder r0 = r7.readStrongBinder()
                com.google.android.gms.drive.internal.af r0 = com.google.android.gms.drive.internal.C0757af.C0758a.m970Y(r0)
                r5.mo11498a((com.google.android.gms.drive.internal.GetMetadataRequest) r2, (com.google.android.gms.drive.internal.C0757af) r0)
                r8.writeNoException()
                return r1
            L_0x047c:
                java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
                r8.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.internal.C0754ae.C0755a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    IntentSender mo11483a(CreateFileIntentSenderRequest createFileIntentSenderRequest) throws RemoteException;

    /* renamed from: a */
    IntentSender mo11484a(OpenFileIntentSenderRequest openFileIntentSenderRequest) throws RemoteException;

    /* renamed from: a */
    void mo11485a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11486a(AddEventListenerRequest addEventListenerRequest, C0760ag agVar, String str, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11487a(AuthorizeAccessRequest authorizeAccessRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11488a(CancelPendingActionsRequest cancelPendingActionsRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11489a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11490a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11491a(CloseContentsRequest closeContentsRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11492a(CreateContentsRequest createContentsRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11493a(CreateFileRequest createFileRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11494a(CreateFolderRequest createFolderRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11495a(DeleteResourceRequest deleteResourceRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11496a(DisconnectRequest disconnectRequest) throws RemoteException;

    /* renamed from: a */
    void mo11497a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11498a(GetMetadataRequest getMetadataRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11499a(ListParentsRequest listParentsRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11500a(LoadRealtimeRequest loadRealtimeRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11501a(OpenContentsRequest openContentsRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11502a(QueryRequest queryRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11503a(RemoveEventListenerRequest removeEventListenerRequest, C0760ag agVar, String str, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11504a(SetDrivePreferencesRequest setDrivePreferencesRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11505a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11506a(SetResourceParentsRequest setResourceParentsRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11507a(TrashResourceRequest trashResourceRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11508a(UpdateMetadataRequest updateMetadataRequest, C0757af afVar) throws RemoteException;

    /* renamed from: a */
    void mo11509a(C0757af afVar) throws RemoteException;

    /* renamed from: b */
    void mo11510b(QueryRequest queryRequest, C0757af afVar) throws RemoteException;

    /* renamed from: b */
    void mo11511b(C0757af afVar) throws RemoteException;

    /* renamed from: c */
    void mo11512c(C0757af afVar) throws RemoteException;

    /* renamed from: d */
    void mo11513d(C0757af afVar) throws RemoteException;

    /* renamed from: e */
    void mo11514e(C0757af afVar) throws RemoteException;

    /* renamed from: f */
    void mo11515f(C0757af afVar) throws RemoteException;

    /* renamed from: g */
    void mo11516g(C0757af afVar) throws RemoteException;

    /* renamed from: h */
    void mo11517h(C0757af afVar) throws RemoteException;
}
