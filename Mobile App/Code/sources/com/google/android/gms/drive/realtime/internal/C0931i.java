package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.drive.realtime.internal.i */
public interface C0931i extends IInterface {

    /* renamed from: com.google.android.gms.drive.realtime.internal.i$a */
    public static abstract class C0932a extends Binder implements C0931i {

        /* renamed from: com.google.android.gms.drive.realtime.internal.i$a$a */
        private static class C0933a implements C0931i {

            /* renamed from: le */
            private IBinder f1280le;

            C0933a(IBinder iBinder) {
                this.f1280le = iBinder;
            }

            public IBinder asBinder() {
                return this.f1280le;
            }

            /* renamed from: n */
            public void mo12039n(Status status) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1280le.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ah */
        public static C0931i m1459ah(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IErrorCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0931i)) ? new C0933a(iBinder) : (C0931i) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                mo12039n(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                return true;
            }
        }
    }

    /* renamed from: n */
    void mo12039n(Status status) throws RemoteException;
}
