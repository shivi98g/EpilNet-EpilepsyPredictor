package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

/* renamed from: com.google.android.gms.drive.realtime.internal.g */
public interface C0925g extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.g$a */
    public static abstract class C0926a extends Binder implements C0925g {

        /* renamed from: com.google.android.gms.drive.realtime.internal.g$a$a */
        private static class C0927a implements C0925g {

            /* renamed from: le */
            private IBinder f1278le;

            C0927a(IBinder iBinder) {
                this.f1278le = iBinder;
            }

            /* renamed from: a */
            public void mo12030a(DataHolder dataHolder, ParcelableEventList parcelableEventList) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelableEventList != null) {
                        obtain.writeInt(1);
                        parcelableEventList.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1278le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1278le;
            }

            /* renamed from: n */
            public void mo12031n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1278le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: af */
        public static C0925g m1452af(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0925g)) ? new C0927a(iBinder) : (C0925g) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.drive.realtime.internal.event.ParcelableEventList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.common.api.Status} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v11 */
        /* JADX WARNING: type inference failed for: r0v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r5 == r0) goto L_0x004f
                r0 = 0
                switch(r5) {
                    case 1: goto L_0x0027;
                    case 2: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r5, r6, r7, r8)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0020
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel((android.os.Parcel) r6)
            L_0x0020:
                r4.mo12031n(r0)
                r7.writeNoException()
                return r1
            L_0x0027:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0039
                com.google.android.gms.common.data.f r2 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r2 = r2.createFromParcel(r6)
                goto L_0x003a
            L_0x0039:
                r2 = r0
            L_0x003a:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0048
                android.os.Parcelable$Creator<com.google.android.gms.drive.realtime.internal.event.ParcelableEventList> r0 = com.google.android.gms.drive.realtime.internal.event.ParcelableEventList.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                com.google.android.gms.drive.realtime.internal.event.ParcelableEventList r0 = (com.google.android.gms.drive.realtime.internal.event.ParcelableEventList) r0
            L_0x0048:
                r4.mo12030a(r2, r0)
                r7.writeNoException()
                return r1
            L_0x004f:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback"
                r7.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.realtime.internal.C0925g.C0926a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo12030a(DataHolder dataHolder, ParcelableEventList parcelableEventList) throws RemoteException;

    /* renamed from: n */
    void mo12031n(Status status) throws RemoteException;
}
