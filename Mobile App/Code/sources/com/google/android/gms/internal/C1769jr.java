package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.jr */
public interface C1769jr extends IInterface {

    /* renamed from: com.google.android.gms.internal.jr$a */
    public static abstract class C1770a extends Binder implements C1769jr {

        /* renamed from: com.google.android.gms.internal.jr$a$a */
        private static class C1771a implements C1769jr {

            /* renamed from: le */
            private IBinder f3942le;

            C1771a(IBinder iBinder) {
                this.f3942le = iBinder;
            }

            public IBinder asBinder() {
                return this.f3942le;
            }

            public void cancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
                    this.f3942le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: O */
        public static C1769jr m5254O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1769jr)) ? new C1771a(iBinder) : (C1769jr) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.common.internal.ICancelToken");
                cancel();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.common.internal.ICancelToken");
                return true;
            }
        }
    }

    void cancel() throws RemoteException;
}
