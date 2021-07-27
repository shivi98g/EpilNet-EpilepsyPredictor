package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.drive.realtime.internal.m */
public interface C0943m extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.m$a */
    public static abstract class C0944a extends Binder implements C0943m {

        /* renamed from: com.google.android.gms.drive.realtime.internal.m$a$a */
        private static class C0945a implements C0943m {

            /* renamed from: le */
            private IBinder f1284le;

            C0945a(IBinder iBinder) {
                this.f1284le = iBinder;
            }

            /* renamed from: a */
            public void mo12058a(int i, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12059a(BeginCompoundOperationRequest beginCompoundOperationRequest, C0949o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (beginCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        beginCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f1284le.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12060a(EndCompoundOperationRequest endCompoundOperationRequest, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (endCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        endCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12061a(EndCompoundOperationRequest endCompoundOperationRequest, C0949o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (endCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        endCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f1284le.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12062a(ParcelableIndexReference parcelableIndexReference, C0946n nVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcelableIndexReference != null) {
                        obtain.writeInt(1);
                        parcelableIndexReference.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    this.f1284le.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12063a(C0903c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    this.f1284le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12064a(C0906d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f1284le.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12065a(C0909e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.f1284le.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12066a(C0928h hVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f1284le.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12067a(C0931i iVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.f1284le.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12068a(C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12069a(C0940l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f1284le.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12070a(C0949o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f1284le.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12071a(String str, int i, int i2, C0925g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f1284le.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12072a(String str, int i, int i2, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12073a(String str, int i, DataHolder dataHolder, C0925g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f1284le.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12074a(String str, int i, DataHolder dataHolder, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12075a(String str, int i, C0949o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f1284le.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12076a(String str, int i, String str2, int i2, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12077a(String str, int i, String str2, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12078a(String str, DataHolder dataHolder, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12079a(String str, C0922f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f1284le.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12080a(String str, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12081a(String str, C0937k kVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
                    this.f1284le.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12082a(String str, C0940l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f1284le.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12083a(String str, C0946n nVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    this.f1284le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12084a(String str, C0949o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f1284le.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12085a(String str, String str2, C0922f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f1284le.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12086a(String str, String str2, C0925g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f1284le.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12087a(String str, String str2, C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1284le;
            }

            /* renamed from: b */
            public void mo12088b(C0903c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    this.f1284le.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo12089b(C0934j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f1284le.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo12090b(C0940l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f1284le.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo12091b(C0949o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f1284le.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo12092b(String str, C0922f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f1284le.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo12093b(String str, C0940l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f1284le.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo12094b(String str, C0946n nVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    this.f1284le.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo12095b(String str, C0949o oVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.f1284le.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo12096c(C0903c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    this.f1284le.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo12097c(String str, C0940l lVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.f1284le.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo12098d(C0903c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    this.f1284le.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: al */
        public static C0943m m1517al(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0943m)) ? new C0945a(iBinder) : (C0943m) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: com.google.android.gms.drive.realtime.internal.ParcelableIndexReference} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v111 */
        /* JADX WARNING: type inference failed for: r0v112 */
        /* JADX WARNING: type inference failed for: r0v113 */
        /* JADX WARNING: type inference failed for: r0v114 */
        /* JADX WARNING: type inference failed for: r0v115 */
        /* JADX WARNING: type inference failed for: r0v116 */
        /* JADX WARNING: type inference failed for: r0v117 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
            /*
                r8 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r9 == r0) goto L_0x0438
                r0 = 0
                switch(r9) {
                    case 1: goto L_0x0420;
                    case 2: goto L_0x040c;
                    case 3: goto L_0x03f8;
                    case 4: goto L_0x03dc;
                    case 5: goto L_0x03c4;
                    case 6: goto L_0x03a0;
                    case 7: goto L_0x0388;
                    case 8: goto L_0x0370;
                    case 9: goto L_0x0358;
                    case 10: goto L_0x0338;
                    case 11: goto L_0x0318;
                    case 12: goto L_0x02fc;
                    case 13: goto L_0x02e4;
                    case 14: goto L_0x02cc;
                    case 15: goto L_0x02a4;
                    case 16: goto L_0x027c;
                    case 17: goto L_0x025c;
                    case 18: goto L_0x023a;
                    case 19: goto L_0x0218;
                    case 20: goto L_0x0200;
                    case 21: goto L_0x01e4;
                    case 22: goto L_0x01d0;
                    case 23: goto L_0x01bc;
                    case 24: goto L_0x01a8;
                    case 25: goto L_0x0194;
                    case 26: goto L_0x0172;
                    case 27: goto L_0x015a;
                    case 28: goto L_0x013e;
                    case 29: goto L_0x012a;
                    case 30: goto L_0x0112;
                    case 31: goto L_0x00fe;
                    case 32: goto L_0x00ea;
                    case 33: goto L_0x00d6;
                    case 34: goto L_0x00c2;
                    case 35: goto L_0x00ae;
                    case 36: goto L_0x009a;
                    case 37: goto L_0x0075;
                    case 38: goto L_0x005d;
                    case 39: goto L_0x0045;
                    case 40: goto L_0x0031;
                    case 41: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r9, r10, r11, r12)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r2)
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0022
                android.os.Parcelable$Creator<com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest> r0 = com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest r0 = (com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest) r0
            L_0x0022:
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r2 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r2)
                r8.mo12060a((com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest) r0, (com.google.android.gms.drive.realtime.internal.C0934j) r2)
                r11.writeNoException()
                return r1
            L_0x0031:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.l r0 = com.google.android.gms.drive.realtime.internal.C0940l.C0941a.m1473ak(r0)
                r8.mo12069a((com.google.android.gms.drive.realtime.internal.C0940l) r0)
                r11.writeNoException()
                return r1
            L_0x0045:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.o r2 = com.google.android.gms.drive.realtime.internal.C0949o.C0950a.m1565an(r2)
                r8.mo12095b((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0949o) r2)
                r11.writeNoException()
                return r1
            L_0x005d:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.o r2 = com.google.android.gms.drive.realtime.internal.C0949o.C0950a.m1565an(r2)
                r8.mo12084a((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0949o) r2)
                r11.writeNoException()
                return r1
            L_0x0075:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r3 = r10.readString()
                int r4 = r10.readInt()
                java.lang.String r5 = r10.readString()
                int r6 = r10.readInt()
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r7 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r0)
                r2 = r8
                r2.mo12076a(r3, r4, r5, r6, r7)
                r11.writeNoException()
                return r1
            L_0x009a:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.h r0 = com.google.android.gms.drive.realtime.internal.C0928h.C0929a.m1456ag(r0)
                r8.mo12066a((com.google.android.gms.drive.realtime.internal.C0928h) r0)
                r11.writeNoException()
                return r1
            L_0x00ae:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.o r0 = com.google.android.gms.drive.realtime.internal.C0949o.C0950a.m1565an(r0)
                r8.mo12091b((com.google.android.gms.drive.realtime.internal.C0949o) r0)
                r11.writeNoException()
                return r1
            L_0x00c2:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.i r0 = com.google.android.gms.drive.realtime.internal.C0931i.C0932a.m1459ah(r0)
                r8.mo12067a((com.google.android.gms.drive.realtime.internal.C0931i) r0)
                r11.writeNoException()
                return r1
            L_0x00d6:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.c r0 = com.google.android.gms.drive.realtime.internal.C0903c.C0904a.m1402ab(r0)
                r8.mo12088b((com.google.android.gms.drive.realtime.internal.C0903c) r0)
                r11.writeNoException()
                return r1
            L_0x00ea:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.d r0 = com.google.android.gms.drive.realtime.internal.C0906d.C0907a.m1407ac(r0)
                r8.mo12064a((com.google.android.gms.drive.realtime.internal.C0906d) r0)
                r11.writeNoException()
                return r1
            L_0x00fe:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.e r0 = com.google.android.gms.drive.realtime.internal.C0909e.C0910a.m1412ad(r0)
                r8.mo12065a((com.google.android.gms.drive.realtime.internal.C0909e) r0)
                r11.writeNoException()
                return r1
            L_0x0112:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                int r0 = r10.readInt()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r2 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r2)
                r8.mo12058a((int) r0, (com.google.android.gms.drive.realtime.internal.C0934j) r2)
                r11.writeNoException()
                return r1
            L_0x012a:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.l r0 = com.google.android.gms.drive.realtime.internal.C0940l.C0941a.m1473ak(r0)
                r8.mo12090b((com.google.android.gms.drive.realtime.internal.C0940l) r0)
                r11.writeNoException()
                return r1
            L_0x013e:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r2 = r10.readInt()
                android.os.IBinder r3 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.o r3 = com.google.android.gms.drive.realtime.internal.C0949o.C0950a.m1565an(r3)
                r8.mo12075a((java.lang.String) r0, (int) r2, (com.google.android.gms.drive.realtime.internal.C0949o) r3)
                r11.writeNoException()
                return r1
            L_0x015a:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.k r2 = com.google.android.gms.drive.realtime.internal.C0937k.C0938a.m1468aj(r2)
                r8.mo12081a((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0937k) r2)
                r11.writeNoException()
                return r1
            L_0x0172:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r2)
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x0185
                android.os.Parcelable$Creator<com.google.android.gms.drive.realtime.internal.ParcelableIndexReference> r0 = com.google.android.gms.drive.realtime.internal.ParcelableIndexReference.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                com.google.android.gms.drive.realtime.internal.ParcelableIndexReference r0 = (com.google.android.gms.drive.realtime.internal.ParcelableIndexReference) r0
            L_0x0185:
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.n r2 = com.google.android.gms.drive.realtime.internal.C0946n.C0947a.m1561am(r2)
                r8.mo12062a((com.google.android.gms.drive.realtime.internal.ParcelableIndexReference) r0, (com.google.android.gms.drive.realtime.internal.C0946n) r2)
                r11.writeNoException()
                return r1
            L_0x0194:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.c r0 = com.google.android.gms.drive.realtime.internal.C0903c.C0904a.m1402ab(r0)
                r8.mo12098d(r0)
                r11.writeNoException()
                return r1
            L_0x01a8:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.c r0 = com.google.android.gms.drive.realtime.internal.C0903c.C0904a.m1402ab(r0)
                r8.mo12096c(r0)
                r11.writeNoException()
                return r1
            L_0x01bc:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r0 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r0)
                r8.mo12089b((com.google.android.gms.drive.realtime.internal.C0934j) r0)
                r11.writeNoException()
                return r1
            L_0x01d0:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r0 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r0)
                r8.mo12068a((com.google.android.gms.drive.realtime.internal.C0934j) r0)
                r11.writeNoException()
                return r1
            L_0x01e4:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r2 = r10.readString()
                android.os.IBinder r3 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.g r3 = com.google.android.gms.drive.realtime.internal.C0925g.C0926a.m1452af(r3)
                r8.mo12086a((java.lang.String) r0, (java.lang.String) r2, (com.google.android.gms.drive.realtime.internal.C0925g) r3)
                r11.writeNoException()
                return r1
            L_0x0200:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.f r2 = com.google.android.gms.drive.realtime.internal.C0922f.C0923a.m1447ae(r2)
                r8.mo12079a((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0922f) r2)
                r11.writeNoException()
                return r1
            L_0x0218:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r2)
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x022b
                android.os.Parcelable$Creator<com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest> r0 = com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest r0 = (com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest) r0
            L_0x022b:
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.o r2 = com.google.android.gms.drive.realtime.internal.C0949o.C0950a.m1565an(r2)
                r8.mo12061a((com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest) r0, (com.google.android.gms.drive.realtime.internal.C0949o) r2)
                r11.writeNoException()
                return r1
            L_0x023a:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r2)
                int r2 = r10.readInt()
                if (r2 == 0) goto L_0x024d
                android.os.Parcelable$Creator<com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest> r0 = com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r10)
                com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest r0 = (com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest) r0
            L_0x024d:
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.o r2 = com.google.android.gms.drive.realtime.internal.C0949o.C0950a.m1565an(r2)
                r8.mo12059a((com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest) r0, (com.google.android.gms.drive.realtime.internal.C0949o) r2)
                r11.writeNoException()
                return r1
            L_0x025c:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                android.os.IBinder r4 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.g r4 = com.google.android.gms.drive.realtime.internal.C0925g.C0926a.m1452af(r4)
                r8.mo12071a((java.lang.String) r0, (int) r2, (int) r3, (com.google.android.gms.drive.realtime.internal.C0925g) r4)
                r11.writeNoException()
                return r1
            L_0x027c:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r2)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x0295
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r10)
            L_0x0295:
                android.os.IBinder r4 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.g r4 = com.google.android.gms.drive.realtime.internal.C0925g.C0926a.m1452af(r4)
                r8.mo12073a((java.lang.String) r2, (int) r3, (com.google.android.gms.common.data.DataHolder) r0, (com.google.android.gms.drive.realtime.internal.C0925g) r4)
                r11.writeNoException()
                return r1
            L_0x02a4:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r2)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                if (r4 == 0) goto L_0x02bd
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r10)
            L_0x02bd:
                android.os.IBinder r4 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r4 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r4)
                r8.mo12074a((java.lang.String) r2, (int) r3, (com.google.android.gms.common.data.DataHolder) r0, (com.google.android.gms.drive.realtime.internal.C0934j) r4)
                r11.writeNoException()
                return r1
            L_0x02cc:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.l r2 = com.google.android.gms.drive.realtime.internal.C0940l.C0941a.m1473ak(r2)
                r8.mo12097c(r0, r2)
                r11.writeNoException()
                return r1
            L_0x02e4:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.f r2 = com.google.android.gms.drive.realtime.internal.C0922f.C0923a.m1447ae(r2)
                r8.mo12092b((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0922f) r2)
                r11.writeNoException()
                return r1
            L_0x02fc:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r2 = r10.readString()
                android.os.IBinder r3 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r3 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r3)
                r8.mo12087a((java.lang.String) r0, (java.lang.String) r2, (com.google.android.gms.drive.realtime.internal.C0934j) r3)
                r11.writeNoException()
                return r1
            L_0x0318:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r2 = r10.readInt()
                int r3 = r10.readInt()
                android.os.IBinder r4 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r4 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r4)
                r8.mo12072a((java.lang.String) r0, (int) r2, (int) r3, (com.google.android.gms.drive.realtime.internal.C0934j) r4)
                r11.writeNoException()
                return r1
            L_0x0338:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                int r2 = r10.readInt()
                java.lang.String r3 = r10.readString()
                android.os.IBinder r4 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r4 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r4)
                r8.mo12077a((java.lang.String) r0, (int) r2, (java.lang.String) r3, (com.google.android.gms.drive.realtime.internal.C0934j) r4)
                r11.writeNoException()
                return r1
            L_0x0358:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.n r2 = com.google.android.gms.drive.realtime.internal.C0946n.C0947a.m1561am(r2)
                r8.mo12094b((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0946n) r2)
                r11.writeNoException()
                return r1
            L_0x0370:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.l r2 = com.google.android.gms.drive.realtime.internal.C0940l.C0941a.m1473ak(r2)
                r8.mo12093b((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0940l) r2)
                r11.writeNoException()
                return r1
            L_0x0388:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r2 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r2)
                r8.mo12080a((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0934j) r2)
                r11.writeNoException()
                return r1
            L_0x03a0:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r2)
                java.lang.String r2 = r10.readString()
                int r3 = r10.readInt()
                if (r3 == 0) goto L_0x03b5
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r10)
            L_0x03b5:
                android.os.IBinder r3 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.j r3 = com.google.android.gms.drive.realtime.internal.C0934j.C0935a.m1463ai(r3)
                r8.mo12078a((java.lang.String) r2, (com.google.android.gms.common.data.DataHolder) r0, (com.google.android.gms.drive.realtime.internal.C0934j) r3)
                r11.writeNoException()
                return r1
            L_0x03c4:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.l r2 = com.google.android.gms.drive.realtime.internal.C0940l.C0941a.m1473ak(r2)
                r8.mo12082a((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0940l) r2)
                r11.writeNoException()
                return r1
            L_0x03dc:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                java.lang.String r2 = r10.readString()
                android.os.IBinder r3 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.f r3 = com.google.android.gms.drive.realtime.internal.C0922f.C0923a.m1447ae(r3)
                r8.mo12085a((java.lang.String) r0, (java.lang.String) r2, (com.google.android.gms.drive.realtime.internal.C0922f) r3)
                r11.writeNoException()
                return r1
            L_0x03f8:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.o r0 = com.google.android.gms.drive.realtime.internal.C0949o.C0950a.m1565an(r0)
                r8.mo12070a((com.google.android.gms.drive.realtime.internal.C0949o) r0)
                r11.writeNoException()
                return r1
            L_0x040c:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                android.os.IBinder r0 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.c r0 = com.google.android.gms.drive.realtime.internal.C0903c.C0904a.m1402ab(r0)
                r8.mo12063a((com.google.android.gms.drive.realtime.internal.C0903c) r0)
                r11.writeNoException()
                return r1
            L_0x0420:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r10.enforceInterface(r0)
                java.lang.String r0 = r10.readString()
                android.os.IBinder r2 = r10.readStrongBinder()
                com.google.android.gms.drive.realtime.internal.n r2 = com.google.android.gms.drive.realtime.internal.C0946n.C0947a.m1561am(r2)
                r8.mo12083a((java.lang.String) r0, (com.google.android.gms.drive.realtime.internal.C0946n) r2)
                r11.writeNoException()
                return r1
            L_0x0438:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IRealtimeService"
                r11.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.realtime.internal.C0943m.C0944a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo12058a(int i, C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12059a(BeginCompoundOperationRequest beginCompoundOperationRequest, C0949o oVar) throws RemoteException;

    /* renamed from: a */
    void mo12060a(EndCompoundOperationRequest endCompoundOperationRequest, C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12061a(EndCompoundOperationRequest endCompoundOperationRequest, C0949o oVar) throws RemoteException;

    /* renamed from: a */
    void mo12062a(ParcelableIndexReference parcelableIndexReference, C0946n nVar) throws RemoteException;

    /* renamed from: a */
    void mo12063a(C0903c cVar) throws RemoteException;

    /* renamed from: a */
    void mo12064a(C0906d dVar) throws RemoteException;

    /* renamed from: a */
    void mo12065a(C0909e eVar) throws RemoteException;

    /* renamed from: a */
    void mo12066a(C0928h hVar) throws RemoteException;

    /* renamed from: a */
    void mo12067a(C0931i iVar) throws RemoteException;

    /* renamed from: a */
    void mo12068a(C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12069a(C0940l lVar) throws RemoteException;

    /* renamed from: a */
    void mo12070a(C0949o oVar) throws RemoteException;

    /* renamed from: a */
    void mo12071a(String str, int i, int i2, C0925g gVar) throws RemoteException;

    /* renamed from: a */
    void mo12072a(String str, int i, int i2, C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12073a(String str, int i, DataHolder dataHolder, C0925g gVar) throws RemoteException;

    /* renamed from: a */
    void mo12074a(String str, int i, DataHolder dataHolder, C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12075a(String str, int i, C0949o oVar) throws RemoteException;

    /* renamed from: a */
    void mo12076a(String str, int i, String str2, int i2, C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12077a(String str, int i, String str2, C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12078a(String str, DataHolder dataHolder, C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12079a(String str, C0922f fVar) throws RemoteException;

    /* renamed from: a */
    void mo12080a(String str, C0934j jVar) throws RemoteException;

    /* renamed from: a */
    void mo12081a(String str, C0937k kVar) throws RemoteException;

    /* renamed from: a */
    void mo12082a(String str, C0940l lVar) throws RemoteException;

    /* renamed from: a */
    void mo12083a(String str, C0946n nVar) throws RemoteException;

    /* renamed from: a */
    void mo12084a(String str, C0949o oVar) throws RemoteException;

    /* renamed from: a */
    void mo12085a(String str, String str2, C0922f fVar) throws RemoteException;

    /* renamed from: a */
    void mo12086a(String str, String str2, C0925g gVar) throws RemoteException;

    /* renamed from: a */
    void mo12087a(String str, String str2, C0934j jVar) throws RemoteException;

    /* renamed from: b */
    void mo12088b(C0903c cVar) throws RemoteException;

    /* renamed from: b */
    void mo12089b(C0934j jVar) throws RemoteException;

    /* renamed from: b */
    void mo12090b(C0940l lVar) throws RemoteException;

    /* renamed from: b */
    void mo12091b(C0949o oVar) throws RemoteException;

    /* renamed from: b */
    void mo12092b(String str, C0922f fVar) throws RemoteException;

    /* renamed from: b */
    void mo12093b(String str, C0940l lVar) throws RemoteException;

    /* renamed from: b */
    void mo12094b(String str, C0946n nVar) throws RemoteException;

    /* renamed from: b */
    void mo12095b(String str, C0949o oVar) throws RemoteException;

    /* renamed from: c */
    void mo12096c(C0903c cVar) throws RemoteException;

    /* renamed from: c */
    void mo12097c(String str, C0940l lVar) throws RemoteException;

    /* renamed from: d */
    void mo12098d(C0903c cVar) throws RemoteException;
}
