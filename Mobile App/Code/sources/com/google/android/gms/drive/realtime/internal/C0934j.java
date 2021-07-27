package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

/* renamed from: com.google.android.gms.drive.realtime.internal.j */
public interface C0934j extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.j$a */
    public static abstract class C0935a extends Binder implements C0934j {

        /* renamed from: com.google.android.gms.drive.realtime.internal.j$a$a */
        private static class C0936a implements C0934j {

            /* renamed from: le */
            private IBinder f1281le;

            C0936a(IBinder iBinder) {
                this.f1281le = iBinder;
            }

            /* renamed from: a */
            public void mo12043a(ParcelableEventList parcelableEventList) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (parcelableEventList != null) {
                        obtain.writeInt(1);
                        parcelableEventList.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1281le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1281le;
            }

            /* renamed from: n */
            public void mo12044n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1281le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ai */
        public static C0934j m1463ai(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0934j)) ? new C0936a(iBinder) : (C0934j) queryLocalInterface;
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
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x0041
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x0027;
                    case 2: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r0 = super.onTransact(r4, r5, r6, r7)
                return r0
            L_0x000f:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IEventCallback"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0020
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel((android.os.Parcel) r5)
            L_0x0020:
                r3.mo12044n(r0)
                r6.writeNoException()
                return r1
            L_0x0027:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IEventCallback"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x003a
                android.os.Parcelable$Creator<com.google.android.gms.drive.realtime.internal.event.ParcelableEventList> r0 = com.google.android.gms.drive.realtime.internal.event.ParcelableEventList.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r5)
                com.google.android.gms.drive.realtime.internal.event.ParcelableEventList r0 = (com.google.android.gms.drive.realtime.internal.event.ParcelableEventList) r0
            L_0x003a:
                r3.mo12043a(r0)
                r6.writeNoException()
                return r1
            L_0x0041:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IEventCallback"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.realtime.internal.C0934j.C0935a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo12043a(ParcelableEventList parcelableEventList) throws RemoteException;

    /* renamed from: n */
    void mo12044n(Status status) throws RemoteException;
}
