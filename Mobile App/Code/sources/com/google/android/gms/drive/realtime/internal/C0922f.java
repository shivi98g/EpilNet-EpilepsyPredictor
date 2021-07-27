package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.drive.realtime.internal.f */
public interface C0922f extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.f$a */
    public static abstract class C0923a extends Binder implements C0922f {

        /* renamed from: com.google.android.gms.drive.realtime.internal.f$a$a */
        private static class C0924a implements C0922f {

            /* renamed from: le */
            private IBinder f1277le;

            C0924a(IBinder iBinder) {
                this.f1277le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1277le;
            }

            /* renamed from: b */
            public void mo12025b(DataHolder dataHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1277le.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public void mo12026n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1277le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ae */
        public static C0922f m1447ae(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0922f)) ? new C0924a(iBinder) : (C0922f) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.gms.common.data.DataHolder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.common.api.Status} */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v10 */
        /* JADX WARNING: type inference failed for: r0v11 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x003f
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
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IDataHolderCallback"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0020
                com.google.android.gms.common.api.StatusCreator r0 = com.google.android.gms.common.api.Status.CREATOR
                com.google.android.gms.common.api.Status r0 = r0.createFromParcel((android.os.Parcel) r5)
            L_0x0020:
                r3.mo12026n(r0)
                r6.writeNoException()
                return r1
            L_0x0027:
                java.lang.String r2 = "com.google.android.gms.drive.realtime.internal.IDataHolderCallback"
                r5.enforceInterface(r2)
                int r2 = r5.readInt()
                if (r2 == 0) goto L_0x0038
                com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.DataHolder.CREATOR
                com.google.android.gms.common.data.DataHolder r0 = r0.createFromParcel(r5)
            L_0x0038:
                r3.mo12025b(r0)
                r6.writeNoException()
                return r1
            L_0x003f:
                java.lang.String r0 = "com.google.android.gms.drive.realtime.internal.IDataHolderCallback"
                r6.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.realtime.internal.C0922f.C0923a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: b */
    void mo12025b(DataHolder dataHolder) throws RemoteException;

    /* renamed from: n */
    void mo12026n(Status status) throws RemoteException;
}
